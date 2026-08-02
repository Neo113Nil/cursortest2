package com.yandex.mapkit.search.advert_layer;

import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;

/* loaded from: classes7.dex */
public interface AdvertLayer {
    void addListener(AdvertLayerListener advertLayerListener);

    void clearSelection();

    boolean isValid();

    void removeListener(AdvertLayerListener advertLayerListener);

    void resetRoute();

    void setRoute(Polyline polyline);

    void setRoutePosition(PolylinePosition polylinePosition);

    void showLabels(boolean z);
}
