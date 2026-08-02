package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.rconfig.model.ThemedImage;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/rconfig/configs/NfcButtonBadgeConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/NfcButtonBadgeConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "themedParameterOfStringAdapter", "Lcom/ybsdk/rconfig/model/ThemedImage;", "nullableThemedImageAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NfcButtonBadgeConfigJsonAdapter extends JsonAdapter<NfcButtonBadgeConfig> {
    private final JsonAdapter<ThemedImage> nullableThemedImageAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("text", "color", "icon");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<ThemedParameter<String>> themedParameterOfStringAdapter;

    public NfcButtonBadgeConfigJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "text");
        this.themedParameterOfStringAdapter = moshi.adapter(Types.newParameterizedType(ThemedParameter.class, String.class), emptySet, "color");
        this.nullableThemedImageAdapter = moshi.adapter(ThemedImage.class, emptySet, "icon");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final NfcButtonBadgeConfig fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        ThemedParameter<String> themedParameter = null;
        ThemedImage themedImage = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("text", "text", jsonReader);
                }
            } else if (selectName == 1) {
                themedParameter = this.themedParameterOfStringAdapter.fromJson(jsonReader);
                if (themedParameter == null) {
                    throw Util.unexpectedNull("color", "color", jsonReader);
                }
            } else if (selectName == 2) {
                themedImage = this.nullableThemedImageAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("text", "text", jsonReader);
        }
        if (themedParameter != null) {
            return new NfcButtonBadgeConfig(str, themedParameter, themedImage);
        }
        throw Util.missingProperty("color", "color", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, NfcButtonBadgeConfig nfcButtonBadgeConfig) {
        NfcButtonBadgeConfig nfcButtonBadgeConfig2 = nfcButtonBadgeConfig;
        if (nfcButtonBadgeConfig2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) nfcButtonBadgeConfig2.getText());
        jsonWriter.name("color");
        this.themedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) nfcButtonBadgeConfig2.getColor());
        jsonWriter.name("icon");
        this.nullableThemedImageAdapter.toJson(jsonWriter, (JsonWriter) nfcButtonBadgeConfig2.getIcon());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(NfcButtonBadgeConfig)");
    }
}
