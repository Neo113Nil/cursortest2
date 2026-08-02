package defpackage;

import android.content.Context;
import com.yandex.go.places.impl.domain.interactors.common.a;
import com.yandex.go.places.impl.ui.organizations.OrganizationsModalView;
import com.yandex.go.places.impl.ui.organizations.d;
import com.yandex.go.places.map.data.repositories.h;
import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$PlacesMapScreenName;
import com.yandex.passport.sloth.ui.dependencies.m;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.utils.b;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class po80 extends m230 implements bgc0 {
    public final mo80 E;
    public final yo80 F;
    public final yvf0 G;
    public final yvf0 H;
    public final cn80 I;
    public final eo80 J;
    public final go80 K;
    public final yac0 L;
    public final tt2 M;
    public final w030 N;
    public final mg80 O;
    public final wbc0 P;
    public ike Q;
    public final boolean R;
    public do80 S;

    public po80(mo80 mo80Var, yo80 yo80Var, yvf0 yvf0Var, yvf0 yvf0Var2, cn80 cn80Var, eo80 eo80Var, go80 go80Var, yac0 yac0Var, tt2 tt2Var, w030 w030Var, mg80 mg80Var, wbc0 wbc0Var) {
        super(null);
        this.E = mo80Var;
        this.F = yo80Var;
        this.G = yvf0Var;
        this.H = yvf0Var2;
        this.I = cn80Var;
        this.J = eo80Var;
        this.K = go80Var;
        this.L = yac0Var;
        this.M = tt2Var;
        this.N = w030Var;
        this.O = mg80Var;
        this.P = wbc0Var;
        this.R = true;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.I.a.l(null);
        this.O.b();
        this.P.b();
        if (this.L.a) {
            ike ikeVar = this.Q;
            if (ikeVar != null) {
                bvf0.j(ikeVar, null);
            }
            do80 do80Var = this.S;
            if (do80Var != null) {
                do80Var.x.b();
                do80Var.Jg();
            }
        }
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        ike ikeVar;
        yl80 yl80Var = (yl80) obj;
        if (yl80Var.h) {
            this.K.a();
        }
        bn80 bn80Var = new bn80(yl80Var.c, yl80Var.e, yl80Var.g, yl80Var.d);
        r0 r0Var = this.I.a;
        r0Var.getClass();
        r0Var.m(null, bn80Var);
        if (this.L.a) {
            ike ikeVar2 = this.Q;
            if (ikeVar2 != null && bvf0.D(ikeVar2) && (ikeVar = this.Q) != null) {
                bvf0.j(ikeVar, null);
            }
            this.M.getClass();
            sjh sjhVar = uyj.a;
            this.Q = g8e.f(o400.a);
            do80 a = this.J.a(yl80Var.h, PlacesMapConfig$PlacesMapScreenName.PLACES_ORGANIZATIONS_LIST);
            a.attach();
            this.S = a;
        }
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.N;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.R;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        nw70 nw70Var = new nw70(3, this);
        ike ikeVar = this.Q;
        kkm kkmVar = this.F.a;
        d dVar = new d((a) ((xvf0) kkmVar.a).get(), (k0b0) ((xvf0) kkmVar.b).get(), (ah00) ((xvf0) kkmVar.c).get(), nw70Var, ikeVar, (yac0) ((xvf0) kkmVar.d).get(), (e) ((xvf0) kkmVar.e).get(), (tt2) ((xvf0) kkmVar.f).get(), (b) ((xvf0) kkmVar.g).get(), (zuj0) ((xvf0) kkmVar.h).get(), (pwy0) ((xvf0) kkmVar.i).get(), (com.yandex.go.places.impl.ui.organizations.e) ((q150) kkmVar.s).get(), (com.yandex.go.places.impl.domain.interactors.a) ((xvf0) kkmVar.j).get(), (go80) ((xvf0) kkmVar.k).get(), (h) ((xvf0) kkmVar.l).get(), (jdj) ((wrh) kkmVar.t).get(), (cn80) ((xvf0) kkmVar.m).get(), (jio) ((xvf0) kkmVar.n).get(), (com.yandex.go.places.impl.navigation.common.navigator.internal.b) ((xvf0) kkmVar.o).get(), (wbc0) ((xvf0) kkmVar.p).get(), (mg80) ((xvf0) kkmVar.q).get(), (com.yandex.go.places.experiments.flex.b) ((xvf0) kkmVar.r).get());
        u370 u370Var = ((yl80) obj).f;
        m mVar = this.E.a;
        return new OrganizationsModalView((Context) ((x4g) mVar.a).get(), (pav) ((xvf0) mVar.b).get(), (tt2) ((xvf0) mVar.c).get(), (ru.yandex.taxi.design.utils.a) ((xvf0) mVar.d).get(), (c2x0) ((z4g) mVar.e).get(), ((Boolean) ((xvf0) mVar.f).get()).booleanValue(), dVar, u370Var, (yac0) ((xvf0) mVar.g).get(), (kbc0) ((n3w) mVar.h).a, (a3v) ((xvf0) mVar.i).get(), (a4j0) ((xvf0) mVar.j).get());
    }

    @Override // defpackage.bgc0
    public final void b(Object obj) {
        yl80 yl80Var = (yl80) obj;
        bn80 bn80Var = new bn80(yl80Var.c, yl80Var.e, yl80Var.g, yl80Var.d);
        r0 r0Var = this.I.a;
        r0Var.getClass();
        r0Var.m(null, bn80Var);
    }

    @Override // defpackage.bgc0
    public final /* bridge */ /* synthetic */ boolean c(Object obj) {
        return true;
    }
}
