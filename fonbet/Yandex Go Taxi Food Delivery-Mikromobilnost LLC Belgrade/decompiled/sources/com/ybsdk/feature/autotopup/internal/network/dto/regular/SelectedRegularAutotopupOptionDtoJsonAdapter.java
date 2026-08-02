package com.ybsdk.feature.autotopup.internal.network.dto.regular;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SelectedRegularAutotopupOptionDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SelectedRegularAutotopupOptionDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupTypeDto;", "regularAutotopupTypeDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/OncePerWeekDto;", "nullableOncePerWeekDtoAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/OncePerMonthDto;", "nullableOncePerMonthDtoAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/TwicePerMonthDto;", "nullableTwicePerMonthDtoAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelectedRegularAutotopupOptionDtoJsonAdapter extends JsonAdapter<SelectedRegularAutotopupOptionDto> {
    private final JsonAdapter<OncePerMonthDto> nullableOncePerMonthDtoAdapter;
    private final JsonAdapter<OncePerWeekDto> nullableOncePerWeekDtoAdapter;
    private final JsonAdapter<TwicePerMonthDto> nullableTwicePerMonthDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("selected_option_id", "once_per_week", "once_per_month", "twice_per_month");
    private final JsonAdapter<RegularAutotopupTypeDto> regularAutotopupTypeDtoAdapter;

    public SelectedRegularAutotopupOptionDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.regularAutotopupTypeDtoAdapter = moshi.adapter(RegularAutotopupTypeDto.class, emptySet, "selected");
        this.nullableOncePerWeekDtoAdapter = moshi.adapter(OncePerWeekDto.class, emptySet, "oncePerWeek");
        this.nullableOncePerMonthDtoAdapter = moshi.adapter(OncePerMonthDto.class, emptySet, "oncePerMonth");
        this.nullableTwicePerMonthDtoAdapter = moshi.adapter(TwicePerMonthDto.class, emptySet, "twicePerMonth");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SelectedRegularAutotopupOptionDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        RegularAutotopupTypeDto regularAutotopupTypeDto = null;
        OncePerWeekDto oncePerWeekDto = null;
        OncePerMonthDto oncePerMonthDto = null;
        TwicePerMonthDto twicePerMonthDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                regularAutotopupTypeDto = this.regularAutotopupTypeDtoAdapter.fromJson(jsonReader);
                if (regularAutotopupTypeDto == null) {
                    throw Util.unexpectedNull("selected", "selected_option_id", jsonReader);
                }
            } else if (selectName == 1) {
                oncePerWeekDto = this.nullableOncePerWeekDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                oncePerMonthDto = this.nullableOncePerMonthDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                twicePerMonthDto = this.nullableTwicePerMonthDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (regularAutotopupTypeDto != null) {
            return new SelectedRegularAutotopupOptionDto(regularAutotopupTypeDto, oncePerWeekDto, oncePerMonthDto, twicePerMonthDto);
        }
        throw Util.missingProperty("selected", "selected_option_id", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SelectedRegularAutotopupOptionDto selectedRegularAutotopupOptionDto) {
        SelectedRegularAutotopupOptionDto selectedRegularAutotopupOptionDto2 = selectedRegularAutotopupOptionDto;
        if (selectedRegularAutotopupOptionDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("selected_option_id");
        this.regularAutotopupTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) selectedRegularAutotopupOptionDto2.getSelected());
        jsonWriter.name("once_per_week");
        this.nullableOncePerWeekDtoAdapter.toJson(jsonWriter, (JsonWriter) selectedRegularAutotopupOptionDto2.getOncePerWeek());
        jsonWriter.name("once_per_month");
        this.nullableOncePerMonthDtoAdapter.toJson(jsonWriter, (JsonWriter) selectedRegularAutotopupOptionDto2.getOncePerMonth());
        jsonWriter.name("twice_per_month");
        this.nullableTwicePerMonthDtoAdapter.toJson(jsonWriter, (JsonWriter) selectedRegularAutotopupOptionDto2.getTwicePerMonth());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(55, "GeneratedJsonAdapter(SelectedRegularAutotopupOptionDto)");
    }
}
