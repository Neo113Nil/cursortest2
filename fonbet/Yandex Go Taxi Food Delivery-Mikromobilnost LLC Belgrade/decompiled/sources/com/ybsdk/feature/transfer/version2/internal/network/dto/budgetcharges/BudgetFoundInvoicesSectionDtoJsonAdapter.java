package com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges;

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

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/BudgetFoundInvoicesSectionDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/BudgetFoundInvoicesSectionDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "nullableDivDataDtoAdapter", "", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/BudgetFoundChargeItemDto;", "listOfBudgetFoundChargeItemDtoAdapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BudgetFoundInvoicesSectionDtoJsonAdapter extends JsonAdapter<BudgetFoundInvoicesSectionDto> {
    private final JsonAdapter<List<BudgetFoundChargeItemDto>> listOfBudgetFoundChargeItemDtoAdapter;
    private final JsonAdapter<DivDataDto> nullableDivDataDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "empty_state_divkit", "items");
    private final JsonAdapter<String> stringAdapter;

    public BudgetFoundInvoicesSectionDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "tabTitle");
        this.nullableDivDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "emptyDivState");
        this.listOfBudgetFoundChargeItemDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, BudgetFoundChargeItemDto.class), emptySet, "items");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final BudgetFoundInvoicesSectionDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        DivDataDto divDataDto = null;
        List<BudgetFoundChargeItemDto> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("tabTitle", "title", jsonReader);
                }
            } else if (selectName == 1) {
                divDataDto = this.nullableDivDataDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2 && (list = this.listOfBudgetFoundChargeItemDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("items", "items", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("tabTitle", "title", jsonReader);
        }
        if (list != null) {
            return new BudgetFoundInvoicesSectionDto(str, divDataDto, list);
        }
        throw Util.missingProperty("items", "items", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, BudgetFoundInvoicesSectionDto budgetFoundInvoicesSectionDto) {
        BudgetFoundInvoicesSectionDto budgetFoundInvoicesSectionDto2 = budgetFoundInvoicesSectionDto;
        if (budgetFoundInvoicesSectionDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) budgetFoundInvoicesSectionDto2.getTabTitle());
        jsonWriter.name("empty_state_divkit");
        this.nullableDivDataDtoAdapter.toJson(jsonWriter, (JsonWriter) budgetFoundInvoicesSectionDto2.getEmptyDivState());
        jsonWriter.name("items");
        this.listOfBudgetFoundChargeItemDtoAdapter.toJson(jsonWriter, (JsonWriter) budgetFoundInvoicesSectionDto2.getItems());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(51, "GeneratedJsonAdapter(BudgetFoundInvoicesSectionDto)");
    }
}
