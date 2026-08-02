package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.PaymentMethodInfoDto;
import defpackage.jl40;
import java.math.BigDecimal;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/DraftAutoTopupParamsDto;", "", "autoTopupType", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupTypeRequestDto;", "money", "Ljava/math/BigDecimal;", "threshold", "paymentMethodInfo", "Lcom/ybsdk/core/common/data/network/dto/PaymentMethodInfoDto;", "<init>", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupTypeRequestDto;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/ybsdk/core/common/data/network/dto/PaymentMethodInfoDto;)V", "getAutoTopupType", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupTypeRequestDto;", "getMoney", "()Ljava/math/BigDecimal;", "getThreshold", "getPaymentMethodInfo", "()Lcom/ybsdk/core/common/data/network/dto/PaymentMethodInfoDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DraftAutoTopupParamsDto {
    private final AutoTopupTypeRequestDto autoTopupType;
    private final BigDecimal money;
    private final PaymentMethodInfoDto paymentMethodInfo;
    private final BigDecimal threshold;

    public DraftAutoTopupParamsDto(@Json(name = "autoTopupType") AutoTopupTypeRequestDto autoTopupTypeRequestDto, @Json(name = "money") BigDecimal bigDecimal, @Json(name = "threshold") BigDecimal bigDecimal2, @Json(name = "paymentMethodInfo") PaymentMethodInfoDto paymentMethodInfoDto) {
        this.autoTopupType = autoTopupTypeRequestDto;
        this.money = bigDecimal;
        this.threshold = bigDecimal2;
        this.paymentMethodInfo = paymentMethodInfoDto;
    }

    public static /* synthetic */ DraftAutoTopupParamsDto copy$default(DraftAutoTopupParamsDto draftAutoTopupParamsDto, AutoTopupTypeRequestDto autoTopupTypeRequestDto, BigDecimal bigDecimal, BigDecimal bigDecimal2, PaymentMethodInfoDto paymentMethodInfoDto, int i, Object obj) {
        if ((i & 1) != 0) {
            autoTopupTypeRequestDto = draftAutoTopupParamsDto.autoTopupType;
        }
        if ((i & 2) != 0) {
            bigDecimal = draftAutoTopupParamsDto.money;
        }
        if ((i & 4) != 0) {
            bigDecimal2 = draftAutoTopupParamsDto.threshold;
        }
        if ((i & 8) != 0) {
            paymentMethodInfoDto = draftAutoTopupParamsDto.paymentMethodInfo;
        }
        return draftAutoTopupParamsDto.copy(autoTopupTypeRequestDto, bigDecimal, bigDecimal2, paymentMethodInfoDto);
    }

    /* renamed from: component1, reason: from getter */
    public final AutoTopupTypeRequestDto getAutoTopupType() {
        return this.autoTopupType;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getMoney() {
        return this.money;
    }

    /* renamed from: component3, reason: from getter */
    public final BigDecimal getThreshold() {
        return this.threshold;
    }

    /* renamed from: component4, reason: from getter */
    public final PaymentMethodInfoDto getPaymentMethodInfo() {
        return this.paymentMethodInfo;
    }

    public final DraftAutoTopupParamsDto copy(@Json(name = "autoTopupType") AutoTopupTypeRequestDto autoTopupType, @Json(name = "money") BigDecimal money, @Json(name = "threshold") BigDecimal threshold, @Json(name = "paymentMethodInfo") PaymentMethodInfoDto paymentMethodInfo) {
        return new DraftAutoTopupParamsDto(autoTopupType, money, threshold, paymentMethodInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DraftAutoTopupParamsDto)) {
            return false;
        }
        DraftAutoTopupParamsDto draftAutoTopupParamsDto = (DraftAutoTopupParamsDto) other;
        return this.autoTopupType == draftAutoTopupParamsDto.autoTopupType && jl40.l(this.money, draftAutoTopupParamsDto.money) && jl40.l(this.threshold, draftAutoTopupParamsDto.threshold) && jl40.l(this.paymentMethodInfo, draftAutoTopupParamsDto.paymentMethodInfo);
    }

    public final AutoTopupTypeRequestDto getAutoTopupType() {
        return this.autoTopupType;
    }

    public final BigDecimal getMoney() {
        return this.money;
    }

    public final PaymentMethodInfoDto getPaymentMethodInfo() {
        return this.paymentMethodInfo;
    }

    public final BigDecimal getThreshold() {
        return this.threshold;
    }

    public int hashCode() {
        int hashCode = this.autoTopupType.hashCode() * 31;
        BigDecimal bigDecimal = this.money;
        int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.threshold;
        int hashCode3 = (hashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        PaymentMethodInfoDto paymentMethodInfoDto = this.paymentMethodInfo;
        return hashCode3 + (paymentMethodInfoDto != null ? paymentMethodInfoDto.hashCode() : 0);
    }

    public String toString() {
        return "DraftAutoTopupParamsDto(autoTopupType=" + this.autoTopupType + ", money=" + this.money + ", threshold=" + this.threshold + ", paymentMethodInfo=" + this.paymentMethodInfo + Extension.C_BRAKE;
    }
}
