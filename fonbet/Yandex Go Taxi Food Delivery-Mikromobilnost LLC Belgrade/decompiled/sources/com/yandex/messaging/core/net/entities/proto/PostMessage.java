package com.yandex.messaging.core.net.entities.proto;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;
import defpackage.cex;
import defpackage.jl40;
import defpackage.xuf0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0003\u0010\b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\u0004\b\u000b\u0010\fB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000b\u0010\u000fJ\u0014\u0010\u0019\u001a\u00020\u00012\n\u0010\b\u001a\u00060\tj\u0002`\nH\u0016J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0016\u0010\u001d\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nHÆ\u0003¢\u0006\u0002\u0010\u0015J@\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0003\u0010\b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u000eHÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R(\u0010\b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0016@\u0016X\u0097\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006'"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/PostMessage;", "Lcom/yandex/messaging/core/net/entities/proto/ClientTransportMessage;", "clientMessage", "Lcom/yandex/messaging/core/net/entities/proto/message/ClientMessage;", Constants.REFERRER_API_META, "Lcom/yandex/messaging/core/net/entities/proto/MessageMeta;", "clientTransportId", "Lcom/yandex/messaging/core/net/entities/proto/ClientTransportId;", "clientSupportedFeatures", "", "Lcom/yandex/messaging/base/rights/ProtoBitSet;", "<init>", "(Lcom/yandex/messaging/core/net/entities/proto/message/ClientMessage;Lcom/yandex/messaging/core/net/entities/proto/MessageMeta;Lcom/yandex/messaging/core/net/entities/proto/ClientTransportId;Ljava/lang/Long;)V", "origin", "", "(Lcom/yandex/messaging/core/net/entities/proto/message/ClientMessage;I)V", "getClientTransportId", "()Lcom/yandex/messaging/core/net/entities/proto/ClientTransportId;", "setClientTransportId", "(Lcom/yandex/messaging/core/net/entities/proto/ClientTransportId;)V", "getClientSupportedFeatures", "()Ljava/lang/Long;", "setClientSupportedFeatures", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "withClientSupportedFeatures", "component1", "component2", "component3", "component4", "copy", "(Lcom/yandex/messaging/core/net/entities/proto/message/ClientMessage;Lcom/yandex/messaging/core/net/entities/proto/MessageMeta;Lcom/yandex/messaging/core/net/entities/proto/ClientTransportId;Ljava/lang/Long;)Lcom/yandex/messaging/core/net/entities/proto/PostMessage;", "equals", "", "other", "", "hashCode", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PostMessage implements ClientTransportMessage {

    @cex
    @xuf0(tag = 101)
    public final ClientMessage clientMessage;

    @xuf0(tag = HProv.PP_SET_PIN)
    private Long clientSupportedFeatures;

    @xuf0(tag = 105)
    private ClientTransportId clientTransportId;

    @xuf0(tag = 102)
    public final MessageMeta meta;

    public PostMessage(ClientMessage clientMessage, int i) {
        this(clientMessage, new MessageMeta(i), null, null, 12, null);
    }

    public static /* synthetic */ PostMessage copy$default(PostMessage postMessage, ClientMessage clientMessage, MessageMeta messageMeta, ClientTransportId clientTransportId, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            clientMessage = postMessage.clientMessage;
        }
        if ((i & 2) != 0) {
            messageMeta = postMessage.meta;
        }
        if ((i & 4) != 0) {
            clientTransportId = postMessage.clientTransportId;
        }
        if ((i & 8) != 0) {
            l = postMessage.clientSupportedFeatures;
        }
        return postMessage.copy(clientMessage, messageMeta, clientTransportId, l);
    }

    /* renamed from: component1, reason: from getter */
    public final ClientMessage getClientMessage() {
        return this.clientMessage;
    }

    /* renamed from: component2, reason: from getter */
    public final MessageMeta getMeta() {
        return this.meta;
    }

    /* renamed from: component3, reason: from getter */
    public final ClientTransportId getClientTransportId() {
        return this.clientTransportId;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getClientSupportedFeatures() {
        return this.clientSupportedFeatures;
    }

    public final PostMessage copy(@Json(name = "ClientMessage") ClientMessage clientMessage, @Json(name = "Meta") MessageMeta meta, @Json(name = "ClientTransportId") ClientTransportId clientTransportId, @Json(name = "ClientSupportedFeatures") Long clientSupportedFeatures) {
        return new PostMessage(clientMessage, meta, clientTransportId, clientSupportedFeatures);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostMessage)) {
            return false;
        }
        PostMessage postMessage = (PostMessage) other;
        return jl40.l(this.clientMessage, postMessage.clientMessage) && jl40.l(this.meta, postMessage.meta) && jl40.l(this.clientTransportId, postMessage.clientTransportId) && jl40.l(this.clientSupportedFeatures, postMessage.clientSupportedFeatures);
    }

    public Long getClientSupportedFeatures() {
        return this.clientSupportedFeatures;
    }

    public ClientTransportId getClientTransportId() {
        return this.clientTransportId;
    }

    public int hashCode() {
        int hashCode = (this.meta.hashCode() + (this.clientMessage.hashCode() * 31)) * 31;
        ClientTransportId clientTransportId = this.clientTransportId;
        int hashCode2 = (hashCode + (clientTransportId == null ? 0 : clientTransportId.hashCode())) * 31;
        Long l = this.clientSupportedFeatures;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public void setClientSupportedFeatures(Long l) {
        this.clientSupportedFeatures = l;
    }

    @Override // com.yandex.messaging.core.net.entities.proto.ClientTransportMessage
    public void setClientTransportId(ClientTransportId clientTransportId) {
        this.clientTransportId = clientTransportId;
    }

    public String toString() {
        return "PostMessage(clientMessage=" + this.clientMessage + ", meta=" + this.meta + ", clientTransportId=" + this.clientTransportId + ", clientSupportedFeatures=" + this.clientSupportedFeatures + Extension.C_BRAKE;
    }

    @Override // com.yandex.messaging.core.net.entities.proto.ClientTransportMessage
    public ClientTransportMessage withClientSupportedFeatures(long clientSupportedFeatures) {
        return copy$default(this, null, null, null, Long.valueOf(clientSupportedFeatures), 7, null);
    }

    public /* synthetic */ PostMessage(ClientMessage clientMessage, MessageMeta messageMeta, ClientTransportId clientTransportId, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(clientMessage, messageMeta, (i & 4) != 0 ? null : clientTransportId, (i & 8) != 0 ? null : l);
    }

    public PostMessage(@Json(name = "ClientMessage") ClientMessage clientMessage, @Json(name = "Meta") MessageMeta messageMeta, @Json(name = "ClientTransportId") ClientTransportId clientTransportId, @Json(name = "ClientSupportedFeatures") Long l) {
        this.clientMessage = clientMessage;
        this.meta = messageMeta;
        this.clientTransportId = clientTransportId;
        this.clientSupportedFeatures = l;
    }
}
