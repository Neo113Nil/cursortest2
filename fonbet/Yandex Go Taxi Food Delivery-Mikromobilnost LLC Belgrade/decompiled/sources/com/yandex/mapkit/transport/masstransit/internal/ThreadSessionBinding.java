package com.yandex.mapkit.transport.masstransit.internal;

import com.yandex.mapkit.transport.masstransit.ThreadSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class ThreadSessionBinding implements ThreadSession {
    private final NativeObject nativeObject;

    public ThreadSessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.transport.masstransit.ThreadSession
    public native void cancel();

    @Override // com.yandex.mapkit.transport.masstransit.ThreadSession
    public native void retry(ThreadSession.ThreadListener threadListener);
}
