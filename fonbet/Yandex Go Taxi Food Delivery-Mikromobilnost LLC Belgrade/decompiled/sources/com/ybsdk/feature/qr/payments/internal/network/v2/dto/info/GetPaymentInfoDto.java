package com.ybsdk.feature.qr.payments.internal.network.v2.dto.info;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.qr.payments.internal.network.common.GetPaymentInfoStatusDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/GetPaymentInfoDto;", "", ACSPConstants.STATUS, "Lcom/ybsdk/feature/qr/payments/internal/network/common/GetPaymentInfoStatusDto;", "refreshInfo", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/RefreshPageInfoDto;", "successInfo", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/SuccessInfoDto;", "redirectInfo", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/RedirectInfoDto;", "<init>", "(Lcom/ybsdk/feature/qr/payments/internal/network/common/GetPaymentInfoStatusDto;Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/RefreshPageInfoDto;Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/SuccessInfoDto;Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/RedirectInfoDto;)V", "getStatus", "()Lcom/ybsdk/feature/qr/payments/internal/network/common/GetPaymentInfoStatusDto;", "getRefreshInfo", "()Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/RefreshPageInfoDto;", "getSuccessInfo", "()Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/SuccessInfoDto;", "getRedirectInfo", "()Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/RedirectInfoDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetPaymentInfoDto {
    private final RedirectInfoDto redirectInfo;
    private final RefreshPageInfoDto refreshInfo;
    private final GetPaymentInfoStatusDto status;
    private final SuccessInfoDto successInfo;

    public GetPaymentInfoDto(@Json(name = "status") GetPaymentInfoStatusDto getPaymentInfoStatusDto, @Json(name = "refresh_info") RefreshPageInfoDto refreshPageInfoDto, @Json(name = "success_info") SuccessInfoDto successInfoDto, @Json(name = "redirect_info") RedirectInfoDto redirectInfoDto) {
        this.status = getPaymentInfoStatusDto;
        this.refreshInfo = refreshPageInfoDto;
        this.successInfo = successInfoDto;
        this.redirectInfo = redirectInfoDto;
    }

    public static /* synthetic */ GetPaymentInfoDto copy$default(GetPaymentInfoDto getPaymentInfoDto, GetPaymentInfoStatusDto getPaymentInfoStatusDto, RefreshPageInfoDto refreshPageInfoDto, SuccessInfoDto successInfoDto, RedirectInfoDto redirectInfoDto, int i, Object obj) {
        if ((i & 1) != 0) {
            getPaymentInfoStatusDto = getPaymentInfoDto.status;
        }
        if ((i & 2) != 0) {
            refreshPageInfoDto = getPaymentInfoDto.refreshInfo;
        }
        if ((i & 4) != 0) {
            successInfoDto = getPaymentInfoDto.successInfo;
        }
        if ((i & 8) != 0) {
            redirectInfoDto = getPaymentInfoDto.redirectInfo;
        }
        return getPaymentInfoDto.copy(getPaymentInfoStatusDto, refreshPageInfoDto, successInfoDto, redirectInfoDto);
    }

    /* renamed from: component1, reason: from getter */
    public final GetPaymentInfoStatusDto getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final RefreshPageInfoDto getRefreshInfo() {
        return this.refreshInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final SuccessInfoDto getSuccessInfo() {
        return this.successInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final RedirectInfoDto getRedirectInfo() {
        return this.redirectInfo;
    }

    public final GetPaymentInfoDto copy(@Json(name = "status") GetPaymentInfoStatusDto status, @Json(name = "refresh_info") RefreshPageInfoDto refreshInfo, @Json(name = "success_info") SuccessInfoDto successInfo, @Json(name = "redirect_info") RedirectInfoDto redirectInfo) {
        return new GetPaymentInfoDto(status, refreshInfo, successInfo, redirectInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetPaymentInfoDto)) {
            return false;
        }
        GetPaymentInfoDto getPaymentInfoDto = (GetPaymentInfoDto) other;
        return this.status == getPaymentInfoDto.status && jl40.l(this.refreshInfo, getPaymentInfoDto.refreshInfo) && jl40.l(this.successInfo, getPaymentInfoDto.successInfo) && jl40.l(this.redirectInfo, getPaymentInfoDto.redirectInfo);
    }

    public final RedirectInfoDto getRedirectInfo() {
        return this.redirectInfo;
    }

    public final RefreshPageInfoDto getRefreshInfo() {
        return this.refreshInfo;
    }

    public final GetPaymentInfoStatusDto getStatus() {
        return this.status;
    }

    public final SuccessInfoDto getSuccessInfo() {
        return this.successInfo;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        RefreshPageInfoDto refreshPageInfoDto = this.refreshInfo;
        int hashCode2 = (hashCode + (refreshPageInfoDto == null ? 0 : refreshPageInfoDto.hashCode())) * 31;
        SuccessInfoDto successInfoDto = this.successInfo;
        int hashCode3 = (hashCode2 + (successInfoDto == null ? 0 : successInfoDto.hashCode())) * 31;
        RedirectInfoDto redirectInfoDto = this.redirectInfo;
        return hashCode3 + (redirectInfoDto != null ? redirectInfoDto.hashCode() : 0);
    }

    public String toString() {
        return "GetPaymentInfoDto(status=" + this.status + ", refreshInfo=" + this.refreshInfo + ", successInfo=" + this.successInfo + ", redirectInfo=" + this.redirectInfo + Extension.C_BRAKE;
    }
}
