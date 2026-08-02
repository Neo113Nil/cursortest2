package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.cache.ExpireableDto;
import com.ybsdk.feature.banners.api.dto.FullScreenDto;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.educations.api.data.EducationsV2Dto;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR&\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\rR(\u0010\u0016\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\n\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\rR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\rR(\u0010\u001a\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\n\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardV4ResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardV4Response;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lcom/ybsdk/feature/dashboard/internal/data/dto/CarouselProductV2Dto;", "listOfCarouselProductV2DtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "Lcom/ybsdk/core/common/data/network/dto/cache/ExpireableDto;", "Lcom/ybsdk/feature/dashboard/internal/data/dto/ScreenItemV2Dto;", "listOfExpireableDtoOfScreenItemV2DtoAdapter", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "divDataDtoAdapter", "Lcom/ybsdk/feature/banners/api/dto/FullScreenDto;", "nullableExpireableDtoOfListOfFullScreenDtoAdapter", "Lcom/ybsdk/feature/dashboard/internal/data/dto/NfcPayloadDto;", "nullableNfcPayloadDtoAdapter", "Lcom/ybsdk/feature/educations/api/data/EducationsV2Dto;", "nullableExpireableDtoOfListOfEducationsV2DtoAdapter", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DashboardV4ResponseJsonAdapter extends JsonAdapter<DashboardV4Response> {
    private final JsonAdapter<DivDataDto> divDataDtoAdapter;
    private final JsonAdapter<List<CarouselProductV2Dto>> listOfCarouselProductV2DtoAdapter;
    private final JsonAdapter<List<ExpireableDto<ScreenItemV2Dto>>> listOfExpireableDtoOfScreenItemV2DtoAdapter;
    private final JsonAdapter<ExpireableDto<List<EducationsV2Dto>>> nullableExpireableDtoOfListOfEducationsV2DtoAdapter;
    private final JsonAdapter<ExpireableDto<List<FullScreenDto>>> nullableExpireableDtoOfListOfFullScreenDtoAdapter;
    private final JsonAdapter<NfcPayloadDto> nullableNfcPayloadDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("carousel", "product_type", "screen_items", "common_div_data", "fullscreens", "nfc_payload", "educations_v2");
    private final JsonAdapter<String> stringAdapter;

    public DashboardV4ResponseJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, CarouselProductV2Dto.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfCarouselProductV2DtoAdapter = moshi.adapter(newParameterizedType, emptySet, "carousel");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "productType");
        this.listOfExpireableDtoOfScreenItemV2DtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, Types.newParameterizedType(ExpireableDto.class, ScreenItemV2Dto.class)), emptySet, "screenItems");
        this.divDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "commonDivData");
        this.nullableExpireableDtoOfListOfFullScreenDtoAdapter = moshi.adapter(Types.newParameterizedType(ExpireableDto.class, Types.newParameterizedType(List.class, FullScreenDto.class)), emptySet, "fullscreens");
        this.nullableNfcPayloadDtoAdapter = moshi.adapter(NfcPayloadDto.class, emptySet, "nfcPayload");
        this.nullableExpireableDtoOfListOfEducationsV2DtoAdapter = moshi.adapter(Types.newParameterizedType(ExpireableDto.class, Types.newParameterizedType(List.class, EducationsV2Dto.class)), emptySet, "educationsV2");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DashboardV4Response fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<CarouselProductV2Dto> list = null;
        String str = null;
        List<ExpireableDto<ScreenItemV2Dto>> list2 = null;
        DivDataDto divDataDto = null;
        ExpireableDto<List<FullScreenDto>> expireableDto = null;
        NfcPayloadDto nfcPayloadDto = null;
        ExpireableDto<List<EducationsV2Dto>> expireableDto2 = null;
        while (jsonReader.hasNext()) {
            List<CarouselProductV2Dto> list3 = list;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    list = this.listOfCarouselProductV2DtoAdapter.fromJson(jsonReader);
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
                    list2 = this.listOfExpireableDtoOfScreenItemV2DtoAdapter.fromJson(jsonReader);
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
                    expireableDto = this.nullableExpireableDtoOfListOfFullScreenDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    nfcPayloadDto = this.nullableNfcPayloadDtoAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    expireableDto2 = this.nullableExpireableDtoOfListOfEducationsV2DtoAdapter.fromJson(jsonReader);
                    break;
            }
            list = list3;
        }
        List<CarouselProductV2Dto> list4 = list;
        jsonReader.endObject();
        if (list4 == null) {
            throw Util.missingProperty("carousel", "carousel", jsonReader);
        }
        if (str == null) {
            throw Util.missingProperty("productType", "product_type", jsonReader);
        }
        if (list2 == null) {
            throw Util.missingProperty("screenItems", "screen_items", jsonReader);
        }
        if (divDataDto != null) {
            return new DashboardV4Response(list4, str, list2, divDataDto, expireableDto, nfcPayloadDto, expireableDto2);
        }
        throw Util.missingProperty("commonDivData", "common_div_data", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DashboardV4Response dashboardV4Response) {
        DashboardV4Response dashboardV4Response2 = dashboardV4Response;
        if (dashboardV4Response2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("carousel");
        this.listOfCarouselProductV2DtoAdapter.toJson(jsonWriter, (JsonWriter) dashboardV4Response2.getCarousel());
        jsonWriter.name("product_type");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) dashboardV4Response2.getProductType());
        jsonWriter.name("screen_items");
        this.listOfExpireableDtoOfScreenItemV2DtoAdapter.toJson(jsonWriter, (JsonWriter) dashboardV4Response2.getScreenItems());
        jsonWriter.name("common_div_data");
        this.divDataDtoAdapter.toJson(jsonWriter, (JsonWriter) dashboardV4Response2.getCommonDivData());
        jsonWriter.name("fullscreens");
        this.nullableExpireableDtoOfListOfFullScreenDtoAdapter.toJson(jsonWriter, (JsonWriter) dashboardV4Response2.getFullscreens());
        jsonWriter.name("nfc_payload");
        this.nullableNfcPayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) dashboardV4Response2.getNfcPayload());
        jsonWriter.name("educations_v2");
        this.nullableExpireableDtoOfListOfEducationsV2DtoAdapter.toJson(jsonWriter, (JsonWriter) dashboardV4Response2.getEducationsV2());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(DashboardV4Response)");
    }
}
