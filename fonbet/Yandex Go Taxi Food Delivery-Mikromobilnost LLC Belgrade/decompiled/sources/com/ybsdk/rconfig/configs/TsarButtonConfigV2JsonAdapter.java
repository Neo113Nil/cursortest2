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

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/rconfig/configs/TsarButtonConfigV2JsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/TsarButtonConfigV2;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/TsarButtonContentV2Config;", "nullableTsarButtonContentV2ConfigAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TsarButtonConfigV2JsonAdapter extends JsonAdapter<TsarButtonConfigV2> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<TsarButtonContentV2Config> nullableTsarButtonContentV2ConfigAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("is_enabled", "content");

    public TsarButtonConfigV2JsonAdapter(Moshi moshi) {
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.booleanAdapter = moshi.adapter(cls, emptySet, "isEnabled");
        this.nullableTsarButtonContentV2ConfigAdapter = moshi.adapter(TsarButtonContentV2Config.class, emptySet, "content");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TsarButtonConfigV2 fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        TsarButtonContentV2Config tsarButtonContentV2Config = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                bool = this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    throw Util.unexpectedNull("isEnabled", "is_enabled", jsonReader);
                }
            } else if (selectName == 1) {
                tsarButtonContentV2Config = this.nullableTsarButtonContentV2ConfigAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (bool != null) {
            return new TsarButtonConfigV2(bool.booleanValue(), tsarButtonContentV2Config);
        }
        throw Util.missingProperty("isEnabled", "is_enabled", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TsarButtonConfigV2 tsarButtonConfigV2) {
        TsarButtonConfigV2 tsarButtonConfigV22 = tsarButtonConfigV2;
        if (tsarButtonConfigV22 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("is_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(tsarButtonConfigV22.isEnabled()));
        jsonWriter.name("content");
        this.nullableTsarButtonContentV2ConfigAdapter.toJson(jsonWriter, (JsonWriter) tsarButtonConfigV22.getContent());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(TsarButtonConfigV2)");
    }
}
