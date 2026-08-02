package defpackage;

import android.content.Context;
import com.yandex.go.navigation.modals.coroutines.a;
import com.yandex.go.navigator.analitycs.Screen;
import com.yandex.go.navigator.domain.e;
import com.yandex.go.navigator.domain.o;
import com.yandex.go.navigator.domain.t;
import com.yandex.go.navigator.driving.DrivingModalView;
import com.yandex.go.navigator.driving.f;
import com.yandex.go.navigator.driving.top_view.DrivingTopView;
import com.yandex.go.navigator.driving.w;
import com.yandex.go.navigator.notifications.cartech.b;
import com.yandex.go.navigator.share.experiment.c;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class nkm extends a {
    public final w030 F;
    public final jkm G;
    public final ukm H;
    public final yvf0 I;
    public final yvf0 J;
    public final yvf0 K;
    public final c L;
    public final o M;
    public final xjm N;
    public final f O;
    public final eb50 P;
    public final boolean Q;

    public nkm(w030 w030Var, jkm jkmVar, ukm ukmVar, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, c cVar, o oVar, xjm xjmVar, f fVar, eb50 eb50Var) {
        super(null);
        this.F = w030Var;
        this.G = jkmVar;
        this.H = ukmVar;
        this.I = yvf0Var;
        this.J = yvf0Var2;
        this.K = yvf0Var3;
        this.L = cVar;
        this.M = oVar;
        this.N = xjmVar;
        this.O = fVar;
        this.P = eb50Var;
        this.Q = true;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a, defpackage.h55
    public final void G(Object obj) {
        super.G((fkm) obj);
        this.O.a();
        this.P.a = Screen.Driving;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a, defpackage.h55
    public final void H(Object obj) {
        this.O.b();
        this.P.a = null;
        super.H((fkm) obj);
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.F;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return this.Q;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final Object S(Object obj, Continuation continuation) {
        zch zchVar = new zch(this);
        vx0 vx0Var = this.N.a;
        wjm wjmVar = new wjm(zchVar, (n3h) vx0Var.a.get(), (f) vx0Var.b.get(), (com.yandex.go.navigator.driving.analytics.a) vx0Var.c.get(), 0);
        boolean z = ((fkm) obj).a;
        kkm kkmVar = this.G.a;
        ikm ikmVar = new ikm(z, wjmVar, (zjm) ((xvf0) kkmVar.a).get(), (t) ((xvf0) kkmVar.b).get(), (com.yandex.go.navigator.repository.c) ((xvf0) kkmVar.c).get(), (e) ((xvf0) kkmVar.d).get(), (m901) ((xvf0) kkmVar.e).get(), (com.yandex.go.navigator.a) ((xvf0) kkmVar.f).get(), (com.yandex.go.navigator.repository.o) ((xvf0) kkmVar.g).get(), (com.yandex.go.navigator.map_interactions.parkings.c) ((xvf0) kkmVar.h).get(), (vff) ((xvf0) kkmVar.i).get(), (com.yandex.go.navigator.driving.c) ((xvf0) kkmVar.j).get(), (oc50) ((xvf0) kkmVar.k).get(), (w) ((xvf0) kkmVar.l).get(), (b) ((xvf0) kkmVar.m).get(), (i19) ((xvf0) kkmVar.n).get(), (f) ((xvf0) kkmVar.o).get(), (pwy0) ((l4g) kkmVar.s).get(), (ru.yandex.taxi.design.utils.b) ((h4g) kkmVar.t).get(), (com.yandex.go.navigator.analitycs.a) ((xvf0) kkmVar.p).get(), (com.yandex.go.navigator.driving.analytics.a) ((xvf0) kkmVar.q).get(), (uyw) ((xvf0) kkmVar.r).get());
        st0 st0Var = this.H.a;
        return new DrivingModalView((Context) ((xvf0) st0Var.a).get(), ikmVar, (bkm) ((xvf0) st0Var.b).get(), (vjm) ((xvf0) st0Var.c).get(), (DrivingTopView) ((oti) st0Var.B).get(), (ru.yandex.taxi.discovery.a) ((rs0) st0Var.C).get(), (ah00) ((xvf0) st0Var.w).get(), (com.yandex.go.navigator.repository.o) ((xvf0) st0Var.x).get(), (e) ((xvf0) st0Var.y).get(), (ewc) ((fwc) st0Var.D).get(), (wb50) ((xvf0) st0Var.z).get(), (com.yandex.go.navigator.analitycs.a) ((xvf0) st0Var.A).get());
    }
}
