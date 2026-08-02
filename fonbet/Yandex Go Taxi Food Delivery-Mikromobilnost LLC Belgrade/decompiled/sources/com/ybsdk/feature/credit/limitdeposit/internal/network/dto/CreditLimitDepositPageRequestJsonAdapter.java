package com.ybsdk.feature.credit.limitdeposit.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.feature.credit.deposit.internal.network.dto.CurrentPaymentMethodInfo;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/credit/limitdeposit/internal/network/dto/CreditLimitDepositPageRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/credit/limitdeposit/internal/network/dto/CreditLimitDepositPageRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/Money;", "nullableMoneyAdapter", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CurrentPaymentMethodInfo;", "nullableCurrentPaymentMethodInfoAdapter", "nullableStringAdapter", "feature-credit-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreditLimitDepositPageRequestJsonAdapter extends JsonAdapter<CreditLimitDepositPageRequest> {
    private final JsonAdapter<CurrentPaymentMethodInfo> nullableCurrentPaymentMethodInfoAdapter;
    private final JsonAdapter<Money> nullableMoneyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("agreement_id", "current_amount", "current_payment_method_info", "scenario");
    private final JsonAdapter<String> stringAdapter;

    public CreditLimitDepositPageRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "agreementId");
        this.nullableMoneyAdapter = moshi.adapter(Money.class, emptySet, "currentAmount");
        this.nullableCurrentPaymentMethodInfoAdapter = moshi.adapter(CurrentPaymentMethodInfo.class, emptySet, "currentPaymentMethodInfo");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "scenario");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CreditLimitDepositPageRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        Money money = null;
        CurrentPaymentMethodInfo currentPaymentMethodInfo = null;
        String str2 = null;
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
                money = this.nullableMoneyAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                currentPaymentMethodInfo = this.nullableCurrentPaymentMethodInfoAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str != null) {
            return new CreditLimitDepositPageRequest(str, money, currentPaymentMethodInfo, str2);
        }
        throw Util.missingProperty("agreementId", "agreement_id", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CreditLimitDepositPageRequest creditLimitDepositPageRequest) {
        CreditLimitDepositPageRequest creditLimitDepositPageRequest2 = creditLimitDepositPageRequest;
        if (creditLimitDepositPageRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("agreement_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) creditLimitDepositPageRequest2.getAgreementId());
        jsonWriter.name("current_amount");
        this.nullableMoneyAdapter.toJson(jsonWriter, (JsonWriter) creditLimitDepositPageRequest2.getCurrentAmount());
        jsonWriter.name("current_payment_method_info");
        this.nullableCurrentPaymentMethodInfoAdapter.toJson(jsonWriter, (JsonWriter) creditLimitDepositPageRequest2.getCurrentPaymentMethodInfo());
        jsonWriter.name("scenario");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) creditLimitDepositPageRequest2.getScenario());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(51, "GeneratedJsonAdapter(CreditLimitDepositPageRequest)");
    }
}
