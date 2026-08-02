package com.ybsdk.feature.pfm.internal.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse_TransactionsDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$TransactionsData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "nullableDivDataDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$TransactionListItem;", "listOfTransactionListItemAdapter", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PfmResponse_TransactionsDataJsonAdapter extends JsonAdapter<PfmResponse.TransactionsData> {
    private final JsonAdapter<List<PfmResponse.TransactionListItem>> listOfTransactionListItemAdapter;
    private final JsonAdapter<DivDataDto> nullableDivDataDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("common_data", "items");

    public PfmResponse_TransactionsDataJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableDivDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "commonData");
        this.listOfTransactionListItemAdapter = moshi.adapter(Types.newParameterizedType(List.class, PfmResponse.TransactionListItem.class), emptySet, "items");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PfmResponse.TransactionsData fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        DivDataDto divDataDto = null;
        List<PfmResponse.TransactionListItem> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                divDataDto = this.nullableDivDataDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 1 && (list = this.listOfTransactionListItemAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("items", "items", jsonReader);
            }
        }
        jsonReader.endObject();
        if (list != null) {
            return new PfmResponse.TransactionsData(divDataDto, list);
        }
        throw Util.missingProperty("items", "items", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PfmResponse.TransactionsData transactionsData) {
        PfmResponse.TransactionsData transactionsData2 = transactionsData;
        if (transactionsData2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("common_data");
        this.nullableDivDataDtoAdapter.toJson(jsonWriter, (JsonWriter) transactionsData2.getCommonData());
        jsonWriter.name("items");
        this.listOfTransactionListItemAdapter.toJson(jsonWriter, (JsonWriter) transactionsData2.getItems());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(50, "GeneratedJsonAdapter(PfmResponse.TransactionsData)");
    }
}
