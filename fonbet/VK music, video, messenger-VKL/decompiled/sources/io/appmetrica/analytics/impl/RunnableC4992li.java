package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.li, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC4992li implements Runnable {
    public final /* synthetic */ C5122qi a;

    public RunnableC4992li(C5122qi c5122qi) {
        this.a = c5122qi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5122qi c5122qi = this.a;
        C5122qi.a(c5122qi.a, c5122qi.d, c5122qi.e).sendEventsBuffer();
    }
}
