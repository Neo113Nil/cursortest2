package com.ybsdk.feature.credit.deposit.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CreditDepositAmountCheckRequest;", "", "agreementId", "", "creditType", "scenario", "amount", "Lcom/ybsdk/core/common/data/network/dto/Money;", "selectedWalletCardType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;)V", "getAgreementId", "()Ljava/lang/String;", "getCreditType", "getScenario", "getAmount", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getSelectedWalletCardType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-credit-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreditDepositAmountCheckRequest {
    private final String agreementId;
    private final Money amount;
    private final String creditType;
    private final String scenario;
    private final String selectedWalletCardType;

    public CreditDepositAmountCheckRequest(@Json(name = "agreement_id") String str, @Json(name = "credit_type") String str2, @Json(name = "scenario") String str3, @Json(name = "amount") Money money, @Json(name = "selected_wallet_card_type") String str4) {
        this.agreementId = str;
        this.creditType = str2;
        this.scenario = str3;
        this.amount = money;
        this.selectedWalletCardType = str4;
    }

    public static /* synthetic */ CreditDepositAmountCheckRequest copy$default(CreditDepositAmountCheckRequest creditDepositAmountCheckRequest, String str, String str2, String str3, Money money, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creditDepositAmountCheckRequest.agreementId;
        }
        if ((i & 2) != 0) {
            str2 = creditDepositAmountCheckRequest.creditType;
        }
        if ((i & 4) != 0) {
            str3 = creditDepositAmountCheckRequest.scenario;
        }
        if ((i & 8) != 0) {
            money = creditDepositAmountCheckRequest.amount;
        }
        if ((i & 16) != 0) {
            str4 = creditDepositAmountCheckRequest.selectedWalletCardType;
        }
        String str5 = str4;
        String str6 = str3;
        return creditDepositAmountCheckRequest.copy(str, str2, str6, money, str5);
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
    public final Money getAmount() {
        return this.amount;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSelectedWalletCardType() {
        return this.selectedWalletCardType;
    }

    public final CreditDepositAmountCheckRequest copy(@Json(name = "agreement_id") String agreementId, @Json(name = "credit_type") String creditType, @Json(name = "scenario") String scenario, @Json(name = "amount") Money amount, @Json(name = "selected_wallet_card_type") String selectedWalletCardType) {
        return new CreditDepositAmountCheckRequest(agreementId, creditType, scenario, amount, selectedWalletCardType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditDepositAmountCheckRequest)) {
            return false;
        }
        CreditDepositAmountCheckRequest creditDepositAmountCheckRequest = (CreditDepositAmountCheckRequest) other;
        return jl40.l(this.agreementId, creditDepositAmountCheckRequest.agreementId) && jl40.l(this.creditType, creditDepositAmountCheckRequest.creditType) && jl40.l(this.scenario, creditDepositAmountCheckRequest.scenario) && jl40.l(this.amount, creditDepositAmountCheckRequest.amount) && jl40.l(this.selectedWalletCardType, creditDepositAmountCheckRequest.selectedWalletCardType);
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

    public final String getScenario() {
        return this.scenario;
    }

    public final String getSelectedWalletCardType() {
        return this.selectedWalletCardType;
    }

    public int hashCode() {
        int b = unr0.b(this.agreementId.hashCode() * 31, 31, this.creditType);
        String str = this.scenario;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Money money = this.amount;
        int hashCode2 = (hashCode + (money == null ? 0 : money.hashCode())) * 31;
        String str2 = this.selectedWalletCardType;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.agreementId;
        String str2 = this.creditType;
        String str3 = this.scenario;
        Money money = this.amount;
        String str4 = this.selectedWalletCardType;
        StringBuilder v = b64.v("CreditDepositAmountCheckRequest(agreementId=", str, ", creditType=", str2, ", scenario=");
        v.append(str3);
        v.append(", amount=");
        v.append(money);
        v.append(", selectedWalletCardType=");
        return oyr.t(v, str4, Extension.C_BRAKE);
    }
}
