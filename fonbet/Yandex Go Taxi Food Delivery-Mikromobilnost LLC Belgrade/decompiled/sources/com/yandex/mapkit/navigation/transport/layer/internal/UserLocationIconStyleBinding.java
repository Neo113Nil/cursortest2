package com.yandex.mapkit.navigation.transport.layer.internal;

import com.yandex.mapkit.navigation.transport.layer.UserLocationIconStyle;
import com.yandex.mapkit.styling.PlacemarkStyle;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class UserLocationIconStyleBinding implements UserLocationIconStyle {
    private final NativeObject nativeObject;

    public UserLocationIconStyleBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.UserLocationIconStyle
    public native PlacemarkStyle arrowStyle();

    @Override // com.yandex.mapkit.navigation.transport.layer.UserLocationIconStyle
    public native boolean isValid();

    @Override // com.yandex.mapkit.navigation.transport.layer.UserLocationIconStyle
    public native PlacemarkStyle pinStyle();

    @Override // com.yandex.mapkit.navigation.transport.layer.UserLocationIconStyle
    public native void setMinimalSpeedForArrowIcon(float f);
}
