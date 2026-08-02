package com.ybsdk.feature.transactions.impl.data.network.dto.feed;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.transactions.impl.data.network.dto.feed.TransactionsFeedFiltersResponse;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/transactions/impl/data/network/dto/feed/TransactionsFeedFiltersResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transactions/impl/data/network/dto/feed/TransactionsFeedFiltersResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "nullableDivDataDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transactions/impl/data/network/dto/feed/TransactionsFeedFiltersResponse$ToolbarData;", "nullableToolbarDataAdapter", "feature-transactions-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransactionsFeedFiltersResponseJsonAdapter extends JsonAdapter<TransactionsFeedFiltersResponse> {
    private final JsonAdapter<DivDataDto> nullableDivDataDtoAdapter;
    private final JsonAdapter<TransactionsFeedFiltersResponse.ToolbarData> nullableToolbarDataAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("header_data", "filters_data", "toolbar_data");

    public TransactionsFeedFiltersResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableDivDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "headerDivData");
        this.nullableToolbarDataAdapter = moshi.adapter(TransactionsFeedFiltersResponse.ToolbarData.class, emptySet, "toolbarData");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TransactionsFeedFiltersResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        DivDataDto divDataDto = null;
        DivDataDto divDataDto2 = null;
        TransactionsFeedFiltersResponse.ToolbarData toolbarData = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                divDataDto = this.nullableDivDataDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                divDataDto2 = this.nullableDivDataDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                toolbarData = this.nullableToolbarDataAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new TransactionsFeedFiltersResponse(divDataDto, divDataDto2, toolbarData);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TransactionsFeedFiltersResponse transactionsFeedFiltersResponse) {
        TransactionsFeedFiltersResponse transactionsFeedFiltersResponse2 = transactionsFeedFiltersResponse;
        if (transactionsFeedFiltersResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("header_data");
        this.nullableDivDataDtoAdapter.toJson(jsonWriter, (JsonWriter) transactionsFeedFiltersResponse2.getHeaderDivData());
        jsonWriter.name("filters_data");
        this.nullableDivDataDtoAdapter.toJson(jsonWriter, (JsonWriter) transactionsFeedFiltersResponse2.getFiltersDivData());
        jsonWriter.name("toolbar_data");
        this.nullableToolbarDataAdapter.toJson(jsonWriter, (JsonWriter) transactionsFeedFiltersResponse2.getToolbarData());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(53, "GeneratedJsonAdapter(TransactionsFeedFiltersResponse)");
    }
}
