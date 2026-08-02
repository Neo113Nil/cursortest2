package com.ybsdk.common;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import com.ybsdk.core.common.data.network.dto.device.DeviceInfoDto;
import com.ybsdk.core.common.data.network.dto.device.ScreenResolutionDto;
import defpackage.ny61;
import defpackage.yvi0;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class b {
    public final DeviceIdProvider a;
    public final yvi0 b;

    public b(DeviceIdProvider deviceIdProvider, yvi0 yvi0Var) {
        this.a = deviceIdProvider;
        this.b = yvi0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        DeviceInfoDtoProviderImpl$getDeviceInfoDto$1 deviceInfoDtoProviderImpl$getDeviceInfoDto$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str;
        ScreenResolutionDto screenResolutionDto;
        String str2;
        ScreenResolutionDto screenResolutionDto2;
        String str3;
        Object u;
        String str4;
        String str5;
        ScreenResolutionDto screenResolutionDto3;
        String str6;
        ScreenResolutionDto screenResolutionDto4;
        if (continuationImpl instanceof DeviceInfoDtoProviderImpl$getDeviceInfoDto$1) {
            deviceInfoDtoProviderImpl$getDeviceInfoDto$1 = (DeviceInfoDtoProviderImpl$getDeviceInfoDto$1) continuationImpl;
            int i2 = deviceInfoDtoProviderImpl$getDeviceInfoDto$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deviceInfoDtoProviderImpl$getDeviceInfoDto$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deviceInfoDtoProviderImpl$getDeviceInfoDto$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deviceInfoDtoProviderImpl$getDeviceInfoDto$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                    Configuration configuration = Resources.getSystem().getConfiguration();
                    str = Build.MODEL;
                    screenResolutionDto = new ScreenResolutionDto(configuration.screenWidthDp, displayMetrics.widthPixels);
                    ScreenResolutionDto screenResolutionDto5 = new ScreenResolutionDto(configuration.screenHeightDp, displayMetrics.heightPixels);
                    deviceInfoDtoProviderImpl$getDeviceInfoDto$1.L$0 = str;
                    deviceInfoDtoProviderImpl$getDeviceInfoDto$1.L$1 = screenResolutionDto;
                    deviceInfoDtoProviderImpl$getDeviceInfoDto$1.L$2 = screenResolutionDto5;
                    deviceInfoDtoProviderImpl$getDeviceInfoDto$1.L$3 = ConstantDeviceInfo.APP_PLATFORM;
                    deviceInfoDtoProviderImpl$getDeviceInfoDto$1.label = 1;
                    Object d = this.a.d(deviceInfoDtoProviderImpl$getDeviceInfoDto$1);
                    if (d != coroutineSingletons) {
                        str2 = ConstantDeviceInfo.APP_PLATFORM;
                        obj = d;
                        screenResolutionDto2 = screenResolutionDto5;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str7 = (String) deviceInfoDtoProviderImpl$getDeviceInfoDto$1.L$4;
                    String str8 = (String) deviceInfoDtoProviderImpl$getDeviceInfoDto$1.L$3;
                    ScreenResolutionDto screenResolutionDto6 = (ScreenResolutionDto) deviceInfoDtoProviderImpl$getDeviceInfoDto$1.L$2;
                    ScreenResolutionDto screenResolutionDto7 = (ScreenResolutionDto) deviceInfoDtoProviderImpl$getDeviceInfoDto$1.L$1;
                    String str9 = (String) deviceInfoDtoProviderImpl$getDeviceInfoDto$1.L$0;
                    kotlin.b.b(obj);
                    str4 = str7;
                    str6 = str9;
                    str5 = str8;
                    screenResolutionDto3 = screenResolutionDto6;
                    screenResolutionDto4 = screenResolutionDto7;
                    String str10 = (String) obj;
                    return new DeviceInfoDto(str6, screenResolutionDto4, screenResolutionDto3, str5, str4, str10 != null ? "" : str10);
                }
                str2 = (String) deviceInfoDtoProviderImpl$getDeviceInfoDto$1.L$3;
                screenResolutionDto2 = (ScreenResolutionDto) deviceInfoDtoProviderImpl$getDeviceInfoDto$1.L$2;
                ScreenResolutionDto screenResolutionDto8 = (ScreenResolutionDto) deviceInfoDtoProviderImpl$getDeviceInfoDto$1.L$1;
                String str11 = (String) deviceInfoDtoProviderImpl$getDeviceInfoDto$1.L$0;
                kotlin.b.b(obj);
                screenResolutionDto = screenResolutionDto8;
                str = str11;
                str3 = (String) obj;
                if (str3 == null) {
                    str3 = "";
                }
                deviceInfoDtoProviderImpl$getDeviceInfoDto$1.L$0 = str;
                deviceInfoDtoProviderImpl$getDeviceInfoDto$1.L$1 = screenResolutionDto;
                deviceInfoDtoProviderImpl$getDeviceInfoDto$1.L$2 = screenResolutionDto2;
                deviceInfoDtoProviderImpl$getDeviceInfoDto$1.L$3 = str2;
                deviceInfoDtoProviderImpl$getDeviceInfoDto$1.L$4 = str3;
                deviceInfoDtoProviderImpl$getDeviceInfoDto$1.label = 2;
                u = this.b.u(deviceInfoDtoProviderImpl$getDeviceInfoDto$1);
                if (u != coroutineSingletons) {
                    str4 = str3;
                    str5 = str2;
                    screenResolutionDto3 = screenResolutionDto2;
                    str6 = str;
                    screenResolutionDto4 = screenResolutionDto;
                    obj = u;
                    String str102 = (String) obj;
                    return new DeviceInfoDto(str6, screenResolutionDto4, screenResolutionDto3, str5, str4, str102 != null ? "" : str102);
                }
                return coroutineSingletons;
            }
        }
        deviceInfoDtoProviderImpl$getDeviceInfoDto$1 = new DeviceInfoDtoProviderImpl$getDeviceInfoDto$1(this, continuationImpl);
        Object obj2 = deviceInfoDtoProviderImpl$getDeviceInfoDto$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deviceInfoDtoProviderImpl$getDeviceInfoDto$1.label;
        if (i != 0) {
        }
        str3 = (String) obj2;
        if (str3 == null) {
        }
        deviceInfoDtoProviderImpl$getDeviceInfoDto$1.L$0 = str;
        deviceInfoDtoProviderImpl$getDeviceInfoDto$1.L$1 = screenResolutionDto;
        deviceInfoDtoProviderImpl$getDeviceInfoDto$1.L$2 = screenResolutionDto2;
        deviceInfoDtoProviderImpl$getDeviceInfoDto$1.L$3 = str2;
        deviceInfoDtoProviderImpl$getDeviceInfoDto$1.L$4 = str3;
        deviceInfoDtoProviderImpl$getDeviceInfoDto$1.label = 2;
        u = this.b.u(deviceInfoDtoProviderImpl$getDeviceInfoDto$1);
        if (u != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
