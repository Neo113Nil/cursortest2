package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import xsna.epx;
import xsna.ho8;
import xsna.shy;
import xsna.urd0;

/* loaded from: classes8.dex */
public final class H0 {
    public final String a;
    public final String b;
    public final CounterConfigurationReporterType c;
    public final int d;
    public final String e;
    public final String f;

    public H0(String str, String str2, CounterConfigurationReporterType counterConfigurationReporterType, int i, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = counterConfigurationReporterType;
        this.d = i;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H0)) {
            return false;
        }
        H0 h0 = (H0) obj;
        return epx.f(this.a, h0.a) && epx.f(this.b, h0.b) && this.c == h0.c && this.d == h0.d && epx.f(this.e, h0.e) && epx.f(this.f, h0.f);
    }

    public final int hashCode() {
        int a = urd0.a(shy.a(this.d, (this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b)) * 31, 31), 31, this.e);
        String str = this.f;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppMetricaNativeCrashMetadata(apiKey=");
        sb.append(this.a);
        sb.append(", packageName=");
        sb.append(this.b);
        sb.append(", reporterType=");
        sb.append(this.c);
        sb.append(", processID=");
        sb.append(this.d);
        sb.append(", processSessionID=");
        sb.append(this.e);
        sb.append(", errorEnvironment=");
        return ho8.a(sb, this.f, ')');
    }
}
