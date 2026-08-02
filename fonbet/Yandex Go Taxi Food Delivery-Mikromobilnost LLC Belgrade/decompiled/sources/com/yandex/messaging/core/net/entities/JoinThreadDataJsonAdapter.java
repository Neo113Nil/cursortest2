package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/messaging/core/net/entities/JoinThreadDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/JoinThreadData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/yandex/messaging/core/net/entities/ChatMember;", "chatMemberAdapter", "Lcom/squareup/moshi/JsonAdapter;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class JoinThreadDataJsonAdapter extends JsonAdapter<JoinThreadData> {
    private final JsonAdapter<ChatMember> chatMemberAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("chat_member");

    public JoinThreadDataJsonAdapter(Moshi moshi) {
        this.chatMemberAdapter = moshi.adapter(ChatMember.class, EmptySet.a, "chatMember");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final JoinThreadData fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ChatMember chatMember = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0 && (chatMember = this.chatMemberAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("chatMember", "chat_member", jsonReader);
            }
        }
        jsonReader.endObject();
        if (chatMember != null) {
            return new JoinThreadData(chatMember);
        }
        throw Util.missingProperty("chatMember", "chat_member", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, JoinThreadData joinThreadData) {
        JoinThreadData joinThreadData2 = joinThreadData;
        if (joinThreadData2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("chat_member");
        this.chatMemberAdapter.toJson(jsonWriter, (JsonWriter) joinThreadData2.getChatMember());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(36, "GeneratedJsonAdapter(JoinThreadData)");
    }
}
