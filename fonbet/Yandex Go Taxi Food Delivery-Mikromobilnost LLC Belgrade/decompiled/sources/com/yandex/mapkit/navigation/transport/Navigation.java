package com.yandex.mapkit.navigation.transport;

import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.mapkit.transport.masstransit.RouteOptions;
import java.util.List;

/* loaded from: classes7.dex */
public interface Navigation {
    void addListener(NavigationListener navigationListener);

    void cancelRequest();

    Guidance getGuidance();

    RouteOptions getRouteOptions();

    List<Route> getRoutes();

    Type getType();

    void removeListener(NavigationListener navigationListener);

    void requestRoutes(List<RequestPoint> list, TransportOptions transportOptions);

    void resetRoutes();

    void resolveUri(String str);

    void resume();

    void setRouteOptions(RouteOptions routeOptions);

    void startGuidance(Route route);

    void stopGuidance();

    void suspend();
}
