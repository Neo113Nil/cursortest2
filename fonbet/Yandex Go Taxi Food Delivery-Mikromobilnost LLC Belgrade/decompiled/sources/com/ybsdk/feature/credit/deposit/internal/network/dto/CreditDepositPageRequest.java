package com.ybsdk.feature.credit.deposit.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CreditDepositPageRequest;", "", "agreementId", "", "creditType", "scenario", "currentAmount", "Lcom/ybsdk/core/common/data/network/dto/Money;", "currentPaymentMethodInfo", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CurrentPaymentMethodInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CurrentPaymentMethodInfo;)V", "getAgreementId", "()Ljava/lang/String;", "getCreditType", "getScenario", "getCurrentAmount", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getCurrentPaymentMethodInfo", "()Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CurrentPaymentMethodInfo;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-credit-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreditDepositPageRequest {
    private final String agreementId;
    private final String creditType;
    private final Money currentAmount;
    private final CurrentPaymentMethodInfo currentPaymentMethodInfo;
    private final String scenario;

    public CreditDepositPageRequest(@Json(name = "agreement_id") String str, @Json(name = "credit_type") String str2, @Json(name = "scenario") String str3, @Json(name = "current_amount") Money money, @Json(name = "current_payment_method_info") CurrentPaymentMethodInfo currentPaymentMethodInfo) {
        this.agreementId = str;
        this.creditType = str2;
        this.scenario = str3;
        this.currentAmount = money;
        this.currentPaymentMethodInfo = currentPaymentMethodInfo;
    }

    public static /* synthetic */ CreditDepositPageRequest copy$default(CreditDepositPageRequest creditDepositPageRequest, String str, String str2, String str3, Money money, CurrentPaymentMethodInfo currentPaymentMethodInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creditDepositPageRequest.agreementId;
        }
        if ((i & 2) != 0) {
            str2 = creditDepositPageRequest.creditType;
        }
        if ((i & 4) != 0) {
            str3 = creditDepositPageRequest.scenario;
        }
        if ((i & 8) != 0) {
            money = creditDepositPageRequest.currentAmount;
        }
        if ((i & 16) != 0) {
            currentPaymentMethodInfo = creditDepositPageRequest.currentPaymentMethodInfo;
        }
        CurrentPaymentMethodInfo currentPaymentMethodInfo2 = currentPaymentMethodInfo;
        String str4 = str3;
        return creditDepositPageRequest.copy(str, str2, str4, money, currentPaymentMethodInfo2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCreditType() {
        return this.creditType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getScenario() {
        return this.scenario;
    }

    /* renamed from: component4, reason: from getter */
    public final Money getCurrentAmount() {
        return this.currentAmount;
    }

    /* renamed from: component5, reason: from getter */
    public final CurrentPaymentMethodInfo getCurrentPaymentMethodInfo() {
        return this.currentPaymentMethodInfo;
    }

    public final CreditDepositPageRequest copy(@Json(name = "agreement_id") String agreementId, @Json(name = "credit_type") String creditType, @Json(name = "scenario") String scenario, @Json(name = "current_amount") Money currentAmount, @Json(name = "current_payment_method_info") CurrentPaymentMethodInfo currentPaymentMethodInfo) {
        return new CreditDepositPageRequest(agreementId, creditType, scenario, currentAmount, currentPaymentMethodInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditDepositPageRequest)) {
            return false;
        }
        CreditDepositPageRequest creditDepositPageRequest = (CreditDepositPageRequest) other;
        return jl40.l(this.agreementId, creditDepositPageRequest.agreementId) && jl40.l(this.creditType, creditDepositPageRequest.creditType) && jl40.l(this.scenario, creditDepositPageRequest.scenario) && jl40.l(this.currentAmount, creditDepositPageRequest.currentAmount) && jl40.l(this.currentPaymentMethodInfo, creditDepositPageRequest.currentPaymentMethodInfo);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getCreditType() {
        return this.creditType;
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
        int b = unr0.b(this.agreementId.hashCode() * 31, 31, this.creditType);
        String str = this.scenario;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Money money = this.currentAmount;
        int hashCode2 = (hashCode + (money == null ? 0 : money.hashCode())) * 31;
        CurrentPaymentMethodInfo currentPaymentMethodInfo = this.currentPaymentMethodInfo;
        return hashCode2 + (currentPaymentMethodInfo != null ? currentPaymentMethodInfo.hashCode() : 0);
    }

    public String toString() {
        String str = this.agreementId;
        String str2 = this.creditType;
        String str3 = this.scenario;
        Money money = this.currentAmount;
        CurrentPaymentMethodInfo currentPaymentMethodInfo = this.currentPaymentMethodInfo;
        StringBuilder v = b64.v("CreditDepositPageRequest(agreementId=", str, ", creditType=", str2, ", scenario=");
        v.append(str3);
        v.append(", currentAmount=");
        v.append(money);
        v.append(", currentPaymentMethodInfo=");
        v.append(currentPaymentMethodInfo);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
