package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.n0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC5026n0 implements Runnable {
    public final /* synthetic */ C5078p0 a;

    public RunnableC5026n0(C5078p0 c5078p0) {
        this.a = c5078p0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5078p0 c5078p0 = this.a;
        synchronized (c5078p0) {
            if (c5078p0.a != null && c5078p0.a()) {
                try {
                    c5078p0.d = null;
                    c5078p0.a.unbindService(c5078p0.j);
                } catch (Throwable unused) {
                }
            }
            c5078p0.d = null;
        }
    }
}
