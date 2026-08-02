package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JC\u0010\u001d\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/FundRequestStatusSuccessResponseDto;", "", ACSPConstants.STATUS, "Lcom/ybsdk/feature/savings/internal/network/dto/FundRequestStatusDto;", "successData", "Lcom/ybsdk/feature/savings/internal/network/dto/FundRequestStatusSuccessDataDto;", "inProgressData", "Lcom/ybsdk/feature/savings/internal/network/dto/FundRequestStatusInProgressDataDto;", "resultStatusData", "Lcom/ybsdk/feature/savings/internal/network/dto/FundRequestStatusResultDataDto;", "openAndTopupData", "Lcom/ybsdk/feature/savings/internal/network/dto/FundRequestStatusOpenAndTopupDataDto;", "<init>", "(Lcom/ybsdk/feature/savings/internal/network/dto/FundRequestStatusDto;Lcom/ybsdk/feature/savings/internal/network/dto/FundRequestStatusSuccessDataDto;Lcom/ybsdk/feature/savings/internal/network/dto/FundRequestStatusInProgressDataDto;Lcom/ybsdk/feature/savings/internal/network/dto/FundRequestStatusResultDataDto;Lcom/ybsdk/feature/savings/internal/network/dto/FundRequestStatusOpenAndTopupDataDto;)V", "getStatus", "()Lcom/ybsdk/feature/savings/internal/network/dto/FundRequestStatusDto;", "getSuccessData", "()Lcom/ybsdk/feature/savings/internal/network/dto/FundRequestStatusSuccessDataDto;", "getInProgressData", "()Lcom/ybsdk/feature/savings/internal/network/dto/FundRequestStatusInProgressDataDto;", "getResultStatusData", "()Lcom/ybsdk/feature/savings/internal/network/dto/FundRequestStatusResultDataDto;", "getOpenAndTopupData", "()Lcom/ybsdk/feature/savings/internal/network/dto/FundRequestStatusOpenAndTopupDataDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FundRequestStatusSuccessResponseDto {
    private final FundRequestStatusInProgressDataDto inProgressData;
    private final FundRequestStatusOpenAndTopupDataDto openAndTopupData;
    private final FundRequestStatusResultDataDto resultStatusData;
    private final FundRequestStatusDto status;
    private final FundRequestStatusSuccessDataDto successData;

    public FundRequestStatusSuccessResponseDto(@Json(name = "status") FundRequestStatusDto fundRequestStatusDto, @Json(name = "success_data") FundRequestStatusSuccessDataDto fundRequestStatusSuccessDataDto, @Json(name = "in_progress_data") FundRequestStatusInProgressDataDto fundRequestStatusInProgressDataDto, @Json(name = "result_status_data") FundRequestStatusResultDataDto fundRequestStatusResultDataDto, @Json(name = "open_and_topup_data") FundRequestStatusOpenAndTopupDataDto fundRequestStatusOpenAndTopupDataDto) {
        this.status = fundRequestStatusDto;
        this.successData = fundRequestStatusSuccessDataDto;
        this.inProgressData = fundRequestStatusInProgressDataDto;
        this.resultStatusData = fundRequestStatusResultDataDto;
        this.openAndTopupData = fundRequestStatusOpenAndTopupDataDto;
    }

    public static /* synthetic */ FundRequestStatusSuccessResponseDto copy$default(FundRequestStatusSuccessResponseDto fundRequestStatusSuccessResponseDto, FundRequestStatusDto fundRequestStatusDto, FundRequestStatusSuccessDataDto fundRequestStatusSuccessDataDto, FundRequestStatusInProgressDataDto fundRequestStatusInProgressDataDto, FundRequestStatusResultDataDto fundRequestStatusResultDataDto, FundRequestStatusOpenAndTopupDataDto fundRequestStatusOpenAndTopupDataDto, int i, Object obj) {
        if ((i & 1) != 0) {
            fundRequestStatusDto = fundRequestStatusSuccessResponseDto.status;
        }
        if ((i & 2) != 0) {
            fundRequestStatusSuccessDataDto = fundRequestStatusSuccessResponseDto.successData;
        }
        if ((i & 4) != 0) {
            fundRequestStatusInProgressDataDto = fundRequestStatusSuccessResponseDto.inProgressData;
        }
        if ((i & 8) != 0) {
            fundRequestStatusResultDataDto = fundRequestStatusSuccessResponseDto.resultStatusData;
        }
        if ((i & 16) != 0) {
            fundRequestStatusOpenAndTopupDataDto = fundRequestStatusSuccessResponseDto.openAndTopupData;
        }
        FundRequestStatusOpenAndTopupDataDto fundRequestStatusOpenAndTopupDataDto2 = fundRequestStatusOpenAndTopupDataDto;
        FundRequestStatusInProgressDataDto fundRequestStatusInProgressDataDto2 = fundRequestStatusInProgressDataDto;
        return fundRequestStatusSuccessResponseDto.copy(fundRequestStatusDto, fundRequestStatusSuccessDataDto, fundRequestStatusInProgressDataDto2, fundRequestStatusResultDataDto, fundRequestStatusOpenAndTopupDataDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final FundRequestStatusDto getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final FundRequestStatusSuccessDataDto getSuccessData() {
        return this.successData;
    }

    /* renamed from: component3, reason: from getter */
    public final FundRequestStatusInProgressDataDto getInProgressData() {
        return this.inProgressData;
    }

    /* renamed from: component4, reason: from getter */
    public final FundRequestStatusResultDataDto getResultStatusData() {
        return this.resultStatusData;
    }

    /* renamed from: component5, reason: from getter */
    public final FundRequestStatusOpenAndTopupDataDto getOpenAndTopupData() {
        return this.openAndTopupData;
    }

    public final FundRequestStatusSuccessResponseDto copy(@Json(name = "status") FundRequestStatusDto status, @Json(name = "success_data") FundRequestStatusSuccessDataDto successData, @Json(name = "in_progress_data") FundRequestStatusInProgressDataDto inProgressData, @Json(name = "result_status_data") FundRequestStatusResultDataDto resultStatusData, @Json(name = "open_and_topup_data") FundRequestStatusOpenAndTopupDataDto openAndTopupData) {
        return new FundRequestStatusSuccessResponseDto(status, successData, inProgressData, resultStatusData, openAndTopupData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FundRequestStatusSuccessResponseDto)) {
            return false;
        }
        FundRequestStatusSuccessResponseDto fundRequestStatusSuccessResponseDto = (FundRequestStatusSuccessResponseDto) other;
        return this.status == fundRequestStatusSuccessResponseDto.status && jl40.l(this.successData, fundRequestStatusSuccessResponseDto.successData) && jl40.l(this.inProgressData, fundRequestStatusSuccessResponseDto.inProgressData) && jl40.l(this.resultStatusData, fundRequestStatusSuccessResponseDto.resultStatusData) && jl40.l(this.openAndTopupData, fundRequestStatusSuccessResponseDto.openAndTopupData);
    }

    public final FundRequestStatusInProgressDataDto getInProgressData() {
        return this.inProgressData;
    }

    public final FundRequestStatusOpenAndTopupDataDto getOpenAndTopupData() {
        return this.openAndTopupData;
    }

    public final FundRequestStatusResultDataDto getResultStatusData() {
        return this.resultStatusData;
    }

    public final FundRequestStatusDto getStatus() {
        return this.status;
    }

    public final FundRequestStatusSuccessDataDto getSuccessData() {
        return this.successData;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        FundRequestStatusSuccessDataDto fundRequestStatusSuccessDataDto = this.successData;
        int hashCode2 = (hashCode + (fundRequestStatusSuccessDataDto == null ? 0 : fundRequestStatusSuccessDataDto.hashCode())) * 31;
        FundRequestStatusInProgressDataDto fundRequestStatusInProgressDataDto = this.inProgressData;
        int hashCode3 = (hashCode2 + (fundRequestStatusInProgressDataDto == null ? 0 : fundRequestStatusInProgressDataDto.hashCode())) * 31;
        FundRequestStatusResultDataDto fundRequestStatusResultDataDto = this.resultStatusData;
        int hashCode4 = (hashCode3 + (fundRequestStatusResultDataDto == null ? 0 : fundRequestStatusResultDataDto.hashCode())) * 31;
        FundRequestStatusOpenAndTopupDataDto fundRequestStatusOpenAndTopupDataDto = this.openAndTopupData;
        return hashCode4 + (fundRequestStatusOpenAndTopupDataDto != null ? fundRequestStatusOpenAndTopupDataDto.hashCode() : 0);
    }

    public String toString() {
        return "FundRequestStatusSuccessResponseDto(status=" + this.status + ", successData=" + this.successData + ", inProgressData=" + this.inProgressData + ", resultStatusData=" + this.resultStatusData + ", openAndTopupData=" + this.openAndTopupData + Extension.C_BRAKE;
    }
}
