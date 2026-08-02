package com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges.requisites;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.divkit.api.dto.DivScreenDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/requisites/BudgetInvoiceRequisitesResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/requisites/BudgetInvoiceRequisitesResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/divkit/api/dto/DivScreenDto;", "divScreenDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BudgetInvoiceRequisitesResponseJsonAdapter extends JsonAdapter<BudgetInvoiceRequisitesResponse> {
    private final JsonAdapter<DivScreenDto> divScreenDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("divkit_screen");

    public BudgetInvoiceRequisitesResponseJsonAdapter(Moshi moshi) {
        this.divScreenDtoAdapter = moshi.adapter(DivScreenDto.class, EmptySet.a, "divkitScreen");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final BudgetInvoiceRequisitesResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        DivScreenDto divScreenDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0 && (divScreenDto = this.divScreenDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("divkitScreen", "divkit_screen", jsonReader);
            }
        }
        jsonReader.endObject();
        if (divScreenDto != null) {
            return new BudgetInvoiceRequisitesResponse(divScreenDto);
        }
        throw Util.missingProperty("divkitScreen", "divkit_screen", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, BudgetInvoiceRequisitesResponse budgetInvoiceRequisitesResponse) {
        BudgetInvoiceRequisitesResponse budgetInvoiceRequisitesResponse2 = budgetInvoiceRequisitesResponse;
        if (budgetInvoiceRequisitesResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("divkit_screen");
        this.divScreenDtoAdapter.toJson(jsonWriter, (JsonWriter) budgetInvoiceRequisitesResponse2.getDivkitScreen());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(53, "GeneratedJsonAdapter(BudgetInvoiceRequisitesResponse)");
    }
}
