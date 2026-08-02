package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;

/* renamed from: io.appmetrica.analytics.impl.k1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC4949k1 implements Runnable {
    public final /* synthetic */ AnrListener a;
    public final /* synthetic */ C5208u1 b;

    public RunnableC4949k1(C5208u1 c5208u1, AnrListener anrListener) {
        this.b = c5208u1;
        this.a = anrListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5208u1.a(this.b).a(this.a);
    }
}
