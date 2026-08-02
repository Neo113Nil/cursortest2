package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/rconfig/configs/CustomInsetsHandlingConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/CustomInsetsHandlingConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "", "listOfStringAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CustomInsetsHandlingConfigJsonAdapter extends JsonAdapter<CustomInsetsHandlingConfig> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("is_new_fragment_insets_handling_enabled", "new_fragment_insets_handling_black_list", "is_new_bottom_sheet_insets_handling_enabled");

    public CustomInsetsHandlingConfigJsonAdapter(Moshi moshi) {
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.booleanAdapter = moshi.adapter(cls, emptySet, "isNewFragmentInsetsHandlingEnabled");
        this.listOfStringAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), emptySet, "newFragmentInsetsHandlingBlackList");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CustomInsetsHandlingConfig fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        List<String> list = null;
        Boolean bool2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                bool = this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    throw Util.unexpectedNull("isNewFragmentInsetsHandlingEnabled", "is_new_fragment_insets_handling_enabled", jsonReader);
                }
            } else if (selectName == 1) {
                list = this.listOfStringAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("newFragmentInsetsHandlingBlackList", "new_fragment_insets_handling_black_list", jsonReader);
                }
            } else if (selectName == 2 && (bool2 = this.booleanAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("isNewBottomSheetInsetsHandlingEnabled", "is_new_bottom_sheet_insets_handling_enabled", jsonReader);
            }
        }
        jsonReader.endObject();
        if (bool == null) {
            throw Util.missingProperty("isNewFragmentInsetsHandlingEnabled", "is_new_fragment_insets_handling_enabled", jsonReader);
        }
        boolean booleanValue = bool.booleanValue();
        if (list == null) {
            throw Util.missingProperty("newFragmentInsetsHandlingBlackList", "new_fragment_insets_handling_black_list", jsonReader);
        }
        if (bool2 != null) {
            return new CustomInsetsHandlingConfig(booleanValue, list, bool2.booleanValue());
        }
        throw Util.missingProperty("isNewBottomSheetInsetsHandlingEnabled", "is_new_bottom_sheet_insets_handling_enabled", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CustomInsetsHandlingConfig customInsetsHandlingConfig) {
        CustomInsetsHandlingConfig customInsetsHandlingConfig2 = customInsetsHandlingConfig;
        if (customInsetsHandlingConfig2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("is_new_fragment_insets_handling_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(customInsetsHandlingConfig2.isNewFragmentInsetsHandlingEnabled()));
        jsonWriter.name("new_fragment_insets_handling_black_list");
        this.listOfStringAdapter.toJson(jsonWriter, (JsonWriter) customInsetsHandlingConfig2.getNewFragmentInsetsHandlingBlackList());
        jsonWriter.name("is_new_bottom_sheet_insets_handling_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(customInsetsHandlingConfig2.isNewBottomSheetInsetsHandlingEnabled()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(48, "GeneratedJsonAdapter(CustomInsetsHandlingConfig)");
    }
}
