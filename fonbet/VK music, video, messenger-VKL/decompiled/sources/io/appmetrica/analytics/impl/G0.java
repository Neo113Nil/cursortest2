package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import xsna.bh10;
import xsna.epx;
import xsna.urd0;

/* loaded from: classes8.dex */
public final class G0 {
    public final NativeCrashSource a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final H0 f;

    public G0(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j, H0 h0) {
        this.a = nativeCrashSource;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = j;
        this.f = h0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G0)) {
            return false;
        }
        G0 g0 = (G0) obj;
        return this.a == g0.a && epx.f(this.b, g0.b) && epx.f(this.c, g0.c) && epx.f(this.d, g0.d) && this.e == g0.e && epx.f(this.f, g0.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + bh10.a(urd0.a(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "AppMetricaNativeCrash(source=" + this.a + ", handlerVersion=" + this.b + ", uuid=" + this.c + ", dumpFile=" + this.d + ", creationTime=" + this.e + ", metadata=" + this.f + ')';
    }
}
