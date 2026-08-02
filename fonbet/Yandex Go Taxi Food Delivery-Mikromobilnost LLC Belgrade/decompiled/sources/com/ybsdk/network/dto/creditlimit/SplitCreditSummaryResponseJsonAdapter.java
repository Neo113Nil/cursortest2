package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.ny61;
import defpackage.uw51;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/SplitCreditSummaryResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/creditlimit/SplitCreditSummaryResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Ljava/math/BigDecimal;", "bigDecimalAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/Money;", "moneyAdapter", "Lcom/ybsdk/network/dto/creditlimit/CreditPlanLimit;", "nullableCreditPlanLimitAdapter", "Lcom/ybsdk/network/dto/creditlimit/SplitCreditSummaryResponseNextPayment;", "nullableSplitCreditSummaryResponseNextPaymentAdapter", "nullableBigDecimalAdapter", "nullableMoneyAdapter", "", "nullableStringAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SplitCreditSummaryResponseJsonAdapter extends JsonAdapter<SplitCreditSummaryResponse> {
    private final JsonAdapter<BigDecimal> bigDecimalAdapter;
    private final JsonAdapter<Money> moneyAdapter;
    private final JsonAdapter<BigDecimal> nullableBigDecimalAdapter;
    private final JsonAdapter<CreditPlanLimit> nullableCreditPlanLimitAdapter;
    private final JsonAdapter<Money> nullableMoneyAdapter;
    private final JsonAdapter<SplitCreditSummaryResponseNextPayment> nullableSplitCreditSummaryResponseNextPaymentAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("remaining_payments_count", "total_dept", "total_splits_count", "limit", "next_payment", "overdue_payments_count", "overdue_payments_amount", "overdue_days", "account_url", "onboarding_url");

    public SplitCreditSummaryResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.bigDecimalAdapter = moshi.adapter(BigDecimal.class, emptySet, "remainingPaymentsCount");
        this.moneyAdapter = moshi.adapter(Money.class, emptySet, "totalDept");
        this.nullableCreditPlanLimitAdapter = moshi.adapter(CreditPlanLimit.class, emptySet, "limit");
        this.nullableSplitCreditSummaryResponseNextPaymentAdapter = moshi.adapter(SplitCreditSummaryResponseNextPayment.class, emptySet, "nextPayment");
        this.nullableBigDecimalAdapter = moshi.adapter(BigDecimal.class, emptySet, "overduePaymentsCount");
        this.nullableMoneyAdapter = moshi.adapter(Money.class, emptySet, "overduePaymentsAmount");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "accountUrl");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SplitCreditSummaryResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        BigDecimal bigDecimal = null;
        Money money = null;
        BigDecimal bigDecimal2 = null;
        CreditPlanLimit creditPlanLimit = null;
        SplitCreditSummaryResponseNextPayment splitCreditSummaryResponseNextPayment = null;
        BigDecimal bigDecimal3 = null;
        Money money2 = null;
        BigDecimal bigDecimal4 = null;
        String str = null;
        String str2 = null;
        while (true) {
            BigDecimal bigDecimal5 = bigDecimal;
            Money money3 = money;
            if (!jsonReader.hasNext()) {
                BigDecimal bigDecimal6 = bigDecimal2;
                jsonReader.endObject();
                if (bigDecimal5 == null) {
                    throw Util.missingProperty("remainingPaymentsCount", "remaining_payments_count", jsonReader);
                }
                if (money3 == null) {
                    throw Util.missingProperty("totalDept", "total_dept", jsonReader);
                }
                if (bigDecimal6 != null) {
                    return new SplitCreditSummaryResponse(bigDecimal5, money3, bigDecimal6, creditPlanLimit, splitCreditSummaryResponseNextPayment, bigDecimal3, money2, bigDecimal4, str, str2);
                }
                throw Util.missingProperty("totalSplitsCount", "total_splits_count", jsonReader);
            }
            BigDecimal bigDecimal7 = bigDecimal2;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    bigDecimal2 = bigDecimal7;
                    bigDecimal = bigDecimal5;
                    money = money3;
                case 0:
                    bigDecimal = this.bigDecimalAdapter.fromJson(jsonReader);
                    if (bigDecimal == null) {
                        throw Util.unexpectedNull("remainingPaymentsCount", "remaining_payments_count", jsonReader);
                    }
                    bigDecimal2 = bigDecimal7;
                    money = money3;
                case 1:
                    money = this.moneyAdapter.fromJson(jsonReader);
                    if (money == null) {
                        throw Util.unexpectedNull("totalDept", "total_dept", jsonReader);
                    }
                    bigDecimal2 = bigDecimal7;
                    bigDecimal = bigDecimal5;
                case 2:
                    bigDecimal2 = this.bigDecimalAdapter.fromJson(jsonReader);
                    if (bigDecimal2 == null) {
                        throw Util.unexpectedNull("totalSplitsCount", "total_splits_count", jsonReader);
                    }
                    bigDecimal = bigDecimal5;
                    money = money3;
                case 3:
                    creditPlanLimit = this.nullableCreditPlanLimitAdapter.fromJson(jsonReader);
                    bigDecimal2 = bigDecimal7;
                    bigDecimal = bigDecimal5;
                    money = money3;
                case 4:
                    splitCreditSummaryResponseNextPayment = this.nullableSplitCreditSummaryResponseNextPaymentAdapter.fromJson(jsonReader);
                    bigDecimal2 = bigDecimal7;
                    bigDecimal = bigDecimal5;
                    money = money3;
                case 5:
                    bigDecimal3 = this.nullableBigDecimalAdapter.fromJson(jsonReader);
                    bigDecimal2 = bigDecimal7;
                    bigDecimal = bigDecimal5;
                    money = money3;
                case 6:
                    money2 = this.nullableMoneyAdapter.fromJson(jsonReader);
                    bigDecimal2 = bigDecimal7;
                    bigDecimal = bigDecimal5;
                    money = money3;
                case 7:
                    bigDecimal4 = this.nullableBigDecimalAdapter.fromJson(jsonReader);
                    bigDecimal2 = bigDecimal7;
                    bigDecimal = bigDecimal5;
                    money = money3;
                case 8:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    bigDecimal2 = bigDecimal7;
                    bigDecimal = bigDecimal5;
                    money = money3;
                case 9:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    bigDecimal2 = bigDecimal7;
                    bigDecimal = bigDecimal5;
                    money = money3;
                default:
                    bigDecimal2 = bigDecimal7;
                    bigDecimal = bigDecimal5;
                    money = money3;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SplitCreditSummaryResponse splitCreditSummaryResponse) {
        SplitCreditSummaryResponse splitCreditSummaryResponse2 = splitCreditSummaryResponse;
        if (splitCreditSummaryResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("remaining_payments_count");
        this.bigDecimalAdapter.toJson(jsonWriter, (JsonWriter) splitCreditSummaryResponse2.getRemainingPaymentsCount());
        jsonWriter.name("total_dept");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) splitCreditSummaryResponse2.getTotalDept());
        jsonWriter.name("total_splits_count");
        this.bigDecimalAdapter.toJson(jsonWriter, (JsonWriter) splitCreditSummaryResponse2.getTotalSplitsCount());
        jsonWriter.name("limit");
        this.nullableCreditPlanLimitAdapter.toJson(jsonWriter, (JsonWriter) splitCreditSummaryResponse2.getLimit());
        jsonWriter.name("next_payment");
        this.nullableSplitCreditSummaryResponseNextPaymentAdapter.toJson(jsonWriter, (JsonWriter) splitCreditSummaryResponse2.getNextPayment());
        jsonWriter.name("overdue_payments_count");
        this.nullableBigDecimalAdapter.toJson(jsonWriter, (JsonWriter) splitCreditSummaryResponse2.getOverduePaymentsCount());
        jsonWriter.name("overdue_payments_amount");
        this.nullableMoneyAdapter.toJson(jsonWriter, (JsonWriter) splitCreditSummaryResponse2.getOverduePaymentsAmount());
        jsonWriter.name("overdue_days");
        this.nullableBigDecimalAdapter.toJson(jsonWriter, (JsonWriter) splitCreditSummaryResponse2.getOverdueDays());
        jsonWriter.name("account_url");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) splitCreditSummaryResponse2.getAccountUrl());
        jsonWriter.name("onboarding_url");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) splitCreditSummaryResponse2.getOnboardingUrl());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(48, "GeneratedJsonAdapter(SplitCreditSummaryResponse)");
    }
}
