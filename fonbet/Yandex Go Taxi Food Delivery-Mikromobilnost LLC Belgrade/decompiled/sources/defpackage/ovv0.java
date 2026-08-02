package defpackage;

import android.content.Context;
import com.yandex.go.superapp.discovery.map.impl.domain.interactors.c;
import com.yandex.go.superapp.discovery.map.impl.experiments.SuperAppDiscoveryMapExperiment;
import com.yandex.go.superapp.discovery.map.impl.experiments.s;
import com.yandex.go.superapp.discovery.map.impl.navigation.common.a;
import com.yandex.go.superapp.discovery.map.impl.ui.main.SuperAppDiscoveryMapModalView;
import com.yandex.passport.sloth.ui.dependencies.m;
import java.util.Map;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class ovv0 extends a {
    public final w030 G;
    public final mvv0 H;
    public final gwv0 I;
    public final t6w0 J;
    public final s K;
    public final y50 L;
    public final yvf0 M;
    public final yvf0 N;
    public final f7c0 O;
    public final a211 P;
    public final ww9 Q;
    public final fin0 R;
    public final tux0 S;
    public final avv0 T;
    public final r4w0 U;

    public ovv0(w030 w030Var, mvv0 mvv0Var, gwv0 gwv0Var, t6w0 t6w0Var, s sVar, y50 y50Var, yvf0 yvf0Var, yvf0 yvf0Var2, f7c0 f7c0Var, a211 a211Var, ww9 ww9Var, fin0 fin0Var, tux0 tux0Var, avv0 avv0Var, r4w0 r4w0Var, rvv0 rvv0Var) {
        super(rvv0Var);
        this.G = w030Var;
        this.H = mvv0Var;
        this.I = gwv0Var;
        this.J = t6w0Var;
        this.K = sVar;
        this.L = y50Var;
        this.M = yvf0Var;
        this.N = yvf0Var2;
        this.O = f7c0Var;
        this.P = a211Var;
        this.Q = ww9Var;
        this.R = fin0Var;
        this.S = tux0Var;
        this.T = avv0Var;
        this.U = r4w0Var;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.G;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        c5w0 c5w0Var;
        s sVar = this.K;
        SuperAppDiscoveryMapExperiment.SearchBarConfig searchBarConfig = ((SuperAppDiscoveryMapExperiment) sVar.b().c()).i;
        if (searchBarConfig == null) {
            searchBarConfig = new SuperAppDiscoveryMapExperiment.SearchBarConfig(0);
        }
        wor0 wor0Var = new wor0(this);
        s14 s14Var = this.I.a;
        fwv0 fwv0Var = new fwv0(wor0Var, (k0b0) ((xvf0) s14Var.a).get(), (avv0) ((xvf0) s14Var.c).get(), (e7c0) ((xvf0) s14Var.d).get(), (z111) ((xvf0) s14Var.e).get(), (tuv0) ((xvf0) s14Var.f).get(), (c) ((xvf0) s14Var.g).get(), (kxv0) ((xvf0) s14Var.h).get(), (s) ((xvf0) s14Var.i).get(), (r4w0) ((miv0) s14Var.j).get(), (ah00) ((xvf0) s14Var.k).get(), (avv0) ((xvf0) s14Var.l).get(), (stv0) ((cys0) s14Var.m).get(), (pwy0) ((jag) s14Var.n).get(), (ktv0) ((xvf0) s14Var.b).get(), (wuo) ((iag) s14Var.o).get());
        if (searchBarConfig.a) {
            Map map = ((SuperAppDiscoveryMapExperiment) sVar.b().c()).b;
            t6w0 t6w0Var = this.J;
            t6w0Var.getClass();
            SuperAppDiscoveryMapExperiment.Searchbar searchbar = searchBarConfig.b;
            String str = (String) map.get(searchbar.a);
            if (str == null) {
                str = "";
            }
            if (evu0.J(str)) {
                str = null;
            }
            if (str == null) {
                str = null;
            }
            String str2 = searchbar.c;
            String str3 = !evu0.J(str2) ? str2 : null;
            String str4 = (String) map.get(searchbar.b);
            String str5 = str4 != null ? str4 : "";
            c5w0Var = new c5w0(str != null ? new a5w0(str) : null, !evu0.J(str5) ? str5 : null, str3, t6w0.a(searchbar.d), t6w0Var.b(searchBarConfig.c, map), t6w0Var.b(searchBarConfig.d, map));
        } else {
            c5w0Var = null;
        }
        m mVar = this.H.a;
        return new SuperAppDiscoveryMapModalView(fwv0Var, c5w0Var, (Context) ((iag) mVar.a).get(), (r3v) ((jag) mVar.b).get(), (vuv0) ((iag) mVar.c).get(), (bt00) ((iag) mVar.d).get(), (pav) ((iag) mVar.e).get(), (ip11) ((jag) mVar.f).get(), (w66) ((iag) mVar.g).get(), (ah00) ((iag) mVar.h).get(), (e) ((iag) mVar.i).get(), (tt2) ((iag) mVar.j).get());
    }
}
