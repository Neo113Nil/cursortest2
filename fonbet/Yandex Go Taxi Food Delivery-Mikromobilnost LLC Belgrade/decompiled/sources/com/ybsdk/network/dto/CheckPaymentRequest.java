package com.ybsdk.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/network/dto/CheckPaymentRequest;", "", "paymentMethodId", "", "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;)V", "getPaymentMethodId", "()Ljava/lang/String;", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CheckPaymentRequest {
    private final Money money;
    private final String paymentMethodId;

    public CheckPaymentRequest(@Json(name = "payment_method_id") String str, @Json(name = "money") Money money) {
        this.paymentMethodId = str;
        this.money = money;
    }

    public static /* synthetic */ CheckPaymentRequest copy$default(CheckPaymentRequest checkPaymentRequest, String str, Money money, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkPaymentRequest.paymentMethodId;
        }
        if ((i & 2) != 0) {
            money = checkPaymentRequest.money;
        }
        return checkPaymentRequest.copy(str, money);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getMoney() {
        return this.money;
    }

    public final CheckPaymentRequest copy(@Json(name = "payment_method_id") String paymentMethodId, @Json(name = "money") Money money) {
        return new CheckPaymentRequest(paymentMethodId, money);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckPaymentRequest)) {
            return false;
        }
        CheckPaymentRequest checkPaymentRequest = (CheckPaymentRequest) other;
        return jl40.l(this.paymentMethodId, checkPaymentRequest.paymentMethodId) && jl40.l(this.money, checkPaymentRequest.money);
    }

    public final Money getMoney() {
        return this.money;
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public int hashCode() {
        return this.money.hashCode() + (this.paymentMethodId.hashCode() * 31);
    }

    public String toString() {
        return "CheckPaymentRequest(paymentMethodId=" + this.paymentMethodId + ", money=" + this.money + Extension.C_BRAKE;
    }
}
