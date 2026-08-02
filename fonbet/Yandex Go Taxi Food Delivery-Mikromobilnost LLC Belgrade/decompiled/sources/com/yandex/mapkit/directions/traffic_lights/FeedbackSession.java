package com.yandex.mapkit.directions.traffic_lights;

import com.yandex.runtime.Error;

/* loaded from: classes15.dex */
public interface FeedbackSession {

    public interface FeedbackListener {
        void onFeedbackCompleted();

        void onFeedbackError(Error error);
    }

    void cancel();

    void retry(FeedbackListener feedbackListener);
}
