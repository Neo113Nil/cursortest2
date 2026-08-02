package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR&\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/DiffRateCalendarResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/savings/internal/network/dto/DiffRateCalendarResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "", "Lcom/ybsdk/feature/savings/internal/network/dto/DiffRateCalendarDayStyle;", "mapOfStringDiffRateCalendarDayStyleAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/ybsdk/feature/savings/internal/network/dto/DiffRateCalendarEntry;", "listOfDiffRateCalendarEntryAdapter", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DiffRateCalendarResponseJsonAdapter extends JsonAdapter<DiffRateCalendarResponse> {
    private final JsonAdapter<List<DiffRateCalendarEntry>> listOfDiffRateCalendarEntryAdapter;
    private final JsonAdapter<Map<String, DiffRateCalendarDayStyle>> mapOfStringDiffRateCalendarDayStyleAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("styles", "entries");

    public DiffRateCalendarResponseJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(Map.class, String.class, DiffRateCalendarDayStyle.class);
        EmptySet emptySet = EmptySet.a;
        this.mapOfStringDiffRateCalendarDayStyleAdapter = moshi.adapter(newParameterizedType, emptySet, "styles");
        this.listOfDiffRateCalendarEntryAdapter = moshi.adapter(Types.newParameterizedType(List.class, DiffRateCalendarEntry.class), emptySet, "entries");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DiffRateCalendarResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Map<String, DiffRateCalendarDayStyle> map = null;
        List<DiffRateCalendarEntry> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                map = this.mapOfStringDiffRateCalendarDayStyleAdapter.fromJson(jsonReader);
                if (map == null) {
                    throw Util.unexpectedNull("styles", "styles", jsonReader);
                }
            } else if (selectName == 1 && (list = this.listOfDiffRateCalendarEntryAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("entries", "entries", jsonReader);
            }
        }
        jsonReader.endObject();
        if (map == null) {
            throw Util.missingProperty("styles", "styles", jsonReader);
        }
        if (list != null) {
            return new DiffRateCalendarResponse(map, list);
        }
        throw Util.missingProperty("entries", "entries", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DiffRateCalendarResponse diffRateCalendarResponse) {
        DiffRateCalendarResponse diffRateCalendarResponse2 = diffRateCalendarResponse;
        if (diffRateCalendarResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("styles");
        this.mapOfStringDiffRateCalendarDayStyleAdapter.toJson(jsonWriter, (JsonWriter) diffRateCalendarResponse2.getStyles());
        jsonWriter.name("entries");
        this.listOfDiffRateCalendarEntryAdapter.toJson(jsonWriter, (JsonWriter) diffRateCalendarResponse2.getEntries());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(46, "GeneratedJsonAdapter(DiffRateCalendarResponse)");
    }
}
