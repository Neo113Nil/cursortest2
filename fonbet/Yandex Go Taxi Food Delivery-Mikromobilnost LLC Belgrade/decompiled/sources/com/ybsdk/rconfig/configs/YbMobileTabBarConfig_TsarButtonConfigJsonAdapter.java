package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.rconfig.configs.YbMobileTabBarConfig;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/rconfig/configs/YbMobileTabBarConfig_TsarButtonConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/YbMobileTabBarConfig$TsarButtonConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/utils/text/Text;", "textAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class YbMobileTabBarConfig_TsarButtonConfigJsonAdapter extends JsonAdapter<YbMobileTabBarConfig.TsarButtonConfig> {
    private final JsonReader.Options options = JsonReader.Options.of("text", "action");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<Text> textAdapter;

    public YbMobileTabBarConfig_TsarButtonConfigJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.textAdapter = moshi.adapter(Text.class, emptySet, "text");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "action");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final YbMobileTabBarConfig.TsarButtonConfig fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Text text = null;
        String str = null;
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
            } else if (selectName == 1 && (str = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("action", "action", jsonReader);
            }
        }
        jsonReader.endObject();
        if (text == null) {
            throw Util.missingProperty("text", "text", jsonReader);
        }
        if (str != null) {
            return new YbMobileTabBarConfig.TsarButtonConfig(text, str);
        }
        throw Util.missingProperty("action", "action", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, YbMobileTabBarConfig.TsarButtonConfig tsarButtonConfig) {
        YbMobileTabBarConfig.TsarButtonConfig tsarButtonConfig2 = tsarButtonConfig;
        if (tsarButtonConfig2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("text");
        this.textAdapter.toJson(jsonWriter, (JsonWriter) tsarButtonConfig2.getText());
        jsonWriter.name("action");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) tsarButtonConfig2.getAction());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(59, "GeneratedJsonAdapter(YbMobileTabBarConfig.TsarButtonConfig)");
    }
}
