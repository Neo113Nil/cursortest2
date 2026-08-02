package ru.ok.android.externcalls.sdk.sessionroom.internal.listener;

import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;
import ru.ok.android.webrtc.listeners.CallSessionRoomsListener;
import ru.ok.android.webrtc.sessionroom.SessionRoom;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.fwq;
import xsna.qye;
import xsna.wq8;
import xsna.xq8;
import xsna.zs6;

/* compiled from: SessionRoomListenerManagerImpl.kt */
/* loaded from: classes9.dex */
public final class SessionRoomListenerManagerImpl implements SessionRoomListenerManager, CallSessionRoomsListener {
    private final ParticipantStore store;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArraySet<SessionRoomsManager.OwnRoomsListener> listeners = new CopyOnWriteArraySet<>();

    public SessionRoomListenerManagerImpl(ParticipantStore participantStore) {
        this.store = participantStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCurrentParticipantActiveRoomChanged$lambda$0(SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl, CallSessionRoomsListener.ActiveRoomChangedParams activeRoomChangedParams) {
        Iterator<T> it = sessionRoomListenerManagerImpl.listeners.iterator();
        while (it.hasNext()) {
            ((SessionRoomsManager.OwnRoomsListener) it.next()).onActiveRoomChanged(new SessionRoomsManager.SessionRoomInfo(activeRoomChangedParams.getRoomId(), activeRoomChangedParams.getRoom()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCurrentParticipantInvitedToRoom$lambda$0(SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl, CallSessionRoomsListener.InvitedParams invitedParams) {
        Iterator<T> it = sessionRoomListenerManagerImpl.listeners.iterator();
        while (it.hasNext()) {
            ((SessionRoomsManager.OwnRoomsListener) it.next()).onProposedRoomChanged(new SessionRoomsManager.SessionRoomInfo(invitedParams.getRoomId(), invitedParams.getRoom()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRoomRemoved$lambda$0(SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl, CallSessionRoomsListener.RemovedParams removedParams) {
        Iterator<T> it = sessionRoomListenerManagerImpl.listeners.iterator();
        while (it.hasNext()) {
            ((SessionRoomsManager.OwnRoomsListener) it.next()).onRoomRemoved(new SessionRoomsManager.SessionRoomInfo(removedParams.getRoomId(), null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRoomUpdated$lambda$0(SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl, CallSessionRoomsListener.UpdatedParams updatedParams) {
        Iterator<T> it = sessionRoomListenerManagerImpl.listeners.iterator();
        while (it.hasNext()) {
            ((SessionRoomsManager.OwnRoomsListener) it.next()).onRoomUpdated(new SessionRoomsManager.SessionRoomInfo(updatedParams.getRoomId(), updatedParams.getRoom()));
        }
    }

    private final void sendActualState(SessionRoomsManager.OwnRoomsListener ownRoomsListener) {
        this.mainHandler.post(new qye(13, this, ownRoomsListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendActualState$lambda$0(SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl, SessionRoomsManager.OwnRoomsListener ownRoomsListener) {
        if (sessionRoomListenerManagerImpl.listeners.contains(ownRoomsListener)) {
            SessionRoom proposedRoom = sessionRoomListenerManagerImpl.store.getProposedRoom();
            if (proposedRoom != null) {
                ownRoomsListener.onProposedRoomChanged(new SessionRoomsManager.SessionRoomInfo(proposedRoom.getId(), proposedRoom));
            }
            SessionRoom activeRoom = sessionRoomListenerManagerImpl.store.getActiveRoom();
            if (activeRoom != null) {
                ownRoomsListener.onActiveRoomChanged(new SessionRoomsManager.SessionRoomInfo(activeRoom.getId(), activeRoom));
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManager
    public void addListener(SessionRoomsManager.OwnRoomsListener ownRoomsListener) {
        this.listeners.add(ownRoomsListener);
        sendActualState(ownRoomsListener);
    }

    public final SessionRoomsManager.SessionRoomInfo getOwnActiveRoom() {
        SessionRoom activeRoom = this.store.getActiveRoom();
        return activeRoom != null ? new SessionRoomsManager.SessionRoomInfo(activeRoom.getId(), activeRoom) : new SessionRoomsManager.SessionRoomInfo(SessionRoomId.MainCall.INSTANCE, null);
    }

    public final SessionRoomsManager.SessionRoomInfo getOwnProposedRoom() {
        SessionRoom proposedRoom = this.store.getProposedRoom();
        return proposedRoom != null ? new SessionRoomsManager.SessionRoomInfo(proposedRoom.getId(), proposedRoom) : new SessionRoomsManager.SessionRoomInfo(SessionRoomId.MainCall.INSTANCE, null);
    }

    @Override // ru.ok.android.webrtc.listeners.CallSessionRoomsListener
    public void onCurrentParticipantActiveRoomChanged(CallSessionRoomsListener.ActiveRoomChangedParams activeRoomChangedParams) {
        this.mainHandler.post(new fwq(4, this, activeRoomChangedParams));
    }

    @Override // ru.ok.android.webrtc.listeners.CallSessionRoomsListener
    public void onCurrentParticipantInvitedToRoom(CallSessionRoomsListener.InvitedParams invitedParams) {
        this.mainHandler.post(new zs6(5, this, invitedParams));
    }

    @Override // ru.ok.android.webrtc.listeners.CallSessionRoomsListener
    public void onRoomRemoved(CallSessionRoomsListener.RemovedParams removedParams) {
        this.mainHandler.post(new xq8(7, this, removedParams));
    }

    @Override // ru.ok.android.webrtc.listeners.CallSessionRoomsListener
    public void onRoomUpdated(CallSessionRoomsListener.UpdatedParams updatedParams) {
        this.mainHandler.post(new wq8(5, this, updatedParams));
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManager
    public void removeListener(SessionRoomsManager.OwnRoomsListener ownRoomsListener) {
        this.listeners.remove(ownRoomsListener);
    }
}
