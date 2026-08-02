package com.ybsdk.feature.merchant.offers.internal.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.adapters.SkipFailingElements;
import com.ybsdk.feature.banners.api.dto.FullScreenDto;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\"\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersScreenResponseV2JsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersScreenResponseV2;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOfferBannerItemDto;", "listOfMerchantOfferBannerItemDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "nullableDivDataDtoAdapter", "Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersScreenItemDto;", "listOfMerchantOffersScreenItemDtoAtSkipFailingElementsAdapter", "", "nullableStringAdapter", "nullableListOfStringAdapter", "Lcom/ybsdk/feature/banners/api/dto/FullScreenDto;", "nullableListOfFullScreenDtoAdapter", "feature-merchant-offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MerchantOffersScreenResponseV2JsonAdapter extends JsonAdapter<MerchantOffersScreenResponseV2> {
    private final JsonAdapter<List<MerchantOfferBannerItemDto>> listOfMerchantOfferBannerItemDtoAdapter;
    private final JsonAdapter<List<MerchantOffersScreenItemDto>> listOfMerchantOffersScreenItemDtoAtSkipFailingElementsAdapter;
    private final JsonAdapter<DivDataDto> nullableDivDataDtoAdapter;
    private final JsonAdapter<List<FullScreenDto>> nullableListOfFullScreenDtoAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("stories_banners", "common_div_data", "screen_items", "ml_request_id", "remaining_offer_ids", "fullscreens");

    public MerchantOffersScreenResponseV2JsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, MerchantOfferBannerItemDto.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfMerchantOfferBannerItemDtoAdapter = moshi.adapter(newParameterizedType, emptySet, "bannerItems");
        this.nullableDivDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "commonDivData");
        this.listOfMerchantOffersScreenItemDtoAtSkipFailingElementsAdapter = moshi.adapter(Types.newParameterizedType(List.class, MerchantOffersScreenItemDto.class), Collections.singleton(new SkipFailingElements() { // from class: com.ybsdk.feature.merchant.offers.internal.data.network.dto.MerchantOffersScreenResponseV2JsonAdapter.a
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return SkipFailingElements.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return obj instanceof SkipFailingElements;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            public final String toString() {
                return "@com.ybsdk.core.common.data.network.adapters.SkipFailingElements()";
            }
        }), "screenItems");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "mlRequestId");
        this.nullableListOfStringAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), emptySet, "remainingOfferIds");
        this.nullableListOfFullScreenDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, FullScreenDto.class), emptySet, "fullScreens");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final MerchantOffersScreenResponseV2 fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<MerchantOfferBannerItemDto> list = null;
        DivDataDto divDataDto = null;
        List<MerchantOffersScreenItemDto> list2 = null;
        String str = null;
        List<String> list3 = null;
        List<FullScreenDto> list4 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    list = this.listOfMerchantOfferBannerItemDtoAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("bannerItems", "stories_banners", jsonReader);
                    }
                    break;
                case 1:
                    divDataDto = this.nullableDivDataDtoAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    list2 = this.listOfMerchantOffersScreenItemDtoAtSkipFailingElementsAdapter.fromJson(jsonReader);
                    if (list2 == null) {
                        throw Util.unexpectedNull("screenItems", "screen_items", jsonReader);
                    }
                    break;
                case 3:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    list3 = this.nullableListOfStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    list4 = this.nullableListOfFullScreenDtoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (list == null) {
            throw Util.missingProperty("bannerItems", "stories_banners", jsonReader);
        }
        if (list2 != null) {
            return new MerchantOffersScreenResponseV2(list, divDataDto, list2, str, list3, list4);
        }
        throw Util.missingProperty("screenItems", "screen_items", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, MerchantOffersScreenResponseV2 merchantOffersScreenResponseV2) {
        MerchantOffersScreenResponseV2 merchantOffersScreenResponseV22 = merchantOffersScreenResponseV2;
        if (merchantOffersScreenResponseV22 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("stories_banners");
        this.listOfMerchantOfferBannerItemDtoAdapter.toJson(jsonWriter, (JsonWriter) merchantOffersScreenResponseV22.getBannerItems());
        jsonWriter.name("common_div_data");
        this.nullableDivDataDtoAdapter.toJson(jsonWriter, (JsonWriter) merchantOffersScreenResponseV22.getCommonDivData());
        jsonWriter.name("screen_items");
        this.listOfMerchantOffersScreenItemDtoAtSkipFailingElementsAdapter.toJson(jsonWriter, (JsonWriter) merchantOffersScreenResponseV22.getScreenItems());
        jsonWriter.name("ml_request_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) merchantOffersScreenResponseV22.getMlRequestId());
        jsonWriter.name("remaining_offer_ids");
        this.nullableListOfStringAdapter.toJson(jsonWriter, (JsonWriter) merchantOffersScreenResponseV22.getRemainingOfferIds());
        jsonWriter.name("fullscreens");
        this.nullableListOfFullScreenDtoAdapter.toJson(jsonWriter, (JsonWriter) merchantOffersScreenResponseV22.getFullScreens());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(52, "GeneratedJsonAdapter(MerchantOffersScreenResponseV2)");
    }
}
