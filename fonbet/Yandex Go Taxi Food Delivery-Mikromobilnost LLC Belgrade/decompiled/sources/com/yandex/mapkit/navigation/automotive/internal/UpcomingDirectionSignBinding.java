package com.yandex.mapkit.navigation.automotive.internal;

import com.yandex.mapkit.directions.driving.DirectionSign;
import com.yandex.mapkit.navigation.RoutePosition;
import com.yandex.mapkit.navigation.automotive.UpcomingDirectionSign;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class UpcomingDirectionSignBinding implements UpcomingDirectionSign {
    private final NativeObject nativeObject;

    public UpcomingDirectionSignBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.navigation.automotive.UpcomingDirectionSign
    public native DirectionSign getDirectionSign();

    @Override // com.yandex.mapkit.navigation.automotive.UpcomingDirectionSign
    public native RoutePosition getPosition();
}
