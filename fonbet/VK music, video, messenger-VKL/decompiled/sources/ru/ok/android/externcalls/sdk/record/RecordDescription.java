package ru.ok.android.externcalls.sdk.record;

import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.record.RecordType;

/* compiled from: RecordDescription.kt */
/* loaded from: classes9.dex */
public final class RecordDescription {
    private final String externalMovieId;
    private final String externalOwnerId;
    private final ParticipantId initiator;
    private final long movieId;
    private final long start;
    private final RecordType type;

    public RecordDescription(ParticipantId participantId, RecordType recordType, long j, long j2, String str, String str2) {
        this.initiator = participantId;
        this.type = recordType;
        this.start = j;
        this.movieId = j2;
        this.externalMovieId = str;
        this.externalOwnerId = str2;
    }

    public final String getExternalMovieId() {
        return this.externalMovieId;
    }

    public final String getExternalOwnerId() {
        return this.externalOwnerId;
    }

    public final ParticipantId getInitiator() {
        return this.initiator;
    }

    public final long getMovieId() {
        return this.movieId;
    }

    public final long getStart() {
        return this.start;
    }

    public final RecordType getType() {
        return this.type;
    }
}
