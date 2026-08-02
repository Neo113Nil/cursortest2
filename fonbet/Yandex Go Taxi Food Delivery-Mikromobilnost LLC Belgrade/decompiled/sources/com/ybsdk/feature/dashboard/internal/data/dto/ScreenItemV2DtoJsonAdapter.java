package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.divkit.api.dto.DivKitDataV2Dto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/ScreenItemV2DtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/dashboard/internal/data/dto/ScreenItemV2Dto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/divkit/api/dto/DivKitDataV2Dto;", "divKitDataV2DtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScreenItemV2DtoJsonAdapter extends JsonAdapter<ScreenItemV2Dto> {
    private final JsonAdapter<DivKitDataV2Dto> divKitDataV2DtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("divkit_data", "item_type");
    private final JsonAdapter<String> stringAdapter;

    public ScreenItemV2DtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.divKitDataV2DtoAdapter = moshi.adapter(DivKitDataV2Dto.class, emptySet, "divKitData");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "itemType");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ScreenItemV2Dto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        DivKitDataV2Dto divKitDataV2Dto = null;
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                divKitDataV2Dto = this.divKitDataV2DtoAdapter.fromJson(jsonReader);
                if (divKitDataV2Dto == null) {
                    throw Util.unexpectedNull("divKitData", "divkit_data", jsonReader);
                }
            } else if (selectName == 1 && (str = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("itemType", "item_type", jsonReader);
            }
        }
        jsonReader.endObject();
        if (divKitDataV2Dto == null) {
            throw Util.missingProperty("divKitData", "divkit_data", jsonReader);
        }
        if (str != null) {
            return new ScreenItemV2Dto(divKitDataV2Dto, str);
        }
        throw Util.missingProperty("itemType", "item_type", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ScreenItemV2Dto screenItemV2Dto) {
        ScreenItemV2Dto screenItemV2Dto2 = screenItemV2Dto;
        if (screenItemV2Dto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("divkit_data");
        this.divKitDataV2DtoAdapter.toJson(jsonWriter, (JsonWriter) screenItemV2Dto2.getDivKitData());
        jsonWriter.name("item_type");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) screenItemV2Dto2.getItemType());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(37, "GeneratedJsonAdapter(ScreenItemV2Dto)");
    }
}
