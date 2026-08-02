package com.ybsdk.feature.qr.payments.internal.network.dto.info;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/SberPaymentInfoDto;", "", "paymentInfo", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/QrPaymentInfoDto;", "<init>", "(Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/QrPaymentInfoDto;)V", "getPaymentInfo", "()Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/QrPaymentInfoDto;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SberPaymentInfoDto {
    private final QrPaymentInfoDto paymentInfo;

    public SberPaymentInfoDto(@Json(name = "payment_info") QrPaymentInfoDto qrPaymentInfoDto) {
        this.paymentInfo = qrPaymentInfoDto;
    }

    public static /* synthetic */ SberPaymentInfoDto copy$default(SberPaymentInfoDto sberPaymentInfoDto, QrPaymentInfoDto qrPaymentInfoDto, int i, Object obj) {
        if ((i & 1) != 0) {
            qrPaymentInfoDto = sberPaymentInfoDto.paymentInfo;
        }
        return sberPaymentInfoDto.copy(qrPaymentInfoDto);
    }

    /* renamed from: component1, reason: from getter */
    public final QrPaymentInfoDto getPaymentInfo() {
        return this.paymentInfo;
    }

    public final SberPaymentInfoDto copy(@Json(name = "payment_info") QrPaymentInfoDto paymentInfo) {
        return new SberPaymentInfoDto(paymentInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SberPaymentInfoDto) && jl40.l(this.paymentInfo, ((SberPaymentInfoDto) other).paymentInfo);
    }

    public final QrPaymentInfoDto getPaymentInfo() {
        return this.paymentInfo;
    }

    public int hashCode() {
        return this.paymentInfo.hashCode();
    }

    public String toString() {
        return "SberPaymentInfoDto(paymentInfo=" + this.paymentInfo + Extension.C_BRAKE;
    }
}
