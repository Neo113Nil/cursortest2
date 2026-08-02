package ru.ok.android.externcalls.sdk.participant.state.internal;

import java.util.Map;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: ParticipantStateChanger.kt */
/* loaded from: classes9.dex */
public final class ParticipantStateChanger {
    private final SignalingProvider signalingProvider;

    public ParticipantStateChanger(SignalingProvider signalingProvider) {
        this.signalingProvider = signalingProvider;
    }

    public static /* synthetic */ void changeMyState$default(ParticipantStateChanger participantStateChanger, Map map, Signaling.Listener listener, Signaling.Listener listener2, int i, Object obj) {
        if ((i & 4) != 0) {
            listener2 = null;
        }
        participantStateChanger.changeMyState(map, listener, listener2);
    }

    public static /* synthetic */ void changeParticipantState$default(ParticipantStateChanger participantStateChanger, CallParticipant.ParticipantId participantId, Map map, Signaling.Listener listener, Signaling.Listener listener2, int i, Object obj) {
        if ((i & 8) != 0) {
            listener2 = null;
        }
        participantStateChanger.changeParticipantState(participantId, map, listener, listener2);
    }

    public static /* synthetic */ void lowerHandForAll$default(ParticipantStateChanger participantStateChanger, Signaling.Listener listener, Signaling.Listener listener2, int i, Object obj) {
        if ((i & 2) != 0) {
            listener2 = null;
        }
        participantStateChanger.lowerHandForAll(listener, listener2);
    }

    public final void changeMyState(Map<String, String> map, Signaling.Listener listener) {
        changeMyState$default(this, map, listener, null, 4, null);
    }

    public final void changeParticipantState(CallParticipant.ParticipantId participantId, Map<String, String> map, Signaling.Listener listener) {
        changeParticipantState$default(this, participantId, map, listener, null, 8, null);
    }

    public final void lowerHandForAll(Signaling.Listener listener, Signaling.Listener listener2) {
        Signaling signaling = this.signalingProvider.getSignaling();
        if (signaling == null) {
            return;
        }
        signaling.send(SignalingProtocol.createPutHandsDown(), listener, listener2);
    }

    public final void changeMyState(Map<String, String> map, Signaling.Listener listener, Signaling.Listener listener2) {
        Signaling signaling = this.signalingProvider.getSignaling();
        if (signaling == null) {
            return;
        }
        signaling.send(SignalingProtocol.createChangeParticipantState(map, null), listener, listener2);
    }

    public final void changeParticipantState(CallParticipant.ParticipantId participantId, Map<String, String> map, Signaling.Listener listener, Signaling.Listener listener2) {
        Signaling signaling = this.signalingProvider.getSignaling();
        if (signaling == null) {
            return;
        }
        signaling.send(SignalingProtocol.createChangeParticipantState(map, participantId), listener, listener2);
    }
}
