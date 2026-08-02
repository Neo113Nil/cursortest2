package com.ybsdk.feature.credit.deposit.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JK\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006!"}, d2 = {"Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CreditDepositTransactionCreateRequest;", "", "agreementId", "", "amount", "Lcom/ybsdk/core/common/data/network/dto/Money;", "paymentMethodType", "paymentMethodId", "creditType", "scenario", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAgreementId", "()Ljava/lang/String;", "getAmount", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getPaymentMethodType", "getPaymentMethodId", "getCreditType", "getScenario", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-credit-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreditDepositTransactionCreateRequest {
    private final String agreementId;
    private final Money amount;
    private final String creditType;
    private final String paymentMethodId;
    private final String paymentMethodType;
    private final String scenario;

    public CreditDepositTransactionCreateRequest(@Json(name = "agreement_id") String str, @Json(name = "amount") Money money, @Json(name = "payment_method_type") String str2, @Json(name = "payment_method_id") String str3, @Json(name = "credit_type") String str4, @Json(name = "scenario") String str5) {
        this.agreementId = str;
        this.amount = money;
        this.paymentMethodType = str2;
        this.paymentMethodId = str3;
        this.creditType = str4;
        this.scenario = str5;
    }

    public static /* synthetic */ CreditDepositTransactionCreateRequest copy$default(CreditDepositTransactionCreateRequest creditDepositTransactionCreateRequest, String str, Money money, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creditDepositTransactionCreateRequest.agreementId;
        }
        if ((i & 2) != 0) {
            money = creditDepositTransactionCreateRequest.amount;
        }
        if ((i & 4) != 0) {
            str2 = creditDepositTransactionCreateRequest.paymentMethodType;
        }
        if ((i & 8) != 0) {
            str3 = creditDepositTransactionCreateRequest.paymentMethodId;
        }
        if ((i & 16) != 0) {
            str4 = creditDepositTransactionCreateRequest.creditType;
        }
        if ((i & 32) != 0) {
            str5 = creditDepositTransactionCreateRequest.scenario;
        }
        String str6 = str4;
        String str7 = str5;
        return creditDepositTransactionCreateRequest.copy(str, money, str2, str3, str6, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCreditType() {
        return this.creditType;
    }

    /* renamed from: component6, reason: from getter */
    public final String getScenario() {
        return this.scenario;
    }

    public final CreditDepositTransactionCreateRequest copy(@Json(name = "agreement_id") String agreementId, @Json(name = "amount") Money amount, @Json(name = "payment_method_type") String paymentMethodType, @Json(name = "payment_method_id") String paymentMethodId, @Json(name = "credit_type") String creditType, @Json(name = "scenario") String scenario) {
        return new CreditDepositTransactionCreateRequest(agreementId, amount, paymentMethodType, paymentMethodId, creditType, scenario);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditDepositTransactionCreateRequest)) {
            return false;
        }
        CreditDepositTransactionCreateRequest creditDepositTransactionCreateRequest = (CreditDepositTransactionCreateRequest) other;
        return jl40.l(this.agreementId, creditDepositTransactionCreateRequest.agreementId) && jl40.l(this.amount, creditDepositTransactionCreateRequest.amount) && jl40.l(this.paymentMethodType, creditDepositTransactionCreateRequest.paymentMethodType) && jl40.l(this.paymentMethodId, creditDepositTransactionCreateRequest.paymentMethodId) && jl40.l(this.creditType, creditDepositTransactionCreateRequest.creditType) && jl40.l(this.scenario, creditDepositTransactionCreateRequest.scenario);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final String getCreditType() {
        return this.creditType;
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    public final String getScenario() {
        return this.scenario;
    }

    public int hashCode() {
        int c = tse0.c(this.amount, this.agreementId.hashCode() * 31, 31);
        String str = this.paymentMethodType;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.paymentMethodId;
        int b = unr0.b((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.creditType);
        String str3 = this.scenario;
        return b + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.agreementId;
        Money money = this.amount;
        String str2 = this.paymentMethodType;
        String str3 = this.paymentMethodId;
        String str4 = this.creditType;
        String str5 = this.scenario;
        StringBuilder sb = new StringBuilder("CreditDepositTransactionCreateRequest(agreementId=");
        sb.append(str);
        sb.append(", amount=");
        sb.append(money);
        sb.append(", paymentMethodType=");
        g8e.D(sb, str2, ", paymentMethodId=", str3, ", creditType=");
        return g8e.r(sb, str4, ", scenario=", str5, Extension.C_BRAKE);
    }
}
