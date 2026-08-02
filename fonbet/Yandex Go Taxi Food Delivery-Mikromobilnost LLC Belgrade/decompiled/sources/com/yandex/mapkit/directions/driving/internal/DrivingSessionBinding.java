package com.yandex.mapkit.directions.driving.internal;

import com.yandex.mapkit.directions.driving.DrivingSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class DrivingSessionBinding implements DrivingSession {
    private final NativeObject nativeObject;

    public DrivingSessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.directions.driving.DrivingSession
    public native void cancel();

    @Override // com.yandex.mapkit.directions.driving.DrivingSession
    public native void retry(DrivingSession.DrivingRouteListener drivingRouteListener);
}
