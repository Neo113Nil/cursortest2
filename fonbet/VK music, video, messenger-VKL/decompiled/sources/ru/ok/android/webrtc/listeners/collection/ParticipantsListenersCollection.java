package ru.ok.android.webrtc.listeners.collection;

import ru.ok.android.webrtc.listeners.CallParticipantsListener;

/* loaded from: classes9.dex */
public interface ParticipantsListenersCollection {
    void addParticipantsListener(CallParticipantsListener callParticipantsListener);

    void removeParticipantsListener(CallParticipantsListener callParticipantsListener);
}
