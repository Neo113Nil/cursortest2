package com.ybsdk.feature.savings.internal.network.dto;

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

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR \u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/SavingsIncomePeriodDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsIncomePeriodDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsIncomePeriodDateDto;", "listOfSavingsIncomePeriodDateDtoAdapter", "", "intAdapter", "", "booleanAdapter", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavingsIncomePeriodDtoJsonAdapter extends JsonAdapter<SavingsIncomePeriodDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<SavingsIncomePeriodDateDto>> listOfSavingsIncomePeriodDateDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("rate", "progress_end", "progress_start", "start_date", "start_year", "end_date", "end_year", "dates", "date_current", "show_lock", "progress_bar_interaction_enabled");
    private final JsonAdapter<String> stringAdapter;

    public SavingsIncomePeriodDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "rate");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "endDate");
        this.listOfSavingsIncomePeriodDateDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, SavingsIncomePeriodDateDto.class), emptySet, "dates");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "dateCurrent");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "showLock");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SavingsIncomePeriodDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        Boolean bool = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        List<SavingsIncomePeriodDateDto> list = null;
        Boolean bool2 = null;
        while (true) {
            Integer num2 = num;
            Boolean bool3 = bool;
            String str8 = str;
            String str9 = str2;
            String str10 = str3;
            String str11 = str4;
            String str12 = str5;
            String str13 = str6;
            String str14 = str7;
            List<SavingsIncomePeriodDateDto> list2 = list;
            Boolean bool4 = bool2;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (str8 == null) {
                    throw Util.missingProperty("rate", "rate", jsonReader);
                }
                if (str9 == null) {
                    throw Util.missingProperty("progressEnd", "progress_end", jsonReader);
                }
                if (str10 == null) {
                    throw Util.missingProperty("progressStart", "progress_start", jsonReader);
                }
                if (str11 == null) {
                    throw Util.missingProperty("startDate", "start_date", jsonReader);
                }
                if (str12 == null) {
                    throw Util.missingProperty("startYear", "start_year", jsonReader);
                }
                if (list2 == null) {
                    throw Util.missingProperty("dates", "dates", jsonReader);
                }
                if (num2 == null) {
                    throw Util.missingProperty("dateCurrent", "date_current", jsonReader);
                }
                int intValue = num2.intValue();
                if (bool3 == null) {
                    throw Util.missingProperty("showLock", "show_lock", jsonReader);
                }
                boolean booleanValue = bool3.booleanValue();
                if (bool4 != null) {
                    return new SavingsIncomePeriodDto(str8, str9, str10, str11, str12, str13, str14, list2, intValue, booleanValue, bool4.booleanValue());
                }
                throw Util.missingProperty("interactive", "progress_bar_interaction_enabled", jsonReader);
            }
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    num = num2;
                    bool = bool3;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    str6 = str13;
                    str7 = str14;
                    list = list2;
                    bool2 = bool4;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("rate", "rate", jsonReader);
                    }
                    num = num2;
                    bool = bool3;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    str6 = str13;
                    str7 = str14;
                    list = list2;
                    bool2 = bool4;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("progressEnd", "progress_end", jsonReader);
                    }
                    num = num2;
                    bool = bool3;
                    str = str8;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    str6 = str13;
                    str7 = str14;
                    list = list2;
                    bool2 = bool4;
                case 2:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("progressStart", "progress_start", jsonReader);
                    }
                    num = num2;
                    bool = bool3;
                    str = str8;
                    str2 = str9;
                    str4 = str11;
                    str5 = str12;
                    str6 = str13;
                    str7 = str14;
                    list = list2;
                    bool2 = bool4;
                case 3:
                    str4 = this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("startDate", "start_date", jsonReader);
                    }
                    num = num2;
                    bool = bool3;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    str5 = str12;
                    str6 = str13;
                    str7 = str14;
                    list = list2;
                    bool2 = bool4;
                case 4:
                    str5 = this.stringAdapter.fromJson(jsonReader);
                    if (str5 == null) {
                        throw Util.unexpectedNull("startYear", "start_year", jsonReader);
                    }
                    num = num2;
                    bool = bool3;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str6 = str13;
                    str7 = str14;
                    list = list2;
                    bool2 = bool4;
                case 5:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    num = num2;
                    bool = bool3;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    str7 = str14;
                    list = list2;
                    bool2 = bool4;
                case 6:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader);
                    num = num2;
                    bool = bool3;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    str6 = str13;
                    list = list2;
                    bool2 = bool4;
                case 7:
                    list = this.listOfSavingsIncomePeriodDateDtoAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("dates", "dates", jsonReader);
                    }
                    num = num2;
                    bool = bool3;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    str6 = str13;
                    str7 = str14;
                    bool2 = bool4;
                case 8:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("dateCurrent", "date_current", jsonReader);
                    }
                    bool = bool3;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    str6 = str13;
                    str7 = str14;
                    list = list2;
                    bool2 = bool4;
                case 9:
                    bool = this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        throw Util.unexpectedNull("showLock", "show_lock", jsonReader);
                    }
                    num = num2;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    str6 = str13;
                    str7 = str14;
                    list = list2;
                    bool2 = bool4;
                case 10:
                    Boolean fromJson = this.booleanAdapter.fromJson(jsonReader);
                    if (fromJson == null) {
                        throw Util.unexpectedNull("interactive", "progress_bar_interaction_enabled", jsonReader);
                    }
                    bool2 = fromJson;
                    num = num2;
                    bool = bool3;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    str6 = str13;
                    str7 = str14;
                    list = list2;
                default:
                    num = num2;
                    bool = bool3;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    str6 = str13;
                    str7 = str14;
                    list = list2;
                    bool2 = bool4;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SavingsIncomePeriodDto savingsIncomePeriodDto) {
        SavingsIncomePeriodDto savingsIncomePeriodDto2 = savingsIncomePeriodDto;
        if (savingsIncomePeriodDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("rate");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) savingsIncomePeriodDto2.getRate());
        jsonWriter.name("progress_end");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) savingsIncomePeriodDto2.getProgressEnd());
        jsonWriter.name("progress_start");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) savingsIncomePeriodDto2.getProgressStart());
        jsonWriter.name("start_date");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) savingsIncomePeriodDto2.getStartDate());
        jsonWriter.name("start_year");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) savingsIncomePeriodDto2.getStartYear());
        jsonWriter.name("end_date");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) savingsIncomePeriodDto2.getEndDate());
        jsonWriter.name("end_year");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) savingsIncomePeriodDto2.getEndYear());
        jsonWriter.name("dates");
        this.listOfSavingsIncomePeriodDateDtoAdapter.toJson(jsonWriter, (JsonWriter) savingsIncomePeriodDto2.getDates());
        jsonWriter.name("date_current");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(savingsIncomePeriodDto2.getDateCurrent()));
        jsonWriter.name("show_lock");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(savingsIncomePeriodDto2.getShowLock()));
        jsonWriter.name("progress_bar_interaction_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(savingsIncomePeriodDto2.getInteractive()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(SavingsIncomePeriodDto)");
    }
}
