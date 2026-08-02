package com.yandex.mapkit.places.toponym_photo.internal;

import com.yandex.mapkit.places.toponym_photo.PhotoSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class PhotoSessionBinding implements PhotoSession {
    private final NativeObject nativeObject;

    public PhotoSessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.places.toponym_photo.PhotoSession
    public native void cancel();

    @Override // com.yandex.mapkit.places.toponym_photo.PhotoSession
    public native void retry(PhotoSession.PhotoListener photoListener);
}
