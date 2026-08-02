package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.MoneyCommonResponse;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\b\u0081\b\u0018\u00002\u00020\u0001B£\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\r\u0012\u000e\b\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\t\u00108\u001a\u00020\tHÆ\u0003J\t\u00109\u001a\u00020\u000bHÆ\u0003J\t\u0010:\u001a\u00020\rHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010=\u001a\u00020\rHÆ\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003J\t\u0010?\u001a\u00020\u000bHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u001aHÆ\u0003J¥\u0001\u0010C\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\b\u0003\u0010\u0010\u001a\u00020\r2\u000e\b\u0003\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0003\u0010\u0014\u001a\u00020\u000b2\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÆ\u0001J\u0013\u0010D\u001a\u00020\u00032\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020\u000bHÖ\u0001J\t\u0010G\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0014\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010&R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b3\u00104¨\u0006H"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanResponse;", "", "needUpgrade", "", "visualProperties", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanVisualPropertiesResponse;", "constructor", "", "paymentInterval", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPaymentIntervalResponse;", "creditLimitInMonths", "", "deposit", "Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;", "fee", "payment", "loan", "payments", "", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPaymentResponse;", "actualPaymentsCount", "disclaimer", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanDisclaimerResponse;", "promo", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPromoResponse;", "planAdditionalProperties", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanAdditionalProperties;", "<init>", "(ZLcom/ybsdk/network/dto/creditlimit/CreditLimitPlanVisualPropertiesResponse;Ljava/lang/String;Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPaymentIntervalResponse;ILcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;Ljava/util/List;ILcom/ybsdk/network/dto/creditlimit/CreditLimitPlanDisclaimerResponse;Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPromoResponse;Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanAdditionalProperties;)V", "getNeedUpgrade", "()Z", "getVisualProperties", "()Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanVisualPropertiesResponse;", "getConstructor", "()Ljava/lang/String;", "getPaymentInterval", "()Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPaymentIntervalResponse;", "getCreditLimitInMonths", "()I", "getDeposit", "()Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;", "getFee", "getPayment", "getLoan", "getPayments", "()Ljava/util/List;", "getActualPaymentsCount", "getDisclaimer", "()Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanDisclaimerResponse;", "getPromo", "()Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPromoResponse;", "getPlanAdditionalProperties", "()Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanAdditionalProperties;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreditLimitPlanResponse {
    private final int actualPaymentsCount;
    private final String constructor;
    private final int creditLimitInMonths;
    private final MoneyCommonResponse deposit;
    private final CreditLimitPlanDisclaimerResponse disclaimer;
    private final MoneyCommonResponse fee;
    private final MoneyCommonResponse loan;
    private final boolean needUpgrade;
    private final MoneyCommonResponse payment;
    private final CreditLimitPlanPaymentIntervalResponse paymentInterval;
    private final List<CreditLimitPlanPaymentResponse> payments;
    private final CreditLimitPlanAdditionalProperties planAdditionalProperties;
    private final CreditLimitPlanPromoResponse promo;
    private final CreditLimitPlanVisualPropertiesResponse visualProperties;

    public CreditLimitPlanResponse(@Json(name = "need_upgrade") boolean z, @Json(name = "visual_properties") CreditLimitPlanVisualPropertiesResponse creditLimitPlanVisualPropertiesResponse, @Json(name = "constructor") String str, @Json(name = "payment_interval") CreditLimitPlanPaymentIntervalResponse creditLimitPlanPaymentIntervalResponse, @Json(name = "credit_length_in_months") int i, @Json(name = "deposit") MoneyCommonResponse moneyCommonResponse, @Json(name = "fee") MoneyCommonResponse moneyCommonResponse2, @Json(name = "payment") MoneyCommonResponse moneyCommonResponse3, @Json(name = "loan") MoneyCommonResponse moneyCommonResponse4, @Json(name = "payments") List<CreditLimitPlanPaymentResponse> list, @Json(name = "actual_payments_count") int i2, @Json(name = "disclaimer") CreditLimitPlanDisclaimerResponse creditLimitPlanDisclaimerResponse, @Json(name = "promo") CreditLimitPlanPromoResponse creditLimitPlanPromoResponse, @Json(name = "plan_additional_properties") CreditLimitPlanAdditionalProperties creditLimitPlanAdditionalProperties) {
        this.needUpgrade = z;
        this.visualProperties = creditLimitPlanVisualPropertiesResponse;
        this.constructor = str;
        this.paymentInterval = creditLimitPlanPaymentIntervalResponse;
        this.creditLimitInMonths = i;
        this.deposit = moneyCommonResponse;
        this.fee = moneyCommonResponse2;
        this.payment = moneyCommonResponse3;
        this.loan = moneyCommonResponse4;
        this.payments = list;
        this.actualPaymentsCount = i2;
        this.disclaimer = creditLimitPlanDisclaimerResponse;
        this.promo = creditLimitPlanPromoResponse;
        this.planAdditionalProperties = creditLimitPlanAdditionalProperties;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getNeedUpgrade() {
        return this.needUpgrade;
    }

    public final List<CreditLimitPlanPaymentResponse> component10() {
        return this.payments;
    }

    /* renamed from: component11, reason: from getter */
    public final int getActualPaymentsCount() {
        return this.actualPaymentsCount;
    }

    /* renamed from: component12, reason: from getter */
    public final CreditLimitPlanDisclaimerResponse getDisclaimer() {
        return this.disclaimer;
    }

    /* renamed from: component13, reason: from getter */
    public final CreditLimitPlanPromoResponse getPromo() {
        return this.promo;
    }

    /* renamed from: component14, reason: from getter */
    public final CreditLimitPlanAdditionalProperties getPlanAdditionalProperties() {
        return this.planAdditionalProperties;
    }

    /* renamed from: component2, reason: from getter */
    public final CreditLimitPlanVisualPropertiesResponse getVisualProperties() {
        return this.visualProperties;
    }

    /* renamed from: component3, reason: from getter */
    public final String getConstructor() {
        return this.constructor;
    }

    /* renamed from: component4, reason: from getter */
    public final CreditLimitPlanPaymentIntervalResponse getPaymentInterval() {
        return this.paymentInterval;
    }

    /* renamed from: component5, reason: from getter */
    public final int getCreditLimitInMonths() {
        return this.creditLimitInMonths;
    }

    /* renamed from: component6, reason: from getter */
    public final MoneyCommonResponse getDeposit() {
        return this.deposit;
    }

    /* renamed from: component7, reason: from getter */
    public final MoneyCommonResponse getFee() {
        return this.fee;
    }

    /* renamed from: component8, reason: from getter */
    public final MoneyCommonResponse getPayment() {
        return this.payment;
    }

    /* renamed from: component9, reason: from getter */
    public final MoneyCommonResponse getLoan() {
        return this.loan;
    }

    public final CreditLimitPlanResponse copy(@Json(name = "need_upgrade") boolean needUpgrade, @Json(name = "visual_properties") CreditLimitPlanVisualPropertiesResponse visualProperties, @Json(name = "constructor") String constructor, @Json(name = "payment_interval") CreditLimitPlanPaymentIntervalResponse paymentInterval, @Json(name = "credit_length_in_months") int creditLimitInMonths, @Json(name = "deposit") MoneyCommonResponse deposit, @Json(name = "fee") MoneyCommonResponse fee, @Json(name = "payment") MoneyCommonResponse payment, @Json(name = "loan") MoneyCommonResponse loan, @Json(name = "payments") List<CreditLimitPlanPaymentResponse> payments, @Json(name = "actual_payments_count") int actualPaymentsCount, @Json(name = "disclaimer") CreditLimitPlanDisclaimerResponse disclaimer, @Json(name = "promo") CreditLimitPlanPromoResponse promo, @Json(name = "plan_additional_properties") CreditLimitPlanAdditionalProperties planAdditionalProperties) {
        return new CreditLimitPlanResponse(needUpgrade, visualProperties, constructor, paymentInterval, creditLimitInMonths, deposit, fee, payment, loan, payments, actualPaymentsCount, disclaimer, promo, planAdditionalProperties);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditLimitPlanResponse)) {
            return false;
        }
        CreditLimitPlanResponse creditLimitPlanResponse = (CreditLimitPlanResponse) other;
        return this.needUpgrade == creditLimitPlanResponse.needUpgrade && jl40.l(this.visualProperties, creditLimitPlanResponse.visualProperties) && jl40.l(this.constructor, creditLimitPlanResponse.constructor) && jl40.l(this.paymentInterval, creditLimitPlanResponse.paymentInterval) && this.creditLimitInMonths == creditLimitPlanResponse.creditLimitInMonths && jl40.l(this.deposit, creditLimitPlanResponse.deposit) && jl40.l(this.fee, creditLimitPlanResponse.fee) && jl40.l(this.payment, creditLimitPlanResponse.payment) && jl40.l(this.loan, creditLimitPlanResponse.loan) && jl40.l(this.payments, creditLimitPlanResponse.payments) && this.actualPaymentsCount == creditLimitPlanResponse.actualPaymentsCount && jl40.l(this.disclaimer, creditLimitPlanResponse.disclaimer) && jl40.l(this.promo, creditLimitPlanResponse.promo) && jl40.l(this.planAdditionalProperties, creditLimitPlanResponse.planAdditionalProperties);
    }

    public final int getActualPaymentsCount() {
        return this.actualPaymentsCount;
    }

    public final String getConstructor() {
        return this.constructor;
    }

    public final int getCreditLimitInMonths() {
        return this.creditLimitInMonths;
    }

    public final MoneyCommonResponse getDeposit() {
        return this.deposit;
    }

    public final CreditLimitPlanDisclaimerResponse getDisclaimer() {
        return this.disclaimer;
    }

    public final MoneyCommonResponse getFee() {
        return this.fee;
    }

    public final MoneyCommonResponse getLoan() {
        return this.loan;
    }

    public final boolean getNeedUpgrade() {
        return this.needUpgrade;
    }

    public final MoneyCommonResponse getPayment() {
        return this.payment;
    }

    public final CreditLimitPlanPaymentIntervalResponse getPaymentInterval() {
        return this.paymentInterval;
    }

    public final List<CreditLimitPlanPaymentResponse> getPayments() {
        return this.payments;
    }

    public final CreditLimitPlanAdditionalProperties getPlanAdditionalProperties() {
        return this.planAdditionalProperties;
    }

    public final CreditLimitPlanPromoResponse getPromo() {
        return this.promo;
    }

    public final CreditLimitPlanVisualPropertiesResponse getVisualProperties() {
        return this.visualProperties;
    }

    public int hashCode() {
        int hashCode = (this.deposit.hashCode() + oyr.b(this.creditLimitInMonths, (this.paymentInterval.hashCode() + unr0.b((this.visualProperties.hashCode() + (Boolean.hashCode(this.needUpgrade) * 31)) * 31, 31, this.constructor)) * 31, 31)) * 31;
        MoneyCommonResponse moneyCommonResponse = this.fee;
        int hashCode2 = (hashCode + (moneyCommonResponse == null ? 0 : moneyCommonResponse.hashCode())) * 31;
        MoneyCommonResponse moneyCommonResponse2 = this.payment;
        int b = oyr.b(this.actualPaymentsCount, unr0.c((this.loan.hashCode() + ((hashCode2 + (moneyCommonResponse2 == null ? 0 : moneyCommonResponse2.hashCode())) * 31)) * 31, 31, this.payments), 31);
        CreditLimitPlanDisclaimerResponse creditLimitPlanDisclaimerResponse = this.disclaimer;
        int hashCode3 = (b + (creditLimitPlanDisclaimerResponse == null ? 0 : creditLimitPlanDisclaimerResponse.hashCode())) * 31;
        CreditLimitPlanPromoResponse creditLimitPlanPromoResponse = this.promo;
        int hashCode4 = (hashCode3 + (creditLimitPlanPromoResponse == null ? 0 : creditLimitPlanPromoResponse.hashCode())) * 31;
        CreditLimitPlanAdditionalProperties creditLimitPlanAdditionalProperties = this.planAdditionalProperties;
        return hashCode4 + (creditLimitPlanAdditionalProperties != null ? creditLimitPlanAdditionalProperties.hashCode() : 0);
    }

    public String toString() {
        return "CreditLimitPlanResponse(needUpgrade=" + this.needUpgrade + ", visualProperties=" + this.visualProperties + ", constructor=" + this.constructor + ", paymentInterval=" + this.paymentInterval + ", creditLimitInMonths=" + this.creditLimitInMonths + ", deposit=" + this.deposit + ", fee=" + this.fee + ", payment=" + this.payment + ", loan=" + this.loan + ", payments=" + this.payments + ", actualPaymentsCount=" + this.actualPaymentsCount + ", disclaimer=" + this.disclaimer + ", promo=" + this.promo + ", planAdditionalProperties=" + this.planAdditionalProperties + Extension.C_BRAKE;
    }
}
