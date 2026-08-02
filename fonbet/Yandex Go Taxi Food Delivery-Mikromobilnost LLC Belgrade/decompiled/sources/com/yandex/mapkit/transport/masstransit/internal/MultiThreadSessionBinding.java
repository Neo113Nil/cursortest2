package com.yandex.mapkit.transport.masstransit.internal;

import com.yandex.mapkit.transport.masstransit.MultiThreadSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class MultiThreadSessionBinding implements MultiThreadSession {
    private final NativeObject nativeObject;

    public MultiThreadSessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.transport.masstransit.MultiThreadSession
    public native void cancel();

    @Override // com.yandex.mapkit.transport.masstransit.MultiThreadSession
    public native void retry(MultiThreadSession.MultiThreadListener multiThreadListener);
}
