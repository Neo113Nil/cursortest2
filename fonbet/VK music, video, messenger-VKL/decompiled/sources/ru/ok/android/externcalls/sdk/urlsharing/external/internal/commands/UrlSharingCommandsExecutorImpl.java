package ru.ok.android.externcalls.sdk.urlsharing.external.internal.commands;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.exceptions.ConversationNotPreparedException;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.commands.UrlSharingCommandsExecutorImpl;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.signaling.urlsharing.UrlSharingCommands;
import xsna.cq;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;
import xsna.vu3;
import xsna.w5r;
import xsna.x5r;

/* compiled from: UrlSharingCommandsExecutorImpl.kt */
/* loaded from: classes9.dex */
public final class UrlSharingCommandsExecutorImpl implements UrlSharingCommandsExecutor {
    private final SignalingProvider signalingProvider;

    public UrlSharingCommandsExecutorImpl(SignalingProvider signalingProvider) {
        this.signalingProvider = signalingProvider;
    }

    private final Signaling getSignalingOrPassExceptionToOnError(izs<? super Throwable, s3q0> izsVar) {
        Signaling signaling = this.signalingProvider.getSignaling();
        if (signaling != null) {
            return signaling;
        }
        if (izsVar == null) {
            return null;
        }
        izsVar.invoke(new ConversationNotPreparedException());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$0(gzs gzsVar, JSONObject jSONObject) {
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$1(izs izsVar, JSONObject jSONObject) {
        if (izsVar != null) {
            izsVar.invoke(new RuntimeException(cq.c("Start url sharing error ", jSONObject)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stop$lambda$0(gzs gzsVar, JSONObject jSONObject) {
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stop$lambda$1(izs izsVar, JSONObject jSONObject) {
        if (izsVar != null) {
            izsVar.invoke(new RuntimeException(cq.c("Stop url sharing error ", jSONObject)));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.urlsharing.external.internal.commands.UrlSharingCommandsExecutor
    public void start(String str, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        Signaling signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(izsVar);
        if (signalingOrPassExceptionToOnError == null) {
            return;
        }
        int i = 1;
        signalingOrPassExceptionToOnError.send(new UrlSharingCommands().createStartUrlSharingCommand(str), new w5r(i, gzsVar), new x5r(izsVar, i));
    }

    @Override // ru.ok.android.externcalls.sdk.urlsharing.external.internal.commands.UrlSharingCommandsExecutor
    public void stop(final gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        Signaling signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(izsVar);
        if (signalingOrPassExceptionToOnError == null) {
            return;
        }
        signalingOrPassExceptionToOnError.send(new UrlSharingCommands().createStopUrlSharingCommand(), new Signaling.Listener() { // from class: xsna.efq0
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                UrlSharingCommandsExecutorImpl.stop$lambda$0(gzs.this, jSONObject);
            }
        }, new vu3(1, izsVar));
    }
}
