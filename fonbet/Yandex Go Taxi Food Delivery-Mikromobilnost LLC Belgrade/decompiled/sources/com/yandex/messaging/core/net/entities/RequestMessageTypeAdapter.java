package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.ToJson;
import java.util.Map;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"Lcom/yandex/messaging/core/net/entities/RequestMessageTypeAdapter;", "", "<init>", "()V", "toJson", "", "type", "Lcom/yandex/messaging/core/net/entities/RequestMessageType;", "fromJson", "value", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RequestMessageTypeAdapter {
    @FromJson
    public final RequestMessageType fromJson(String value) {
        Map map;
        RequestMessageType.INSTANCE.getClass();
        map = RequestMessageType.map;
        RequestMessageType requestMessageType = (RequestMessageType) map.get(value);
        return requestMessageType == null ? RequestMessageType.UNKNOWN : requestMessageType;
    }

    @ToJson
    public final String toJson(RequestMessageType type) {
        return type.getType();
    }
}
