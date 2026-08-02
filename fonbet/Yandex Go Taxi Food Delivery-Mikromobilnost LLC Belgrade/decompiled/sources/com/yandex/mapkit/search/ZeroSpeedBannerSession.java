package com.yandex.mapkit.search;

import com.yandex.mapkit.GeoObject;

/* loaded from: classes15.dex */
public interface ZeroSpeedBannerSession {

    public interface ZeroSpeedBannerListener {
        void onZeroSpeedBanner(GeoObject geoObject);
    }

    void cancel();
}
