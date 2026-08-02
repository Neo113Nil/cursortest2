package com.yandex.mapkit.transport.taxi.internal;

import com.yandex.mapkit.transport.taxi.RideInfoSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class RideInfoSessionBinding implements RideInfoSession {
    private final NativeObject nativeObject;

    public RideInfoSessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.transport.taxi.RideInfoSession
    public native void cancel();

    @Override // com.yandex.mapkit.transport.taxi.RideInfoSession
    public native void retry(RideInfoSession.RideInfoListener rideInfoListener);
}
