package ru.ok.android.webrtc.sessionroom;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import ru.ok.android.webrtc.listeners.CallSessionRoomsListener;
import ru.ok.android.webrtc.listeners.proxy.CallListenersProxy;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.sessionroom.update.CallSessionRoomAddOrUpdateParams;
import ru.ok.android.webrtc.update.ParameterUpdate;
import xsna.j5g;

/* loaded from: classes9.dex */
public final class CallSessionRooms {
    public final CallListenersProxy a;
    public final HashMap b = new HashMap();

    public CallSessionRooms(CallListenersProxy callListenersProxy) {
        this.a = callListenersProxy;
    }

    public final CallSessionRoom addOrUpdate(CallSessionRoomAddOrUpdateParams callSessionRoomAddOrUpdateParams) {
        CallSessionRoom callSessionRoom;
        String str;
        Iterable iterable;
        CallSessionRoom callSessionRoom2 = (CallSessionRoom) this.b.get(callSessionRoomAddOrUpdateParams.getId());
        if (callSessionRoom2 == null && callSessionRoomAddOrUpdateParams.isImplicitUpdate()) {
            callSessionRoom = null;
        } else {
            SessionRoomId.Room id = callSessionRoomAddOrUpdateParams.getId();
            ParameterUpdate<String> name = callSessionRoomAddOrUpdateParams.getName();
            if (callSessionRoom2 == null || (str = callSessionRoom2.getName()) == null) {
                str = "";
            }
            if (name.hasUpdate()) {
                str = name.requireValue();
            }
            String str2 = str;
            ParameterUpdate<Boolean> isActive = callSessionRoomAddOrUpdateParams.isActive();
            Boolean valueOf = Boolean.valueOf(callSessionRoom2 != null ? callSessionRoom2.isActive() : false);
            if (isActive.hasUpdate()) {
                valueOf = isActive.requireValue();
            }
            boolean booleanValue = valueOf.booleanValue();
            List<CallParticipant.ParticipantId> participantIds = callSessionRoom2 != null ? callSessionRoom2.getParticipantIds() : null;
            List<CallParticipant.ParticipantId> valueOrNull = callSessionRoomAddOrUpdateParams.getParticipantIds().getValueOrNull();
            List<CallParticipant.ParticipantId> valueOrNull2 = callSessionRoomAddOrUpdateParams.getAddParticipantIds().getValueOrNull();
            List<CallParticipant.ParticipantId> valueOrNull3 = callSessionRoomAddOrUpdateParams.getRemoveParticipantIds().getValueOrNull();
            if (valueOrNull == null) {
                if (valueOrNull3 == null || (iterable = j5g.S0(valueOrNull3)) == null) {
                    iterable = EmptySet.b;
                }
                if (valueOrNull2 == null) {
                    valueOrNull2 = EmptyList.b;
                }
                valueOrNull = participantIds != null ? j5g.u0(valueOrNull2, j5g.t0(participantIds, iterable)) : j5g.t0(valueOrNull2, iterable);
            }
            List<CallParticipant.ParticipantId> list = valueOrNull;
            ParameterUpdate<Integer> participantCount = callSessionRoomAddOrUpdateParams.getParticipantCount();
            Integer valueOf2 = Integer.valueOf(callSessionRoom2 != null ? callSessionRoom2.getParticipantCount() : 0);
            if (participantCount.hasUpdate()) {
                valueOf2 = participantCount.requireValue();
            }
            int intValue = valueOf2.intValue();
            ParameterUpdate<CallParticipant.ParticipantId> pinnedParticipantId = callSessionRoomAddOrUpdateParams.getPinnedParticipantId();
            CallParticipant.ParticipantId pinnedParticipantId2 = callSessionRoom2 != null ? callSessionRoom2.getPinnedParticipantId() : null;
            if (pinnedParticipantId.hasUpdate()) {
                pinnedParticipantId2 = pinnedParticipantId.requireValue();
            }
            CallParticipant.ParticipantId participantId = pinnedParticipantId2;
            ParameterUpdate<Long> timeoutMs = callSessionRoomAddOrUpdateParams.getTimeoutMs();
            Long timeoutMs2 = callSessionRoom2 != null ? callSessionRoom2.getTimeoutMs() : null;
            if (timeoutMs.hasUpdate()) {
                timeoutMs2 = timeoutMs.requireValue();
            }
            callSessionRoom = new CallSessionRoom(id, str2, booleanValue, list, intValue, participantId, timeoutMs2);
            this.b.put(callSessionRoom.getId(), callSessionRoom);
        }
        if (callSessionRoom == null) {
            return null;
        }
        this.a.getSessionRoomsListenerProxy().onRoomUpdated(new CallSessionRoomsListener.UpdatedParams(callSessionRoom.getId(), CallSessionRoomKt.toSessionRoom(callSessionRoom)));
        return callSessionRoom;
    }

    public final void clear() {
        List O0 = j5g.O0(this.b.keySet());
        this.b.clear();
        Iterator it = O0.iterator();
        while (it.hasNext()) {
            this.a.getSessionRoomsListenerProxy().onRoomRemoved(new CallSessionRoomsListener.RemovedParams((SessionRoomId.Room) it.next()));
        }
    }

    public final SessionRoom getSessionRoom(SessionRoomId.Room room) {
        CallSessionRoom callSessionRoom = (CallSessionRoom) this.b.get(room);
        if (callSessionRoom != null) {
            return CallSessionRoomKt.toSessionRoom(callSessionRoom);
        }
        return null;
    }

    public final Set<SessionRoomId.Room> getSessionRoomIds() {
        return j5g.S0(this.b.keySet());
    }

    public final void remove(SessionRoomId.Room room) {
        this.b.remove(room);
        this.a.getSessionRoomsListenerProxy().onRoomRemoved(new CallSessionRoomsListener.RemovedParams(room));
    }
}
