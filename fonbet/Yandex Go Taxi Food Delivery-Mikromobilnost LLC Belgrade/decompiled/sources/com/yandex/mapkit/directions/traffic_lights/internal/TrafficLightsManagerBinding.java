package com.yandex.mapkit.directions.traffic_lights.internal;

import com.yandex.mapkit.directions.traffic_lights.FeedbackSession;
import com.yandex.mapkit.directions.traffic_lights.TrafficLightInfoSession;
import com.yandex.mapkit.directions.traffic_lights.TrafficLightsManager;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class TrafficLightsManagerBinding implements TrafficLightsManager {
    private final NativeObject nativeObject;

    public TrafficLightsManagerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.directions.traffic_lights.TrafficLightsManager
    public native TrafficLightInfoSession requestInfo(String str, TrafficLightInfoSession.TrafficLightInfoListener trafficLightInfoListener);

    @Override // com.yandex.mapkit.directions.traffic_lights.TrafficLightsManager
    public native FeedbackSession sendFeedback(String str, String str2, FeedbackSession.FeedbackListener feedbackListener);
}
