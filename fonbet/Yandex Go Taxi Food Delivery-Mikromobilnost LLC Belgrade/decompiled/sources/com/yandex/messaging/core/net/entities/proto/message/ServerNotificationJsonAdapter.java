package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.proto.message.ServerNotification;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/ServerNotificationJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/ServerNotification;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/yandex/messaging/core/net/entities/proto/message/ServerNotification$Text;", "nullableTextAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "", "nullableLongAdapter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ServerNotificationJsonAdapter extends JsonAdapter<ServerNotification> {
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<ServerNotification.Text> nullableTextAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("Text", "ChatId", "ToGuid", "PayloadId", "timestampMs");
    private final JsonAdapter<String> stringAdapter;

    public ServerNotificationJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableTextAdapter = moshi.adapter(ServerNotification.Text.class, emptySet, "text");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "chatId");
        this.nullableLongAdapter = moshi.adapter(Long.class, emptySet, "timestampMs");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ServerNotification fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ServerNotification.Text text = null;
        String str = null;
        String str2 = null;
        Long l = null;
        boolean z = false;
        String str3 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                text = this.nullableTextAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                str3 = this.stringAdapter.fromJson(jsonReader);
                if (str3 == null) {
                    throw Util.unexpectedNull("chatId", "ChatId", jsonReader);
                }
            } else if (selectName == 2) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("toGuid", "ToGuid", jsonReader);
                }
            } else if (selectName == 3) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("payloadId", "PayloadId", jsonReader);
                }
            } else if (selectName == 4) {
                l = this.nullableLongAdapter.fromJson(jsonReader);
                z = true;
            }
        }
        jsonReader.endObject();
        if (str3 == null) {
            throw Util.missingProperty("chatId", "ChatId", jsonReader);
        }
        if (str == null) {
            throw Util.missingProperty("toGuid", "ToGuid", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("payloadId", "PayloadId", jsonReader);
        }
        ServerNotification serverNotification = new ServerNotification(text, str3, str, str2);
        if (z) {
            serverNotification.setTimestampMs(l);
        }
        return serverNotification;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ServerNotification serverNotification) {
        ServerNotification serverNotification2 = serverNotification;
        if (serverNotification2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("Text");
        this.nullableTextAdapter.toJson(jsonWriter, (JsonWriter) serverNotification2.getText());
        jsonWriter.name("ChatId");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) serverNotification2.getChatId());
        jsonWriter.name("ToGuid");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) serverNotification2.getToGuid());
        jsonWriter.name("PayloadId");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) serverNotification2.getPayloadId());
        jsonWriter.name("timestampMs");
        this.nullableLongAdapter.toJson(jsonWriter, (JsonWriter) serverNotification2.getTimestampMs());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(ServerNotification)");
    }
}
