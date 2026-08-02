package com.yandex.mapkit.places.mrc.internal;

import com.yandex.mapkit.places.mrc.MrcPhotoLayer;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class MrcPhotoLayerBinding implements MrcPhotoLayer {
    private final NativeObject nativeObject;

    public MrcPhotoLayerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoLayer
    public native void disable();

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoLayer
    public native void enable(MrcPhotoLayer.VisibleLayer visibleLayer);

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoLayer
    public native MrcPhotoLayer.VisibleLayer getVisibleLayer();

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoLayer
    public native boolean isValid();
}
