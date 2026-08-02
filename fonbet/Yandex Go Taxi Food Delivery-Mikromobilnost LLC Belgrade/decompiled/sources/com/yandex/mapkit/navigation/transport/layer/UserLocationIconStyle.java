package com.yandex.mapkit.navigation.transport.layer;

import com.yandex.mapkit.styling.PlacemarkStyle;

/* loaded from: classes15.dex */
public interface UserLocationIconStyle {
    PlacemarkStyle arrowStyle();

    boolean isValid();

    PlacemarkStyle pinStyle();

    void setMinimalSpeedForArrowIcon(float f);
}
