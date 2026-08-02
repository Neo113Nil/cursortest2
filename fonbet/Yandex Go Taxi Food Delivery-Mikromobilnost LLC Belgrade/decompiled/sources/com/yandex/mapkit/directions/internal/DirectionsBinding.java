package com.yandex.mapkit.directions.internal;

import com.yandex.mapkit.coverage.Coverage;
import com.yandex.mapkit.directions.Directions;
import com.yandex.mapkit.directions.carparks.CarparksLayer;
import com.yandex.mapkit.directions.carparks.CarparksNearbyLayer;
import com.yandex.mapkit.directions.driving.DrivingRouter;
import com.yandex.mapkit.directions.driving.DrivingRouterType;
import com.yandex.mapkit.directions.traffic_lights.TrafficLightsManager;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class DirectionsBinding implements Directions {
    private final NativeObject nativeObject;

    public DirectionsBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.directions.Directions
    public native CarparksLayer createCarparksLayer(MapWindow mapWindow);

    @Override // com.yandex.mapkit.directions.Directions
    public native CarparksNearbyLayer createCarparksNearbyLayer(MapWindow mapWindow);

    @Override // com.yandex.mapkit.directions.Directions
    public native DrivingRouter createDrivingRouter(DrivingRouterType drivingRouterType);

    @Override // com.yandex.mapkit.directions.Directions
    public native Coverage createGuidanceCoverage();

    @Override // com.yandex.mapkit.directions.Directions
    public native TrafficLightsManager createTrafficLightsManager();

    @Override // com.yandex.mapkit.directions.Directions
    public native boolean isValid();
}
