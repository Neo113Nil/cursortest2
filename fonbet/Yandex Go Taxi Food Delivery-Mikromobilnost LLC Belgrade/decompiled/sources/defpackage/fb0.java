package defpackage;

import com.yandex.go.taxi.order.domain.repositories.e0;
import java.util.HashMap;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.deeplinks.a;
import ru.yandex.taxi.deeplinks.b;

/* loaded from: classes13.dex */
public final class fb0 extends h55 {
    public final yvf0 D;
    public final lx4 E;
    public final ycq0 F;
    public final yvf0 G;
    public final h3y H;
    public final h3y I;
    public final b J;
    public final sii K;
    public final h3y L;
    public final co40 M;

    public fb0(yvf0 yvf0Var, lx4 lx4Var, ycq0 ycq0Var, yvf0 yvf0Var2, h3y h3yVar, h3y h3yVar2, b bVar, sii siiVar, h3y h3yVar3, co40 co40Var) {
        super(null);
        this.D = yvf0Var;
        this.E = lx4Var;
        this.F = ycq0Var;
        this.G = yvf0Var2;
        this.H = h3yVar;
        this.I = h3yVar2;
        this.J = bVar;
        this.K = siiVar;
        this.L = h3yVar3;
        this.M = co40Var;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        sls slsVar = ((la0) obj).c;
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        la0 la0Var = (la0) obj;
        a.c(o(), this.J, new db0(0, this));
        ((j) this.E).n("AddCreditCardOpenByDeepLink");
        v770 v770Var = la0Var.b;
        String str = v770Var != null ? v770Var.a : null;
        co40 co40Var = this.M;
        co40Var.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("open_reason", str);
        }
        co40Var.a.a("SettingsDidSelectAddCard", hashMap, 1, new HashMap());
        A((m950) this.G.get(), new gj8(new cj8(la0Var.a)), new eb0(0, this));
    }

    public final void P(wqw wqwVar) {
        z80 z80Var = (z80) wqwVar;
        tu5 tu5Var = z80Var.c;
        if (tu5Var == null || !tu5Var.a.a || ((e0) ((com.yandex.go.taxi.order.provider.a) ((n20) this.H.get())).o()).u()) {
            tu5 tu5Var2 = z80Var.c;
            D((m950) this.K.get(), new eaa0(new h9a0(tu5Var2 != null && tu5Var2.a.a, null, ((e5d0) this.I.get()).a(), false, null, null, 48)), new bb0(this, 0));
        }
        r(new qu(9));
    }
}
