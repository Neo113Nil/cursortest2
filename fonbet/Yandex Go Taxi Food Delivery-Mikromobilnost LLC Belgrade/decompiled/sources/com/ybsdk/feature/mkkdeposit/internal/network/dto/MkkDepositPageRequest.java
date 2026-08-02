package com.ybsdk.feature.mkkdeposit.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.feature.credit.deposit.internal.network.dto.CurrentPaymentMethodInfo;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/feature/mkkdeposit/internal/network/dto/MkkDepositPageRequest;", "", "agreementId", "", "scenario", "currentAmount", "Lcom/ybsdk/core/common/data/network/dto/Money;", "currentPaymentMethodInfo", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CurrentPaymentMethodInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CurrentPaymentMethodInfo;)V", "getAgreementId", "()Ljava/lang/String;", "getScenario", "getCurrentAmount", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getCurrentPaymentMethodInfo", "()Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CurrentPaymentMethodInfo;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-credit-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MkkDepositPageRequest {
    private final String agreementId;
    private final Money currentAmount;
    private final CurrentPaymentMethodInfo currentPaymentMethodInfo;
    private final String scenario;

    public MkkDepositPageRequest(@Json(name = "agreement_id") String str, @Json(name = "scenario") String str2, @Json(name = "current_amount") Money money, @Json(name = "current_payment_method_info") CurrentPaymentMethodInfo currentPaymentMethodInfo) {
        this.agreementId = str;
        this.scenario = str2;
        this.currentAmount = money;
        this.currentPaymentMethodInfo = currentPaymentMethodInfo;
    }

    public static /* synthetic */ MkkDepositPageRequest copy$default(MkkDepositPageRequest mkkDepositPageRequest, String str, String str2, Money money, CurrentPaymentMethodInfo currentPaymentMethodInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mkkDepositPageRequest.agreementId;
        }
        if ((i & 2) != 0) {
            str2 = mkkDepositPageRequest.scenario;
        }
        if ((i & 4) != 0) {
            money = mkkDepositPageRequest.currentAmount;
        }
        if ((i & 8) != 0) {
            currentPaymentMethodInfo = mkkDepositPageRequest.currentPaymentMethodInfo;
        }
        return mkkDepositPageRequest.copy(str, str2, money, currentPaymentMethodInfo);
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
    public final Money getCurrentAmount() {
        return this.currentAmount;
    }

    /* renamed from: component4, reason: from getter */
    public final CurrentPaymentMethodInfo getCurrentPaymentMethodInfo() {
        return this.currentPaymentMethodInfo;
    }

    public final MkkDepositPageRequest copy(@Json(name = "agreement_id") String agreementId, @Json(name = "scenario") String scenario, @Json(name = "current_amount") Money currentAmount, @Json(name = "current_payment_method_info") CurrentPaymentMethodInfo currentPaymentMethodInfo) {
        return new MkkDepositPageRequest(agreementId, scenario, currentAmount, currentPaymentMethodInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MkkDepositPageRequest)) {
            return false;
        }
        MkkDepositPageRequest mkkDepositPageRequest = (MkkDepositPageRequest) other;
        return jl40.l(this.agreementId, mkkDepositPageRequest.agreementId) && jl40.l(this.scenario, mkkDepositPageRequest.scenario) && jl40.l(this.currentAmount, mkkDepositPageRequest.currentAmount) && jl40.l(this.currentPaymentMethodInfo, mkkDepositPageRequest.currentPaymentMethodInfo);
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
        String str = this.scenario;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Money money = this.currentAmount;
        int hashCode3 = (hashCode2 + (money == null ? 0 : money.hashCode())) * 31;
        CurrentPaymentMethodInfo currentPaymentMethodInfo = this.currentPaymentMethodInfo;
        return hashCode3 + (currentPaymentMethodInfo != null ? currentPaymentMethodInfo.hashCode() : 0);
    }

    public String toString() {
        String str = this.agreementId;
        String str2 = this.scenario;
        Money money = this.currentAmount;
        CurrentPaymentMethodInfo currentPaymentMethodInfo = this.currentPaymentMethodInfo;
        StringBuilder v = b64.v("MkkDepositPageRequest(agreementId=", str, ", scenario=", str2, ", currentAmount=");
        v.append(money);
        v.append(", currentPaymentMethodInfo=");
        v.append(currentPaymentMethodInfo);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
