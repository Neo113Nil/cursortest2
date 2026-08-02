package ru.ok.android.externcalls.sdk.sessionroom.internal;

import java.util.List;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;
import ru.ok.android.externcalls.sdk.sessionroom.admin.AssignParticipantsToRoomsParams;
import ru.ok.android.externcalls.sdk.sessionroom.admin.MoveParticipantParams;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomCommandExecutor;
import ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManager;
import ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;
import ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipants;
import ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipantsDataProvider;
import ru.ok.android.webrtc.listeners.CallSessionRoomsListener;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.sessionroom.admin.ActivateRoomsParams;
import ru.ok.android.webrtc.sessionroom.admin.RemoveRoomsParams;
import ru.ok.android.webrtc.sessionroom.admin.SwitchRoomParams;
import ru.ok.android.webrtc.sessionroom.admin.UpdateRoomsParams;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;

/* compiled from: SessionRoomsManagerImpl.kt */
/* loaded from: classes9.dex */
public final class SessionRoomsManagerImpl implements SessionRoomsManager, CallSessionRoomsListener, SessionRoomListenerManager, SessionRoomCommandExecutor, SessionRoomAdminCommandExecutor, SessionRoomParticipantsDataProvider {
    private final SessionRoomAdminCommandExecutor adminCommandExecutor;
    private final SessionRoomCommandExecutor commandExecutor;
    private final SessionRoomListenerManagerImpl listenerManager;
    private final SessionRoomParticipantsDataProviderImpl participantDataProvider;

    public SessionRoomsManagerImpl(SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl, SessionRoomCommandExecutor sessionRoomCommandExecutor, SessionRoomAdminCommandExecutor sessionRoomAdminCommandExecutor, SessionRoomParticipantsDataProviderImpl sessionRoomParticipantsDataProviderImpl) {
        this.listenerManager = sessionRoomListenerManagerImpl;
        this.commandExecutor = sessionRoomCommandExecutor;
        this.adminCommandExecutor = sessionRoomAdminCommandExecutor;
        this.participantDataProvider = sessionRoomParticipantsDataProviderImpl;
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager, ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor
    public void activateRooms(ActivateRoomsParams activateRoomsParams, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        this.adminCommandExecutor.activateRooms(activateRoomsParams, gzsVar, izsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager, ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManager
    public void addListener(SessionRoomsManager.OwnRoomsListener ownRoomsListener) {
        this.listenerManager.addListener(ownRoomsListener);
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager, ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor
    public void assignParticipantsToRooms(AssignParticipantsToRoomsParams assignParticipantsToRoomsParams, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        this.adminCommandExecutor.assignParticipantsToRooms(assignParticipantsToRoomsParams, gzsVar, izsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipantsDataProvider
    public void getAllInRoomParticipants(izs<? super List<SessionRoomParticipants>, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2) {
        this.participantDataProvider.getAllInRoomParticipants(izsVar, izsVar2);
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager
    public SessionRoomsManager.SessionRoomInfo getOwnActiveRoom() {
        return this.listenerManager.getOwnActiveRoom();
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager
    public SessionRoomsManager.SessionRoomInfo getOwnProposedRoom() {
        return this.listenerManager.getOwnProposedRoom();
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipantsDataProvider
    public void getParticipantRoomId(ParticipantId participantId, izs<? super SessionRoomId, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2) {
        this.participantDataProvider.getParticipantRoomId(participantId, izsVar, izsVar2);
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipantsDataProvider
    public void getRoomParticipants(SessionRoomId sessionRoomId, izs<? super SessionRoomParticipants, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2) {
        this.participantDataProvider.getRoomParticipants(sessionRoomId, izsVar, izsVar2);
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager, ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomCommandExecutor
    public void joinRoom(SessionRoomId.Room room, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        this.commandExecutor.joinRoom(room, gzsVar, izsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager, ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomCommandExecutor
    public void leaveRoom(gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        this.commandExecutor.leaveRoom(gzsVar, izsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager, ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor
    public void moveParticipant(MoveParticipantParams moveParticipantParams, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        this.adminCommandExecutor.moveParticipant(moveParticipantParams, gzsVar, izsVar);
    }

    @Override // ru.ok.android.webrtc.listeners.CallSessionRoomsListener
    public void onCurrentParticipantActiveRoomChanged(CallSessionRoomsListener.ActiveRoomChangedParams activeRoomChangedParams) {
        this.listenerManager.onCurrentParticipantActiveRoomChanged(activeRoomChangedParams);
    }

    @Override // ru.ok.android.webrtc.listeners.CallSessionRoomsListener
    public void onCurrentParticipantInvitedToRoom(CallSessionRoomsListener.InvitedParams invitedParams) {
        this.listenerManager.onCurrentParticipantInvitedToRoom(invitedParams);
    }

    @Override // ru.ok.android.webrtc.listeners.CallSessionRoomsListener
    public void onRoomRemoved(CallSessionRoomsListener.RemovedParams removedParams) {
        this.listenerManager.onRoomRemoved(removedParams);
    }

    @Override // ru.ok.android.webrtc.listeners.CallSessionRoomsListener
    public void onRoomUpdated(CallSessionRoomsListener.UpdatedParams updatedParams) {
        this.listenerManager.onRoomUpdated(updatedParams);
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager, ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManager
    public void removeListener(SessionRoomsManager.OwnRoomsListener ownRoomsListener) {
        this.listenerManager.removeListener(ownRoomsListener);
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager, ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor
    public void removeRooms(RemoveRoomsParams removeRoomsParams, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        this.adminCommandExecutor.removeRooms(removeRoomsParams, gzsVar, izsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager, ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomCommandExecutor
    public void requestAttention(gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        this.commandExecutor.requestAttention(gzsVar, izsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor
    public void switchRoom(SwitchRoomParams switchRoomParams, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        this.adminCommandExecutor.switchRoom(switchRoomParams, gzsVar, izsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager, ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor
    public void updateRooms(UpdateRoomsParams updateRoomsParams, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        this.adminCommandExecutor.updateRooms(updateRoomsParams, gzsVar, izsVar);
    }
}
