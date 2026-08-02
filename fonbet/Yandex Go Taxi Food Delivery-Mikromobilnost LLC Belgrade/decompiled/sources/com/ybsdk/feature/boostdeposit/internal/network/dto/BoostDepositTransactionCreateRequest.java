package com.ybsdk.feature.boostdeposit.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.tse0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/feature/boostdeposit/internal/network/dto/BoostDepositTransactionCreateRequest;", "", "agreementId", "", "scenario", "amount", "Lcom/ybsdk/core/common/data/network/dto/Money;", "paymentMethodType", "paymentMethodId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Ljava/lang/String;)V", "getAgreementId", "()Ljava/lang/String;", "getScenario", "getAmount", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getPaymentMethodType", "getPaymentMethodId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-credit-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BoostDepositTransactionCreateRequest {
    private final String agreementId;
    private final Money amount;
    private final String paymentMethodId;
    private final String paymentMethodType;
    private final String scenario;

    public BoostDepositTransactionCreateRequest(@Json(name = "agreement_id") String str, @Json(name = "scenario") String str2, @Json(name = "amount") Money money, @Json(name = "payment_method_type") String str3, @Json(name = "payment_method_id") String str4) {
        this.agreementId = str;
        this.scenario = str2;
        this.amount = money;
        this.paymentMethodType = str3;
        this.paymentMethodId = str4;
    }

    public static /* synthetic */ BoostDepositTransactionCreateRequest copy$default(BoostDepositTransactionCreateRequest boostDepositTransactionCreateRequest, String str, String str2, Money money, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = boostDepositTransactionCreateRequest.agreementId;
        }
        if ((i & 2) != 0) {
            str2 = boostDepositTransactionCreateRequest.scenario;
        }
        if ((i & 4) != 0) {
            money = boostDepositTransactionCreateRequest.amount;
        }
        if ((i & 8) != 0) {
            str3 = boostDepositTransactionCreateRequest.paymentMethodType;
        }
        if ((i & 16) != 0) {
            str4 = boostDepositTransactionCreateRequest.paymentMethodId;
        }
        String str5 = str4;
        Money money2 = money;
        return boostDepositTransactionCreateRequest.copy(str, str2, money2, str3, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getScenario() {
        return this.scenario;
    }

    /* renamed from: component3, reason: from getter */
    public final Money getAmount() {
        return this.amount;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final BoostDepositTransactionCreateRequest copy(@Json(name = "agreement_id") String agreementId, @Json(name = "scenario") String scenario, @Json(name = "amount") Money amount, @Json(name = "payment_method_type") String paymentMethodType, @Json(name = "payment_method_id") String paymentMethodId) {
        return new BoostDepositTransactionCreateRequest(agreementId, scenario, amount, paymentMethodType, paymentMethodId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoostDepositTransactionCreateRequest)) {
            return false;
        }
        BoostDepositTransactionCreateRequest boostDepositTransactionCreateRequest = (BoostDepositTransactionCreateRequest) other;
        return jl40.l(this.agreementId, boostDepositTransactionCreateRequest.agreementId) && jl40.l(this.scenario, boostDepositTransactionCreateRequest.scenario) && jl40.l(this.amount, boostDepositTransactionCreateRequest.amount) && jl40.l(this.paymentMethodType, boostDepositTransactionCreateRequest.paymentMethodType) && jl40.l(this.paymentMethodId, boostDepositTransactionCreateRequest.paymentMethodId);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final Money getAmount() {
        return this.amount;
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
        int hashCode = this.agreementId.hashCode() * 31;
        String str = this.scenario;
        int c = tse0.c(this.amount, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.paymentMethodType;
        int hashCode2 = (c + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paymentMethodId;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.agreementId;
        String str2 = this.scenario;
        Money money = this.amount;
        String str3 = this.paymentMethodType;
        String str4 = this.paymentMethodId;
        StringBuilder v = b64.v("BoostDepositTransactionCreateRequest(agreementId=", str, ", scenario=", str2, ", amount=");
        v.append(money);
        v.append(", paymentMethodType=");
        v.append(str3);
        v.append(", paymentMethodId=");
        return oyr.t(v, str4, Extension.C_BRAKE);
    }
}
