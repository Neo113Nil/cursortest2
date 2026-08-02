package com.yandex.mapkit.car_info.experimental;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class ImuEvent implements Serializable {
    private double ax;
    private double ay;
    private double az;
    private double gx;
    private double gy;
    private double gz;
    private long receiverTimestampMicroseconds;
    private long sensorTimestampMicroseconds;
    private double temp;

    public ImuEvent(long j, long j2, double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.sensorTimestampMicroseconds = j;
        this.receiverTimestampMicroseconds = j2;
        this.ax = d;
        this.ay = d2;
        this.az = d3;
        this.gx = d4;
        this.gy = d5;
        this.gz = d6;
        this.temp = d7;
    }

    public double getAx() {
        return this.ax;
    }

    public double getAy() {
        return this.ay;
    }

    public double getAz() {
        return this.az;
    }

    public double getGx() {
        return this.gx;
    }

    public double getGy() {
        return this.gy;
    }

    public double getGz() {
        return this.gz;
    }

    public long getReceiverTimestampMicroseconds() {
        return this.receiverTimestampMicroseconds;
    }

    public long getSensorTimestampMicroseconds() {
        return this.sensorTimestampMicroseconds;
    }

    public double getTemp() {
        return this.temp;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.sensorTimestampMicroseconds = archive.add(this.sensorTimestampMicroseconds);
        this.receiverTimestampMicroseconds = archive.add(this.receiverTimestampMicroseconds);
        this.ax = archive.add(this.ax);
        this.ay = archive.add(this.ay);
        this.az = archive.add(this.az);
        this.gx = archive.add(this.gx);
        this.gy = archive.add(this.gy);
        this.gz = archive.add(this.gz);
        this.temp = archive.add(this.temp);
    }

    public ImuEvent() {
    }
}
