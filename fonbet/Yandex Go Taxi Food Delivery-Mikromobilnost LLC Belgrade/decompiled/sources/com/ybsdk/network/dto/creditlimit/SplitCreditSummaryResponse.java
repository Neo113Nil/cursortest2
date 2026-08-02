package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.smw0;
import defpackage.tse0;
import java.math.BigDecimal;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001By\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000fHÆ\u0003J{\u0010,\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 ¨\u00063"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/SplitCreditSummaryResponse;", "", "remainingPaymentsCount", "Ljava/math/BigDecimal;", "totalDept", "Lcom/ybsdk/core/common/data/network/dto/Money;", "totalSplitsCount", "limit", "Lcom/ybsdk/network/dto/creditlimit/CreditPlanLimit;", "nextPayment", "Lcom/ybsdk/network/dto/creditlimit/SplitCreditSummaryResponseNextPayment;", "overduePaymentsCount", "overduePaymentsAmount", "overdueDays", "accountUrl", "", "onboardingUrl", "<init>", "(Ljava/math/BigDecimal;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/math/BigDecimal;Lcom/ybsdk/network/dto/creditlimit/CreditPlanLimit;Lcom/ybsdk/network/dto/creditlimit/SplitCreditSummaryResponseNextPayment;Ljava/math/BigDecimal;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)V", "getRemainingPaymentsCount", "()Ljava/math/BigDecimal;", "getTotalDept", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getTotalSplitsCount", "getLimit", "()Lcom/ybsdk/network/dto/creditlimit/CreditPlanLimit;", "getNextPayment", "()Lcom/ybsdk/network/dto/creditlimit/SplitCreditSummaryResponseNextPayment;", "getOverduePaymentsCount", "getOverduePaymentsAmount", "getOverdueDays", "getAccountUrl", "()Ljava/lang/String;", "getOnboardingUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SplitCreditSummaryResponse {
    private final String accountUrl;
    private final CreditPlanLimit limit;
    private final SplitCreditSummaryResponseNextPayment nextPayment;
    private final String onboardingUrl;
    private final BigDecimal overdueDays;
    private final Money overduePaymentsAmount;
    private final BigDecimal overduePaymentsCount;
    private final BigDecimal remainingPaymentsCount;
    private final Money totalDept;
    private final BigDecimal totalSplitsCount;

    public SplitCreditSummaryResponse(@Json(name = "remaining_payments_count") BigDecimal bigDecimal, @Json(name = "total_dept") Money money, @Json(name = "total_splits_count") BigDecimal bigDecimal2, @Json(name = "limit") CreditPlanLimit creditPlanLimit, @Json(name = "next_payment") SplitCreditSummaryResponseNextPayment splitCreditSummaryResponseNextPayment, @Json(name = "overdue_payments_count") BigDecimal bigDecimal3, @Json(name = "overdue_payments_amount") Money money2, @Json(name = "overdue_days") BigDecimal bigDecimal4, @Json(name = "account_url") String str, @Json(name = "onboarding_url") String str2) {
        this.remainingPaymentsCount = bigDecimal;
        this.totalDept = money;
        this.totalSplitsCount = bigDecimal2;
        this.limit = creditPlanLimit;
        this.nextPayment = splitCreditSummaryResponseNextPayment;
        this.overduePaymentsCount = bigDecimal3;
        this.overduePaymentsAmount = money2;
        this.overdueDays = bigDecimal4;
        this.accountUrl = str;
        this.onboardingUrl = str2;
    }

    public static /* synthetic */ SplitCreditSummaryResponse copy$default(SplitCreditSummaryResponse splitCreditSummaryResponse, BigDecimal bigDecimal, Money money, BigDecimal bigDecimal2, CreditPlanLimit creditPlanLimit, SplitCreditSummaryResponseNextPayment splitCreditSummaryResponseNextPayment, BigDecimal bigDecimal3, Money money2, BigDecimal bigDecimal4, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = splitCreditSummaryResponse.remainingPaymentsCount;
        }
        if ((i & 2) != 0) {
            money = splitCreditSummaryResponse.totalDept;
        }
        if ((i & 4) != 0) {
            bigDecimal2 = splitCreditSummaryResponse.totalSplitsCount;
        }
        if ((i & 8) != 0) {
            creditPlanLimit = splitCreditSummaryResponse.limit;
        }
        if ((i & 16) != 0) {
            splitCreditSummaryResponseNextPayment = splitCreditSummaryResponse.nextPayment;
        }
        if ((i & 32) != 0) {
            bigDecimal3 = splitCreditSummaryResponse.overduePaymentsCount;
        }
        if ((i & 64) != 0) {
            money2 = splitCreditSummaryResponse.overduePaymentsAmount;
        }
        if ((i & 128) != 0) {
            bigDecimal4 = splitCreditSummaryResponse.overdueDays;
        }
        if ((i & 256) != 0) {
            str = splitCreditSummaryResponse.accountUrl;
        }
        if ((i & 512) != 0) {
            str2 = splitCreditSummaryResponse.onboardingUrl;
        }
        String str3 = str;
        String str4 = str2;
        Money money3 = money2;
        BigDecimal bigDecimal5 = bigDecimal4;
        SplitCreditSummaryResponseNextPayment splitCreditSummaryResponseNextPayment2 = splitCreditSummaryResponseNextPayment;
        BigDecimal bigDecimal6 = bigDecimal3;
        return splitCreditSummaryResponse.copy(bigDecimal, money, bigDecimal2, creditPlanLimit, splitCreditSummaryResponseNextPayment2, bigDecimal6, money3, bigDecimal5, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final BigDecimal getRemainingPaymentsCount() {
        return this.remainingPaymentsCount;
    }

    /* renamed from: component10, reason: from getter */
    public final String getOnboardingUrl() {
        return this.onboardingUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getTotalDept() {
        return this.totalDept;
    }

    /* renamed from: component3, reason: from getter */
    public final BigDecimal getTotalSplitsCount() {
        return this.totalSplitsCount;
    }

    /* renamed from: component4, reason: from getter */
    public final CreditPlanLimit getLimit() {
        return this.limit;
    }

    /* renamed from: component5, reason: from getter */
    public final SplitCreditSummaryResponseNextPayment getNextPayment() {
        return this.nextPayment;
    }

    /* renamed from: component6, reason: from getter */
    public final BigDecimal getOverduePaymentsCount() {
        return this.overduePaymentsCount;
    }

    /* renamed from: component7, reason: from getter */
    public final Money getOverduePaymentsAmount() {
        return this.overduePaymentsAmount;
    }

    /* renamed from: component8, reason: from getter */
    public final BigDecimal getOverdueDays() {
        return this.overdueDays;
    }

    /* renamed from: component9, reason: from getter */
    public final String getAccountUrl() {
        return this.accountUrl;
    }

    public final SplitCreditSummaryResponse copy(@Json(name = "remaining_payments_count") BigDecimal remainingPaymentsCount, @Json(name = "total_dept") Money totalDept, @Json(name = "total_splits_count") BigDecimal totalSplitsCount, @Json(name = "limit") CreditPlanLimit limit, @Json(name = "next_payment") SplitCreditSummaryResponseNextPayment nextPayment, @Json(name = "overdue_payments_count") BigDecimal overduePaymentsCount, @Json(name = "overdue_payments_amount") Money overduePaymentsAmount, @Json(name = "overdue_days") BigDecimal overdueDays, @Json(name = "account_url") String accountUrl, @Json(name = "onboarding_url") String onboardingUrl) {
        return new SplitCreditSummaryResponse(remainingPaymentsCount, totalDept, totalSplitsCount, limit, nextPayment, overduePaymentsCount, overduePaymentsAmount, overdueDays, accountUrl, onboardingUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitCreditSummaryResponse)) {
            return false;
        }
        SplitCreditSummaryResponse splitCreditSummaryResponse = (SplitCreditSummaryResponse) other;
        return jl40.l(this.remainingPaymentsCount, splitCreditSummaryResponse.remainingPaymentsCount) && jl40.l(this.totalDept, splitCreditSummaryResponse.totalDept) && jl40.l(this.totalSplitsCount, splitCreditSummaryResponse.totalSplitsCount) && jl40.l(this.limit, splitCreditSummaryResponse.limit) && jl40.l(this.nextPayment, splitCreditSummaryResponse.nextPayment) && jl40.l(this.overduePaymentsCount, splitCreditSummaryResponse.overduePaymentsCount) && jl40.l(this.overduePaymentsAmount, splitCreditSummaryResponse.overduePaymentsAmount) && jl40.l(this.overdueDays, splitCreditSummaryResponse.overdueDays) && jl40.l(this.accountUrl, splitCreditSummaryResponse.accountUrl) && jl40.l(this.onboardingUrl, splitCreditSummaryResponse.onboardingUrl);
    }

    public final String getAccountUrl() {
        return this.accountUrl;
    }

    public final CreditPlanLimit getLimit() {
        return this.limit;
    }

    public final SplitCreditSummaryResponseNextPayment getNextPayment() {
        return this.nextPayment;
    }

    public final String getOnboardingUrl() {
        return this.onboardingUrl;
    }

    public final BigDecimal getOverdueDays() {
        return this.overdueDays;
    }

    public final Money getOverduePaymentsAmount() {
        return this.overduePaymentsAmount;
    }

    public final BigDecimal getOverduePaymentsCount() {
        return this.overduePaymentsCount;
    }

    public final BigDecimal getRemainingPaymentsCount() {
        return this.remainingPaymentsCount;
    }

    public final Money getTotalDept() {
        return this.totalDept;
    }

    public final BigDecimal getTotalSplitsCount() {
        return this.totalSplitsCount;
    }

    public int hashCode() {
        int f = smw0.f(this.totalSplitsCount, tse0.c(this.totalDept, this.remainingPaymentsCount.hashCode() * 31, 31), 31);
        CreditPlanLimit creditPlanLimit = this.limit;
        int hashCode = (f + (creditPlanLimit == null ? 0 : creditPlanLimit.hashCode())) * 31;
        SplitCreditSummaryResponseNextPayment splitCreditSummaryResponseNextPayment = this.nextPayment;
        int hashCode2 = (hashCode + (splitCreditSummaryResponseNextPayment == null ? 0 : splitCreditSummaryResponseNextPayment.hashCode())) * 31;
        BigDecimal bigDecimal = this.overduePaymentsCount;
        int hashCode3 = (hashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Money money = this.overduePaymentsAmount;
        int hashCode4 = (hashCode3 + (money == null ? 0 : money.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.overdueDays;
        int hashCode5 = (hashCode4 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str = this.accountUrl;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.onboardingUrl;
        return hashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        BigDecimal bigDecimal = this.remainingPaymentsCount;
        Money money = this.totalDept;
        BigDecimal bigDecimal2 = this.totalSplitsCount;
        CreditPlanLimit creditPlanLimit = this.limit;
        SplitCreditSummaryResponseNextPayment splitCreditSummaryResponseNextPayment = this.nextPayment;
        BigDecimal bigDecimal3 = this.overduePaymentsCount;
        Money money2 = this.overduePaymentsAmount;
        BigDecimal bigDecimal4 = this.overdueDays;
        String str = this.accountUrl;
        String str2 = this.onboardingUrl;
        StringBuilder sb = new StringBuilder("SplitCreditSummaryResponse(remainingPaymentsCount=");
        sb.append(bigDecimal);
        sb.append(", totalDept=");
        sb.append(money);
        sb.append(", totalSplitsCount=");
        sb.append(bigDecimal2);
        sb.append(", limit=");
        sb.append(creditPlanLimit);
        sb.append(", nextPayment=");
        sb.append(splitCreditSummaryResponseNextPayment);
        sb.append(", overduePaymentsCount=");
        sb.append(bigDecimal3);
        sb.append(", overduePaymentsAmount=");
        sb.append(money2);
        sb.append(", overdueDays=");
        sb.append(bigDecimal4);
        sb.append(", accountUrl=");
        return g8e.r(sb, str, ", onboardingUrl=", str2, Extension.C_BRAKE);
    }
}
