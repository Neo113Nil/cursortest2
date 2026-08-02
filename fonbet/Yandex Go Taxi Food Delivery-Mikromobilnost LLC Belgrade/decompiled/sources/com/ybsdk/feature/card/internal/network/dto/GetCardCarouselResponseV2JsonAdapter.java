package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.kju0;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/GetCardCarouselResponseV2JsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/card/internal/network/dto/GetCardCarouselResponseV2;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableBooleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/ybsdk/feature/card/internal/network/dto/CarouselCardDetailsV2;", "listOfCarouselCardDetailsV2Adapter", "Lcom/ybsdk/feature/card/internal/network/dto/CarouselCardPromoV2;", "listOfCarouselCardPromoV2Adapter", "Lcom/ybsdk/feature/card/internal/network/dto/CarouselReferenceDto;", "listOfCarouselReferenceDtoAdapter", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetCardCarouselResponseV2JsonAdapter extends JsonAdapter<GetCardCarouselResponseV2> {
    private final JsonAdapter<List<CarouselCardDetailsV2>> listOfCarouselCardDetailsV2Adapter;
    private final JsonAdapter<List<CarouselCardPromoV2>> listOfCarouselCardPromoV2Adapter;
    private final JsonAdapter<List<CarouselReferenceDto>> listOfCarouselReferenceDtoAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("cards_partial", kju0.b, "promos", "carousel");

    public GetCardCarouselResponseV2JsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "cardsPartial");
        this.listOfCarouselCardDetailsV2Adapter = moshi.adapter(Types.newParameterizedType(List.class, CarouselCardDetailsV2.class), emptySet, kju0.b);
        this.listOfCarouselCardPromoV2Adapter = moshi.adapter(Types.newParameterizedType(List.class, CarouselCardPromoV2.class), emptySet, "promos");
        this.listOfCarouselReferenceDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, CarouselReferenceDto.class), emptySet, "carousel");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GetCardCarouselResponseV2 fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        List<CarouselCardDetailsV2> list = null;
        List<CarouselCardPromoV2> list2 = null;
        List<CarouselReferenceDto> list3 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                bool = this.nullableBooleanAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                list = this.listOfCarouselCardDetailsV2Adapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull(kju0.b, kju0.b, jsonReader);
                }
            } else if (selectName == 2) {
                list2 = this.listOfCarouselCardPromoV2Adapter.fromJson(jsonReader);
                if (list2 == null) {
                    throw Util.unexpectedNull("promos", "promos", jsonReader);
                }
            } else if (selectName == 3 && (list3 = this.listOfCarouselReferenceDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("carousel", "carousel", jsonReader);
            }
        }
        jsonReader.endObject();
        if (list == null) {
            throw Util.missingProperty(kju0.b, kju0.b, jsonReader);
        }
        if (list2 == null) {
            throw Util.missingProperty("promos", "promos", jsonReader);
        }
        if (list3 != null) {
            return new GetCardCarouselResponseV2(bool, list, list2, list3);
        }
        throw Util.missingProperty("carousel", "carousel", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GetCardCarouselResponseV2 getCardCarouselResponseV2) {
        GetCardCarouselResponseV2 getCardCarouselResponseV22 = getCardCarouselResponseV2;
        if (getCardCarouselResponseV22 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("cards_partial");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) getCardCarouselResponseV22.getCardsPartial());
        jsonWriter.name(kju0.b);
        this.listOfCarouselCardDetailsV2Adapter.toJson(jsonWriter, (JsonWriter) getCardCarouselResponseV22.getCards());
        jsonWriter.name("promos");
        this.listOfCarouselCardPromoV2Adapter.toJson(jsonWriter, (JsonWriter) getCardCarouselResponseV22.getPromos());
        jsonWriter.name("carousel");
        this.listOfCarouselReferenceDtoAdapter.toJson(jsonWriter, (JsonWriter) getCardCarouselResponseV22.getCarousel());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(47, "GeneratedJsonAdapter(GetCardCarouselResponseV2)");
    }
}
