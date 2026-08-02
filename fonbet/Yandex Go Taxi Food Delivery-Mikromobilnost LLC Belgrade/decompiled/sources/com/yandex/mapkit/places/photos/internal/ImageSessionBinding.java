package com.yandex.mapkit.places.photos.internal;

import com.yandex.mapkit.places.photos.ImageSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class ImageSessionBinding implements ImageSession {
    private final NativeObject nativeObject;

    public ImageSessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.places.photos.ImageSession
    public native void cancel();

    @Override // com.yandex.mapkit.places.photos.ImageSession
    public native void retry(ImageSession.ImageListener imageListener);
}
