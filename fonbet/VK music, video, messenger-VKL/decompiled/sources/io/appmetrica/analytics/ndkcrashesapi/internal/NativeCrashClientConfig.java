package io.appmetrica.analytics.ndkcrashesapi.internal;

/* loaded from: classes8.dex */
public final class NativeCrashClientConfig {
    private final String a;
    private final String b;

    public NativeCrashClientConfig(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String getNativeCrashFolder() {
        return this.a;
    }

    public final String getNativeCrashMetadata() {
        return this.b;
    }
}
