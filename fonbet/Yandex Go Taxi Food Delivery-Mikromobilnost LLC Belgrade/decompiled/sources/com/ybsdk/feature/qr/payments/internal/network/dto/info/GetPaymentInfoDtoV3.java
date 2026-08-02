package com.ybsdk.feature.qr.payments.internal.network.dto.info;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.qr.payments.internal.network.common.GetPaymentInfoStatusDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003JM\u0010\"\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/GetPaymentInfoDtoV3;", "", "qrcType", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/QrcSystemType;", ACSPConstants.STATUS, "Lcom/ybsdk/feature/qr/payments/internal/network/common/GetPaymentInfoStatusDto;", "processingInfo", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/ProcessingInfoDto;", "refreshInfo", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/RefreshPageInformationDto;", "sberPaymentInfo", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/SberPaymentInfoDto;", "sbpPaymentInfo", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/QrSbpPaymentInfoDto;", "<init>", "(Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/QrcSystemType;Lcom/ybsdk/feature/qr/payments/internal/network/common/GetPaymentInfoStatusDto;Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/ProcessingInfoDto;Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/RefreshPageInformationDto;Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/SberPaymentInfoDto;Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/QrSbpPaymentInfoDto;)V", "getQrcType", "()Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/QrcSystemType;", "getStatus", "()Lcom/ybsdk/feature/qr/payments/internal/network/common/GetPaymentInfoStatusDto;", "getProcessingInfo", "()Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/ProcessingInfoDto;", "getRefreshInfo", "()Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/RefreshPageInformationDto;", "getSberPaymentInfo", "()Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/SberPaymentInfoDto;", "getSbpPaymentInfo", "()Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/QrSbpPaymentInfoDto;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetPaymentInfoDtoV3 {
    private final ProcessingInfoDto processingInfo;
    private final QrcSystemType qrcType;
    private final RefreshPageInformationDto refreshInfo;
    private final SberPaymentInfoDto sberPaymentInfo;
    private final QrSbpPaymentInfoDto sbpPaymentInfo;
    private final GetPaymentInfoStatusDto status;

    public GetPaymentInfoDtoV3(@Json(name = "qrc_system_type") QrcSystemType qrcSystemType, @Json(name = "status") GetPaymentInfoStatusDto getPaymentInfoStatusDto, @Json(name = "processing_info") ProcessingInfoDto processingInfoDto, @Json(name = "refresh_info") RefreshPageInformationDto refreshPageInformationDto, @Json(name = "sber_payment_info") SberPaymentInfoDto sberPaymentInfoDto, @Json(name = "sbp_payment_info") QrSbpPaymentInfoDto qrSbpPaymentInfoDto) {
        this.qrcType = qrcSystemType;
        this.status = getPaymentInfoStatusDto;
        this.processingInfo = processingInfoDto;
        this.refreshInfo = refreshPageInformationDto;
        this.sberPaymentInfo = sberPaymentInfoDto;
        this.sbpPaymentInfo = qrSbpPaymentInfoDto;
    }

    public static /* synthetic */ GetPaymentInfoDtoV3 copy$default(GetPaymentInfoDtoV3 getPaymentInfoDtoV3, QrcSystemType qrcSystemType, GetPaymentInfoStatusDto getPaymentInfoStatusDto, ProcessingInfoDto processingInfoDto, RefreshPageInformationDto refreshPageInformationDto, SberPaymentInfoDto sberPaymentInfoDto, QrSbpPaymentInfoDto qrSbpPaymentInfoDto, int i, Object obj) {
        if ((i & 1) != 0) {
            qrcSystemType = getPaymentInfoDtoV3.qrcType;
        }
        if ((i & 2) != 0) {
            getPaymentInfoStatusDto = getPaymentInfoDtoV3.status;
        }
        if ((i & 4) != 0) {
            processingInfoDto = getPaymentInfoDtoV3.processingInfo;
        }
        if ((i & 8) != 0) {
            refreshPageInformationDto = getPaymentInfoDtoV3.refreshInfo;
        }
        if ((i & 16) != 0) {
            sberPaymentInfoDto = getPaymentInfoDtoV3.sberPaymentInfo;
        }
        if ((i & 32) != 0) {
            qrSbpPaymentInfoDto = getPaymentInfoDtoV3.sbpPaymentInfo;
        }
        SberPaymentInfoDto sberPaymentInfoDto2 = sberPaymentInfoDto;
        QrSbpPaymentInfoDto qrSbpPaymentInfoDto2 = qrSbpPaymentInfoDto;
        return getPaymentInfoDtoV3.copy(qrcSystemType, getPaymentInfoStatusDto, processingInfoDto, refreshPageInformationDto, sberPaymentInfoDto2, qrSbpPaymentInfoDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final QrcSystemType getQrcType() {
        return this.qrcType;
    }

    /* renamed from: component2, reason: from getter */
    public final GetPaymentInfoStatusDto getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final ProcessingInfoDto getProcessingInfo() {
        return this.processingInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final RefreshPageInformationDto getRefreshInfo() {
        return this.refreshInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final SberPaymentInfoDto getSberPaymentInfo() {
        return this.sberPaymentInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final QrSbpPaymentInfoDto getSbpPaymentInfo() {
        return this.sbpPaymentInfo;
    }

    public final GetPaymentInfoDtoV3 copy(@Json(name = "qrc_system_type") QrcSystemType qrcType, @Json(name = "status") GetPaymentInfoStatusDto status, @Json(name = "processing_info") ProcessingInfoDto processingInfo, @Json(name = "refresh_info") RefreshPageInformationDto refreshInfo, @Json(name = "sber_payment_info") SberPaymentInfoDto sberPaymentInfo, @Json(name = "sbp_payment_info") QrSbpPaymentInfoDto sbpPaymentInfo) {
        return new GetPaymentInfoDtoV3(qrcType, status, processingInfo, refreshInfo, sberPaymentInfo, sbpPaymentInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetPaymentInfoDtoV3)) {
            return false;
        }
        GetPaymentInfoDtoV3 getPaymentInfoDtoV3 = (GetPaymentInfoDtoV3) other;
        return this.qrcType == getPaymentInfoDtoV3.qrcType && this.status == getPaymentInfoDtoV3.status && jl40.l(this.processingInfo, getPaymentInfoDtoV3.processingInfo) && jl40.l(this.refreshInfo, getPaymentInfoDtoV3.refreshInfo) && jl40.l(this.sberPaymentInfo, getPaymentInfoDtoV3.sberPaymentInfo) && jl40.l(this.sbpPaymentInfo, getPaymentInfoDtoV3.sbpPaymentInfo);
    }

    public final ProcessingInfoDto getProcessingInfo() {
        return this.processingInfo;
    }

    public final QrcSystemType getQrcType() {
        return this.qrcType;
    }

    public final RefreshPageInformationDto getRefreshInfo() {
        return this.refreshInfo;
    }

    public final SberPaymentInfoDto getSberPaymentInfo() {
        return this.sberPaymentInfo;
    }

    public final QrSbpPaymentInfoDto getSbpPaymentInfo() {
        return this.sbpPaymentInfo;
    }

    public final GetPaymentInfoStatusDto getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = (this.status.hashCode() + (this.qrcType.hashCode() * 31)) * 31;
        ProcessingInfoDto processingInfoDto = this.processingInfo;
        int hashCode2 = (hashCode + (processingInfoDto == null ? 0 : processingInfoDto.hashCode())) * 31;
        RefreshPageInformationDto refreshPageInformationDto = this.refreshInfo;
        int hashCode3 = (hashCode2 + (refreshPageInformationDto == null ? 0 : refreshPageInformationDto.hashCode())) * 31;
        SberPaymentInfoDto sberPaymentInfoDto = this.sberPaymentInfo;
        int hashCode4 = (hashCode3 + (sberPaymentInfoDto == null ? 0 : sberPaymentInfoDto.hashCode())) * 31;
        QrSbpPaymentInfoDto qrSbpPaymentInfoDto = this.sbpPaymentInfo;
        return hashCode4 + (qrSbpPaymentInfoDto != null ? qrSbpPaymentInfoDto.hashCode() : 0);
    }

    public String toString() {
        return "GetPaymentInfoDtoV3(qrcType=" + this.qrcType + ", status=" + this.status + ", processingInfo=" + this.processingInfo + ", refreshInfo=" + this.refreshInfo + ", sberPaymentInfo=" + this.sberPaymentInfo + ", sbpPaymentInfo=" + this.sbpPaymentInfo + Extension.C_BRAKE;
    }
}
