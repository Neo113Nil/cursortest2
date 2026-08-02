package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.Json;
import com.yandex.messaging.core.net.entities.proto.message.TranslationDataFilter;
import defpackage.xuf0;
import java.util.Arrays;

/* loaded from: classes15.dex */
public class SubscriptionRequest implements ClientTransportMessage {

    @Json(name = "ChatId")
    @xuf0(tag = 2)
    public String chatId;

    @Json(name = "ClientSupportedFeatures")
    @xuf0(tag = 16)
    public Long clientSupportedFeatures;

    @Json(name = "ClientTransportId")
    @xuf0(tag = 15)
    public ClientTransportId clientTransportId;

    @Json(name = "CommonRequestFields")
    @xuf0(tag = 9)
    public CommonRequestFields commonFields;

    @Json(name = "InviteHash")
    @xuf0(tag = 8)
    public String inviteHash;

    @Json(name = "MessageBodyType")
    @xuf0(tag = 7)
    public Integer messageBodyType;

    @Json(name = "MessageBodyTypes")
    @xuf0(tag = 12)
    public Integer[] messageBodyTypes;

    @Json(name = "ToGuid")
    @xuf0(tag = 3)
    public String toGuid;

    @Json(name = "ToGuids")
    @xuf0(tag = 14)
    public String[] toGuids;

    @Json(name = "TranslationDataFilter")
    @xuf0(tag = 13)
    public TranslationDataFilter translationDataFilter;

    @Json(name = "TtlMcs")
    @xuf0(tag = 5)
    public long ttlMcs;

    @Override // com.yandex.messaging.core.net.entities.proto.ClientTransportMessage
    public final void setClientTransportId(ClientTransportId clientTransportId) {
        this.clientTransportId = clientTransportId;
    }

    public final String toString() {
        return "chatId = " + this.chatId + ", toGuid = " + this.toGuid + ", toGuids = " + Arrays.toString(this.toGuids) + ", clientSupportedFeatures = " + this.clientSupportedFeatures;
    }

    @Override // com.yandex.messaging.core.net.entities.proto.ClientTransportMessage
    public final ClientTransportMessage withClientSupportedFeatures(long j) {
        this.clientSupportedFeatures = Long.valueOf(j);
        return this;
    }
}
