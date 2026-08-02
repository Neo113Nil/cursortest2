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

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/RequisitesLegalTransferRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/RequisitesLegalTransferRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/Money;", "moneyAdapter", "", "booleanAdapter", "nullableStringAdapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RequisitesLegalTransferRequestJsonAdapter extends JsonAdapter<RequisitesLegalTransferRequest> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Money> moneyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("agreement_id", "money", "account_number", "bic", "legal_name", "inn", "include_vat", "payment_purpose");
    private final JsonAdapter<String> stringAdapter;

    public RequisitesLegalTransferRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "agreementId");
        this.moneyAdapter = moshi.adapter(Money.class, emptySet, "money");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "includeVat");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "paymentPurpose");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final RequisitesLegalTransferRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        String str = null;
        Money money = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (true) {
            Boolean bool2 = bool;
            String str7 = str;
            Money money2 = money;
            String str8 = str2;
            String str9 = str3;
            if (!jsonReader.hasNext()) {
                String str10 = str4;
                jsonReader.endObject();
                if (str7 == null) {
                    throw Util.missingProperty("agreementId", "agreement_id", jsonReader);
                }
                if (money2 == null) {
                    throw Util.missingProperty("money", "money", jsonReader);
                }
                if (str8 == null) {
                    throw Util.missingProperty("accountNumber", "account_number", jsonReader);
                }
                if (str9 == null) {
                    throw Util.missingProperty("bic", "bic", jsonReader);
                }
                if (str10 == null) {
                    throw Util.missingProperty("beneficiaryName", "legal_name", jsonReader);
                }
                if (str5 == null) {
                    throw Util.missingProperty("inn", "inn", jsonReader);
                }
                if (bool2 != null) {
                    return new RequisitesLegalTransferRequest(str7, money2, str8, str9, str10, str5, bool2.booleanValue(), str6);
                }
                throw Util.missingProperty("includeVat", "include_vat", jsonReader);
            }
            String str11 = str4;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    bool = bool2;
                    str4 = str11;
                    str = str7;
                    money = money2;
                    str2 = str8;
                    str3 = str9;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("agreementId", "agreement_id", jsonReader);
                    }
                    bool = bool2;
                    str4 = str11;
                    money = money2;
                    str2 = str8;
                    str3 = str9;
                case 1:
                    Money fromJson = this.moneyAdapter.fromJson(jsonReader);
                    if (fromJson == null) {
                        throw Util.unexpectedNull("money", "money", jsonReader);
                    }
                    money = fromJson;
                    bool = bool2;
                    str4 = str11;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                case 2:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("accountNumber", "account_number", jsonReader);
                    }
                    bool = bool2;
                    str4 = str11;
                    str = str7;
                    money = money2;
                    str3 = str9;
                case 3:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("bic", "bic", jsonReader);
                    }
                    bool = bool2;
                    str4 = str11;
                    str = str7;
                    money = money2;
                    str2 = str8;
                case 4:
                    str4 = this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("beneficiaryName", "legal_name", jsonReader);
                    }
                    bool = bool2;
                    str = str7;
                    money = money2;
                    str2 = str8;
                    str3 = str9;
                case 5:
                    str5 = this.stringAdapter.fromJson(jsonReader);
                    if (str5 == null) {
                        throw Util.unexpectedNull("inn", "inn", jsonReader);
                    }
                    bool = bool2;
                    str4 = str11;
                    str = str7;
                    money = money2;
                    str2 = str8;
                    str3 = str9;
                case 6:
                    bool = this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        throw Util.unexpectedNull("includeVat", "include_vat", jsonReader);
                    }
                    str4 = str11;
                    str = str7;
                    money = money2;
                    str2 = str8;
                    str3 = str9;
                case 7:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    bool = bool2;
                    str4 = str11;
                    str = str7;
                    money = money2;
                    str2 = str8;
                    str3 = str9;
                default:
                    bool = bool2;
                    str4 = str11;
                    str = str7;
                    money = money2;
                    str2 = str8;
                    str3 = str9;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, RequisitesLegalTransferRequest requisitesLegalTransferRequest) {
        RequisitesLegalTransferRequest requisitesLegalTransferRequest2 = requisitesLegalTransferRequest;
        if (requisitesLegalTransferRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("agreement_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) requisitesLegalTransferRequest2.getAgreementId());
        jsonWriter.name("money");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) requisitesLegalTransferRequest2.getMoney());
        jsonWriter.name("account_number");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) requisitesLegalTransferRequest2.getAccountNumber());
        jsonWriter.name("bic");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) requisitesLegalTransferRequest2.getBic());
        jsonWriter.name("legal_name");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) requisitesLegalTransferRequest2.getBeneficiaryName());
        jsonWriter.name("inn");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) requisitesLegalTransferRequest2.getInn());
        jsonWriter.name("include_vat");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(requisitesLegalTransferRequest2.getIncludeVat()));
        jsonWriter.name("payment_purpose");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) requisitesLegalTransferRequest2.getPaymentPurpose());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(52, "GeneratedJsonAdapter(RequisitesLegalTransferRequest)");
    }
}
