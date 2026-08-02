package com.yandex.mapkit.navigation.transport.layer;

import com.yandex.mapkit.navigation.guidance_camera.Camera;
import com.yandex.mapkit.navigation.transport.Navigation;
import com.yandex.mapkit.navigation.transport.layer.balloons.BalloonViewListener;
import com.yandex.mapkit.transport.masstransit.Route;
import java.util.List;

/* loaded from: classes7.dex */
public interface NavigationLayer {
    void addBalloonViewListener(BalloonViewListener balloonViewListener);

    void addRequestPointViewListener(RequestPointViewListener requestPointViewListener);

    void addRouteListener(RouteViewListener routeViewListener);

    void deselectRequestPoint();

    String getBalloonsLayerId();

    String getBaseLayerId();

    Camera getCamera();

    Navigation getNavigation();

    List<RouteView> getRoutes();

    RoutesSource getRoutesSource();

    RouteView getView(Route route);

    boolean isIsVisible();

    boolean isShowBalloons();

    boolean isShowRequestPoints();

    boolean isValid();

    void refreshStyle();

    void removeBalloonViewListener(BalloonViewListener balloonViewListener);

    void removeFromMap();

    void removeRequestPointViewListener(RequestPointViewListener requestPointViewListener);

    void removeRouteListener(RouteViewListener routeViewListener);

    void selectRequestPoint(int i);

    void selectRoute(RouteView routeView);

    RouteView selectedRoute();

    void setIsVisible(boolean z);

    void setShowBalloons(boolean z);

    void setShowRequestPoints(boolean z);
}
