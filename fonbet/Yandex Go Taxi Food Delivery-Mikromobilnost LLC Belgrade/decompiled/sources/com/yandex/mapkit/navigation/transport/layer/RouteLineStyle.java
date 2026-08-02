package com.yandex.mapkit.navigation.transport.layer;

import com.yandex.mapkit.styling.PolylineStyle;

/* loaded from: classes15.dex */
public interface RouteLineStyle {
    PolylineStyle getBase();

    ColorGradient getBaseColorGradient();

    Integer getBasePassedPartColor();

    PolylineStyle getInner();

    ColorGradient getInnerColorGradient();

    Integer getInnerPassedPartColor();

    boolean isDrawInnerLine();

    boolean isValid();

    void setBaseColorGradient(ColorGradient colorGradient);

    void setBasePassedPartColor(Integer num);

    void setDrawInnerLine(boolean z);

    void setInnerColorGradient(ColorGradient colorGradient);

    void setInnerPassedPartColor(Integer num);
}
