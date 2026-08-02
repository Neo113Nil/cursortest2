package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/ValidateAutoTopupRequest;", "", "agreementId", "", "autotopupParams", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutotopupValidationParamsDto;", "autofundParams", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutofundValidationParamsDto;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/autotopup/internal/network/dto/AutotopupValidationParamsDto;Lcom/ybsdk/feature/autotopup/internal/network/dto/AutofundValidationParamsDto;)V", "getAgreementId", "()Ljava/lang/String;", "getAutotopupParams", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/AutotopupValidationParamsDto;", "getAutofundParams", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/AutofundValidationParamsDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ValidateAutoTopupRequest {
    private final String agreementId;
    private final AutofundValidationParamsDto autofundParams;
    private final AutotopupValidationParamsDto autotopupParams;

    public ValidateAutoTopupRequest(@Json(name = "agreement_id") String str, @Json(name = "autotopup_params") AutotopupValidationParamsDto autotopupValidationParamsDto, @Json(name = "autofund_params") AutofundValidationParamsDto autofundValidationParamsDto) {
        this.agreementId = str;
        this.autotopupParams = autotopupValidationParamsDto;
        this.autofundParams = autofundValidationParamsDto;
    }

    public static /* synthetic */ ValidateAutoTopupRequest copy$default(ValidateAutoTopupRequest validateAutoTopupRequest, String str, AutotopupValidationParamsDto autotopupValidationParamsDto, AutofundValidationParamsDto autofundValidationParamsDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = validateAutoTopupRequest.agreementId;
        }
        if ((i & 2) != 0) {
            autotopupValidationParamsDto = validateAutoTopupRequest.autotopupParams;
        }
        if ((i & 4) != 0) {
            autofundValidationParamsDto = validateAutoTopupRequest.autofundParams;
        }
        return validateAutoTopupRequest.copy(str, autotopupValidationParamsDto, autofundValidationParamsDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final AutotopupValidationParamsDto getAutotopupParams() {
        return this.autotopupParams;
    }

    /* renamed from: component3, reason: from getter */
    public final AutofundValidationParamsDto getAutofundParams() {
        return this.autofundParams;
    }

    public final ValidateAutoTopupRequest copy(@Json(name = "agreement_id") String agreementId, @Json(name = "autotopup_params") AutotopupValidationParamsDto autotopupParams, @Json(name = "autofund_params") AutofundValidationParamsDto autofundParams) {
        return new ValidateAutoTopupRequest(agreementId, autotopupParams, autofundParams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValidateAutoTopupRequest)) {
            return false;
        }
        ValidateAutoTopupRequest validateAutoTopupRequest = (ValidateAutoTopupRequest) other;
        return jl40.l(this.agreementId, validateAutoTopupRequest.agreementId) && jl40.l(this.autotopupParams, validateAutoTopupRequest.autotopupParams) && jl40.l(this.autofundParams, validateAutoTopupRequest.autofundParams);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final AutofundValidationParamsDto getAutofundParams() {
        return this.autofundParams;
    }

    public final AutotopupValidationParamsDto getAutotopupParams() {
        return this.autotopupParams;
    }

    public int hashCode() {
        int hashCode = (this.autotopupParams.hashCode() + (this.agreementId.hashCode() * 31)) * 31;
        AutofundValidationParamsDto autofundValidationParamsDto = this.autofundParams;
        return hashCode + (autofundValidationParamsDto == null ? 0 : autofundValidationParamsDto.hashCode());
    }

    public String toString() {
        return "ValidateAutoTopupRequest(agreementId=" + this.agreementId + ", autotopupParams=" + this.autotopupParams + ", autofundParams=" + this.autofundParams + Extension.C_BRAKE;
    }
}
