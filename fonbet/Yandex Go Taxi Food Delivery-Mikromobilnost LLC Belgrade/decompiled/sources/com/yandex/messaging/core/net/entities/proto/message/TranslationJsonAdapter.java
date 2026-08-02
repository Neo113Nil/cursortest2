package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/TranslationJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/Translation;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "longAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "stringAdapter", "", "nullableArrayOfStringAdapter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TranslationJsonAdapter extends JsonAdapter<Translation> {
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<String[]> nullableArrayOfStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("Status", "Text", "LanguageCode", "DetectedLanguageCode", "InlineButtonsText");
    private final JsonAdapter<String> stringAdapter;

    public TranslationJsonAdapter(Moshi moshi) {
        Class cls = Long.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.longAdapter = moshi.adapter(cls, emptySet, ACSPConstants.STATUS);
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "text");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "languageCode");
        this.nullableArrayOfStringAdapter = moshi.adapter(Types.arrayOf(String.class), emptySet, "suggests");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Translation fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Long l = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String[] strArr = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                l = this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw Util.unexpectedNull(ACSPConstants.STATUS, "Status", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("languageCode", "LanguageCode", jsonReader);
                }
            } else if (selectName == 3) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                strArr = this.nullableArrayOfStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (l == null) {
            throw Util.missingProperty(ACSPConstants.STATUS, "Status", jsonReader);
        }
        long longValue = l.longValue();
        if (str2 != null) {
            return new Translation(longValue, str, str2, str3, strArr);
        }
        throw Util.missingProperty("languageCode", "LanguageCode", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Translation translation) {
        Translation translation2 = translation;
        if (translation2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("Status");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(translation2.getStatus()));
        jsonWriter.name("Text");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) translation2.getText());
        jsonWriter.name("LanguageCode");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) translation2.getLanguageCode());
        jsonWriter.name("DetectedLanguageCode");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) translation2.getDetectedLanguageCode());
        jsonWriter.name("InlineButtonsText");
        this.nullableArrayOfStringAdapter.toJson(jsonWriter, (JsonWriter) translation2.getSuggests());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(33, "GeneratedJsonAdapter(Translation)");
    }
}
