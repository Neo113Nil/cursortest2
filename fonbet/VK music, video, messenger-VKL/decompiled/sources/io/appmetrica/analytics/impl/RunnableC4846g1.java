package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.g1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC4846g1 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ C5208u1 c;

    public RunnableC4846g1(C5208u1 c5208u1, String str, String str2) {
        this.c = c5208u1;
        this.a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5332z0 c5332z0 = this.c.a;
        String str = this.a;
        String str2 = this.b;
        c5332z0.getClass();
        C5307y0.c().putAppEnvironmentValue(str, str2);
    }
}
