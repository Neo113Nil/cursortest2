package com.ybsdk.feature.autotopup.api.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.PaymentMethodTypeDto;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/autotopup/api/dto/PaymentMethodInfoDto;", "", "type", "Lcom/ybsdk/core/common/data/network/dto/PaymentMethodTypeDto;", "paymentMethodId", "", "ybId", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/PaymentMethodTypeDto;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Lcom/ybsdk/core/common/data/network/dto/PaymentMethodTypeDto;", "getPaymentMethodId", "()Ljava/lang/String;", "getYbId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-autotopup-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PaymentMethodInfoDto {
    private final String paymentMethodId;
    private final PaymentMethodTypeDto type;
    private final String ybId;

    public PaymentMethodInfoDto(@Json(name = "type") PaymentMethodTypeDto paymentMethodTypeDto, @Json(name = "payment_method_id") String str, @Json(name = "JSON_FIELD_MEMBER_ID") String str2) {
        this.type = paymentMethodTypeDto;
        this.paymentMethodId = str;
        this.ybId = str2;
    }

    public static /* synthetic */ PaymentMethodInfoDto copy$default(PaymentMethodInfoDto paymentMethodInfoDto, PaymentMethodTypeDto paymentMethodTypeDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentMethodTypeDto = paymentMethodInfoDto.type;
        }
        if ((i & 2) != 0) {
            str = paymentMethodInfoDto.paymentMethodId;
        }
        if ((i & 4) != 0) {
            str2 = paymentMethodInfoDto.ybId;
        }
        return paymentMethodInfoDto.copy(paymentMethodTypeDto, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final PaymentMethodTypeDto getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getYbId() {
        return this.ybId;
    }

    public final PaymentMethodInfoDto copy(@Json(name = "type") PaymentMethodTypeDto type, @Json(name = "payment_method_id") String paymentMethodId, @Json(name = "JSON_FIELD_MEMBER_ID") String ybId) {
        return new PaymentMethodInfoDto(type, paymentMethodId, ybId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodInfoDto)) {
            return false;
        }
        PaymentMethodInfoDto paymentMethodInfoDto = (PaymentMethodInfoDto) other;
        return this.type == paymentMethodInfoDto.type && jl40.l(this.paymentMethodId, paymentMethodInfoDto.paymentMethodId) && jl40.l(this.ybId, paymentMethodInfoDto.ybId);
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final PaymentMethodTypeDto getType() {
        return this.type;
    }

    public final String getYbId() {
        return this.ybId;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.paymentMethodId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.ybId;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        PaymentMethodTypeDto paymentMethodTypeDto = this.type;
        String str = this.paymentMethodId;
        String str2 = this.ybId;
        StringBuilder sb = new StringBuilder("PaymentMethodInfoDto(type=");
        sb.append(paymentMethodTypeDto);
        sb.append(", paymentMethodId=");
        sb.append(str);
        sb.append(", ybId=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }
}
