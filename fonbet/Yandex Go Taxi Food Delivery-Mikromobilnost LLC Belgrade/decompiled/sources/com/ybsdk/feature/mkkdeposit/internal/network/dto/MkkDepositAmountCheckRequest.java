package com.ybsdk.feature.mkkdeposit.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.b64;
import defpackage.jl40;
import defpackage.tse0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/mkkdeposit/internal/network/dto/MkkDepositAmountCheckRequest;", "", "agreementId", "", "scenario", "amount", "Lcom/ybsdk/core/common/data/network/dto/Money;", "selectedWalletCardType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;)V", "getAgreementId", "()Ljava/lang/String;", "getScenario", "getAmount", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getSelectedWalletCardType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-credit-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MkkDepositAmountCheckRequest {
    private final String agreementId;
    private final Money amount;
    private final String scenario;
    private final String selectedWalletCardType;

    public MkkDepositAmountCheckRequest(@Json(name = "agreement_id") String str, @Json(name = "scenario") String str2, @Json(name = "amount") Money money, @Json(name = "selected_wallet_card_type") String str3) {
        this.agreementId = str;
        this.scenario = str2;
        this.amount = money;
        this.selectedWalletCardType = str3;
    }

    public static /* synthetic */ MkkDepositAmountCheckRequest copy$default(MkkDepositAmountCheckRequest mkkDepositAmountCheckRequest, String str, String str2, Money money, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mkkDepositAmountCheckRequest.agreementId;
        }
        if ((i & 2) != 0) {
            str2 = mkkDepositAmountCheckRequest.scenario;
        }
        if ((i & 4) != 0) {
            money = mkkDepositAmountCheckRequest.amount;
        }
        if ((i & 8) != 0) {
            str3 = mkkDepositAmountCheckRequest.selectedWalletCardType;
        }
        return mkkDepositAmountCheckRequest.copy(str, str2, money, str3);
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
    public final String getSelectedWalletCardType() {
        return this.selectedWalletCardType;
    }

    public final MkkDepositAmountCheckRequest copy(@Json(name = "agreement_id") String agreementId, @Json(name = "scenario") String scenario, @Json(name = "amount") Money amount, @Json(name = "selected_wallet_card_type") String selectedWalletCardType) {
        return new MkkDepositAmountCheckRequest(agreementId, scenario, amount, selectedWalletCardType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MkkDepositAmountCheckRequest)) {
            return false;
        }
        MkkDepositAmountCheckRequest mkkDepositAmountCheckRequest = (MkkDepositAmountCheckRequest) other;
        return jl40.l(this.agreementId, mkkDepositAmountCheckRequest.agreementId) && jl40.l(this.scenario, mkkDepositAmountCheckRequest.scenario) && jl40.l(this.amount, mkkDepositAmountCheckRequest.amount) && jl40.l(this.selectedWalletCardType, mkkDepositAmountCheckRequest.selectedWalletCardType);
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
        String str = this.scenario;
        int c = tse0.c(this.amount, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.selectedWalletCardType;
        return c + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.agreementId;
        String str2 = this.scenario;
        Money money = this.amount;
        String str3 = this.selectedWalletCardType;
        StringBuilder v = b64.v("MkkDepositAmountCheckRequest(agreementId=", str, ", scenario=", str2, ", amount=");
        v.append(money);
        v.append(", selectedWalletCardType=");
        v.append(str3);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
