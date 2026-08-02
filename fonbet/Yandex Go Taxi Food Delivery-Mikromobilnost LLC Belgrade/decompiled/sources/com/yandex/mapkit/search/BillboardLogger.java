package com.yandex.mapkit.search;

import com.yandex.mapkit.GeoObject;

/* loaded from: classes15.dex */
public interface BillboardLogger {
    void logAdvertAction(String str, GeoObject geoObject);

    void logBannerClick(GeoObject geoObject);

    void logBannerShow(GeoObject geoObject);

    void logRouteVia(GeoObject geoObject);
}
