package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.ChangeChatAdminsParams;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.CSPDirectoryConstants;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/yandex/messaging/core/net/entities/ChangeChatAdminsParamsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/ChangeChatAdminsParams;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/ChangeChatAdminsParams$AddRemove;", "addRemoveAdapter", "", "longAdapter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChangeChatAdminsParamsJsonAdapter extends JsonAdapter<ChangeChatAdminsParams> {
    private final JsonAdapter<ChangeChatAdminsParams.AddRemove> addRemoveAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("chat_id", CSPDirectoryConstants.SUBDIRECTORY_USERS, "version");
    private final JsonAdapter<String> stringAdapter;

    public ChangeChatAdminsParamsJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "chatId");
        this.addRemoveAdapter = moshi.adapter(ChangeChatAdminsParams.AddRemove.class, emptySet, CSPDirectoryConstants.SUBDIRECTORY_USERS);
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "version");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ChangeChatAdminsParams fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        ChangeChatAdminsParams.AddRemove addRemove = null;
        Long l = null;
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
                addRemove = this.addRemoveAdapter.fromJson(jsonReader);
                if (addRemove == null) {
                    throw Util.unexpectedNull(CSPDirectoryConstants.SUBDIRECTORY_USERS, CSPDirectoryConstants.SUBDIRECTORY_USERS, jsonReader);
                }
            } else if (selectName == 2 && (l = this.longAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("version", "version", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("chatId", "chat_id", jsonReader);
        }
        if (addRemove == null) {
            throw Util.missingProperty(CSPDirectoryConstants.SUBDIRECTORY_USERS, CSPDirectoryConstants.SUBDIRECTORY_USERS, jsonReader);
        }
        if (l != null) {
            return new ChangeChatAdminsParams(str, addRemove, l.longValue());
        }
        throw Util.missingProperty("version", "version", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ChangeChatAdminsParams changeChatAdminsParams) {
        ChangeChatAdminsParams changeChatAdminsParams2 = changeChatAdminsParams;
        if (changeChatAdminsParams2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("chat_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) changeChatAdminsParams2.getChatId());
        jsonWriter.name(CSPDirectoryConstants.SUBDIRECTORY_USERS);
        this.addRemoveAdapter.toJson(jsonWriter, (JsonWriter) changeChatAdminsParams2.getUsers());
        jsonWriter.name("version");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(changeChatAdminsParams2.getVersion()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(ChangeChatAdminsParams)");
    }
}
