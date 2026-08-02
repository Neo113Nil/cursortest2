package ru.ok.tracer;

/* compiled from: HostedTracerLibraryInfo.kt */
/* loaded from: classes11.dex */
public final class HostedTracerLibraryInfo {
    private final String buildUuid;
    private final String environment;
    private final String packageName;
    private final String versionName;

    public HostedTracerLibraryInfo(String str, String str2, String str3, String str4) {
        this.packageName = str;
        this.versionName = str2;
        this.buildUuid = str3;
        this.environment = str4;
    }

    public final String getBuildUuid() {
        return this.buildUuid;
    }

    public final String getEnvironment() {
        return this.environment;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getVersionName() {
        return this.versionName;
    }
}
