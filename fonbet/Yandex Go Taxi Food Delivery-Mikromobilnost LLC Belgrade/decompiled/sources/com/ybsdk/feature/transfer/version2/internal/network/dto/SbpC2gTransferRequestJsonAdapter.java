package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.feature.transfer.version2.api.dto.C2gTransferRequisitesDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SbpC2gTransferRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SbpC2gTransferRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/Money;", "moneyAdapter", "Lcom/ybsdk/feature/transfer/version2/api/dto/C2gTransferRequisitesDto;", "c2gTransferRequisitesDtoAdapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SbpC2gTransferRequestJsonAdapter extends JsonAdapter<SbpC2gTransferRequest> {
    private final JsonAdapter<C2gTransferRequisitesDto> c2gTransferRequisitesDtoAdapter;
    private final JsonAdapter<Money> moneyAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("agreement_id", "money", "invoice_id", "requisites");
    private final JsonAdapter<String> stringAdapter;

    public SbpC2gTransferRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "agreementId");
        this.moneyAdapter = moshi.adapter(Money.class, emptySet, "money");
        this.c2gTransferRequisitesDtoAdapter = moshi.adapter(C2gTransferRequisitesDto.class, emptySet, "requisites");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SbpC2gTransferRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        Money money = null;
        String str2 = null;
        C2gTransferRequisitesDto c2gTransferRequisitesDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("agreementId", "agreement_id", jsonReader);
                }
            } else if (selectName == 1) {
                money = this.moneyAdapter.fromJson(jsonReader);
                if (money == null) {
                    throw Util.unexpectedNull("money", "money", jsonReader);
                }
            } else if (selectName == 2) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("invoiceId", "invoice_id", jsonReader);
                }
            } else if (selectName == 3 && (c2gTransferRequisitesDto = this.c2gTransferRequisitesDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("requisites", "requisites", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("agreementId", "agreement_id", jsonReader);
        }
        if (money == null) {
            throw Util.missingProperty("money", "money", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("invoiceId", "invoice_id", jsonReader);
        }
        if (c2gTransferRequisitesDto != null) {
            return new SbpC2gTransferRequest(str, money, str2, c2gTransferRequisitesDto);
        }
        throw Util.missingProperty("requisites", "requisites", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SbpC2gTransferRequest sbpC2gTransferRequest) {
        SbpC2gTransferRequest sbpC2gTransferRequest2 = sbpC2gTransferRequest;
        if (sbpC2gTransferRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("agreement_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) sbpC2gTransferRequest2.getAgreementId());
        jsonWriter.name("money");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) sbpC2gTransferRequest2.getMoney());
        jsonWriter.name("invoice_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) sbpC2gTransferRequest2.getInvoiceId());
        jsonWriter.name("requisites");
        this.c2gTransferRequisitesDtoAdapter.toJson(jsonWriter, (JsonWriter) sbpC2gTransferRequest2.getRequisites());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(SbpC2gTransferRequest)");
    }
}
