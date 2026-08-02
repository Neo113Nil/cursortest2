package defpackage;

import com.yandex.go.dto.response.Action$CityMode$ContinuationAction$OpenSuggest;
import com.yandex.go.dto.response.n;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import java.util.Locale;
import ru.yandex.taxi.discovery.b;
import ru.yandex.taxi.layers.experiments.ScreenModeMapProvidersExperiment;
import ru.yandex.taxi.layers.experiments.p;

/* loaded from: classes5.dex */
public final class pmw extends h55 {
    public final h3y D;
    public final yvf0 E;
    public final qmw F;
    public final wd7 G;
    public final p H;
    public final ah00 I;
    public e90 J;
    public g18 K;

    public pmw(h3y h3yVar, yvf0 yvf0Var, qmw qmwVar, wd7 wd7Var, p pVar, ah00 ah00Var) {
        super(null);
        this.D = h3yVar;
        this.E = yvf0Var;
        this.F = qmwVar;
        this.G = wd7Var;
        this.H = pVar;
        this.I = ah00Var;
        this.K = g18.u1;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        g18 g18Var;
        tnw tnwVar = (tnw) obj;
        ((gh00) this.I).G(tnwVar.e);
        String str = tnwVar.b;
        String str2 = tnwVar.a;
        ScreenModeMapProvidersExperiment.b a = this.H.a(str);
        if (a != null ? a.d : false) {
            wd7 wd7Var = this.G;
            wd7Var.b.put(str2.toLowerCase(Locale.ROOT), ((gh00) wd7Var.a.a).e.b());
            g18Var = new l30(6, this, str2);
        } else {
            g18Var = g18.u1;
        }
        this.K = g18Var;
        e90 e90Var = this.J;
        if (e90Var != null) {
            e90Var.f();
        }
        b bVar = (b) this.D.get();
        byx byxVar = new byx(Screen.DISCOVERY, new c430(Mode.INTERCITY, tnwVar.c, (un0) null));
        gau gauVar = new gau(24, this);
        qmw qmwVar = this.F;
        qmwVar.d = gauVar;
        this.J = bVar.b(new mwj(str2, str, byxVar, new sw80(qmwVar)), new wui(this, 13));
        com.yandex.go.dto.response.p pVar = tnwVar.d.a;
        if (pVar instanceof Action$CityMode$ContinuationAction$OpenSuggest) {
            Action$CityMode$ContinuationAction$OpenSuggest action$CityMode$ContinuationAction$OpenSuggest = (Action$CityMode$ContinuationAction$OpenSuggest) pVar;
            A((m950) this.E.get(), action$CityMode$ContinuationAction$OpenSuggest.a, new omw(this, action$CityMode$ContinuationAction$OpenSuggest.b));
        } else {
            if (jl40.l(pVar, n.INSTANCE)) {
                return;
            }
            w511.b();
        }
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        this.K.cancel();
        e90 e90Var = this.J;
        if (e90Var != null) {
            e90Var.f();
        }
        this.J = null;
        j(dpb.a);
    }
}
