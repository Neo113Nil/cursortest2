package com.yandex.mapkit.search.internal;

import com.yandex.mapkit.search.ViaBannerSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class ViaBannerSessionBinding implements ViaBannerSession {
    private final NativeObject nativeObject;

    public ViaBannerSessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.search.ViaBannerSession
    public native void cancel();
}
