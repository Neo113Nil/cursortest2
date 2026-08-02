package defpackage;

import com.yandex.go.network.connectivity.a;
import com.yandex.go.route.interactor.c;
import com.yandex.go.zone.repository.o;
import defpackage.cqe0;
import defpackage.g6u;
import defpackage.g990;
import defpackage.jqr;
import defpackage.mqz0;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.uyj;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;
import ru.yandex.taxi.preorder.interactor.g;
import ru.yandex.taxi.preorder.source.DrivingRoutes$Type;

/* loaded from: classes6.dex */
public final class cqe0 implements dft0 {
    public final cv00 a;
    public final rjt0 b;
    public final tt2 c;
    public final noe d;
    public final leh e;
    public final o f;
    public final mqz0 g;
    public final wiq0 h;
    public final kt00 i;
    public final c j;
    public final pei k;
    public final iv70 l;
    public final lr00 m;
    public final opz0 n;
    public final iqz0 o;
    public final g p;
    public final a q;
    public final ype0 r = new ype0();
    public final qqo s;
    public d0l0 t;
    public final i3y u;

    public cqe0(cv00 cv00Var, rjt0 rjt0Var, tt2 tt2Var, noe noeVar, leh lehVar, o oVar, mqz0 mqz0Var, wiq0 wiq0Var, kt00 kt00Var, c cVar, pei peiVar, iv70 iv70Var, lr00 lr00Var, opz0 opz0Var, iqz0 iqz0Var, g gVar, a aVar, rqo rqoVar) {
        this.a = cv00Var;
        this.b = rjt0Var;
        this.c = tt2Var;
        this.d = noeVar;
        this.e = lehVar;
        this.f = oVar;
        this.g = mqz0Var;
        this.h = wiq0Var;
        this.i = kt00Var;
        this.j = cVar;
        this.k = peiVar;
        this.l = iv70Var;
        this.m = lr00Var;
        this.n = opz0Var;
        this.o = iqz0Var;
        this.p = gVar;
        this.q = aVar;
        this.s = ((jbh) rqoVar).a(SimpleBooleanExperiment.ROUTE_AVOID_TOLLS);
        d0l0.Companion.getClass();
        this.t = h5l0.a;
        this.u = kotlin.a.a(new sls() { // from class: ru.yandex.taxi.preorder.source.b
            @Override // defpackage.sls
            public final Object invoke() {
                cqe0 cqe0Var = cqe0.this;
                e eVar = new e(kotlinx.coroutines.flow.e.X(new m0(new i(cqe0Var.j.f(), cqe0Var), com.yandex.go.coroutines.b.d(cqe0Var.q.c(), new PreorderDrivingRouteProvider$routeWithNetworkConnectivityRestoredFlow$$inlined$start$1(2, null)), new PreorderDrivingRouteProvider$routeWithNetworkConnectivityRestoredFlow$3(3, null)), new PreorderDrivingRouteProvider$initFlow$1(cqe0Var, null)), cqe0Var.r);
                cqe0Var.c.getClass();
                sjh sjhVar = uyj.a;
                g6u g6uVar = o400.a;
                tpr F = kotlinx.coroutines.flow.e.F(eVar, g6uVar);
                tpr F2 = kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.s(((com.yandex.go.taxi.tariffs.internal.repository.k) cqe0Var.h).j.b(), new g990(18)), uyj.a);
                mqz0 mqz0Var2 = cqe0Var.g;
                tpr t = kotlinx.coroutines.flow.e.t(mqz0Var2.a.g);
                r0 r0Var = mqz0Var2.a.j;
                tpr b = ((com.yandex.go.route.interactor.a) cqe0Var.m).b();
                ru.yandex.taxi.preorder.interactor.g gVar2 = cqe0Var.p;
                return kotlinx.coroutines.flow.e.F(new kotlinx.coroutines.flow.k(new g(new jqr(new c(new tpr[]{F, F2, t, r0Var, b, new ru.yandex.taxi.preorder.interactor.b(gVar2.g.k(), gVar2)}, cqe0Var), new PreorderDrivingRouteProvider$initFlow$5(cqe0Var, null), 3)), new PreorderDrivingRouteProvider$initFlow$7(cqe0Var, null)), g6uVar);
            }
        });
    }

    public final DrivingRoutes$Type a(boolean z, boolean z2) {
        this.e.getClass();
        boolean a = leh.a(this.f);
        return (z2 && b()) ? z ? a ? DrivingRoutes$Type.SELECTED_JAMS_COLORED : DrivingRoutes$Type.NORMAL_MONOCHROME : DrivingRoutes$Type.ALTERNATIVE_MONOCHROME : a ? DrivingRoutes$Type.NORMAL_JAMS_COLORED : DrivingRoutes$Type.NORMAL_MONOCHROME;
    }

    public final boolean b() {
        return this.n.d().getB();
    }
}
