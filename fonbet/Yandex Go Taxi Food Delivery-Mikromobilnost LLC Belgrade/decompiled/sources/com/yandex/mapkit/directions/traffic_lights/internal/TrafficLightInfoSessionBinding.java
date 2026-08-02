package com.yandex.mapkit.directions.traffic_lights.internal;

import com.yandex.mapkit.directions.traffic_lights.TrafficLightInfoSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class TrafficLightInfoSessionBinding implements TrafficLightInfoSession {
    private final NativeObject nativeObject;

    public TrafficLightInfoSessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.directions.traffic_lights.TrafficLightInfoSession
    public native void cancel();

    @Override // com.yandex.mapkit.directions.traffic_lights.TrafficLightInfoSession
    public native void retry(TrafficLightInfoSession.TrafficLightInfoListener trafficLightInfoListener);
}
