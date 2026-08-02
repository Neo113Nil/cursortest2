package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/AutofundValidationParamsDto;", "", "autofundStatus", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupSwitchStatusRequestDto;", "autofundParams", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoFundParamsDto;", "<init>", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupSwitchStatusRequestDto;Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoFundParamsDto;)V", "getAutofundStatus", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupSwitchStatusRequestDto;", "getAutofundParams", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoFundParamsDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutofundValidationParamsDto {
    private final AutoFundParamsDto autofundParams;
    private final AutoTopupSwitchStatusRequestDto autofundStatus;

    public AutofundValidationParamsDto(@Json(name = "status") AutoTopupSwitchStatusRequestDto autoTopupSwitchStatusRequestDto, @Json(name = "params") AutoFundParamsDto autoFundParamsDto) {
        this.autofundStatus = autoTopupSwitchStatusRequestDto;
        this.autofundParams = autoFundParamsDto;
    }

    public static /* synthetic */ AutofundValidationParamsDto copy$default(AutofundValidationParamsDto autofundValidationParamsDto, AutoTopupSwitchStatusRequestDto autoTopupSwitchStatusRequestDto, AutoFundParamsDto autoFundParamsDto, int i, Object obj) {
        if ((i & 1) != 0) {
            autoTopupSwitchStatusRequestDto = autofundValidationParamsDto.autofundStatus;
        }
        if ((i & 2) != 0) {
            autoFundParamsDto = autofundValidationParamsDto.autofundParams;
        }
        return autofundValidationParamsDto.copy(autoTopupSwitchStatusRequestDto, autoFundParamsDto);
    }

    /* renamed from: component1, reason: from getter */
    public final AutoTopupSwitchStatusRequestDto getAutofundStatus() {
        return this.autofundStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final AutoFundParamsDto getAutofundParams() {
        return this.autofundParams;
    }

    public final AutofundValidationParamsDto copy(@Json(name = "status") AutoTopupSwitchStatusRequestDto autofundStatus, @Json(name = "params") AutoFundParamsDto autofundParams) {
        return new AutofundValidationParamsDto(autofundStatus, autofundParams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutofundValidationParamsDto)) {
            return false;
        }
        AutofundValidationParamsDto autofundValidationParamsDto = (AutofundValidationParamsDto) other;
        return this.autofundStatus == autofundValidationParamsDto.autofundStatus && jl40.l(this.autofundParams, autofundValidationParamsDto.autofundParams);
    }

    public final AutoFundParamsDto getAutofundParams() {
        return this.autofundParams;
    }

    public final AutoTopupSwitchStatusRequestDto getAutofundStatus() {
        return this.autofundStatus;
    }

    public int hashCode() {
        return this.autofundParams.hashCode() + (this.autofundStatus.hashCode() * 31);
    }

    public String toString() {
        return "AutofundValidationParamsDto(autofundStatus=" + this.autofundStatus + ", autofundParams=" + this.autofundParams + Extension.C_BRAKE;
    }
}
