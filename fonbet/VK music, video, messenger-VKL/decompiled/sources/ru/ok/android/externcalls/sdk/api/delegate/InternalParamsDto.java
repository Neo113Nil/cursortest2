package ru.ok.android.externcalls.sdk.api.delegate;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.epx;
import xsna.gsi0;
import xsna.i5s;
import xsna.jax0;
import xsna.n6j;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.xe9;

/* compiled from: InternalParamsDto.kt */
/* loaded from: classes9.dex */
public final class InternalParamsDto {
    private final String clientAppKey;
    private final String deviceId;
    private final String domainId;
    private final String hexCapability;
    private final boolean isWaitForAdminEnabled;
    private final boolean onlyAdminCanRecord;
    private final String platform;
    private final int protocolVersion;
    private final String sdkVersion;

    public InternalParamsDto(String str, String str2, String str3, String str4, int i, String str5, boolean z, boolean z2, String str6) {
        this.platform = str;
        this.sdkVersion = str2;
        this.clientAppKey = str3;
        this.deviceId = str4;
        this.protocolVersion = i;
        this.domainId = str5;
        this.onlyAdminCanRecord = z;
        this.isWaitForAdminEnabled = z2;
        this.hexCapability = str6;
    }

    public static /* synthetic */ InternalParamsDto copy$default(InternalParamsDto internalParamsDto, String str, String str2, String str3, String str4, int i, String str5, boolean z, boolean z2, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = internalParamsDto.platform;
        }
        if ((i2 & 2) != 0) {
            str2 = internalParamsDto.sdkVersion;
        }
        if ((i2 & 4) != 0) {
            str3 = internalParamsDto.clientAppKey;
        }
        if ((i2 & 8) != 0) {
            str4 = internalParamsDto.deviceId;
        }
        if ((i2 & 16) != 0) {
            i = internalParamsDto.protocolVersion;
        }
        if ((i2 & 32) != 0) {
            str5 = internalParamsDto.domainId;
        }
        if ((i2 & 64) != 0) {
            z = internalParamsDto.onlyAdminCanRecord;
        }
        if ((i2 & 128) != 0) {
            z2 = internalParamsDto.isWaitForAdminEnabled;
        }
        if ((i2 & 256) != 0) {
            str6 = internalParamsDto.hexCapability;
        }
        boolean z3 = z2;
        String str7 = str6;
        String str8 = str5;
        boolean z4 = z;
        int i3 = i;
        String str9 = str3;
        return internalParamsDto.copy(str, str2, str9, str4, i3, str8, z4, z3, str7);
    }

    public final String component1() {
        return this.platform;
    }

    public final String component2() {
        return this.sdkVersion;
    }

    public final String component3() {
        return this.clientAppKey;
    }

    public final String component4() {
        return this.deviceId;
    }

    public final int component5() {
        return this.protocolVersion;
    }

    public final String component6() {
        return this.domainId;
    }

    public final boolean component7() {
        return this.onlyAdminCanRecord;
    }

    public final boolean component8() {
        return this.isWaitForAdminEnabled;
    }

    public final String component9() {
        return this.hexCapability;
    }

    public final InternalParamsDto copy(String str, String str2, String str3, String str4, int i, String str5, boolean z, boolean z2, String str6) {
        return new InternalParamsDto(str, str2, str3, str4, i, str5, z, z2, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InternalParamsDto)) {
            return false;
        }
        InternalParamsDto internalParamsDto = (InternalParamsDto) obj;
        return epx.f(this.platform, internalParamsDto.platform) && epx.f(this.sdkVersion, internalParamsDto.sdkVersion) && epx.f(this.clientAppKey, internalParamsDto.clientAppKey) && epx.f(this.deviceId, internalParamsDto.deviceId) && this.protocolVersion == internalParamsDto.protocolVersion && epx.f(this.domainId, internalParamsDto.domainId) && this.onlyAdminCanRecord == internalParamsDto.onlyAdminCanRecord && this.isWaitForAdminEnabled == internalParamsDto.isWaitForAdminEnabled && epx.f(this.hexCapability, internalParamsDto.hexCapability);
    }

    public final String getClientAppKey() {
        return this.clientAppKey;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getDomainId() {
        return this.domainId;
    }

    public final String getHexCapability() {
        return this.hexCapability;
    }

    public final boolean getOnlyAdminCanRecord() {
        return this.onlyAdminCanRecord;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final int getProtocolVersion() {
        return this.protocolVersion;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public int hashCode() {
        int a = urd0.a(this.platform.hashCode() * 31, 31, this.sdkVersion);
        String str = this.clientAppKey;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deviceId;
        int a2 = shy.a(this.protocolVersion, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.domainId;
        return this.hexCapability.hashCode() + qoy.b(qoy.b((a2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.onlyAdminCanRecord), 31, this.isWaitForAdminEnabled);
    }

    public final boolean isWaitForAdminEnabled() {
        return this.isWaitForAdminEnabled;
    }

    public final String toJson() {
        return new JSONObject().put("platform", this.platform).put("sdkVersion", this.sdkVersion).putOpt(ApiProtocol.PARAM_CLIENT_APP_KEY, this.clientAppKey).putOpt(ApiProtocol.PARAM_DEVICE_ID, this.deviceId).put(ApiProtocol.PARAM_PROTOCOL_VERSION, this.protocolVersion).putOpt(ApiProtocol.PARAM_DOMAIN_ID, this.domainId).put(ApiProtocol.PARAM_ONLY_ADMIN_CAN_RECORD, this.onlyAdminCanRecord).put(ApiProtocol.PARAM_WAIT_FOR_ADMIN, this.isWaitForAdminEnabled).put("capabilities", this.hexCapability).toString();
    }

    public String toString() {
        String str = this.platform;
        String str2 = this.sdkVersion;
        String str3 = this.clientAppKey;
        String str4 = this.deviceId;
        int i = this.protocolVersion;
        String str5 = this.domainId;
        boolean z = this.onlyAdminCanRecord;
        boolean z2 = this.isWaitForAdminEnabled;
        String str6 = this.hexCapability;
        StringBuilder a = xe9.a("InternalParamsDto(platform=", str, ", sdkVersion=", str2, ", clientAppKey=");
        n6j.b(a, str3, ", deviceId=", str4, ", protocolVersion=");
        jax0.a(i, ", domainId=", str5, ", onlyAdminCanRecord=", a);
        gsi0.c(a, z, ", isWaitForAdminEnabled=", z2, ", hexCapability=");
        return i5s.a(a, str6, ")");
    }
}
