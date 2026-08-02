package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/yandex/messaging/core/net/entities/ChatParticipantsSearchParamsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/ChatParticipantsSearchParams;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChatParticipantsSearchParamsJsonAdapter extends JsonAdapter<ChatParticipantsSearchParams> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("chat_id", "query", "limit");
    private final JsonAdapter<String> stringAdapter;

    public ChatParticipantsSearchParamsJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "chatId");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "limit");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ChatParticipantsSearchParams fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        Integer num = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("chatId", "chat_id", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("query", "query", jsonReader);
                }
            } else if (selectName == 2 && (num = this.intAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("limit", "limit", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("chatId", "chat_id", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("query", "query", jsonReader);
        }
        if (num != null) {
            return new ChatParticipantsSearchParams(str, str2, num.intValue());
        }
        throw Util.missingProperty("limit", "limit", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ChatParticipantsSearchParams chatParticipantsSearchParams) {
        ChatParticipantsSearchParams chatParticipantsSearchParams2 = chatParticipantsSearchParams;
        if (chatParticipantsSearchParams2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("chat_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) chatParticipantsSearchParams2.getChatId());
        jsonWriter.name("query");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) chatParticipantsSearchParams2.getQuery());
        jsonWriter.name("limit");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(chatParticipantsSearchParams2.getLimit()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(50, "GeneratedJsonAdapter(ChatParticipantsSearchParams)");
    }
}
