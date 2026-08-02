package ru.ok.android.externcalls.sdk.chat.message;

import ru.ok.android.externcalls.sdk.id.ParticipantId;
import xsna.epx;
import xsna.zcl;

/* compiled from: OutboundMessage.kt */
/* loaded from: classes9.dex */
public final class OutboundMessage {
    private final ParticipantId participantId;
    private final String text;

    public OutboundMessage(ParticipantId participantId, String str) {
        this.participantId = participantId;
        this.text = str;
    }

    public static /* synthetic */ OutboundMessage copy$default(OutboundMessage outboundMessage, ParticipantId participantId, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            participantId = outboundMessage.participantId;
        }
        if ((i & 2) != 0) {
            str = outboundMessage.text;
        }
        return outboundMessage.copy(participantId, str);
    }

    public final ParticipantId component1() {
        return this.participantId;
    }

    public final String component2() {
        return this.text;
    }

    public final OutboundMessage copy(ParticipantId participantId, String str) {
        return new OutboundMessage(participantId, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OutboundMessage)) {
            return false;
        }
        OutboundMessage outboundMessage = (OutboundMessage) obj;
        return epx.f(this.participantId, outboundMessage.participantId) && epx.f(this.text, outboundMessage.text);
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
        return "OutboundMessage(participantId=" + this.participantId + ", text=" + this.text + ")";
    }

    public /* synthetic */ OutboundMessage(ParticipantId participantId, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : participantId, str);
    }
}
