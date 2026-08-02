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

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/transactions/impl/data/network/dto/feed/TransactionsFeedListRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transactions/impl/data/network/dto/feed/TransactionsFeedListRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "nullableIntAdapter", "", "nullableBooleanAdapter", "feature-transactions-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransactionsFeedListRequestJsonAdapter extends JsonAdapter<TransactionsFeedListRequest> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("regular_limit", "filter", "agreement_id", "pending_limit", "cursor", "show_tabbar", "hide_filters", "header_style", "filters_style");

    public TransactionsFeedListRequestJsonAdapter(Moshi moshi) {
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.intAdapter = moshi.adapter(cls, emptySet, "regularLimit");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "filter");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "pendingLimit");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "showTabbar");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TransactionsFeedListRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        String str = null;
        String str2 = null;
        Integer num2 = null;
        String str3 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        String str4 = null;
        String str5 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("regularLimit", "regular_limit", jsonReader);
                    }
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    num2 = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    bool2 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (num != null) {
            return new TransactionsFeedListRequest(num.intValue(), str, str2, num2, str3, bool, bool2, str4, str5);
        }
        throw Util.missingProperty("regularLimit", "regular_limit", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TransactionsFeedListRequest transactionsFeedListRequest) {
        TransactionsFeedListRequest transactionsFeedListRequest2 = transactionsFeedListRequest;
        if (transactionsFeedListRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("regular_limit");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(transactionsFeedListRequest2.getRegularLimit()));
        jsonWriter.name("filter");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) transactionsFeedListRequest2.getFilter());
        jsonWriter.name("agreement_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) transactionsFeedListRequest2.getAgreementId());
        jsonWriter.name("pending_limit");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) transactionsFeedListRequest2.getPendingLimit());
        jsonWriter.name("cursor");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) transactionsFeedListRequest2.getCursor());
        jsonWriter.name("show_tabbar");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) transactionsFeedListRequest2.getShowTabbar());
        jsonWriter.name("hide_filters");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) transactionsFeedListRequest2.getHideFilters());
        jsonWriter.name("header_style");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) transactionsFeedListRequest2.getHeaderStyle());
        jsonWriter.name("filters_style");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) transactionsFeedListRequest2.getFiltersStyle());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(49, "GeneratedJsonAdapter(TransactionsFeedListRequest)");
    }
}
