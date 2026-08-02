package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/PollSetDefaultCreditPaymentMethodStatusRequest;", "", "paymentMethodType", "Lcom/ybsdk/network/dto/creditlimit/CreditPaymentMethodTypeResponse;", "paymentId", "", "<init>", "(Lcom/ybsdk/network/dto/creditlimit/CreditPaymentMethodTypeResponse;Ljava/lang/String;)V", "getPaymentMethodType", "()Lcom/ybsdk/network/dto/creditlimit/CreditPaymentMethodTypeResponse;", "getPaymentId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PollSetDefaultCreditPaymentMethodStatusRequest {
    private final String paymentId;
    private final CreditPaymentMethodTypeResponse paymentMethodType;

    public PollSetDefaultCreditPaymentMethodStatusRequest(@Json(name = "payment_method_type") CreditPaymentMethodTypeResponse creditPaymentMethodTypeResponse, @Json(name = "payment_id") String str) {
        this.paymentMethodType = creditPaymentMethodTypeResponse;
        this.paymentId = str;
    }

    public static /* synthetic */ PollSetDefaultCreditPaymentMethodStatusRequest copy$default(PollSetDefaultCreditPaymentMethodStatusRequest pollSetDefaultCreditPaymentMethodStatusRequest, CreditPaymentMethodTypeResponse creditPaymentMethodTypeResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            creditPaymentMethodTypeResponse = pollSetDefaultCreditPaymentMethodStatusRequest.paymentMethodType;
        }
        if ((i & 2) != 0) {
            str = pollSetDefaultCreditPaymentMethodStatusRequest.paymentId;
        }
        return pollSetDefaultCreditPaymentMethodStatusRequest.copy(creditPaymentMethodTypeResponse, str);
    }

    /* renamed from: component1, reason: from getter */
    public final CreditPaymentMethodTypeResponse getPaymentMethodType() {
        return this.paymentMethodType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPaymentId() {
        return this.paymentId;
    }

    public final PollSetDefaultCreditPaymentMethodStatusRequest copy(@Json(name = "payment_method_type") CreditPaymentMethodTypeResponse paymentMethodType, @Json(name = "payment_id") String paymentId) {
        return new PollSetDefaultCreditPaymentMethodStatusRequest(paymentMethodType, paymentId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollSetDefaultCreditPaymentMethodStatusRequest)) {
            return false;
        }
        PollSetDefaultCreditPaymentMethodStatusRequest pollSetDefaultCreditPaymentMethodStatusRequest = (PollSetDefaultCreditPaymentMethodStatusRequest) other;
        return this.paymentMethodType == pollSetDefaultCreditPaymentMethodStatusRequest.paymentMethodType && jl40.l(this.paymentId, pollSetDefaultCreditPaymentMethodStatusRequest.paymentId);
    }

    public final String getPaymentId() {
        return this.paymentId;
    }

    public final CreditPaymentMethodTypeResponse getPaymentMethodType() {
        return this.paymentMethodType;
    }

    public int hashCode() {
        return this.paymentId.hashCode() + (this.paymentMethodType.hashCode() * 31);
    }

    public String toString() {
        return "PollSetDefaultCreditPaymentMethodStatusRequest(paymentMethodType=" + this.paymentMethodType + ", paymentId=" + this.paymentId + Extension.C_BRAKE;
    }
}
