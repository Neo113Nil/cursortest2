package com.yandex.mapkit.navigation.automotive.custom_route_navigation;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.navigation.automotive.Navigation;
import com.yandex.mapkit.navigation.guidance_camera.Camera;

/* loaded from: classes15.dex */
public interface CustomRouteNavigation {
    Camera createCamera(MapWindow mapWindow);

    Navigation getNavigation();

    void startGuidance(DrivingRoute drivingRoute);
}
