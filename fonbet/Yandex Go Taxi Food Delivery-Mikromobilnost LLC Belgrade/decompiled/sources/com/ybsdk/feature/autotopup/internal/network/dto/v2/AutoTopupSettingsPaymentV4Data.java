package com.ybsdk.feature.autotopup.internal.network.dto.v2;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.PaymentMethodsListDto;
import com.ybsdk.feature.autotopup.internal.network.dto.SavingsNoticeDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsPaymentV4Data;", "", "paymentMethodList", "Lcom/ybsdk/core/common/data/network/dto/PaymentMethodsListDto;", "savingNotice", "Lcom/ybsdk/feature/autotopup/internal/network/dto/SavingsNoticeDto;", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/PaymentMethodsListDto;Lcom/ybsdk/feature/autotopup/internal/network/dto/SavingsNoticeDto;)V", "getPaymentMethodList", "()Lcom/ybsdk/core/common/data/network/dto/PaymentMethodsListDto;", "getSavingNotice", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/SavingsNoticeDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoTopupSettingsPaymentV4Data {
    private final PaymentMethodsListDto paymentMethodList;
    private final SavingsNoticeDto savingNotice;

    public AutoTopupSettingsPaymentV4Data(@Json(name = "payment_methods_list") PaymentMethodsListDto paymentMethodsListDto, @Json(name = "savings_notice") SavingsNoticeDto savingsNoticeDto) {
        this.paymentMethodList = paymentMethodsListDto;
        this.savingNotice = savingsNoticeDto;
    }

    public static /* synthetic */ AutoTopupSettingsPaymentV4Data copy$default(AutoTopupSettingsPaymentV4Data autoTopupSettingsPaymentV4Data, PaymentMethodsListDto paymentMethodsListDto, SavingsNoticeDto savingsNoticeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentMethodsListDto = autoTopupSettingsPaymentV4Data.paymentMethodList;
        }
        if ((i & 2) != 0) {
            savingsNoticeDto = autoTopupSettingsPaymentV4Data.savingNotice;
        }
        return autoTopupSettingsPaymentV4Data.copy(paymentMethodsListDto, savingsNoticeDto);
    }

    /* renamed from: component1, reason: from getter */
    public final PaymentMethodsListDto getPaymentMethodList() {
        return this.paymentMethodList;
    }

    /* renamed from: component2, reason: from getter */
    public final SavingsNoticeDto getSavingNotice() {
        return this.savingNotice;
    }

    public final AutoTopupSettingsPaymentV4Data copy(@Json(name = "payment_methods_list") PaymentMethodsListDto paymentMethodList, @Json(name = "savings_notice") SavingsNoticeDto savingNotice) {
        return new AutoTopupSettingsPaymentV4Data(paymentMethodList, savingNotice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoTopupSettingsPaymentV4Data)) {
            return false;
        }
        AutoTopupSettingsPaymentV4Data autoTopupSettingsPaymentV4Data = (AutoTopupSettingsPaymentV4Data) other;
        return jl40.l(this.paymentMethodList, autoTopupSettingsPaymentV4Data.paymentMethodList) && jl40.l(this.savingNotice, autoTopupSettingsPaymentV4Data.savingNotice);
    }

    public final PaymentMethodsListDto getPaymentMethodList() {
        return this.paymentMethodList;
    }

    public final SavingsNoticeDto getSavingNotice() {
        return this.savingNotice;
    }

    public int hashCode() {
        int hashCode = this.paymentMethodList.hashCode() * 31;
        SavingsNoticeDto savingsNoticeDto = this.savingNotice;
        return hashCode + (savingsNoticeDto == null ? 0 : savingsNoticeDto.hashCode());
    }

    public String toString() {
        return "AutoTopupSettingsPaymentV4Data(paymentMethodList=" + this.paymentMethodList + ", savingNotice=" + this.savingNotice + Extension.C_BRAKE;
    }
}
