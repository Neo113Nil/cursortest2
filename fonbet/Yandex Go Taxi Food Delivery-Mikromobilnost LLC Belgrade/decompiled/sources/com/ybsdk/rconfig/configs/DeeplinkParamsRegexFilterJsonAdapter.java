package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/rconfig/configs/DeeplinkParamsRegexFilterJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/DeeplinkParamsRegexFilter;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DeeplinkParamsRegexFilterJsonAdapter extends JsonAdapter<DeeplinkParamsRegexFilter> {
    private final JsonReader.Options options = JsonReader.Options.of("param", "regex", "replacement");
    private final JsonAdapter<String> stringAdapter;

    public DeeplinkParamsRegexFilterJsonAdapter(Moshi moshi) {
        this.stringAdapter = moshi.adapter(String.class, EmptySet.a, "param");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DeeplinkParamsRegexFilter fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("param_", "param", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("regex", "regex", jsonReader);
                }
            } else if (selectName == 2 && (str3 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("replacement", "replacement", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("param_", "param", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("regex", "regex", jsonReader);
        }
        if (str3 != null) {
            return new DeeplinkParamsRegexFilter(str, str2, str3);
        }
        throw Util.missingProperty("replacement", "replacement", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DeeplinkParamsRegexFilter deeplinkParamsRegexFilter) {
        DeeplinkParamsRegexFilter deeplinkParamsRegexFilter2 = deeplinkParamsRegexFilter;
        if (deeplinkParamsRegexFilter2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("param");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) deeplinkParamsRegexFilter2.getParam());
        jsonWriter.name("regex");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) deeplinkParamsRegexFilter2.getRegex());
        jsonWriter.name("replacement");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) deeplinkParamsRegexFilter2.getReplacement());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(47, "GeneratedJsonAdapter(DeeplinkParamsRegexFilter)");
    }
}
