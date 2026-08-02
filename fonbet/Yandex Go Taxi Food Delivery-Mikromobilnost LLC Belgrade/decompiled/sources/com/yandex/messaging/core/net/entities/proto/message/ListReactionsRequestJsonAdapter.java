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
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/ListReactionsRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/ListReactionsRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "longAdapter", "nullableLongAdapter", "", "intAdapter", "nullableIntAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ListReactionsRequestJsonAdapter extends JsonAdapter<ListReactionsRequest> {
    private volatile Constructor<ListReactionsRequest> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("ChatId", "InviteHash", "Timestamp", "MaxTimestamp", "Limit", "Mode");
    private final JsonAdapter<String> stringAdapter;

    public ListReactionsRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "chatId");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "inviteHash");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, ClidProvider.TIMESTAMP);
        this.nullableLongAdapter = moshi.adapter(Long.class, emptySet, "maxTimestamp");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "limit");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "mode");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ListReactionsRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i = -1;
        String str = null;
        String str2 = null;
        Long l = null;
        Long l2 = null;
        Integer num = null;
        Integer num2 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("chatId", "ChatId", jsonReader);
                    }
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    l = this.longAdapter.fromJson(jsonReader);
                    if (l == null) {
                        throw Util.unexpectedNull(ClidProvider.TIMESTAMP, "Timestamp", jsonReader);
                    }
                    break;
                case 3:
                    l2 = this.nullableLongAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("limit", "Limit", jsonReader);
                    }
                    break;
                case 5:
                    num2 = this.nullableIntAdapter.fromJson(jsonReader);
                    i = -33;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -33) {
            Long l3 = l;
            String str3 = str2;
            String str4 = str;
            if (str4 == null) {
                throw Util.missingProperty("chatId", "ChatId", jsonReader);
            }
            if (l3 == null) {
                throw Util.missingProperty(ClidProvider.TIMESTAMP, "Timestamp", jsonReader);
            }
            Integer num3 = num;
            Integer num4 = num2;
            Long l4 = l2;
            long longValue = l3.longValue();
            if (num3 != null) {
                return new ListReactionsRequest(str4, str3, longValue, l4, num3.intValue(), num4);
            }
            throw Util.missingProperty("limit", "Limit", jsonReader);
        }
        Long l5 = l;
        Integer num5 = num;
        String str5 = str2;
        String str6 = str;
        Integer num6 = num2;
        Long l6 = l2;
        Constructor<ListReactionsRequest> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls2 = Long.TYPE;
            Class cls3 = Integer.TYPE;
            constructor = ListReactionsRequest.class.getDeclaredConstructor(String.class, String.class, cls2, Long.class, cls3, Integer.class, cls3, cls);
            this.constructorRef = constructor;
        }
        Constructor<ListReactionsRequest> constructor2 = constructor;
        if (str6 == null) {
            throw Util.missingProperty("chatId", "ChatId", jsonReader);
        }
        if (l5 == null) {
            throw Util.missingProperty(ClidProvider.TIMESTAMP, "Timestamp", jsonReader);
        }
        if (num5 != null) {
            return constructor2.newInstance(str6, str5, l5, l6, num5, num6, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("limit", "Limit", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ListReactionsRequest listReactionsRequest) {
        ListReactionsRequest listReactionsRequest2 = listReactionsRequest;
        if (listReactionsRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("ChatId");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) listReactionsRequest2.getChatId());
        jsonWriter.name("InviteHash");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) listReactionsRequest2.getInviteHash());
        jsonWriter.name("Timestamp");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(listReactionsRequest2.getTimestamp()));
        jsonWriter.name("MaxTimestamp");
        this.nullableLongAdapter.toJson(jsonWriter, (JsonWriter) listReactionsRequest2.getMaxTimestamp());
        jsonWriter.name("Limit");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(listReactionsRequest2.getLimit()));
        jsonWriter.name("Mode");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) listReactionsRequest2.getMode());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(ListReactionsRequest)");
    }
}
