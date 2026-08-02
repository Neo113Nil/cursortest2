package com.ybsdk.feature.kyc.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/kyc/internal/network/dto/ApplicationInfoResponse;", "", "errorData", "Lcom/ybsdk/feature/kyc/internal/network/dto/ErrorWithAddons;", "successData", "Lcom/ybsdk/feature/kyc/internal/network/dto/ApplicationInfoDto;", "<init>", "(Lcom/ybsdk/feature/kyc/internal/network/dto/ErrorWithAddons;Lcom/ybsdk/feature/kyc/internal/network/dto/ApplicationInfoDto;)V", "getErrorData", "()Lcom/ybsdk/feature/kyc/internal/network/dto/ErrorWithAddons;", "getSuccessData", "()Lcom/ybsdk/feature/kyc/internal/network/dto/ApplicationInfoDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-kyc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ApplicationInfoResponse {
    private final ErrorWithAddons errorData;
    private final ApplicationInfoDto successData;

    public ApplicationInfoResponse(@Json(name = "error_data") ErrorWithAddons errorWithAddons, @Json(name = "success_data") ApplicationInfoDto applicationInfoDto) {
        this.errorData = errorWithAddons;
        this.successData = applicationInfoDto;
    }

    public static /* synthetic */ ApplicationInfoResponse copy$default(ApplicationInfoResponse applicationInfoResponse, ErrorWithAddons errorWithAddons, ApplicationInfoDto applicationInfoDto, int i, Object obj) {
        if ((i & 1) != 0) {
            errorWithAddons = applicationInfoResponse.errorData;
        }
        if ((i & 2) != 0) {
            applicationInfoDto = applicationInfoResponse.successData;
        }
        return applicationInfoResponse.copy(errorWithAddons, applicationInfoDto);
    }

    /* renamed from: component1, reason: from getter */
    public final ErrorWithAddons getErrorData() {
        return this.errorData;
    }

    /* renamed from: component2, reason: from getter */
    public final ApplicationInfoDto getSuccessData() {
        return this.successData;
    }

    public final ApplicationInfoResponse copy(@Json(name = "error_data") ErrorWithAddons errorData, @Json(name = "success_data") ApplicationInfoDto successData) {
        return new ApplicationInfoResponse(errorData, successData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplicationInfoResponse)) {
            return false;
        }
        ApplicationInfoResponse applicationInfoResponse = (ApplicationInfoResponse) other;
        return jl40.l(this.errorData, applicationInfoResponse.errorData) && jl40.l(this.successData, applicationInfoResponse.successData);
    }

    public final ErrorWithAddons getErrorData() {
        return this.errorData;
    }

    public final ApplicationInfoDto getSuccessData() {
        return this.successData;
    }

    public int hashCode() {
        ErrorWithAddons errorWithAddons = this.errorData;
        int hashCode = (errorWithAddons == null ? 0 : errorWithAddons.hashCode()) * 31;
        ApplicationInfoDto applicationInfoDto = this.successData;
        return hashCode + (applicationInfoDto != null ? applicationInfoDto.hashCode() : 0);
    }

    public String toString() {
        return "ApplicationInfoResponse(errorData=" + this.errorData + ", successData=" + this.successData + Extension.C_BRAKE;
    }
}
