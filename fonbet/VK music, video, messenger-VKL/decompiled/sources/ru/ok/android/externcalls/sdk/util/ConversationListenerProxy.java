package ru.ok.android.externcalls.sdk.util;

import java.util.List;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants.Listener;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipantsUpdate;
import ru.ok.android.webrtc.Call;
import ru.ok.android.webrtc.Call.CustomDataListener;
import ru.ok.android.webrtc.Call.EventListener;
import ru.ok.android.webrtc.CallEvents;
import ru.ok.android.webrtc.listeners.CallFingerprintListener;
import ru.ok.android.webrtc.listeners.CallNetworkStatusListener;
import ru.ok.android.webrtc.listeners.CallParticipantStateListener;
import ru.ok.android.webrtc.listeners.ShouldRateCallListener;
import ru.ok.android.webrtc.participant.CallParticipant;

/* compiled from: ConversationListenerProxy.kt */
/* loaded from: classes9.dex */
public final class ConversationListenerProxy<T extends Call.EventListener & Call.CustomDataListener & CallFingerprintListener & CallNetworkStatusListener & CallParticipantStateListener & WaitingRoomParticipants.Listener & ShouldRateCallListener> implements Call.EventListener, Call.CustomDataListener, CallFingerprintListener, CallNetworkStatusListener, CallParticipantStateListener, WaitingRoomParticipants.Listener, ShouldRateCallListener {
    private boolean isLocked = true;
    private final T listener;

    public ConversationListenerProxy(T t) {
        this.listener = t;
    }

    @Override // ru.ok.android.webrtc.listeners.CallFingerprintListener
    public void onCallParticipantFingerprint(CallParticipant callParticipant, long j) {
        this.listener.onCallParticipantFingerprint(callParticipant, j);
    }

    @Override // ru.ok.android.webrtc.listeners.CallNetworkStatusListener
    public void onCallParticipantNetworkStatusChanged(List<CallParticipant> list) {
        this.listener.onCallParticipantNetworkStatusChanged(list);
    }

    @Override // ru.ok.android.webrtc.Call.CustomDataListener
    public void onCustomData(CallParticipant.ParticipantId participantId, JSONObject jSONObject) {
        this.listener.onCustomData(participantId, jSONObject);
    }

    @Override // ru.ok.android.webrtc.Call.EventListener
    public void onEvent(Call call, CallEvents callEvents, Object obj) {
        if (!this.isLocked || callEvents == CallEvents.DESTROYED) {
            this.listener.onEvent(call, callEvents, obj);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants.Listener
    public void onMeInWaitingRoomChanged(boolean z) {
        this.listener.onMeInWaitingRoomChanged(z);
    }

    @Override // ru.ok.android.webrtc.listeners.ShouldRateCallListener
    public void onRateCall(JSONObject jSONObject) {
        this.listener.onRateCall(jSONObject);
    }

    @Override // ru.ok.android.webrtc.listeners.CallParticipantStateListener
    public void onStateChanged(CallParticipant.ParticipantId participantId, CallParticipant.ParticipantState participantState) {
        this.listener.onStateChanged(participantId, participantState);
    }

    @Override // ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants.Listener
    public void onWaitingRoomParticipantsChanged(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
        this.listener.onWaitingRoomParticipantsChanged(waitingRoomParticipantsUpdate);
    }

    public final void unlock() {
        this.isLocked = false;
    }
}
