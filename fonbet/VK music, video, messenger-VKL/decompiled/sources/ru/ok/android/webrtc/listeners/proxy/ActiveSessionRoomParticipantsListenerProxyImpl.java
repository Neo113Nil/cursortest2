package ru.ok.android.webrtc.listeners.proxy;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.webrtc.listeners.CallActiveSessionRoomParticipantsListener;
import ru.ok.android.webrtc.listeners.collection.ActiveSessionRoomParticipantsListenersCollection;

/* loaded from: classes9.dex */
public final class ActiveSessionRoomParticipantsListenerProxyImpl implements ActiveSessionRoomParticipantsListenersCollection, ActiveSessionRoomParticipantsListenerProxy {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // ru.ok.android.webrtc.listeners.collection.ActiveSessionRoomParticipantsListenersCollection
    public void addActiveSessionRoomParticipantsListener(CallActiveSessionRoomParticipantsListener callActiveSessionRoomParticipantsListener) {
        this.a.add(callActiveSessionRoomParticipantsListener);
    }

    @Override // ru.ok.android.webrtc.listeners.CallActiveSessionRoomParticipantsListener
    public void onActiveParticipantUpdated(CallActiveSessionRoomParticipantsListener.UpdatedParams updatedParams) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallActiveSessionRoomParticipantsListener) it.next()).onActiveParticipantUpdated(updatedParams);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.CallActiveSessionRoomParticipantsListener
    public void onActiveParticipantsAdded(CallActiveSessionRoomParticipantsListener.AddedParams addedParams) {
        if (addedParams.getAddedParticipants().isEmpty()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallActiveSessionRoomParticipantsListener) it.next()).onActiveParticipantsAdded(addedParams);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.CallActiveSessionRoomParticipantsListener
    public void onActiveParticipantsChanged(CallActiveSessionRoomParticipantsListener.ChangedParams changedParams) {
        if (changedParams.getChangedParticipants().isEmpty()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallActiveSessionRoomParticipantsListener) it.next()).onActiveParticipantsChanged(changedParams);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.CallActiveSessionRoomParticipantsListener
    public void onActiveParticipantsDeAnonimized(CallActiveSessionRoomParticipantsListener.DeAnonParams deAnonParams) {
        if (deAnonParams.getDeAnonParticipants().isEmpty()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallActiveSessionRoomParticipantsListener) it.next()).onActiveParticipantsDeAnonimized(deAnonParams);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.CallActiveSessionRoomParticipantsListener
    public void onActiveParticipantsRemoved(CallActiveSessionRoomParticipantsListener.RemovedParams removedParams) {
        if (removedParams.getRemovedParticipants().isEmpty()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallActiveSessionRoomParticipantsListener) it.next()).onActiveParticipantsRemoved(removedParams);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.collection.ActiveSessionRoomParticipantsListenersCollection
    public void removeActiveSessionRoomParticipantsListener(CallActiveSessionRoomParticipantsListener callActiveSessionRoomParticipantsListener) {
        this.a.remove(callActiveSessionRoomParticipantsListener);
    }
}
