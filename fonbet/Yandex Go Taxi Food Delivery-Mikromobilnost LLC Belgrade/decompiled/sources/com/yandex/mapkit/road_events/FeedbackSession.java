package com.yandex.mapkit.road_events;

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
