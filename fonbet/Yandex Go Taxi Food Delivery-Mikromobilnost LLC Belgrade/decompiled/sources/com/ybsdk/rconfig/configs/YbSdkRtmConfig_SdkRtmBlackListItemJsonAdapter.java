package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.rconfig.configs.YbSdkRtmConfig;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/rconfig/configs/YbSdkRtmConfig_SdkRtmBlackListItemJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/YbSdkRtmConfig$SdkRtmBlackListItem;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/ybsdk/rconfig/configs/YbSdkRtmConfig$AdditionalRegex;", "listOfAdditionalRegexAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class YbSdkRtmConfig_SdkRtmBlackListItemJsonAdapter extends JsonAdapter<YbSdkRtmConfig.SdkRtmBlackListItem> {
    private final JsonAdapter<List<YbSdkRtmConfig.AdditionalRegex>> listOfAdditionalRegexAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title_regex", "url_regex", "additional_regexes");

    public YbSdkRtmConfig_SdkRtmBlackListItemJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "titleRegex");
        this.listOfAdditionalRegexAdapter = moshi.adapter(Types.newParameterizedType(List.class, YbSdkRtmConfig.AdditionalRegex.class), emptySet, "additionalRegexes");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final YbSdkRtmConfig.SdkRtmBlackListItem fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        List<YbSdkRtmConfig.AdditionalRegex> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2 && (list = this.listOfAdditionalRegexAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("additionalRegexes", "additional_regexes", jsonReader);
            }
        }
        jsonReader.endObject();
        if (list != null) {
            return new YbSdkRtmConfig.SdkRtmBlackListItem(str, str2, list);
        }
        throw Util.missingProperty("additionalRegexes", "additional_regexes", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, YbSdkRtmConfig.SdkRtmBlackListItem sdkRtmBlackListItem) {
        YbSdkRtmConfig.SdkRtmBlackListItem sdkRtmBlackListItem2 = sdkRtmBlackListItem;
        if (sdkRtmBlackListItem2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title_regex");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) sdkRtmBlackListItem2.getTitleRegex());
        jsonWriter.name("url_regex");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) sdkRtmBlackListItem2.getUrlRegex());
        jsonWriter.name("additional_regexes");
        this.listOfAdditionalRegexAdapter.toJson(jsonWriter, (JsonWriter) sdkRtmBlackListItem2.getAdditionalRegexes());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(56, "GeneratedJsonAdapter(YbSdkRtmConfig.SdkRtmBlackListItem)");
    }
}
