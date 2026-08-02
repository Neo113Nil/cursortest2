package com.yandex.mapkit.location;

import com.yandex.mapkit.GraphLevel;
import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes7.dex */
public class Location implements Serializable {
    private long absoluteTimestamp;
    private Double accuracy;
    private Double altitude;
    private Double altitudeAccuracy;
    private Double confidence;
    private GraphLevel graphLevel;
    private Double heading;
    private String indoorLevelId;
    private Point position;
    private long relativeTimestamp;
    private Double speed;

    public Location(Point point, Double d, Double d2, Double d3, Double d4, Double d5, String str, GraphLevel graphLevel, long j, long j2, Double d6) {
        if (point == null) {
            ny61.g("Required field \"position\" cannot be null");
            throw null;
        }
        this.position = point;
        this.accuracy = d;
        this.altitude = d2;
        this.altitudeAccuracy = d3;
        this.heading = d4;
        this.speed = d5;
        this.indoorLevelId = str;
        this.graphLevel = graphLevel;
        this.absoluteTimestamp = j;
        this.relativeTimestamp = j2;
        this.confidence = d6;
    }

    public long getAbsoluteTimestamp() {
        return this.absoluteTimestamp;
    }

    public Double getAccuracy() {
        return this.accuracy;
    }

    public Double getAltitude() {
        return this.altitude;
    }

    public Double getAltitudeAccuracy() {
        return this.altitudeAccuracy;
    }

    public Double getConfidence() {
        return this.confidence;
    }

    public GraphLevel getGraphLevel() {
        return this.graphLevel;
    }

    public Double getHeading() {
        return this.heading;
    }

    public String getIndoorLevelId() {
        return this.indoorLevelId;
    }

    public Point getPosition() {
        return this.position;
    }

    public long getRelativeTimestamp() {
        return this.relativeTimestamp;
    }

    public Double getSpeed() {
        return this.speed;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.position = (Point) archive.add((Archive) this.position, false, (Class<Archive>) Point.class);
        this.accuracy = archive.add(this.accuracy, true);
        this.altitude = archive.add(this.altitude, true);
        this.altitudeAccuracy = archive.add(this.altitudeAccuracy, true);
        this.heading = archive.add(this.heading, true);
        this.speed = archive.add(this.speed, true);
        this.indoorLevelId = archive.add(this.indoorLevelId, true);
        this.graphLevel = (GraphLevel) archive.add((Archive) this.graphLevel, true, (Class<Archive>) GraphLevel.class);
        this.absoluteTimestamp = archive.add(this.absoluteTimestamp);
        this.relativeTimestamp = archive.add(this.relativeTimestamp);
        this.confidence = archive.add(this.confidence, true);
    }

    public Location() {
    }

    public Location(Point point, Double d, Double d2, Double d3, Double d4, Double d5, String str, long j, long j2) {
        if (point != null) {
            this.position = point;
            this.accuracy = d;
            this.altitude = d2;
            this.altitudeAccuracy = d3;
            this.heading = d4;
            this.speed = d5;
            this.indoorLevelId = str;
            this.absoluteTimestamp = j;
            this.relativeTimestamp = j2;
            return;
        }
        ny61.g("Required field \"position\" cannot be null");
        throw null;
    }
}
