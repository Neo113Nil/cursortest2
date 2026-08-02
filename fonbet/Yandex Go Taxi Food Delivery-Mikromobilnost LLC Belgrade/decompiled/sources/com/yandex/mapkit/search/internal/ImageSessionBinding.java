package com.yandex.mapkit.search.internal;

import com.yandex.mapkit.search.ImageListener;
import com.yandex.mapkit.search.ImageSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class ImageSessionBinding implements ImageSession {
    private final NativeObject nativeObject;

    public ImageSessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.search.ImageSession
    public native void cancel();

    @Override // com.yandex.mapkit.search.ImageSession
    public native void retry(ImageListener imageListener);
}
