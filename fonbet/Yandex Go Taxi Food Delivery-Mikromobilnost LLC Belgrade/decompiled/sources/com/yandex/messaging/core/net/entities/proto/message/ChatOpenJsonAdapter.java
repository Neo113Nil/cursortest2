package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.MessengerSupportContext;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/ChatOpenJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/ChatOpen;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/ClientInfo;", "clientInfoAdapter", "Lcom/yandex/messaging/core/net/entities/MessengerSupportContext;", "nullableMessengerSupportContextAdapter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChatOpenJsonAdapter extends JsonAdapter<ChatOpen> {
    private final JsonAdapter<ClientInfo> clientInfoAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<MessengerSupportContext> nullableMessengerSupportContextAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("ChatId", "Type", "ClientInfo", "Context");
    private final JsonAdapter<String> stringAdapter;

    public ChatOpenJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "chatId");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "type");
        this.clientInfoAdapter = moshi.adapter(ClientInfo.class, emptySet, "clientInfo");
        this.nullableMessengerSupportContextAdapter = moshi.adapter(MessengerSupportContext.class, emptySet, "context");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ChatOpen fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        Integer num = null;
        ClientInfo clientInfo = null;
        MessengerSupportContext messengerSupportContext = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("chatId", "ChatId", jsonReader);
                }
            } else if (selectName == 1) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("type", "Type", jsonReader);
                }
            } else if (selectName == 2) {
                clientInfo = this.clientInfoAdapter.fromJson(jsonReader);
                if (clientInfo == null) {
                    throw Util.unexpectedNull("clientInfo", "ClientInfo", jsonReader);
                }
            } else if (selectName == 3) {
                messengerSupportContext = this.nullableMessengerSupportContextAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("chatId", "ChatId", jsonReader);
        }
        if (num == null) {
            throw Util.missingProperty("type", "Type", jsonReader);
        }
        int intValue = num.intValue();
        if (clientInfo != null) {
            return new ChatOpen(str, intValue, clientInfo, messengerSupportContext);
        }
        throw Util.missingProperty("clientInfo", "ClientInfo", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ChatOpen chatOpen) {
        ChatOpen chatOpen2 = chatOpen;
        if (chatOpen2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("ChatId");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) chatOpen2.getChatId());
        jsonWriter.name("Type");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(chatOpen2.getType()));
        jsonWriter.name("ClientInfo");
        this.clientInfoAdapter.toJson(jsonWriter, (JsonWriter) chatOpen2.getClientInfo());
        jsonWriter.name("Context");
        this.nullableMessengerSupportContextAdapter.toJson(jsonWriter, (JsonWriter) chatOpen2.getContext());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(30, "GeneratedJsonAdapter(ChatOpen)");
    }
}
