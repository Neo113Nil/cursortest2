package com.ybsdk.feature.autotopup.internal.network.dto.regular;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.autotopup.internal.domain.entities.regular.FrequencyType;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SaveSelectedRegularAutotopupOptionDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SaveSelectedRegularAutotopupOptionDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/autotopup/internal/domain/entities/regular/FrequencyType;", "frequencyTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SaveOncePerWeekDto;", "nullableSaveOncePerWeekDtoAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SaveOncePerMonthDto;", "nullableSaveOncePerMonthDtoAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SaveTwicePerMonthDto;", "nullableSaveTwicePerMonthDtoAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SaveSelectedRegularAutotopupOptionDtoJsonAdapter extends JsonAdapter<SaveSelectedRegularAutotopupOptionDto> {
    private final JsonAdapter<FrequencyType> frequencyTypeAdapter;
    private final JsonAdapter<SaveOncePerMonthDto> nullableSaveOncePerMonthDtoAdapter;
    private final JsonAdapter<SaveOncePerWeekDto> nullableSaveOncePerWeekDtoAdapter;
    private final JsonAdapter<SaveTwicePerMonthDto> nullableSaveTwicePerMonthDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("selected_option_id", "once_per_week", "once_per_month", "twice_per_month");

    public SaveSelectedRegularAutotopupOptionDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.frequencyTypeAdapter = moshi.adapter(FrequencyType.class, emptySet, "selected");
        this.nullableSaveOncePerWeekDtoAdapter = moshi.adapter(SaveOncePerWeekDto.class, emptySet, "oncePerWeek");
        this.nullableSaveOncePerMonthDtoAdapter = moshi.adapter(SaveOncePerMonthDto.class, emptySet, "oncePerMonth");
        this.nullableSaveTwicePerMonthDtoAdapter = moshi.adapter(SaveTwicePerMonthDto.class, emptySet, "twicePerMonth");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SaveSelectedRegularAutotopupOptionDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        FrequencyType frequencyType = null;
        SaveOncePerWeekDto saveOncePerWeekDto = null;
        SaveOncePerMonthDto saveOncePerMonthDto = null;
        SaveTwicePerMonthDto saveTwicePerMonthDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                frequencyType = this.frequencyTypeAdapter.fromJson(jsonReader);
                if (frequencyType == null) {
                    throw Util.unexpectedNull("selected", "selected_option_id", jsonReader);
                }
            } else if (selectName == 1) {
                saveOncePerWeekDto = this.nullableSaveOncePerWeekDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                saveOncePerMonthDto = this.nullableSaveOncePerMonthDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                saveTwicePerMonthDto = this.nullableSaveTwicePerMonthDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (frequencyType != null) {
            return new SaveSelectedRegularAutotopupOptionDto(frequencyType, saveOncePerWeekDto, saveOncePerMonthDto, saveTwicePerMonthDto);
        }
        throw Util.missingProperty("selected", "selected_option_id", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SaveSelectedRegularAutotopupOptionDto saveSelectedRegularAutotopupOptionDto) {
        SaveSelectedRegularAutotopupOptionDto saveSelectedRegularAutotopupOptionDto2 = saveSelectedRegularAutotopupOptionDto;
        if (saveSelectedRegularAutotopupOptionDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("selected_option_id");
        this.frequencyTypeAdapter.toJson(jsonWriter, (JsonWriter) saveSelectedRegularAutotopupOptionDto2.getSelected());
        jsonWriter.name("once_per_week");
        this.nullableSaveOncePerWeekDtoAdapter.toJson(jsonWriter, (JsonWriter) saveSelectedRegularAutotopupOptionDto2.getOncePerWeek());
        jsonWriter.name("once_per_month");
        this.nullableSaveOncePerMonthDtoAdapter.toJson(jsonWriter, (JsonWriter) saveSelectedRegularAutotopupOptionDto2.getOncePerMonth());
        jsonWriter.name("twice_per_month");
        this.nullableSaveTwicePerMonthDtoAdapter.toJson(jsonWriter, (JsonWriter) saveSelectedRegularAutotopupOptionDto2.getTwicePerMonth());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(59, "GeneratedJsonAdapter(SaveSelectedRegularAutotopupOptionDto)");
    }
}
