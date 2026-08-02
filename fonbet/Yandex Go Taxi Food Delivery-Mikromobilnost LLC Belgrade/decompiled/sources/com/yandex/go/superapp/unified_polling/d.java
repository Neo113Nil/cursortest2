package com.yandex.go.superapp.unified_polling;

import android.os.Looper;
import defpackage.bvf0;
import defpackage.gci0;
import defpackage.h3y;
import defpackage.hst;
import defpackage.ike;
import defpackage.iy11;
import defpackage.jl40;
import defpackage.jst;
import defpackage.jy11;
import defpackage.ky2;
import defpackage.m2e0;
import defpackage.n4u0;
import defpackage.o400;
import defpackage.pzt0;
import defpackage.ry11;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.ycw0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class d implements jy11 {
    public final tse a;
    public final ky2 b;
    public final tt2 c;
    public final r0 d;
    public final gci0 e;
    public final pzt0 f;
    public final gci0 g;
    public final gci0 h;

    public d(iy11 iy11Var, h3y h3yVar, h3y h3yVar2, tse tseVar, ky2 ky2Var, tt2 tt2Var) {
        this.a = tseVar;
        this.b = ky2Var;
        this.c = tt2Var;
        tt2Var.getClass();
        ike M = bvf0.M(tseVar, uyj.a);
        this.d = bvf0.c(null);
        c cVar = new c(kotlinx.coroutines.flow.e.t(iy11Var.a), h3yVar2, h3yVar);
        wsr0 wsr0Var = xsr0.a;
        wsr0Var.getClass();
        gci0 R = kotlinx.coroutines.flow.e.R(cVar, M, wsr0.c, null);
        this.e = R;
        this.f = tje.N(tseVar, null, CoroutineStart.LAZY, new SwitchingUnifiedPollingManager$trackingJob$1(this, null), 1);
        this.g = kotlinx.coroutines.flow.e.R(kotlinx.coroutines.flow.e.X(R, new SwitchingUnifiedPollingManager$special$$inlined$flatMapLatest$1(3, null)), M, wsr0.a(wsr0Var, 1), Boolean.FALSE);
        this.h = kotlinx.coroutines.flow.e.R(kotlinx.coroutines.flow.e.X(R, new SwitchingUnifiedPollingManager$special$$inlined$flatMapLatest$2(3, null)), M, wsr0.a(wsr0Var, 1), ycw0.f);
    }

    @Override // defpackage.ky11
    public final n4u0 a() {
        return this.g;
    }

    @Override // defpackage.ky11
    public final void b(String str, ry11 ry11Var) {
        if (jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
            jy11 jy11Var = (jy11) this.e.a.getValue();
            if (jy11Var != null) {
                jy11Var.b(str, ry11Var);
                return;
            }
            return;
        }
        hst hstVar = jst.e;
        hstVar.m("UnifiedPolling:notMainThread").i("UnifiedPolling", new IllegalStateException("Access to Unified Polling not from main thread is forbidden"));
        this.c.getClass();
        sjh sjhVar = uyj.a;
        tje.N(this.a, o400.a, null, new SwitchingUnifiedPollingManager$onOrderRemoved$$inlined$ensureMainThread$1(null, this, str, ry11Var), 2);
    }

    @Override // defpackage.jy11
    public final void c(m2e0 m2e0Var) {
        this.d.l(m2e0Var);
        this.f.start();
    }

    @Override // defpackage.ky11
    public final n4u0 d() {
        return this.h;
    }

    @Override // defpackage.ky11
    public final void e(String str, ry11 ry11Var) {
        if (jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
            jy11 jy11Var = (jy11) this.e.a.getValue();
            if (jy11Var != null) {
                jy11Var.e(str, ry11Var);
                return;
            }
            return;
        }
        hst hstVar = jst.e;
        hstVar.m("UnifiedPolling:notMainThread").i("UnifiedPolling", new IllegalStateException("Access to Unified Polling not from main thread is forbidden"));
        this.c.getClass();
        sjh sjhVar = uyj.a;
        tje.N(this.a, o400.a, null, new SwitchingUnifiedPollingManager$onOrderCreated$$inlined$ensureMainThread$1(null, this, str, ry11Var), 2);
    }

    @Override // defpackage.ky11
    public final void f(ry11 ry11Var) {
        if (jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
            jy11 jy11Var = (jy11) this.e.a.getValue();
            if (jy11Var != null) {
                jy11Var.f(ry11Var);
                return;
            }
            return;
        }
        hst hstVar = jst.e;
        hstVar.m("UnifiedPolling:notMainThread").i("UnifiedPolling", new IllegalStateException("Access to Unified Polling not from main thread is forbidden"));
        this.c.getClass();
        sjh sjhVar = uyj.a;
        tje.N(this.a, o400.a, null, new SwitchingUnifiedPollingManager$onOrdersUpdated$$inlined$ensureMainThread$1(null, this, ry11Var), 2);
    }

    @Override // defpackage.jy11
    public final void h() {
        this.d.l(null);
    }
}
