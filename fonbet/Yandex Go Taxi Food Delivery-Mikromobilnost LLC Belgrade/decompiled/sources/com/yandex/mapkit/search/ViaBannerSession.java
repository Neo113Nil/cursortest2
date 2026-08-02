package com.yandex.mapkit.search;

import com.yandex.mapkit.GeoObject;

/* loaded from: classes15.dex */
public interface ViaBannerSession {

    public interface ViaBannerListener {
        void onViaBanner(GeoObject geoObject);
    }

    void cancel();
}
