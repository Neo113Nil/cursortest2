package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.f1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC4820f1 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ C5208u1 b;

    public RunnableC4820f1(C5208u1 c5208u1, String str) {
        this.b = c5208u1;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5208u1.a(this.b).b(this.a);
    }
}
