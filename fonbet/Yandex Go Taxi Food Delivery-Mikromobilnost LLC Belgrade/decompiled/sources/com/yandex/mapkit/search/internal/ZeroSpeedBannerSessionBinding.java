package com.yandex.mapkit.search.internal;

import com.yandex.mapkit.search.ZeroSpeedBannerSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class ZeroSpeedBannerSessionBinding implements ZeroSpeedBannerSession {
    private final NativeObject nativeObject;

    public ZeroSpeedBannerSessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.search.ZeroSpeedBannerSession
    public native void cancel();
}
