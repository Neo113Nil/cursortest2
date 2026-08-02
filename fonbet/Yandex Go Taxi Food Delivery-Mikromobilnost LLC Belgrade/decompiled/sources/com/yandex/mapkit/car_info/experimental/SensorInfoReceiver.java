package com.yandex.mapkit.car_info.experimental;

/* loaded from: classes15.dex */
public interface SensorInfoReceiver {
    boolean isValid();

    void send(SensorEventPacket sensorEventPacket);
}
