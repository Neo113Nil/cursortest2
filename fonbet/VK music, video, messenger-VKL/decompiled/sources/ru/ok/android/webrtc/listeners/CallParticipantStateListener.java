package ru.ok.android.webrtc.listeners;

import ru.ok.android.webrtc.participant.CallParticipant;

/* loaded from: classes9.dex */
public interface CallParticipantStateListener {
    void onStateChanged(CallParticipant.ParticipantId participantId, CallParticipant.ParticipantState participantState);
}
