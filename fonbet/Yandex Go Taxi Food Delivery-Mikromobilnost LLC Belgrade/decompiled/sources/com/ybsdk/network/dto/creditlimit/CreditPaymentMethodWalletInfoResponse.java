package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.MoneyCommonResponse;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditPaymentMethodWalletInfoResponse;", "", "balance", "Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;)V", "getBalance", "()Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreditPaymentMethodWalletInfoResponse {
    private final MoneyCommonResponse balance;

    public CreditPaymentMethodWalletInfoResponse(@Json(name = "balance") MoneyCommonResponse moneyCommonResponse) {
        this.balance = moneyCommonResponse;
    }

    public static /* synthetic */ CreditPaymentMethodWalletInfoResponse copy$default(CreditPaymentMethodWalletInfoResponse creditPaymentMethodWalletInfoResponse, MoneyCommonResponse moneyCommonResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            moneyCommonResponse = creditPaymentMethodWalletInfoResponse.balance;
        }
        return creditPaymentMethodWalletInfoResponse.copy(moneyCommonResponse);
    }

    /* renamed from: component1, reason: from getter */
    public final MoneyCommonResponse getBalance() {
        return this.balance;
    }

    public final CreditPaymentMethodWalletInfoResponse copy(@Json(name = "balance") MoneyCommonResponse balance) {
        return new CreditPaymentMethodWalletInfoResponse(balance);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CreditPaymentMethodWalletInfoResponse) && jl40.l(this.balance, ((CreditPaymentMethodWalletInfoResponse) other).balance);
    }

    public final MoneyCommonResponse getBalance() {
        return this.balance;
    }

    public int hashCode() {
        return this.balance.hashCode();
    }

    public String toString() {
        return "CreditPaymentMethodWalletInfoResponse(balance=" + this.balance + Extension.C_BRAKE;
    }
}
