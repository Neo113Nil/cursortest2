package ru.ok.android.webrtc.listeners.collection;

import ru.ok.android.webrtc.listeners.CallParticipantStateListener;

/* loaded from: classes9.dex */
public interface ParticipantStateListenersCollection {
    void addParticipantStateListener(CallParticipantStateListener callParticipantStateListener);

    void removeParticipantStateListener(CallParticipantStateListener callParticipantStateListener);
}
