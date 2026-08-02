package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.PaymentMethodInfoDto;
import defpackage.jl40;
import java.math.BigDecimal;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupParamsDto;", "", "amount", "Ljava/math/BigDecimal;", "threshold", "paymentMethodInfo", "Lcom/ybsdk/core/common/data/network/dto/PaymentMethodInfoDto;", "autoTopupType", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupTypeRequestDto;", "autoTopupStatus", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupSwitchStatusRequestDto;", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/ybsdk/core/common/data/network/dto/PaymentMethodInfoDto;Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupTypeRequestDto;Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupSwitchStatusRequestDto;)V", "getAmount", "()Ljava/math/BigDecimal;", "getThreshold", "getPaymentMethodInfo", "()Lcom/ybsdk/core/common/data/network/dto/PaymentMethodInfoDto;", "getAutoTopupType", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupTypeRequestDto;", "getAutoTopupStatus", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupSwitchStatusRequestDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoTopupParamsDto {
    private final BigDecimal amount;
    private final AutoTopupSwitchStatusRequestDto autoTopupStatus;
    private final AutoTopupTypeRequestDto autoTopupType;
    private final PaymentMethodInfoDto paymentMethodInfo;
    private final BigDecimal threshold;

    public AutoTopupParamsDto(@Json(name = "money") BigDecimal bigDecimal, @Json(name = "threshold") BigDecimal bigDecimal2, @Json(name = "paymentMethodInfo") PaymentMethodInfoDto paymentMethodInfoDto, @Json(name = "autoTopupType") AutoTopupTypeRequestDto autoTopupTypeRequestDto, @Json(name = "autotopupStatus") AutoTopupSwitchStatusRequestDto autoTopupSwitchStatusRequestDto) {
        this.amount = bigDecimal;
        this.threshold = bigDecimal2;
        this.paymentMethodInfo = paymentMethodInfoDto;
        this.autoTopupType = autoTopupTypeRequestDto;
        this.autoTopupStatus = autoTopupSwitchStatusRequestDto;
    }

    public static /* synthetic */ AutoTopupParamsDto copy$default(AutoTopupParamsDto autoTopupParamsDto, BigDecimal bigDecimal, BigDecimal bigDecimal2, PaymentMethodInfoDto paymentMethodInfoDto, AutoTopupTypeRequestDto autoTopupTypeRequestDto, AutoTopupSwitchStatusRequestDto autoTopupSwitchStatusRequestDto, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = autoTopupParamsDto.amount;
        }
        if ((i & 2) != 0) {
            bigDecimal2 = autoTopupParamsDto.threshold;
        }
        if ((i & 4) != 0) {
            paymentMethodInfoDto = autoTopupParamsDto.paymentMethodInfo;
        }
        if ((i & 8) != 0) {
            autoTopupTypeRequestDto = autoTopupParamsDto.autoTopupType;
        }
        if ((i & 16) != 0) {
            autoTopupSwitchStatusRequestDto = autoTopupParamsDto.autoTopupStatus;
        }
        AutoTopupSwitchStatusRequestDto autoTopupSwitchStatusRequestDto2 = autoTopupSwitchStatusRequestDto;
        PaymentMethodInfoDto paymentMethodInfoDto2 = paymentMethodInfoDto;
        return autoTopupParamsDto.copy(bigDecimal, bigDecimal2, paymentMethodInfoDto2, autoTopupTypeRequestDto, autoTopupSwitchStatusRequestDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getThreshold() {
        return this.threshold;
    }

    /* renamed from: component3, reason: from getter */
    public final PaymentMethodInfoDto getPaymentMethodInfo() {
        return this.paymentMethodInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final AutoTopupTypeRequestDto getAutoTopupType() {
        return this.autoTopupType;
    }

    /* renamed from: component5, reason: from getter */
    public final AutoTopupSwitchStatusRequestDto getAutoTopupStatus() {
        return this.autoTopupStatus;
    }

    public final AutoTopupParamsDto copy(@Json(name = "money") BigDecimal amount, @Json(name = "threshold") BigDecimal threshold, @Json(name = "paymentMethodInfo") PaymentMethodInfoDto paymentMethodInfo, @Json(name = "autoTopupType") AutoTopupTypeRequestDto autoTopupType, @Json(name = "autotopupStatus") AutoTopupSwitchStatusRequestDto autoTopupStatus) {
        return new AutoTopupParamsDto(amount, threshold, paymentMethodInfo, autoTopupType, autoTopupStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoTopupParamsDto)) {
            return false;
        }
        AutoTopupParamsDto autoTopupParamsDto = (AutoTopupParamsDto) other;
        return jl40.l(this.amount, autoTopupParamsDto.amount) && jl40.l(this.threshold, autoTopupParamsDto.threshold) && jl40.l(this.paymentMethodInfo, autoTopupParamsDto.paymentMethodInfo) && this.autoTopupType == autoTopupParamsDto.autoTopupType && this.autoTopupStatus == autoTopupParamsDto.autoTopupStatus;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final AutoTopupSwitchStatusRequestDto getAutoTopupStatus() {
        return this.autoTopupStatus;
    }

    public final AutoTopupTypeRequestDto getAutoTopupType() {
        return this.autoTopupType;
    }

    public final PaymentMethodInfoDto getPaymentMethodInfo() {
        return this.paymentMethodInfo;
    }

    public final BigDecimal getThreshold() {
        return this.threshold;
    }

    public int hashCode() {
        int hashCode = this.amount.hashCode() * 31;
        BigDecimal bigDecimal = this.threshold;
        int hashCode2 = (this.paymentMethodInfo.hashCode() + ((hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31)) * 31;
        AutoTopupTypeRequestDto autoTopupTypeRequestDto = this.autoTopupType;
        int hashCode3 = (hashCode2 + (autoTopupTypeRequestDto == null ? 0 : autoTopupTypeRequestDto.hashCode())) * 31;
        AutoTopupSwitchStatusRequestDto autoTopupSwitchStatusRequestDto = this.autoTopupStatus;
        return hashCode3 + (autoTopupSwitchStatusRequestDto != null ? autoTopupSwitchStatusRequestDto.hashCode() : 0);
    }

    public String toString() {
        return "AutoTopupParamsDto(amount=" + this.amount + ", threshold=" + this.threshold + ", paymentMethodInfo=" + this.paymentMethodInfo + ", autoTopupType=" + this.autoTopupType + ", autoTopupStatus=" + this.autoTopupStatus + Extension.C_BRAKE;
    }
}
