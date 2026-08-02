package com.yandex.mapkit.road_events;

import com.yandex.mapkit.GeoObject;
import com.yandex.runtime.Error;

/* loaded from: classes15.dex */
public interface EventInfoSession {

    /* loaded from: classes7.dex */
    public interface EventInfoListener {
        void onEventInfoError(Error error);

        void onEventInfoReceived(GeoObject geoObject);
    }

    void cancel();

    void retry(EventInfoListener eventInfoListener);
}
