package com.ybsdk.feature.credit.limitdeposit.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.feature.credit.deposit.internal.network.dto.CurrentPaymentMethodInfo;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/feature/credit/limitdeposit/internal/network/dto/CreditLimitDepositPageRequest;", "", "agreementId", "", "currentAmount", "Lcom/ybsdk/core/common/data/network/dto/Money;", "currentPaymentMethodInfo", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CurrentPaymentMethodInfo;", "scenario", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CurrentPaymentMethodInfo;Ljava/lang/String;)V", "getAgreementId", "()Ljava/lang/String;", "getCurrentAmount", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getCurrentPaymentMethodInfo", "()Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CurrentPaymentMethodInfo;", "getScenario", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-credit-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreditLimitDepositPageRequest {
    private final String agreementId;
    private final Money currentAmount;
    private final CurrentPaymentMethodInfo currentPaymentMethodInfo;
    private final String scenario;

    public CreditLimitDepositPageRequest(@Json(name = "agreement_id") String str, @Json(name = "current_amount") Money money, @Json(name = "current_payment_method_info") CurrentPaymentMethodInfo currentPaymentMethodInfo, @Json(name = "scenario") String str2) {
        this.agreementId = str;
        this.currentAmount = money;
        this.currentPaymentMethodInfo = currentPaymentMethodInfo;
        this.scenario = str2;
    }

    public static /* synthetic */ CreditLimitDepositPageRequest copy$default(CreditLimitDepositPageRequest creditLimitDepositPageRequest, String str, Money money, CurrentPaymentMethodInfo currentPaymentMethodInfo, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creditLimitDepositPageRequest.agreementId;
        }
        if ((i & 2) != 0) {
            money = creditLimitDepositPageRequest.currentAmount;
        }
        if ((i & 4) != 0) {
            currentPaymentMethodInfo = creditLimitDepositPageRequest.currentPaymentMethodInfo;
        }
        if ((i & 8) != 0) {
            str2 = creditLimitDepositPageRequest.scenario;
        }
        return creditLimitDepositPageRequest.copy(str, money, currentPaymentMethodInfo, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getCurrentAmount() {
        return this.currentAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final CurrentPaymentMethodInfo getCurrentPaymentMethodInfo() {
        return this.currentPaymentMethodInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final String getScenario() {
        return this.scenario;
    }

    public final CreditLimitDepositPageRequest copy(@Json(name = "agreement_id") String agreementId, @Json(name = "current_amount") Money currentAmount, @Json(name = "current_payment_method_info") CurrentPaymentMethodInfo currentPaymentMethodInfo, @Json(name = "scenario") String scenario) {
        return new CreditLimitDepositPageRequest(agreementId, currentAmount, currentPaymentMethodInfo, scenario);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditLimitDepositPageRequest)) {
            return false;
        }
        CreditLimitDepositPageRequest creditLimitDepositPageRequest = (CreditLimitDepositPageRequest) other;
        return jl40.l(this.agreementId, creditLimitDepositPageRequest.agreementId) && jl40.l(this.currentAmount, creditLimitDepositPageRequest.currentAmount) && jl40.l(this.currentPaymentMethodInfo, creditLimitDepositPageRequest.currentPaymentMethodInfo) && jl40.l(this.scenario, creditLimitDepositPageRequest.scenario);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final Money getCurrentAmount() {
        return this.currentAmount;
    }

    public final CurrentPaymentMethodInfo getCurrentPaymentMethodInfo() {
        return this.currentPaymentMethodInfo;
    }

    public final String getScenario() {
        return this.scenario;
    }

    public int hashCode() {
        int hashCode = this.agreementId.hashCode() * 31;
        Money money = this.currentAmount;
        int hashCode2 = (hashCode + (money == null ? 0 : money.hashCode())) * 31;
        CurrentPaymentMethodInfo currentPaymentMethodInfo = this.currentPaymentMethodInfo;
        int hashCode3 = (hashCode2 + (currentPaymentMethodInfo == null ? 0 : currentPaymentMethodInfo.hashCode())) * 31;
        String str = this.scenario;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "CreditLimitDepositPageRequest(agreementId=" + this.agreementId + ", currentAmount=" + this.currentAmount + ", currentPaymentMethodInfo=" + this.currentPaymentMethodInfo + ", scenario=" + this.scenario + Extension.C_BRAKE;
    }
}
