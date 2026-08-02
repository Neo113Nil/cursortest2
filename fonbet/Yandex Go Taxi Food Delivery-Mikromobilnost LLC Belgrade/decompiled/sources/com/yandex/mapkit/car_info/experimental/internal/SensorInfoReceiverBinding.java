package com.yandex.mapkit.car_info.experimental.internal;

import com.yandex.mapkit.car_info.experimental.SensorEventPacket;
import com.yandex.mapkit.car_info.experimental.SensorInfoReceiver;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class SensorInfoReceiverBinding implements SensorInfoReceiver {
    private final NativeObject nativeObject;

    public SensorInfoReceiverBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.car_info.experimental.SensorInfoReceiver
    public native boolean isValid();

    @Override // com.yandex.mapkit.car_info.experimental.SensorInfoReceiver
    public native void send(SensorEventPacket sensorEventPacket);
}
