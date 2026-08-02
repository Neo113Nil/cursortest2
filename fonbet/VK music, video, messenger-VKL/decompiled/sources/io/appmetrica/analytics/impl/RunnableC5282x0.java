package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.x0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC5282x0 implements Runnable {
    public final /* synthetic */ C5307y0 a;

    public RunnableC5282x0(C5307y0 c5307y0) {
        this.a = c5307y0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5030n4.l().c.a().executeDelayed(new RunnableC5258w1(this.a.a), TimeUnit.SECONDS.toMillis(5L));
    }
}
