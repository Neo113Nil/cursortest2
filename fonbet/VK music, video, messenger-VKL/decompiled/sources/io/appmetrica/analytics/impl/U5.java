package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import xsna.uxb0;

/* loaded from: classes8.dex */
public final class U5 implements Runnable {
    public final List a;
    public final IHandlerExecutor b = C5342za.k().w().a();
    public final WaitForActivationDelayBarrier c = C5342za.k().a();

    public U5(List list) {
        this.a = list;
    }

    public static final void a(U5 u5) {
        Iterator it = u5.a.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.subscribe(TimeUnit.SECONDS.toMillis(10L), this.b, new uxb0(this, 12));
    }
}
