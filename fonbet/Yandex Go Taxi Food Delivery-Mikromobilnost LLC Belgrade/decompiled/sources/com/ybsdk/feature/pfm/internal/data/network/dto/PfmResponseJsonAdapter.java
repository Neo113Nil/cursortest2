package com.ybsdk.feature.pfm.internal.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse;
import defpackage.ny61;
import defpackage.uw51;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR&\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FunFactData;", "nullableFunFactDataAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$TransactionsData;", "transactionsDataAdapter", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FeedFilters;", "nullableFeedFiltersAdapter", "", "", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$Analytics;", "mapOfStringAnalyticsAdapter", "nullableStringAdapter", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PfmResponseJsonAdapter extends JsonAdapter<PfmResponse> {
    private final JsonAdapter<Map<String, PfmResponse.Analytics>> mapOfStringAnalyticsAdapter;
    private final JsonAdapter<PfmResponse.FeedFilters> nullableFeedFiltersAdapter;
    private final JsonAdapter<PfmResponse.FunFactData> nullableFunFactDataAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("fun_fact", "transactions", "filters", "analytics", "cursor");
    private final JsonAdapter<PfmResponse.TransactionsData> transactionsDataAdapter;

    public PfmResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableFunFactDataAdapter = moshi.adapter(PfmResponse.FunFactData.class, emptySet, "funFact");
        this.transactionsDataAdapter = moshi.adapter(PfmResponse.TransactionsData.class, emptySet, "transactions");
        this.nullableFeedFiltersAdapter = moshi.adapter(PfmResponse.FeedFilters.class, emptySet, "filters");
        this.mapOfStringAnalyticsAdapter = moshi.adapter(Types.newParameterizedType(Map.class, String.class, PfmResponse.Analytics.class), emptySet, "analytics");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "cursor");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PfmResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        PfmResponse.FunFactData funFactData = null;
        PfmResponse.TransactionsData transactionsData = null;
        PfmResponse.FeedFilters feedFilters = null;
        Map<String, PfmResponse.Analytics> map = null;
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                funFactData = this.nullableFunFactDataAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                transactionsData = this.transactionsDataAdapter.fromJson(jsonReader);
                if (transactionsData == null) {
                    throw Util.unexpectedNull("transactions", "transactions", jsonReader);
                }
            } else if (selectName == 2) {
                feedFilters = this.nullableFeedFiltersAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                map = this.mapOfStringAnalyticsAdapter.fromJson(jsonReader);
                if (map == null) {
                    throw Util.unexpectedNull("analytics", "analytics", jsonReader);
                }
            } else if (selectName == 4) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (transactionsData == null) {
            throw Util.missingProperty("transactions", "transactions", jsonReader);
        }
        if (map != null) {
            return new PfmResponse(funFactData, transactionsData, feedFilters, map, str);
        }
        throw Util.missingProperty("analytics", "analytics", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PfmResponse pfmResponse) {
        PfmResponse pfmResponse2 = pfmResponse;
        if (pfmResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("fun_fact");
        this.nullableFunFactDataAdapter.toJson(jsonWriter, (JsonWriter) pfmResponse2.getFunFact());
        jsonWriter.name("transactions");
        this.transactionsDataAdapter.toJson(jsonWriter, (JsonWriter) pfmResponse2.getTransactions());
        jsonWriter.name("filters");
        this.nullableFeedFiltersAdapter.toJson(jsonWriter, (JsonWriter) pfmResponse2.getFilters());
        jsonWriter.name("analytics");
        this.mapOfStringAnalyticsAdapter.toJson(jsonWriter, (JsonWriter) pfmResponse2.getAnalytics());
        jsonWriter.name("cursor");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) pfmResponse2.getCursor());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(33, "GeneratedJsonAdapter(PfmResponse)");
    }
}
