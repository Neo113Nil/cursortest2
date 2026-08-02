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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SaveTwicePerMonthDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SaveTwicePerMonthDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SaveMonthDayToMoneyDto;", "saveMonthDayToMoneyDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SaveTwicePerMonthDtoJsonAdapter extends JsonAdapter<SaveTwicePerMonthDto> {
    private final JsonReader.Options options = JsonReader.Options.of("month_to_money_1", "month_to_money_2");
    private final JsonAdapter<SaveMonthDayToMoneyDto> saveMonthDayToMoneyDtoAdapter;

    public SaveTwicePerMonthDtoJsonAdapter(Moshi moshi) {
        this.saveMonthDayToMoneyDtoAdapter = moshi.adapter(SaveMonthDayToMoneyDto.class, EmptySet.a, "monthToMoney1");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SaveTwicePerMonthDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        SaveMonthDayToMoneyDto saveMonthDayToMoneyDto = null;
        SaveMonthDayToMoneyDto saveMonthDayToMoneyDto2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                saveMonthDayToMoneyDto = this.saveMonthDayToMoneyDtoAdapter.fromJson(jsonReader);
                if (saveMonthDayToMoneyDto == null) {
                    throw Util.unexpectedNull("monthToMoney1", "month_to_money_1", jsonReader);
                }
            } else if (selectName == 1 && (saveMonthDayToMoneyDto2 = this.saveMonthDayToMoneyDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("monthToMoney2", "month_to_money_2", jsonReader);
            }
        }
        jsonReader.endObject();
        if (saveMonthDayToMoneyDto == null) {
            throw Util.missingProperty("monthToMoney1", "month_to_money_1", jsonReader);
        }
        if (saveMonthDayToMoneyDto2 != null) {
            return new SaveTwicePerMonthDto(saveMonthDayToMoneyDto, saveMonthDayToMoneyDto2);
        }
        throw Util.missingProperty("monthToMoney2", "month_to_money_2", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SaveTwicePerMonthDto saveTwicePerMonthDto) {
        SaveTwicePerMonthDto saveTwicePerMonthDto2 = saveTwicePerMonthDto;
        if (saveTwicePerMonthDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("month_to_money_1");
        this.saveMonthDayToMoneyDtoAdapter.toJson(jsonWriter, (JsonWriter) saveTwicePerMonthDto2.getMonthToMoney1());
        jsonWriter.name("month_to_money_2");
        this.saveMonthDayToMoneyDtoAdapter.toJson(jsonWriter, (JsonWriter) saveTwicePerMonthDto2.getMonthToMoney2());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(SaveTwicePerMonthDto)");
    }
}
