package com.yandex.go.superapp.tracking.data;

import defpackage.bjz;
import defpackage.bvf0;
import defpackage.d3p;
import defpackage.g0c;
import defpackage.gci0;
import defpackage.ike;
import defpackage.jem;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.o601;
import defpackage.pzt0;
import defpackage.q6o0;
import defpackage.q701;
import defpackage.qg50;
import defpackage.qoi0;
import defpackage.r1y0;
import defpackage.r701;
import defpackage.scc;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.xda;
import defpackage.y2y0;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.o;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class e {
    public final o601 a;
    public final r701 b;
    public final q701 c;
    public final r701 d;
    public final q701 e;
    public final r701 f;
    public final q701 g;
    public final r701 h;
    public final q701 i;
    public final r701 j;
    public final q701 k;
    public final r701 l;
    public final q701 m;
    public final r701 n;
    public final q701 o;
    public final r701 p;
    public final r0 q;
    public final tpr r;
    public final ike s;
    public pzt0 t;
    public final r0 u;
    public final gci0 v;

    public e(tt2 tt2Var, o601 o601Var, r701 r701Var, q701 q701Var, r701 r701Var2, q701 q701Var2, r701 r701Var3, q701 q701Var3, r701 r701Var4, q701 q701Var4, r701 r701Var5, q701 q701Var5, r701 r701Var6, q701 q701Var6, r701 r701Var7, q701 q701Var7, r701 r701Var8) {
        this.a = o601Var;
        this.b = r701Var;
        this.c = q701Var;
        this.d = r701Var2;
        this.e = q701Var2;
        this.f = r701Var3;
        this.g = q701Var3;
        this.h = r701Var4;
        this.i = q701Var4;
        this.j = r701Var5;
        this.k = q701Var5;
        this.l = r701Var6;
        this.m = q701Var6;
        this.n = r701Var7;
        this.o = q701Var7;
        this.p = r701Var8;
        r0 c = bvf0.c(0);
        this.q = c;
        this.r = kotlinx.coroutines.flow.e.t(new c(c));
        tt2Var.getClass();
        this.s = bvf0.a(uyj.a.plus(jl40.a()));
        r0 c2 = bvf0.c(EmptyList.a);
        this.u = c2;
        this.v = kotlinx.coroutines.flow.e.d(c2);
    }

    public static o a(tpr tprVar, g0c g0cVar) {
        AtomicReference atomicReference = new AtomicReference(null);
        return new o(new jqr(tprVar, new TrackingRepositoryImpl$catchTrackingFlowError$1(atomicReference, null), 3), new TrackingRepositoryImpl$catchTrackingFlowError$2(g0cVar, atomicReference, null));
    }

    public final void b() {
        r0 r0Var;
        Object value;
        Number number;
        do {
            r0Var = this.q;
            value = r0Var.getValue();
            number = (Number) value;
        } while (!r0Var.k(value, Integer.valueOf(number.intValue() + 1)));
        if (number.intValue() > 0) {
            return;
        }
        this.i.start();
        this.m.start();
        this.c.start();
        this.g.start();
        this.k.start();
        this.e.start();
        this.o.start();
        pzt0 pzt0Var = this.t;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.t = tje.N(this.s, null, null, new TrackingRepositoryImpl$start$$inlined$collectLatestIn$1(new o(new d((tpr[]) kotlin.collections.a.J0(scc.g(a(this.j.a(), qoi0.a(r1y0.class)), a(this.n.a(), qoi0.a(y2y0.class)), a(this.d.a(), qoi0.a(jem.class)), a(this.h.a(), qoi0.a(q6o0.class)), a(this.l.a(), qoi0.a(bjz.class)), a(this.f.a(), qoi0.a(xda.class)), a(this.p.a(), qoi0.a(d3p.class)), a(this.b.a(), qoi0.a(qg50.class)))).toArray(new tpr[0]), this), new TrackingRepositoryImpl$start$3(3, null)), null, this.u), 3);
    }

    public final void c() {
        r0 r0Var;
        Object value;
        int intValue;
        do {
            r0Var = this.q;
            value = r0Var.getValue();
            intValue = ((Number) value).intValue() - 1;
        } while (!r0Var.k(value, Integer.valueOf(intValue)));
        if (intValue > 0) {
            return;
        }
        this.i.stop();
        this.m.stop();
        this.c.stop();
        this.g.stop();
        this.k.stop();
        this.e.stop();
        this.o.stop();
        pzt0 pzt0Var = this.t;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
    }
}
