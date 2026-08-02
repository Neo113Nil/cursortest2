package com.yandex.messaging.core.net.entities.proto.telemost;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.oyr;
import defpackage.xuf0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/telemost/OutgoingRingingEndedMessage;", "", CRLReasonCodeExtension.REASON, "", "<init>", "(I)V", "getReason", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class OutgoingRingingEndedMessage {

    @xuf0(tag = 2)
    private final int reason;

    public OutgoingRingingEndedMessage(@Json(name = "Reason") int i) {
        this.reason = i;
    }

    public static /* synthetic */ OutgoingRingingEndedMessage copy$default(OutgoingRingingEndedMessage outgoingRingingEndedMessage, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = outgoingRingingEndedMessage.reason;
        }
        return outgoingRingingEndedMessage.copy(i);
    }

    /* renamed from: component1, reason: from getter */
    public final int getReason() {
        return this.reason;
    }

    public final OutgoingRingingEndedMessage copy(@Json(name = "Reason") int reason) {
        return new OutgoingRingingEndedMessage(reason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OutgoingRingingEndedMessage) && this.reason == ((OutgoingRingingEndedMessage) other).reason;
    }

    public final int getReason() {
        return this.reason;
    }

    public int hashCode() {
        return Integer.hashCode(this.reason);
    }

    public String toString() {
        return oyr.j(this.reason, "OutgoingRingingEndedMessage(reason=", Extension.C_BRAKE);
    }
}
