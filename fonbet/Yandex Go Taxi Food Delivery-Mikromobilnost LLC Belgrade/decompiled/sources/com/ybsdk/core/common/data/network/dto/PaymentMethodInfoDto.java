package com.ybsdk.core.common.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/PaymentMethodInfoDto;", "", "paymentType", "Lcom/ybsdk/core/common/data/network/dto/PaymentMethodTypeDto;", "me2meInfo", "Lcom/ybsdk/core/common/data/network/dto/Me2MeInfo;", "savingsAccountInfo", "Lcom/ybsdk/core/common/data/network/dto/SavingsAccountInfo;", "yandexAccountInfo", "Lcom/ybsdk/core/common/data/network/dto/YandexAccountInfo;", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/PaymentMethodTypeDto;Lcom/ybsdk/core/common/data/network/dto/Me2MeInfo;Lcom/ybsdk/core/common/data/network/dto/SavingsAccountInfo;Lcom/ybsdk/core/common/data/network/dto/YandexAccountInfo;)V", "getPaymentType", "()Lcom/ybsdk/core/common/data/network/dto/PaymentMethodTypeDto;", "getMe2meInfo", "()Lcom/ybsdk/core/common/data/network/dto/Me2MeInfo;", "getSavingsAccountInfo", "()Lcom/ybsdk/core/common/data/network/dto/SavingsAccountInfo;", "getYandexAccountInfo", "()Lcom/ybsdk/core/common/data/network/dto/YandexAccountInfo;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PaymentMethodInfoDto {
    private final Me2MeInfo me2meInfo;
    private final PaymentMethodTypeDto paymentType;
    private final SavingsAccountInfo savingsAccountInfo;
    private final YandexAccountInfo yandexAccountInfo;

    public PaymentMethodInfoDto(@Json(name = "paymentType") PaymentMethodTypeDto paymentMethodTypeDto, @Json(name = "me2me") Me2MeInfo me2MeInfo, @Json(name = "savings_account") SavingsAccountInfo savingsAccountInfo, @Json(name = "yandex_account") YandexAccountInfo yandexAccountInfo) {
        this.paymentType = paymentMethodTypeDto;
        this.me2meInfo = me2MeInfo;
        this.savingsAccountInfo = savingsAccountInfo;
        this.yandexAccountInfo = yandexAccountInfo;
    }

    public static /* synthetic */ PaymentMethodInfoDto copy$default(PaymentMethodInfoDto paymentMethodInfoDto, PaymentMethodTypeDto paymentMethodTypeDto, Me2MeInfo me2MeInfo, SavingsAccountInfo savingsAccountInfo, YandexAccountInfo yandexAccountInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentMethodTypeDto = paymentMethodInfoDto.paymentType;
        }
        if ((i & 2) != 0) {
            me2MeInfo = paymentMethodInfoDto.me2meInfo;
        }
        if ((i & 4) != 0) {
            savingsAccountInfo = paymentMethodInfoDto.savingsAccountInfo;
        }
        if ((i & 8) != 0) {
            yandexAccountInfo = paymentMethodInfoDto.yandexAccountInfo;
        }
        return paymentMethodInfoDto.copy(paymentMethodTypeDto, me2MeInfo, savingsAccountInfo, yandexAccountInfo);
    }

    /* renamed from: component1, reason: from getter */
    public final PaymentMethodTypeDto getPaymentType() {
        return this.paymentType;
    }

    /* renamed from: component2, reason: from getter */
    public final Me2MeInfo getMe2meInfo() {
        return this.me2meInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final SavingsAccountInfo getSavingsAccountInfo() {
        return this.savingsAccountInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final YandexAccountInfo getYandexAccountInfo() {
        return this.yandexAccountInfo;
    }

    public final PaymentMethodInfoDto copy(@Json(name = "paymentType") PaymentMethodTypeDto paymentType, @Json(name = "me2me") Me2MeInfo me2meInfo, @Json(name = "savings_account") SavingsAccountInfo savingsAccountInfo, @Json(name = "yandex_account") YandexAccountInfo yandexAccountInfo) {
        return new PaymentMethodInfoDto(paymentType, me2meInfo, savingsAccountInfo, yandexAccountInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodInfoDto)) {
            return false;
        }
        PaymentMethodInfoDto paymentMethodInfoDto = (PaymentMethodInfoDto) other;
        return this.paymentType == paymentMethodInfoDto.paymentType && jl40.l(this.me2meInfo, paymentMethodInfoDto.me2meInfo) && jl40.l(this.savingsAccountInfo, paymentMethodInfoDto.savingsAccountInfo) && jl40.l(this.yandexAccountInfo, paymentMethodInfoDto.yandexAccountInfo);
    }

    public final Me2MeInfo getMe2meInfo() {
        return this.me2meInfo;
    }

    public final PaymentMethodTypeDto getPaymentType() {
        return this.paymentType;
    }

    public final SavingsAccountInfo getSavingsAccountInfo() {
        return this.savingsAccountInfo;
    }

    public final YandexAccountInfo getYandexAccountInfo() {
        return this.yandexAccountInfo;
    }

    public int hashCode() {
        int hashCode = this.paymentType.hashCode() * 31;
        Me2MeInfo me2MeInfo = this.me2meInfo;
        int hashCode2 = (hashCode + (me2MeInfo == null ? 0 : me2MeInfo.hashCode())) * 31;
        SavingsAccountInfo savingsAccountInfo = this.savingsAccountInfo;
        int hashCode3 = (hashCode2 + (savingsAccountInfo == null ? 0 : savingsAccountInfo.hashCode())) * 31;
        YandexAccountInfo yandexAccountInfo = this.yandexAccountInfo;
        return hashCode3 + (yandexAccountInfo != null ? yandexAccountInfo.hashCode() : 0);
    }

    public String toString() {
        return "PaymentMethodInfoDto(paymentType=" + this.paymentType + ", me2meInfo=" + this.me2meInfo + ", savingsAccountInfo=" + this.savingsAccountInfo + ", yandexAccountInfo=" + this.yandexAccountInfo + Extension.C_BRAKE;
    }
}
