package ru.ok.android.webrtc.listeners.proxy;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.webrtc.listeners.CallSessionRoomsListener;
import ru.ok.android.webrtc.listeners.collection.SessionRoomsListenersCollection;

/* loaded from: classes9.dex */
public final class SessionRoomsListenerProxyImpl implements SessionRoomsListenersCollection, SessionRoomsListenerProxy {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // ru.ok.android.webrtc.listeners.collection.SessionRoomsListenersCollection
    public void addSessionRoomListener(CallSessionRoomsListener callSessionRoomsListener) {
        this.a.add(callSessionRoomsListener);
    }

    @Override // ru.ok.android.webrtc.listeners.CallSessionRoomsListener
    public void onCurrentParticipantActiveRoomChanged(CallSessionRoomsListener.ActiveRoomChangedParams activeRoomChangedParams) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallSessionRoomsListener) it.next()).onCurrentParticipantActiveRoomChanged(activeRoomChangedParams);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.CallSessionRoomsListener
    public void onCurrentParticipantInvitedToRoom(CallSessionRoomsListener.InvitedParams invitedParams) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallSessionRoomsListener) it.next()).onCurrentParticipantInvitedToRoom(invitedParams);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.CallSessionRoomsListener
    public void onRoomRemoved(CallSessionRoomsListener.RemovedParams removedParams) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallSessionRoomsListener) it.next()).onRoomRemoved(removedParams);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.CallSessionRoomsListener
    public void onRoomUpdated(CallSessionRoomsListener.UpdatedParams updatedParams) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallSessionRoomsListener) it.next()).onRoomUpdated(updatedParams);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.collection.SessionRoomsListenersCollection
    public void removeSessionRoomListener(CallSessionRoomsListener callSessionRoomsListener) {
        this.a.remove(callSessionRoomsListener);
    }
}
