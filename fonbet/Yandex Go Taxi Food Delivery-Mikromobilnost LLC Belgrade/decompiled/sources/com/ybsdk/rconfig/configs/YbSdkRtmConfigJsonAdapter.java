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

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/rconfig/configs/YbSdkRtmConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/YbSdkRtmConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "", "Lcom/ybsdk/rconfig/configs/YbSdkRtmConfig$SdkRtmBlackListItem;", "listOfSdkRtmBlackListItemAdapter", "nullableBooleanAdapter", "", "nullableIntAdapter", "nullableListOfStringAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class YbSdkRtmConfigJsonAdapter extends JsonAdapter<YbSdkRtmConfig> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<List<YbSdkRtmConfig.SdkRtmBlackListItem>> listOfSdkRtmBlackListItemAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("is_enabled", "project_name", "blacklist", "trim_additional_enabled", "max_additional_length", "additional_to_trim", "truncated_size", "important_fields");
    private final JsonAdapter<String> stringAdapter;

    public YbSdkRtmConfigJsonAdapter(Moshi moshi) {
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.booleanAdapter = moshi.adapter(cls, emptySet, "isEnabled");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "projectName");
        this.listOfSdkRtmBlackListItemAdapter = moshi.adapter(Types.newParameterizedType(List.class, YbSdkRtmConfig.SdkRtmBlackListItem.class), emptySet, "blackList");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "trimAdditionalEnabled");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "maxAdditionalLength");
        this.nullableListOfStringAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), emptySet, "additionalToTrim");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final YbSdkRtmConfig fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        String str = null;
        List<YbSdkRtmConfig.SdkRtmBlackListItem> list = null;
        Boolean bool2 = null;
        Integer num = null;
        List<String> list2 = null;
        Integer num2 = null;
        List<String> list3 = null;
        while (true) {
            Boolean bool3 = bool;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (bool3 == null) {
                    throw Util.missingProperty("isEnabled", "is_enabled", jsonReader);
                }
                boolean booleanValue = bool3.booleanValue();
                if (str == null) {
                    throw Util.missingProperty("projectName", "project_name", jsonReader);
                }
                if (list != null) {
                    return new YbSdkRtmConfig(booleanValue, str, list, bool2, num, list2, num2, list3);
                }
                throw Util.missingProperty("blackList", "blacklist", jsonReader);
            }
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    bool = this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        throw Util.unexpectedNull("isEnabled", "is_enabled", jsonReader);
                    }
                    continue;
                case 1:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("projectName", "project_name", jsonReader);
                    }
                    break;
                case 2:
                    list = this.listOfSdkRtmBlackListItemAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("blackList", "blacklist", jsonReader);
                    }
                    break;
                case 3:
                    bool2 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    num = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    list2 = this.nullableListOfStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    num2 = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    list3 = this.nullableListOfStringAdapter.fromJson(jsonReader);
                    break;
            }
            bool = bool3;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, YbSdkRtmConfig ybSdkRtmConfig) {
        YbSdkRtmConfig ybSdkRtmConfig2 = ybSdkRtmConfig;
        if (ybSdkRtmConfig2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("is_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(ybSdkRtmConfig2.isEnabled()));
        jsonWriter.name("project_name");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) ybSdkRtmConfig2.getProjectName());
        jsonWriter.name("blacklist");
        this.listOfSdkRtmBlackListItemAdapter.toJson(jsonWriter, (JsonWriter) ybSdkRtmConfig2.getBlackList());
        jsonWriter.name("trim_additional_enabled");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) ybSdkRtmConfig2.getTrimAdditionalEnabled());
        jsonWriter.name("max_additional_length");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) ybSdkRtmConfig2.getMaxAdditionalLength());
        jsonWriter.name("additional_to_trim");
        this.nullableListOfStringAdapter.toJson(jsonWriter, (JsonWriter) ybSdkRtmConfig2.getAdditionalToTrim());
        jsonWriter.name("truncated_size");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) ybSdkRtmConfig2.getTruncatedSize());
        jsonWriter.name("important_fields");
        this.nullableListOfStringAdapter.toJson(jsonWriter, (JsonWriter) ybSdkRtmConfig2.getImportantFields());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(36, "GeneratedJsonAdapter(YbSdkRtmConfig)");
    }
}
