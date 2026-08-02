package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/FundOpenRequest;", "", "fundId", "", "topupInfo", "Lcom/ybsdk/feature/savings/internal/network/dto/FundTopupInfoDto;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/savings/internal/network/dto/FundTopupInfoDto;)V", "getFundId", "()Ljava/lang/String;", "getTopupInfo", "()Lcom/ybsdk/feature/savings/internal/network/dto/FundTopupInfoDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FundOpenRequest {
    private final String fundId;
    private final FundTopupInfoDto topupInfo;

    public FundOpenRequest(@Json(name = "fund_id") String str, @Json(name = "topup_info") FundTopupInfoDto fundTopupInfoDto) {
        this.fundId = str;
        this.topupInfo = fundTopupInfoDto;
    }

    public static /* synthetic */ FundOpenRequest copy$default(FundOpenRequest fundOpenRequest, String str, FundTopupInfoDto fundTopupInfoDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fundOpenRequest.fundId;
        }
        if ((i & 2) != 0) {
            fundTopupInfoDto = fundOpenRequest.topupInfo;
        }
        return fundOpenRequest.copy(str, fundTopupInfoDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFundId() {
        return this.fundId;
    }

    /* renamed from: component2, reason: from getter */
    public final FundTopupInfoDto getTopupInfo() {
        return this.topupInfo;
    }

    public final FundOpenRequest copy(@Json(name = "fund_id") String fundId, @Json(name = "topup_info") FundTopupInfoDto topupInfo) {
        return new FundOpenRequest(fundId, topupInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FundOpenRequest)) {
            return false;
        }
        FundOpenRequest fundOpenRequest = (FundOpenRequest) other;
        return jl40.l(this.fundId, fundOpenRequest.fundId) && jl40.l(this.topupInfo, fundOpenRequest.topupInfo);
    }

    public final String getFundId() {
        return this.fundId;
    }

    public final FundTopupInfoDto getTopupInfo() {
        return this.topupInfo;
    }

    public int hashCode() {
        int hashCode = this.fundId.hashCode() * 31;
        FundTopupInfoDto fundTopupInfoDto = this.topupInfo;
        return hashCode + (fundTopupInfoDto == null ? 0 : fundTopupInfoDto.hashCode());
    }

    public String toString() {
        return "FundOpenRequest(fundId=" + this.fundId + ", topupInfo=" + this.topupInfo + Extension.C_BRAKE;
    }
}
