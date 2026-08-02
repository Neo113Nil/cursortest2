package com.yandex.mapkit.car_info.internal;

import com.yandex.mapkit.car_info.CarInfoReceiver;
import com.yandex.mapkit.car_info.SpeedEvent;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class CarInfoReceiverBinding implements CarInfoReceiver {
    private final NativeObject nativeObject;

    public CarInfoReceiverBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.car_info.CarInfoReceiver
    public native boolean isValid();

    @Override // com.yandex.mapkit.car_info.CarInfoReceiver
    public native void onSpeedEvent(SpeedEvent speedEvent);
}
