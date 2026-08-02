package com.yandex.mapkit.navigation.automotive;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.geometry.PolylinePosition;
import java.util.List;

/* loaded from: classes14.dex */
public interface TrafficLightsController {
    void addListener(TrafficLightsControllerListener trafficLightsControllerListener);

    List<UpcomingTrafficLightWithSignal> getTrafficLightsWithSignal();

    void removeListener(TrafficLightsControllerListener trafficLightsControllerListener);

    void resume();

    void setMaxNumberOfUpcomingTrafficLights(int i);

    void setRoute(DrivingRoute drivingRoute);

    void setRoutePosition(PolylinePosition polylinePosition);

    void suspend();
}
