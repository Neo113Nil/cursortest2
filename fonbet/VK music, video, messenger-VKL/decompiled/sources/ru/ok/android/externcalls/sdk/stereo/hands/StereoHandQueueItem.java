package ru.ok.android.externcalls.sdk.stereo.hands;

import ru.ok.android.externcalls.sdk.id.ParticipantId;
import xsna.epx;

/* compiled from: StereoHandQueueItem.kt */
/* loaded from: classes9.dex */
public final class StereoHandQueueItem {
    private final long addedTs;
    private final ParticipantId participantId;

    public StereoHandQueueItem(ParticipantId participantId, long j) {
        this.participantId = participantId;
        this.addedTs = j;
    }

    public static /* synthetic */ StereoHandQueueItem copy$default(StereoHandQueueItem stereoHandQueueItem, ParticipantId participantId, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            participantId = stereoHandQueueItem.participantId;
        }
        if ((i & 2) != 0) {
            j = stereoHandQueueItem.addedTs;
        }
        return stereoHandQueueItem.copy(participantId, j);
    }

    public final ParticipantId component1() {
        return this.participantId;
    }

    public final long component2() {
        return this.addedTs;
    }

    public final StereoHandQueueItem copy(ParticipantId participantId, long j) {
        return new StereoHandQueueItem(participantId, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StereoHandQueueItem)) {
            return false;
        }
        StereoHandQueueItem stereoHandQueueItem = (StereoHandQueueItem) obj;
        return epx.f(this.participantId, stereoHandQueueItem.participantId) && this.addedTs == stereoHandQueueItem.addedTs;
    }

    public final long getAddedTs() {
        return this.addedTs;
    }

    public final ParticipantId getParticipantId() {
        return this.participantId;
    }

    public int hashCode() {
        return Long.hashCode(this.addedTs) + (this.participantId.hashCode() * 31);
    }

    public String toString() {
        return "StereoHandQueueItem(participantId=" + this.participantId + ", addedTs=" + this.addedTs + ")";
    }
}
