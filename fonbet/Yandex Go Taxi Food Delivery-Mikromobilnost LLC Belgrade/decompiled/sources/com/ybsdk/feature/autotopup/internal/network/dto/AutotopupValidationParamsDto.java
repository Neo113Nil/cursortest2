package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/AutotopupValidationParamsDto;", "", "autotopupStatus", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupSwitchStatusRequestDto;", "autotopupParams", "Lcom/ybsdk/feature/autotopup/internal/network/dto/DraftAutoTopupParamsDto;", "<init>", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupSwitchStatusRequestDto;Lcom/ybsdk/feature/autotopup/internal/network/dto/DraftAutoTopupParamsDto;)V", "getAutotopupStatus", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupSwitchStatusRequestDto;", "getAutotopupParams", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/DraftAutoTopupParamsDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutotopupValidationParamsDto {
    private final DraftAutoTopupParamsDto autotopupParams;
    private final AutoTopupSwitchStatusRequestDto autotopupStatus;

    public AutotopupValidationParamsDto(@Json(name = "status") AutoTopupSwitchStatusRequestDto autoTopupSwitchStatusRequestDto, @Json(name = "params") DraftAutoTopupParamsDto draftAutoTopupParamsDto) {
        this.autotopupStatus = autoTopupSwitchStatusRequestDto;
        this.autotopupParams = draftAutoTopupParamsDto;
    }

    public static /* synthetic */ AutotopupValidationParamsDto copy$default(AutotopupValidationParamsDto autotopupValidationParamsDto, AutoTopupSwitchStatusRequestDto autoTopupSwitchStatusRequestDto, DraftAutoTopupParamsDto draftAutoTopupParamsDto, int i, Object obj) {
        if ((i & 1) != 0) {
            autoTopupSwitchStatusRequestDto = autotopupValidationParamsDto.autotopupStatus;
        }
        if ((i & 2) != 0) {
            draftAutoTopupParamsDto = autotopupValidationParamsDto.autotopupParams;
        }
        return autotopupValidationParamsDto.copy(autoTopupSwitchStatusRequestDto, draftAutoTopupParamsDto);
    }

    /* renamed from: component1, reason: from getter */
    public final AutoTopupSwitchStatusRequestDto getAutotopupStatus() {
        return this.autotopupStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final DraftAutoTopupParamsDto getAutotopupParams() {
        return this.autotopupParams;
    }

    public final AutotopupValidationParamsDto copy(@Json(name = "status") AutoTopupSwitchStatusRequestDto autotopupStatus, @Json(name = "params") DraftAutoTopupParamsDto autotopupParams) {
        return new AutotopupValidationParamsDto(autotopupStatus, autotopupParams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutotopupValidationParamsDto)) {
            return false;
        }
        AutotopupValidationParamsDto autotopupValidationParamsDto = (AutotopupValidationParamsDto) other;
        return this.autotopupStatus == autotopupValidationParamsDto.autotopupStatus && jl40.l(this.autotopupParams, autotopupValidationParamsDto.autotopupParams);
    }

    public final DraftAutoTopupParamsDto getAutotopupParams() {
        return this.autotopupParams;
    }

    public final AutoTopupSwitchStatusRequestDto getAutotopupStatus() {
        return this.autotopupStatus;
    }

    public int hashCode() {
        return this.autotopupParams.hashCode() + (this.autotopupStatus.hashCode() * 31);
    }

    public String toString() {
        return "AutotopupValidationParamsDto(autotopupStatus=" + this.autotopupStatus + ", autotopupParams=" + this.autotopupParams + Extension.C_BRAKE;
    }
}
