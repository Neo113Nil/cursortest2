package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.b2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC4718b2 implements Runnable {
    public final /* synthetic */ InterfaceC4988le a;
    public final /* synthetic */ K7 b;

    public RunnableC4718b2(C4770d2 c4770d2, K7 k7) {
        this.a = c4770d2;
        this.b = k7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.consume(this.b);
    }
}
