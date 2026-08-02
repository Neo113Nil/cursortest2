package com.yandex.mapkit.navigation.automotive.internal;

import com.yandex.mapkit.directions.driving.LaneSign;
import com.yandex.mapkit.navigation.RoutePosition;
import com.yandex.mapkit.navigation.automotive.UpcomingLaneSign;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class UpcomingLaneSignBinding implements UpcomingLaneSign {
    private final NativeObject nativeObject;

    public UpcomingLaneSignBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.navigation.automotive.UpcomingLaneSign
    public native LaneSign getLaneSign();

    @Override // com.yandex.mapkit.navigation.automotive.UpcomingLaneSign
    public native RoutePosition getPosition();
}
