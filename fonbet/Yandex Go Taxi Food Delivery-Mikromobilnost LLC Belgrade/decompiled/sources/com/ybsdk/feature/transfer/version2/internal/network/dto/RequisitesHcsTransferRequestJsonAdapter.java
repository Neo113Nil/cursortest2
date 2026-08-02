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

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/RequisitesHcsTransferRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/RequisitesHcsTransferRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/Money;", "moneyAdapter", "", "booleanAdapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RequisitesHcsTransferRequestJsonAdapter extends JsonAdapter<RequisitesHcsTransferRequest> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Money> moneyAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("agreement_id", "money", "account_number", "bic", "legal_name", "inn", "include_vat", "payment_purpose", "hcs_personal_account", "payment_period");
    private final JsonAdapter<String> stringAdapter;

    public RequisitesHcsTransferRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "agreementId");
        this.moneyAdapter = moshi.adapter(Money.class, emptySet, "money");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "includeVat");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final RequisitesHcsTransferRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        String str = null;
        Money money = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        while (true) {
            Boolean bool2 = bool;
            String str9 = str;
            Money money2 = money;
            String str10 = str2;
            String str11 = str3;
            String str12 = str4;
            String str13 = str5;
            String str14 = str6;
            String str15 = str7;
            String str16 = str8;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (str9 == null) {
                    throw Util.missingProperty("agreementId", "agreement_id", jsonReader);
                }
                if (money2 == null) {
                    throw Util.missingProperty("money", "money", jsonReader);
                }
                if (str10 == null) {
                    throw Util.missingProperty("accountNumber", "account_number", jsonReader);
                }
                if (str11 == null) {
                    throw Util.missingProperty("bic", "bic", jsonReader);
                }
                if (str12 == null) {
                    throw Util.missingProperty("legalName", "legal_name", jsonReader);
                }
                if (str13 == null) {
                    throw Util.missingProperty("inn", "inn", jsonReader);
                }
                if (bool2 == null) {
                    throw Util.missingProperty("includeVat", "include_vat", jsonReader);
                }
                boolean booleanValue = bool2.booleanValue();
                if (str14 == null) {
                    throw Util.missingProperty("paymentPurpose", "payment_purpose", jsonReader);
                }
                if (str15 == null) {
                    throw Util.missingProperty("hcsPersonalAccount", "hcs_personal_account", jsonReader);
                }
                if (str16 != null) {
                    return new RequisitesHcsTransferRequest(str9, money2, str10, str11, str12, str13, booleanValue, str14, str15, str16);
                }
                throw Util.missingProperty("paymentPeriod", "payment_period", jsonReader);
            }
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    bool = bool2;
                    str = str9;
                    money = money2;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                    str8 = str16;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("agreementId", "agreement_id", jsonReader);
                    }
                    bool = bool2;
                    money = money2;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                    str8 = str16;
                case 1:
                    money = this.moneyAdapter.fromJson(jsonReader);
                    if (money == null) {
                        throw Util.unexpectedNull("money", "money", jsonReader);
                    }
                    bool = bool2;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                    str8 = str16;
                case 2:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("accountNumber", "account_number", jsonReader);
                    }
                    bool = bool2;
                    str = str9;
                    money = money2;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                    str8 = str16;
                case 3:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("bic", "bic", jsonReader);
                    }
                    bool = bool2;
                    str = str9;
                    money = money2;
                    str2 = str10;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                    str8 = str16;
                case 4:
                    str4 = this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("legalName", "legal_name", jsonReader);
                    }
                    bool = bool2;
                    str = str9;
                    money = money2;
                    str2 = str10;
                    str3 = str11;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                    str8 = str16;
                case 5:
                    str5 = this.stringAdapter.fromJson(jsonReader);
                    if (str5 == null) {
                        throw Util.unexpectedNull("inn", "inn", jsonReader);
                    }
                    bool = bool2;
                    str = str9;
                    money = money2;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str6 = str14;
                    str7 = str15;
                    str8 = str16;
                case 6:
                    bool = this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        throw Util.unexpectedNull("includeVat", "include_vat", jsonReader);
                    }
                    str = str9;
                    money = money2;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                    str8 = str16;
                case 7:
                    str6 = this.stringAdapter.fromJson(jsonReader);
                    if (str6 == null) {
                        throw Util.unexpectedNull("paymentPurpose", "payment_purpose", jsonReader);
                    }
                    bool = bool2;
                    str = str9;
                    money = money2;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str7 = str15;
                    str8 = str16;
                case 8:
                    str7 = this.stringAdapter.fromJson(jsonReader);
                    if (str7 == null) {
                        throw Util.unexpectedNull("hcsPersonalAccount", "hcs_personal_account", jsonReader);
                    }
                    bool = bool2;
                    str = str9;
                    money = money2;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str8 = str16;
                case 9:
                    String fromJson = this.stringAdapter.fromJson(jsonReader);
                    if (fromJson == null) {
                        throw Util.unexpectedNull("paymentPeriod", "payment_period", jsonReader);
                    }
                    str8 = fromJson;
                    bool = bool2;
                    str = str9;
                    money = money2;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                default:
                    bool = bool2;
                    str = str9;
                    money = money2;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                    str8 = str16;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, RequisitesHcsTransferRequest requisitesHcsTransferRequest) {
        RequisitesHcsTransferRequest requisitesHcsTransferRequest2 = requisitesHcsTransferRequest;
        if (requisitesHcsTransferRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("agreement_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) requisitesHcsTransferRequest2.getAgreementId());
        jsonWriter.name("money");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) requisitesHcsTransferRequest2.getMoney());
        jsonWriter.name("account_number");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) requisitesHcsTransferRequest2.getAccountNumber());
        jsonWriter.name("bic");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) requisitesHcsTransferRequest2.getBic());
        jsonWriter.name("legal_name");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) requisitesHcsTransferRequest2.getLegalName());
        jsonWriter.name("inn");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) requisitesHcsTransferRequest2.getInn());
        jsonWriter.name("include_vat");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(requisitesHcsTransferRequest2.getIncludeVat()));
        jsonWriter.name("payment_purpose");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) requisitesHcsTransferRequest2.getPaymentPurpose());
        jsonWriter.name("hcs_personal_account");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) requisitesHcsTransferRequest2.getHcsPersonalAccount());
        jsonWriter.name("payment_period");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) requisitesHcsTransferRequest2.getPaymentPeriod());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(50, "GeneratedJsonAdapter(RequisitesHcsTransferRequest)");
    }
}
