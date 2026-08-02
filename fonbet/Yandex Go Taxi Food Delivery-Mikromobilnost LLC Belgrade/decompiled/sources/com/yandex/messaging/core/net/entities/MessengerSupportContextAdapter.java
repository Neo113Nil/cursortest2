package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import defpackage.nbb1;
import defpackage.ydz;
import java.util.Map;
import org.json.JSONObject;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/messaging/core/net/entities/MessengerSupportContextAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/MessengerSupportContext;", "<init>", "()V", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MessengerSupportContextAdapter extends JsonAdapter<MessengerSupportContext> {
    @Override // com.squareup.moshi.JsonAdapter
    public final MessengerSupportContext fromJson(JsonReader jsonReader) {
        try {
            jsonReader.setLenient(true);
            Object readJsonValue = jsonReader.readJsonValue();
            Map map = readJsonValue instanceof Map ? (Map) readJsonValue : null;
            if (map != null) {
                return new MessengerSupportContext(new JSONObject(map));
            }
        } catch (Exception e) {
            if (ydz.a.a()) {
                ydz.c("MessengerContextInfoAdapter", "Fail to parse Support Context " + jsonReader, e);
            }
        }
        return null;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, MessengerSupportContext messengerSupportContext) {
        MessengerSupportContext messengerSupportContext2 = messengerSupportContext;
        jsonWriter.jsonValue(nbb1.d(messengerSupportContext2 != null ? messengerSupportContext2.a : null));
    }
}
