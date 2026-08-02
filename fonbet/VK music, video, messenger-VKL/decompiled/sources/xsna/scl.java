package xsna;

import io.reactivex.rxjava3.internal.functions.a;

/* compiled from: DefaultCommentsThreadPaginator.kt */
/* loaded from: classes4.dex */
public final class scl extends td90 {
    public final com.vk.lists.c i;
    public int j;
    public boolean k;
    public final s170 l;

    public scl(com.vk.lists.c cVar) {
        this.i = cVar;
        s170 s170Var = new s170();
        s170Var.g();
        this.l = s170Var;
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q<vqt> d() {
        com.vk.newsfeed.common.requests.a aVar = new com.vk.newsfeed.common.requests.a(this.b, this.e, this.a, this.c, this.d);
        aVar.E = this.i.j();
        aVar.L = 0;
        aVar.I = Integer.valueOf(this.j);
        aVar.J = Boolean.TRUE;
        aVar.K = Boolean.valueOf(this.h);
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(aVar, null, null, 3);
        bg1 bg1Var = new bg1(new fgh(this, 5), 21);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return y0.E(bg1Var, lVar, kVar, kVar);
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q<vqt> e() {
        this.f = 0;
        com.vk.lists.c cVar = this.i;
        cVar.r(true);
        cVar.s(null);
        this.l.f(null);
        return d();
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.internal.operators.observable.b0 h(int i) {
        com.vk.newsfeed.common.requests.a aVar = new com.vk.newsfeed.common.requests.a(this.a, this.b, -50, 100, this.e, false, this.c, false, this.d);
        aVar.I = Integer.valueOf(this.j);
        aVar.G = Integer.valueOf(i);
        aVar.J = Boolean.TRUE;
        aVar.L = 0;
        aVar.K = Boolean.valueOf(this.h);
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(aVar, null, null, 3);
        gn0 gn0Var = new gn0(new qcl(this, 0), 17);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return y0.E(gn0Var, lVar, kVar, kVar);
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q<vqt> l() {
        this.f = 1;
        com.vk.lists.c cVar = this.i;
        cVar.r(false);
        cVar.s(null);
        s170 s170Var = this.l;
        s170Var.f(null);
        if (this.k) {
            return io.reactivex.rxjava3.internal.operators.observable.g0.b;
        }
        this.k = true;
        com.vk.newsfeed.common.requests.a aVar = new com.vk.newsfeed.common.requests.a(this.b, this.e, this.a, this.c, this.d);
        aVar.I = Integer.valueOf(this.j);
        Boolean bool = Boolean.TRUE;
        aVar.J = bool;
        aVar.K = Boolean.valueOf(this.h);
        aVar.L = 1;
        aVar.F = s170Var.b();
        aVar.H = bool;
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(aVar, null, null, 3);
        zwa zwaVar = new zwa(this, 2);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return new io.reactivex.rxjava3.internal.operators.observable.c0(y0.E(lVar, lVar, kVar, zwaVar), lVar, new g30(this, 3)).E(new defpackage.d(new pcg(this, 11), 20), lVar, kVar, kVar).F(new hv(new com.vk.movika.sdk.base.observable.o(this, 26), 15));
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q n(io.reactivex.rxjava3.core.q qVar) {
        return this.i.g(qVar, true, false);
    }

    @Override // xsna.td90, xsna.sd90
    public final void o(int i) {
        this.j = i;
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q<vqt> p0() {
        if (this.k) {
            return io.reactivex.rxjava3.internal.operators.observable.g0.b;
        }
        this.k = true;
        com.vk.newsfeed.common.requests.a aVar = new com.vk.newsfeed.common.requests.a(this.b, this.e, this.a, this.c, this.d);
        aVar.I = Integer.valueOf(this.j);
        aVar.J = Boolean.TRUE;
        aVar.K = Boolean.valueOf(this.h);
        aVar.L = 1;
        aVar.F = this.l.b();
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(aVar, null, null, 3);
        ph8 ph8Var = new ph8(this, 2);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return new io.reactivex.rxjava3.internal.operators.observable.c0(y0.E(lVar, lVar, kVar, ph8Var), lVar, new rcl(this, 0)).E(new v8(new k7f(this, 7), 18), lVar, kVar, kVar).F(new io1(new zkh(this, 5), 23));
    }
}
