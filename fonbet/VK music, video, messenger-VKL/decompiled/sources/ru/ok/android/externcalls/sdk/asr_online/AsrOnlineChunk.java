package ru.ok.android.externcalls.sdk.asr_online;

import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.webrtc.asr_online.data_channels.AsrRecvDataPackage;
import ru.ok.android.webrtc.participant.CallParticipant;
import xsna.epx;
import xsna.zcl;

/* compiled from: AsrOnlineChunk.kt */
/* loaded from: classes9.dex */
public final class AsrOnlineChunk {
    public static final Companion Companion = new Companion(null);
    private final ParticipantId participantId;
    private final String text;

    /* compiled from: AsrOnlineChunk.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final AsrOnlineChunk chunkFromPackage$calls_sdk_release(ParticipantStore participantStore, AsrRecvDataPackage asrRecvDataPackage) {
            CallParticipant.ParticipantId participantId = asrRecvDataPackage.getParticipantId();
            ConversationParticipant byInternal = participantId != null ? participantStore.getByInternal(participantId) : null;
            return new AsrOnlineChunk(byInternal != null ? byInternal.getExternalId() : null, asrRecvDataPackage.getText());
        }

        private Companion() {
        }
    }

    public AsrOnlineChunk(ParticipantId participantId, String str) {
        this.participantId = participantId;
        this.text = str;
    }

    public static /* synthetic */ AsrOnlineChunk copy$default(AsrOnlineChunk asrOnlineChunk, ParticipantId participantId, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            participantId = asrOnlineChunk.participantId;
        }
        if ((i & 2) != 0) {
            str = asrOnlineChunk.text;
        }
        return asrOnlineChunk.copy(participantId, str);
    }

    public final ParticipantId component1() {
        return this.participantId;
    }

    public final String component2() {
        return this.text;
    }

    public final AsrOnlineChunk copy(ParticipantId participantId, String str) {
        return new AsrOnlineChunk(participantId, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AsrOnlineChunk)) {
            return false;
        }
        AsrOnlineChunk asrOnlineChunk = (AsrOnlineChunk) obj;
        return epx.f(this.participantId, asrOnlineChunk.participantId) && epx.f(this.text, asrOnlineChunk.text);
    }

    public final ParticipantId getParticipantId() {
        return this.participantId;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        ParticipantId participantId = this.participantId;
        return this.text.hashCode() + ((participantId == null ? 0 : participantId.hashCode()) * 31);
    }

    public String toString() {
        return "AsrOnlineChunk(participantId=" + this.participantId + ", text=" + this.text + ")";
    }
}
