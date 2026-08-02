package com.yandex.mapkit.car_info.experimental;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class SensorEvent implements Serializable {
    private ImuEvent imuEvent;
    private SpeedEvent speedEvent;

    public static SensorEvent fromImuEvent(ImuEvent imuEvent) {
        if (imuEvent == null) {
            ny61.g("Variant value \"imuEvent\" cannot be null");
            return null;
        }
        SensorEvent sensorEvent = new SensorEvent();
        sensorEvent.imuEvent = imuEvent;
        return sensorEvent;
    }

    public static SensorEvent fromSpeedEvent(SpeedEvent speedEvent) {
        if (speedEvent == null) {
            ny61.g("Variant value \"speedEvent\" cannot be null");
            return null;
        }
        SensorEvent sensorEvent = new SensorEvent();
        sensorEvent.speedEvent = speedEvent;
        return sensorEvent;
    }

    public ImuEvent getImuEvent() {
        return this.imuEvent;
    }

    public SpeedEvent getSpeedEvent() {
        return this.speedEvent;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.imuEvent = (ImuEvent) archive.add((Archive) this.imuEvent, true, (Class<Archive>) ImuEvent.class);
        this.speedEvent = (SpeedEvent) archive.add((Archive) this.speedEvent, true, (Class<Archive>) SpeedEvent.class);
    }
}
