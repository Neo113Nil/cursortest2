package ru.ok.android.webrtc.record;

import ru.ok.android.webrtc.participant.CallParticipant;

/* loaded from: classes9.dex */
public final class CallRecordDescription {
    public final long a;
    public final RecordType b;
    public final CallParticipant.ParticipantId c;
    public final long d;
    public final String e;
    public final String f;

    public CallRecordDescription(long j, RecordType recordType, CallParticipant.ParticipantId participantId, long j2, String str, String str2) {
        this.a = j;
        this.b = recordType;
        this.c = participantId;
        this.d = j2;
        this.e = str;
        this.f = str2;
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
}
