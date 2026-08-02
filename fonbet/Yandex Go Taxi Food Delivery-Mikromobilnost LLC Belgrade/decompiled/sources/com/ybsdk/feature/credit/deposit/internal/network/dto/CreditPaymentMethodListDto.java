package com.ybsdk.feature.credit.deposit.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CreditPaymentMethodListDto;", "", "paymentMethods", "", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/PaymentMethodSheetItemDto;", "additionalButtons", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CreditAdditionalButtonDto;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getPaymentMethods", "()Ljava/util/List;", "getAdditionalButtons", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-credit-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreditPaymentMethodListDto {
    private final List<CreditAdditionalButtonDto> additionalButtons;
    private final List<PaymentMethodSheetItemDto> paymentMethods;

    public /* synthetic */ CreditPaymentMethodListDto(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreditPaymentMethodListDto copy$default(CreditPaymentMethodListDto creditPaymentMethodListDto, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = creditPaymentMethodListDto.paymentMethods;
        }
        if ((i & 2) != 0) {
            list2 = creditPaymentMethodListDto.additionalButtons;
        }
        return creditPaymentMethodListDto.copy(list, list2);
    }

    public final List<PaymentMethodSheetItemDto> component1() {
        return this.paymentMethods;
    }

    public final List<CreditAdditionalButtonDto> component2() {
        return this.additionalButtons;
    }

    public final CreditPaymentMethodListDto copy(@Json(name = "payment_methods") List<PaymentMethodSheetItemDto> paymentMethods, @Json(name = "additional_buttons") List<CreditAdditionalButtonDto> additionalButtons) {
        return new CreditPaymentMethodListDto(paymentMethods, additionalButtons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditPaymentMethodListDto)) {
            return false;
        }
        CreditPaymentMethodListDto creditPaymentMethodListDto = (CreditPaymentMethodListDto) other;
        return jl40.l(this.paymentMethods, creditPaymentMethodListDto.paymentMethods) && jl40.l(this.additionalButtons, creditPaymentMethodListDto.additionalButtons);
    }

    public final List<CreditAdditionalButtonDto> getAdditionalButtons() {
        return this.additionalButtons;
    }

    public final List<PaymentMethodSheetItemDto> getPaymentMethods() {
        return this.paymentMethods;
    }

    public int hashCode() {
        int hashCode = this.paymentMethods.hashCode() * 31;
        List<CreditAdditionalButtonDto> list = this.additionalButtons;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return xvz.l("CreditPaymentMethodListDto(paymentMethods=", this.paymentMethods, ", additionalButtons=", this.additionalButtons, Extension.C_BRAKE);
    }

    public CreditPaymentMethodListDto(@Json(name = "payment_methods") List<PaymentMethodSheetItemDto> list, @Json(name = "additional_buttons") List<CreditAdditionalButtonDto> list2) {
        this.paymentMethods = list;
        this.additionalButtons = list2;
    }
}
