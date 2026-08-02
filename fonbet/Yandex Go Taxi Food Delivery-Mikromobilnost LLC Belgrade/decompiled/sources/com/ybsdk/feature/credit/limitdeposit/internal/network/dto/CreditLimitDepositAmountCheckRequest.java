package com.ybsdk.feature.credit.limitdeposit.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.g8e;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/credit/limitdeposit/internal/network/dto/CreditLimitDepositAmountCheckRequest;", "", "agreementId", "", "amount", "Lcom/ybsdk/core/common/data/network/dto/Money;", "selectedWalletCardType", "scenario", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Ljava/lang/String;)V", "getAgreementId", "()Ljava/lang/String;", "getAmount", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getSelectedWalletCardType", "getScenario", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-credit-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreditLimitDepositAmountCheckRequest {
    private final String agreementId;
    private final Money amount;
    private final String scenario;
    private final String selectedWalletCardType;

    public CreditLimitDepositAmountCheckRequest(@Json(name = "agreement_id") String str, @Json(name = "amount") Money money, @Json(name = "selected_wallet_card_type") String str2, @Json(name = "scenario") String str3) {
        this.agreementId = str;
        this.amount = money;
        this.selectedWalletCardType = str2;
        this.scenario = str3;
    }

    public static /* synthetic */ CreditLimitDepositAmountCheckRequest copy$default(CreditLimitDepositAmountCheckRequest creditLimitDepositAmountCheckRequest, String str, Money money, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creditLimitDepositAmountCheckRequest.agreementId;
        }
        if ((i & 2) != 0) {
            money = creditLimitDepositAmountCheckRequest.amount;
        }
        if ((i & 4) != 0) {
            str2 = creditLimitDepositAmountCheckRequest.selectedWalletCardType;
        }
        if ((i & 8) != 0) {
            str3 = creditLimitDepositAmountCheckRequest.scenario;
        }
        return creditLimitDepositAmountCheckRequest.copy(str, money, str2, str3);
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
    public final String getSelectedWalletCardType() {
        return this.selectedWalletCardType;
    }

    /* renamed from: component4, reason: from getter */
    public final String getScenario() {
        return this.scenario;
    }

    public final CreditLimitDepositAmountCheckRequest copy(@Json(name = "agreement_id") String agreementId, @Json(name = "amount") Money amount, @Json(name = "selected_wallet_card_type") String selectedWalletCardType, @Json(name = "scenario") String scenario) {
        return new CreditLimitDepositAmountCheckRequest(agreementId, amount, selectedWalletCardType, scenario);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditLimitDepositAmountCheckRequest)) {
            return false;
        }
        CreditLimitDepositAmountCheckRequest creditLimitDepositAmountCheckRequest = (CreditLimitDepositAmountCheckRequest) other;
        return jl40.l(this.agreementId, creditLimitDepositAmountCheckRequest.agreementId) && jl40.l(this.amount, creditLimitDepositAmountCheckRequest.amount) && jl40.l(this.selectedWalletCardType, creditLimitDepositAmountCheckRequest.selectedWalletCardType) && jl40.l(this.scenario, creditLimitDepositAmountCheckRequest.scenario);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final String getScenario() {
        return this.scenario;
    }

    public final String getSelectedWalletCardType() {
        return this.selectedWalletCardType;
    }

    public int hashCode() {
        int hashCode = this.agreementId.hashCode() * 31;
        Money money = this.amount;
        int hashCode2 = (hashCode + (money == null ? 0 : money.hashCode())) * 31;
        String str = this.selectedWalletCardType;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.scenario;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.agreementId;
        Money money = this.amount;
        String str2 = this.selectedWalletCardType;
        String str3 = this.scenario;
        StringBuilder sb = new StringBuilder("CreditLimitDepositAmountCheckRequest(agreementId=");
        sb.append(str);
        sb.append(", amount=");
        sb.append(money);
        sb.append(", selectedWalletCardType=");
        return g8e.r(sb, str2, ", scenario=", str3, Extension.C_BRAKE);
    }
}
