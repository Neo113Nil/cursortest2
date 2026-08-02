package ru.ok.android.externcalls.sdk.media.mute.internal.command;

import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;
import ru.ok.android.webrtc.Call;
import ru.ok.android.webrtc.media_options.MediaOption;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import ru.ok.android.webrtc.media_options.MediaOptions;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.signaling.mediaoptions.MediaOptionsCommandParamsCreator;
import xsna.cq;
import xsna.gzs;
import xsna.izs;
import xsna.qrj;
import xsna.qs10;
import xsna.rrj;
import xsna.rs10;
import xsna.s3q0;

/* compiled from: MediaMuteCommandExecutorImpl.kt */
/* loaded from: classes9.dex */
public final class MediaMuteCommandExecutorImpl implements MediaMuteCommandExecutor {
    private final gzs<SessionRoomId> getActiveRoomId;
    private final gzs<Call> getCall;
    private final izs<ParticipantId, CallParticipant.ParticipantId> getInternalId;
    private final MediaOptionsCommandParamsCreator paramsCreator = new MediaOptionsCommandParamsCreator();
    private final SignalingProvider signalingProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public MediaMuteCommandExecutorImpl(SignalingProvider signalingProvider, gzs<Call> gzsVar, izs<? super ParticipantId, CallParticipant.ParticipantId> izsVar, gzs<? extends SessionRoomId> gzsVar2) {
        this.signalingProvider = signalingProvider;
        this.getCall = gzsVar;
        this.getInternalId = izsVar;
        this.getActiveRoomId = gzsVar2;
    }

    private final void requestToEnableMedia(Set<? extends MediaOption> set, ParticipantId participantId, SessionRoomId sessionRoomId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        Signaling signaling = SignalingProviderKt.get(this.signalingProvider, izsVar);
        if (signaling == null) {
            return;
        }
        CallParticipant.ParticipantId invoke = this.getInternalId.invoke(participantId);
        if (participantId != null && invoke == null) {
            if (izsVar != null) {
                izsVar.invoke(new IllegalStateException("Participant is not prepared"));
                return;
            }
            return;
        }
        try {
            MediaOptionsCommandParamsCreator mediaOptionsCommandParamsCreator = this.paramsCreator;
            if (sessionRoomId == null) {
                sessionRoomId = this.getActiveRoomId.invoke();
            }
            signaling.send(mediaOptionsCommandParamsCreator.createRequestToEnableMedia(set, invoke, sessionRoomId), new qs10(0, gzsVar), new qrj(1, izsVar));
        } catch (JSONException e) {
            if (izsVar != null) {
                izsVar.invoke(new RuntimeException("Error while creating params", e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestToEnableMedia$lambda$0(gzs gzsVar, JSONObject jSONObject) {
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestToEnableMedia$lambda$1(izs izsVar, JSONObject jSONObject) {
        if (izsVar != null) {
            izsVar.invoke(new RuntimeException(cq.c("Error response ", jSONObject)));
        }
    }

    private final void updateMediaOptions(Map<MediaOption, ? extends MediaOptionState> map, ParticipantId participantId, SessionRoomId sessionRoomId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        Signaling signaling = SignalingProviderKt.get(this.signalingProvider, izsVar);
        if (signaling == null) {
            return;
        }
        CallParticipant.ParticipantId invoke = this.getInternalId.invoke(participantId);
        if (participantId != null && invoke == null) {
            if (izsVar != null) {
                izsVar.invoke(new IllegalStateException("Participant is not prepared"));
                return;
            }
            return;
        }
        try {
            MediaOptionsCommandParamsCreator mediaOptionsCommandParamsCreator = this.paramsCreator;
            if (sessionRoomId == null) {
                sessionRoomId = this.getActiveRoomId.invoke();
            }
            signaling.send(mediaOptionsCommandParamsCreator.createUpdateMediaOptions(map, invoke, sessionRoomId), new rrj(1, gzsVar), new rs10(0, izsVar));
        } catch (JSONException e) {
            if (izsVar != null) {
                izsVar.invoke(new RuntimeException("Error while creating params", e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateMediaOptions$lambda$0(gzs gzsVar, JSONObject jSONObject) {
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateMediaOptions$lambda$1(izs izsVar, JSONObject jSONObject) {
        if (izsVar != null) {
            izsVar.invoke(new RuntimeException(cq.c("Error response ", jSONObject)));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public MediaOptions getMediaOptionsForCall(SessionRoomId sessionRoomId) {
        MediaOptions mediaOptionsForCall;
        Call invoke = this.getCall.invoke();
        if (sessionRoomId == null) {
            sessionRoomId = this.getActiveRoomId.invoke();
        }
        return (invoke == null || (mediaOptionsForCall = invoke.getMediaOptionsForCall(sessionRoomId)) == null) ? new MediaOptions(null, null, null, null, 15, null) : mediaOptionsForCall;
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public MediaOptions getMediaOptionsForCurrentUser() {
        MediaOptions mediaOptionsForCurrentUser;
        Call invoke = this.getCall.invoke();
        return (invoke == null || (mediaOptionsForCurrentUser = invoke.getMediaOptionsForCurrentUser()) == null) ? new MediaOptions(null, null, null, null, 15, null) : mediaOptionsForCurrentUser;
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public void requestToEnableMediaForAll(Set<? extends MediaOption> set, SessionRoomId sessionRoomId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        requestToEnableMedia(set, null, sessionRoomId, gzsVar, izsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public void requestToEnableMediaForParticipant(Set<? extends MediaOption> set, ParticipantId participantId, SessionRoomId sessionRoomId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        requestToEnableMedia(set, participantId, sessionRoomId, gzsVar, izsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public void setAudioPlayoutMuted(boolean z) {
        Call invoke = this.getCall.invoke();
        if (invoke != null) {
            invoke.setAudioPlayoutMuted(z);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public void updateMediaOptionsForAll(Map<MediaOption, ? extends MediaOptionState> map, SessionRoomId sessionRoomId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        updateMediaOptions(map, null, sessionRoomId, gzsVar, izsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public void updateMediaOptionsForParticipant(Map<MediaOption, ? extends MediaOptionState> map, ParticipantId participantId, SessionRoomId sessionRoomId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        updateMediaOptions(map, participantId, sessionRoomId, gzsVar, izsVar);
    }
}
