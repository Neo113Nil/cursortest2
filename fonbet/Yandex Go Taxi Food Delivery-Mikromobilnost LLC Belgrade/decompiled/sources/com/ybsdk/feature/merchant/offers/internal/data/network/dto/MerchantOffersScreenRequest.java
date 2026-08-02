package com.ybsdk.feature.merchant.offers.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.CommunicationsShownInfoDto;
import com.ybsdk.core.common.data.network.dto.device.DeviceInfoDto;
import defpackage.jl40;
import defpackage.oyr;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JS\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\fHÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersScreenRequest;", "", "deviceInfo", "Lcom/ybsdk/core/common/data/network/dto/device/DeviceInfoDto;", "mlRequestId", "", "offerIds", "", "initialDeeplink", "communicationShownInfo", "Lcom/ybsdk/core/common/data/network/dto/CommunicationsShownInfoDto;", "sessionsCountWithoutFullscreenCount", "", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/device/DeviceInfoDto;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/CommunicationsShownInfoDto;I)V", "getDeviceInfo", "()Lcom/ybsdk/core/common/data/network/dto/device/DeviceInfoDto;", "getMlRequestId", "()Ljava/lang/String;", "getOfferIds", "()Ljava/util/List;", "getInitialDeeplink", "getCommunicationShownInfo", "()Lcom/ybsdk/core/common/data/network/dto/CommunicationsShownInfoDto;", "getSessionsCountWithoutFullscreenCount", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "feature-merchant-offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MerchantOffersScreenRequest {
    private final CommunicationsShownInfoDto communicationShownInfo;
    private final DeviceInfoDto deviceInfo;
    private final String initialDeeplink;
    private final String mlRequestId;
    private final List<String> offerIds;
    private final int sessionsCountWithoutFullscreenCount;

    public MerchantOffersScreenRequest(@Json(name = "device_info") DeviceInfoDto deviceInfoDto, @Json(name = "ml_request_id") String str, @Json(name = "offer_ids") List<String> list, @Json(name = "initial_deeplink") String str2, @Json(name = "communications_shown_info") CommunicationsShownInfoDto communicationsShownInfoDto, @Json(name = "sessions_count_without_fullscreen") int i) {
        this.deviceInfo = deviceInfoDto;
        this.mlRequestId = str;
        this.offerIds = list;
        this.initialDeeplink = str2;
        this.communicationShownInfo = communicationsShownInfoDto;
        this.sessionsCountWithoutFullscreenCount = i;
    }

    public static /* synthetic */ MerchantOffersScreenRequest copy$default(MerchantOffersScreenRequest merchantOffersScreenRequest, DeviceInfoDto deviceInfoDto, String str, List list, String str2, CommunicationsShownInfoDto communicationsShownInfoDto, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            deviceInfoDto = merchantOffersScreenRequest.deviceInfo;
        }
        if ((i2 & 2) != 0) {
            str = merchantOffersScreenRequest.mlRequestId;
        }
        if ((i2 & 4) != 0) {
            list = merchantOffersScreenRequest.offerIds;
        }
        if ((i2 & 8) != 0) {
            str2 = merchantOffersScreenRequest.initialDeeplink;
        }
        if ((i2 & 16) != 0) {
            communicationsShownInfoDto = merchantOffersScreenRequest.communicationShownInfo;
        }
        if ((i2 & 32) != 0) {
            i = merchantOffersScreenRequest.sessionsCountWithoutFullscreenCount;
        }
        CommunicationsShownInfoDto communicationsShownInfoDto2 = communicationsShownInfoDto;
        int i3 = i;
        return merchantOffersScreenRequest.copy(deviceInfoDto, str, list, str2, communicationsShownInfoDto2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final DeviceInfoDto getDeviceInfo() {
        return this.deviceInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMlRequestId() {
        return this.mlRequestId;
    }

    public final List<String> component3() {
        return this.offerIds;
    }

    /* renamed from: component4, reason: from getter */
    public final String getInitialDeeplink() {
        return this.initialDeeplink;
    }

    /* renamed from: component5, reason: from getter */
    public final CommunicationsShownInfoDto getCommunicationShownInfo() {
        return this.communicationShownInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final int getSessionsCountWithoutFullscreenCount() {
        return this.sessionsCountWithoutFullscreenCount;
    }

    public final MerchantOffersScreenRequest copy(@Json(name = "device_info") DeviceInfoDto deviceInfo, @Json(name = "ml_request_id") String mlRequestId, @Json(name = "offer_ids") List<String> offerIds, @Json(name = "initial_deeplink") String initialDeeplink, @Json(name = "communications_shown_info") CommunicationsShownInfoDto communicationShownInfo, @Json(name = "sessions_count_without_fullscreen") int sessionsCountWithoutFullscreenCount) {
        return new MerchantOffersScreenRequest(deviceInfo, mlRequestId, offerIds, initialDeeplink, communicationShownInfo, sessionsCountWithoutFullscreenCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MerchantOffersScreenRequest)) {
            return false;
        }
        MerchantOffersScreenRequest merchantOffersScreenRequest = (MerchantOffersScreenRequest) other;
        return jl40.l(this.deviceInfo, merchantOffersScreenRequest.deviceInfo) && jl40.l(this.mlRequestId, merchantOffersScreenRequest.mlRequestId) && jl40.l(this.offerIds, merchantOffersScreenRequest.offerIds) && jl40.l(this.initialDeeplink, merchantOffersScreenRequest.initialDeeplink) && jl40.l(this.communicationShownInfo, merchantOffersScreenRequest.communicationShownInfo) && this.sessionsCountWithoutFullscreenCount == merchantOffersScreenRequest.sessionsCountWithoutFullscreenCount;
    }

    public final CommunicationsShownInfoDto getCommunicationShownInfo() {
        return this.communicationShownInfo;
    }

    public final DeviceInfoDto getDeviceInfo() {
        return this.deviceInfo;
    }

    public final String getInitialDeeplink() {
        return this.initialDeeplink;
    }

    public final String getMlRequestId() {
        return this.mlRequestId;
    }

    public final List<String> getOfferIds() {
        return this.offerIds;
    }

    public final int getSessionsCountWithoutFullscreenCount() {
        return this.sessionsCountWithoutFullscreenCount;
    }

    public int hashCode() {
        int hashCode = this.deviceInfo.hashCode() * 31;
        String str = this.mlRequestId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.offerIds;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.initialDeeplink;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CommunicationsShownInfoDto communicationsShownInfoDto = this.communicationShownInfo;
        return Integer.hashCode(this.sessionsCountWithoutFullscreenCount) + ((hashCode4 + (communicationsShownInfoDto != null ? communicationsShownInfoDto.hashCode() : 0)) * 31);
    }

    public String toString() {
        DeviceInfoDto deviceInfoDto = this.deviceInfo;
        String str = this.mlRequestId;
        List<String> list = this.offerIds;
        String str2 = this.initialDeeplink;
        CommunicationsShownInfoDto communicationsShownInfoDto = this.communicationShownInfo;
        int i = this.sessionsCountWithoutFullscreenCount;
        StringBuilder sb = new StringBuilder("MerchantOffersScreenRequest(deviceInfo=");
        sb.append(deviceInfoDto);
        sb.append(", mlRequestId=");
        sb.append(str);
        sb.append(", offerIds=");
        oyr.D(", initialDeeplink=", str2, ", communicationShownInfo=", sb, list);
        sb.append(communicationsShownInfoDto);
        sb.append(", sessionsCountWithoutFullscreenCount=");
        sb.append(i);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
