package ru.ok.android.externcalls.sdk.feedback;

import ru.ok.android.externcalls.sdk.feedback.listener.FeedbackListener;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;

/* compiled from: FeedbackManager.kt */
/* loaded from: classes9.dex */
public interface FeedbackManager {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void sendFeedback$default(FeedbackManager feedbackManager, String str, ParticipantFeedbackSource participantFeedbackSource, izs izsVar, gzs gzsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendFeedback");
        }
        if ((i & 4) != 0) {
            izsVar = null;
        }
        if ((i & 8) != 0) {
            gzsVar = null;
        }
        feedbackManager.sendFeedback(str, participantFeedbackSource, izsVar, gzsVar);
    }

    void addListener(FeedbackListener feedbackListener);

    ParticipantFeedback getOwnCurrentFeedback();

    void removeListener(FeedbackListener feedbackListener);

    void sendFeedback(String str, ParticipantFeedbackSource participantFeedbackSource, izs<? super Throwable, s3q0> izsVar, gzs<s3q0> gzsVar);

    void setTimeout(long j);
}
