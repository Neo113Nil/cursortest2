package com.ybsdk.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001bB)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J0\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/network/dto/StartSessionRequest;", "", "antifraudInfo", "Lcom/ybsdk/network/dto/StartSessionRequest$AntifraudInfo;", "skipRegistration", "", "originDeeplink", "", "<init>", "(Lcom/ybsdk/network/dto/StartSessionRequest$AntifraudInfo;Ljava/lang/Boolean;Ljava/lang/String;)V", "getAntifraudInfo", "()Lcom/ybsdk/network/dto/StartSessionRequest$AntifraudInfo;", "getSkipRegistration", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOriginDeeplink", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Lcom/ybsdk/network/dto/StartSessionRequest$AntifraudInfo;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/ybsdk/network/dto/StartSessionRequest;", "equals", "other", "hashCode", "", "toString", "AntifraudInfo", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class StartSessionRequest {
    private final AntifraudInfo antifraudInfo;
    private final String originDeeplink;
    private final Boolean skipRegistration;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/network/dto/StartSessionRequest$AntifraudInfo;", "", "deviceId", "", "metricaDeviceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDeviceId", "()Ljava/lang/String;", "getMetricaDeviceId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class AntifraudInfo {
        private final String deviceId;
        private final String metricaDeviceId;

        public AntifraudInfo(@Json(name = "device_id") String str, @Json(name = "metrica_device_id") String str2) {
            this.deviceId = str;
            this.metricaDeviceId = str2;
        }

        public static /* synthetic */ AntifraudInfo copy$default(AntifraudInfo antifraudInfo, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = antifraudInfo.deviceId;
            }
            if ((i & 2) != 0) {
                str2 = antifraudInfo.metricaDeviceId;
            }
            return antifraudInfo.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDeviceId() {
            return this.deviceId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMetricaDeviceId() {
            return this.metricaDeviceId;
        }

        public final AntifraudInfo copy(@Json(name = "device_id") String deviceId, @Json(name = "metrica_device_id") String metricaDeviceId) {
            return new AntifraudInfo(deviceId, metricaDeviceId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AntifraudInfo)) {
                return false;
            }
            AntifraudInfo antifraudInfo = (AntifraudInfo) other;
            return jl40.l(this.deviceId, antifraudInfo.deviceId) && jl40.l(this.metricaDeviceId, antifraudInfo.metricaDeviceId);
        }

        public final String getDeviceId() {
            return this.deviceId;
        }

        public final String getMetricaDeviceId() {
            return this.metricaDeviceId;
        }

        public int hashCode() {
            int hashCode = this.deviceId.hashCode() * 31;
            String str = this.metricaDeviceId;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return unr0.p("AntifraudInfo(deviceId=", this.deviceId, ", metricaDeviceId=", this.metricaDeviceId, Extension.C_BRAKE);
        }
    }

    public /* synthetic */ StartSessionRequest(AntifraudInfo antifraudInfo, Boolean bool, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(antifraudInfo, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str);
    }

    public static /* synthetic */ StartSessionRequest copy$default(StartSessionRequest startSessionRequest, AntifraudInfo antifraudInfo, Boolean bool, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            antifraudInfo = startSessionRequest.antifraudInfo;
        }
        if ((i & 2) != 0) {
            bool = startSessionRequest.skipRegistration;
        }
        if ((i & 4) != 0) {
            str = startSessionRequest.originDeeplink;
        }
        return startSessionRequest.copy(antifraudInfo, bool, str);
    }

    /* renamed from: component1, reason: from getter */
    public final AntifraudInfo getAntifraudInfo() {
        return this.antifraudInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getSkipRegistration() {
        return this.skipRegistration;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOriginDeeplink() {
        return this.originDeeplink;
    }

    public final StartSessionRequest copy(@Json(name = "antifraud_info") AntifraudInfo antifraudInfo, @Json(name = "skip_registration") Boolean skipRegistration, @Json(name = "origin_deeplink") String originDeeplink) {
        return new StartSessionRequest(antifraudInfo, skipRegistration, originDeeplink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartSessionRequest)) {
            return false;
        }
        StartSessionRequest startSessionRequest = (StartSessionRequest) other;
        return jl40.l(this.antifraudInfo, startSessionRequest.antifraudInfo) && jl40.l(this.skipRegistration, startSessionRequest.skipRegistration) && jl40.l(this.originDeeplink, startSessionRequest.originDeeplink);
    }

    public final AntifraudInfo getAntifraudInfo() {
        return this.antifraudInfo;
    }

    public final String getOriginDeeplink() {
        return this.originDeeplink;
    }

    public final Boolean getSkipRegistration() {
        return this.skipRegistration;
    }

    public int hashCode() {
        int hashCode = this.antifraudInfo.hashCode() * 31;
        Boolean bool = this.skipRegistration;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.originDeeplink;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        AntifraudInfo antifraudInfo = this.antifraudInfo;
        Boolean bool = this.skipRegistration;
        String str = this.originDeeplink;
        StringBuilder sb = new StringBuilder("StartSessionRequest(antifraudInfo=");
        sb.append(antifraudInfo);
        sb.append(", skipRegistration=");
        sb.append(bool);
        sb.append(", originDeeplink=");
        return oyr.t(sb, str, Extension.C_BRAKE);
    }

    public StartSessionRequest(@Json(name = "antifraud_info") AntifraudInfo antifraudInfo, @Json(name = "skip_registration") Boolean bool, @Json(name = "origin_deeplink") String str) {
        this.antifraudInfo = antifraudInfo;
        this.skipRegistration = bool;
        this.originDeeplink = str;
    }
}
