package com.yandex.mapkit.navigation.transport.layer.internal;

import com.yandex.mapkit.navigation.transport.layer.RouteStyle;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class RouteStyleBinding implements RouteStyle {
    private final NativeObject nativeObject;

    public RouteStyleBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteStyle
    public native boolean isValid();

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteStyle
    public native void setDrawPassedRoute(boolean z);

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteStyle
    public native void setShowManoeuvres(boolean z);

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteStyle
    public native void setShowRoute(boolean z);

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteStyle
    public native void setVisibleBalloonTypes(int i);
}
