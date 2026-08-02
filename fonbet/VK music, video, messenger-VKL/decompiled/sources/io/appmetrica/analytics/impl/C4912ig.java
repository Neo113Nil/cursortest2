package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.ig, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4912ig implements InterfaceC4861gg {
    public final /* synthetic */ C5068og a;

    public C4912ig(C5068og c5068og) {
        this.a = c5068og;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4861gg
    public final void a() {
        C5068og c5068og = this.a;
        La la = c5068og.b;
        C4887hg c4887hg = new C4887hg(c5068og);
        la.getClass();
        try {
            FutureTask futureTask = new FutureTask(new Ka(la));
            C5342za.I.d.a.getClass();
            new InterruptionSafeThread(futureTask, "IAA-SHMSR-" + Kd.a.incrementAndGet()).start();
            C5298xg c5298xg = (C5298xg) futureTask.get(5L, TimeUnit.SECONDS);
            vo.a(la.b);
            C5068og.a(c5068og, c5298xg, C5068og.a(c5068og));
        } catch (Throwable th) {
            try {
                c4887hg.a(th);
            } finally {
                vo.a(la.b);
            }
        }
    }
}
