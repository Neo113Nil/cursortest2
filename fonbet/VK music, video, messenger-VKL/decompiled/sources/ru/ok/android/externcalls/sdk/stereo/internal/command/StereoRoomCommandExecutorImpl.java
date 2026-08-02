package ru.ok.android.externcalls.sdk.stereo.internal.command;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;
import ru.ok.android.externcalls.sdk.stereo.exception.ParticipantNotFoundException;
import ru.ok.android.externcalls.sdk.stereo.exception.PromotedLimitExceeded;
import ru.ok.android.externcalls.sdk.stereo.exception.StereoRoomException;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutor;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutorImpl;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.participant.waiting.CallWaitingParticipant;
import ru.ok.android.webrtc.participant.waiting.CallWaitingParticipantId;
import ru.ok.android.webrtc.participant.waiting.CallWaitingRoomParticipantsPage;
import ru.ok.android.webrtc.participant.waiting.CallWaitingRoomParticipantsParser;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.a19;
import xsna.c5g;
import xsna.epx;
import xsna.gzs;
import xsna.izs;
import xsna.qs10;
import xsna.s3q0;
import xsna.yzs;

/* compiled from: StereoRoomCommandExecutorImpl.kt */
/* loaded from: classes9.dex */
public final class StereoRoomCommandExecutorImpl implements StereoRoomCommandExecutor {
    private final RTCLog log;
    private final SignalingProvider signalingProvider;

    public StereoRoomCommandExecutorImpl(SignalingProvider signalingProvider, RTCLog rTCLog) {
        this.signalingProvider = signalingProvider;
        this.log = rTCLog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void acceptPromotion$lambda$0(gzs gzsVar, JSONObject jSONObject) {
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHandsQueue$lambda$0(StereoRoomCommandExecutorImpl stereoRoomCommandExecutorImpl, izs izsVar, yzs yzsVar, JSONObject jSONObject) {
        CallWaitingRoomParticipantsPage parse = new CallWaitingRoomParticipantsParser(stereoRoomCommandExecutorImpl.log).parse(jSONObject);
        if (parse == null) {
            if (izsVar != null) {
                izsVar.invoke(new StereoRoomException("getHandsQueue: missing response", null, 2, null));
                return;
            }
            return;
        }
        Integer valueOf = Integer.valueOf(parse.getTotalCount());
        Boolean valueOf2 = Boolean.valueOf(parse.hasMore());
        List<CallWaitingParticipant> participants = parse.getParticipants();
        ArrayList arrayList = new ArrayList(c5g.u(participants, 10));
        Iterator<T> it = participants.iterator();
        while (it.hasNext()) {
            arrayList.add(((CallWaitingParticipant) it.next()).getWaitingParticipantId());
        }
        yzsVar.invoke(valueOf, valueOf2, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void parseErrorResponse(String str, JSONObject jSONObject, izs<? super Throwable, s3q0> izsVar) {
        Throwable stereoRoomException;
        String optString = jSONObject.optString("error");
        if (epx.f(optString, "chatRoom.partNotFound")) {
            stereoRoomException = new ParticipantNotFoundException("Participant not found, " + str + " command " + jSONObject);
        } else if (epx.f(optString, "chatRoom.promotedLimit")) {
            stereoRoomException = new PromotedLimitExceeded();
        } else {
            stereoRoomException = new StereoRoomException("Error response for " + str + " command " + jSONObject, null, 2, null);
        }
        if (izsVar != null) {
            izsVar.invoke(stereoRoomException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void promoteParticipant$lambda$0(gzs gzsVar, JSONObject jSONObject) {
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestPromotion$lambda$0(gzs gzsVar, JSONObject jSONObject) {
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutor
    public void acceptPromotion(StereoRoomCommandExecutor.AcceptPromotionParams acceptPromotionParams, final gzs<s3q0> gzsVar, final izs<? super Throwable, s3q0> izsVar) {
        Signaling signaling = SignalingProviderKt.get(this.signalingProvider, izsVar);
        if (signaling == null) {
            return;
        }
        signaling.send(SignalingProtocol.createAcceptPromotion(acceptPromotionParams.getReject()), new Signaling.Listener() { // from class: xsna.c1l0
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                StereoRoomCommandExecutorImpl.acceptPromotion$lambda$0(gzs.this, jSONObject);
            }
        }, new Signaling.Listener() { // from class: xsna.d1l0
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                StereoRoomCommandExecutorImpl.this.parseErrorResponse("acceptPromotion", jSONObject, izsVar);
            }
        });
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutor
    public void getHandsQueue(final yzs<? super Integer, ? super Boolean, ? super List<CallWaitingParticipantId>, s3q0> yzsVar, final izs<? super Throwable, s3q0> izsVar) {
        Signaling signaling = SignalingProviderKt.get(this.signalingProvider, izsVar);
        if (signaling == null) {
            return;
        }
        signaling.send(SignalingProtocol.createGetHandQueue(), new Signaling.Listener() { // from class: xsna.z0l0
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                StereoRoomCommandExecutorImpl.getHandsQueue$lambda$0(StereoRoomCommandExecutorImpl.this, izsVar, yzsVar, jSONObject);
            }
        }, new Signaling.Listener() { // from class: xsna.a1l0
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                StereoRoomCommandExecutorImpl.this.parseErrorResponse("getHandQueue", jSONObject, izsVar);
            }
        });
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutor
    public void promoteParticipant(StereoRoomCommandExecutor.PromoteParticipantParams promoteParticipantParams, gzs<s3q0> gzsVar, final izs<? super Throwable, s3q0> izsVar) {
        Signaling signaling = SignalingProviderKt.get(this.signalingProvider, izsVar);
        if (signaling == null) {
            return;
        }
        signaling.send(SignalingProtocol.createPromoteParticipant(promoteParticipantParams.getParticipantId(), promoteParticipantParams.getPromote()), new qs10(1, gzsVar), new Signaling.Listener() { // from class: xsna.e1l0
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                StereoRoomCommandExecutorImpl.this.parseErrorResponse("promoteParticipant", jSONObject, izsVar);
            }
        });
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutor
    public void requestPromotion(StereoRoomCommandExecutor.RequestPromotionParams requestPromotionParams, gzs<s3q0> gzsVar, final izs<? super Throwable, s3q0> izsVar) {
        Signaling signaling = SignalingProviderKt.get(this.signalingProvider, izsVar);
        if (signaling == null) {
            return;
        }
        signaling.send(SignalingProtocol.createRequestPromotion(requestPromotionParams.getUnrequest()), new a19(gzsVar, 1), new Signaling.Listener() { // from class: xsna.b1l0
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                StereoRoomCommandExecutorImpl.this.parseErrorResponse("requestPromotion", jSONObject, izsVar);
            }
        });
    }
}
