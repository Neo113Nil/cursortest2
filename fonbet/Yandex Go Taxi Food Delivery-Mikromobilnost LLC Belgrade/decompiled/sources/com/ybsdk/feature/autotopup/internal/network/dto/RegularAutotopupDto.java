package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.PaymentMethodInfoDto;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.RegularAutotopupStatusDto;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.SelectedRegularAutotopupOptionDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/RegularAutotopupDto;", "", ACSPConstants.STATUS, "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupStatusDto;", "paymentMethod", "Lcom/ybsdk/core/common/data/network/dto/PaymentMethodInfoDto;", "selectedOption", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SelectedRegularAutotopupOptionDto;", "<init>", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupStatusDto;Lcom/ybsdk/core/common/data/network/dto/PaymentMethodInfoDto;Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SelectedRegularAutotopupOptionDto;)V", "getStatus", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupStatusDto;", "getPaymentMethod", "()Lcom/ybsdk/core/common/data/network/dto/PaymentMethodInfoDto;", "getSelectedOption", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SelectedRegularAutotopupOptionDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RegularAutotopupDto {
    private final PaymentMethodInfoDto paymentMethod;
    private final SelectedRegularAutotopupOptionDto selectedOption;
    private final RegularAutotopupStatusDto status;

    public RegularAutotopupDto(@Json(name = "status") RegularAutotopupStatusDto regularAutotopupStatusDto, @Json(name = "payment_method") PaymentMethodInfoDto paymentMethodInfoDto, @Json(name = "selected_option") SelectedRegularAutotopupOptionDto selectedRegularAutotopupOptionDto) {
        this.status = regularAutotopupStatusDto;
        this.paymentMethod = paymentMethodInfoDto;
        this.selectedOption = selectedRegularAutotopupOptionDto;
    }

    public static /* synthetic */ RegularAutotopupDto copy$default(RegularAutotopupDto regularAutotopupDto, RegularAutotopupStatusDto regularAutotopupStatusDto, PaymentMethodInfoDto paymentMethodInfoDto, SelectedRegularAutotopupOptionDto selectedRegularAutotopupOptionDto, int i, Object obj) {
        if ((i & 1) != 0) {
            regularAutotopupStatusDto = regularAutotopupDto.status;
        }
        if ((i & 2) != 0) {
            paymentMethodInfoDto = regularAutotopupDto.paymentMethod;
        }
        if ((i & 4) != 0) {
            selectedRegularAutotopupOptionDto = regularAutotopupDto.selectedOption;
        }
        return regularAutotopupDto.copy(regularAutotopupStatusDto, paymentMethodInfoDto, selectedRegularAutotopupOptionDto);
    }

    /* renamed from: component1, reason: from getter */
    public final RegularAutotopupStatusDto getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final PaymentMethodInfoDto getPaymentMethod() {
        return this.paymentMethod;
    }

    /* renamed from: component3, reason: from getter */
    public final SelectedRegularAutotopupOptionDto getSelectedOption() {
        return this.selectedOption;
    }

    public final RegularAutotopupDto copy(@Json(name = "status") RegularAutotopupStatusDto status, @Json(name = "payment_method") PaymentMethodInfoDto paymentMethod, @Json(name = "selected_option") SelectedRegularAutotopupOptionDto selectedOption) {
        return new RegularAutotopupDto(status, paymentMethod, selectedOption);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegularAutotopupDto)) {
            return false;
        }
        RegularAutotopupDto regularAutotopupDto = (RegularAutotopupDto) other;
        return this.status == regularAutotopupDto.status && jl40.l(this.paymentMethod, regularAutotopupDto.paymentMethod) && jl40.l(this.selectedOption, regularAutotopupDto.selectedOption);
    }

    public final PaymentMethodInfoDto getPaymentMethod() {
        return this.paymentMethod;
    }

    public final SelectedRegularAutotopupOptionDto getSelectedOption() {
        return this.selectedOption;
    }

    public final RegularAutotopupStatusDto getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.selectedOption.hashCode() + ((this.paymentMethod.hashCode() + (this.status.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "RegularAutotopupDto(status=" + this.status + ", paymentMethod=" + this.paymentMethod + ", selectedOption=" + this.selectedOption + Extension.C_BRAKE;
    }
}
