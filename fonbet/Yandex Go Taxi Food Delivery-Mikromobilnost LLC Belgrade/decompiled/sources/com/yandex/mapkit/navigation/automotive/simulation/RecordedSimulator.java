package com.yandex.mapkit.navigation.automotive.simulation;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.location.Location;
import com.yandex.mapkit.location.LocationManager;

/* loaded from: classes15.dex */
public interface RecordedSimulator extends LocationManager {

    public enum RouteChangeReason {
        USER,
        REROUTING,
        FINISH,
        STOP,
        FREEDRIVE
    }

    int getClockRate();

    Location getLocation();

    DrivingRoute getRoute();

    RouteChangeReason getRouteChangeReason();

    String getRouteUri();

    long getTimestamp();

    boolean isActive();

    void setClockRate(int i);

    void setTimestamp(long j);

    void subscribeForSimulatorEvents(RecordedSimulatorListener recordedSimulatorListener);

    void unsubscribeFromSimulatorEvents(RecordedSimulatorListener recordedSimulatorListener);
}
