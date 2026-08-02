package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JC\u0010\u001d\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/FundOperationRequestStatusSuccessResponseDto;", "", ACSPConstants.STATUS, "Lcom/ybsdk/feature/savings/internal/network/dto/FundOperationRequestStatusDto;", "successData", "Lcom/ybsdk/feature/savings/internal/network/dto/FundOperationSuccessDataDto;", "inProgressData", "Lcom/ybsdk/feature/savings/internal/network/dto/FundOperationInProgressDataDto;", "resultStatusData", "Lcom/ybsdk/feature/savings/internal/network/dto/FundResultDataDto;", "needConfirmationData", "Lcom/ybsdk/feature/savings/internal/network/dto/FundNeedConfirmationDataDto;", "<init>", "(Lcom/ybsdk/feature/savings/internal/network/dto/FundOperationRequestStatusDto;Lcom/ybsdk/feature/savings/internal/network/dto/FundOperationSuccessDataDto;Lcom/ybsdk/feature/savings/internal/network/dto/FundOperationInProgressDataDto;Lcom/ybsdk/feature/savings/internal/network/dto/FundResultDataDto;Lcom/ybsdk/feature/savings/internal/network/dto/FundNeedConfirmationDataDto;)V", "getStatus", "()Lcom/ybsdk/feature/savings/internal/network/dto/FundOperationRequestStatusDto;", "getSuccessData", "()Lcom/ybsdk/feature/savings/internal/network/dto/FundOperationSuccessDataDto;", "getInProgressData", "()Lcom/ybsdk/feature/savings/internal/network/dto/FundOperationInProgressDataDto;", "getResultStatusData", "()Lcom/ybsdk/feature/savings/internal/network/dto/FundResultDataDto;", "getNeedConfirmationData", "()Lcom/ybsdk/feature/savings/internal/network/dto/FundNeedConfirmationDataDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FundOperationRequestStatusSuccessResponseDto {
    private final FundOperationInProgressDataDto inProgressData;
    private final FundNeedConfirmationDataDto needConfirmationData;
    private final FundResultDataDto resultStatusData;
    private final FundOperationRequestStatusDto status;
    private final FundOperationSuccessDataDto successData;

    public FundOperationRequestStatusSuccessResponseDto(@Json(name = "status") FundOperationRequestStatusDto fundOperationRequestStatusDto, @Json(name = "success_data") FundOperationSuccessDataDto fundOperationSuccessDataDto, @Json(name = "in_progress_data") FundOperationInProgressDataDto fundOperationInProgressDataDto, @Json(name = "result_data") FundResultDataDto fundResultDataDto, @Json(name = "need_confirmation_data") FundNeedConfirmationDataDto fundNeedConfirmationDataDto) {
        this.status = fundOperationRequestStatusDto;
        this.successData = fundOperationSuccessDataDto;
        this.inProgressData = fundOperationInProgressDataDto;
        this.resultStatusData = fundResultDataDto;
        this.needConfirmationData = fundNeedConfirmationDataDto;
    }

    public static /* synthetic */ FundOperationRequestStatusSuccessResponseDto copy$default(FundOperationRequestStatusSuccessResponseDto fundOperationRequestStatusSuccessResponseDto, FundOperationRequestStatusDto fundOperationRequestStatusDto, FundOperationSuccessDataDto fundOperationSuccessDataDto, FundOperationInProgressDataDto fundOperationInProgressDataDto, FundResultDataDto fundResultDataDto, FundNeedConfirmationDataDto fundNeedConfirmationDataDto, int i, Object obj) {
        if ((i & 1) != 0) {
            fundOperationRequestStatusDto = fundOperationRequestStatusSuccessResponseDto.status;
        }
        if ((i & 2) != 0) {
            fundOperationSuccessDataDto = fundOperationRequestStatusSuccessResponseDto.successData;
        }
        if ((i & 4) != 0) {
            fundOperationInProgressDataDto = fundOperationRequestStatusSuccessResponseDto.inProgressData;
        }
        if ((i & 8) != 0) {
            fundResultDataDto = fundOperationRequestStatusSuccessResponseDto.resultStatusData;
        }
        if ((i & 16) != 0) {
            fundNeedConfirmationDataDto = fundOperationRequestStatusSuccessResponseDto.needConfirmationData;
        }
        FundNeedConfirmationDataDto fundNeedConfirmationDataDto2 = fundNeedConfirmationDataDto;
        FundOperationInProgressDataDto fundOperationInProgressDataDto2 = fundOperationInProgressDataDto;
        return fundOperationRequestStatusSuccessResponseDto.copy(fundOperationRequestStatusDto, fundOperationSuccessDataDto, fundOperationInProgressDataDto2, fundResultDataDto, fundNeedConfirmationDataDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final FundOperationRequestStatusDto getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final FundOperationSuccessDataDto getSuccessData() {
        return this.successData;
    }

    /* renamed from: component3, reason: from getter */
    public final FundOperationInProgressDataDto getInProgressData() {
        return this.inProgressData;
    }

    /* renamed from: component4, reason: from getter */
    public final FundResultDataDto getResultStatusData() {
        return this.resultStatusData;
    }

    /* renamed from: component5, reason: from getter */
    public final FundNeedConfirmationDataDto getNeedConfirmationData() {
        return this.needConfirmationData;
    }

    public final FundOperationRequestStatusSuccessResponseDto copy(@Json(name = "status") FundOperationRequestStatusDto status, @Json(name = "success_data") FundOperationSuccessDataDto successData, @Json(name = "in_progress_data") FundOperationInProgressDataDto inProgressData, @Json(name = "result_data") FundResultDataDto resultStatusData, @Json(name = "need_confirmation_data") FundNeedConfirmationDataDto needConfirmationData) {
        return new FundOperationRequestStatusSuccessResponseDto(status, successData, inProgressData, resultStatusData, needConfirmationData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FundOperationRequestStatusSuccessResponseDto)) {
            return false;
        }
        FundOperationRequestStatusSuccessResponseDto fundOperationRequestStatusSuccessResponseDto = (FundOperationRequestStatusSuccessResponseDto) other;
        return this.status == fundOperationRequestStatusSuccessResponseDto.status && jl40.l(this.successData, fundOperationRequestStatusSuccessResponseDto.successData) && jl40.l(this.inProgressData, fundOperationRequestStatusSuccessResponseDto.inProgressData) && jl40.l(this.resultStatusData, fundOperationRequestStatusSuccessResponseDto.resultStatusData) && jl40.l(this.needConfirmationData, fundOperationRequestStatusSuccessResponseDto.needConfirmationData);
    }

    public final FundOperationInProgressDataDto getInProgressData() {
        return this.inProgressData;
    }

    public final FundNeedConfirmationDataDto getNeedConfirmationData() {
        return this.needConfirmationData;
    }

    public final FundResultDataDto getResultStatusData() {
        return this.resultStatusData;
    }

    public final FundOperationRequestStatusDto getStatus() {
        return this.status;
    }

    public final FundOperationSuccessDataDto getSuccessData() {
        return this.successData;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        FundOperationSuccessDataDto fundOperationSuccessDataDto = this.successData;
        int hashCode2 = (hashCode + (fundOperationSuccessDataDto == null ? 0 : fundOperationSuccessDataDto.hashCode())) * 31;
        FundOperationInProgressDataDto fundOperationInProgressDataDto = this.inProgressData;
        int hashCode3 = (hashCode2 + (fundOperationInProgressDataDto == null ? 0 : fundOperationInProgressDataDto.hashCode())) * 31;
        FundResultDataDto fundResultDataDto = this.resultStatusData;
        int hashCode4 = (hashCode3 + (fundResultDataDto == null ? 0 : fundResultDataDto.hashCode())) * 31;
        FundNeedConfirmationDataDto fundNeedConfirmationDataDto = this.needConfirmationData;
        return hashCode4 + (fundNeedConfirmationDataDto != null ? fundNeedConfirmationDataDto.hashCode() : 0);
    }

    public String toString() {
        return "FundOperationRequestStatusSuccessResponseDto(status=" + this.status + ", successData=" + this.successData + ", inProgressData=" + this.inProgressData + ", resultStatusData=" + this.resultStatusData + ", needConfirmationData=" + this.needConfirmationData + Extension.C_BRAKE;
    }
}
