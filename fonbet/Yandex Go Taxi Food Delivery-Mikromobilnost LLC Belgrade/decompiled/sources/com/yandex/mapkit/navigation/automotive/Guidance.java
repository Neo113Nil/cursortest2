package com.yandex.mapkit.navigation.automotive;

import com.yandex.mapkit.LocalizedValue;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.location.Location;
import com.yandex.mapkit.navigation.automotive.PerformanceMonitor;
import java.util.List;

/* loaded from: classes15.dex */
public interface Guidance {
    void addListener(GuidanceListener guidanceListener);

    PerformanceMonitor createPerformanceMonitor(PerformanceMonitor.MetricTag metricTag);

    List<Alternative> getAlternatives();

    Annotator getAnnotator();

    DrivingRoute getCurrentRoute();

    Alternative getFastestAlternative();

    Location getLocation();

    LocationClass getLocationClass();

    String getRoadName();

    RouteStatus getRouteStatus();

    LocalizedValue getSpeedLimit();

    SpeedLimitStatus getSpeedLimitStatus();

    double getSpeedLimitTolerance();

    SpeedLimitsPolicy getSpeedLimitsPolicy();

    Windshield getWindshield();

    boolean isEnableAlternatives();

    boolean isEnableReroutes();

    Boolean isIsStanding();

    boolean isValid();

    void removeListener(GuidanceListener guidanceListener);

    void setEnableAlternatives(boolean z);

    void setEnableReroutes(boolean z);

    void setMaxNumberOfUpcomingTrafficLights(int i);

    void setSpeedLimitTolerance(double d);

    void switchToRoute(DrivingRoute drivingRoute);
}
