package com.ybsdk.feature.autotopup.internal.network.dto.regular;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR(\u0010\u0012\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupOptionDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupOptionDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupTypeDto;", "regularAutotopupTypeDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "nullableStringAdapter", "", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/DayOfWeekDto;", "nullableMapOfDayOfWeekDtoStringAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RegularAutotopupOptionDtoJsonAdapter extends JsonAdapter<RegularAutotopupOptionDto> {
    private final JsonAdapter<Map<DayOfWeekDto, String>> nullableMapOfDayOfWeekDtoStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("id", "text", "money_hint", "date_hint", "date_format", "last_day_placeholder", "week_day_to_date_string");
    private final JsonAdapter<RegularAutotopupTypeDto> regularAutotopupTypeDtoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public RegularAutotopupOptionDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.regularAutotopupTypeDtoAdapter = moshi.adapter(RegularAutotopupTypeDto.class, emptySet, "type");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "text");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "formatDate");
        this.nullableMapOfDayOfWeekDtoStringAdapter = moshi.adapter(Types.newParameterizedType(Map.class, DayOfWeekDto.class, String.class), emptySet, "dayOfWeekText");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final RegularAutotopupOptionDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        RegularAutotopupTypeDto regularAutotopupTypeDto = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Map<DayOfWeekDto, String> map = null;
        while (jsonReader.hasNext()) {
            RegularAutotopupTypeDto regularAutotopupTypeDto2 = regularAutotopupTypeDto;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    regularAutotopupTypeDto = this.regularAutotopupTypeDtoAdapter.fromJson(jsonReader);
                    if (regularAutotopupTypeDto == null) {
                        throw Util.unexpectedNull("type", "id", jsonReader);
                    }
                    continue;
                case 1:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("text", "text", jsonReader);
                    }
                    break;
                case 2:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("hintMoney", "money_hint", jsonReader);
                    }
                    break;
                case 3:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("hintDate", "date_hint", jsonReader);
                    }
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    map = this.nullableMapOfDayOfWeekDtoStringAdapter.fromJson(jsonReader);
                    break;
            }
            regularAutotopupTypeDto = regularAutotopupTypeDto2;
        }
        RegularAutotopupTypeDto regularAutotopupTypeDto3 = regularAutotopupTypeDto;
        jsonReader.endObject();
        if (regularAutotopupTypeDto3 == null) {
            throw Util.missingProperty("type", "id", jsonReader);
        }
        if (str == null) {
            throw Util.missingProperty("text", "text", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("hintMoney", "money_hint", jsonReader);
        }
        if (str3 != null) {
            return new RegularAutotopupOptionDto(regularAutotopupTypeDto3, str, str2, str3, str4, str5, map);
        }
        throw Util.missingProperty("hintDate", "date_hint", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, RegularAutotopupOptionDto regularAutotopupOptionDto) {
        RegularAutotopupOptionDto regularAutotopupOptionDto2 = regularAutotopupOptionDto;
        if (regularAutotopupOptionDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.regularAutotopupTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) regularAutotopupOptionDto2.getType());
        jsonWriter.name("text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) regularAutotopupOptionDto2.getText());
        jsonWriter.name("money_hint");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) regularAutotopupOptionDto2.getHintMoney());
        jsonWriter.name("date_hint");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) regularAutotopupOptionDto2.getHintDate());
        jsonWriter.name("date_format");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) regularAutotopupOptionDto2.getFormatDate());
        jsonWriter.name("last_day_placeholder");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) regularAutotopupOptionDto2.getPlaceholderLastDay());
        jsonWriter.name("week_day_to_date_string");
        this.nullableMapOfDayOfWeekDtoStringAdapter.toJson(jsonWriter, (JsonWriter) regularAutotopupOptionDto2.getDayOfWeekText());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(47, "GeneratedJsonAdapter(RegularAutotopupOptionDto)");
    }
}
