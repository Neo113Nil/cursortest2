package defpackage;

import android.view.ViewGroup;
import com.yandex.go.intercity.flex.dashboard.router.IntercityDashboardFlexRouterImpl$onLaunch$$inlined$safeCollectIn$1;
import flex.engine.a;

/* loaded from: classes12.dex */
public final class kew extends few {
    public final yvf0 F;
    public final ViewGroup G;
    public final a H;
    public final vu I;
    public final h3y J;
    public final uew K;

    public kew(yvf0 yvf0Var, ViewGroup viewGroup, a aVar, vu vuVar, h3y h3yVar, uew uewVar) {
        this.F = yvf0Var;
        this.G = viewGroup;
        this.H = aVar;
        this.I = vuVar;
        this.J = h3yVar;
        this.K = uewVar;
    }

    @Override // defpackage.tmr, defpackage.h55
    public final void J(Object obj) {
        super.J((lew) obj);
        tje.N(o(), null, null, new IntercityDashboardFlexRouterImpl$onLaunch$$inlined$safeCollectIn$1(this.K.a, null, this), 3);
    }

    @Override // defpackage.tmr
    public final void P(Object obj, ylr ylrVar) {
        this.G.addView(ylrVar.asView());
    }

    @Override // defpackage.tmr
    public final ylr Q(Object obj) {
        return (ylr) this.F.get();
    }
}
