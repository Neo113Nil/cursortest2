package defpackage;

import com.yandex.go.summary.interactor.anchored.state.t;
import com.yandex.go.summary.interactor.anchored.state.y;
import com.yandex.go.summary.interactor.common.state.c;
import com.yandex.go.taxi.summary.verticalsummary.interactor.TariffsUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1;
import com.yandex.go.taxi.summary.verticalsummary.interactor.b;
import com.yandex.go.taxi.summary.verticalsummary.interactor.e;
import com.yandex.go.taxi.summary.verticalsummary.interactor.f;
import com.yandex.go.taxi.summary.verticalsummary.interactor.j;
import com.yandex.go.taxi.summary.verticalsummary.interactor.l;
import kotlinx.coroutines.flow.internal.k;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes14.dex */
public final class li31 implements yt11 {
    public final tt2 a;
    public final t b;
    public final y c;
    public final f d;
    public final c e;
    public final aa1 f;
    public final hhs0 g;
    public final nej0 h;
    public final cg31 i;

    public li31(tt2 tt2Var, t tVar, y yVar, f fVar, c cVar, aa1 aa1Var, hhs0 hhs0Var, nej0 nej0Var, cg31 cg31Var) {
        this.a = tt2Var;
        this.b = tVar;
        this.c = yVar;
        this.d = fVar;
        this.e = cVar;
        this.f = aa1Var;
        this.g = hhs0Var;
        this.h = nej0Var;
        this.i = cg31Var;
    }

    @Override // defpackage.yt11
    public final tpr a() {
        f fVar = this.d;
        e eVar = new e(jha1.e(fVar.c));
        k a = fVar.e.a(eVar);
        com.yandex.go.taxi.summary.verticalsummary.interactor.c cVar = new com.yandex.go.taxi.summary.verticalsummary.interactor.c(new tpr[]{a, kotlinx.coroutines.flow.e.t(new b(a)), kotlinx.coroutines.flow.e.X(eVar, new TariffsUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1(null, fVar)), fVar.f.a(), fVar.d.a(), fVar.i.a}, fVar);
        l lVar = new l(this.e.k);
        tpr tprVar = this.f.b;
        m0 m0Var = this.b.i;
        m0 m0Var2 = this.c.b;
        tpr tprVar2 = this.h.e;
        cg31 cg31Var = this.i;
        j jVar = new j(new tpr[]{cVar, lVar, tprVar, m0Var, m0Var2, tprVar2, kotlinx.coroutines.flow.e.t(new com.yandex.go.taxi.summary.verticalsummary.expriment.c(cg31Var.a.c(), cg31Var)), (tpr) this.g.c});
        this.a.getClass();
        return kotlinx.coroutines.flow.e.F(jVar, uyj.a);
    }
}
