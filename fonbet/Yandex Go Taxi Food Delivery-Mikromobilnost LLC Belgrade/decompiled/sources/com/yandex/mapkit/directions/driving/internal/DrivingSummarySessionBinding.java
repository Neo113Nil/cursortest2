package com.yandex.mapkit.directions.driving.internal;

import com.yandex.mapkit.directions.driving.DrivingSummarySession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class DrivingSummarySessionBinding implements DrivingSummarySession {
    private final NativeObject nativeObject;

    public DrivingSummarySessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.directions.driving.DrivingSummarySession
    public native void cancel();

    @Override // com.yandex.mapkit.directions.driving.DrivingSummarySession
    public native void retry(DrivingSummarySession.DrivingSummaryListener drivingSummaryListener);
}
