package com.onlinestayrental.staybooking.model;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.GeoPointField;
import org.springframework.data.elasticsearch.core.geo.GeoPoint;

import java.io.Serializable;

@Document(indexName = "loc")
public class Location implements Serializable {
    @Field(type = FieldType.Long)
    private Long id;

    @GeoPointField
    private GeoPoint geoPoint;

    public Location(Long id, GeoPoint geoPoint) {
        this.id = id;
        this.geoPoint = geoPoint;
    }

    public Long getId() {
        return id;
    }

    public GeoPoint getGeoPoint() {
        return geoPoint;
    }
}
