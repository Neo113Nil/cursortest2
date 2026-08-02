package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.x5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC5287x5 implements Runnable {
    public final /* synthetic */ InterfaceC4988le a;
    public final /* synthetic */ C5312y5 b;

    public RunnableC5287x5(C5312y5 c5312y5, InterfaceC4988le interfaceC4988le) {
        this.b = c5312y5;
        this.a = interfaceC4988le;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b) {
            try {
                C5312y5 c5312y5 = this.b;
                Object obj = c5312y5.a;
                if (obj == null) {
                    c5312y5.b.add(this.a);
                } else {
                    this.a.consume(obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
