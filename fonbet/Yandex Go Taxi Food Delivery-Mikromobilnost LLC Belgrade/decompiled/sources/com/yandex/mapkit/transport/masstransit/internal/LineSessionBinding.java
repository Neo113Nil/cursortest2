package com.yandex.mapkit.transport.masstransit.internal;

import com.yandex.mapkit.transport.masstransit.LineSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class LineSessionBinding implements LineSession {
    private final NativeObject nativeObject;

    public LineSessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.transport.masstransit.LineSession
    public native void cancel();

    @Override // com.yandex.mapkit.transport.masstransit.LineSession
    public native void retry(LineSession.LineListener lineListener);
}
