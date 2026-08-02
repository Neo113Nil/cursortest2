package ru.ok.android.webrtc.chat.message;

import ru.ok.android.webrtc.participant.CallParticipant;
import xsna.epx;
import xsna.n23;
import xsna.urd0;

/* loaded from: classes9.dex */
public final class InboundMessage {
    public final CallParticipant.ParticipantId a;
    public final String b;
    public final boolean c;

    public InboundMessage(CallParticipant.ParticipantId participantId, String str, boolean z) {
        this.a = participantId;
        this.b = str;
        this.c = z;
    }

    public static /* synthetic */ InboundMessage copy$default(InboundMessage inboundMessage, CallParticipant.ParticipantId participantId, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            participantId = inboundMessage.a;
        }
        if ((i & 2) != 0) {
            str = inboundMessage.b;
        }
        if ((i & 4) != 0) {
            z = inboundMessage.c;
        }
        return inboundMessage.copy(participantId, str, z);
    }

    public final CallParticipant.ParticipantId component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public final boolean component3() {
        return this.c;
    }

    public final InboundMessage copy(CallParticipant.ParticipantId participantId, String str, boolean z) {
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
        return epx.f(this.a, inboundMessage.a) && epx.f(this.b, inboundMessage.b) && this.c == inboundMessage.c;
    }

    public final CallParticipant.ParticipantId getSenderId() {
        return this.a;
    }

    public final String getText() {
        return this.b;
    }

    public int hashCode() {
        return Boolean.hashCode(this.c) + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final boolean isDirect() {
        return this.c;
    }

    public String toString() {
        CallParticipant.ParticipantId participantId = this.a;
        String str = this.b;
        boolean z = this.c;
        StringBuilder sb = new StringBuilder("InboundMessage(senderId=");
        sb.append(participantId);
        sb.append(", text=");
        sb.append(str);
        sb.append(", isDirect=");
        return n23.b(sb, z, ")");
    }
}
