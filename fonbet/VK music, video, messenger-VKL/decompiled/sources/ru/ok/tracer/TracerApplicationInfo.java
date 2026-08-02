package ru.ok.tracer;

/* compiled from: TracerApplicationInfo.kt */
/* loaded from: classes11.dex */
public final class TracerApplicationInfo {
    private final String buildUuid;
    private final String environment;
    private final long longVersionCode;
    private final String packageName;
    private final String versionName;

    public TracerApplicationInfo(String str, String str2, long j, String str3, String str4) {
        this.packageName = str;
        this.versionName = str2;
        this.longVersionCode = j;
        this.buildUuid = str3;
        this.environment = str4;
    }

    public final String getBuildUuid() {
        return this.buildUuid;
    }

    public final String getEnvironment() {
        return this.environment;
    }

    public final long getLongVersionCode() {
        return this.longVersionCode;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final int getVersionCode() {
        return (int) this.longVersionCode;
    }

    public final String getVersionName() {
        return this.versionName;
    }
}
