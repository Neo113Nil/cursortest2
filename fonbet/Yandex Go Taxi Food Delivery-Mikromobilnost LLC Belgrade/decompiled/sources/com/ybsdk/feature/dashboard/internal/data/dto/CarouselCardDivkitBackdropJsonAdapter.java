package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/CarouselCardDivkitBackdropJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/dashboard/internal/data/dto/CarouselCardDivkitBackdrop;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "doubleAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "divDataDtoAdapter", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CarouselCardDivkitBackdropJsonAdapter extends JsonAdapter<CarouselCardDivkitBackdrop> {
    private final JsonAdapter<DivDataDto> divDataDtoAdapter;
    private final JsonAdapter<Double> doubleAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("padding_bottom", "divkit_data");

    public CarouselCardDivkitBackdropJsonAdapter(Moshi moshi) {
        Class cls = Double.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.doubleAdapter = moshi.adapter(cls, emptySet, "paddingBottom");
        this.divDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "divkitData");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CarouselCardDivkitBackdrop fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Double d = null;
        DivDataDto divDataDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                d = this.doubleAdapter.fromJson(jsonReader);
                if (d == null) {
                    throw Util.unexpectedNull("paddingBottom", "padding_bottom", jsonReader);
                }
            } else if (selectName == 1 && (divDataDto = this.divDataDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("divkitData", "divkit_data", jsonReader);
            }
        }
        jsonReader.endObject();
        if (d == null) {
            throw Util.missingProperty("paddingBottom", "padding_bottom", jsonReader);
        }
        double doubleValue = d.doubleValue();
        if (divDataDto != null) {
            return new CarouselCardDivkitBackdrop(doubleValue, divDataDto);
        }
        throw Util.missingProperty("divkitData", "divkit_data", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CarouselCardDivkitBackdrop carouselCardDivkitBackdrop) {
        CarouselCardDivkitBackdrop carouselCardDivkitBackdrop2 = carouselCardDivkitBackdrop;
        if (carouselCardDivkitBackdrop2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("padding_bottom");
        this.doubleAdapter.toJson(jsonWriter, (JsonWriter) Double.valueOf(carouselCardDivkitBackdrop2.getPaddingBottom()));
        jsonWriter.name("divkit_data");
        this.divDataDtoAdapter.toJson(jsonWriter, (JsonWriter) carouselCardDivkitBackdrop2.getDivkitData());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(48, "GeneratedJsonAdapter(CarouselCardDivkitBackdrop)");
    }
}
