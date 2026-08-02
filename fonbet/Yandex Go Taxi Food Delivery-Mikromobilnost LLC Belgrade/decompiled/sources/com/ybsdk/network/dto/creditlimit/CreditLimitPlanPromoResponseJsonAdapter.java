package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.MoneyCommonResponse;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPromoResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPromoResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPromoType;", "creditLimitPlanPromoTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;", "moneyCommonResponseAdapter", "", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPaymentResponse;", "listOfCreditLimitPlanPaymentResponseAdapter", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPromoOrderAmountCondition;", "nullableCreditLimitPlanPromoOrderAmountConditionAdapter", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanDisclaimerResponse;", "nullableCreditLimitPlanDisclaimerResponseAdapter", "", "nullableStringAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreditLimitPlanPromoResponseJsonAdapter extends JsonAdapter<CreditLimitPlanPromoResponse> {
    private final JsonAdapter<CreditLimitPlanPromoType> creditLimitPlanPromoTypeAdapter;
    private final JsonAdapter<List<CreditLimitPlanPaymentResponse>> listOfCreditLimitPlanPaymentResponseAdapter;
    private final JsonAdapter<MoneyCommonResponse> moneyCommonResponseAdapter;
    private final JsonAdapter<CreditLimitPlanDisclaimerResponse> nullableCreditLimitPlanDisclaimerResponseAdapter;
    private final JsonAdapter<CreditLimitPlanPromoOrderAmountCondition> nullableCreditLimitPlanPromoOrderAmountConditionAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("type", "fee", "payments", "condition_amount", "disclaimer_document_link", "id");

    public CreditLimitPlanPromoResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.creditLimitPlanPromoTypeAdapter = moshi.adapter(CreditLimitPlanPromoType.class, emptySet, "type");
        this.moneyCommonResponseAdapter = moshi.adapter(MoneyCommonResponse.class, emptySet, "fee");
        this.listOfCreditLimitPlanPaymentResponseAdapter = moshi.adapter(Types.newParameterizedType(List.class, CreditLimitPlanPaymentResponse.class), emptySet, "payments");
        this.nullableCreditLimitPlanPromoOrderAmountConditionAdapter = moshi.adapter(CreditLimitPlanPromoOrderAmountCondition.class, emptySet, "conditionAmount");
        this.nullableCreditLimitPlanDisclaimerResponseAdapter = moshi.adapter(CreditLimitPlanDisclaimerResponse.class, emptySet, "disclaimerDocumentLink");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "id");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CreditLimitPlanPromoResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        CreditLimitPlanPromoType creditLimitPlanPromoType = null;
        MoneyCommonResponse moneyCommonResponse = null;
        List<CreditLimitPlanPaymentResponse> list = null;
        CreditLimitPlanPromoOrderAmountCondition creditLimitPlanPromoOrderAmountCondition = null;
        CreditLimitPlanDisclaimerResponse creditLimitPlanDisclaimerResponse = null;
        String str = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    creditLimitPlanPromoType = this.creditLimitPlanPromoTypeAdapter.fromJson(jsonReader);
                    if (creditLimitPlanPromoType == null) {
                        throw Util.unexpectedNull("type", "type", jsonReader);
                    }
                    break;
                case 1:
                    moneyCommonResponse = this.moneyCommonResponseAdapter.fromJson(jsonReader);
                    if (moneyCommonResponse == null) {
                        throw Util.unexpectedNull("fee", "fee", jsonReader);
                    }
                    break;
                case 2:
                    list = this.listOfCreditLimitPlanPaymentResponseAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("payments", "payments", jsonReader);
                    }
                    break;
                case 3:
                    creditLimitPlanPromoOrderAmountCondition = this.nullableCreditLimitPlanPromoOrderAmountConditionAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    creditLimitPlanDisclaimerResponse = this.nullableCreditLimitPlanDisclaimerResponseAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (creditLimitPlanPromoType == null) {
            throw Util.missingProperty("type", "type", jsonReader);
        }
        if (moneyCommonResponse == null) {
            throw Util.missingProperty("fee", "fee", jsonReader);
        }
        if (list != null) {
            return new CreditLimitPlanPromoResponse(creditLimitPlanPromoType, moneyCommonResponse, list, creditLimitPlanPromoOrderAmountCondition, creditLimitPlanDisclaimerResponse, str);
        }
        throw Util.missingProperty("payments", "payments", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CreditLimitPlanPromoResponse creditLimitPlanPromoResponse) {
        CreditLimitPlanPromoResponse creditLimitPlanPromoResponse2 = creditLimitPlanPromoResponse;
        if (creditLimitPlanPromoResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("type");
        this.creditLimitPlanPromoTypeAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlanPromoResponse2.getType());
        jsonWriter.name("fee");
        this.moneyCommonResponseAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlanPromoResponse2.getFee());
        jsonWriter.name("payments");
        this.listOfCreditLimitPlanPaymentResponseAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlanPromoResponse2.getPayments());
        jsonWriter.name("condition_amount");
        this.nullableCreditLimitPlanPromoOrderAmountConditionAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlanPromoResponse2.getConditionAmount());
        jsonWriter.name("disclaimer_document_link");
        this.nullableCreditLimitPlanDisclaimerResponseAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlanPromoResponse2.getDisclaimerDocumentLink());
        jsonWriter.name("id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlanPromoResponse2.getId());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(50, "GeneratedJsonAdapter(CreditLimitPlanPromoResponse)");
    }
}
