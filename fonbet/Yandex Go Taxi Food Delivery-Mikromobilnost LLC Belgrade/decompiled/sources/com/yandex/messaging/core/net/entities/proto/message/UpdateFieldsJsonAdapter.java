package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/UpdateFieldsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/UpdateFields;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "", "nullableIntAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UpdateFieldsJsonAdapter extends JsonAdapter<UpdateFields> {
    private volatile Constructor<UpdateFields> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("ChatId", "Timestamp", "ImportanceFlag", "UrlPreviewDisabledFlag");
    private final JsonAdapter<String> stringAdapter;

    public UpdateFieldsJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "chatId");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "messageTimestamp");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "starredStatus");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final UpdateFields fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        Long l = null;
        Integer num = null;
        Integer num2 = null;
        int i = -1;
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
                l = this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw Util.unexpectedNull("messageTimestamp", "Timestamp", jsonReader);
                }
            } else if (selectName == 2) {
                num = this.nullableIntAdapter.fromJson(jsonReader);
                i &= -5;
            } else if (selectName == 3) {
                num2 = this.nullableIntAdapter.fromJson(jsonReader);
                i &= -9;
            }
        }
        jsonReader.endObject();
        if (i == -13) {
            Long l2 = l;
            String str2 = str;
            if (str2 == null) {
                throw Util.missingProperty("chatId", "ChatId", jsonReader);
            }
            if (l2 == null) {
                throw Util.missingProperty("messageTimestamp", "Timestamp", jsonReader);
            }
            return new UpdateFields(str2, l2.longValue(), num, num2);
        }
        Long l3 = l;
        Integer num3 = num;
        String str3 = str;
        Constructor<UpdateFields> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = UpdateFields.class.getDeclaredConstructor(String.class, Long.TYPE, Integer.class, Integer.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        Constructor<UpdateFields> constructor2 = constructor;
        if (str3 == null) {
            throw Util.missingProperty("chatId", "ChatId", jsonReader);
        }
        if (l3 != null) {
            return constructor2.newInstance(str3, l3, num3, num2, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("messageTimestamp", "Timestamp", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, UpdateFields updateFields) {
        UpdateFields updateFields2 = updateFields;
        if (updateFields2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("ChatId");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) updateFields2.getChatId());
        jsonWriter.name("Timestamp");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(updateFields2.getMessageTimestamp()));
        jsonWriter.name("ImportanceFlag");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) updateFields2.getStarredStatus());
        jsonWriter.name("UrlPreviewDisabledFlag");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) updateFields2.getUrlPreviewDisabledFlag());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(34, "GeneratedJsonAdapter(UpdateFields)");
    }
}
