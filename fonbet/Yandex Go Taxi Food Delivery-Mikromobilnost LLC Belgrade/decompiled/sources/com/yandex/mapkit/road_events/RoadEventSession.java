package com.yandex.mapkit.road_events;

import com.yandex.mapkit.GeoObject;
import com.yandex.runtime.Error;

/* loaded from: classes15.dex */
public interface RoadEventSession {

    /* loaded from: classes7.dex */
    public interface RoadEventListener {
        void onRoadEventError(Error error);

        void onRoadEventReceived(GeoObject geoObject);
    }

    void cancel();

    void retry(RoadEventListener roadEventListener);
}
