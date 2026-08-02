package com.ybsdk.network.dto.paylater;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/network/dto/paylater/PayLaterPaymentInfoRequest;", "", "amount", "Lcom/ybsdk/core/common/data/network/dto/Money;", "merchantId", "", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;)V", "getAmount", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getMerchantId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PayLaterPaymentInfoRequest {
    private final Money amount;
    private final String merchantId;

    public /* synthetic */ PayLaterPaymentInfoRequest(Money money, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(money, (i & 2) != 0 ? null : str);
    }

    public static /* synthetic */ PayLaterPaymentInfoRequest copy$default(PayLaterPaymentInfoRequest payLaterPaymentInfoRequest, Money money, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            money = payLaterPaymentInfoRequest.amount;
        }
        if ((i & 2) != 0) {
            str = payLaterPaymentInfoRequest.merchantId;
        }
        return payLaterPaymentInfoRequest.copy(money, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Money getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMerchantId() {
        return this.merchantId;
    }

    public final PayLaterPaymentInfoRequest copy(@Json(name = "payment_amount") Money amount, @Json(name = "merchant_id") String merchantId) {
        return new PayLaterPaymentInfoRequest(amount, merchantId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayLaterPaymentInfoRequest)) {
            return false;
        }
        PayLaterPaymentInfoRequest payLaterPaymentInfoRequest = (PayLaterPaymentInfoRequest) other;
        return jl40.l(this.amount, payLaterPaymentInfoRequest.amount) && jl40.l(this.merchantId, payLaterPaymentInfoRequest.merchantId);
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final String getMerchantId() {
        return this.merchantId;
    }

    public int hashCode() {
        int hashCode = this.amount.hashCode() * 31;
        String str = this.merchantId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "PayLaterPaymentInfoRequest(amount=" + this.amount + ", merchantId=" + this.merchantId + Extension.C_BRAKE;
    }

    public PayLaterPaymentInfoRequest(@Json(name = "payment_amount") Money money, @Json(name = "merchant_id") String str) {
        this.amount = money;
        this.merchantId = str;
    }
}
