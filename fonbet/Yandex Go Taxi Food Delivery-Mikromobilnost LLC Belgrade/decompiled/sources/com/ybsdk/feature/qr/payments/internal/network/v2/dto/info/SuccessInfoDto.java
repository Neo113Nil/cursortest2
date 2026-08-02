package com.ybsdk.feature.qr.payments.internal.network.v2.dto.info;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.qr.payments.internal.network.common.QrcTypeDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/SuccessInfoDto;", "", "qrcType", "Lcom/ybsdk/feature/qr/payments/internal/network/common/QrcTypeDto;", "subscriptionInfo", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/SubscriptionInfoDto;", "paymentInfo", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/PaymentInfoDto;", "<init>", "(Lcom/ybsdk/feature/qr/payments/internal/network/common/QrcTypeDto;Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/SubscriptionInfoDto;Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/PaymentInfoDto;)V", "getQrcType", "()Lcom/ybsdk/feature/qr/payments/internal/network/common/QrcTypeDto;", "getSubscriptionInfo", "()Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/SubscriptionInfoDto;", "getPaymentInfo", "()Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/PaymentInfoDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SuccessInfoDto {
    private final PaymentInfoDto paymentInfo;
    private final QrcTypeDto qrcType;
    private final SubscriptionInfoDto subscriptionInfo;

    public SuccessInfoDto(@Json(name = "qrc_type") QrcTypeDto qrcTypeDto, @Json(name = "subscription_info") SubscriptionInfoDto subscriptionInfoDto, @Json(name = "payment_info") PaymentInfoDto paymentInfoDto) {
        this.qrcType = qrcTypeDto;
        this.subscriptionInfo = subscriptionInfoDto;
        this.paymentInfo = paymentInfoDto;
    }

    public static /* synthetic */ SuccessInfoDto copy$default(SuccessInfoDto successInfoDto, QrcTypeDto qrcTypeDto, SubscriptionInfoDto subscriptionInfoDto, PaymentInfoDto paymentInfoDto, int i, Object obj) {
        if ((i & 1) != 0) {
            qrcTypeDto = successInfoDto.qrcType;
        }
        if ((i & 2) != 0) {
            subscriptionInfoDto = successInfoDto.subscriptionInfo;
        }
        if ((i & 4) != 0) {
            paymentInfoDto = successInfoDto.paymentInfo;
        }
        return successInfoDto.copy(qrcTypeDto, subscriptionInfoDto, paymentInfoDto);
    }

    /* renamed from: component1, reason: from getter */
    public final QrcTypeDto getQrcType() {
        return this.qrcType;
    }

    /* renamed from: component2, reason: from getter */
    public final SubscriptionInfoDto getSubscriptionInfo() {
        return this.subscriptionInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final PaymentInfoDto getPaymentInfo() {
        return this.paymentInfo;
    }

    public final SuccessInfoDto copy(@Json(name = "qrc_type") QrcTypeDto qrcType, @Json(name = "subscription_info") SubscriptionInfoDto subscriptionInfo, @Json(name = "payment_info") PaymentInfoDto paymentInfo) {
        return new SuccessInfoDto(qrcType, subscriptionInfo, paymentInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuccessInfoDto)) {
            return false;
        }
        SuccessInfoDto successInfoDto = (SuccessInfoDto) other;
        return this.qrcType == successInfoDto.qrcType && jl40.l(this.subscriptionInfo, successInfoDto.subscriptionInfo) && jl40.l(this.paymentInfo, successInfoDto.paymentInfo);
    }

    public final PaymentInfoDto getPaymentInfo() {
        return this.paymentInfo;
    }

    public final QrcTypeDto getQrcType() {
        return this.qrcType;
    }

    public final SubscriptionInfoDto getSubscriptionInfo() {
        return this.subscriptionInfo;
    }

    public int hashCode() {
        int hashCode = this.qrcType.hashCode() * 31;
        SubscriptionInfoDto subscriptionInfoDto = this.subscriptionInfo;
        int hashCode2 = (hashCode + (subscriptionInfoDto == null ? 0 : subscriptionInfoDto.hashCode())) * 31;
        PaymentInfoDto paymentInfoDto = this.paymentInfo;
        return hashCode2 + (paymentInfoDto != null ? paymentInfoDto.hashCode() : 0);
    }

    public String toString() {
        return "SuccessInfoDto(qrcType=" + this.qrcType + ", subscriptionInfo=" + this.subscriptionInfo + ", paymentInfo=" + this.paymentInfo + Extension.C_BRAKE;
    }
}
