package com.yandex.mapkit.search.advert_layer;

import com.yandex.mapkit.GeoObject;

/* loaded from: classes7.dex */
public interface AdvertLayerListener {
    void onAdvertPinHidden(GeoObject geoObject);

    void onAdvertPinShown(GeoObject geoObject);

    void onAdvertPinTapped(GeoObject geoObject);
}
