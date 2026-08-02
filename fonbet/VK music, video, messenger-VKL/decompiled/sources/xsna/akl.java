package xsna;

import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.concurrent.TimeUnit;

/* compiled from: DefaultPaginationDelegate.kt */
/* loaded from: classes4.dex */
public final class akl extends td90 {
    public final com.vk.lists.c i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public boolean m;
    public final s170 n;
    public boolean o;
    public z6u p;

    public akl(int i, com.vk.lists.c cVar, boolean z, boolean z2) {
        boolean z3 = (i & 2) == 0;
        z = (i & 4) != 0 ? true : z;
        z2 = (i & 8) != 0 ? true : z2;
        this.i = cVar;
        this.j = z3;
        this.k = z;
        this.l = z2;
        s170 s170Var = new s170();
        s170Var.g();
        this.n = s170Var;
        this.o = true;
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q<vqt> d() {
        com.vk.lists.c cVar = this.i;
        if (this.f == 1) {
            return p0();
        }
        boolean z = this.o && cVar.t > 0;
        this.o = false;
        int i = cVar.i();
        boolean z2 = i == 0;
        UserId userId = this.a;
        int i2 = this.b;
        int i3 = this.e;
        String str = this.c;
        boolean z3 = this.j;
        String str2 = this.d;
        boolean z4 = this.k;
        com.vk.newsfeed.common.requests.a aVar = new com.vk.newsfeed.common.requests.a(userId, i2, i, 50, i3, z2, str, z3, str2, z4, this.l, z4 ? 3 : 2);
        if (!o25.a().b()) {
            aVar.d = true;
            aVar.c = true;
        }
        z6u z6uVar = this.p;
        if (z6uVar != null) {
            z6uVar.invoke(aVar);
        }
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(aVar, null, null, 3);
        if (z) {
            y0 = s(y0);
        }
        js1 js1Var = new js1(new yve(this, 10), 23);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return y0.E(js1Var, lVar, kVar, kVar);
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q<vqt> e() {
        this.f = 0;
        com.vk.lists.c cVar = this.i;
        cVar.r(true);
        cVar.q(0);
        return d();
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.internal.operators.observable.b0 h(int i) {
        this.i.r(true);
        com.vk.newsfeed.common.requests.a aVar = new com.vk.newsfeed.common.requests.a(this.a, this.b, -50, 100, this.e, true, this.c, this.j, this.d);
        if (!o25.a().b()) {
            aVar.d = true;
            aVar.c = true;
        }
        z6u z6uVar = this.p;
        if (z6uVar != null) {
            z6uVar.invoke(aVar);
        }
        aVar.G = Integer.valueOf(i);
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(aVar, null, null, 3);
        i22 i22Var = new i22(new ozh(this, 6), 15);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return y0.E(i22Var, lVar, kVar, kVar);
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q<vqt> l() {
        this.f = 1;
        this.n.e(0);
        this.i.r(false);
        return p0();
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q n(io.reactivex.rxjava3.core.q qVar) {
        return this.i.g(qVar, true, false);
    }

    @Override // xsna.td90, xsna.sd90
    public final boolean p() {
        return this.j;
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q<vqt> p0() {
        if (this.m) {
            return io.reactivex.rxjava3.internal.operators.observable.g0.b;
        }
        boolean z = this.o && this.i.t > 0;
        this.o = false;
        this.m = true;
        int a = this.n.a();
        boolean z2 = a == 0;
        com.vk.newsfeed.common.requests.a aVar = new com.vk.newsfeed.common.requests.a(this.a, this.b, a, 50, this.e, z2, this.c, !this.j, this.d);
        if (!o25.a().b()) {
            aVar.d = true;
            aVar.c = true;
        }
        z6u z6uVar = this.p;
        if (z6uVar != null) {
            z6uVar.invoke(aVar);
        }
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(aVar, null, null, 3);
        if (z) {
            y0 = s(y0);
        }
        dx3 dx3Var = new dx3(this, 5);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return new io.reactivex.rxjava3.internal.operators.observable.c0(y0.E(lVar, lVar, kVar, dx3Var), lVar, new uu4(this, 3)).E(new cp0(new zjl(z2, this), 19), lVar, kVar, kVar).F(new is1(new rmg(this, 8), 20));
    }

    public final io.reactivex.rxjava3.internal.operators.observable.m1 s(io.reactivex.rxjava3.internal.operators.observable.m1 m1Var) {
        return io.reactivex.rxjava3.core.q.I0(m1Var, io.reactivex.rxjava3.core.q.R(this.i.t, TimeUnit.MILLISECONDS), new sn(15, new com.vk.movika.tools.controls.seekbar.o(3))).a0(asu0.a.d());
    }
}
