package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.pi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC5096pi implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ C5122qi c;

    public RunnableC5096pi(C5122qi c5122qi, String str, String str2) {
        this.c = c5122qi;
        this.a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5122qi c5122qi = this.c;
        C5122qi.a(c5122qi.a, c5122qi.d, c5122qi.e).reportEvent(this.a, this.b);
    }
}
