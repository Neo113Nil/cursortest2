package ru.ok.android.externcalls.sdk.sessionroom.admin;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.pn00;
import xsna.zcl;

/* compiled from: AssignParticipantsToRoomsParams.kt */
/* loaded from: classes9.dex */
public final class AssignParticipantsToRoomsParams {
    private final Map<SessionRoomId.Room, List<ParticipantId>> addParticipantsToRoomsMap;
    private final Map<SessionRoomId.Room, List<ParticipantId>> removeParticipantsFromRoomsMap;

    /* compiled from: AssignParticipantsToRoomsParams.kt */
    public static final class Builder {
        private final Map<SessionRoomId.Room, List<ParticipantId>> addParticipantsToRoomsMap = new LinkedHashMap();
        private final Map<SessionRoomId.Room, List<ParticipantId>> removeParticipantsFromRoomsMap = new LinkedHashMap();

        public final Builder addRoomParticipant(SessionRoomId.Room room, ParticipantId participantId) {
            Map<SessionRoomId.Room, List<ParticipantId>> map = this.addParticipantsToRoomsMap;
            List<ParticipantId> list = map.get(room);
            if (list == null) {
                list = new ArrayList<>();
                map.put(room, list);
            }
            list.add(participantId);
            return this;
        }

        public final AssignParticipantsToRoomsParams build() {
            return new AssignParticipantsToRoomsParams(pn00.t(this.addParticipantsToRoomsMap), pn00.t(this.removeParticipantsFromRoomsMap), null);
        }

        public final Builder removeRoomParticipant(SessionRoomId.Room room, ParticipantId participantId) {
            Map<SessionRoomId.Room, List<ParticipantId>> map = this.removeParticipantsFromRoomsMap;
            List<ParticipantId> list = map.get(room);
            if (list == null) {
                list = new ArrayList<>();
                map.put(room, list);
            }
            list.add(participantId);
            return this;
        }
    }

    public /* synthetic */ AssignParticipantsToRoomsParams(Map map, Map map2, zcl zclVar) {
        this(map, map2);
    }

    public final Map<SessionRoomId.Room, List<ParticipantId>> getAddParticipantsToRoomsMap() {
        return this.addParticipantsToRoomsMap;
    }

    public final Map<SessionRoomId.Room, List<ParticipantId>> getRemoveParticipantsFromRoomsMap() {
        return this.removeParticipantsFromRoomsMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AssignParticipantsToRoomsParams(Map<SessionRoomId.Room, ? extends List<ParticipantId>> map, Map<SessionRoomId.Room, ? extends List<ParticipantId>> map2) {
        this.addParticipantsToRoomsMap = map;
        this.removeParticipantsFromRoomsMap = map2;
    }
}
