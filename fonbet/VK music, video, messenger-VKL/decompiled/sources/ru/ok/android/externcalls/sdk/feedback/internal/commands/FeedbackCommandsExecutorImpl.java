package ru.ok.android.externcalls.sdk.feedback.internal.commands;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.feedback.exceptions.FeedbackException;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;
import xsna.w5r;
import xsna.x5r;

/* compiled from: FeedbackCommandsExecutorImpl.kt */
/* loaded from: classes9.dex */
public final class FeedbackCommandsExecutorImpl implements FeedbackCommandsExecutor {
    private final SignalingProvider signalingProvider;

    public FeedbackCommandsExecutorImpl(SignalingProvider signalingProvider) {
        this.signalingProvider = signalingProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendFeedback$lambda$0(gzs gzsVar, JSONObject jSONObject) {
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendFeedback$lambda$1(izs izsVar, JSONObject jSONObject) {
        if (izsVar != null) {
            izsVar.invoke(new FeedbackException(jSONObject.toString(), null, 2, null));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.feedback.internal.commands.FeedbackCommandsExecutor
    public void sendFeedback(String str, izs<? super Throwable, s3q0> izsVar, gzs<s3q0> gzsVar) {
        Signaling signaling = SignalingProviderKt.get(this.signalingProvider, izsVar);
        if (signaling == null) {
            return;
        }
        int i = 0;
        signaling.send(SignalingProtocol.createSendFeedbackCommand(str), new w5r(i, gzsVar), new x5r(izsVar, i));
    }
}
