package com.yandex.mapkit.places.toponym_photo.internal;

import com.yandex.mapkit.places.toponym_photo.ToponymPhotoLayer;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class ToponymPhotoLayerBinding implements ToponymPhotoLayer {
    private final NativeObject nativeObject;

    public ToponymPhotoLayerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.places.toponym_photo.ToponymPhotoLayer
    public native boolean isValid();

    @Override // com.yandex.mapkit.places.toponym_photo.ToponymPhotoLayer
    public native void setVisible(boolean z);
}
