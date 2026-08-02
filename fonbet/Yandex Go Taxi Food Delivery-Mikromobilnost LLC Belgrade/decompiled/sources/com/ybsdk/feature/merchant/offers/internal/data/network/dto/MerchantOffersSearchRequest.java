package com.ybsdk.feature.merchant.offers.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.device.DeviceInfoDto;
import defpackage.jl40;
import defpackage.ly3;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersSearchRequest;", "", "query", "", "deviceInfo", "Lcom/ybsdk/core/common/data/network/dto/device/DeviceInfoDto;", "offerIds", "", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/device/DeviceInfoDto;Ljava/util/List;)V", "getQuery", "()Ljava/lang/String;", "getDeviceInfo", "()Lcom/ybsdk/core/common/data/network/dto/device/DeviceInfoDto;", "getOfferIds", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-merchant-offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MerchantOffersSearchRequest {
    private final DeviceInfoDto deviceInfo;
    private final List<String> offerIds;
    private final String query;

    public MerchantOffersSearchRequest(@Json(name = "query") String str, @Json(name = "device_info") DeviceInfoDto deviceInfoDto, @Json(name = "offer_ids") List<String> list) {
        this.query = str;
        this.deviceInfo = deviceInfoDto;
        this.offerIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MerchantOffersSearchRequest copy$default(MerchantOffersSearchRequest merchantOffersSearchRequest, String str, DeviceInfoDto deviceInfoDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = merchantOffersSearchRequest.query;
        }
        if ((i & 2) != 0) {
            deviceInfoDto = merchantOffersSearchRequest.deviceInfo;
        }
        if ((i & 4) != 0) {
            list = merchantOffersSearchRequest.offerIds;
        }
        return merchantOffersSearchRequest.copy(str, deviceInfoDto, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    /* renamed from: component2, reason: from getter */
    public final DeviceInfoDto getDeviceInfo() {
        return this.deviceInfo;
    }

    public final List<String> component3() {
        return this.offerIds;
    }

    public final MerchantOffersSearchRequest copy(@Json(name = "query") String query, @Json(name = "device_info") DeviceInfoDto deviceInfo, @Json(name = "offer_ids") List<String> offerIds) {
        return new MerchantOffersSearchRequest(query, deviceInfo, offerIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MerchantOffersSearchRequest)) {
            return false;
        }
        MerchantOffersSearchRequest merchantOffersSearchRequest = (MerchantOffersSearchRequest) other;
        return jl40.l(this.query, merchantOffersSearchRequest.query) && jl40.l(this.deviceInfo, merchantOffersSearchRequest.deviceInfo) && jl40.l(this.offerIds, merchantOffersSearchRequest.offerIds);
    }

    public final DeviceInfoDto getDeviceInfo() {
        return this.deviceInfo;
    }

    public final List<String> getOfferIds() {
        return this.offerIds;
    }

    public final String getQuery() {
        return this.query;
    }

    public int hashCode() {
        int hashCode = (this.deviceInfo.hashCode() + (this.query.hashCode() * 31)) * 31;
        List<String> list = this.offerIds;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        String str = this.query;
        DeviceInfoDto deviceInfoDto = this.deviceInfo;
        List<String> list = this.offerIds;
        StringBuilder sb = new StringBuilder("MerchantOffersSearchRequest(query=");
        sb.append(str);
        sb.append(", deviceInfo=");
        sb.append(deviceInfoDto);
        sb.append(", offerIds=");
        return ly3.s(sb, list, Extension.C_BRAKE);
    }
}
