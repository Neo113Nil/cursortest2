package com.yandex.plus.home.plaque.feature.internal;

import com.yandex.plus.home.PlusHomeSdkImpl$exportMetricaSessionListener$1;
import com.yandex.plus.log.api.LogPriority;
import defpackage.g6u;
import defpackage.g92;
import defpackage.ike;
import defpackage.lqc0;
import defpackage.n4u0;
import defpackage.o370;
import defpackage.omc0;
import defpackage.oo2;
import defpackage.pgz;
import defpackage.pzt0;
import defpackage.rkc0;
import defpackage.t9a0;
import defpackage.tje;
import defpackage.wyj;
import defpackage.xyj;
import defpackage.yo40;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class b {
    public final PlusHomeSdkImpl$exportMetricaSessionListener$1 a;
    public final lqc0 b;
    public final rkc0 c;
    public final yo40 d;
    public final o370 e;
    public final pgz f;
    public final ike g;
    public final xyj h;
    public final oo2 i;
    public final com.yandex.plus.home.plaque.feature.internal.domain.observable.a j;
    public final ReentrantLock k;
    public pzt0 l;

    public b(PlusHomeSdkImpl$exportMetricaSessionListener$1 plusHomeSdkImpl$exportMetricaSessionListener$1, lqc0 lqc0Var, rkc0 rkc0Var, yo40 yo40Var, o370 o370Var, r0 r0Var, n4u0 n4u0Var, g92 g92Var, t9a0 t9a0Var, pgz pgzVar, ike ikeVar, xyj xyjVar) {
        this.a = plusHomeSdkImpl$exportMetricaSessionListener$1;
        this.b = lqc0Var;
        this.c = rkc0Var;
        this.d = yo40Var;
        this.e = o370Var;
        this.f = pgzVar;
        this.g = ikeVar;
        this.h = xyjVar;
        oo2 oo2Var = new oo2(t9a0Var);
        this.i = oo2Var;
        this.j = new com.yandex.plus.home.plaque.feature.internal.domain.observable.a(lqc0Var, oo2Var, wyj.f);
        this.k = new ReentrantLock();
        LogPriority logPriority = LogPriority.INFO;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "PlaqueFeatureImpl", "Init");
        }
        g6u g6uVar = wyj.d;
        tje.N(ikeVar, g6uVar, null, new PlaqueFeatureImpl$2(this, null), 2);
        tje.N(ikeVar, g6uVar, null, new PlaqueFeatureImpl$3(r0Var, n4u0Var, g92Var, this, null), 2);
    }

    public final void a(omc0 omc0Var) {
        ((wyj) this.h).getClass();
        tje.N(this.g, wyj.d, null, new PlaqueFeatureImpl$setExternalPlaqueContext$1(this, omc0Var, null), 2);
    }

    public final pzt0 b(boolean z) {
        ReentrantLock reentrantLock = this.k;
        reentrantLock.lock();
        if (!z) {
            try {
                if (this.l != null) {
                    return null;
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        pzt0 pzt0Var = this.l;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 N = tje.N(this.g, null, null, new PlaqueFeatureImpl$updatePlaqueConfiguration$1$1(this, null), 3);
        this.l = N;
        return N;
    }
}
