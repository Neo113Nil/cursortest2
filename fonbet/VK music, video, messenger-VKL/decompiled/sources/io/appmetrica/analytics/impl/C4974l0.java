package io.appmetrica.analytics.impl;

import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.l0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4974l0 {
    public final List a;
    public final boolean b;

    public C4974l0(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppMetricaConfigExtension(autoCollectedDataSubscribers=");
        sb.append(this.a);
        sb.append(", needClearEnvironment=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
