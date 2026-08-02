package com.ybsdk.feature.qr.payments.internal.network.v2.dto.confirm;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.qr.payments.internal.network.dto.QrPaymentsResultStatus;
import com.ybsdk.feature.qr.payments.internal.network.v2.dto.result.PaymentResultV2SuccessDataDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/confirm/ConfirmPaymentResponseV2;", "", "paymentId", "", ACSPConstants.STATUS, "Lcom/ybsdk/feature/qr/payments/internal/network/dto/QrPaymentsResultStatus;", "successStatusData", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/result/PaymentResultV2SuccessDataDto;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/qr/payments/internal/network/dto/QrPaymentsResultStatus;Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/result/PaymentResultV2SuccessDataDto;)V", "getPaymentId", "()Ljava/lang/String;", "getStatus", "()Lcom/ybsdk/feature/qr/payments/internal/network/dto/QrPaymentsResultStatus;", "getSuccessStatusData", "()Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/result/PaymentResultV2SuccessDataDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ConfirmPaymentResponseV2 {
    private final String paymentId;
    private final QrPaymentsResultStatus status;
    private final PaymentResultV2SuccessDataDto successStatusData;

    public ConfirmPaymentResponseV2(@Json(name = "payment_id") String str, @Json(name = "status") QrPaymentsResultStatus qrPaymentsResultStatus, @Json(name = "success_status_data") PaymentResultV2SuccessDataDto paymentResultV2SuccessDataDto) {
        this.paymentId = str;
        this.status = qrPaymentsResultStatus;
        this.successStatusData = paymentResultV2SuccessDataDto;
    }

    public static /* synthetic */ ConfirmPaymentResponseV2 copy$default(ConfirmPaymentResponseV2 confirmPaymentResponseV2, String str, QrPaymentsResultStatus qrPaymentsResultStatus, PaymentResultV2SuccessDataDto paymentResultV2SuccessDataDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = confirmPaymentResponseV2.paymentId;
        }
        if ((i & 2) != 0) {
            qrPaymentsResultStatus = confirmPaymentResponseV2.status;
        }
        if ((i & 4) != 0) {
            paymentResultV2SuccessDataDto = confirmPaymentResponseV2.successStatusData;
        }
        return confirmPaymentResponseV2.copy(str, qrPaymentsResultStatus, paymentResultV2SuccessDataDto);
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

    public final ConfirmPaymentResponseV2 copy(@Json(name = "payment_id") String paymentId, @Json(name = "status") QrPaymentsResultStatus status, @Json(name = "success_status_data") PaymentResultV2SuccessDataDto successStatusData) {
        return new ConfirmPaymentResponseV2(paymentId, status, successStatusData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfirmPaymentResponseV2)) {
            return false;
        }
        ConfirmPaymentResponseV2 confirmPaymentResponseV2 = (ConfirmPaymentResponseV2) other;
        return jl40.l(this.paymentId, confirmPaymentResponseV2.paymentId) && this.status == confirmPaymentResponseV2.status && jl40.l(this.successStatusData, confirmPaymentResponseV2.successStatusData);
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
        return hashCode + (paymentResultV2SuccessDataDto == null ? 0 : paymentResultV2SuccessDataDto.hashCode());
    }

    public String toString() {
        return "ConfirmPaymentResponseV2(paymentId=" + this.paymentId + ", status=" + this.status + ", successStatusData=" + this.successStatusData + Extension.C_BRAKE;
    }
}
