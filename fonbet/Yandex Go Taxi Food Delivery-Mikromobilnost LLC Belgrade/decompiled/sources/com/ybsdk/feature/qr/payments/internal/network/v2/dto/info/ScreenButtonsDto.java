package com.ybsdk.feature.qr.payments.internal.network.v2.dto.info;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ActionButtonDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/ScreenButtonsDto;", "", "selectAgreementButton", "Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "paymentButton", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;)V", "getSelectAgreementButton", "()Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "getPaymentButton", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ScreenButtonsDto {
    private final ActionButtonDto paymentButton;
    private final ActionButtonDto selectAgreementButton;

    public ScreenButtonsDto(@Json(name = "select_agreement_button") ActionButtonDto actionButtonDto, @Json(name = "payment_button") ActionButtonDto actionButtonDto2) {
        this.selectAgreementButton = actionButtonDto;
        this.paymentButton = actionButtonDto2;
    }

    public static /* synthetic */ ScreenButtonsDto copy$default(ScreenButtonsDto screenButtonsDto, ActionButtonDto actionButtonDto, ActionButtonDto actionButtonDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            actionButtonDto = screenButtonsDto.selectAgreementButton;
        }
        if ((i & 2) != 0) {
            actionButtonDto2 = screenButtonsDto.paymentButton;
        }
        return screenButtonsDto.copy(actionButtonDto, actionButtonDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final ActionButtonDto getSelectAgreementButton() {
        return this.selectAgreementButton;
    }

    /* renamed from: component2, reason: from getter */
    public final ActionButtonDto getPaymentButton() {
        return this.paymentButton;
    }

    public final ScreenButtonsDto copy(@Json(name = "select_agreement_button") ActionButtonDto selectAgreementButton, @Json(name = "payment_button") ActionButtonDto paymentButton) {
        return new ScreenButtonsDto(selectAgreementButton, paymentButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScreenButtonsDto)) {
            return false;
        }
        ScreenButtonsDto screenButtonsDto = (ScreenButtonsDto) other;
        return jl40.l(this.selectAgreementButton, screenButtonsDto.selectAgreementButton) && jl40.l(this.paymentButton, screenButtonsDto.paymentButton);
    }

    public final ActionButtonDto getPaymentButton() {
        return this.paymentButton;
    }

    public final ActionButtonDto getSelectAgreementButton() {
        return this.selectAgreementButton;
    }

    public int hashCode() {
        return this.paymentButton.hashCode() + (this.selectAgreementButton.hashCode() * 31);
    }

    public String toString() {
        return "ScreenButtonsDto(selectAgreementButton=" + this.selectAgreementButton + ", paymentButton=" + this.paymentButton + Extension.C_BRAKE;
    }
}
