package com.ybsdk.feature.pfm.internal.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse;
import defpackage.ny61;
import defpackage.uw51;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse_DateFilterPreselectedDatesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$DateFilterPreselectedDates;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Ljava/util/Calendar;", "calendarAdapter", "Lcom/squareup/moshi/JsonAdapter;", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PfmResponse_DateFilterPreselectedDatesJsonAdapter extends JsonAdapter<PfmResponse.DateFilterPreselectedDates> {
    private final JsonAdapter<Calendar> calendarAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("start_inclusive", "end_exclusive");

    public PfmResponse_DateFilterPreselectedDatesJsonAdapter(Moshi moshi) {
        this.calendarAdapter = moshi.adapter(Calendar.class, EmptySet.a, "startInclusive");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PfmResponse.DateFilterPreselectedDates fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Calendar calendar = null;
        Calendar calendar2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                calendar = this.calendarAdapter.fromJson(jsonReader);
                if (calendar == null) {
                    throw Util.unexpectedNull("startInclusive", "start_inclusive", jsonReader);
                }
            } else if (selectName == 1 && (calendar2 = this.calendarAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("endExclusive", "end_exclusive", jsonReader);
            }
        }
        jsonReader.endObject();
        if (calendar == null) {
            throw Util.missingProperty("startInclusive", "start_inclusive", jsonReader);
        }
        if (calendar2 != null) {
            return new PfmResponse.DateFilterPreselectedDates(calendar, calendar2);
        }
        throw Util.missingProperty("endExclusive", "end_exclusive", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PfmResponse.DateFilterPreselectedDates dateFilterPreselectedDates) {
        PfmResponse.DateFilterPreselectedDates dateFilterPreselectedDates2 = dateFilterPreselectedDates;
        if (dateFilterPreselectedDates2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("start_inclusive");
        this.calendarAdapter.toJson(jsonWriter, (JsonWriter) dateFilterPreselectedDates2.getStartInclusive());
        jsonWriter.name("end_exclusive");
        this.calendarAdapter.toJson(jsonWriter, (JsonWriter) dateFilterPreselectedDates2.getEndExclusive());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(60, "GeneratedJsonAdapter(PfmResponse.DateFilterPreselectedDates)");
    }
}
