package com.ybsdk.feature.settings.api.data;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.settings.api.data.SettingPropertyDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/settings/api/data/SettingPropertyDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/settings/api/data/SettingPropertyDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/settings/api/data/SettingPropertyDto$Type;", "typeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableBooleanAdapter", "", "nullableStringAdapter", "feature-settings-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SettingPropertyDtoJsonAdapter extends JsonAdapter<SettingPropertyDto> {
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("type", "boolean_value", "action", "analytic_action");
    private final JsonAdapter<SettingPropertyDto.Type> typeAdapter;

    public SettingPropertyDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.typeAdapter = moshi.adapter(SettingPropertyDto.Type.class, emptySet, "type");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "booleanValue");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "action");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SettingPropertyDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        SettingPropertyDto.Type type = null;
        Boolean bool = null;
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                type = this.typeAdapter.fromJson(jsonReader);
                if (type == null) {
                    throw Util.unexpectedNull("type", "type", jsonReader);
                }
            } else if (selectName == 1) {
                bool = this.nullableBooleanAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (type != null) {
            return new SettingPropertyDto(type, bool, str, str2);
        }
        throw Util.missingProperty("type", "type", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SettingPropertyDto settingPropertyDto) {
        SettingPropertyDto settingPropertyDto2 = settingPropertyDto;
        if (settingPropertyDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("type");
        this.typeAdapter.toJson(jsonWriter, (JsonWriter) settingPropertyDto2.getType());
        jsonWriter.name("boolean_value");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) settingPropertyDto2.getBooleanValue());
        jsonWriter.name("action");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) settingPropertyDto2.getAction());
        jsonWriter.name("analytic_action");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) settingPropertyDto2.getAnalyticAction());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(SettingPropertyDto)");
    }
}
