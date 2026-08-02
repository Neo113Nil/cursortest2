package ru.ok.android.webrtc.signaling.asr;

import ru.ok.android.webrtc.participant.CallParticipant;
import xsna.epx;

/* loaded from: classes9.dex */
public final class CallAsrInfo {
    public final CallParticipant.ParticipantId a;
    public final Long b;

    public CallAsrInfo(CallParticipant.ParticipantId participantId, Long l) {
        this.a = participantId;
        this.b = l;
    }

    public static /* synthetic */ CallAsrInfo copy$default(CallAsrInfo callAsrInfo, CallParticipant.ParticipantId participantId, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            participantId = callAsrInfo.a;
        }
        if ((i & 2) != 0) {
            l = callAsrInfo.b;
        }
        return callAsrInfo.copy(participantId, l);
    }

    public final CallParticipant.ParticipantId component1() {
        return this.a;
    }

    public final Long component2() {
        return this.b;
    }

    public final CallAsrInfo copy(CallParticipant.ParticipantId participantId, Long l) {
        return new CallAsrInfo(participantId, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallAsrInfo)) {
            return false;
        }
        CallAsrInfo callAsrInfo = (CallAsrInfo) obj;
        return epx.f(this.a, callAsrInfo.a) && epx.f(this.b, callAsrInfo.b);
    }

    public final CallParticipant.ParticipantId getInitiatorId() {
        return this.a;
    }

    public final Long getMovieId() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        return "CallAsrInfo(initiatorId=" + this.a + ", movieId=" + this.b + ")";
    }
}
