package ru.ok.android.externcalls.sdk.feedback.internal;

import ru.ok.android.externcalls.sdk.feedback.FeedbackManager;
import ru.ok.android.externcalls.sdk.feedback.ParticipantFeedback;
import ru.ok.android.externcalls.sdk.feedback.ParticipantFeedbackSource;
import ru.ok.android.externcalls.sdk.feedback.internal.commands.FeedbackCommandsExecutor;
import ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManager;
import ru.ok.android.externcalls.sdk.feedback.listener.FeedbackListener;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;

/* compiled from: FeedbackManagerImpl.kt */
/* loaded from: classes9.dex */
public final class FeedbackManagerImpl implements FeedbackManager, FeedbackCommandsExecutor, FeedbackListenerManager {
    private final FeedbackCommandsExecutor commandExecutor;
    private final FeedbackListenerManager listenerManager;

    public FeedbackManagerImpl(FeedbackCommandsExecutor feedbackCommandsExecutor, FeedbackListenerManager feedbackListenerManager) {
        this.commandExecutor = feedbackCommandsExecutor;
        this.listenerManager = feedbackListenerManager;
    }

    @Override // ru.ok.android.externcalls.sdk.feedback.FeedbackManager, ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManager
    public void addListener(FeedbackListener feedbackListener) {
        this.listenerManager.addListener(feedbackListener);
    }

    @Override // ru.ok.android.externcalls.sdk.feedback.FeedbackManager, ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManager
    public ParticipantFeedback getOwnCurrentFeedback() {
        return this.listenerManager.getOwnCurrentFeedback();
    }

    @Override // ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManager
    public void ownFeedbackSent(String str, ParticipantFeedbackSource participantFeedbackSource) {
        this.listenerManager.ownFeedbackSent(str, participantFeedbackSource);
    }

    @Override // ru.ok.android.externcalls.sdk.feedback.FeedbackManager, ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManager
    public void removeListener(FeedbackListener feedbackListener) {
        this.listenerManager.removeListener(feedbackListener);
    }

    @Override // ru.ok.android.externcalls.sdk.feedback.internal.commands.FeedbackCommandsExecutor
    public void sendFeedback(String str, izs<? super Throwable, s3q0> izsVar, gzs<s3q0> gzsVar) {
        this.commandExecutor.sendFeedback(str, izsVar, gzsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.feedback.FeedbackManager, ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManager
    public void setTimeout(long j) {
        this.listenerManager.setTimeout(j);
    }

    @Override // ru.ok.android.externcalls.sdk.feedback.FeedbackManager
    public void sendFeedback(String str, ParticipantFeedbackSource participantFeedbackSource, izs<? super Throwable, s3q0> izsVar, gzs<s3q0> gzsVar) {
        this.commandExecutor.sendFeedback(str, izsVar, gzsVar);
        this.listenerManager.ownFeedbackSent(str, participantFeedbackSource);
    }
}
