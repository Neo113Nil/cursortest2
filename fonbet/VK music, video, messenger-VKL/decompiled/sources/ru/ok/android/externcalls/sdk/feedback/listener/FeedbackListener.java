package ru.ok.android.externcalls.sdk.feedback.listener;

import java.util.List;
import ru.ok.android.externcalls.sdk.feedback.ParticipantFeedback;

/* compiled from: FeedbackListener.kt */
/* loaded from: classes9.dex */
public interface FeedbackListener {
    void onFeedbackAdded(List<ParticipantFeedback> list);

    void onFeedbackEnabledChanged(boolean z);

    void onFeedbackRemoved(List<ParticipantFeedback> list);
}
