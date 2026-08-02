package com.yandex.mapkit.navigation.automotive;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.navigation.RoutePosition;

/* loaded from: classes15.dex */
public interface Alternative {
    DrivingRoute getAlternative();

    RoutePosition getForkPositionOnAlternative();

    RoutePosition getForkPositionOnCurrentRoute();
}
