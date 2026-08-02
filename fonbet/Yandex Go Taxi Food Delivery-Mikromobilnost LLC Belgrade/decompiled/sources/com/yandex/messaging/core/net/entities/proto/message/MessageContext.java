package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.x4e;
import defpackage.xuf0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J:\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/MessageContext;", "", "payloadId", "", "version", "", ClidProvider.TIMESTAMP, "elementId", "<init>", "(Ljava/lang/String;JLjava/lang/Long;Ljava/lang/String;)V", "getPayloadId", "()Ljava/lang/String;", "getVersion", "()J", "getTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getElementId", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;JLjava/lang/Long;Ljava/lang/String;)Lcom/yandex/messaging/core/net/entities/proto/message/MessageContext;", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MessageContext {

    @xuf0(tag = 4)
    private final String elementId;

    @xuf0(tag = 1)
    private final String payloadId;

    @xuf0(tag = 3)
    private final Long timestamp;

    @xuf0(tag = 2)
    private final long version;

    public /* synthetic */ MessageContext(String str, long j, Long l, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str2);
    }

    public static /* synthetic */ MessageContext copy$default(MessageContext messageContext, String str, long j, Long l, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageContext.payloadId;
        }
        if ((i & 2) != 0) {
            j = messageContext.version;
        }
        if ((i & 4) != 0) {
            l = messageContext.timestamp;
        }
        if ((i & 8) != 0) {
            str2 = messageContext.elementId;
        }
        return messageContext.copy(str, j, l, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPayloadId() {
        return this.payloadId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component4, reason: from getter */
    public final String getElementId() {
        return this.elementId;
    }

    public final MessageContext copy(@Json(name = "PayloadId") String payloadId, @Json(name = "Version") long version, @Json(name = "Timestamp") Long timestamp, @Json(name = "ElementId") String elementId) {
        return new MessageContext(payloadId, version, timestamp, elementId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageContext)) {
            return false;
        }
        MessageContext messageContext = (MessageContext) other;
        return jl40.l(this.payloadId, messageContext.payloadId) && this.version == messageContext.version && jl40.l(this.timestamp, messageContext.timestamp) && jl40.l(this.elementId, messageContext.elementId);
    }

    public final String getElementId() {
        return this.elementId;
    }

    public final String getPayloadId() {
        return this.payloadId;
    }

    public final Long getTimestamp() {
        return this.timestamp;
    }

    public final long getVersion() {
        return this.version;
    }

    public int hashCode() {
        int c = qv10.c(this.payloadId.hashCode() * 31, 31, this.version);
        Long l = this.timestamp;
        int hashCode = (c + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.elementId;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.payloadId;
        long j = this.version;
        Long l = this.timestamp;
        String str2 = this.elementId;
        StringBuilder l2 = x4e.l("MessageContext(payloadId=", str, ", version=", j);
        l2.append(", timestamp=");
        l2.append(l);
        l2.append(", elementId=");
        l2.append(str2);
        l2.append(Extension.C_BRAKE);
        return l2.toString();
    }

    public MessageContext(@Json(name = "PayloadId") String str, @Json(name = "Version") long j, @Json(name = "Timestamp") Long l, @Json(name = "ElementId") String str2) {
        this.payloadId = str;
        this.version = j;
        this.timestamp = l;
        this.elementId = str2;
    }
}
