package ru.ok.android.webrtc.sessionroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import okcalls.d0;
import okcalls.e0;
import okcalls.f0;
import org.json.JSONObject;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.listeners.CallSessionRoomAsrRecordListener;
import ru.ok.android.webrtc.listeners.CallSessionRoomRecordInfoListener;
import ru.ok.android.webrtc.listeners.CallSessionRoomsListener;
import ru.ok.android.webrtc.listeners.CallUrlSharingListener;
import ru.ok.android.webrtc.listeners.proxy.CallListenersProxy;
import ru.ok.android.webrtc.media_options.internal.CallMediaOptionsDelegate;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.participant.CallParticipants;
import ru.ok.android.webrtc.participant.update.ParticipantAddOrUpdateParamsList;
import ru.ok.android.webrtc.sessionroom.GetRoomsCommand;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.sessionroom.update.CallSessionRoomAddOrUpdateParams;
import ru.ok.android.webrtc.signaling.participant.GetParticipantListChunkCommand;
import ru.ok.android.webrtc.signaling.participant.model.ParticipantListType;
import ru.ok.android.webrtc.signaling.participant.model.SignalingParticipantListChunk;
import ru.ok.android.webrtc.signaling.sessionroom.event.SessionRoomParticipantsUpdate;
import ru.ok.android.webrtc.signaling.sessionroom.event.SessionRoomUpdatedEvent;
import ru.ok.android.webrtc.signaling.sessionroom.event.SessionRoomsEventType;
import ru.ok.android.webrtc.signaling.sessionroom.event.SessionRoomsUpdatedEvent;
import ru.ok.android.webrtc.signaling.sessionroom.event.SignalingSessionRoom;
import ru.ok.android.webrtc.signaling.sessionroom.event.SignalingSessionRooms;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.c5g;
import xsna.d50;
import xsna.epx;
import xsna.j5g;
import xsna.s3q0;

/* loaded from: classes9.dex */
public final class CallSessionRoomsManager {
    public final RTCLog a;
    public final CallParticipants b;
    public final CallSessionRooms c;
    public final CallMediaOptionsDelegate d;
    public final CallListenersProxy e;
    public final GetParticipantListChunkCommand f;
    public final GetRoomsCommand g;
    public final TimeProvider h;

    public CallSessionRoomsManager(RTCLog rTCLog, CallParticipants callParticipants, CallSessionRooms callSessionRooms, CallMediaOptionsDelegate callMediaOptionsDelegate, CallListenersProxy callListenersProxy, GetParticipantListChunkCommand getParticipantListChunkCommand, GetRoomsCommand getRoomsCommand, TimeProvider timeProvider) {
        this.a = rTCLog;
        this.b = callParticipants;
        this.c = callSessionRooms;
        this.d = callMediaOptionsDelegate;
        this.e = callListenersProxy;
        this.f = getParticipantListChunkCommand;
        this.g = getRoomsCommand;
        this.h = timeProvider;
    }

    public final void a(SignalingSessionRoom signalingSessionRoom) {
        CallSessionRooms callSessionRooms = this.c;
        CallSessionRoomAddOrUpdateParams.Builder name = new CallSessionRoomAddOrUpdateParams.Builder(new SessionRoomId.Room(signalingSessionRoom.getId())).setName(signalingSessionRoom.getName());
        Boolean isActive = signalingSessionRoom.isActive();
        if (isActive != null) {
            name.setActive(isActive.booleanValue());
        }
        List<CallParticipant.ParticipantId> participantIds = signalingSessionRoom.getParticipantIds();
        if (participantIds != null) {
            name.setParticipantIds(participantIds);
        }
        List<CallParticipant.ParticipantId> addParticipantIds = signalingSessionRoom.getAddParticipantIds();
        if (addParticipantIds != null) {
            name.setAddParticipantIds(addParticipantIds);
        }
        List<CallParticipant.ParticipantId> removeParticipantIds = signalingSessionRoom.getRemoveParticipantIds();
        if (removeParticipantIds != null) {
            name.setRemoveParticipantIds(removeParticipantIds);
        }
        Integer participantCount = signalingSessionRoom.getParticipantCount();
        if (participantCount != null) {
            name.setParticipantCount(participantCount.intValue());
        }
        Long timeoutMs = signalingSessionRoom.getTimeoutMs();
        Long mapToLocalTimeMs = timeoutMs != null ? this.h.mapToLocalTimeMs(timeoutMs.longValue()) : null;
        if (mapToLocalTimeMs != null) {
            name.setTimeoutMs(Long.valueOf(mapToLocalTimeMs.longValue()));
        }
        name.setPinnedParticipantId(signalingSessionRoom.getPinnedParticipantId());
        CallSessionRoom addOrUpdate = callSessionRooms.addOrUpdate(name.build());
        if (addOrUpdate == null) {
            return;
        }
        List<CallParticipant.ParticipantId> participantIds2 = addOrUpdate.getParticipantIds();
        if (participantIds2 != null && j5g.P(participantIds2, this.b.getCurrentUserParticipant().getParticipantId())) {
            this.b.setProposedRoomId(addOrUpdate.getId());
        } else if (epx.f(addOrUpdate.getId(), this.b.getProposedRoomId())) {
            this.b.setProposedRoomId(SessionRoomId.MainCall.INSTANCE);
        }
        SignalingParticipantListChunk participants = signalingSessionRoom.getParticipants();
        if (participants != null) {
            SessionRoomId.Room id = addOrUpdate.getId();
            if (this.b.getCurrentUserParticipant().isAdminOrCreator() || epx.f(this.b.getActiveRoomId(), id)) {
                this.b.addOrUpdateBatch(participants.getParticipants().getParticipants(), id);
                for (CallParticipant.ParticipantState participantState : participants.getParticipants().getParticipantStates()) {
                    this.e.getParticipantStateListenerProxy().onStateChanged(participantState.participantId, participantState);
                }
            }
        }
        this.e.getSessionRoomsListenerProxy().onRoomUpdated(new CallSessionRoomsListener.UpdatedParams(addOrUpdate.getId(), CallSessionRoomKt.toSessionRoom(addOrUpdate)));
    }

    public final void handlePinParticipant(boolean z, CallParticipant.ParticipantId participantId, SessionRoomId.Room room) {
        CallSessionRooms callSessionRooms = this.c;
        CallSessionRoomAddOrUpdateParams.Builder builder = new CallSessionRoomAddOrUpdateParams.Builder(room);
        if (z) {
            participantId = null;
        }
        callSessionRooms.addOrUpdate(builder.setPinnedParticipantId(participantId).setIsImplicitUpdate(true).build());
    }

    public final void onIsMeAdminMayHaveChanged(boolean z) {
        if (z) {
            this.g.requestRooms(new GetRoomsCommand.Params(false), new e0(this), new f0(this));
        }
    }

    public final void onRoomUpdated(SessionRoomUpdatedEvent sessionRoomUpdatedEvent) {
        SignalingSessionRoom room;
        if (sessionRoomUpdatedEvent.getEvents().contains(SessionRoomsEventType.UPDATE) && (room = sessionRoomUpdatedEvent.getRoom()) != null) {
            a(room);
        }
        if (sessionRoomUpdatedEvent.getEvents().contains(SessionRoomsEventType.ACTIVATE)) {
            CallSessionRooms callSessionRooms = this.c;
            CallSessionRoomAddOrUpdateParams.Builder active = new CallSessionRoomAddOrUpdateParams.Builder(new SessionRoomId.Room(sessionRoomUpdatedEvent.getRoomId())).setActive(!sessionRoomUpdatedEvent.getDeactivate());
            SignalingSessionRoom room2 = sessionRoomUpdatedEvent.getRoom();
            Long timeoutMs = room2 != null ? room2.getTimeoutMs() : null;
            callSessionRooms.addOrUpdate(active.setTimeoutMs(timeoutMs != null ? this.h.mapToLocalTimeMs(timeoutMs.longValue()) : null).build());
        }
        sessionRoomUpdatedEvent.getEvents().contains(SessionRoomsEventType.TIMEOUT);
        if (sessionRoomUpdatedEvent.getEvents().contains(SessionRoomsEventType.REMOVE)) {
            SessionRoomId.Room room3 = new SessionRoomId.Room(sessionRoomUpdatedEvent.getRoomId());
            if (epx.f(this.b.getProposedRoomId(), room3)) {
                this.b.setProposedRoomId(SessionRoomId.MainCall.INSTANCE);
            }
            this.c.remove(room3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onRoomsParticipantsUpdated(SessionRoomParticipantsUpdate sessionRoomParticipantsUpdate) {
        SessionRoom sessionRoom;
        CallParticipant.ParticipantId pinnedParticipantId;
        boolean P = j5g.P(sessionRoomParticipantsUpdate.getAddedParticipantIds(), this.b.getCurrentUserParticipant().getParticipantId());
        this.b.removeBatch(sessionRoomParticipantsUpdate.getRemovedParticipantIds(), sessionRoomParticipantsUpdate.getRoomId());
        ParticipantAddOrUpdateParamsList addedParticipants = sessionRoomParticipantsUpdate.getAddedParticipants();
        if (addedParticipants != null) {
            this.b.addOrUpdateBatch(addedParticipants.getParticipants(), sessionRoomParticipantsUpdate.getRoomId());
            for (CallParticipant.ParticipantState participantState : addedParticipants.getParticipantStates()) {
                this.e.getParticipantStateListenerProxy().onStateChanged(participantState.participantId, participantState);
            }
        }
        if (sessionRoomParticipantsUpdate.getRoomId() instanceof SessionRoomId.Room) {
            this.c.addOrUpdate(new CallSessionRoomAddOrUpdateParams.Builder((SessionRoomId.Room) sessionRoomParticipantsUpdate.getRoomId()).setParticipantCount(sessionRoomParticipantsUpdate.getParticipantsCount()).setIsImplicitUpdate(true).build());
        }
        if (P) {
            SessionRoomId roomId = sessionRoomParticipantsUpdate.getRoomId();
            if (!epx.f(roomId, this.b.getActiveRoomId())) {
                if (!epx.f(this.b.getActiveRoomId(), roomId)) {
                    this.b.setActiveRoomId(roomId);
                    this.e.getSessionRoomsListenerProxy().onCurrentParticipantActiveRoomChanged(new CallSessionRoomsListener.ActiveRoomChangedParams(roomId, roomId instanceof SessionRoomId.Room ? this.c.getSessionRoom((SessionRoomId.Room) roomId) : null));
                }
                if (!this.b.getCurrentUserParticipant().isAdminOrCreator()) {
                    this.g.requestRooms(new GetRoomsCommand.Params(false), new e0(this), new f0(this));
                    int size = this.b.getActiveSessionRoomParticipantIds().size() + 1;
                    if (epx.f(sessionRoomParticipantsUpdate.getRoomId(), this.b.getActiveRoomId()) && sessionRoomParticipantsUpdate.getParticipantsCount() != size && !sessionRoomParticipantsUpdate.getAddedParticipantIds().isEmpty()) {
                        a(sessionRoomParticipantsUpdate.getRoomId());
                    }
                    if (sessionRoomParticipantsUpdate.getRoomId() instanceof SessionRoomId.Room) {
                        return;
                    }
                    this.c.addOrUpdate(new CallSessionRoomAddOrUpdateParams.Builder((SessionRoomId.Room) sessionRoomParticipantsUpdate.getRoomId()).setParticipantCount(sessionRoomParticipantsUpdate.getParticipantsCount()).setIsImplicitUpdate(true).build());
                    return;
                }
            }
        }
        if ((sessionRoomParticipantsUpdate.getRoomId() instanceof SessionRoomId.Room) && (sessionRoom = this.c.getSessionRoom((SessionRoomId.Room) sessionRoomParticipantsUpdate.getRoomId())) != null && (pinnedParticipantId = sessionRoom.getPinnedParticipantId()) != null && !this.b.getActiveSessionRoomParticipantIds().contains(pinnedParticipantId)) {
            this.g.requestRooms(new GetRoomsCommand.Params(false), new e0(this), new f0(this));
        }
        int size2 = this.b.getActiveSessionRoomParticipantIds().size() + 1;
        if (epx.f(sessionRoomParticipantsUpdate.getRoomId(), this.b.getActiveRoomId())) {
            a(sessionRoomParticipantsUpdate.getRoomId());
        }
        if (sessionRoomParticipantsUpdate.getRoomId() instanceof SessionRoomId.Room) {
        }
    }

    public final void onRoomsState(SignalingSessionRooms signalingSessionRooms) {
        List<SignalingSessionRoom> rooms = signalingSessionRooms.getRooms();
        ArrayList arrayList = new ArrayList(c5g.u(rooms, 10));
        Iterator<T> it = rooms.iterator();
        while (it.hasNext()) {
            arrayList.add(new SessionRoomId.Room(((SignalingSessionRoom) it.next()).getId()));
        }
        Set S0 = j5g.S0(arrayList);
        for (SessionRoomId.Room room : this.c.getSessionRoomIds()) {
            if (!S0.contains(room)) {
                this.c.remove(room);
            }
        }
        Iterator<T> it2 = signalingSessionRooms.getRooms().iterator();
        while (it2.hasNext()) {
            a((SignalingSessionRoom) it2.next());
        }
        for (SignalingSessionRoom signalingSessionRoom : signalingSessionRooms.getRooms()) {
            this.e.getSessionRoomRecordInfoProxy().onSessionRoomRecordInfo(new CallSessionRoomRecordInfoListener.SessionRoomRecordInfoState(signalingSessionRoom.getRecordInfo(), new SessionRoomId.Room(signalingSessionRoom.getId())));
        }
        for (SignalingSessionRoom signalingSessionRoom2 : signalingSessionRooms.getRooms()) {
            this.e.getUrlSharingListenerProxy().onUrlSharingInfoUpdated(new CallUrlSharingListener.UrlSharingState(new SessionRoomId.Room(signalingSessionRoom2.getId()), signalingSessionRoom2.getUrlSharingInfo()));
        }
        for (SignalingSessionRoom signalingSessionRoom3 : signalingSessionRooms.getRooms()) {
            this.e.getSessionRoomAsrRecordInfoProxy().onSessionRoomAsrRecordInfo(new CallSessionRoomAsrRecordListener.SessionRoomAsrRecordState(signalingSessionRoom3.getAsrRecordInfo(), new SessionRoomId.Room(signalingSessionRoom3.getId())));
        }
        for (SignalingSessionRoom signalingSessionRoom4 : signalingSessionRooms.getRooms()) {
            this.d.setupMediaOptionStatesForCall(signalingSessionRoom4.getMuteStates(), new JSONObject(), "CallSessionRoomsManager#applyMuteStates", CallMediaOptionsDelegate.CallMediaOptionsAcceptPolicy.DEFAULT_TO_CALL_OPTIONS, new SessionRoomId.Room(signalingSessionRoom4.getId()), true);
        }
        if (signalingSessionRooms.getRoomId() instanceof SessionRoomId.MainCall) {
            return;
        }
        SessionRoomId roomId = signalingSessionRooms.getRoomId();
        if (!epx.f(this.b.getActiveRoomId(), roomId)) {
            this.b.setActiveRoomId(roomId);
            this.e.getSessionRoomsListenerProxy().onCurrentParticipantActiveRoomChanged(new CallSessionRoomsListener.ActiveRoomChangedParams(roomId, roomId instanceof SessionRoomId.Room ? this.c.getSessionRoom((SessionRoomId.Room) roomId) : null));
        }
        a(signalingSessionRooms.getRoomId());
    }

    public final void onRoomsUpdated(SessionRoomsUpdatedEvent sessionRoomsUpdatedEvent) {
        Iterator<T> it = sessionRoomsUpdatedEvent.getUpdates().iterator();
        while (it.hasNext()) {
            onRoomUpdated((SessionRoomUpdatedEvent) it.next());
        }
    }

    public final void a(SessionRoomId sessionRoomId) {
        this.f.requestChunk(new GetParticipantListChunkCommand.Params(ParticipantListType.GRID, 0, sessionRoomId), new d50(3, this, sessionRoomId), new d0(1, this, CallSessionRoomsManager.class, "onAllParticipantsLoadError", "onAllParticipantsLoadError(Ljava/lang/Throwable;)V", 0));
    }

    public static final s3q0 a(CallSessionRoomsManager callSessionRoomsManager, SessionRoomId sessionRoomId, SignalingParticipantListChunk signalingParticipantListChunk) {
        if (callSessionRoomsManager.b.getCurrentUserParticipant().isAdminOrCreator() || epx.f(callSessionRoomsManager.b.getActiveRoomId(), sessionRoomId)) {
            callSessionRoomsManager.b.addOrUpdateBatch(signalingParticipantListChunk.getParticipants().getParticipants(), sessionRoomId);
            for (CallParticipant.ParticipantState participantState : signalingParticipantListChunk.getParticipants().getParticipantStates()) {
                callSessionRoomsManager.e.getParticipantStateListenerProxy().onStateChanged(participantState.participantId, participantState);
            }
        }
        return s3q0.a;
    }
}
