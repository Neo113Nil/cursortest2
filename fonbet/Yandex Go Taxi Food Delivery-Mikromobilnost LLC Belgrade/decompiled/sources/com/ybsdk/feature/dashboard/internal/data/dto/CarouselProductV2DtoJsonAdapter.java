package com.ybsdk.feature.dashboard.internal.data.dto;

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

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/CarouselProductV2DtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/dashboard/internal/data/dto/CarouselProductV2Dto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/dashboard/internal/data/dto/CardV2Dto;", "cardV2DtoAdapter", "", "Lcom/ybsdk/feature/dashboard/internal/data/dto/HeaderTopButtonsDto;", "listOfHeaderTopButtonsDtoAdapter", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CarouselProductV2DtoJsonAdapter extends JsonAdapter<CarouselProductV2Dto> {
    private final JsonAdapter<CardV2Dto> cardV2DtoAdapter;
    private final JsonAdapter<List<HeaderTopButtonsDto>> listOfHeaderTopButtonsDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("product_type", "card", "header_top_buttons");
    private final JsonAdapter<String> stringAdapter;

    public CarouselProductV2DtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "productType");
        this.cardV2DtoAdapter = moshi.adapter(CardV2Dto.class, emptySet, "card");
        this.listOfHeaderTopButtonsDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, HeaderTopButtonsDto.class), emptySet, "headerTopButtons");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CarouselProductV2Dto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        CardV2Dto cardV2Dto = null;
        List<HeaderTopButtonsDto> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("productType", "product_type", jsonReader);
                }
            } else if (selectName == 1) {
                cardV2Dto = this.cardV2DtoAdapter.fromJson(jsonReader);
                if (cardV2Dto == null) {
                    throw Util.unexpectedNull("card", "card", jsonReader);
                }
            } else if (selectName == 2 && (list = this.listOfHeaderTopButtonsDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("headerTopButtons", "header_top_buttons", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("productType", "product_type", jsonReader);
        }
        if (cardV2Dto == null) {
            throw Util.missingProperty("card", "card", jsonReader);
        }
        if (list != null) {
            return new CarouselProductV2Dto(str, cardV2Dto, list);
        }
        throw Util.missingProperty("headerTopButtons", "header_top_buttons", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CarouselProductV2Dto carouselProductV2Dto) {
        CarouselProductV2Dto carouselProductV2Dto2 = carouselProductV2Dto;
        if (carouselProductV2Dto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("product_type");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) carouselProductV2Dto2.getProductType());
        jsonWriter.name("card");
        this.cardV2DtoAdapter.toJson(jsonWriter, (JsonWriter) carouselProductV2Dto2.getCard());
        jsonWriter.name("header_top_buttons");
        this.listOfHeaderTopButtonsDtoAdapter.toJson(jsonWriter, (JsonWriter) carouselProductV2Dto2.getHeaderTopButtons());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(CarouselProductV2Dto)");
    }
}
