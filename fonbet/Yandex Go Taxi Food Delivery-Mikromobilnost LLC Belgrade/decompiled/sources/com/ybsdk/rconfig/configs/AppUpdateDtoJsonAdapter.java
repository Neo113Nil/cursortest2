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

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/rconfig/configs/AppUpdateDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/AppUpdateDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "", "intAdapter", "nullableIntAdapter", "Lcom/ybsdk/rconfig/configs/AppUpdateUiDataDto;", "nullableAppUpdateUiDataDtoAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AppUpdateDtoJsonAdapter extends JsonAdapter<AppUpdateDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<AppUpdateUiDataDto> nullableAppUpdateUiDataDtoAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("is_enabled", "min_version_build_number_for_update", "show_period_in_day_for_flexible_update", "install_update_period_in_days", "ui_data");
    private final JsonAdapter<String> stringAdapter;

    public AppUpdateDtoJsonAdapter(Moshi moshi) {
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.booleanAdapter = moshi.adapter(cls, emptySet, "isEnabled");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "minVersionBuildNumberForUpdate");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "showPeriodInDays");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "installUpdatePeriodInDays");
        this.nullableAppUpdateUiDataDtoAdapter = moshi.adapter(AppUpdateUiDataDto.class, emptySet, "uiData");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AppUpdateDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        Integer num = null;
        String str = null;
        Integer num2 = null;
        AppUpdateUiDataDto appUpdateUiDataDto = null;
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
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("minVersionBuildNumberForUpdate", "min_version_build_number_for_update", jsonReader);
                }
            } else if (selectName == 2) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("showPeriodInDays", "show_period_in_day_for_flexible_update", jsonReader);
                }
            } else if (selectName == 3) {
                num2 = this.nullableIntAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                appUpdateUiDataDto = this.nullableAppUpdateUiDataDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        Integer num3 = num;
        if (bool == null) {
            throw Util.missingProperty("isEnabled", "is_enabled", jsonReader);
        }
        boolean booleanValue = bool.booleanValue();
        if (str == null) {
            throw Util.missingProperty("minVersionBuildNumberForUpdate", "min_version_build_number_for_update", jsonReader);
        }
        if (num3 != null) {
            return new AppUpdateDto(booleanValue, str, num3.intValue(), num2, appUpdateUiDataDto);
        }
        throw Util.missingProperty("showPeriodInDays", "show_period_in_day_for_flexible_update", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AppUpdateDto appUpdateDto) {
        AppUpdateDto appUpdateDto2 = appUpdateDto;
        if (appUpdateDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("is_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(appUpdateDto2.isEnabled()));
        jsonWriter.name("min_version_build_number_for_update");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) appUpdateDto2.getMinVersionBuildNumberForUpdate());
        jsonWriter.name("show_period_in_day_for_flexible_update");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(appUpdateDto2.getShowPeriodInDays()));
        jsonWriter.name("install_update_period_in_days");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) appUpdateDto2.getInstallUpdatePeriodInDays());
        jsonWriter.name("ui_data");
        this.nullableAppUpdateUiDataDtoAdapter.toJson(jsonWriter, (JsonWriter) appUpdateDto2.getUiData());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(34, "GeneratedJsonAdapter(AppUpdateDto)");
    }
}
