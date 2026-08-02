package com.ybsdk.feature.status.screen.internal.data;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.feature.banners.api.dto.FullScreenDto;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.educations.api.data.EducationsV2Dto;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\"\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/status/screen/internal/data/DivCommonResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/status/screen/internal/data/DivCommonResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "divDataDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "nullableDivDataDtoAdapter", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "nullableThemedParameterOfStringAdapter", "", "Lcom/ybsdk/feature/banners/api/dto/FullScreenDto;", "nullableListOfFullScreenDtoAdapter", "Lcom/ybsdk/feature/educations/api/data/EducationsV2Dto;", "nullableListOfEducationsV2DtoAdapter", "feature-divkit-common-screen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DivCommonResponseJsonAdapter extends JsonAdapter<DivCommonResponse> {
    private final JsonAdapter<DivDataDto> divDataDtoAdapter;
    private final JsonAdapter<DivDataDto> nullableDivDataDtoAdapter;
    private final JsonAdapter<List<EducationsV2Dto>> nullableListOfEducationsV2DtoAdapter;
    private final JsonAdapter<List<FullScreenDto>> nullableListOfFullScreenDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<ThemedParameter<String>> nullableThemedParameterOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("divkit_data", "title", "subtitle", "toolbar_divkit_data", "toolbar_background_color", "fullscreens", "educations_v2");

    public DivCommonResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.divDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "divData");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableDivDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "toolbarDivData");
        this.nullableThemedParameterOfStringAdapter = moshi.adapter(Types.newParameterizedType(ThemedParameter.class, String.class), emptySet, "toolbarBackgroundColor");
        this.nullableListOfFullScreenDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, FullScreenDto.class), emptySet, "fullscreens");
        this.nullableListOfEducationsV2DtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, EducationsV2Dto.class), emptySet, "educationsV2");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DivCommonResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        DivDataDto divDataDto = null;
        String str = null;
        String str2 = null;
        DivDataDto divDataDto2 = null;
        ThemedParameter<String> themedParameter = null;
        List<FullScreenDto> list = null;
        List<EducationsV2Dto> list2 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    divDataDto = this.divDataDtoAdapter.fromJson(jsonReader);
                    if (divDataDto == null) {
                        throw Util.unexpectedNull("divData", "divkit_data", jsonReader);
                    }
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    divDataDto2 = this.nullableDivDataDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    themedParameter = this.nullableThemedParameterOfStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    list = this.nullableListOfFullScreenDtoAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    list2 = this.nullableListOfEducationsV2DtoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (divDataDto != null) {
            return new DivCommonResponse(divDataDto, str, str2, divDataDto2, themedParameter, list, list2);
        }
        throw Util.missingProperty("divData", "divkit_data", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DivCommonResponse divCommonResponse) {
        DivCommonResponse divCommonResponse2 = divCommonResponse;
        if (divCommonResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("divkit_data");
        this.divDataDtoAdapter.toJson(jsonWriter, (JsonWriter) divCommonResponse2.getDivData());
        jsonWriter.name("title");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) divCommonResponse2.getTitle());
        jsonWriter.name("subtitle");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) divCommonResponse2.getSubtitle());
        jsonWriter.name("toolbar_divkit_data");
        this.nullableDivDataDtoAdapter.toJson(jsonWriter, (JsonWriter) divCommonResponse2.getToolbarDivData());
        jsonWriter.name("toolbar_background_color");
        this.nullableThemedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) divCommonResponse2.getToolbarBackgroundColor());
        jsonWriter.name("fullscreens");
        this.nullableListOfFullScreenDtoAdapter.toJson(jsonWriter, (JsonWriter) divCommonResponse2.getFullscreens());
        jsonWriter.name("educations_v2");
        this.nullableListOfEducationsV2DtoAdapter.toJson(jsonWriter, (JsonWriter) divCommonResponse2.getEducationsV2());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(DivCommonResponse)");
    }
}
