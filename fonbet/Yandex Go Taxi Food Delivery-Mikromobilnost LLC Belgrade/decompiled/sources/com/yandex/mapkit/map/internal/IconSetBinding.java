package com.yandex.mapkit.map.internal;

import com.yandex.mapkit.map.IconSet;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.image.AnimatedImageProvider;
import com.yandex.runtime.image.ImageProvider;

/* loaded from: classes15.dex */
public class IconSetBinding implements IconSet {
    private final NativeObject nativeObject;

    public IconSetBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.map.IconSet
    public native void add(AnimatedImageProvider animatedImageProvider);

    @Override // com.yandex.mapkit.map.IconSet
    public native void add(ImageProvider imageProvider);

    @Override // com.yandex.mapkit.map.IconSet
    public native void add(String str, AnimatedImageProvider animatedImageProvider);

    @Override // com.yandex.mapkit.map.IconSet
    public native void add(String str, ImageProvider imageProvider);

    @Override // com.yandex.mapkit.map.IconSet
    public native boolean isValid();
}
