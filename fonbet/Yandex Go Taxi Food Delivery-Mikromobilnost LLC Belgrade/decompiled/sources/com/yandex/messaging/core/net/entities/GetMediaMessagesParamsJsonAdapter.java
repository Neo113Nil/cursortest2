package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/yandex/messaging/core/net/entities/GetMediaMessagesParamsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/GetMediaMessagesParams;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "longAdapter", "", "intAdapter", "", "Lcom/yandex/messaging/core/net/entities/RequestMessageType;", "nullableArrayOfRequestMessageTypeAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetMediaMessagesParamsJsonAdapter extends JsonAdapter<GetMediaMessagesParams> {
    private volatile Constructor<GetMediaMessagesParams> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<RequestMessageType[]> nullableArrayOfRequestMessageTypeAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("chat_id", "invite_hash", "pivot_id", "prev", "next", "types", "query");
    private final JsonAdapter<String> stringAdapter;

    public GetMediaMessagesParamsJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "chatId");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "inviteHash");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "pivotId");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "prev");
        this.nullableArrayOfRequestMessageTypeAdapter = moshi.adapter(Types.arrayOf(RequestMessageType.class), emptySet, "types");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GetMediaMessagesParams fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i = -1;
        String str = null;
        String str2 = null;
        Long l = null;
        Integer num = null;
        Integer num2 = null;
        RequestMessageType[] requestMessageTypeArr = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            String str4 = str;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("chatId", "chat_id", jsonReader);
                    }
                    continue;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    l = this.longAdapter.fromJson(jsonReader);
                    if (l == null) {
                        throw Util.unexpectedNull("pivotId", "pivot_id", jsonReader);
                    }
                    break;
                case 3:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("prev", "prev", jsonReader);
                    }
                    break;
                case 4:
                    num2 = this.intAdapter.fromJson(jsonReader);
                    if (num2 == null) {
                        throw Util.unexpectedNull("next", "next", jsonReader);
                    }
                    break;
                case 5:
                    requestMessageTypeArr = this.nullableArrayOfRequestMessageTypeAdapter.fromJson(jsonReader);
                    i &= -33;
                    break;
                case 6:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -65;
                    break;
            }
            str = str4;
        }
        String str5 = str;
        jsonReader.endObject();
        if (i == -97) {
            if (str5 == null) {
                throw Util.missingProperty("chatId", "chat_id", jsonReader);
            }
            if (l == null) {
                throw Util.missingProperty("pivotId", "pivot_id", jsonReader);
            }
            Integer num3 = num;
            Integer num4 = num2;
            long longValue = l.longValue();
            if (num3 == null) {
                throw Util.missingProperty("prev", "prev", jsonReader);
            }
            RequestMessageType[] requestMessageTypeArr2 = requestMessageTypeArr;
            int intValue = num3.intValue();
            if (num4 == null) {
                throw Util.missingProperty("next", "next", jsonReader);
            }
            return new GetMediaMessagesParams(str5, str2, longValue, intValue, num4.intValue(), requestMessageTypeArr2, str3);
        }
        Integer num5 = num;
        Integer num6 = num2;
        Constructor<GetMediaMessagesParams> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls2 = Long.TYPE;
            Class cls3 = Integer.TYPE;
            constructor = GetMediaMessagesParams.class.getDeclaredConstructor(String.class, String.class, cls2, cls3, cls3, RequestMessageType[].class, String.class, cls3, cls);
            this.constructorRef = constructor;
        }
        Constructor<GetMediaMessagesParams> constructor2 = constructor;
        if (str5 == null) {
            throw Util.missingProperty("chatId", "chat_id", jsonReader);
        }
        if (l == null) {
            throw Util.missingProperty("pivotId", "pivot_id", jsonReader);
        }
        if (num5 == null) {
            throw Util.missingProperty("prev", "prev", jsonReader);
        }
        if (num6 != null) {
            return constructor2.newInstance(str5, str2, l, num5, num6, requestMessageTypeArr, str3, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("next", "next", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GetMediaMessagesParams getMediaMessagesParams) {
        GetMediaMessagesParams getMediaMessagesParams2 = getMediaMessagesParams;
        if (getMediaMessagesParams2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("chat_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) getMediaMessagesParams2.getChatId());
        jsonWriter.name("invite_hash");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) getMediaMessagesParams2.getInviteHash());
        jsonWriter.name("pivot_id");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(getMediaMessagesParams2.getPivotId()));
        jsonWriter.name("prev");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(getMediaMessagesParams2.getPrev()));
        jsonWriter.name("next");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(getMediaMessagesParams2.getNext()));
        jsonWriter.name("types");
        this.nullableArrayOfRequestMessageTypeAdapter.toJson(jsonWriter, (JsonWriter) getMediaMessagesParams2.getTypes());
        jsonWriter.name("query");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) getMediaMessagesParams2.getQuery());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(GetMediaMessagesParams)");
    }
}
