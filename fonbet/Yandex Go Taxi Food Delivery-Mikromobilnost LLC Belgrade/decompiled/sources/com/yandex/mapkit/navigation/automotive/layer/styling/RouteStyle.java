package com.yandex.mapkit.navigation.automotive.layer.styling;

/* loaded from: classes12.dex */
public interface RouteStyle {
    boolean isValid();

    void setMinZoomForTransparentRoutes(float f);

    void setShowBalloons(boolean z);

    void setShowCheckpoints(boolean z);

    void setShowJams(boolean z);

    void setShowManoeuvres(boolean z);

    void setShowRailwayCrossings(boolean z);

    void setShowRestrictedEntries(boolean z);

    void setShowRoadEvents(boolean z);

    void setShowRoadsInPoorCondition(boolean z);

    void setShowRoute(boolean z);

    void setShowSpeedBumps(boolean z);

    void setShowTollRoads(boolean z);

    void setShowTrafficLights(boolean z);
}
