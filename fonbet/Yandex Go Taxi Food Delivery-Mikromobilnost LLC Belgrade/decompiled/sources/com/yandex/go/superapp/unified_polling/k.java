package com.yandex.go.superapp.unified_polling;

import com.yandex.go.superapp.unified_polling.g;
import com.yandex.go.superapp.unified_polling.i;
import com.yandex.go.superapp.unified_polling.k;
import defpackage.bvf0;
import defpackage.dy11;
import defpackage.gci0;
import defpackage.h3y;
import defpackage.hst;
import defpackage.i3y;
import defpackage.ike;
import defpackage.jiz0;
import defpackage.jl40;
import defpackage.jst;
import defpackage.jy11;
import defpackage.m2e0;
import defpackage.n4u0;
import defpackage.pw7;
import defpackage.pzt0;
import defpackage.qpm0;
import defpackage.ry11;
import defpackage.sls;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.ycw0;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class k implements jy11 {
    public final tt2 a;
    public final h3y b;
    public final h3y c;
    public final h3y d;
    public final h3y e;
    public final h3y f;
    public final h3y g;
    public final ike h;
    public final i3y i;
    public final r0 j;
    public final i3y k;
    public final LinkedHashMap l;
    public final r0 m;
    public final gci0 n;
    public final pzt0 o;

    public k(tse tseVar, tt2 tt2Var, h3y h3yVar, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4, h3y h3yVar5, h3y h3yVar6) {
        this.a = tt2Var;
        this.b = h3yVar;
        this.c = h3yVar2;
        this.d = h3yVar3;
        this.e = h3yVar4;
        this.f = h3yVar5;
        this.g = h3yVar6;
        tt2Var.getClass();
        ike M = bvf0.M(tseVar, uyj.a);
        this.h = M;
        final int i = 0;
        this.i = kotlin.a.b(LazyThreadSafetyMode.NONE, new sls(this) { // from class: ly11
            public final /* synthetic */ k b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                k kVar = this.b;
                switch (i2) {
                    case 0:
                        return (g) kVar.b.get();
                    default:
                        r0 r0Var = kVar.j;
                        tpr t = e.t(new i(r0Var));
                        ike ikeVar = kVar.h;
                        xsr0.a.getClass();
                        return e.R(t, ikeVar, wsr0.c, Boolean.valueOf(r0Var.getValue() != null));
                }
            }
        });
        this.j = bvf0.c(null);
        final int i2 = 1;
        this.k = kotlin.a.a(new sls(this) { // from class: ly11
            public final /* synthetic */ k b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                k kVar = this.b;
                switch (i22) {
                    case 0:
                        return (g) kVar.b.get();
                    default:
                        r0 r0Var = kVar.j;
                        tpr t = e.t(new i(r0Var));
                        ike ikeVar = kVar.h;
                        xsr0.a.getClass();
                        return e.R(t, ikeVar, wsr0.c, Boolean.valueOf(r0Var.getValue() != null));
                }
            }
        });
        this.l = new LinkedHashMap();
        r0 c = bvf0.c(ycw0.f);
        this.m = c;
        this.n = kotlinx.coroutines.flow.e.d(c);
        this.o = tje.N(M, null, CoroutineStart.LAZY, new UnifiedPollingRepositoryImpl$trackingJob$1(this, null), 1);
    }

    @Override // defpackage.ky11
    public final n4u0 a() {
        return (n4u0) this.k.getValue();
    }

    @Override // defpackage.ky11
    public final void b(String str, ry11 ry11Var) {
        LinkedHashMap linkedHashMap = this.l;
        if (str == null) {
            linkedHashMap.compute(ry11Var, new pw7(14, new jiz0(22)));
            g(true);
        } else {
            linkedHashMap.compute(ry11Var, new pw7(17, new qpm0(str, 11)));
            g(true);
        }
    }

    @Override // defpackage.jy11
    public final void c(m2e0 m2e0Var) {
        this.j.l(m2e0Var);
        this.o.start();
    }

    @Override // defpackage.ky11
    public final n4u0 d() {
        return this.n;
    }

    @Override // defpackage.ky11
    public final void e(String str, ry11 ry11Var) {
        LinkedHashMap linkedHashMap = this.l;
        if (str == null) {
            linkedHashMap.compute(ry11Var, new pw7(14, new jiz0(22)));
            g(true);
        } else {
            linkedHashMap.compute(ry11Var, new pw7(16, new qpm0(str, 10)));
            g(true);
        }
    }

    @Override // defpackage.ky11
    public final void f(ry11 ry11Var) {
        this.l.compute(ry11Var, new pw7(18, new jiz0(23)));
        g(true);
    }

    public final void g(boolean z) {
        Object value;
        dy11 dy11Var;
        g gVar = (g) this.i.getValue();
        Set N0 = kotlin.collections.a.N0(this.l.keySet());
        gVar.getClass();
        hst hstVar = jst.e;
        Objects.toString(N0);
        hstVar.getClass();
        r0 r0Var = gVar.d;
        do {
            value = r0Var.getValue();
            dy11Var = (dy11) value;
            Set set = dy11Var.b;
            int i = dy11Var.a;
            if (!jl40.l(set, N0)) {
                dy11Var = new dy11(i, N0);
            } else if (z) {
                dy11Var = new dy11(i + 1, dy11Var.b);
            }
        } while (!r0Var.k(value, dy11Var));
    }

    @Override // defpackage.jy11
    public final void h() {
        this.j.l(null);
    }
}
