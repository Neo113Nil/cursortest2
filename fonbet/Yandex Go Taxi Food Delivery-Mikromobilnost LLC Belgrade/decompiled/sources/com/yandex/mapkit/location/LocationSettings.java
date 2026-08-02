package com.yandex.mapkit.location;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public final class LocationSettings implements Serializable {
    private Range accuracy;
    private Range headingError;
    private LocationError locationError;
    private TimeInterval locationTimeInterval;
    private boolean provideAccuracy;
    private boolean provideHeading;
    private boolean provideSpeed;
    private boolean provideWheelSpeed;
    private double speed;
    private TimeInterval wheelSpeedTimeInterval;

    public LocationSettings() {
        this.provideAccuracy = false;
        this.accuracy = null;
        this.locationTimeInterval = null;
        this.provideSpeed = false;
        this.speed = 0.0d;
        this.provideHeading = false;
        this.headingError = null;
        this.locationError = null;
        this.provideWheelSpeed = false;
        this.wheelSpeedTimeInterval = null;
    }

    public Range getAccuracy() {
        return this.accuracy;
    }

    public Range getHeadingError() {
        return this.headingError;
    }

    public LocationError getLocationError() {
        return this.locationError;
    }

    public TimeInterval getLocationTimeInterval() {
        return this.locationTimeInterval;
    }

    public boolean getProvideAccuracy() {
        return this.provideAccuracy;
    }

    public boolean getProvideHeading() {
        return this.provideHeading;
    }

    public boolean getProvideSpeed() {
        return this.provideSpeed;
    }

    public boolean getProvideWheelSpeed() {
        return this.provideWheelSpeed;
    }

    public double getSpeed() {
        return this.speed;
    }

    public TimeInterval getWheelSpeedTimeInterval() {
        return this.wheelSpeedTimeInterval;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.provideAccuracy = archive.add(this.provideAccuracy);
        this.accuracy = (Range) archive.add((Archive) this.accuracy, true, (Class<Archive>) Range.class);
        this.locationTimeInterval = (TimeInterval) archive.add((Archive) this.locationTimeInterval, true, (Class<Archive>) TimeInterval.class);
        this.provideSpeed = archive.add(this.provideSpeed);
        this.speed = archive.add(this.speed);
        this.provideHeading = archive.add(this.provideHeading);
        this.headingError = (Range) archive.add((Archive) this.headingError, true, (Class<Archive>) Range.class);
        this.locationError = (LocationError) archive.add((Archive) this.locationError, true, (Class<Archive>) LocationError.class);
        this.provideWheelSpeed = archive.add(this.provideWheelSpeed);
        this.wheelSpeedTimeInterval = (TimeInterval) archive.add((Archive) this.wheelSpeedTimeInterval, true, (Class<Archive>) TimeInterval.class);
    }

    public LocationSettings setAccuracy(Range range) {
        this.accuracy = range;
        return this;
    }

    public LocationSettings setHeadingError(Range range) {
        this.headingError = range;
        return this;
    }

    public LocationSettings setLocationError(LocationError locationError) {
        this.locationError = locationError;
        return this;
    }

    public LocationSettings setLocationTimeInterval(TimeInterval timeInterval) {
        this.locationTimeInterval = timeInterval;
        return this;
    }

    public LocationSettings setProvideAccuracy(boolean z) {
        this.provideAccuracy = z;
        return this;
    }

    public LocationSettings setProvideHeading(boolean z) {
        this.provideHeading = z;
        return this;
    }

    public LocationSettings setProvideSpeed(boolean z) {
        this.provideSpeed = z;
        return this;
    }

    public LocationSettings setProvideWheelSpeed(boolean z) {
        this.provideWheelSpeed = z;
        return this;
    }

    public LocationSettings setSpeed(double d) {
        this.speed = d;
        return this;
    }

    public LocationSettings setWheelSpeedTimeInterval(TimeInterval timeInterval) {
        this.wheelSpeedTimeInterval = timeInterval;
        return this;
    }

    public LocationSettings(boolean z, Range range, TimeInterval timeInterval, boolean z2, double d, boolean z3, Range range2, LocationError locationError, boolean z4, TimeInterval timeInterval2) {
        this.provideAccuracy = z;
        this.accuracy = range;
        this.locationTimeInterval = timeInterval;
        this.provideSpeed = z2;
        this.speed = d;
        this.provideHeading = z3;
        this.headingError = range2;
        this.locationError = locationError;
        this.provideWheelSpeed = z4;
        this.wheelSpeedTimeInterval = timeInterval2;
    }
}
