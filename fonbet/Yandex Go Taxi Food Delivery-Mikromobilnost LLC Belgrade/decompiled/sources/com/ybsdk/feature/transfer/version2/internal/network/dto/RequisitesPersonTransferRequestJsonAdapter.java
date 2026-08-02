package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/RequisitesPersonTransferRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/RequisitesPersonTransferRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/Money;", "moneyAdapter", "nullableStringAdapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RequisitesPersonTransferRequestJsonAdapter extends JsonAdapter<RequisitesPersonTransferRequest> {
    private final JsonAdapter<Money> moneyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("agreement_id", "money", "account_number", "bic", "name", "payment_purpose");
    private final JsonAdapter<String> stringAdapter;

    public RequisitesPersonTransferRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "agreementId");
        this.moneyAdapter = moshi.adapter(Money.class, emptySet, "money");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "paymentPurpose");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final RequisitesPersonTransferRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        Money money = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("agreementId", "agreement_id", jsonReader);
                    }
                    break;
                case 1:
                    money = this.moneyAdapter.fromJson(jsonReader);
                    if (money == null) {
                        throw Util.unexpectedNull("money", "money", jsonReader);
                    }
                    break;
                case 2:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("accountNumber", "account_number", jsonReader);
                    }
                    break;
                case 3:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("bic", "bic", jsonReader);
                    }
                    break;
                case 4:
                    str4 = this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("name", "name", jsonReader);
                    }
                    break;
                case 5:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
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
            throw Util.missingProperty("accountNumber", "account_number", jsonReader);
        }
        if (str3 == null) {
            throw Util.missingProperty("bic", "bic", jsonReader);
        }
        if (str4 != null) {
            return new RequisitesPersonTransferRequest(str, money, str2, str3, str4, str5);
        }
        throw Util.missingProperty("name", "name", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, RequisitesPersonTransferRequest requisitesPersonTransferRequest) {
        RequisitesPersonTransferRequest requisitesPersonTransferRequest2 = requisitesPersonTransferRequest;
        if (requisitesPersonTransferRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("agreement_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) requisitesPersonTransferRequest2.getAgreementId());
        jsonWriter.name("money");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) requisitesPersonTransferRequest2.getMoney());
        jsonWriter.name("account_number");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) requisitesPersonTransferRequest2.getAccountNumber());
        jsonWriter.name("bic");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) requisitesPersonTransferRequest2.getBic());
        jsonWriter.name("name");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) requisitesPersonTransferRequest2.getName());
        jsonWriter.name("payment_purpose");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) requisitesPersonTransferRequest2.getPaymentPurpose());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(53, "GeneratedJsonAdapter(RequisitesPersonTransferRequest)");
    }
}
