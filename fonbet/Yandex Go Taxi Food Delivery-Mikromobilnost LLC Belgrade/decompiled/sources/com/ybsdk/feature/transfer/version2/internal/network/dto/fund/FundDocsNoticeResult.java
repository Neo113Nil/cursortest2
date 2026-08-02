package com.ybsdk.feature.transfer.version2.internal.network.dto.fund;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/fund/FundDocsNoticeResult;", "", ACSPConstants.STATUS, "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/fund/FundDocsStatusDto;", "divkitData", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "<init>", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/fund/FundDocsStatusDto;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;)V", "getStatus", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/fund/FundDocsStatusDto;", "getDivkitData", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FundDocsNoticeResult {
    private final DivDataDto divkitData;
    private final FundDocsStatusDto status;

    public FundDocsNoticeResult(@Json(name = "status") FundDocsStatusDto fundDocsStatusDto, @Json(name = "divkit_data") DivDataDto divDataDto) {
        this.status = fundDocsStatusDto;
        this.divkitData = divDataDto;
    }

    public static /* synthetic */ FundDocsNoticeResult copy$default(FundDocsNoticeResult fundDocsNoticeResult, FundDocsStatusDto fundDocsStatusDto, DivDataDto divDataDto, int i, Object obj) {
        if ((i & 1) != 0) {
            fundDocsStatusDto = fundDocsNoticeResult.status;
        }
        if ((i & 2) != 0) {
            divDataDto = fundDocsNoticeResult.divkitData;
        }
        return fundDocsNoticeResult.copy(fundDocsStatusDto, divDataDto);
    }

    /* renamed from: component1, reason: from getter */
    public final FundDocsStatusDto getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final DivDataDto getDivkitData() {
        return this.divkitData;
    }

    public final FundDocsNoticeResult copy(@Json(name = "status") FundDocsStatusDto status, @Json(name = "divkit_data") DivDataDto divkitData) {
        return new FundDocsNoticeResult(status, divkitData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FundDocsNoticeResult)) {
            return false;
        }
        FundDocsNoticeResult fundDocsNoticeResult = (FundDocsNoticeResult) other;
        return this.status == fundDocsNoticeResult.status && jl40.l(this.divkitData, fundDocsNoticeResult.divkitData);
    }

    public final DivDataDto getDivkitData() {
        return this.divkitData;
    }

    public final FundDocsStatusDto getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        DivDataDto divDataDto = this.divkitData;
        return hashCode + (divDataDto == null ? 0 : divDataDto.hashCode());
    }

    public String toString() {
        return "FundDocsNoticeResult(status=" + this.status + ", divkitData=" + this.divkitData + Extension.C_BRAKE;
    }
}
