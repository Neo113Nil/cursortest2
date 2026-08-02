package ru.ok.android.externcalls.sdk.feedback.internal.listeners;

import ru.ok.android.externcalls.sdk.feedback.ParticipantFeedback;
import ru.ok.android.externcalls.sdk.feedback.ParticipantFeedbackSource;
import ru.ok.android.externcalls.sdk.feedback.listener.FeedbackListener;

/* compiled from: FeedbackListenerManager.kt */
/* loaded from: classes9.dex */
public interface FeedbackListenerManager {
    void addListener(FeedbackListener feedbackListener);

    ParticipantFeedback getOwnCurrentFeedback();

    void ownFeedbackSent(String str, ParticipantFeedbackSource participantFeedbackSource);

    void removeListener(FeedbackListener feedbackListener);

    void setTimeout(long j);
}
