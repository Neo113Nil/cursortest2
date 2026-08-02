package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

/* renamed from: io.appmetrica.analytics.impl.fi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC4837fi implements Runnable {
    public final /* synthetic */ ModuleEvent a;
    public final /* synthetic */ C5122qi b;

    public RunnableC4837fi(C5122qi c5122qi, ModuleEvent moduleEvent) {
        this.b = c5122qi;
        this.a = moduleEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5122qi c5122qi = this.b;
        C5122qi.a(c5122qi.a, c5122qi.d, c5122qi.e).reportEvent(this.a);
    }
}
