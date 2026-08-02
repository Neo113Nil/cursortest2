package ru.ok.android.webrtc.signaling.urlsharing;

import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.epx;

/* loaded from: classes9.dex */
public final class RoomSignalingUrlSharingInfo {
    public final CallParticipant.ParticipantId a;
    public final String b;
    public final SessionRoomId c;

    public RoomSignalingUrlSharingInfo(CallParticipant.ParticipantId participantId, String str, SessionRoomId sessionRoomId) {
        this.a = participantId;
        this.b = str;
        this.c = sessionRoomId;
    }

    public static /* synthetic */ RoomSignalingUrlSharingInfo copy$default(RoomSignalingUrlSharingInfo roomSignalingUrlSharingInfo, CallParticipant.ParticipantId participantId, String str, SessionRoomId sessionRoomId, int i, Object obj) {
        if ((i & 1) != 0) {
            participantId = roomSignalingUrlSharingInfo.a;
        }
        if ((i & 2) != 0) {
            str = roomSignalingUrlSharingInfo.b;
        }
        if ((i & 4) != 0) {
            sessionRoomId = roomSignalingUrlSharingInfo.c;
        }
        return roomSignalingUrlSharingInfo.copy(participantId, str, sessionRoomId);
    }

    public final CallParticipant.ParticipantId component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public final SessionRoomId component3() {
        return this.c;
    }

    public final RoomSignalingUrlSharingInfo copy(CallParticipant.ParticipantId participantId, String str, SessionRoomId sessionRoomId) {
        return new RoomSignalingUrlSharingInfo(participantId, str, sessionRoomId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoomSignalingUrlSharingInfo)) {
            return false;
        }
        RoomSignalingUrlSharingInfo roomSignalingUrlSharingInfo = (RoomSignalingUrlSharingInfo) obj;
        return epx.f(this.a, roomSignalingUrlSharingInfo.a) && epx.f(this.b, roomSignalingUrlSharingInfo.b) && epx.f(this.c, roomSignalingUrlSharingInfo.c);
    }

    public final CallParticipant.ParticipantId getInitiator() {
        return this.a;
    }

    public final SessionRoomId getRoomId() {
        return this.c;
    }

    public final String getUrl() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        return "RoomSignalingUrlSharingInfo(initiator=" + this.a + ", url=" + this.b + ", roomId=" + this.c + ")";
    }
}
