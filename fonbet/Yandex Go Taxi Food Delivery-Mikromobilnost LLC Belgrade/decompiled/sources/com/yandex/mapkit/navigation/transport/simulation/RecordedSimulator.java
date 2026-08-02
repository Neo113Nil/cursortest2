package com.yandex.mapkit.navigation.transport.simulation;

import com.yandex.mapkit.location.Location;
import com.yandex.mapkit.location.LocationManager;
import com.yandex.mapkit.navigation.transport.Navigation;
import com.yandex.mapkit.transport.masstransit.Route;

/* loaded from: classes15.dex */
public interface RecordedSimulator extends LocationManager {
    void forceStartGuidanceCurrentRoute(Navigation navigation);

    int getClockRate();

    Location getLocation();

    Route getRoute();

    String getRouteUri();

    long getTimestamp();

    boolean isActive();

    void setClockRate(int i);

    void setTimestamp(long j);

    void subscribeForSimulatorEvents(RecordedSimulatorListener recordedSimulatorListener);

    void unsubscribeFromSimulatorEvents(RecordedSimulatorListener recordedSimulatorListener);
}
