package com.ybsdk.feature.qr.payments.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.qr.payments.internal.network.common.MerchantDto;
import com.ybsdk.feature.qr.payments.internal.network.dto.info.SubscriptionWidgetDto;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003Ja\u0010&\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006-"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/dto/QrPaymentResult;", "", "paymentId", "", ACSPConstants.STATUS, "Lcom/ybsdk/feature/qr/payments/internal/network/dto/QrPaymentsResultStatus;", "merchant", "Lcom/ybsdk/feature/qr/payments/internal/network/common/MerchantDto;", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "subscriptionWidget", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/SubscriptionWidgetDto;", "redirectLink", "divkitWidget", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/qr/payments/internal/network/dto/QrPaymentsResultStatus;Lcom/ybsdk/feature/qr/payments/internal/network/common/MerchantDto;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/SubscriptionWidgetDto;Ljava/lang/String;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;)V", "getPaymentId", "()Ljava/lang/String;", "getStatus", "()Lcom/ybsdk/feature/qr/payments/internal/network/dto/QrPaymentsResultStatus;", "getMerchant", "()Lcom/ybsdk/feature/qr/payments/internal/network/common/MerchantDto;", "getTitle", "getDescription", "getSubscriptionWidget", "()Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/SubscriptionWidgetDto;", "getRedirectLink", "getDivkitWidget", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class QrPaymentResult {
    private final String description;
    private final DivDataDto divkitWidget;
    private final MerchantDto merchant;
    private final String paymentId;
    private final String redirectLink;
    private final QrPaymentsResultStatus status;
    private final SubscriptionWidgetDto subscriptionWidget;
    private final String title;

    public QrPaymentResult(@Json(name = "payment_id") String str, @Json(name = "status") QrPaymentsResultStatus qrPaymentsResultStatus, @Json(name = "merchant") MerchantDto merchantDto, @Json(name = "title") String str2, @Json(name = "description") String str3, @Json(name = "subscription_widget") SubscriptionWidgetDto subscriptionWidgetDto, @Json(name = "redirect_link") String str4, @Json(name = "divkit_widget") DivDataDto divDataDto) {
        this.paymentId = str;
        this.status = qrPaymentsResultStatus;
        this.merchant = merchantDto;
        this.title = str2;
        this.description = str3;
        this.subscriptionWidget = subscriptionWidgetDto;
        this.redirectLink = str4;
        this.divkitWidget = divDataDto;
    }

    public static /* synthetic */ QrPaymentResult copy$default(QrPaymentResult qrPaymentResult, String str, QrPaymentsResultStatus qrPaymentsResultStatus, MerchantDto merchantDto, String str2, String str3, SubscriptionWidgetDto subscriptionWidgetDto, String str4, DivDataDto divDataDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qrPaymentResult.paymentId;
        }
        if ((i & 2) != 0) {
            qrPaymentsResultStatus = qrPaymentResult.status;
        }
        if ((i & 4) != 0) {
            merchantDto = qrPaymentResult.merchant;
        }
        if ((i & 8) != 0) {
            str2 = qrPaymentResult.title;
        }
        if ((i & 16) != 0) {
            str3 = qrPaymentResult.description;
        }
        if ((i & 32) != 0) {
            subscriptionWidgetDto = qrPaymentResult.subscriptionWidget;
        }
        if ((i & 64) != 0) {
            str4 = qrPaymentResult.redirectLink;
        }
        if ((i & 128) != 0) {
            divDataDto = qrPaymentResult.divkitWidget;
        }
        String str5 = str4;
        DivDataDto divDataDto2 = divDataDto;
        String str6 = str3;
        SubscriptionWidgetDto subscriptionWidgetDto2 = subscriptionWidgetDto;
        return qrPaymentResult.copy(str, qrPaymentsResultStatus, merchantDto, str2, str6, subscriptionWidgetDto2, str5, divDataDto2);
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
    public final MerchantDto getMerchant() {
        return this.merchant;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component6, reason: from getter */
    public final SubscriptionWidgetDto getSubscriptionWidget() {
        return this.subscriptionWidget;
    }

    /* renamed from: component7, reason: from getter */
    public final String getRedirectLink() {
        return this.redirectLink;
    }

    /* renamed from: component8, reason: from getter */
    public final DivDataDto getDivkitWidget() {
        return this.divkitWidget;
    }

    public final QrPaymentResult copy(@Json(name = "payment_id") String paymentId, @Json(name = "status") QrPaymentsResultStatus status, @Json(name = "merchant") MerchantDto merchant, @Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "subscription_widget") SubscriptionWidgetDto subscriptionWidget, @Json(name = "redirect_link") String redirectLink, @Json(name = "divkit_widget") DivDataDto divkitWidget) {
        return new QrPaymentResult(paymentId, status, merchant, title, description, subscriptionWidget, redirectLink, divkitWidget);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QrPaymentResult)) {
            return false;
        }
        QrPaymentResult qrPaymentResult = (QrPaymentResult) other;
        return jl40.l(this.paymentId, qrPaymentResult.paymentId) && this.status == qrPaymentResult.status && jl40.l(this.merchant, qrPaymentResult.merchant) && jl40.l(this.title, qrPaymentResult.title) && jl40.l(this.description, qrPaymentResult.description) && jl40.l(this.subscriptionWidget, qrPaymentResult.subscriptionWidget) && jl40.l(this.redirectLink, qrPaymentResult.redirectLink) && jl40.l(this.divkitWidget, qrPaymentResult.divkitWidget);
    }

    public final String getDescription() {
        return this.description;
    }

    public final DivDataDto getDivkitWidget() {
        return this.divkitWidget;
    }

    public final MerchantDto getMerchant() {
        return this.merchant;
    }

    public final String getPaymentId() {
        return this.paymentId;
    }

    public final String getRedirectLink() {
        return this.redirectLink;
    }

    public final QrPaymentsResultStatus getStatus() {
        return this.status;
    }

    public final SubscriptionWidgetDto getSubscriptionWidget() {
        return this.subscriptionWidget;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b = unr0.b((this.merchant.hashCode() + ((this.status.hashCode() + (this.paymentId.hashCode() * 31)) * 31)) * 31, 31, this.title);
        String str = this.description;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        SubscriptionWidgetDto subscriptionWidgetDto = this.subscriptionWidget;
        int hashCode2 = (hashCode + (subscriptionWidgetDto == null ? 0 : subscriptionWidgetDto.hashCode())) * 31;
        String str2 = this.redirectLink;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DivDataDto divDataDto = this.divkitWidget;
        return hashCode3 + (divDataDto != null ? divDataDto.hashCode() : 0);
    }

    public String toString() {
        return "QrPaymentResult(paymentId=" + this.paymentId + ", status=" + this.status + ", merchant=" + this.merchant + ", title=" + this.title + ", description=" + this.description + ", subscriptionWidget=" + this.subscriptionWidget + ", redirectLink=" + this.redirectLink + ", divkitWidget=" + this.divkitWidget + Extension.C_BRAKE;
    }
}
