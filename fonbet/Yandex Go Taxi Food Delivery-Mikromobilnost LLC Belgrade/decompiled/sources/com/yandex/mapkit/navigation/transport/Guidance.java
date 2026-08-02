package com.yandex.mapkit.navigation.transport;

import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.location.Location;
import com.yandex.mapkit.transport.masstransit.Route;

/* loaded from: classes7.dex */
public interface Guidance {
    void addListener(GuidanceListener guidanceListener);

    void disableAutoRerouting();

    void enableAutoRerouting();

    Annotator getAnnotator();

    Double getCourse();

    Route getCurrentRoute();

    GuidanceMode getGuidanceMode();

    RequestPoint getLastReachedRequestPoint();

    Location getLocation();

    Double getRemainingDistance();

    PolylinePosition getRoutePosition();

    Double getTimeToFinish();

    boolean isValid();

    void removeListener(GuidanceListener guidanceListener);

    boolean setTransportThread(int i, String str);
}
