package com.yandex.mapkit.car_info.experimental;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class SpeedEvent implements Serializable {
    private long receiverTimestampMicroseconds;
    private long sensorTimestampMicroseconds;
    private double speed;

    public SpeedEvent(long j, long j2, double d) {
        this.sensorTimestampMicroseconds = j;
        this.receiverTimestampMicroseconds = j2;
        this.speed = d;
    }

    public long getReceiverTimestampMicroseconds() {
        return this.receiverTimestampMicroseconds;
    }

    public long getSensorTimestampMicroseconds() {
        return this.sensorTimestampMicroseconds;
    }

    public double getSpeed() {
        return this.speed;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.sensorTimestampMicroseconds = archive.add(this.sensorTimestampMicroseconds);
        this.receiverTimestampMicroseconds = archive.add(this.receiverTimestampMicroseconds);
        this.speed = archive.add(this.speed);
    }

    public SpeedEvent() {
    }
}
