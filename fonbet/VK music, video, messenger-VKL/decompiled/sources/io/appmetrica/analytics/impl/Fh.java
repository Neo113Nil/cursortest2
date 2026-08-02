package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* loaded from: classes8.dex */
public final class Fh {
    public final C4722b6 a;
    public final boolean b;
    public final int c;
    public final HashMap d;
    public final Ph e;

    public Fh(C4722b6 c4722b6, boolean z, int i, HashMap hashMap, Ph ph) {
        this.a = c4722b6;
        this.b = z;
        this.c = i;
        this.d = hashMap;
        this.e = ph;
    }

    public final String toString() {
        return "ReportToSend(report=" + this.a + ", serviceDataReporterType=" + this.c + ", environment=" + this.e + ", isCrashReport=" + this.b + ", trimmedFields=" + this.d + ')';
    }
}
