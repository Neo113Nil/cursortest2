package com.ybsdk.feature.divkit.internal.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.utils.dto.FailDataResponse;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/dto/DivPollingDto;", "", ACSPConstants.STATUS, "Lcom/ybsdk/feature/divkit/internal/dto/ResponseStatus;", "successData", "Lcom/ybsdk/feature/divkit/internal/dto/DivPatchDto;", "inProgressData", "failData", "Lcom/ybsdk/core/utils/dto/FailDataResponse;", "<init>", "(Lcom/ybsdk/feature/divkit/internal/dto/ResponseStatus;Lcom/ybsdk/feature/divkit/internal/dto/DivPatchDto;Lcom/ybsdk/feature/divkit/internal/dto/DivPatchDto;Lcom/ybsdk/core/utils/dto/FailDataResponse;)V", "getStatus", "()Lcom/ybsdk/feature/divkit/internal/dto/ResponseStatus;", "getSuccessData", "()Lcom/ybsdk/feature/divkit/internal/dto/DivPatchDto;", "getInProgressData", "getFailData", "()Lcom/ybsdk/core/utils/dto/FailDataResponse;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DivPollingDto {
    private final FailDataResponse failData;
    private final DivPatchDto inProgressData;
    private final ResponseStatus status;
    private final DivPatchDto successData;

    public DivPollingDto(@Json(name = "status") ResponseStatus responseStatus, @Json(name = "success_data") DivPatchDto divPatchDto, @Json(name = "in_progress_data") DivPatchDto divPatchDto2, @Json(name = "fail_data") FailDataResponse failDataResponse) {
        this.status = responseStatus;
        this.successData = divPatchDto;
        this.inProgressData = divPatchDto2;
        this.failData = failDataResponse;
    }

    public static /* synthetic */ DivPollingDto copy$default(DivPollingDto divPollingDto, ResponseStatus responseStatus, DivPatchDto divPatchDto, DivPatchDto divPatchDto2, FailDataResponse failDataResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            responseStatus = divPollingDto.status;
        }
        if ((i & 2) != 0) {
            divPatchDto = divPollingDto.successData;
        }
        if ((i & 4) != 0) {
            divPatchDto2 = divPollingDto.inProgressData;
        }
        if ((i & 8) != 0) {
            failDataResponse = divPollingDto.failData;
        }
        return divPollingDto.copy(responseStatus, divPatchDto, divPatchDto2, failDataResponse);
    }

    /* renamed from: component1, reason: from getter */
    public final ResponseStatus getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final DivPatchDto getSuccessData() {
        return this.successData;
    }

    /* renamed from: component3, reason: from getter */
    public final DivPatchDto getInProgressData() {
        return this.inProgressData;
    }

    /* renamed from: component4, reason: from getter */
    public final FailDataResponse getFailData() {
        return this.failData;
    }

    public final DivPollingDto copy(@Json(name = "status") ResponseStatus status, @Json(name = "success_data") DivPatchDto successData, @Json(name = "in_progress_data") DivPatchDto inProgressData, @Json(name = "fail_data") FailDataResponse failData) {
        return new DivPollingDto(status, successData, inProgressData, failData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DivPollingDto)) {
            return false;
        }
        DivPollingDto divPollingDto = (DivPollingDto) other;
        return this.status == divPollingDto.status && jl40.l(this.successData, divPollingDto.successData) && jl40.l(this.inProgressData, divPollingDto.inProgressData) && jl40.l(this.failData, divPollingDto.failData);
    }

    public final FailDataResponse getFailData() {
        return this.failData;
    }

    public final DivPatchDto getInProgressData() {
        return this.inProgressData;
    }

    public final ResponseStatus getStatus() {
        return this.status;
    }

    public final DivPatchDto getSuccessData() {
        return this.successData;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        DivPatchDto divPatchDto = this.successData;
        int hashCode2 = (hashCode + (divPatchDto == null ? 0 : divPatchDto.hashCode())) * 31;
        DivPatchDto divPatchDto2 = this.inProgressData;
        int hashCode3 = (hashCode2 + (divPatchDto2 == null ? 0 : divPatchDto2.hashCode())) * 31;
        FailDataResponse failDataResponse = this.failData;
        return hashCode3 + (failDataResponse != null ? failDataResponse.hashCode() : 0);
    }

    public String toString() {
        return "DivPollingDto(status=" + this.status + ", successData=" + this.successData + ", inProgressData=" + this.inProgressData + ", failData=" + this.failData + Extension.C_BRAKE;
    }
}
