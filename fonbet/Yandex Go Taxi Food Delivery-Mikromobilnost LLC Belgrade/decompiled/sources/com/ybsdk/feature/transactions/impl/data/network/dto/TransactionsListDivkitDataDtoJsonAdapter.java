package com.ybsdk.feature.transactions.impl.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionsListDivkitDataDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionsListDivkitDataDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "nullableDivDataDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionListItemDto;", "listOfTransactionListItemDtoAdapter", "", "nullableStringAdapter", "feature-transactions-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransactionsListDivkitDataDtoJsonAdapter extends JsonAdapter<TransactionsListDivkitDataDto> {
    private final JsonAdapter<List<TransactionListItemDto>> listOfTransactionListItemDtoAdapter;
    private final JsonAdapter<DivDataDto> nullableDivDataDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("common_data", "items", "cursor");

    public TransactionsListDivkitDataDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableDivDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "commonDivData");
        this.listOfTransactionListItemDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, TransactionListItemDto.class), emptySet, "items");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "cursor");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TransactionsListDivkitDataDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        DivDataDto divDataDto = null;
        List<TransactionListItemDto> list = null;
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                divDataDto = this.nullableDivDataDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                list = this.listOfTransactionListItemDtoAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("items", "items", jsonReader);
                }
            } else if (selectName == 2) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (list != null) {
            return new TransactionsListDivkitDataDto(divDataDto, list, str);
        }
        throw Util.missingProperty("items", "items", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TransactionsListDivkitDataDto transactionsListDivkitDataDto) {
        TransactionsListDivkitDataDto transactionsListDivkitDataDto2 = transactionsListDivkitDataDto;
        if (transactionsListDivkitDataDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("common_data");
        this.nullableDivDataDtoAdapter.toJson(jsonWriter, (JsonWriter) transactionsListDivkitDataDto2.getCommonDivData());
        jsonWriter.name("items");
        this.listOfTransactionListItemDtoAdapter.toJson(jsonWriter, (JsonWriter) transactionsListDivkitDataDto2.getItems());
        jsonWriter.name("cursor");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) transactionsListDivkitDataDto2.getCursor());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(51, "GeneratedJsonAdapter(TransactionsListDivkitDataDto)");
    }
}
