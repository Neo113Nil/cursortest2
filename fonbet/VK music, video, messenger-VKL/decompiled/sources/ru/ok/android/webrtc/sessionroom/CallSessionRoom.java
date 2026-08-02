package ru.ok.android.webrtc.sessionroom;

import java.util.List;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.de;
import xsna.epx;
import xsna.urd0;
import xsna.wn4;

/* loaded from: classes9.dex */
public final class CallSessionRoom {
    public final SessionRoomId.Room a;
    public final String b;
    public final boolean c;
    public final List d;
    public final int e;
    public final CallParticipant.ParticipantId f;
    public final Long g;

    public CallSessionRoom(SessionRoomId.Room room, String str, boolean z, List<CallParticipant.ParticipantId> list, int i, CallParticipant.ParticipantId participantId, Long l) {
        this.a = room;
        this.b = str;
        this.c = z;
        this.d = list;
        this.e = i;
        this.f = participantId;
        this.g = l;
    }

    public static /* synthetic */ CallSessionRoom copy$default(CallSessionRoom callSessionRoom, SessionRoomId.Room room, String str, boolean z, List list, int i, CallParticipant.ParticipantId participantId, Long l, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            room = callSessionRoom.a;
        }
        if ((i2 & 2) != 0) {
            str = callSessionRoom.b;
        }
        if ((i2 & 4) != 0) {
            z = callSessionRoom.c;
        }
        if ((i2 & 8) != 0) {
            list = callSessionRoom.d;
        }
        if ((i2 & 16) != 0) {
            i = callSessionRoom.e;
        }
        if ((i2 & 32) != 0) {
            participantId = callSessionRoom.f;
        }
        if ((i2 & 64) != 0) {
            l = callSessionRoom.g;
        }
        CallParticipant.ParticipantId participantId2 = participantId;
        Long l2 = l;
        int i3 = i;
        boolean z2 = z;
        return callSessionRoom.copy(room, str, z2, list, i3, participantId2, l2);
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

    public final List<CallParticipant.ParticipantId> component4() {
        return this.d;
    }

    public final int component5() {
        return this.e;
    }

    public final CallParticipant.ParticipantId component6() {
        return this.f;
    }

    public final Long component7() {
        return this.g;
    }

    public final CallSessionRoom copy(SessionRoomId.Room room, String str, boolean z, List<CallParticipant.ParticipantId> list, int i, CallParticipant.ParticipantId participantId, Long l) {
        return new CallSessionRoom(room, str, z, list, i, participantId, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallSessionRoom)) {
            return false;
        }
        CallSessionRoom callSessionRoom = (CallSessionRoom) obj;
        return epx.f(this.a, callSessionRoom.a) && epx.f(this.b, callSessionRoom.b) && this.c == callSessionRoom.c && epx.f(this.d, callSessionRoom.d) && this.e == callSessionRoom.e && epx.f(this.f, callSessionRoom.f) && epx.f(this.g, callSessionRoom.g);
    }

    public final SessionRoomId.Room getId() {
        return this.a;
    }

    public final String getName() {
        return this.b;
    }

    public final int getParticipantCount() {
        return this.e;
    }

    public final List<CallParticipant.ParticipantId> getParticipantIds() {
        return this.d;
    }

    public final CallParticipant.ParticipantId getPinnedParticipantId() {
        return this.f;
    }

    public final Long getTimeoutMs() {
        return this.g;
    }

    public int hashCode() {
        int b = wn4.b(this.c, urd0.a(this.a.hashCode() * 31, 31, this.b));
        List list = this.d;
        int v = de.v(this.e, (b + (list == null ? 0 : list.hashCode())) * 31);
        CallParticipant.ParticipantId participantId = this.f;
        int hashCode = (v + (participantId == null ? 0 : participantId.hashCode())) * 31;
        Long l = this.g;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public final boolean isActive() {
        return this.c;
    }

    public String toString() {
        return "CallSessionRoom(id=" + this.a + ", name=" + this.b + ", isActive=" + this.c + ", participantIds=" + this.d + ", participantCount=" + this.e + ", pinnedParticipantId=" + this.f + ", timeoutMs=" + this.g + ")";
    }
}
