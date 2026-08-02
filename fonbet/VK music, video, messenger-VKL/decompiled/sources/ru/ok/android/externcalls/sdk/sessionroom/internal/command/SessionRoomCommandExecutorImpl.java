package ru.ok.android.externcalls.sdk.sessionroom.internal.command;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesManagerImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.sessionroom.admin.SwitchRoomParams;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;

/* compiled from: SessionRoomCommandExecutorImpl.kt */
/* loaded from: classes9.dex */
public final class SessionRoomCommandExecutorImpl extends SessionRoomCommandExecutorBase implements SessionRoomCommandExecutor {
    private final ParticipantStatesManagerImpl participantStatesManager;
    private final SignalingProvider signalingProvider;

    public SessionRoomCommandExecutorImpl(ParticipantStatesManagerImpl participantStatesManagerImpl, SignalingProvider signalingProvider) {
        this.participantStatesManager = participantStatesManagerImpl;
        this.signalingProvider = signalingProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void joinRoom$lambda$0(gzs gzsVar, JSONObject jSONObject) {
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void leaveRoom$lambda$0(gzs gzsVar, JSONObject jSONObject) {
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestAttention$lambda$0(gzs gzsVar, JSONObject jSONObject) {
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomCommandExecutor
    public void joinRoom(SessionRoomId.Room room, final gzs<s3q0> gzsVar, final izs<? super Throwable, s3q0> izsVar) {
        Signaling signaling = SignalingProviderKt.get(this.signalingProvider, izsVar);
        if (signaling == null) {
            return;
        }
        signaling.send(SignalingProtocol.createSwitchRoomCommand(new SwitchRoomParams.Builder().setToRoomId(room).build()), new Signaling.Listener() { // from class: xsna.dvi0
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                SessionRoomCommandExecutorImpl.joinRoom$lambda$0(gzs.this, jSONObject);
            }
        }, new Signaling.Listener() { // from class: xsna.evi0
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                SessionRoomCommandExecutorImpl.this.parseErrorResponse("joinRoom", jSONObject, izsVar);
            }
        });
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomCommandExecutor
    public void leaveRoom(final gzs<s3q0> gzsVar, final izs<? super Throwable, s3q0> izsVar) {
        Signaling signaling = SignalingProviderKt.get(this.signalingProvider, izsVar);
        if (signaling == null) {
            return;
        }
        signaling.send(SignalingProtocol.createSwitchRoomCommand(new SwitchRoomParams.Builder().setToRoomId(SessionRoomId.MainCall.INSTANCE).build()), new Signaling.Listener() { // from class: xsna.fvi0
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                SessionRoomCommandExecutorImpl.leaveRoom$lambda$0(gzs.this, jSONObject);
            }
        }, new Signaling.Listener() { // from class: xsna.gvi0
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                SessionRoomCommandExecutorImpl.this.parseErrorResponse("leaveRoom", jSONObject, izsVar);
            }
        });
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomCommandExecutor
    public void requestAttention(final gzs<s3q0> gzsVar, final izs<? super Throwable, s3q0> izsVar) {
        ParticipantStatesManagerImpl participantStatesManagerImpl = this.participantStatesManager;
        ParticipantStatesManagerImpl.State state = ParticipantStatesManagerImpl.State.ASSISTANCE_REQUESTED;
        if (!participantStatesManagerImpl.isOwnStateOn(state)) {
            this.participantStatesManager.updateOwnState(state, ParticipantStatesManagerImpl.Companion.getSTATE_ON(), new Signaling.Listener() { // from class: xsna.hvi0
                @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
                public final void onResponse(JSONObject jSONObject) {
                    SessionRoomCommandExecutorImpl.requestAttention$lambda$0(gzs.this, jSONObject);
                }
            }, new Signaling.Listener() { // from class: xsna.ivi0
                @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
                public final void onResponse(JSONObject jSONObject) {
                    SessionRoomCommandExecutorImpl.this.parseErrorResponse("requestAttention", jSONObject, izsVar);
                }
            });
        } else if (gzsVar != null) {
            gzsVar.invoke();
        }
    }
}
