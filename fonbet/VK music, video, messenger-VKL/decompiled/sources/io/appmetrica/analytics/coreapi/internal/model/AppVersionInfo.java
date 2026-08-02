package io.appmetrica.analytics.coreapi.internal.model;

import xsna.epx;
import xsna.ho8;

/* loaded from: classes8.dex */
public final class AppVersionInfo {
    private final String a;
    private final String b;

    public AppVersionInfo(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static /* synthetic */ AppVersionInfo copy$default(AppVersionInfo appVersionInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appVersionInfo.a;
        }
        if ((i & 2) != 0) {
            str2 = appVersionInfo.b;
        }
        return appVersionInfo.copy(str, str2);
    }

    public final String component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public final AppVersionInfo copy(String str, String str2) {
        return new AppVersionInfo(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppVersionInfo)) {
            return false;
        }
        AppVersionInfo appVersionInfo = (AppVersionInfo) obj;
        return epx.f(this.a, appVersionInfo.a) && epx.f(this.b, appVersionInfo.b);
    }

    public final String getAppBuildNumber() {
        return this.b;
    }

    public final String getAppVersionName() {
        return this.a;
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AppVersionInfo(appVersionName=");
        sb.append(this.a);
        sb.append(", appBuildNumber=");
        return ho8.a(sb, this.b, ')');
    }
}
