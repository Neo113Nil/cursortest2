package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.rconfig.model.ThemedImage;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/rconfig/configs/TsarButtonContentV2ConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/TsarButtonContentV2Config;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/utils/text/Text;", "textAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "Lcom/ybsdk/rconfig/model/ThemedImage;", "themedImageAdapter", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "nullableThemedParameterOfStringAdapter", "Lcom/ybsdk/rconfig/configs/TsarButtonGradientV2Config;", "nullableTsarButtonGradientV2ConfigAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TsarButtonContentV2ConfigJsonAdapter extends JsonAdapter<TsarButtonContentV2Config> {
    private final JsonAdapter<ThemedParameter<String>> nullableThemedParameterOfStringAdapter;
    private final JsonAdapter<TsarButtonGradientV2Config> nullableTsarButtonGradientV2ConfigAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("text", "action", "icon", "color", "gradient_configuration");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<Text> textAdapter;
    private final JsonAdapter<ThemedImage> themedImageAdapter;

    public TsarButtonContentV2ConfigJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.textAdapter = moshi.adapter(Text.class, emptySet, "text");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "action");
        this.themedImageAdapter = moshi.adapter(ThemedImage.class, emptySet, "icon");
        this.nullableThemedParameterOfStringAdapter = moshi.adapter(Types.newParameterizedType(ThemedParameter.class, String.class), emptySet, "color");
        this.nullableTsarButtonGradientV2ConfigAdapter = moshi.adapter(TsarButtonGradientV2Config.class, emptySet, "gradientConfiguration");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TsarButtonContentV2Config fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Text text = null;
        String str = null;
        ThemedImage themedImage = null;
        ThemedParameter<String> themedParameter = null;
        TsarButtonGradientV2Config tsarButtonGradientV2Config = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                text = this.textAdapter.fromJson(jsonReader);
                if (text == null) {
                    throw Util.unexpectedNull("text", "text", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("action", "action", jsonReader);
                }
            } else if (selectName == 2) {
                themedImage = this.themedImageAdapter.fromJson(jsonReader);
                if (themedImage == null) {
                    throw Util.unexpectedNull("icon", "icon", jsonReader);
                }
            } else if (selectName == 3) {
                themedParameter = this.nullableThemedParameterOfStringAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                tsarButtonGradientV2Config = this.nullableTsarButtonGradientV2ConfigAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (text == null) {
            throw Util.missingProperty("text", "text", jsonReader);
        }
        if (str == null) {
            throw Util.missingProperty("action", "action", jsonReader);
        }
        if (themedImage != null) {
            return new TsarButtonContentV2Config(text, str, themedImage, themedParameter, tsarButtonGradientV2Config);
        }
        throw Util.missingProperty("icon", "icon", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TsarButtonContentV2Config tsarButtonContentV2Config) {
        TsarButtonContentV2Config tsarButtonContentV2Config2 = tsarButtonContentV2Config;
        if (tsarButtonContentV2Config2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("text");
        this.textAdapter.toJson(jsonWriter, (JsonWriter) tsarButtonContentV2Config2.getText());
        jsonWriter.name("action");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) tsarButtonContentV2Config2.getAction());
        jsonWriter.name("icon");
        this.themedImageAdapter.toJson(jsonWriter, (JsonWriter) tsarButtonContentV2Config2.getIcon());
        jsonWriter.name("color");
        this.nullableThemedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) tsarButtonContentV2Config2.getColor());
        jsonWriter.name("gradient_configuration");
        this.nullableTsarButtonGradientV2ConfigAdapter.toJson(jsonWriter, (JsonWriter) tsarButtonContentV2Config2.getGradientConfiguration());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(47, "GeneratedJsonAdapter(TsarButtonContentV2Config)");
    }
}
