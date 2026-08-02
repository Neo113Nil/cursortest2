package com.yandex.mapkit.navigation.transport.layer.internal;

import com.yandex.mapkit.navigation.transport.layer.ColorGradient;
import com.yandex.mapkit.navigation.transport.layer.RouteLineStyle;
import com.yandex.mapkit.styling.PolylineStyle;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class RouteLineStyleBinding implements RouteLineStyle {
    private final NativeObject nativeObject;

    public RouteLineStyleBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteLineStyle
    public native PolylineStyle getBase();

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteLineStyle
    public native ColorGradient getBaseColorGradient();

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteLineStyle
    public native Integer getBasePassedPartColor();

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteLineStyle
    public native PolylineStyle getInner();

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteLineStyle
    public native ColorGradient getInnerColorGradient();

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteLineStyle
    public native Integer getInnerPassedPartColor();

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteLineStyle
    public native boolean isDrawInnerLine();

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteLineStyle
    public native boolean isValid();

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteLineStyle
    public native void setBaseColorGradient(ColorGradient colorGradient);

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteLineStyle
    public native void setBasePassedPartColor(Integer num);

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteLineStyle
    public native void setDrawInnerLine(boolean z);

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteLineStyle
    public native void setInnerColorGradient(ColorGradient colorGradient);

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteLineStyle
    public native void setInnerPassedPartColor(Integer num);
}
