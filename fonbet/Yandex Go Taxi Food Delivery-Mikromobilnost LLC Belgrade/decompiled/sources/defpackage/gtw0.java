package defpackage;

import android.content.Context;
import com.yandex.go.navigation.modals.coroutines.a;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.surge.dialog.SurgeInfoModalView;
import ru.yandex.taxi.surge.interactor.q;
import ru.yandex.taxi.surge.interactor.s;
import ru.yandex.taxi.surge.router.b;

/* loaded from: classes6.dex */
public final class gtw0 extends a {
    public final i130 F;
    public final fva0 G;
    public final ssw0 H;
    public final ysw0 I;
    public final yvf0 J;
    public final rqw0 K;
    public final s L;
    public final yvf0 M;
    public final yvf0 N;
    public final k4a O;
    public final boolean P;

    public gtw0(i130 i130Var, fva0 fva0Var, ssw0 ssw0Var, ysw0 ysw0Var, yvf0 yvf0Var, rqw0 rqw0Var, s sVar, yvf0 yvf0Var2, yvf0 yvf0Var3, k4a k4aVar) {
        super("SurgeInfoRouter");
        this.F = i130Var;
        this.G = fva0Var;
        this.H = ssw0Var;
        this.I = ysw0Var;
        this.J = yvf0Var;
        this.K = rqw0Var;
        this.L = sVar;
        this.M = yvf0Var2;
        this.N = yvf0Var3;
        this.O = k4aVar;
        this.P = true;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.F.a();
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return this.P;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final Object S(Object obj, Continuation continuation) {
        PerformanceAnalytics$Type performanceAnalytics$Type = PerformanceAnalytics$Type.Inflate;
        fva0 fva0Var = this.G;
        fva0.f(fva0Var, "SurgeCard", performanceAnalytics$Type, 0L, 4);
        b bVar = new b(this);
        uio0 uio0Var = this.I.a;
        xsw0 xsw0Var = new xsw0((q) ((xvf0) uio0Var.a).get(), (lg21) ((xvf0) uio0Var.b).get(), (zow0) ((p7w0) uio0Var.c).get(), bVar, (String) obj, (ru.yandex.taxi.surge.repository.a) ((xvf0) uio0Var.d).get(), (wiq0) ((xvf0) uio0Var.e).get(), (rge) ((xvf0) uio0Var.f).get());
        ki9 ki9Var = this.H.a;
        SurgeInfoModalView surgeInfoModalView = new SurgeInfoModalView((Context) ki9Var.a.get(), (ru.yandex.taxi.design.utils.a) ki9Var.b.get(), xsw0Var, (d4j) ki9Var.c.get(), (pdc) ki9Var.d.get(), (gvz0) ki9Var.e.get());
        fva0.c(fva0Var, surgeInfoModalView, "SurgeCard", performanceAnalytics$Type, 8);
        return surgeInfoModalView;
    }
}
