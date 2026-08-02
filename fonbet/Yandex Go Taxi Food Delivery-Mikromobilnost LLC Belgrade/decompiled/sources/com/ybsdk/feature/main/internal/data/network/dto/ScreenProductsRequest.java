package com.ybsdk.feature.main.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.CommunicationsShownInfoDto;
import com.ybsdk.core.common.data.network.dto.device.DeviceInfoDto;
import com.ybsdk.core.common.data.network.dto.nfc.NfcInfoDto;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u001d\b\u0081\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\u0016\b\u0003\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010%\u001a\u00020\rHÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000fHÆ\u0003Ja\u0010'\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0003\u0010\f\u001a\u00020\r2\u0016\b\u0003\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000fHÆ\u0001J\u0013\u0010(\u001a\u00020\u00032\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\rHÖ\u0001J\t\u0010+\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006,"}, d2 = {"Lcom/ybsdk/feature/main/internal/data/network/dto/ScreenProductsRequest;", "", "v4HeaderEnabled", "", "deviceInfo", "Lcom/ybsdk/core/common/data/network/dto/device/DeviceInfoDto;", "nfcInfo", "Lcom/ybsdk/core/common/data/network/dto/nfc/NfcInfoDto;", "initialDeeplink", "", "communicationShownInfo", "Lcom/ybsdk/core/common/data/network/dto/CommunicationsShownInfoDto;", "sessionsCountWithoutFullscreenCount", "", "additionalData", "", "<init>", "(ZLcom/ybsdk/core/common/data/network/dto/device/DeviceInfoDto;Lcom/ybsdk/core/common/data/network/dto/nfc/NfcInfoDto;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/CommunicationsShownInfoDto;ILjava/util/Map;)V", "getV4HeaderEnabled", "()Z", "getDeviceInfo", "()Lcom/ybsdk/core/common/data/network/dto/device/DeviceInfoDto;", "getNfcInfo", "()Lcom/ybsdk/core/common/data/network/dto/nfc/NfcInfoDto;", "getInitialDeeplink", "()Ljava/lang/String;", "getCommunicationShownInfo", "()Lcom/ybsdk/core/common/data/network/dto/CommunicationsShownInfoDto;", "getSessionsCountWithoutFullscreenCount", "()I", "getAdditionalData", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ScreenProductsRequest {
    private final Map<String, Object> additionalData;
    private final CommunicationsShownInfoDto communicationShownInfo;
    private final DeviceInfoDto deviceInfo;
    private final String initialDeeplink;
    private final NfcInfoDto nfcInfo;
    private final int sessionsCountWithoutFullscreenCount;
    private final boolean v4HeaderEnabled;

    public ScreenProductsRequest(@Json(name = "v4_header_enabled") boolean z, @Json(name = "device_info") DeviceInfoDto deviceInfoDto, @Json(name = "nfc_info") NfcInfoDto nfcInfoDto, @Json(name = "initial_deeplink") String str, @Json(name = "communications_shown_info") CommunicationsShownInfoDto communicationsShownInfoDto, @Json(name = "sessions_count_without_fullscreen") int i, @Json(name = "additional_data") Map<String, ? extends Object> map) {
        this.v4HeaderEnabled = z;
        this.deviceInfo = deviceInfoDto;
        this.nfcInfo = nfcInfoDto;
        this.initialDeeplink = str;
        this.communicationShownInfo = communicationsShownInfoDto;
        this.sessionsCountWithoutFullscreenCount = i;
        this.additionalData = map;
    }

    public static /* synthetic */ ScreenProductsRequest copy$default(ScreenProductsRequest screenProductsRequest, boolean z, DeviceInfoDto deviceInfoDto, NfcInfoDto nfcInfoDto, String str, CommunicationsShownInfoDto communicationsShownInfoDto, int i, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = screenProductsRequest.v4HeaderEnabled;
        }
        if ((i2 & 2) != 0) {
            deviceInfoDto = screenProductsRequest.deviceInfo;
        }
        if ((i2 & 4) != 0) {
            nfcInfoDto = screenProductsRequest.nfcInfo;
        }
        if ((i2 & 8) != 0) {
            str = screenProductsRequest.initialDeeplink;
        }
        if ((i2 & 16) != 0) {
            communicationsShownInfoDto = screenProductsRequest.communicationShownInfo;
        }
        if ((i2 & 32) != 0) {
            i = screenProductsRequest.sessionsCountWithoutFullscreenCount;
        }
        if ((i2 & 64) != 0) {
            map = screenProductsRequest.additionalData;
        }
        int i3 = i;
        Map map2 = map;
        CommunicationsShownInfoDto communicationsShownInfoDto2 = communicationsShownInfoDto;
        NfcInfoDto nfcInfoDto2 = nfcInfoDto;
        return screenProductsRequest.copy(z, deviceInfoDto, nfcInfoDto2, str, communicationsShownInfoDto2, i3, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getV4HeaderEnabled() {
        return this.v4HeaderEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final DeviceInfoDto getDeviceInfo() {
        return this.deviceInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final NfcInfoDto getNfcInfo() {
        return this.nfcInfo;
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

    public final Map<String, Object> component7() {
        return this.additionalData;
    }

    public final ScreenProductsRequest copy(@Json(name = "v4_header_enabled") boolean v4HeaderEnabled, @Json(name = "device_info") DeviceInfoDto deviceInfo, @Json(name = "nfc_info") NfcInfoDto nfcInfo, @Json(name = "initial_deeplink") String initialDeeplink, @Json(name = "communications_shown_info") CommunicationsShownInfoDto communicationShownInfo, @Json(name = "sessions_count_without_fullscreen") int sessionsCountWithoutFullscreenCount, @Json(name = "additional_data") Map<String, ? extends Object> additionalData) {
        return new ScreenProductsRequest(v4HeaderEnabled, deviceInfo, nfcInfo, initialDeeplink, communicationShownInfo, sessionsCountWithoutFullscreenCount, additionalData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScreenProductsRequest)) {
            return false;
        }
        ScreenProductsRequest screenProductsRequest = (ScreenProductsRequest) other;
        return this.v4HeaderEnabled == screenProductsRequest.v4HeaderEnabled && jl40.l(this.deviceInfo, screenProductsRequest.deviceInfo) && jl40.l(this.nfcInfo, screenProductsRequest.nfcInfo) && jl40.l(this.initialDeeplink, screenProductsRequest.initialDeeplink) && jl40.l(this.communicationShownInfo, screenProductsRequest.communicationShownInfo) && this.sessionsCountWithoutFullscreenCount == screenProductsRequest.sessionsCountWithoutFullscreenCount && jl40.l(this.additionalData, screenProductsRequest.additionalData);
    }

    public final Map<String, Object> getAdditionalData() {
        return this.additionalData;
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

    public final NfcInfoDto getNfcInfo() {
        return this.nfcInfo;
    }

    public final int getSessionsCountWithoutFullscreenCount() {
        return this.sessionsCountWithoutFullscreenCount;
    }

    public final boolean getV4HeaderEnabled() {
        return this.v4HeaderEnabled;
    }

    public int hashCode() {
        int hashCode = (this.nfcInfo.hashCode() + ((this.deviceInfo.hashCode() + (Boolean.hashCode(this.v4HeaderEnabled) * 31)) * 31)) * 31;
        String str = this.initialDeeplink;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CommunicationsShownInfoDto communicationsShownInfoDto = this.communicationShownInfo;
        int b = oyr.b(this.sessionsCountWithoutFullscreenCount, (hashCode2 + (communicationsShownInfoDto == null ? 0 : communicationsShownInfoDto.hashCode())) * 31, 31);
        Map<String, Object> map = this.additionalData;
        return b + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.v4HeaderEnabled;
        DeviceInfoDto deviceInfoDto = this.deviceInfo;
        NfcInfoDto nfcInfoDto = this.nfcInfo;
        String str = this.initialDeeplink;
        CommunicationsShownInfoDto communicationsShownInfoDto = this.communicationShownInfo;
        int i = this.sessionsCountWithoutFullscreenCount;
        Map<String, Object> map = this.additionalData;
        StringBuilder sb = new StringBuilder("ScreenProductsRequest(v4HeaderEnabled=");
        sb.append(z);
        sb.append(", deviceInfo=");
        sb.append(deviceInfoDto);
        sb.append(", nfcInfo=");
        sb.append(nfcInfoDto);
        sb.append(", initialDeeplink=");
        sb.append(str);
        sb.append(", communicationShownInfo=");
        sb.append(communicationsShownInfoDto);
        sb.append(", sessionsCountWithoutFullscreenCount=");
        sb.append(i);
        sb.append(", additionalData=");
        return b64.r(sb, map, Extension.C_BRAKE);
    }

    public /* synthetic */ ScreenProductsRequest(boolean z, DeviceInfoDto deviceInfoDto, NfcInfoDto nfcInfoDto, String str, CommunicationsShownInfoDto communicationsShownInfoDto, int i, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, deviceInfoDto, nfcInfoDto, (i2 & 8) != 0 ? null : str, communicationsShownInfoDto, i, (i2 & 64) != 0 ? null : map);
    }
}
