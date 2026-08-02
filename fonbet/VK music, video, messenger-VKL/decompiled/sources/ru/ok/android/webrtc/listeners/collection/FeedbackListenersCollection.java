package ru.ok.android.webrtc.listeners.collection;

import ru.ok.android.webrtc.listeners.CallFeedbackListener;

/* loaded from: classes9.dex */
public interface FeedbackListenersCollection {
    void addFeedbackListener(CallFeedbackListener callFeedbackListener);

    void removeFeedbackListener(CallFeedbackListener callFeedbackListener);
}
