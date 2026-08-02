package com.ybsdk.core.common.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/PaymentMethodsListDto;", "", "paymentMethods", "", "Lcom/ybsdk/core/common/data/network/dto/PaymentMethodDto;", "additionalButtons", "Lcom/ybsdk/core/common/data/network/dto/AdditionalButtonDto;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getPaymentMethods", "()Ljava/util/List;", "getAdditionalButtons", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PaymentMethodsListDto {
    private final List<AdditionalButtonDto> additionalButtons;
    private final List<PaymentMethodDto> paymentMethods;

    public PaymentMethodsListDto(@Json(name = "payment_methods") List<PaymentMethodDto> list, @Json(name = "additional_buttons") List<AdditionalButtonDto> list2) {
        this.paymentMethods = list;
        this.additionalButtons = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentMethodsListDto copy$default(PaymentMethodsListDto paymentMethodsListDto, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = paymentMethodsListDto.paymentMethods;
        }
        if ((i & 2) != 0) {
            list2 = paymentMethodsListDto.additionalButtons;
        }
        return paymentMethodsListDto.copy(list, list2);
    }

    public final List<PaymentMethodDto> component1() {
        return this.paymentMethods;
    }

    public final List<AdditionalButtonDto> component2() {
        return this.additionalButtons;
    }

    public final PaymentMethodsListDto copy(@Json(name = "payment_methods") List<PaymentMethodDto> paymentMethods, @Json(name = "additional_buttons") List<AdditionalButtonDto> additionalButtons) {
        return new PaymentMethodsListDto(paymentMethods, additionalButtons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodsListDto)) {
            return false;
        }
        PaymentMethodsListDto paymentMethodsListDto = (PaymentMethodsListDto) other;
        return jl40.l(this.paymentMethods, paymentMethodsListDto.paymentMethods) && jl40.l(this.additionalButtons, paymentMethodsListDto.additionalButtons);
    }

    public final List<AdditionalButtonDto> getAdditionalButtons() {
        return this.additionalButtons;
    }

    public final List<PaymentMethodDto> getPaymentMethods() {
        return this.paymentMethods;
    }

    public int hashCode() {
        return this.additionalButtons.hashCode() + (this.paymentMethods.hashCode() * 31);
    }

    public String toString() {
        return xvz.l("PaymentMethodsListDto(paymentMethods=", this.paymentMethods, ", additionalButtons=", this.additionalButtons, Extension.C_BRAKE);
    }
}
