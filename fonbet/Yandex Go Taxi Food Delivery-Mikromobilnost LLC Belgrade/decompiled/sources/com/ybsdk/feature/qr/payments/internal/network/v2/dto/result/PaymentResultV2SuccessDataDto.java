package com.ybsdk.feature.qr.payments.internal.network.v2.dto.result;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ActionButtonDto;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.qr.payments.internal.network.dto.info.SubscriptionWidgetDto;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/result/PaymentResultV2SuccessDataDto;", "", "subscriptionWidget", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/SubscriptionWidgetDto;", "redirectLink", "", "divData", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "button", "Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "funding", "<init>", "(Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/SubscriptionWidgetDto;Ljava/lang/String;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;Ljava/lang/String;)V", "getSubscriptionWidget", "()Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/SubscriptionWidgetDto;", "getRedirectLink", "()Ljava/lang/String;", "getDivData", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getButton", "()Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "getFunding", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PaymentResultV2SuccessDataDto {
    private final ActionButtonDto button;
    private final DivDataDto divData;
    private final String funding;
    private final String redirectLink;
    private final SubscriptionWidgetDto subscriptionWidget;

    public PaymentResultV2SuccessDataDto(@Json(name = "subscription_widget") SubscriptionWidgetDto subscriptionWidgetDto, @Json(name = "redirect_link") String str, @Json(name = "divkit_data") DivDataDto divDataDto, @Json(name = "button") ActionButtonDto actionButtonDto, @Json(name = "funding") String str2) {
        this.subscriptionWidget = subscriptionWidgetDto;
        this.redirectLink = str;
        this.divData = divDataDto;
        this.button = actionButtonDto;
        this.funding = str2;
    }

    public static /* synthetic */ PaymentResultV2SuccessDataDto copy$default(PaymentResultV2SuccessDataDto paymentResultV2SuccessDataDto, SubscriptionWidgetDto subscriptionWidgetDto, String str, DivDataDto divDataDto, ActionButtonDto actionButtonDto, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            subscriptionWidgetDto = paymentResultV2SuccessDataDto.subscriptionWidget;
        }
        if ((i & 2) != 0) {
            str = paymentResultV2SuccessDataDto.redirectLink;
        }
        if ((i & 4) != 0) {
            divDataDto = paymentResultV2SuccessDataDto.divData;
        }
        if ((i & 8) != 0) {
            actionButtonDto = paymentResultV2SuccessDataDto.button;
        }
        if ((i & 16) != 0) {
            str2 = paymentResultV2SuccessDataDto.funding;
        }
        String str3 = str2;
        DivDataDto divDataDto2 = divDataDto;
        return paymentResultV2SuccessDataDto.copy(subscriptionWidgetDto, str, divDataDto2, actionButtonDto, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final SubscriptionWidgetDto getSubscriptionWidget() {
        return this.subscriptionWidget;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRedirectLink() {
        return this.redirectLink;
    }

    /* renamed from: component3, reason: from getter */
    public final DivDataDto getDivData() {
        return this.divData;
    }

    /* renamed from: component4, reason: from getter */
    public final ActionButtonDto getButton() {
        return this.button;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFunding() {
        return this.funding;
    }

    public final PaymentResultV2SuccessDataDto copy(@Json(name = "subscription_widget") SubscriptionWidgetDto subscriptionWidget, @Json(name = "redirect_link") String redirectLink, @Json(name = "divkit_data") DivDataDto divData, @Json(name = "button") ActionButtonDto button, @Json(name = "funding") String funding) {
        return new PaymentResultV2SuccessDataDto(subscriptionWidget, redirectLink, divData, button, funding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentResultV2SuccessDataDto)) {
            return false;
        }
        PaymentResultV2SuccessDataDto paymentResultV2SuccessDataDto = (PaymentResultV2SuccessDataDto) other;
        return jl40.l(this.subscriptionWidget, paymentResultV2SuccessDataDto.subscriptionWidget) && jl40.l(this.redirectLink, paymentResultV2SuccessDataDto.redirectLink) && jl40.l(this.divData, paymentResultV2SuccessDataDto.divData) && jl40.l(this.button, paymentResultV2SuccessDataDto.button) && jl40.l(this.funding, paymentResultV2SuccessDataDto.funding);
    }

    public final ActionButtonDto getButton() {
        return this.button;
    }

    public final DivDataDto getDivData() {
        return this.divData;
    }

    public final String getFunding() {
        return this.funding;
    }

    public final String getRedirectLink() {
        return this.redirectLink;
    }

    public final SubscriptionWidgetDto getSubscriptionWidget() {
        return this.subscriptionWidget;
    }

    public int hashCode() {
        SubscriptionWidgetDto subscriptionWidgetDto = this.subscriptionWidget;
        int hashCode = (subscriptionWidgetDto == null ? 0 : subscriptionWidgetDto.hashCode()) * 31;
        String str = this.redirectLink;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        DivDataDto divDataDto = this.divData;
        int hashCode3 = (hashCode2 + (divDataDto == null ? 0 : divDataDto.hashCode())) * 31;
        ActionButtonDto actionButtonDto = this.button;
        int hashCode4 = (hashCode3 + (actionButtonDto == null ? 0 : actionButtonDto.hashCode())) * 31;
        String str2 = this.funding;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        SubscriptionWidgetDto subscriptionWidgetDto = this.subscriptionWidget;
        String str = this.redirectLink;
        DivDataDto divDataDto = this.divData;
        ActionButtonDto actionButtonDto = this.button;
        String str2 = this.funding;
        StringBuilder sb = new StringBuilder("PaymentResultV2SuccessDataDto(subscriptionWidget=");
        sb.append(subscriptionWidgetDto);
        sb.append(", redirectLink=");
        sb.append(str);
        sb.append(", divData=");
        sb.append(divDataDto);
        sb.append(", button=");
        sb.append(actionButtonDto);
        sb.append(", funding=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }
}
