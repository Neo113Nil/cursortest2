package ru.ok.android.webrtc.listeners.proxy;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.webrtc.listeners.CallParticipantStateListener;
import ru.ok.android.webrtc.listeners.collection.ParticipantStateListenersCollection;
import ru.ok.android.webrtc.participant.CallParticipant;

/* loaded from: classes9.dex */
public final class ParticipantStateListenerProxyImpl implements ParticipantStateListenersCollection, ParticipantStateListenerProxy {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // ru.ok.android.webrtc.listeners.collection.ParticipantStateListenersCollection
    public void addParticipantStateListener(CallParticipantStateListener callParticipantStateListener) {
        this.a.add(callParticipantStateListener);
    }

    @Override // ru.ok.android.webrtc.listeners.CallParticipantStateListener
    public void onStateChanged(CallParticipant.ParticipantId participantId, CallParticipant.ParticipantState participantState) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallParticipantStateListener) it.next()).onStateChanged(participantId, participantState);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.collection.ParticipantStateListenersCollection
    public void removeParticipantStateListener(CallParticipantStateListener callParticipantStateListener) {
        this.a.remove(callParticipantStateListener);
    }
}
