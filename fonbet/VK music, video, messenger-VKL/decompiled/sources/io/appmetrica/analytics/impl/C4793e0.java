package io.appmetrica.analytics.impl;

import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.e0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4793e0 implements Mn {
    public final /* synthetic */ C4819f0 a;

    public C4793e0(C4819f0 c4819f0) {
        this.a = c4819f0;
    }

    @Override // io.appmetrica.analytics.impl.Mn
    public final Thread a() {
        return this.a.b;
    }

    @Override // io.appmetrica.analytics.impl.Mn
    public final StackTraceElement[] b() {
        C4819f0 c4819f0 = this.a;
        return (StackTraceElement[]) c4819f0.a.get(c4819f0.b);
    }

    @Override // io.appmetrica.analytics.impl.Mn
    public final Map<Thread, StackTraceElement[]> c() {
        return this.a.a;
    }
}
