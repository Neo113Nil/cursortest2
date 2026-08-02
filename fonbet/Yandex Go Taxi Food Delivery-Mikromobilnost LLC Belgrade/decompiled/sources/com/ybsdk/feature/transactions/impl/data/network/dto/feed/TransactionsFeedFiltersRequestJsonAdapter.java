package com.ybsdk.feature.transactions.impl.data.network.dto.feed;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/transactions/impl/data/network/dto/feed/TransactionsFeedFiltersRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transactions/impl/data/network/dto/feed/TransactionsFeedFiltersRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "feature-transactions-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransactionsFeedFiltersRequestJsonAdapter extends JsonAdapter<TransactionsFeedFiltersRequest> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("filter", "agreement_id", "show_tabbar", "hide_filters", "header_style", "filters_style");

    public TransactionsFeedFiltersRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "filter");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "showTabbar");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TransactionsFeedFiltersRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    bool = this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        throw Util.unexpectedNull("showTabbar", "show_tabbar", jsonReader);
                    }
                    break;
                case 3:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("hideFilters", "hide_filters", jsonReader);
                    }
                    break;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        Boolean bool3 = bool2;
        if (bool == null) {
            throw Util.missingProperty("showTabbar", "show_tabbar", jsonReader);
        }
        boolean booleanValue = bool.booleanValue();
        if (bool3 != null) {
            return new TransactionsFeedFiltersRequest(str, str2, booleanValue, bool3.booleanValue(), str3, str4);
        }
        throw Util.missingProperty("hideFilters", "hide_filters", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TransactionsFeedFiltersRequest transactionsFeedFiltersRequest) {
        TransactionsFeedFiltersRequest transactionsFeedFiltersRequest2 = transactionsFeedFiltersRequest;
        if (transactionsFeedFiltersRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("filter");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) transactionsFeedFiltersRequest2.getFilter());
        jsonWriter.name("agreement_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) transactionsFeedFiltersRequest2.getAgreementId());
        jsonWriter.name("show_tabbar");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(transactionsFeedFiltersRequest2.getShowTabbar()));
        jsonWriter.name("hide_filters");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(transactionsFeedFiltersRequest2.getHideFilters()));
        jsonWriter.name("header_style");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) transactionsFeedFiltersRequest2.getHeaderStyle());
        jsonWriter.name("filters_style");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) transactionsFeedFiltersRequest2.getFiltersStyle());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(52, "GeneratedJsonAdapter(TransactionsFeedFiltersRequest)");
    }
}
