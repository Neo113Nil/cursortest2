package com.yandex.mapkit.places.toponym_photo.internal;

import com.yandex.mapkit.places.toponym_photo.UploadSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class UploadSessionBinding implements UploadSession {
    private final NativeObject nativeObject;

    public UploadSessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.places.toponym_photo.UploadSession
    public native void cancel();

    @Override // com.yandex.mapkit.places.toponym_photo.UploadSession
    public native void retry(UploadSession.UploadListener uploadListener);
}
