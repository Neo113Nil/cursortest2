package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes8.dex */
public final class D1 extends SafeRunnable {
    public final /* synthetic */ M1 a;

    public D1(M1 m1) {
        this.a = m1;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        synchronized (this.a) {
            try {
                M1 m1 = this.a;
                if (m1.c) {
                    m1.b.onCreate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
