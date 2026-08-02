package com.yandex.messaging.core.net.entities.chatcreate;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.ChatData;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.GenericArrayType;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/yandex/messaging/core/net/entities/chatcreate/GroupChatDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/chatcreate/GroupChatData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lcom/yandex/messaging/core/net/entities/chatcreate/AddRemoveUserError;", "nullableArrayOfAddRemoveUserErrorAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/ChatData;", "chatDataAdapter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GroupChatDataJsonAdapter extends JsonAdapter<GroupChatData> {
    private final JsonAdapter<ChatData> chatDataAdapter;
    private final JsonAdapter<AddRemoveUserError[]> nullableArrayOfAddRemoveUserErrorAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("errors", "chat");

    public GroupChatDataJsonAdapter(Moshi moshi) {
        GenericArrayType arrayOf = Types.arrayOf(AddRemoveUserError.class);
        EmptySet emptySet = EmptySet.a;
        this.nullableArrayOfAddRemoveUserErrorAdapter = moshi.adapter(arrayOf, emptySet, "errors");
        this.chatDataAdapter = moshi.adapter(ChatData.class, emptySet, "chatData");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GroupChatData fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        AddRemoveUserError[] addRemoveUserErrorArr = null;
        boolean z = false;
        ChatData chatData = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                addRemoveUserErrorArr = this.nullableArrayOfAddRemoveUserErrorAdapter.fromJson(jsonReader);
                z = true;
            } else if (selectName == 1 && (chatData = this.chatDataAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("chatData", "chat", jsonReader);
            }
        }
        jsonReader.endObject();
        GroupChatData groupChatData = new GroupChatData();
        if (z) {
            groupChatData.setErrors(addRemoveUserErrorArr);
        }
        if (chatData == null) {
            chatData = groupChatData.getChatData();
        }
        groupChatData.setChatData(chatData);
        return groupChatData;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GroupChatData groupChatData) {
        GroupChatData groupChatData2 = groupChatData;
        if (groupChatData2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("errors");
        this.nullableArrayOfAddRemoveUserErrorAdapter.toJson(jsonWriter, (JsonWriter) groupChatData2.getErrors());
        jsonWriter.name("chat");
        this.chatDataAdapter.toJson(jsonWriter, (JsonWriter) groupChatData2.getChatData());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(35, "GeneratedJsonAdapter(GroupChatData)");
    }
}
