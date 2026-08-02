package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JF\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0012J\u001a\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u0003\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010\u0016¨\u0006'"}, d2 = {"Lcom/ybsdk/rconfig/configs/AppUpdateDto;", "", "", "isEnabled", "", "minVersionBuildNumberForUpdate", "", "showPeriodInDays", "installUpdatePeriodInDays", "Lcom/ybsdk/rconfig/configs/AppUpdateUiDataDto;", "uiData", "<init>", "(ZLjava/lang/String;ILjava/lang/Integer;Lcom/ybsdk/rconfig/configs/AppUpdateUiDataDto;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "()I", "component4", "()Ljava/lang/Integer;", "component5", "()Lcom/ybsdk/rconfig/configs/AppUpdateUiDataDto;", "copy", "(ZLjava/lang/String;ILjava/lang/Integer;Lcom/ybsdk/rconfig/configs/AppUpdateUiDataDto;)Lcom/ybsdk/rconfig/configs/AppUpdateDto;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Ljava/lang/String;", "getMinVersionBuildNumberForUpdate", CA20Status.STATUS_USER_I, "getShowPeriodInDays", "Ljava/lang/Integer;", "getInstallUpdatePeriodInDays", "Lcom/ybsdk/rconfig/configs/AppUpdateUiDataDto;", "getUiData", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AppUpdateDto {

    @Json(name = "install_update_period_in_days")
    private final Integer installUpdatePeriodInDays;

    @Json(name = "is_enabled")
    private final boolean isEnabled;

    @Json(name = "min_version_build_number_for_update")
    private final String minVersionBuildNumberForUpdate;

    @Json(name = "show_period_in_day_for_flexible_update")
    private final int showPeriodInDays;

    @Json(name = "ui_data")
    private final AppUpdateUiDataDto uiData;

    public AppUpdateDto(boolean z, String str, int i, Integer num, AppUpdateUiDataDto appUpdateUiDataDto) {
        this.isEnabled = z;
        this.minVersionBuildNumberForUpdate = str;
        this.showPeriodInDays = i;
        this.installUpdatePeriodInDays = num;
        this.uiData = appUpdateUiDataDto;
    }

    public static /* synthetic */ AppUpdateDto copy$default(AppUpdateDto appUpdateDto, boolean z, String str, int i, Integer num, AppUpdateUiDataDto appUpdateUiDataDto, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = appUpdateDto.isEnabled;
        }
        if ((i2 & 2) != 0) {
            str = appUpdateDto.minVersionBuildNumberForUpdate;
        }
        if ((i2 & 4) != 0) {
            i = appUpdateDto.showPeriodInDays;
        }
        if ((i2 & 8) != 0) {
            num = appUpdateDto.installUpdatePeriodInDays;
        }
        if ((i2 & 16) != 0) {
            appUpdateUiDataDto = appUpdateDto.uiData;
        }
        AppUpdateUiDataDto appUpdateUiDataDto2 = appUpdateUiDataDto;
        int i3 = i;
        return appUpdateDto.copy(z, str, i3, num, appUpdateUiDataDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMinVersionBuildNumberForUpdate() {
        return this.minVersionBuildNumberForUpdate;
    }

    /* renamed from: component3, reason: from getter */
    public final int getShowPeriodInDays() {
        return this.showPeriodInDays;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getInstallUpdatePeriodInDays() {
        return this.installUpdatePeriodInDays;
    }

    /* renamed from: component5, reason: from getter */
    public final AppUpdateUiDataDto getUiData() {
        return this.uiData;
    }

    public final AppUpdateDto copy(boolean isEnabled, String minVersionBuildNumberForUpdate, int showPeriodInDays, Integer installUpdatePeriodInDays, AppUpdateUiDataDto uiData) {
        return new AppUpdateDto(isEnabled, minVersionBuildNumberForUpdate, showPeriodInDays, installUpdatePeriodInDays, uiData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppUpdateDto)) {
            return false;
        }
        AppUpdateDto appUpdateDto = (AppUpdateDto) other;
        return this.isEnabled == appUpdateDto.isEnabled && jl40.l(this.minVersionBuildNumberForUpdate, appUpdateDto.minVersionBuildNumberForUpdate) && this.showPeriodInDays == appUpdateDto.showPeriodInDays && jl40.l(this.installUpdatePeriodInDays, appUpdateDto.installUpdatePeriodInDays) && jl40.l(this.uiData, appUpdateDto.uiData);
    }

    public final Integer getInstallUpdatePeriodInDays() {
        return this.installUpdatePeriodInDays;
    }

    public final String getMinVersionBuildNumberForUpdate() {
        return this.minVersionBuildNumberForUpdate;
    }

    public final int getShowPeriodInDays() {
        return this.showPeriodInDays;
    }

    public final AppUpdateUiDataDto getUiData() {
        return this.uiData;
    }

    public int hashCode() {
        int b = oyr.b(this.showPeriodInDays, unr0.b(Boolean.hashCode(this.isEnabled) * 31, 31, this.minVersionBuildNumberForUpdate), 31);
        Integer num = this.installUpdatePeriodInDays;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        AppUpdateUiDataDto appUpdateUiDataDto = this.uiData;
        return hashCode + (appUpdateUiDataDto != null ? appUpdateUiDataDto.hashCode() : 0);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        boolean z = this.isEnabled;
        String str = this.minVersionBuildNumberForUpdate;
        int i = this.showPeriodInDays;
        Integer num = this.installUpdatePeriodInDays;
        AppUpdateUiDataDto appUpdateUiDataDto = this.uiData;
        StringBuilder v = ly3.v("AppUpdateDto(isEnabled=", ", minVersionBuildNumberForUpdate=", str, ", showPeriodInDays=", z);
        v.append(i);
        v.append(", installUpdatePeriodInDays=");
        v.append(num);
        v.append(", uiData=");
        v.append(appUpdateUiDataDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
