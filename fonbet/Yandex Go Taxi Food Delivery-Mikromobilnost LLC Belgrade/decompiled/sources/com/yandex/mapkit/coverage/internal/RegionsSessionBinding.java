package com.yandex.mapkit.coverage.internal;

import com.yandex.mapkit.coverage.RegionsSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class RegionsSessionBinding implements RegionsSession {
    private final NativeObject nativeObject;

    public RegionsSessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.coverage.RegionsSession
    public native void cancel();

    @Override // com.yandex.mapkit.coverage.RegionsSession
    public native void retry(RegionsSession.RegionsListener regionsListener);
}
