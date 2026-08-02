package com.yandex.mapkit.navigation.transport.layer.internal;

import com.yandex.mapkit.navigation.transport.layer.AccuracyCircleStyle;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class AccuracyCircleStyleBinding implements AccuracyCircleStyle {
    private final NativeObject nativeObject;

    public AccuracyCircleStyleBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.AccuracyCircleStyle
    public native boolean isValid();

    @Override // com.yandex.mapkit.navigation.transport.layer.AccuracyCircleStyle
    public native void setFillColor(int i);

    @Override // com.yandex.mapkit.navigation.transport.layer.AccuracyCircleStyle
    public native void setStrokeColor(int i);

    @Override // com.yandex.mapkit.navigation.transport.layer.AccuracyCircleStyle
    public native void setStrokeWidth(float f);
}
