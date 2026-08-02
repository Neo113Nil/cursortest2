package com.yandex.mapkit.navigation.automotive.internal;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.navigation.RoutePosition;
import com.yandex.mapkit.navigation.automotive.Alternative;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class AlternativeBinding implements Alternative {
    private final NativeObject nativeObject;

    public AlternativeBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.navigation.automotive.Alternative
    public native DrivingRoute getAlternative();

    @Override // com.yandex.mapkit.navigation.automotive.Alternative
    public native RoutePosition getForkPositionOnAlternative();

    @Override // com.yandex.mapkit.navigation.automotive.Alternative
    public native RoutePosition getForkPositionOnCurrentRoute();
}
