package defpackage;

import android.content.Context;
import com.yandex.go.navigator.alt_select.AltSelectModalView;
import com.yandex.go.navigator.alt_select.a;
import com.yandex.go.navigator.alt_select.e;
import com.yandex.go.navigator.analitycs.Screen;
import com.yandex.go.navigator.domain.t;
import com.yandex.go.navigator.map_interactions.parkings.c;
import com.yandex.go.navigator.repository.o;
import ru.yandex.taxi.design.utils.b;

/* loaded from: classes12.dex */
public final class jg50 extends m230 {
    public final w030 E;
    public final jv1 F;
    public final fv1 G;
    public final re50 H;
    public final yvf0 I;
    public final yvf0 J;
    public final eb50 K;
    public final boolean L;

    public jg50(w030 w030Var, jv1 jv1Var, fv1 fv1Var, re50 re50Var, yvf0 yvf0Var, yvf0 yvf0Var2, eb50 eb50Var) {
        super(null);
        this.E = w030Var;
        this.F = jv1Var;
        this.G = fv1Var;
        this.H = re50Var;
        this.I = yvf0Var;
        this.J = yvf0Var2;
        this.K = eb50Var;
        this.L = true;
    }

    @Override // defpackage.m230, defpackage.h55
    public final void G(Object obj) {
        super.G((bg50) obj);
        this.K.a = Screen.Summary;
    }

    @Override // defpackage.m230, defpackage.h55
    public final void H(Object obj) {
        this.K.a = null;
        super.H((bg50) obj);
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.L;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        bg50 bg50Var = (bg50) obj;
        xl10 xl10Var = new xl10(this);
        boolean z = bg50Var.a;
        boolean z2 = bg50Var.b;
        kv1 kv1Var = this.F.a;
        e eVar = new e(xl10Var, z, z2, (a) ((rs0) kv1Var.f).get(), (com.yandex.go.navigator.address.e) ((wun0) kv1Var.g).get(), (x1l0) ((xvf0) kv1Var.a).get(), (com.yandex.go.navigator.domain.e) ((xvf0) kv1Var.b).get(), (ya50) ((xvf0) kv1Var.c).get(), (m901) ((xvf0) kv1Var.d).get(), (t) ((xvf0) kv1Var.e).get(), (liq0) ((xvf0) kv1Var.h).get(), (uyd) ((xvf0) kv1Var.i).get(), (zuj0) ((xvf0) kv1Var.j).get(), (com.yandex.go.navigator.a) ((xvf0) kv1Var.k).get(), (pwy0) ((xvf0) kv1Var.l).get(), (b) ((xvf0) kv1Var.m).get(), (wg50) ((jc50) kv1Var.s).get(), (kip) ((wz30) kv1Var.t).get(), (c) ((xvf0) kv1Var.n).get(), (ag31) ((nb11) kv1Var.u).get(), (oc50) ((xvf0) kv1Var.o).get(), (xb50) ((xvf0) kv1Var.p).get(), (ah00) ((xvf0) kv1Var.q).get(), (re50) ((xvf0) kv1Var.r).get());
        gv1 gv1Var = this.G.a;
        return new AltSelectModalView((Context) gv1Var.a.get(), eVar, (ru.yandex.taxi.discovery.a) gv1Var.b.get(), (ah00) gv1Var.c.get(), (wb50) gv1Var.d.get(), (o) gv1Var.e.get(), (com.yandex.go.navigator.domain.e) gv1Var.f.get(), (ewc) gv1Var.g.get(), (lk31) gv1Var.h.get(), (com.yandex.go.navigator.analitycs.a) gv1Var.i.get());
    }
}
