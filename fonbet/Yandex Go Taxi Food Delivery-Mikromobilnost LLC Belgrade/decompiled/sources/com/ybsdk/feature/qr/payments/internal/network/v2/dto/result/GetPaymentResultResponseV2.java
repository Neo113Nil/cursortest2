package com.ybsdk.feature.qr.payments.internal.network.v2.dto.result;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.qr.payments.internal.network.dto.QrPaymentsResultStatus;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/result/GetPaymentResultResponseV2;", "", "paymentId", "", ACSPConstants.STATUS, "Lcom/ybsdk/feature/qr/payments/internal/network/dto/QrPaymentsResultStatus;", "successStatusData", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/result/PaymentResultV2SuccessDataDto;", "failStatusData", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/result/PaymentResultV2FailedDataDto;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/qr/payments/internal/network/dto/QrPaymentsResultStatus;Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/result/PaymentResultV2SuccessDataDto;Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/result/PaymentResultV2FailedDataDto;)V", "getPaymentId", "()Ljava/lang/String;", "getStatus", "()Lcom/ybsdk/feature/qr/payments/internal/network/dto/QrPaymentsResultStatus;", "getSuccessStatusData", "()Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/result/PaymentResultV2SuccessDataDto;", "getFailStatusData", "()Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/result/PaymentResultV2FailedDataDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetPaymentResultResponseV2 {
    private final PaymentResultV2FailedDataDto failStatusData;
    private final String paymentId;
    private final QrPaymentsResultStatus status;
    private final PaymentResultV2SuccessDataDto successStatusData;

    public GetPaymentResultResponseV2(@Json(name = "payment_id") String str, @Json(name = "status") QrPaymentsResultStatus qrPaymentsResultStatus, @Json(name = "success_status_data") PaymentResultV2SuccessDataDto paymentResultV2SuccessDataDto, @Json(name = "fail_status_data") PaymentResultV2FailedDataDto paymentResultV2FailedDataDto) {
        this.paymentId = str;
        this.status = qrPaymentsResultStatus;
        this.successStatusData = paymentResultV2SuccessDataDto;
        this.failStatusData = paymentResultV2FailedDataDto;
    }

    public static /* synthetic */ GetPaymentResultResponseV2 copy$default(GetPaymentResultResponseV2 getPaymentResultResponseV2, String str, QrPaymentsResultStatus qrPaymentsResultStatus, PaymentResultV2SuccessDataDto paymentResultV2SuccessDataDto, PaymentResultV2FailedDataDto paymentResultV2FailedDataDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getPaymentResultResponseV2.paymentId;
        }
        if ((i & 2) != 0) {
            qrPaymentsResultStatus = getPaymentResultResponseV2.status;
        }
        if ((i & 4) != 0) {
            paymentResultV2SuccessDataDto = getPaymentResultResponseV2.successStatusData;
        }
        if ((i & 8) != 0) {
            paymentResultV2FailedDataDto = getPaymentResultResponseV2.failStatusData;
        }
        return getPaymentResultResponseV2.copy(str, qrPaymentsResultStatus, paymentResultV2SuccessDataDto, paymentResultV2FailedDataDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPaymentId() {
        return this.paymentId;
    }

    /* renamed from: component2, reason: from getter */
    public final QrPaymentsResultStatus getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final PaymentResultV2SuccessDataDto getSuccessStatusData() {
        return this.successStatusData;
    }

    /* renamed from: component4, reason: from getter */
    public final PaymentResultV2FailedDataDto getFailStatusData() {
        return this.failStatusData;
    }

    public final GetPaymentResultResponseV2 copy(@Json(name = "payment_id") String paymentId, @Json(name = "status") QrPaymentsResultStatus status, @Json(name = "success_status_data") PaymentResultV2SuccessDataDto successStatusData, @Json(name = "fail_status_data") PaymentResultV2FailedDataDto failStatusData) {
        return new GetPaymentResultResponseV2(paymentId, status, successStatusData, failStatusData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetPaymentResultResponseV2)) {
            return false;
        }
        GetPaymentResultResponseV2 getPaymentResultResponseV2 = (GetPaymentResultResponseV2) other;
        return jl40.l(this.paymentId, getPaymentResultResponseV2.paymentId) && this.status == getPaymentResultResponseV2.status && jl40.l(this.successStatusData, getPaymentResultResponseV2.successStatusData) && jl40.l(this.failStatusData, getPaymentResultResponseV2.failStatusData);
    }

    public final PaymentResultV2FailedDataDto getFailStatusData() {
        return this.failStatusData;
    }

    public final String getPaymentId() {
        return this.paymentId;
    }

    public final QrPaymentsResultStatus getStatus() {
        return this.status;
    }

    public final PaymentResultV2SuccessDataDto getSuccessStatusData() {
        return this.successStatusData;
    }

    public int hashCode() {
        int hashCode = (this.status.hashCode() + (this.paymentId.hashCode() * 31)) * 31;
        PaymentResultV2SuccessDataDto paymentResultV2SuccessDataDto = this.successStatusData;
        int hashCode2 = (hashCode + (paymentResultV2SuccessDataDto == null ? 0 : paymentResultV2SuccessDataDto.hashCode())) * 31;
        PaymentResultV2FailedDataDto paymentResultV2FailedDataDto = this.failStatusData;
        return hashCode2 + (paymentResultV2FailedDataDto != null ? paymentResultV2FailedDataDto.hashCode() : 0);
    }

    public String toString() {
        return "GetPaymentResultResponseV2(paymentId=" + this.paymentId + ", status=" + this.status + ", successStatusData=" + this.successStatusData + ", failStatusData=" + this.failStatusData + Extension.C_BRAKE;
    }
}
