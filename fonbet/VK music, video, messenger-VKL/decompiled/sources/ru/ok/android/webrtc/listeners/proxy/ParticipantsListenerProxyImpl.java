package ru.ok.android.webrtc.listeners.proxy;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.webrtc.listeners.CallParticipantsListener;
import ru.ok.android.webrtc.listeners.collection.ParticipantsListenersCollection;

/* loaded from: classes9.dex */
public final class ParticipantsListenerProxyImpl implements ParticipantsListenersCollection, ParticipantsListenerProxy {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // ru.ok.android.webrtc.listeners.collection.ParticipantsListenersCollection
    public void addParticipantsListener(CallParticipantsListener callParticipantsListener) {
        this.a.add(callParticipantsListener);
    }

    @Override // ru.ok.android.webrtc.listeners.CallParticipantsListener
    public void onCallParticipantsAdded(CallParticipantsListener.AddedParams addedParams) {
        if (addedParams.getAddedParticipants().isEmpty()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallParticipantsListener) it.next()).onCallParticipantsAdded(addedParams);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.CallParticipantsListener
    public void onCallParticipantsChanged(CallParticipantsListener.ChangedParams changedParams) {
        if (changedParams.getChangedParticipants().isEmpty()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallParticipantsListener) it.next()).onCallParticipantsChanged(changedParams);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.CallParticipantsListener
    public void onCallParticipantsDeAnonimized(CallParticipantsListener.DeAnonParams deAnonParams) {
        if (deAnonParams.getChangedParticipants().isEmpty()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallParticipantsListener) it.next()).onCallParticipantsDeAnonimized(deAnonParams);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.CallParticipantsListener
    public void onCallParticipantsRemoved(CallParticipantsListener.RemovedParams removedParams) {
        if (removedParams.getRemovedParticipants().isEmpty()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallParticipantsListener) it.next()).onCallParticipantsRemoved(removedParams);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.collection.ParticipantsListenersCollection
    public void removeParticipantsListener(CallParticipantsListener callParticipantsListener) {
        this.a.remove(callParticipantsListener);
    }
}
