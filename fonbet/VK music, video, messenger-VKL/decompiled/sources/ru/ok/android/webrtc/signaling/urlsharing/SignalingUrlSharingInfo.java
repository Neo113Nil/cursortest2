package ru.ok.android.webrtc.signaling.urlsharing;

import ru.ok.android.webrtc.participant.CallParticipant;
import xsna.epx;

/* loaded from: classes9.dex */
public final class SignalingUrlSharingInfo {
    public final CallParticipant.ParticipantId a;
    public final String b;

    public SignalingUrlSharingInfo(CallParticipant.ParticipantId participantId, String str) {
        this.a = participantId;
        this.b = str;
    }

    public static /* synthetic */ SignalingUrlSharingInfo copy$default(SignalingUrlSharingInfo signalingUrlSharingInfo, CallParticipant.ParticipantId participantId, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            participantId = signalingUrlSharingInfo.a;
        }
        if ((i & 2) != 0) {
            str = signalingUrlSharingInfo.b;
        }
        return signalingUrlSharingInfo.copy(participantId, str);
    }

    public final CallParticipant.ParticipantId component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public final SignalingUrlSharingInfo copy(CallParticipant.ParticipantId participantId, String str) {
        return new SignalingUrlSharingInfo(participantId, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignalingUrlSharingInfo)) {
            return false;
        }
        SignalingUrlSharingInfo signalingUrlSharingInfo = (SignalingUrlSharingInfo) obj;
        return epx.f(this.a, signalingUrlSharingInfo.a) && epx.f(this.b, signalingUrlSharingInfo.b);
    }

    public final CallParticipant.ParticipantId getInitiator() {
        return this.a;
    }

    public final String getUrl() {
        return this.b;
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        return "SignalingUrlSharingInfo(initiator=" + this.a + ", url=" + this.b + ")";
    }
}
