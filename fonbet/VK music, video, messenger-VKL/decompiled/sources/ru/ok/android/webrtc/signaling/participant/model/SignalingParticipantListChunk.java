package ru.ok.android.webrtc.signaling.participant.model;

import ru.ok.android.webrtc.participant.update.ParticipantAddOrUpdateParamsList;

/* loaded from: classes9.dex */
public final class SignalingParticipantListChunk {
    public final boolean a;
    public final int b;
    public final int c;
    public final ParticipantAddOrUpdateParamsList d;

    public SignalingParticipantListChunk(boolean z, int i, int i2, ParticipantAddOrUpdateParamsList participantAddOrUpdateParamsList) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = participantAddOrUpdateParamsList;
    }

    public final int getCountAfter() {
        return this.c;
    }

    public final int getCountBefore() {
        return this.b;
    }

    public final boolean getMarkerFound() {
        return this.a;
    }

    public final ParticipantAddOrUpdateParamsList getParticipants() {
        return this.d;
    }
}
