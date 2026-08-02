package com.yandex.mapkit.search;

import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import java.util.List;

/* loaded from: classes15.dex */
public interface BillboardRouteManager {
    void addListener(AdvertRouteListener advertRouteListener);

    List<GeoObject> getAdvertObjects();

    void removeListener(AdvertRouteListener advertRouteListener);

    void resetRoute();

    void setRoute(Polyline polyline);

    void setRoutePosition(PolylinePosition polylinePosition);
}
