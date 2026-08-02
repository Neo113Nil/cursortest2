package com.yandex.messaging.core.net.entities.proto.telemost;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.xuf0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jg\u0010,\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00063"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingCallingMessage;", "", "ringingId", "", "incomingCall", "Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingIncomingCallMessage;", "ringingEnded", "Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingRingingEndedMessage;", "ringing", "Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingRingingMessage;", "outgoingRingingEnded", "Lcom/yandex/messaging/core/net/entities/proto/telemost/OutgoingRingingEndedMessage;", "endRinging", "Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingEndRingingMessage;", "notifyRinging", "Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingNotifyRingingMessage;", "endOutgoingRinging", "Lcom/yandex/messaging/core/net/entities/proto/telemost/EndOutgoingRingingMessage;", "<init>", "(Ljava/lang/String;Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingIncomingCallMessage;Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingRingingEndedMessage;Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingRingingMessage;Lcom/yandex/messaging/core/net/entities/proto/telemost/OutgoingRingingEndedMessage;Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingEndRingingMessage;Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingNotifyRingingMessage;Lcom/yandex/messaging/core/net/entities/proto/telemost/EndOutgoingRingingMessage;)V", "getRingingId", "()Ljava/lang/String;", "getIncomingCall", "()Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingIncomingCallMessage;", "getRingingEnded", "()Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingRingingEndedMessage;", "getRinging", "()Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingRingingMessage;", "getOutgoingRingingEnded", "()Lcom/yandex/messaging/core/net/entities/proto/telemost/OutgoingRingingEndedMessage;", "getEndRinging", "()Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingEndRingingMessage;", "getNotifyRinging", "()Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingNotifyRingingMessage;", "getEndOutgoingRinging", "()Lcom/yandex/messaging/core/net/entities/proto/telemost/EndOutgoingRingingMessage;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MeetingCallingMessage {

    @xuf0(tag = 9)
    private final EndOutgoingRingingMessage endOutgoingRinging;

    @xuf0(tag = 4)
    private final MeetingEndRingingMessage endRinging;

    @xuf0(tag = 3)
    private final MeetingIncomingCallMessage incomingCall;

    @xuf0(tag = 6)
    private final MeetingNotifyRingingMessage notifyRinging;

    @xuf0(tag = 8)
    private final OutgoingRingingEndedMessage outgoingRingingEnded;

    @xuf0(tag = 7)
    private final MeetingRingingMessage ringing;

    @xuf0(tag = 5)
    private final MeetingRingingEndedMessage ringingEnded;

    @xuf0(tag = 2)
    private final String ringingId;

    public /* synthetic */ MeetingCallingMessage(String str, MeetingIncomingCallMessage meetingIncomingCallMessage, MeetingRingingEndedMessage meetingRingingEndedMessage, MeetingRingingMessage meetingRingingMessage, OutgoingRingingEndedMessage outgoingRingingEndedMessage, MeetingEndRingingMessage meetingEndRingingMessage, MeetingNotifyRingingMessage meetingNotifyRingingMessage, EndOutgoingRingingMessage endOutgoingRingingMessage, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : meetingIncomingCallMessage, (i & 4) != 0 ? null : meetingRingingEndedMessage, (i & 8) != 0 ? null : meetingRingingMessage, (i & 16) != 0 ? null : outgoingRingingEndedMessage, (i & 32) != 0 ? null : meetingEndRingingMessage, (i & 64) != 0 ? null : meetingNotifyRingingMessage, (i & 128) != 0 ? null : endOutgoingRingingMessage);
    }

    public static /* synthetic */ MeetingCallingMessage copy$default(MeetingCallingMessage meetingCallingMessage, String str, MeetingIncomingCallMessage meetingIncomingCallMessage, MeetingRingingEndedMessage meetingRingingEndedMessage, MeetingRingingMessage meetingRingingMessage, OutgoingRingingEndedMessage outgoingRingingEndedMessage, MeetingEndRingingMessage meetingEndRingingMessage, MeetingNotifyRingingMessage meetingNotifyRingingMessage, EndOutgoingRingingMessage endOutgoingRingingMessage, int i, Object obj) {
        if ((i & 1) != 0) {
            str = meetingCallingMessage.ringingId;
        }
        if ((i & 2) != 0) {
            meetingIncomingCallMessage = meetingCallingMessage.incomingCall;
        }
        if ((i & 4) != 0) {
            meetingRingingEndedMessage = meetingCallingMessage.ringingEnded;
        }
        if ((i & 8) != 0) {
            meetingRingingMessage = meetingCallingMessage.ringing;
        }
        if ((i & 16) != 0) {
            outgoingRingingEndedMessage = meetingCallingMessage.outgoingRingingEnded;
        }
        if ((i & 32) != 0) {
            meetingEndRingingMessage = meetingCallingMessage.endRinging;
        }
        if ((i & 64) != 0) {
            meetingNotifyRingingMessage = meetingCallingMessage.notifyRinging;
        }
        if ((i & 128) != 0) {
            endOutgoingRingingMessage = meetingCallingMessage.endOutgoingRinging;
        }
        MeetingNotifyRingingMessage meetingNotifyRingingMessage2 = meetingNotifyRingingMessage;
        EndOutgoingRingingMessage endOutgoingRingingMessage2 = endOutgoingRingingMessage;
        OutgoingRingingEndedMessage outgoingRingingEndedMessage2 = outgoingRingingEndedMessage;
        MeetingEndRingingMessage meetingEndRingingMessage2 = meetingEndRingingMessage;
        return meetingCallingMessage.copy(str, meetingIncomingCallMessage, meetingRingingEndedMessage, meetingRingingMessage, outgoingRingingEndedMessage2, meetingEndRingingMessage2, meetingNotifyRingingMessage2, endOutgoingRingingMessage2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRingingId() {
        return this.ringingId;
    }

    /* renamed from: component2, reason: from getter */
    public final MeetingIncomingCallMessage getIncomingCall() {
        return this.incomingCall;
    }

    /* renamed from: component3, reason: from getter */
    public final MeetingRingingEndedMessage getRingingEnded() {
        return this.ringingEnded;
    }

    /* renamed from: component4, reason: from getter */
    public final MeetingRingingMessage getRinging() {
        return this.ringing;
    }

    /* renamed from: component5, reason: from getter */
    public final OutgoingRingingEndedMessage getOutgoingRingingEnded() {
        return this.outgoingRingingEnded;
    }

    /* renamed from: component6, reason: from getter */
    public final MeetingEndRingingMessage getEndRinging() {
        return this.endRinging;
    }

    /* renamed from: component7, reason: from getter */
    public final MeetingNotifyRingingMessage getNotifyRinging() {
        return this.notifyRinging;
    }

    /* renamed from: component8, reason: from getter */
    public final EndOutgoingRingingMessage getEndOutgoingRinging() {
        return this.endOutgoingRinging;
    }

    public final MeetingCallingMessage copy(@Json(name = "RingingId") String ringingId, @Json(name = "IncomingCall") MeetingIncomingCallMessage incomingCall, @Json(name = "RingingEnded") MeetingRingingEndedMessage ringingEnded, @Json(name = "Ringing") MeetingRingingMessage ringing, @Json(name = "OutgoingRingingEnded") OutgoingRingingEndedMessage outgoingRingingEnded, @Json(name = "EndRinging") MeetingEndRingingMessage endRinging, @Json(name = "NotifyRinging") MeetingNotifyRingingMessage notifyRinging, @Json(name = "EndOutgoingRinging") EndOutgoingRingingMessage endOutgoingRinging) {
        return new MeetingCallingMessage(ringingId, incomingCall, ringingEnded, ringing, outgoingRingingEnded, endRinging, notifyRinging, endOutgoingRinging);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MeetingCallingMessage)) {
            return false;
        }
        MeetingCallingMessage meetingCallingMessage = (MeetingCallingMessage) other;
        return jl40.l(this.ringingId, meetingCallingMessage.ringingId) && jl40.l(this.incomingCall, meetingCallingMessage.incomingCall) && jl40.l(this.ringingEnded, meetingCallingMessage.ringingEnded) && jl40.l(this.ringing, meetingCallingMessage.ringing) && jl40.l(this.outgoingRingingEnded, meetingCallingMessage.outgoingRingingEnded) && jl40.l(this.endRinging, meetingCallingMessage.endRinging) && jl40.l(this.notifyRinging, meetingCallingMessage.notifyRinging) && jl40.l(this.endOutgoingRinging, meetingCallingMessage.endOutgoingRinging);
    }

    public final EndOutgoingRingingMessage getEndOutgoingRinging() {
        return this.endOutgoingRinging;
    }

    public final MeetingEndRingingMessage getEndRinging() {
        return this.endRinging;
    }

    public final MeetingIncomingCallMessage getIncomingCall() {
        return this.incomingCall;
    }

    public final MeetingNotifyRingingMessage getNotifyRinging() {
        return this.notifyRinging;
    }

    public final OutgoingRingingEndedMessage getOutgoingRingingEnded() {
        return this.outgoingRingingEnded;
    }

    public final MeetingRingingMessage getRinging() {
        return this.ringing;
    }

    public final MeetingRingingEndedMessage getRingingEnded() {
        return this.ringingEnded;
    }

    public final String getRingingId() {
        return this.ringingId;
    }

    public int hashCode() {
        int hashCode = this.ringingId.hashCode() * 31;
        MeetingIncomingCallMessage meetingIncomingCallMessage = this.incomingCall;
        int hashCode2 = (hashCode + (meetingIncomingCallMessage == null ? 0 : meetingIncomingCallMessage.hashCode())) * 31;
        MeetingRingingEndedMessage meetingRingingEndedMessage = this.ringingEnded;
        int hashCode3 = (hashCode2 + (meetingRingingEndedMessage == null ? 0 : meetingRingingEndedMessage.hashCode())) * 31;
        MeetingRingingMessage meetingRingingMessage = this.ringing;
        int hashCode4 = (hashCode3 + (meetingRingingMessage == null ? 0 : meetingRingingMessage.hashCode())) * 31;
        OutgoingRingingEndedMessage outgoingRingingEndedMessage = this.outgoingRingingEnded;
        int hashCode5 = (hashCode4 + (outgoingRingingEndedMessage == null ? 0 : outgoingRingingEndedMessage.hashCode())) * 31;
        MeetingEndRingingMessage meetingEndRingingMessage = this.endRinging;
        int hashCode6 = (hashCode5 + (meetingEndRingingMessage == null ? 0 : meetingEndRingingMessage.hashCode())) * 31;
        MeetingNotifyRingingMessage meetingNotifyRingingMessage = this.notifyRinging;
        int hashCode7 = (hashCode6 + (meetingNotifyRingingMessage == null ? 0 : meetingNotifyRingingMessage.hashCode())) * 31;
        EndOutgoingRingingMessage endOutgoingRingingMessage = this.endOutgoingRinging;
        return hashCode7 + (endOutgoingRingingMessage != null ? endOutgoingRingingMessage.hashCode() : 0);
    }

    public String toString() {
        return "MeetingCallingMessage(ringingId=" + this.ringingId + ", incomingCall=" + this.incomingCall + ", ringingEnded=" + this.ringingEnded + ", ringing=" + this.ringing + ", outgoingRingingEnded=" + this.outgoingRingingEnded + ", endRinging=" + this.endRinging + ", notifyRinging=" + this.notifyRinging + ", endOutgoingRinging=" + this.endOutgoingRinging + Extension.C_BRAKE;
    }

    public MeetingCallingMessage(@Json(name = "RingingId") String str, @Json(name = "IncomingCall") MeetingIncomingCallMessage meetingIncomingCallMessage, @Json(name = "RingingEnded") MeetingRingingEndedMessage meetingRingingEndedMessage, @Json(name = "Ringing") MeetingRingingMessage meetingRingingMessage, @Json(name = "OutgoingRingingEnded") OutgoingRingingEndedMessage outgoingRingingEndedMessage, @Json(name = "EndRinging") MeetingEndRingingMessage meetingEndRingingMessage, @Json(name = "NotifyRinging") MeetingNotifyRingingMessage meetingNotifyRingingMessage, @Json(name = "EndOutgoingRinging") EndOutgoingRingingMessage endOutgoingRingingMessage) {
        this.ringingId = str;
        this.incomingCall = meetingIncomingCallMessage;
        this.ringingEnded = meetingRingingEndedMessage;
        this.ringing = meetingRingingMessage;
        this.outgoingRingingEnded = outgoingRingingEndedMessage;
        this.endRinging = meetingEndRingingMessage;
        this.notifyRinging = meetingNotifyRingingMessage;
        this.endOutgoingRinging = endOutgoingRingingMessage;
    }
}
