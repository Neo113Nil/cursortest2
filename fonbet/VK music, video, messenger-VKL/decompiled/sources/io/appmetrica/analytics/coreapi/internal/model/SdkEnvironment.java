package io.appmetrica.analytics.coreapi.internal.model;

import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.urd0;

/* loaded from: classes8.dex */
public final class SdkEnvironment {
    private final AppVersionInfo a;
    private final String b;
    private final ScreenInfo c;
    private final SdkInfo d;
    private final String e;
    private final List f;

    public SdkEnvironment(AppVersionInfo appVersionInfo, String str, ScreenInfo screenInfo, SdkInfo sdkInfo, String str2, List<String> list) {
        this.a = appVersionInfo;
        this.b = str;
        this.c = screenInfo;
        this.d = sdkInfo;
        this.e = str2;
        this.f = list;
    }

    public static /* synthetic */ SdkEnvironment copy$default(SdkEnvironment sdkEnvironment, AppVersionInfo appVersionInfo, String str, ScreenInfo screenInfo, SdkInfo sdkInfo, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            appVersionInfo = sdkEnvironment.a;
        }
        if ((i & 2) != 0) {
            str = sdkEnvironment.b;
        }
        if ((i & 4) != 0) {
            screenInfo = sdkEnvironment.c;
        }
        if ((i & 8) != 0) {
            sdkInfo = sdkEnvironment.d;
        }
        if ((i & 16) != 0) {
            str2 = sdkEnvironment.e;
        }
        if ((i & 32) != 0) {
            list = sdkEnvironment.f;
        }
        String str3 = str2;
        List list2 = list;
        return sdkEnvironment.copy(appVersionInfo, str, screenInfo, sdkInfo, str3, list2);
    }

    public final AppVersionInfo component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public final ScreenInfo component3() {
        return this.c;
    }

    public final SdkInfo component4() {
        return this.d;
    }

    public final String component5() {
        return this.e;
    }

    public final List<String> component6() {
        return this.f;
    }

    public final SdkEnvironment copy(AppVersionInfo appVersionInfo, String str, ScreenInfo screenInfo, SdkInfo sdkInfo, String str2, List<String> list) {
        return new SdkEnvironment(appVersionInfo, str, screenInfo, sdkInfo, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkEnvironment)) {
            return false;
        }
        SdkEnvironment sdkEnvironment = (SdkEnvironment) obj;
        return epx.f(this.a, sdkEnvironment.a) && epx.f(this.b, sdkEnvironment.b) && epx.f(this.c, sdkEnvironment.c) && epx.f(this.d, sdkEnvironment.d) && epx.f(this.e, sdkEnvironment.e) && epx.f(this.f, sdkEnvironment.f);
    }

    public final String getAppFramework() {
        return this.b;
    }

    public final AppVersionInfo getAppVersionInfo() {
        return this.a;
    }

    public final String getDeviceType() {
        return this.e;
    }

    public final List<String> getLocales() {
        return this.f;
    }

    public final ScreenInfo getScreenInfo() {
        return this.c;
    }

    public final SdkInfo getSdkInfo() {
        return this.d;
    }

    public int hashCode() {
        return this.f.hashCode() + urd0.a((this.d.hashCode() + ((this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SdkEnvironment(appVersionInfo=");
        sb.append(this.a);
        sb.append(", appFramework=");
        sb.append(this.b);
        sb.append(", screenInfo=");
        sb.append(this.c);
        sb.append(", sdkInfo=");
        sb.append(this.d);
        sb.append(", deviceType=");
        sb.append(this.e);
        sb.append(", locales=");
        return ms9.a(')', sb, this.f);
    }
}
