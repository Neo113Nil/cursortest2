package com.ybsdk.feature.merchant.offers.internal.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersSearchSuggestsPageResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersSearchSuggestsPageResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersScreenItemDto;", "listOfMerchantOffersScreenItemDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "nullableDivDataDtoAdapter", "feature-merchant-offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MerchantOffersSearchSuggestsPageResponseJsonAdapter extends JsonAdapter<MerchantOffersSearchSuggestsPageResponse> {
    private final JsonAdapter<List<MerchantOffersScreenItemDto>> listOfMerchantOffersScreenItemDtoAdapter;
    private final JsonAdapter<DivDataDto> nullableDivDataDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("screen_items", "common_div_data");

    public MerchantOffersSearchSuggestsPageResponseJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, MerchantOffersScreenItemDto.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfMerchantOffersScreenItemDtoAdapter = moshi.adapter(newParameterizedType, emptySet, "screenItems");
        this.nullableDivDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "commonDivData");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final MerchantOffersSearchSuggestsPageResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<MerchantOffersScreenItemDto> list = null;
        DivDataDto divDataDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfMerchantOffersScreenItemDtoAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("screenItems", "screen_items", jsonReader);
                }
            } else if (selectName == 1) {
                divDataDto = this.nullableDivDataDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (list != null) {
            return new MerchantOffersSearchSuggestsPageResponse(list, divDataDto);
        }
        throw Util.missingProperty("screenItems", "screen_items", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, MerchantOffersSearchSuggestsPageResponse merchantOffersSearchSuggestsPageResponse) {
        MerchantOffersSearchSuggestsPageResponse merchantOffersSearchSuggestsPageResponse2 = merchantOffersSearchSuggestsPageResponse;
        if (merchantOffersSearchSuggestsPageResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("screen_items");
        this.listOfMerchantOffersScreenItemDtoAdapter.toJson(jsonWriter, (JsonWriter) merchantOffersSearchSuggestsPageResponse2.getScreenItems());
        jsonWriter.name("common_div_data");
        this.nullableDivDataDtoAdapter.toJson(jsonWriter, (JsonWriter) merchantOffersSearchSuggestsPageResponse2.getCommonDivData());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(62, "GeneratedJsonAdapter(MerchantOffersSearchSuggestsPageResponse)");
    }
}
