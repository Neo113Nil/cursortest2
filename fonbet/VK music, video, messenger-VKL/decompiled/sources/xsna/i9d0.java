package xsna;

import java.util.concurrent.TimeUnit;

/* compiled from: PrimaryButtonsFeature.kt */
/* loaded from: classes7.dex */
public final class i9d0 {
    public final gvw0 a;
    public final afl0 b;
    public final tjw0 c;
    public final ll4 d;
    public final od50 e;
    public final oqh0 f;
    public final f69 g;
    public final chr0 h;
    public final io.reactivex.rxjava3.subjects.f<j9d0> i;
    public final io.reactivex.rxjava3.disposables.b j;

    public i9d0(gvw0 gvw0Var, afl0 afl0Var, tjw0 tjw0Var, ll4 ll4Var, od50 od50Var, oqh0 oqh0Var, f69 f69Var, chr0 chr0Var) {
        this.a = gvw0Var;
        this.b = afl0Var;
        this.c = tjw0Var;
        this.d = ll4Var;
        this.e = od50Var;
        this.f = oqh0Var;
        this.g = f69Var;
        this.h = chr0Var;
        io.reactivex.rxjava3.subjects.f<j9d0> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.i = fVar;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.j = bVar;
        bVar.b(fVar.w0(50L, TimeUnit.MILLISECONDS).a0(asu0.a.d()).subscribe(new jsv(new u3u(this, 27), 17)));
    }

    public final io.reactivex.rxjava3.internal.operators.observable.n a() {
        com.vk.voip.ui.c.b.getClass();
        u4x0 u4x0Var = com.vk.voip.ui.c.Y;
        int i = 24;
        return io.reactivex.rxjava3.core.q.n(e43.l(new io.reactivex.rxjava3.internal.operators.observable.p1(u4x0Var.f(), new dt(new d4r(i), 24)), new io.reactivex.rxjava3.internal.operators.observable.p1(u4x0Var.g(), new et(new d4r(i), 28)), new io.reactivex.rxjava3.internal.operators.observable.p1(this.e.d(), new rt0(new fo20(12), 29)), new io.reactivex.rxjava3.internal.operators.observable.p1(com.vk.voip.ui.c.K0(), new k73(new d4r(i), 27)), new io.reactivex.rxjava3.internal.operators.observable.p1(com.vk.voip.ui.c.L0(), new pm0(new d4r(i), 27)), new io.reactivex.rxjava3.internal.operators.observable.p1(com.vk.voip.ui.c.M0(), new uf3(new d4r(i), 24)), new io.reactivex.rxjava3.internal.operators.observable.p1(com.vk.voip.ui.c.J0(true, new q0s0(8)), new up(new d4r(i), 27)), new io.reactivex.rxjava3.internal.operators.observable.p1(com.vk.voip.ui.c.F0(), new wp(new qey(27), 27)), new io.reactivex.rxjava3.internal.operators.observable.p1(new xbx0(com.vk.voip.ui.c.k0()).a(), new xb20(new nc90(4), 9)), com.vk.voip.ui.c.B0.b(), com.vk.voip.ui.c.m0().b()), new qw80(new gda0(this, 8), 3));
    }
}
