package io.appmetrica.analytics.ndkcrashesapi.internal;

import xsna.zcl;

/* loaded from: classes8.dex */
public final class NativeCrash {
    private final NativeCrashSource a;
    private final String b;
    private final String c;
    private final String d;
    private final long e;
    private final String f;

    public static final class Builder {
        private final NativeCrashSource a;
        private final String b;
        private final String c;
        private final String d;
        private final long e;
        private final String f;

        public Builder(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j, String str4) {
            this.a = nativeCrashSource;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = j;
            this.f = str4;
        }

        public final NativeCrash build() {
            return new NativeCrash(this.a, this.b, this.c, this.d, this.e, this.f, null);
        }
    }

    public /* synthetic */ NativeCrash(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j, String str4, zcl zclVar) {
        this(nativeCrashSource, str, str2, str3, j, str4);
    }

    public final long getCreationTime() {
        return this.e;
    }

    public final String getDumpFile() {
        return this.d;
    }

    public final String getHandlerVersion() {
        return this.b;
    }

    public final String getMetadata() {
        return this.f;
    }

    public final NativeCrashSource getSource() {
        return this.a;
    }

    public final String getUuid() {
        return this.c;
    }

    private NativeCrash(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j, String str4) {
        this.a = nativeCrashSource;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = j;
        this.f = str4;
    }
}
