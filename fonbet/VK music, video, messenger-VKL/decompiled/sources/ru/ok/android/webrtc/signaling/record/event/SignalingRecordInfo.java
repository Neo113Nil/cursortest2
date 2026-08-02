package ru.ok.android.webrtc.signaling.record.event;

import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.record.RecordType;
import xsna.bh10;
import xsna.epx;
import xsna.tdj;

/* loaded from: classes9.dex */
public final class SignalingRecordInfo {
    public final long a;
    public final RecordType b;
    public final CallParticipant.ParticipantId c;
    public final long d;
    public final String e;
    public final String f;

    public SignalingRecordInfo(long j, RecordType recordType, CallParticipant.ParticipantId participantId, long j2, String str, String str2) {
        this.a = j;
        this.b = recordType;
        this.c = participantId;
        this.d = j2;
        this.e = str;
        this.f = str2;
    }

    public static /* synthetic */ SignalingRecordInfo copy$default(SignalingRecordInfo signalingRecordInfo, long j, RecordType recordType, CallParticipant.ParticipantId participantId, long j2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = signalingRecordInfo.a;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            recordType = signalingRecordInfo.b;
        }
        RecordType recordType2 = recordType;
        if ((i & 4) != 0) {
            participantId = signalingRecordInfo.c;
        }
        CallParticipant.ParticipantId participantId2 = participantId;
        if ((i & 8) != 0) {
            j2 = signalingRecordInfo.d;
        }
        return signalingRecordInfo.copy(j3, recordType2, participantId2, j2, (i & 16) != 0 ? signalingRecordInfo.e : str, (i & 32) != 0 ? signalingRecordInfo.f : str2);
    }

    public final long component1() {
        return this.a;
    }

    public final RecordType component2() {
        return this.b;
    }

    public final CallParticipant.ParticipantId component3() {
        return this.c;
    }

    public final long component4() {
        return this.d;
    }

    public final String component5() {
        return this.e;
    }

    public final String component6() {
        return this.f;
    }

    public final SignalingRecordInfo copy(long j, RecordType recordType, CallParticipant.ParticipantId participantId, long j2, String str, String str2) {
        return new SignalingRecordInfo(j, recordType, participantId, j2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignalingRecordInfo)) {
            return false;
        }
        SignalingRecordInfo signalingRecordInfo = (SignalingRecordInfo) obj;
        return this.a == signalingRecordInfo.a && this.b == signalingRecordInfo.b && epx.f(this.c, signalingRecordInfo.c) && this.d == signalingRecordInfo.d && epx.f(this.e, signalingRecordInfo.e) && epx.f(this.f, signalingRecordInfo.f);
    }

    public final CallParticipant.ParticipantId getInitiator() {
        return this.c;
    }

    public final String getRecordExternalMovieId() {
        return this.e;
    }

    public final String getRecordExternalOwnerId() {
        return this.f;
    }

    public final long getRecordMovieId() {
        return this.a;
    }

    public final long getRecordStartTime() {
        return this.d;
    }

    public final RecordType getRecordType() {
        return this.b;
    }

    public int hashCode() {
        int a = bh10.a((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31)) * 31, 31, this.d);
        String str = this.e;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        long j = this.a;
        RecordType recordType = this.b;
        CallParticipant.ParticipantId participantId = this.c;
        long j2 = this.d;
        String str = this.e;
        String str2 = this.f;
        StringBuilder sb = new StringBuilder("SignalingRecordInfo(recordMovieId=");
        sb.append(j);
        sb.append(", recordType=");
        sb.append(recordType);
        sb.append(", initiator=");
        sb.append(participantId);
        sb.append(", recordStartTime=");
        sb.append(j2);
        sb.append(", recordExternalMovieId=");
        sb.append(str);
        return tdj.a(sb, ", recordExternalOwnerId=", str2, ")");
    }
}
