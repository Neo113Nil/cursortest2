package com.ybsdk.feature.autotopup.internal.network.dto.regular;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.PaymentMethodInfoDto;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutoTopupSaveRequest;", "", ACSPConstants.STATUS, "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupStatusDto;", "selectedOption", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SaveSelectedRegularAutotopupOptionDto;", "agreementId", "", "paymentMethod", "Lcom/ybsdk/core/common/data/network/dto/PaymentMethodInfoDto;", "<init>", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupStatusDto;Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SaveSelectedRegularAutotopupOptionDto;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/PaymentMethodInfoDto;)V", "getStatus", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupStatusDto;", "getSelectedOption", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SaveSelectedRegularAutotopupOptionDto;", "getAgreementId", "()Ljava/lang/String;", "getPaymentMethod", "()Lcom/ybsdk/core/common/data/network/dto/PaymentMethodInfoDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RegularAutoTopupSaveRequest {
    private final String agreementId;
    private final PaymentMethodInfoDto paymentMethod;
    private final SaveSelectedRegularAutotopupOptionDto selectedOption;
    private final RegularAutotopupStatusDto status;

    public RegularAutoTopupSaveRequest(@Json(name = "status") RegularAutotopupStatusDto regularAutotopupStatusDto, @Json(name = "selected_option") SaveSelectedRegularAutotopupOptionDto saveSelectedRegularAutotopupOptionDto, @Json(name = "agreement_id") String str, @Json(name = "payment_method") PaymentMethodInfoDto paymentMethodInfoDto) {
        this.status = regularAutotopupStatusDto;
        this.selectedOption = saveSelectedRegularAutotopupOptionDto;
        this.agreementId = str;
        this.paymentMethod = paymentMethodInfoDto;
    }

    public static /* synthetic */ RegularAutoTopupSaveRequest copy$default(RegularAutoTopupSaveRequest regularAutoTopupSaveRequest, RegularAutotopupStatusDto regularAutotopupStatusDto, SaveSelectedRegularAutotopupOptionDto saveSelectedRegularAutotopupOptionDto, String str, PaymentMethodInfoDto paymentMethodInfoDto, int i, Object obj) {
        if ((i & 1) != 0) {
            regularAutotopupStatusDto = regularAutoTopupSaveRequest.status;
        }
        if ((i & 2) != 0) {
            saveSelectedRegularAutotopupOptionDto = regularAutoTopupSaveRequest.selectedOption;
        }
        if ((i & 4) != 0) {
            str = regularAutoTopupSaveRequest.agreementId;
        }
        if ((i & 8) != 0) {
            paymentMethodInfoDto = regularAutoTopupSaveRequest.paymentMethod;
        }
        return regularAutoTopupSaveRequest.copy(regularAutotopupStatusDto, saveSelectedRegularAutotopupOptionDto, str, paymentMethodInfoDto);
    }

    /* renamed from: component1, reason: from getter */
    public final RegularAutotopupStatusDto getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final SaveSelectedRegularAutotopupOptionDto getSelectedOption() {
        return this.selectedOption;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component4, reason: from getter */
    public final PaymentMethodInfoDto getPaymentMethod() {
        return this.paymentMethod;
    }

    public final RegularAutoTopupSaveRequest copy(@Json(name = "status") RegularAutotopupStatusDto status, @Json(name = "selected_option") SaveSelectedRegularAutotopupOptionDto selectedOption, @Json(name = "agreement_id") String agreementId, @Json(name = "payment_method") PaymentMethodInfoDto paymentMethod) {
        return new RegularAutoTopupSaveRequest(status, selectedOption, agreementId, paymentMethod);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegularAutoTopupSaveRequest)) {
            return false;
        }
        RegularAutoTopupSaveRequest regularAutoTopupSaveRequest = (RegularAutoTopupSaveRequest) other;
        return this.status == regularAutoTopupSaveRequest.status && jl40.l(this.selectedOption, regularAutoTopupSaveRequest.selectedOption) && jl40.l(this.agreementId, regularAutoTopupSaveRequest.agreementId) && jl40.l(this.paymentMethod, regularAutoTopupSaveRequest.paymentMethod);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final PaymentMethodInfoDto getPaymentMethod() {
        return this.paymentMethod;
    }

    public final SaveSelectedRegularAutotopupOptionDto getSelectedOption() {
        return this.selectedOption;
    }

    public final RegularAutotopupStatusDto getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.paymentMethod.hashCode() + unr0.b((this.selectedOption.hashCode() + (this.status.hashCode() * 31)) * 31, 31, this.agreementId);
    }

    public String toString() {
        return "RegularAutoTopupSaveRequest(status=" + this.status + ", selectedOption=" + this.selectedOption + ", agreementId=" + this.agreementId + ", paymentMethod=" + this.paymentMethod + Extension.C_BRAKE;
    }
}
