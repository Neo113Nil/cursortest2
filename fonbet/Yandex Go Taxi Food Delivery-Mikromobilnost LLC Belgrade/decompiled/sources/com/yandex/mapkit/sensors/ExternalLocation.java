package com.yandex.mapkit.sensors;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class ExternalLocation implements Serializable {
    private Double accuracy;
    private long age;
    private Double altitude;
    private Double altitudeAccuracy;
    private Double heading;
    private double latitude;
    private double longitude;
    private Double speed;

    public ExternalLocation(double d, double d2, Double d3, Double d4, Double d5, Double d6, Double d7, long j) {
        this.latitude = d;
        this.longitude = d2;
        this.accuracy = d3;
        this.altitude = d4;
        this.altitudeAccuracy = d5;
        this.heading = d6;
        this.speed = d7;
        this.age = j;
    }

    public Double getAccuracy() {
        return this.accuracy;
    }

    public long getAge() {
        return this.age;
    }

    public Double getAltitude() {
        return this.altitude;
    }

    public Double getAltitudeAccuracy() {
        return this.altitudeAccuracy;
    }

    public Double getHeading() {
        return this.heading;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public Double getSpeed() {
        return this.speed;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.latitude = archive.add(this.latitude);
        this.longitude = archive.add(this.longitude);
        this.accuracy = archive.add(this.accuracy, true);
        this.altitude = archive.add(this.altitude, true);
        this.altitudeAccuracy = archive.add(this.altitudeAccuracy, true);
        this.heading = archive.add(this.heading, true);
        this.speed = archive.add(this.speed, true);
        this.age = archive.add(this.age);
    }

    public ExternalLocation() {
    }
}
