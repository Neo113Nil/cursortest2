package com.yandex.mapkit.navigation.automotive;

import com.yandex.mapkit.directions.driving.Event;
import com.yandex.mapkit.navigation.RoutePosition;

/* loaded from: classes15.dex */
public interface UpcomingRoadEvent {
    Double getEffectiveSpeedLimit();

    Event getEvent();

    RoutePosition getPosition();

    SpeedLimitStatus getSpeedLimitStatus();
}
