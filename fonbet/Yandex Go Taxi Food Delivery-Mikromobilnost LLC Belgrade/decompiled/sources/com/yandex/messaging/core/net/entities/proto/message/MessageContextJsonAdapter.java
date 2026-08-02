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

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/MessageContextJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/MessageContext;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "nullableLongAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MessageContextJsonAdapter extends JsonAdapter<MessageContext> {
    private volatile Constructor<MessageContext> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("PayloadId", "Version", "Timestamp", "ElementId");
    private final JsonAdapter<String> stringAdapter;

    public MessageContextJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "payloadId");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "version");
        this.nullableLongAdapter = moshi.adapter(Long.class, emptySet, ClidProvider.TIMESTAMP);
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "elementId");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final MessageContext fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        Long l = null;
        Long l2 = null;
        String str2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("payloadId", "PayloadId", jsonReader);
                }
            } else if (selectName == 1) {
                l = this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw Util.unexpectedNull("version", "Version", jsonReader);
                }
            } else if (selectName == 2) {
                l2 = this.nullableLongAdapter.fromJson(jsonReader);
                i &= -5;
            } else if (selectName == 3) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -9;
            }
        }
        jsonReader.endObject();
        if (i == -13) {
            Long l3 = l;
            String str3 = str;
            if (str3 == null) {
                throw Util.missingProperty("payloadId", "PayloadId", jsonReader);
            }
            if (l3 == null) {
                throw Util.missingProperty("version", "Version", jsonReader);
            }
            return new MessageContext(str3, l3.longValue(), l2, str2);
        }
        Long l4 = l;
        Long l5 = l2;
        String str4 = str;
        Constructor<MessageContext> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = MessageContext.class.getDeclaredConstructor(String.class, Long.TYPE, Long.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        Constructor<MessageContext> constructor2 = constructor;
        if (str4 == null) {
            throw Util.missingProperty("payloadId", "PayloadId", jsonReader);
        }
        if (l4 != null) {
            return constructor2.newInstance(str4, l4, l5, str2, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("version", "Version", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, MessageContext messageContext) {
        MessageContext messageContext2 = messageContext;
        if (messageContext2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("PayloadId");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) messageContext2.getPayloadId());
        jsonWriter.name("Version");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(messageContext2.getVersion()));
        jsonWriter.name("Timestamp");
        this.nullableLongAdapter.toJson(jsonWriter, (JsonWriter) messageContext2.getTimestamp());
        jsonWriter.name("ElementId");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) messageContext2.getElementId());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(36, "GeneratedJsonAdapter(MessageContext)");
    }
}
