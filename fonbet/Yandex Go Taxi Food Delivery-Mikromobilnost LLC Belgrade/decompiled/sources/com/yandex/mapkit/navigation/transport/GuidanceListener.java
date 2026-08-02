package com.yandex.mapkit.navigation.transport;

/* loaded from: classes8.dex */
public interface GuidanceListener {
    void onCurrentRouteChanged(RouteChangeReason routeChangeReason);

    void onCurrentRouteFinished();

    void onCurrentRouteLost();

    void onGuidanceModeChanged();

    void onLocationChanged();

    void onReachedRequestPoint();

    void onReturnedToRoute();

    void onVehicleDetection(int i, String str);
}
