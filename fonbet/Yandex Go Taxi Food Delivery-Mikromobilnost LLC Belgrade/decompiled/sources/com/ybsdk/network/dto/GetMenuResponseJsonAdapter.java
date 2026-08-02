package com.ybsdk.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/network/dto/GetMenuResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/GetMenuResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "divDataDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableDivDataDtoAdapter", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "", "nullableThemedParameterOfStringAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetMenuResponseJsonAdapter extends JsonAdapter<GetMenuResponse> {
    private final JsonAdapter<DivDataDto> divDataDtoAdapter;
    private final JsonAdapter<DivDataDto> nullableDivDataDtoAdapter;
    private final JsonAdapter<ThemedParameter<String>> nullableThemedParameterOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("divkit_data", "toolbar_divkit_data", "toolbar_background_color");

    public GetMenuResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.divDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "divkitData");
        this.nullableDivDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "toolbarDivkitData");
        this.nullableThemedParameterOfStringAdapter = moshi.adapter(Types.newParameterizedType(ThemedParameter.class, String.class), emptySet, "toolbarBackgroundColor");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GetMenuResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        DivDataDto divDataDto = null;
        DivDataDto divDataDto2 = null;
        ThemedParameter<String> themedParameter = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                divDataDto = this.divDataDtoAdapter.fromJson(jsonReader);
                if (divDataDto == null) {
                    throw Util.unexpectedNull("divkitData", "divkit_data", jsonReader);
                }
            } else if (selectName == 1) {
                divDataDto2 = this.nullableDivDataDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                themedParameter = this.nullableThemedParameterOfStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (divDataDto != null) {
            return new GetMenuResponse(divDataDto, divDataDto2, themedParameter);
        }
        throw Util.missingProperty("divkitData", "divkit_data", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GetMenuResponse getMenuResponse) {
        GetMenuResponse getMenuResponse2 = getMenuResponse;
        if (getMenuResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("divkit_data");
        this.divDataDtoAdapter.toJson(jsonWriter, (JsonWriter) getMenuResponse2.getDivkitData());
        jsonWriter.name("toolbar_divkit_data");
        this.nullableDivDataDtoAdapter.toJson(jsonWriter, (JsonWriter) getMenuResponse2.getToolbarDivkitData());
        jsonWriter.name("toolbar_background_color");
        this.nullableThemedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) getMenuResponse2.getToolbarBackgroundColor());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(37, "GeneratedJsonAdapter(GetMenuResponse)");
    }
}
