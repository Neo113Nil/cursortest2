package com.yandex.mapkit.transport.masstransit.internal;

import com.yandex.mapkit.transport.masstransit.VehicleSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class VehicleSessionBinding implements VehicleSession {
    private final NativeObject nativeObject;

    public VehicleSessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.transport.masstransit.VehicleSession
    public native void cancel();

    @Override // com.yandex.mapkit.transport.masstransit.VehicleSession
    public native void retry(VehicleSession.VehicleListener vehicleListener);
}
