package ru.ok.android.externcalls.sdk.asr.internal.commands;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.asr.exceptions.AsrException;
import ru.ok.android.externcalls.sdk.asr.internal.commands.AsrCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.exceptions.ConversationNotPreparedException;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;
import xsna.vu3;
import xsna.yu3;

/* compiled from: AsrCommandsExecutorImpl.kt */
/* loaded from: classes9.dex */
public final class AsrCommandsExecutorImpl implements AsrCommandsExecutor {
    private final ParticipantStore participantStore;
    private final SignalingProvider signalingProvider;

    public AsrCommandsExecutorImpl(SignalingProvider signalingProvider, ParticipantStore participantStore) {
        this.signalingProvider = signalingProvider;
        this.participantStore = participantStore;
    }

    private final SessionRoomId getActiveRoomId() {
        return this.participantStore.getActiveRoomId();
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
    public static final void startRecord$lambda$0(gzs gzsVar, JSONObject jSONObject) {
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startRecord$lambda$1(izs izsVar, JSONObject jSONObject) {
        if (izsVar != null) {
            izsVar.invoke(new AsrException(jSONObject, null, null, 6, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stopRecord$lambda$0(gzs gzsVar, JSONObject jSONObject) {
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stopRecord$lambda$1(izs izsVar, JSONObject jSONObject) {
        if (izsVar != null) {
            izsVar.invoke(new AsrException(jSONObject, null, null, 6, null));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.asr.internal.commands.AsrCommandsExecutor
    public void startRecord(String str, SessionRoomId sessionRoomId, gzs<s3q0> gzsVar, final izs<? super Throwable, s3q0> izsVar) {
        if (sessionRoomId == null) {
            sessionRoomId = getActiveRoomId();
        }
        Signaling signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(izsVar);
        if (signalingOrPassExceptionToOnError == null) {
            return;
        }
        signalingOrPassExceptionToOnError.send(SignalingProtocol.createAsrStartCommand(str, sessionRoomId), new vu3(0, gzsVar), new Signaling.Listener() { // from class: xsna.wu3
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                AsrCommandsExecutorImpl.startRecord$lambda$1(izs.this, jSONObject);
            }
        });
    }

    @Override // ru.ok.android.externcalls.sdk.asr.internal.commands.AsrCommandsExecutor
    public void stopRecord(SessionRoomId sessionRoomId, final gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        if (sessionRoomId == null) {
            sessionRoomId = getActiveRoomId();
        }
        Signaling signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(izsVar);
        if (signalingOrPassExceptionToOnError == null) {
            return;
        }
        signalingOrPassExceptionToOnError.send(SignalingProtocol.createAsrStopCommand(sessionRoomId), new Signaling.Listener() { // from class: xsna.xu3
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                AsrCommandsExecutorImpl.stopRecord$lambda$0(gzs.this, jSONObject);
            }
        }, new yu3(izsVar, 0));
    }
}
