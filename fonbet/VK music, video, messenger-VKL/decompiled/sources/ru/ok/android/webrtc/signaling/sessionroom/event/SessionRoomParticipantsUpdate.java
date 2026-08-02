package ru.ok.android.webrtc.signaling.sessionroom.event;

import java.util.List;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.participant.update.ParticipantAddOrUpdateParamsList;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;

/* loaded from: classes9.dex */
public final class SessionRoomParticipantsUpdate {
    public final SessionRoomId a;
    public final int b;
    public final List c;
    public final ParticipantAddOrUpdateParamsList d;
    public final List e;

    public SessionRoomParticipantsUpdate(SessionRoomId sessionRoomId, int i, List<CallParticipant.ParticipantId> list, ParticipantAddOrUpdateParamsList participantAddOrUpdateParamsList, List<CallParticipant.ParticipantId> list2) {
        this.a = sessionRoomId;
        this.b = i;
        this.c = list;
        this.d = participantAddOrUpdateParamsList;
        this.e = list2;
    }

    public final List<CallParticipant.ParticipantId> getAddedParticipantIds() {
        return this.c;
    }

    public final ParticipantAddOrUpdateParamsList getAddedParticipants() {
        return this.d;
    }

    public final int getParticipantsCount() {
        return this.b;
    }

    public final List<CallParticipant.ParticipantId> getRemovedParticipantIds() {
        return this.e;
    }

    public final SessionRoomId getRoomId() {
        return this.a;
    }
}
