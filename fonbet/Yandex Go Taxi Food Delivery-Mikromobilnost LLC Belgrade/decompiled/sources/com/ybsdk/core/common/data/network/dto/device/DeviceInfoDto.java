package com.ybsdk.core.common.data.network.dto.device;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006!"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/device/DeviceInfoDto;", "", "model", "", "screenResolutionWidth", "Lcom/ybsdk/core/common/data/network/dto/device/ScreenResolutionDto;", "screenResolutionHeight", "operationSystem", "deviceId", "uuid", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/device/ScreenResolutionDto;Lcom/ybsdk/core/common/data/network/dto/device/ScreenResolutionDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getModel", "()Ljava/lang/String;", "getScreenResolutionWidth", "()Lcom/ybsdk/core/common/data/network/dto/device/ScreenResolutionDto;", "getScreenResolutionHeight", "getOperationSystem", "getDeviceId", "getUuid", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DeviceInfoDto {
    private final String deviceId;
    private final String model;
    private final String operationSystem;
    private final ScreenResolutionDto screenResolutionHeight;
    private final ScreenResolutionDto screenResolutionWidth;
    private final String uuid;

    public DeviceInfoDto(@Json(name = "model") String str, @Json(name = "screen_resolution_width") ScreenResolutionDto screenResolutionDto, @Json(name = "screen_resolution_height") ScreenResolutionDto screenResolutionDto2, @Json(name = "operation_system") String str2, @Json(name = "device_id") String str3, @Json(name = "uuid") String str4) {
        this.model = str;
        this.screenResolutionWidth = screenResolutionDto;
        this.screenResolutionHeight = screenResolutionDto2;
        this.operationSystem = str2;
        this.deviceId = str3;
        this.uuid = str4;
    }

    public static /* synthetic */ DeviceInfoDto copy$default(DeviceInfoDto deviceInfoDto, String str, ScreenResolutionDto screenResolutionDto, ScreenResolutionDto screenResolutionDto2, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceInfoDto.model;
        }
        if ((i & 2) != 0) {
            screenResolutionDto = deviceInfoDto.screenResolutionWidth;
        }
        if ((i & 4) != 0) {
            screenResolutionDto2 = deviceInfoDto.screenResolutionHeight;
        }
        if ((i & 8) != 0) {
            str2 = deviceInfoDto.operationSystem;
        }
        if ((i & 16) != 0) {
            str3 = deviceInfoDto.deviceId;
        }
        if ((i & 32) != 0) {
            str4 = deviceInfoDto.uuid;
        }
        String str5 = str3;
        String str6 = str4;
        return deviceInfoDto.copy(str, screenResolutionDto, screenResolutionDto2, str2, str5, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* renamed from: component2, reason: from getter */
    public final ScreenResolutionDto getScreenResolutionWidth() {
        return this.screenResolutionWidth;
    }

    /* renamed from: component3, reason: from getter */
    public final ScreenResolutionDto getScreenResolutionHeight() {
        return this.screenResolutionHeight;
    }

    /* renamed from: component4, reason: from getter */
    public final String getOperationSystem() {
        return this.operationSystem;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    public final DeviceInfoDto copy(@Json(name = "model") String model, @Json(name = "screen_resolution_width") ScreenResolutionDto screenResolutionWidth, @Json(name = "screen_resolution_height") ScreenResolutionDto screenResolutionHeight, @Json(name = "operation_system") String operationSystem, @Json(name = "device_id") String deviceId, @Json(name = "uuid") String uuid) {
        return new DeviceInfoDto(model, screenResolutionWidth, screenResolutionHeight, operationSystem, deviceId, uuid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceInfoDto)) {
            return false;
        }
        DeviceInfoDto deviceInfoDto = (DeviceInfoDto) other;
        return jl40.l(this.model, deviceInfoDto.model) && jl40.l(this.screenResolutionWidth, deviceInfoDto.screenResolutionWidth) && jl40.l(this.screenResolutionHeight, deviceInfoDto.screenResolutionHeight) && jl40.l(this.operationSystem, deviceInfoDto.operationSystem) && jl40.l(this.deviceId, deviceInfoDto.deviceId) && jl40.l(this.uuid, deviceInfoDto.uuid);
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getOperationSystem() {
        return this.operationSystem;
    }

    public final ScreenResolutionDto getScreenResolutionHeight() {
        return this.screenResolutionHeight;
    }

    public final ScreenResolutionDto getScreenResolutionWidth() {
        return this.screenResolutionWidth;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return this.uuid.hashCode() + unr0.b(unr0.b((this.screenResolutionHeight.hashCode() + ((this.screenResolutionWidth.hashCode() + (this.model.hashCode() * 31)) * 31)) * 31, 31, this.operationSystem), 31, this.deviceId);
    }

    public String toString() {
        String str = this.model;
        ScreenResolutionDto screenResolutionDto = this.screenResolutionWidth;
        ScreenResolutionDto screenResolutionDto2 = this.screenResolutionHeight;
        String str2 = this.operationSystem;
        String str3 = this.deviceId;
        String str4 = this.uuid;
        StringBuilder sb = new StringBuilder("DeviceInfoDto(model=");
        sb.append(str);
        sb.append(", screenResolutionWidth=");
        sb.append(screenResolutionDto);
        sb.append(", screenResolutionHeight=");
        sb.append(screenResolutionDto2);
        sb.append(", operationSystem=");
        sb.append(str2);
        sb.append(", deviceId=");
        return g8e.r(sb, str3, ", uuid=", str4, Extension.C_BRAKE);
    }
}
