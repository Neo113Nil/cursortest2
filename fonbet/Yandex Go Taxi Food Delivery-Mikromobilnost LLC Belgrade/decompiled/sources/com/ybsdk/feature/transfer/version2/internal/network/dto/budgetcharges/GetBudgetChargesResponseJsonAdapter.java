package com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/GetBudgetChargesResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/GetBudgetChargesResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/BudgetHeaderDto;", "budgetHeaderDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/BudgetSearchSectionDto;", "budgetSearchSectionDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/BudgetFoundInvoicesSectionDto;", "nullableBudgetFoundInvoicesSectionDtoAdapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetBudgetChargesResponseJsonAdapter extends JsonAdapter<GetBudgetChargesResponse> {
    private final JsonAdapter<BudgetHeaderDto> budgetHeaderDtoAdapter;
    private final JsonAdapter<BudgetSearchSectionDto> budgetSearchSectionDtoAdapter;
    private final JsonAdapter<BudgetFoundInvoicesSectionDto> nullableBudgetFoundInvoicesSectionDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("header", "search_section", "found_invoices_section");

    public GetBudgetChargesResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.budgetHeaderDtoAdapter = moshi.adapter(BudgetHeaderDto.class, emptySet, "header");
        this.budgetSearchSectionDtoAdapter = moshi.adapter(BudgetSearchSectionDto.class, emptySet, "searchSection");
        this.nullableBudgetFoundInvoicesSectionDtoAdapter = moshi.adapter(BudgetFoundInvoicesSectionDto.class, emptySet, "foundInvoicesSection");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GetBudgetChargesResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        BudgetHeaderDto budgetHeaderDto = null;
        BudgetSearchSectionDto budgetSearchSectionDto = null;
        BudgetFoundInvoicesSectionDto budgetFoundInvoicesSectionDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                budgetHeaderDto = this.budgetHeaderDtoAdapter.fromJson(jsonReader);
                if (budgetHeaderDto == null) {
                    throw Util.unexpectedNull("header_", "header", jsonReader);
                }
            } else if (selectName == 1) {
                budgetSearchSectionDto = this.budgetSearchSectionDtoAdapter.fromJson(jsonReader);
                if (budgetSearchSectionDto == null) {
                    throw Util.unexpectedNull("searchSection", "search_section", jsonReader);
                }
            } else if (selectName == 2) {
                budgetFoundInvoicesSectionDto = this.nullableBudgetFoundInvoicesSectionDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (budgetHeaderDto == null) {
            throw Util.missingProperty("header_", "header", jsonReader);
        }
        if (budgetSearchSectionDto != null) {
            return new GetBudgetChargesResponse(budgetHeaderDto, budgetSearchSectionDto, budgetFoundInvoicesSectionDto);
        }
        throw Util.missingProperty("searchSection", "search_section", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GetBudgetChargesResponse getBudgetChargesResponse) {
        GetBudgetChargesResponse getBudgetChargesResponse2 = getBudgetChargesResponse;
        if (getBudgetChargesResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("header");
        this.budgetHeaderDtoAdapter.toJson(jsonWriter, (JsonWriter) getBudgetChargesResponse2.getHeader());
        jsonWriter.name("search_section");
        this.budgetSearchSectionDtoAdapter.toJson(jsonWriter, (JsonWriter) getBudgetChargesResponse2.getSearchSection());
        jsonWriter.name("found_invoices_section");
        this.nullableBudgetFoundInvoicesSectionDtoAdapter.toJson(jsonWriter, (JsonWriter) getBudgetChargesResponse2.getFoundInvoicesSection());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(46, "GeneratedJsonAdapter(GetBudgetChargesResponse)");
    }
}
