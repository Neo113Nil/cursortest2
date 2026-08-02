package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.banners.api.dto.FullScreenDto;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.educations.api.data.EducationsV2Dto;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\rR\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardV3ResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardV3Response;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lcom/ybsdk/feature/dashboard/internal/data/dto/CarouselProductDto;", "listOfCarouselProductDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "Lcom/ybsdk/feature/dashboard/internal/data/dto/ScreenItem;", "listOfScreenItemAdapter", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "divDataDtoAdapter", "Lcom/ybsdk/feature/banners/api/dto/FullScreenDto;", "nullableListOfFullScreenDtoAdapter", "Lcom/ybsdk/feature/dashboard/internal/data/dto/NfcPayloadDto;", "nullableNfcPayloadDtoAdapter", "Lcom/ybsdk/feature/educations/api/data/EducationsV2Dto;", "nullableListOfEducationsV2DtoAdapter", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DashboardV3ResponseJsonAdapter extends JsonAdapter<DashboardV3Response> {
    private final JsonAdapter<DivDataDto> divDataDtoAdapter;
    private final JsonAdapter<List<CarouselProductDto>> listOfCarouselProductDtoAdapter;
    private final JsonAdapter<List<ScreenItem>> listOfScreenItemAdapter;
    private final JsonAdapter<List<EducationsV2Dto>> nullableListOfEducationsV2DtoAdapter;
    private final JsonAdapter<List<FullScreenDto>> nullableListOfFullScreenDtoAdapter;
    private final JsonAdapter<NfcPayloadDto> nullableNfcPayloadDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("carousel", "product_type", "screen_items", "common_div_data", "fullscreens", "nfc_payload", "educations_v2");
    private final JsonAdapter<String> stringAdapter;

    public DashboardV3ResponseJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, CarouselProductDto.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfCarouselProductDtoAdapter = moshi.adapter(newParameterizedType, emptySet, "carousel");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "productType");
        this.listOfScreenItemAdapter = moshi.adapter(Types.newParameterizedType(List.class, ScreenItem.class), emptySet, "screenItems");
        this.divDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "commonDivData");
        this.nullableListOfFullScreenDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, FullScreenDto.class), emptySet, "fullscreens");
        this.nullableNfcPayloadDtoAdapter = moshi.adapter(NfcPayloadDto.class, emptySet, "nfcPayload");
        this.nullableListOfEducationsV2DtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, EducationsV2Dto.class), emptySet, "educationsV2");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DashboardV3Response fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<CarouselProductDto> list = null;
        String str = null;
        List<ScreenItem> list2 = null;
        DivDataDto divDataDto = null;
        List<FullScreenDto> list3 = null;
        NfcPayloadDto nfcPayloadDto = null;
        List<EducationsV2Dto> list4 = null;
        while (jsonReader.hasNext()) {
            List<CarouselProductDto> list5 = list;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    list = this.listOfCarouselProductDtoAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("carousel", "carousel", jsonReader);
                    }
                    continue;
                case 1:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("productType", "product_type", jsonReader);
                    }
                    break;
                case 2:
                    list2 = this.listOfScreenItemAdapter.fromJson(jsonReader);
                    if (list2 == null) {
                        throw Util.unexpectedNull("screenItems", "screen_items", jsonReader);
                    }
                    break;
                case 3:
                    divDataDto = this.divDataDtoAdapter.fromJson(jsonReader);
                    if (divDataDto == null) {
                        throw Util.unexpectedNull("commonDivData", "common_div_data", jsonReader);
                    }
                    break;
                case 4:
                    list3 = this.nullableListOfFullScreenDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    nfcPayloadDto = this.nullableNfcPayloadDtoAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    list4 = this.nullableListOfEducationsV2DtoAdapter.fromJson(jsonReader);
                    break;
            }
            list = list5;
        }
        List<CarouselProductDto> list6 = list;
        jsonReader.endObject();
        if (list6 == null) {
            throw Util.missingProperty("carousel", "carousel", jsonReader);
        }
        if (str == null) {
            throw Util.missingProperty("productType", "product_type", jsonReader);
        }
        if (list2 == null) {
            throw Util.missingProperty("screenItems", "screen_items", jsonReader);
        }
        if (divDataDto != null) {
            return new DashboardV3Response(list6, str, list2, divDataDto, list3, nfcPayloadDto, list4);
        }
        throw Util.missingProperty("commonDivData", "common_div_data", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DashboardV3Response dashboardV3Response) {
        DashboardV3Response dashboardV3Response2 = dashboardV3Response;
        if (dashboardV3Response2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("carousel");
        this.listOfCarouselProductDtoAdapter.toJson(jsonWriter, (JsonWriter) dashboardV3Response2.getCarousel());
        jsonWriter.name("product_type");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) dashboardV3Response2.getProductType());
        jsonWriter.name("screen_items");
        this.listOfScreenItemAdapter.toJson(jsonWriter, (JsonWriter) dashboardV3Response2.getScreenItems());
        jsonWriter.name("common_div_data");
        this.divDataDtoAdapter.toJson(jsonWriter, (JsonWriter) dashboardV3Response2.getCommonDivData());
        jsonWriter.name("fullscreens");
        this.nullableListOfFullScreenDtoAdapter.toJson(jsonWriter, (JsonWriter) dashboardV3Response2.getFullscreens());
        jsonWriter.name("nfc_payload");
        this.nullableNfcPayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) dashboardV3Response2.getNfcPayload());
        jsonWriter.name("educations_v2");
        this.nullableListOfEducationsV2DtoAdapter.toJson(jsonWriter, (JsonWriter) dashboardV3Response2.getEducationsV2());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(DashboardV3Response)");
    }
}
