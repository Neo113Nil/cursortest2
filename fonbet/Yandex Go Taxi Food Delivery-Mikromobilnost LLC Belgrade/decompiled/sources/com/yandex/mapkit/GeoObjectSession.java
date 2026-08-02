package com.yandex.mapkit;

import com.yandex.runtime.Error;

/* loaded from: classes15.dex */
public interface GeoObjectSession {

    /* loaded from: classes6.dex */
    public interface GeoObjectListener {
        void onGeoObjectError(Error error);

        void onGeoObjectResult(GeoObject geoObject);
    }

    void cancel();

    void retry(GeoObjectListener geoObjectListener);
}
