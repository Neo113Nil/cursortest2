package com.yandex.messaging.internal.entities;

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

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/messaging/internal/entities/ReplyDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/internal/entities/ReplyData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "longAdapter", "", "nullableIntAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ReplyDataJsonAdapter extends JsonAdapter<ReplyData> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ReplyData> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("author_guid", "text", ClidProvider.TIMESTAMP, "fileId", "fileName", "fileSource", "isMedia", "isVoice", "isGallery", "isSticker", "isHiddenByModeration", "isAnimatedImage", "isPoll", "quotedText");
    private final JsonAdapter<String> stringAdapter;

    public ReplyDataJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "authorGuid");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "text");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, ClidProvider.TIMESTAMP);
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "fileSource");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "isMedia");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ReplyData fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        int i = -1;
        Long l = 0L;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Boolean bool4 = bool3;
        Boolean bool5 = bool4;
        Boolean bool6 = bool5;
        Boolean bool7 = bool6;
        Boolean bool8 = bool7;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Integer num = null;
        String str5 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("authorGuid", "author_guid", jsonReader);
                    }
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    l = this.longAdapter.fromJson(jsonReader);
                    if (l == null) {
                        throw Util.unexpectedNull(ClidProvider.TIMESTAMP, ClidProvider.TIMESTAMP, jsonReader);
                    }
                    i &= -5;
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    num = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("isMedia", "isMedia", jsonReader);
                    }
                    i &= -65;
                    break;
                case 7:
                    bool3 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool3 == null) {
                        throw Util.unexpectedNull("isVoice", "isVoice", jsonReader);
                    }
                    i &= -129;
                    break;
                case 8:
                    bool4 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool4 == null) {
                        throw Util.unexpectedNull("isGallery", "isGallery", jsonReader);
                    }
                    i &= -257;
                    break;
                case 9:
                    bool5 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool5 == null) {
                        throw Util.unexpectedNull("isSticker", "isSticker", jsonReader);
                    }
                    i &= -513;
                    break;
                case 10:
                    bool6 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool6 == null) {
                        throw Util.unexpectedNull("isHiddenByModeration", "isHiddenByModeration", jsonReader);
                    }
                    i &= -1025;
                    break;
                case 11:
                    bool7 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool7 == null) {
                        throw Util.unexpectedNull("isAnimatedImage", "isAnimatedImage", jsonReader);
                    }
                    i &= -2049;
                    break;
                case 12:
                    bool8 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool8 == null) {
                        throw Util.unexpectedNull("isPoll", "isPoll", jsonReader);
                    }
                    i &= -4097;
                    break;
                case 13:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -8193;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -16325) {
            if (str != null) {
                return new ReplyData(str, str2, l.longValue(), str3, str4, num, bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue(), bool5.booleanValue(), bool6.booleanValue(), bool7.booleanValue(), bool8.booleanValue(), str5);
            }
            throw Util.missingProperty("authorGuid", "author_guid", jsonReader);
        }
        Constructor<ReplyData> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            Class<?> cls2 = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls3 = Long.TYPE;
            Class cls4 = Boolean.TYPE;
            constructor = ReplyData.class.getDeclaredConstructor(String.class, String.class, cls3, String.class, String.class, Integer.class, cls4, cls4, cls4, cls4, cls4, cls4, cls4, String.class, cls, cls2);
            this.constructorRef = constructor;
        }
        if (str == null) {
            throw Util.missingProperty("authorGuid", "author_guid", jsonReader);
        }
        return constructor.newInstance(str, str2, l, str3, str4, num, bool2, bool3, bool4, bool5, bool6, bool7, bool8, str5, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ReplyData replyData) {
        ReplyData replyData2 = replyData;
        if (replyData2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("author_guid");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) replyData2.getAuthorGuid());
        jsonWriter.name("text");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) replyData2.getText());
        jsonWriter.name(ClidProvider.TIMESTAMP);
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(replyData2.getTimestamp()));
        jsonWriter.name("fileId");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) replyData2.getFileId());
        jsonWriter.name("fileName");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) replyData2.getFileName());
        jsonWriter.name("fileSource");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) replyData2.getFileSource());
        jsonWriter.name("isMedia");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(replyData2.getIsMedia()));
        jsonWriter.name("isVoice");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(replyData2.getIsVoice()));
        jsonWriter.name("isGallery");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(replyData2.getIsGallery()));
        jsonWriter.name("isSticker");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(replyData2.getIsSticker()));
        jsonWriter.name("isHiddenByModeration");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(replyData2.getIsHiddenByModeration()));
        jsonWriter.name("isAnimatedImage");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(replyData2.getIsAnimatedImage()));
        jsonWriter.name("isPoll");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(replyData2.getIsPoll()));
        jsonWriter.name("quotedText");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) replyData2.getQuotedText());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(31, "GeneratedJsonAdapter(ReplyData)");
    }
}
