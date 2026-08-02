package xsna;

import androidx.lifecycle.Lifecycle;
import com.vk.search.params.api.SearchParams;
import com.vk.search.ui.api.SearchQuery;
import java.util.concurrent.ExecutorService;
import xsna.gm50;
import xsna.ish0;
import xsna.wqh0;

/* compiled from: SearchFeatureControllerImpl.kt */
/* loaded from: classes5.dex */
public final class crh0<P extends SearchParams> implements yh90<P> {
    public final vqh0 a;

    public crh0(vqh0 vqh0Var) {
        this.a = vqh0Var;
    }

    @Override // xsna.zqh0
    public final void a(boolean z, boolean z2) {
        this.a.C(new wqh0.o(z, z2));
    }

    @Override // xsna.zqh0
    public final void a0() {
        this.a.C(wqh0.a.b);
    }

    @Override // xsna.zqh0
    public final void b() {
        this.a.C(wqh0.b.b);
    }

    @Override // xsna.zqh0
    public final void c() {
        this.a.C(wqh0.p.b);
    }

    @Override // xsna.zqh0
    public final void d(erh0 erh0Var, f5z f5zVar) {
        hrh0 hrh0Var = new hrh0(erh0Var, f5zVar);
        f5zVar.getLifecycle().addObserver(new frh0(f5zVar, this.a.g.a(new isg(new sk3(), fpf0.a(ish0.i.class), new grh0(1, hrh0Var, hrh0.class, "onSideEffect", "onSideEffect(Lcom/vk/search/ui/impl/feature/spec/SearchFeatureSideEffect$NavigationSideEffect;)V", 0), 7), f5zVar)));
    }

    @Override // xsna.zqh0
    public final void e(SearchQuery searchQuery, b9q0 b9q0Var) {
        this.a.C(new wqh0.u(searchQuery, b9q0Var));
    }

    @Override // xsna.zqh0
    public final void f(vrh0 vrh0Var, f5z f5zVar) {
        vqh0 vqh0Var = this.a;
        zrh0 zrh0Var = new zrh0(vrh0Var, vqh0Var, f5zVar);
        fi50 fi50Var = ((nsh0) vqh0Var.c.g()).a;
        f4z f4zVar = vqh0Var.g;
        rfc a = fpf0.a(ish0.l.class);
        sk3 sk3Var = new sk3();
        vgn vgnVar = zrh0Var.d;
        if (vgnVar.e.d != Lifecycle.State.DESTROYED) {
            vrh0Var.a(zrh0Var);
            vgnVar.e.addObserver(new wrh0(zrh0Var));
        }
        vqh0Var.C(new wqh0.n(vrh0Var.i(), vrh0Var.b()));
        ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
        com.vk.mvi.core.internal.executors.a.b(new xrh0(zrh0Var, fi50Var));
        f4zVar.a(new isg(sk3Var, a, new yrh0(1, zrh0Var, zrh0.class, "onQuerySideEffect", "onQuerySideEffect(Lcom/vk/search/ui/impl/feature/spec/SearchFeatureSideEffect$QuerySideEffect;)V", 0), 7), vgnVar);
    }

    @Override // xsna.yh90
    public final void g(uh90 uh90Var, f5z f5zVar, gy gyVar) {
        vqh0 vqh0Var = this.a;
        orh0 orh0Var = new orh0(uh90Var, gyVar, vqh0Var, f5zVar);
        fi50 fi50Var = ((nsh0) vqh0Var.c.g()).b;
        uh90Var.setOnClickListener(new q3(orh0Var, 11));
        uh90Var.setOnCloseClickListener(new bi80(orh0Var, 14));
        bwt0.p0(uh90Var, false);
        gm50.a.b(orh0Var, fi50Var, new qz40(orh0Var, 22));
    }

    @Override // xsna.yh90
    public final void h(P p) {
        this.a.C(new wqh0.i(p));
    }

    @Override // xsna.yh90
    public final void j(krh0<? super P> krh0Var, f5z f5zVar) {
        nrh0 nrh0Var = new nrh0(krh0Var, f5zVar);
        f5zVar.getLifecycle().addObserver(new lrh0(f5zVar, this.a.g.a(new isg(new sk3(), fpf0.a(ish0.k.class), new mrh0(1, nrh0Var, nrh0.class, "onSideEffect", "onSideEffect(Lcom/vk/search/ui/impl/feature/spec/SearchFeatureSideEffect$ParamsSideEffect;)V", 0), 7), f5zVar)));
    }

    @Override // xsna.zqh0
    public final void k(esh0 esh0Var, f5z f5zVar) {
        vqh0 vqh0Var = this.a;
        hsh0 hsh0Var = new hsh0(esh0Var, vqh0Var, f5zVar);
        f4z f4zVar = vqh0Var.g;
        rfc a = fpf0.a(ish0.c.class);
        sk3 sk3Var = new sk3();
        vqh0Var.C(wqh0.c.b);
        f5zVar.getLifecycle().addObserver(new fsh0(f5zVar, f4zVar.a(new isg(sk3Var, a, new gsh0(1, hsh0Var, hsh0.class, "onSideEffect", "onSideEffect(Lcom/vk/search/ui/impl/feature/spec/SearchFeatureSideEffect$CatalogSideEffect;)V", 0), 7), f5zVar), hsh0Var));
    }
}
