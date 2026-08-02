package com.yandex.mapkit.navigation.automotive;

import com.yandex.mapkit.directions.traffic_lights.RouteDirectionArrow;
import com.yandex.mapkit.directions.traffic_lights.SectionType;
import com.yandex.mapkit.directions.traffic_lights.Signal;
import com.yandex.mapkit.navigation.RoutePosition;

/* loaded from: classes15.dex */
public interface UpcomingTrafficLightWithSignal {
    RouteDirectionArrow getArrow();

    String getId();

    RoutePosition getPosition();

    Integer getSecondsLeft();

    SectionType getSectionType();

    Signal getSignal();
}
