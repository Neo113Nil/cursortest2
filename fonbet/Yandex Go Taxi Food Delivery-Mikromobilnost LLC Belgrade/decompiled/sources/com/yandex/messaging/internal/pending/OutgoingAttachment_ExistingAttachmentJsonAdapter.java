package com.yandex.messaging.internal.pending;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/messaging/internal/pending/OutgoingAttachment_ExistingAttachmentJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/internal/pending/OutgoingAttachment$ExistingAttachment;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "nullableStringAdapter", "", "intAdapter", "", "nullableByteArrayAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-entities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OutgoingAttachment_ExistingAttachmentJsonAdapter extends JsonAdapter<OutgoingAttachment$ExistingAttachment> {
    private volatile Constructor<OutgoingAttachment$ExistingAttachment> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<byte[]> nullableByteArrayAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("orig_chat_id", "existing_id", "name", "size", LaunchBrowserActivity.KEY_URI, "mime_type", "width", "height", "duration", "thumb_hash");
    private final JsonAdapter<String> stringAdapter;

    public OutgoingAttachment_ExistingAttachmentJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "originalChatId");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "fileSize");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, LaunchBrowserActivity.KEY_URI);
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "width");
        this.nullableByteArrayAdapter = moshi.adapter(byte[].class, emptySet, "thumbHash");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final OutgoingAttachment$ExistingAttachment fromJson(JsonReader jsonReader) {
        int i;
        jsonReader.beginObject();
        String str = null;
        int i2 = -1;
        Long l = 0L;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Long l2 = null;
        Integer num = null;
        Integer num2 = null;
        byte[] bArr = null;
        while (true) {
            String str6 = str2;
            String str7 = str;
            String str8 = str3;
            String str9 = str4;
            String str10 = str5;
            Long l3 = l2;
            Integer num3 = num;
            if (!jsonReader.hasNext()) {
                Integer num4 = num2;
                jsonReader.endObject();
                if (i2 == -769) {
                    if (str8 == null) {
                        throw Util.missingProperty("originalChatId", "orig_chat_id", jsonReader);
                    }
                    if (str6 == null) {
                        throw Util.missingProperty("existingId", "existing_id", jsonReader);
                    }
                    if (str7 == null) {
                        throw Util.missingProperty("fileName", "name", jsonReader);
                    }
                    if (l3 == null) {
                        throw Util.missingProperty("fileSize", "size", jsonReader);
                    }
                    long longValue = l3.longValue();
                    if (num3 == null) {
                        throw Util.missingProperty("width", "width", jsonReader);
                    }
                    int intValue = num3.intValue();
                    if (num4 != null) {
                        return new OutgoingAttachment$ExistingAttachment(str8, str6, str7, longValue, str9, str10, intValue, num4.intValue(), l.longValue(), bArr);
                    }
                    throw Util.missingProperty("height", "height", jsonReader);
                }
                Constructor<OutgoingAttachment$ExistingAttachment> constructor = this.constructorRef;
                if (constructor == null) {
                    Class<?> cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
                    Class cls2 = Long.TYPE;
                    Class cls3 = Integer.TYPE;
                    i = i2;
                    constructor = OutgoingAttachment$ExistingAttachment.class.getDeclaredConstructor(String.class, String.class, String.class, cls2, String.class, String.class, cls3, cls3, cls2, byte[].class, cls3, cls);
                    this.constructorRef = constructor;
                } else {
                    i = i2;
                }
                Constructor<OutgoingAttachment$ExistingAttachment> constructor2 = constructor;
                if (str8 == null) {
                    throw Util.missingProperty("originalChatId", "orig_chat_id", jsonReader);
                }
                if (str6 == null) {
                    throw Util.missingProperty("existingId", "existing_id", jsonReader);
                }
                if (str7 == null) {
                    throw Util.missingProperty("fileName", "name", jsonReader);
                }
                if (l3 == null) {
                    throw Util.missingProperty("fileSize", "size", jsonReader);
                }
                if (num3 == null) {
                    throw Util.missingProperty("width", "width", jsonReader);
                }
                if (num4 != null) {
                    return constructor2.newInstance(str8, str6, str7, l3, str9, str10, num3, num4, l, bArr, Integer.valueOf(i), null);
                }
                throw Util.missingProperty("height", "height", jsonReader);
            }
            Integer num5 = num2;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str2 = str6;
                    str = str7;
                    str3 = str8;
                    str4 = str9;
                    str5 = str10;
                    l2 = l3;
                    num2 = num5;
                    num = num3;
                case 0:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("originalChatId", "orig_chat_id", jsonReader);
                    }
                    str2 = str6;
                    str = str7;
                    str4 = str9;
                    str5 = str10;
                    l2 = l3;
                    num2 = num5;
                    num = num3;
                case 1:
                    String fromJson = this.stringAdapter.fromJson(jsonReader);
                    if (fromJson == null) {
                        throw Util.unexpectedNull("existingId", "existing_id", jsonReader);
                    }
                    str2 = fromJson;
                    str = str7;
                    str3 = str8;
                    str4 = str9;
                    str5 = str10;
                    l2 = l3;
                    num2 = num5;
                    num = num3;
                case 2:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("fileName", "name", jsonReader);
                    }
                    str2 = str6;
                    str3 = str8;
                    str4 = str9;
                    str5 = str10;
                    l2 = l3;
                    num2 = num5;
                    num = num3;
                case 3:
                    Long fromJson2 = this.longAdapter.fromJson(jsonReader);
                    if (fromJson2 == null) {
                        throw Util.unexpectedNull("fileSize", "size", jsonReader);
                    }
                    l2 = fromJson2;
                    str2 = str6;
                    str = str7;
                    str3 = str8;
                    str4 = str9;
                    str5 = str10;
                    num2 = num5;
                    num = num3;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    str2 = str6;
                    str = str7;
                    str3 = str8;
                    str5 = str10;
                    l2 = l3;
                    num2 = num5;
                    num = num3;
                case 5:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    str2 = str6;
                    str = str7;
                    str3 = str8;
                    str4 = str9;
                    l2 = l3;
                    num2 = num5;
                    num = num3;
                case 6:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("width", "width", jsonReader);
                    }
                    str2 = str6;
                    str = str7;
                    str3 = str8;
                    str4 = str9;
                    str5 = str10;
                    l2 = l3;
                    num2 = num5;
                case 7:
                    num2 = this.intAdapter.fromJson(jsonReader);
                    if (num2 == null) {
                        throw Util.unexpectedNull("height", "height", jsonReader);
                    }
                    str2 = str6;
                    str = str7;
                    str3 = str8;
                    str4 = str9;
                    str5 = str10;
                    l2 = l3;
                    num = num3;
                case 8:
                    l = this.longAdapter.fromJson(jsonReader);
                    if (l == null) {
                        throw Util.unexpectedNull("durationMs", "duration", jsonReader);
                    }
                    i2 &= -257;
                    str2 = str6;
                    str = str7;
                    str3 = str8;
                    str4 = str9;
                    str5 = str10;
                    l2 = l3;
                    num2 = num5;
                    num = num3;
                case 9:
                    bArr = this.nullableByteArrayAdapter.fromJson(jsonReader);
                    i2 &= -513;
                    str2 = str6;
                    str = str7;
                    str3 = str8;
                    str4 = str9;
                    str5 = str10;
                    l2 = l3;
                    num2 = num5;
                    num = num3;
                default:
                    str2 = str6;
                    str = str7;
                    str3 = str8;
                    str4 = str9;
                    str5 = str10;
                    l2 = l3;
                    num2 = num5;
                    num = num3;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, OutgoingAttachment$ExistingAttachment outgoingAttachment$ExistingAttachment) {
        OutgoingAttachment$ExistingAttachment outgoingAttachment$ExistingAttachment2 = outgoingAttachment$ExistingAttachment;
        if (outgoingAttachment$ExistingAttachment2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("orig_chat_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) outgoingAttachment$ExistingAttachment2.getOriginalChatId());
        jsonWriter.name("existing_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) outgoingAttachment$ExistingAttachment2.getExistingId());
        jsonWriter.name("name");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) outgoingAttachment$ExistingAttachment2.getFileName());
        jsonWriter.name("size");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(outgoingAttachment$ExistingAttachment2.getFileSize()));
        jsonWriter.name(LaunchBrowserActivity.KEY_URI);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) outgoingAttachment$ExistingAttachment2.getUri());
        jsonWriter.name("mime_type");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) outgoingAttachment$ExistingAttachment2.getMimeType());
        jsonWriter.name("width");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(outgoingAttachment$ExistingAttachment2.getWidth()));
        jsonWriter.name("height");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(outgoingAttachment$ExistingAttachment2.getHeight()));
        jsonWriter.name("duration");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(outgoingAttachment$ExistingAttachment2.getDurationMs()));
        jsonWriter.name("thumb_hash");
        this.nullableByteArrayAdapter.toJson(jsonWriter, (JsonWriter) outgoingAttachment$ExistingAttachment2.getThumbHash());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(59, "GeneratedJsonAdapter(OutgoingAttachment.ExistingAttachment)");
    }
}
