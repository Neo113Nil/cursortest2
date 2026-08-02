package com.yandex.mapkit.search.internal;

import com.yandex.mapkit.search.BitmapSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class BitmapSessionBinding implements BitmapSession {
    private final NativeObject nativeObject;

    public BitmapSessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.search.BitmapSession
    public native void cancel();

    @Override // com.yandex.mapkit.search.BitmapSession
    public native void retry(BitmapSession.BitmapListener bitmapListener);
}
