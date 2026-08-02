package com.yandex.mapkit.navigation.automotive.internal;

import com.yandex.mapkit.directions.traffic_lights.RouteDirectionArrow;
import com.yandex.mapkit.directions.traffic_lights.SectionType;
import com.yandex.mapkit.directions.traffic_lights.Signal;
import com.yandex.mapkit.navigation.RoutePosition;
import com.yandex.mapkit.navigation.automotive.UpcomingTrafficLightWithSignal;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class UpcomingTrafficLightWithSignalBinding implements UpcomingTrafficLightWithSignal {
    private final NativeObject nativeObject;

    public UpcomingTrafficLightWithSignalBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.navigation.automotive.UpcomingTrafficLightWithSignal
    public native RouteDirectionArrow getArrow();

    @Override // com.yandex.mapkit.navigation.automotive.UpcomingTrafficLightWithSignal
    public native String getId();

    @Override // com.yandex.mapkit.navigation.automotive.UpcomingTrafficLightWithSignal
    public native RoutePosition getPosition();

    @Override // com.yandex.mapkit.navigation.automotive.UpcomingTrafficLightWithSignal
    public native Integer getSecondsLeft();

    @Override // com.yandex.mapkit.navigation.automotive.UpcomingTrafficLightWithSignal
    public native SectionType getSectionType();

    @Override // com.yandex.mapkit.navigation.automotive.UpcomingTrafficLightWithSignal
    public native Signal getSignal();
}
