package com.yandex.mapkit.directions.traffic_lights;

import com.yandex.runtime.Error;

/* loaded from: classes15.dex */
public interface TrafficLightInfoSession {

    public interface TrafficLightInfoListener {
        void onTrafficLightInfoError(Error error);

        void onTrafficLightInfoReceived(TrafficLightInfo trafficLightInfo);
    }

    void cancel();

    void retry(TrafficLightInfoListener trafficLightInfoListener);
}
