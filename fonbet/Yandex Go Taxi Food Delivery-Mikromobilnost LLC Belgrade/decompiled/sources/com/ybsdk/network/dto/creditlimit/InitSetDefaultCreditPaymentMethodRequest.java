package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/InitSetDefaultCreditPaymentMethodRequest;", "", "paymentMethodType", "Lcom/ybsdk/network/dto/creditlimit/CreditPaymentMethodTypeResponse;", "paymentMethodId", "", "<init>", "(Lcom/ybsdk/network/dto/creditlimit/CreditPaymentMethodTypeResponse;Ljava/lang/String;)V", "getPaymentMethodType", "()Lcom/ybsdk/network/dto/creditlimit/CreditPaymentMethodTypeResponse;", "getPaymentMethodId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class InitSetDefaultCreditPaymentMethodRequest {
    private final String paymentMethodId;
    private final CreditPaymentMethodTypeResponse paymentMethodType;

    public /* synthetic */ InitSetDefaultCreditPaymentMethodRequest(CreditPaymentMethodTypeResponse creditPaymentMethodTypeResponse, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(creditPaymentMethodTypeResponse, (i & 2) != 0 ? null : str);
    }

    public static /* synthetic */ InitSetDefaultCreditPaymentMethodRequest copy$default(InitSetDefaultCreditPaymentMethodRequest initSetDefaultCreditPaymentMethodRequest, CreditPaymentMethodTypeResponse creditPaymentMethodTypeResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            creditPaymentMethodTypeResponse = initSetDefaultCreditPaymentMethodRequest.paymentMethodType;
        }
        if ((i & 2) != 0) {
            str = initSetDefaultCreditPaymentMethodRequest.paymentMethodId;
        }
        return initSetDefaultCreditPaymentMethodRequest.copy(creditPaymentMethodTypeResponse, str);
    }

    /* renamed from: component1, reason: from getter */
    public final CreditPaymentMethodTypeResponse getPaymentMethodType() {
        return this.paymentMethodType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final InitSetDefaultCreditPaymentMethodRequest copy(@Json(name = "payment_method_type") CreditPaymentMethodTypeResponse paymentMethodType, @Json(name = "payment_method_id") String paymentMethodId) {
        return new InitSetDefaultCreditPaymentMethodRequest(paymentMethodType, paymentMethodId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitSetDefaultCreditPaymentMethodRequest)) {
            return false;
        }
        InitSetDefaultCreditPaymentMethodRequest initSetDefaultCreditPaymentMethodRequest = (InitSetDefaultCreditPaymentMethodRequest) other;
        return this.paymentMethodType == initSetDefaultCreditPaymentMethodRequest.paymentMethodType && jl40.l(this.paymentMethodId, initSetDefaultCreditPaymentMethodRequest.paymentMethodId);
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final CreditPaymentMethodTypeResponse getPaymentMethodType() {
        return this.paymentMethodType;
    }

    public int hashCode() {
        int hashCode = this.paymentMethodType.hashCode() * 31;
        String str = this.paymentMethodId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "InitSetDefaultCreditPaymentMethodRequest(paymentMethodType=" + this.paymentMethodType + ", paymentMethodId=" + this.paymentMethodId + Extension.C_BRAKE;
    }

    public InitSetDefaultCreditPaymentMethodRequest(@Json(name = "payment_method_type") CreditPaymentMethodTypeResponse creditPaymentMethodTypeResponse, @Json(name = "payment_method_id") String str) {
        this.paymentMethodType = creditPaymentMethodTypeResponse;
        this.paymentMethodId = str;
    }
}
