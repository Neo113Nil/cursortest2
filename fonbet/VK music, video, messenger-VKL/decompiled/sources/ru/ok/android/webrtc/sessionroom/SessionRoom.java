package ru.ok.android.webrtc.sessionroom;

import java.util.List;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.de;
import xsna.epx;
import xsna.urd0;
import xsna.wn4;

/* loaded from: classes9.dex */
public final class SessionRoom {
    public final SessionRoomId.Room a;
    public final String b;
    public final boolean c;
    public final int d;
    public final List e;
    public final CallParticipant.ParticipantId f;
    public final Long g;

    public SessionRoom(SessionRoomId.Room room, String str, boolean z, int i, List<CallParticipant.ParticipantId> list, CallParticipant.ParticipantId participantId, Long l) {
        this.a = room;
        this.b = str;
        this.c = z;
        this.d = i;
        this.e = list;
        this.f = participantId;
        this.g = l;
    }

    public static /* synthetic */ SessionRoom copy$default(SessionRoom sessionRoom, SessionRoomId.Room room, String str, boolean z, int i, List list, CallParticipant.ParticipantId participantId, Long l, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            room = sessionRoom.a;
        }
        if ((i2 & 2) != 0) {
            str = sessionRoom.b;
        }
        if ((i2 & 4) != 0) {
            z = sessionRoom.c;
        }
        if ((i2 & 8) != 0) {
            i = sessionRoom.d;
        }
        if ((i2 & 16) != 0) {
            list = sessionRoom.e;
        }
        if ((i2 & 32) != 0) {
            participantId = sessionRoom.f;
        }
        if ((i2 & 64) != 0) {
            l = sessionRoom.g;
        }
        CallParticipant.ParticipantId participantId2 = participantId;
        Long l2 = l;
        List list2 = list;
        boolean z2 = z;
        return sessionRoom.copy(room, str, z2, i, list2, participantId2, l2);
    }

    public final SessionRoomId.Room component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public final boolean component3() {
        return this.c;
    }

    public final int component4() {
        return this.d;
    }

    public final List<CallParticipant.ParticipantId> component5() {
        return this.e;
    }

    public final CallParticipant.ParticipantId component6() {
        return this.f;
    }

    public final Long component7() {
        return this.g;
    }

    public final SessionRoom copy(SessionRoomId.Room room, String str, boolean z, int i, List<CallParticipant.ParticipantId> list, CallParticipant.ParticipantId participantId, Long l) {
        return new SessionRoom(room, str, z, i, list, participantId, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionRoom)) {
            return false;
        }
        SessionRoom sessionRoom = (SessionRoom) obj;
        return epx.f(this.a, sessionRoom.a) && epx.f(this.b, sessionRoom.b) && this.c == sessionRoom.c && this.d == sessionRoom.d && epx.f(this.e, sessionRoom.e) && epx.f(this.f, sessionRoom.f) && epx.f(this.g, sessionRoom.g);
    }

    public final SessionRoomId.Room getId() {
        return this.a;
    }

    public final String getName() {
        return this.b;
    }

    public final int getParticipantCount() {
        return this.d;
    }

    public final List<CallParticipant.ParticipantId> getParticipantIds() {
        return this.e;
    }

    public final CallParticipant.ParticipantId getPinnedParticipantId() {
        return this.f;
    }

    public final Long getTimeoutMs() {
        return this.g;
    }

    public int hashCode() {
        int v = de.v(this.d, wn4.b(this.c, urd0.a(this.a.hashCode() * 31, 31, this.b)));
        List list = this.e;
        int hashCode = (v + (list == null ? 0 : list.hashCode())) * 31;
        CallParticipant.ParticipantId participantId = this.f;
        int hashCode2 = (hashCode + (participantId == null ? 0 : participantId.hashCode())) * 31;
        Long l = this.g;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final boolean isActive() {
        return this.c;
    }

    public String toString() {
        return "SessionRoom(id=" + this.a + ", name=" + this.b + ", isActive=" + this.c + ", participantCount=" + this.d + ", participantIds=" + this.e + ", pinnedParticipantId=" + this.f + ", timeoutMs=" + this.g + ")";
    }
}
