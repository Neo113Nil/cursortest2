package ru.ok.android.externcalls.sdk.chat.message;

import ru.ok.android.externcalls.sdk.id.ParticipantId;
import xsna.epx;
import xsna.n23;
import xsna.urd0;

/* compiled from: InboundMessage.kt */
/* loaded from: classes9.dex */
public final class InboundMessage {
    private final boolean isDirect;
    private final ParticipantId senderId;
    private final String text;

    public InboundMessage(ParticipantId participantId, String str, boolean z) {
        this.senderId = participantId;
        this.text = str;
        this.isDirect = z;
    }

    public static /* synthetic */ InboundMessage copy$default(InboundMessage inboundMessage, ParticipantId participantId, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            participantId = inboundMessage.senderId;
        }
        if ((i & 2) != 0) {
            str = inboundMessage.text;
        }
        if ((i & 4) != 0) {
            z = inboundMessage.isDirect;
        }
        return inboundMessage.copy(participantId, str, z);
    }

    public final ParticipantId component1() {
        return this.senderId;
    }

    public final String component2() {
        return this.text;
    }

    public final boolean component3() {
        return this.isDirect;
    }

    public final InboundMessage copy(ParticipantId participantId, String str, boolean z) {
        return new InboundMessage(participantId, str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InboundMessage)) {
            return false;
        }
        InboundMessage inboundMessage = (InboundMessage) obj;
        return epx.f(this.senderId, inboundMessage.senderId) && epx.f(this.text, inboundMessage.text) && this.isDirect == inboundMessage.isDirect;
    }

    public final ParticipantId getSenderId() {
        return this.senderId;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        ParticipantId participantId = this.senderId;
        return Boolean.hashCode(this.isDirect) + urd0.a((participantId == null ? 0 : participantId.hashCode()) * 31, 31, this.text);
    }

    public final boolean isDirect() {
        return this.isDirect;
    }

    public String toString() {
        ParticipantId participantId = this.senderId;
        String str = this.text;
        boolean z = this.isDirect;
        StringBuilder sb = new StringBuilder("InboundMessage(senderId=");
        sb.append(participantId);
        sb.append(", text=");
        sb.append(str);
        sb.append(", isDirect=");
        return n23.b(sb, z, ")");
    }
}
