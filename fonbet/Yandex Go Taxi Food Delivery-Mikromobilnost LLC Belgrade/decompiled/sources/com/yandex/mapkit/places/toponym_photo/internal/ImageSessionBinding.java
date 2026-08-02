package com.yandex.mapkit.places.toponym_photo.internal;

import com.yandex.mapkit.places.toponym_photo.ImageSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class ImageSessionBinding implements ImageSession {
    private final NativeObject nativeObject;

    public ImageSessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.places.toponym_photo.ImageSession
    public native void cancel();

    @Override // com.yandex.mapkit.places.toponym_photo.ImageSession
    public native void retry(ImageSession.ImageListener imageListener);
}
