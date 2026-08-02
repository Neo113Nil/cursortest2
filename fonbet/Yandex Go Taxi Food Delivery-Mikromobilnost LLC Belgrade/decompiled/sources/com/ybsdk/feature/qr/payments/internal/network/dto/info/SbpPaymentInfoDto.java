package com.ybsdk.feature.qr.payments.internal.network.dto.info;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.qr.payments.internal.network.common.QrcTypeDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/SbpPaymentInfoDto;", "", "qrcType", "Lcom/ybsdk/feature/qr/payments/internal/network/common/QrcTypeDto;", "payment", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/PaymentInfoDto;", "redirectLink", "", "subscriptionInfo", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/SubscriptionInfoDto;", "<init>", "(Lcom/ybsdk/feature/qr/payments/internal/network/common/QrcTypeDto;Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/PaymentInfoDto;Ljava/lang/String;Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/SubscriptionInfoDto;)V", "getQrcType", "()Lcom/ybsdk/feature/qr/payments/internal/network/common/QrcTypeDto;", "getPayment", "()Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/PaymentInfoDto;", "getRedirectLink", "()Ljava/lang/String;", "getSubscriptionInfo", "()Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/SubscriptionInfoDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SbpPaymentInfoDto {
    private final PaymentInfoDto payment;
    private final QrcTypeDto qrcType;
    private final String redirectLink;
    private final SubscriptionInfoDto subscriptionInfo;

    public SbpPaymentInfoDto(@Json(name = "qrc_type") QrcTypeDto qrcTypeDto, @Json(name = "payment_info") PaymentInfoDto paymentInfoDto, @Json(name = "redirect_link") String str, @Json(name = "subscription_info") SubscriptionInfoDto subscriptionInfoDto) {
        this.qrcType = qrcTypeDto;
        this.payment = paymentInfoDto;
        this.redirectLink = str;
        this.subscriptionInfo = subscriptionInfoDto;
    }

    public static /* synthetic */ SbpPaymentInfoDto copy$default(SbpPaymentInfoDto sbpPaymentInfoDto, QrcTypeDto qrcTypeDto, PaymentInfoDto paymentInfoDto, String str, SubscriptionInfoDto subscriptionInfoDto, int i, Object obj) {
        if ((i & 1) != 0) {
            qrcTypeDto = sbpPaymentInfoDto.qrcType;
        }
        if ((i & 2) != 0) {
            paymentInfoDto = sbpPaymentInfoDto.payment;
        }
        if ((i & 4) != 0) {
            str = sbpPaymentInfoDto.redirectLink;
        }
        if ((i & 8) != 0) {
            subscriptionInfoDto = sbpPaymentInfoDto.subscriptionInfo;
        }
        return sbpPaymentInfoDto.copy(qrcTypeDto, paymentInfoDto, str, subscriptionInfoDto);
    }

    /* renamed from: component1, reason: from getter */
    public final QrcTypeDto getQrcType() {
        return this.qrcType;
    }

    /* renamed from: component2, reason: from getter */
    public final PaymentInfoDto getPayment() {
        return this.payment;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRedirectLink() {
        return this.redirectLink;
    }

    /* renamed from: component4, reason: from getter */
    public final SubscriptionInfoDto getSubscriptionInfo() {
        return this.subscriptionInfo;
    }

    public final SbpPaymentInfoDto copy(@Json(name = "qrc_type") QrcTypeDto qrcType, @Json(name = "payment_info") PaymentInfoDto payment, @Json(name = "redirect_link") String redirectLink, @Json(name = "subscription_info") SubscriptionInfoDto subscriptionInfo) {
        return new SbpPaymentInfoDto(qrcType, payment, redirectLink, subscriptionInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SbpPaymentInfoDto)) {
            return false;
        }
        SbpPaymentInfoDto sbpPaymentInfoDto = (SbpPaymentInfoDto) other;
        return this.qrcType == sbpPaymentInfoDto.qrcType && jl40.l(this.payment, sbpPaymentInfoDto.payment) && jl40.l(this.redirectLink, sbpPaymentInfoDto.redirectLink) && jl40.l(this.subscriptionInfo, sbpPaymentInfoDto.subscriptionInfo);
    }

    public final PaymentInfoDto getPayment() {
        return this.payment;
    }

    public final QrcTypeDto getQrcType() {
        return this.qrcType;
    }

    public final String getRedirectLink() {
        return this.redirectLink;
    }

    public final SubscriptionInfoDto getSubscriptionInfo() {
        return this.subscriptionInfo;
    }

    public int hashCode() {
        int hashCode = this.qrcType.hashCode() * 31;
        PaymentInfoDto paymentInfoDto = this.payment;
        int hashCode2 = (hashCode + (paymentInfoDto == null ? 0 : paymentInfoDto.hashCode())) * 31;
        String str = this.redirectLink;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        SubscriptionInfoDto subscriptionInfoDto = this.subscriptionInfo;
        return hashCode3 + (subscriptionInfoDto != null ? subscriptionInfoDto.hashCode() : 0);
    }

    public String toString() {
        return "SbpPaymentInfoDto(qrcType=" + this.qrcType + ", payment=" + this.payment + ", redirectLink=" + this.redirectLink + ", subscriptionInfo=" + this.subscriptionInfo + Extension.C_BRAKE;
    }
}
