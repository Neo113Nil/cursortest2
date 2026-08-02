package com.yandex.mapkit.transport.masstransit.internal;

import com.yandex.mapkit.transport.masstransit.Line;
import com.yandex.mapkit.transport.masstransit.VehicleData;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class VehicleDataBinding implements VehicleData {
    private final NativeObject nativeObject;

    public VehicleDataBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.transport.masstransit.VehicleData
    public native float getCurrentAzimuth();

    @Override // com.yandex.mapkit.transport.masstransit.VehicleData
    public native String getId();

    @Override // com.yandex.mapkit.transport.masstransit.VehicleData
    public native Line getLine();

    @Override // com.yandex.mapkit.transport.masstransit.VehicleData
    public native String getThreadId();

    @Override // com.yandex.mapkit.transport.masstransit.VehicleData
    public native boolean isValid();
}
