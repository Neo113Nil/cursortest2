package ru.rustore.sdk.appupdate.model;

import xsna.vu5;

/* loaded from: classes9.dex */
public final class AppUpdateParams {
    private final long versionCode;

    public AppUpdateParams(long j) {
        this.versionCode = j;
    }

    public static /* synthetic */ AppUpdateParams copy$default(AppUpdateParams appUpdateParams, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = appUpdateParams.versionCode;
        }
        return appUpdateParams.copy(j);
    }

    public final long component1() {
        return this.versionCode;
    }

    public final AppUpdateParams copy(long j) {
        return new AppUpdateParams(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppUpdateParams) && this.versionCode == ((AppUpdateParams) obj).versionCode;
    }

    public final long getVersionCode() {
        return this.versionCode;
    }

    public int hashCode() {
        return Long.hashCode(this.versionCode);
    }

    public String toString() {
        return vu5.a(')', this.versionCode, new StringBuilder("AppUpdateParams(versionCode="));
    }
}
