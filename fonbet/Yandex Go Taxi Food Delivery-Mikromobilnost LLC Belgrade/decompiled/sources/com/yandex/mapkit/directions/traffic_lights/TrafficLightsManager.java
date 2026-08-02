package com.yandex.mapkit.directions.traffic_lights;

import com.yandex.mapkit.directions.traffic_lights.FeedbackSession;
import com.yandex.mapkit.directions.traffic_lights.TrafficLightInfoSession;

/* loaded from: classes15.dex */
public interface TrafficLightsManager {
    TrafficLightInfoSession requestInfo(String str, TrafficLightInfoSession.TrafficLightInfoListener trafficLightInfoListener);

    FeedbackSession sendFeedback(String str, String str2, FeedbackSession.FeedbackListener feedbackListener);
}
