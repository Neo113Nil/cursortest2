package ru.ok.android.externcalls.sdk.feedback;

import ru.ok.android.externcalls.sdk.id.ParticipantId;
import xsna.epx;
import xsna.zcl;

/* compiled from: ParticipantFeedback.kt */
/* loaded from: classes9.dex */
public final class ParticipantFeedback {
    private final long finishTimeMs;
    private final String key;
    private final ParticipantId participantId;
    private final ParticipantFeedbackSource source;

    public ParticipantFeedback(String str, long j, ParticipantId participantId, ParticipantFeedbackSource participantFeedbackSource) {
        this.key = str;
        this.finishTimeMs = j;
        this.participantId = participantId;
        this.source = participantFeedbackSource;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ParticipantFeedback) {
            return epx.f(this.participantId, ((ParticipantFeedback) obj).participantId);
        }
        return false;
    }

    public final long getFinishTimeMs() {
        return this.finishTimeMs;
    }

    public final String getKey() {
        return this.key;
    }

    public final ParticipantId getParticipantId() {
        return this.participantId;
    }

    public final ParticipantFeedbackSource getSource() {
        return this.source;
    }

    public int hashCode() {
        return this.participantId.hashCode();
    }

    public /* synthetic */ ParticipantFeedback(String str, long j, ParticipantId participantId, ParticipantFeedbackSource participantFeedbackSource, int i, zcl zclVar) {
        this(str, j, participantId, (i & 8) != 0 ? ParticipantFeedbackSource.UNKNOWN : participantFeedbackSource);
    }
}
