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

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse_FilterInnerContent_DateFilterJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterInnerContent$DateFilter;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmTextContent$Plain;", "plainAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterInnerContentType;", "filterInnerContentTypeAdapter", "Ljava/util/Calendar;", "calendarAdapter", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$DateFilterPreselectedDates;", "nullableDateFilterPreselectedDatesAdapter", "", "stringAdapter", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PfmResponse_FilterInnerContent_DateFilterJsonAdapter extends JsonAdapter<PfmResponse$FilterInnerContent$DateFilter> {
    private final JsonAdapter<Calendar> calendarAdapter;
    private final JsonAdapter<PfmResponse.FilterInnerContentType> filterInnerContentTypeAdapter;
    private final JsonAdapter<PfmResponse.DateFilterPreselectedDates> nullableDateFilterPreselectedDatesAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "filter_type", "available_date", "preselected_dates", "fallback_section_key");
    private final JsonAdapter<PfmResponse$PfmTextContent$Plain> plainAdapter;
    private final JsonAdapter<String> stringAdapter;

    public PfmResponse_FilterInnerContent_DateFilterJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.plainAdapter = moshi.adapter(PfmResponse$PfmTextContent$Plain.class, emptySet, "title");
        this.filterInnerContentTypeAdapter = moshi.adapter(PfmResponse.FilterInnerContentType.class, emptySet, "filterType");
        this.calendarAdapter = moshi.adapter(Calendar.class, emptySet, "availableDate");
        this.nullableDateFilterPreselectedDatesAdapter = moshi.adapter(PfmResponse.DateFilterPreselectedDates.class, emptySet, "preselectedDates");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "fallbackSectionKey");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PfmResponse$FilterInnerContent$DateFilter fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        PfmResponse$PfmTextContent$Plain pfmResponse$PfmTextContent$Plain = null;
        PfmResponse.FilterInnerContentType filterInnerContentType = null;
        Calendar calendar = null;
        PfmResponse.DateFilterPreselectedDates dateFilterPreselectedDates = null;
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                pfmResponse$PfmTextContent$Plain = this.plainAdapter.fromJson(jsonReader);
                if (pfmResponse$PfmTextContent$Plain == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 1) {
                filterInnerContentType = this.filterInnerContentTypeAdapter.fromJson(jsonReader);
                if (filterInnerContentType == null) {
                    throw Util.unexpectedNull("filterType", "filter_type", jsonReader);
                }
            } else if (selectName == 2) {
                calendar = this.calendarAdapter.fromJson(jsonReader);
                if (calendar == null) {
                    throw Util.unexpectedNull("availableDate", "available_date", jsonReader);
                }
            } else if (selectName == 3) {
                dateFilterPreselectedDates = this.nullableDateFilterPreselectedDatesAdapter.fromJson(jsonReader);
            } else if (selectName == 4 && (str = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("fallbackSectionKey", "fallback_section_key", jsonReader);
            }
        }
        jsonReader.endObject();
        if (pfmResponse$PfmTextContent$Plain == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (filterInnerContentType == null) {
            throw Util.missingProperty("filterType", "filter_type", jsonReader);
        }
        if (calendar == null) {
            throw Util.missingProperty("availableDate", "available_date", jsonReader);
        }
        if (str != null) {
            return new PfmResponse$FilterInnerContent$DateFilter(pfmResponse$PfmTextContent$Plain, filterInnerContentType, calendar, dateFilterPreselectedDates, str);
        }
        throw Util.missingProperty("fallbackSectionKey", "fallback_section_key", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PfmResponse$FilterInnerContent$DateFilter pfmResponse$FilterInnerContent$DateFilter) {
        PfmResponse$FilterInnerContent$DateFilter pfmResponse$FilterInnerContent$DateFilter2 = pfmResponse$FilterInnerContent$DateFilter;
        if (pfmResponse$FilterInnerContent$DateFilter2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.plainAdapter.toJson(jsonWriter, (JsonWriter) pfmResponse$FilterInnerContent$DateFilter2.getTitle());
        jsonWriter.name("filter_type");
        this.filterInnerContentTypeAdapter.toJson(jsonWriter, (JsonWriter) pfmResponse$FilterInnerContent$DateFilter2.getFilterType());
        jsonWriter.name("available_date");
        this.calendarAdapter.toJson(jsonWriter, (JsonWriter) pfmResponse$FilterInnerContent$DateFilter2.getAvailableDate());
        jsonWriter.name("preselected_dates");
        this.nullableDateFilterPreselectedDatesAdapter.toJson(jsonWriter, (JsonWriter) pfmResponse$FilterInnerContent$DateFilter2.getPreselectedDates());
        jsonWriter.name("fallback_section_key");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) pfmResponse$FilterInnerContent$DateFilter2.getFallbackSectionKey());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(63, "GeneratedJsonAdapter(PfmResponse.FilterInnerContent.DateFilter)");
    }
}
