package com.yandex.mapkit.directions;

import com.yandex.mapkit.coverage.Coverage;
import com.yandex.mapkit.directions.carparks.CarparksLayer;
import com.yandex.mapkit.directions.carparks.CarparksNearbyLayer;
import com.yandex.mapkit.directions.driving.DrivingRouter;
import com.yandex.mapkit.directions.driving.DrivingRouterType;
import com.yandex.mapkit.directions.traffic_lights.TrafficLightsManager;
import com.yandex.mapkit.map.MapWindow;

/* loaded from: classes15.dex */
public interface Directions {
    CarparksLayer createCarparksLayer(MapWindow mapWindow);

    CarparksNearbyLayer createCarparksNearbyLayer(MapWindow mapWindow);

    DrivingRouter createDrivingRouter(DrivingRouterType drivingRouterType);

    Coverage createGuidanceCoverage();

    TrafficLightsManager createTrafficLightsManager();

    boolean isValid();
}
