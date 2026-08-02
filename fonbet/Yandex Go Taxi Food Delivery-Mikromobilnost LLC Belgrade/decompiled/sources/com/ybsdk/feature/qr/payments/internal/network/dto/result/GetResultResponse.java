package com.ybsdk.feature.qr.payments.internal.network.dto.result;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.qr.payments.internal.network.dto.QrPaymentResult;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/dto/result/GetResultResponse;", "", "paymentResult", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/QrPaymentResult;", "<init>", "(Lcom/ybsdk/feature/qr/payments/internal/network/dto/QrPaymentResult;)V", "getPaymentResult", "()Lcom/ybsdk/feature/qr/payments/internal/network/dto/QrPaymentResult;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetResultResponse {
    private final QrPaymentResult paymentResult;

    public GetResultResponse(@Json(name = "payment_result") QrPaymentResult qrPaymentResult) {
        this.paymentResult = qrPaymentResult;
    }

    public static /* synthetic */ GetResultResponse copy$default(GetResultResponse getResultResponse, QrPaymentResult qrPaymentResult, int i, Object obj) {
        if ((i & 1) != 0) {
            qrPaymentResult = getResultResponse.paymentResult;
        }
        return getResultResponse.copy(qrPaymentResult);
    }

    /* renamed from: component1, reason: from getter */
    public final QrPaymentResult getPaymentResult() {
        return this.paymentResult;
    }

    public final GetResultResponse copy(@Json(name = "payment_result") QrPaymentResult paymentResult) {
        return new GetResultResponse(paymentResult);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetResultResponse) && jl40.l(this.paymentResult, ((GetResultResponse) other).paymentResult);
    }

    public final QrPaymentResult getPaymentResult() {
        return this.paymentResult;
    }

    public int hashCode() {
        return this.paymentResult.hashCode();
    }

    public String toString() {
        return "GetResultResponse(paymentResult=" + this.paymentResult + Extension.C_BRAKE;
    }
}
