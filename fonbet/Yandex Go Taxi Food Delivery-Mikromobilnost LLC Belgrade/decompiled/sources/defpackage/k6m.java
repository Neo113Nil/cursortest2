package defpackage;

import com.yandex.go.taxi.experiments.i;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.yb.data.u;
import java.util.Iterator;
import ru.yandex.taxi.preorder.summary.selector.analytics.VerticalSelectorAnalytics$SelectionChangeReason;
import ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.a;

/* loaded from: classes6.dex */
public final class k6m extends ad5 {
    public final m9s0 A;
    public final tt2 B;
    public final biv0 C;
    public final vpv0 D;
    public final a.InterfaceC0113a E;
    public final n070 F;
    public final jy51 G;
    public final u H;
    public final fux I;
    public final ag31 J;
    public final nv20 K;
    public final y50 L;
    public final i M;
    public final aqv0 N;
    public final c6m O;
    public boolean P;
    public final wiq0 x;
    public final ck31 y;
    public final nex0 z;

    public k6m(wiq0 wiq0Var, ck31 ck31Var, nex0 nex0Var, m9s0 m9s0Var, tt2 tt2Var, biv0 biv0Var, vpv0 vpv0Var, a.InterfaceC0113a interfaceC0113a, n070 n070Var, jy51 jy51Var, u uVar, fux fuxVar, ag31 ag31Var, nv20 nv20Var, y50 y50Var, i iVar, aqv0 aqv0Var, c6m c6mVar) {
        super(r6m.class);
        this.x = wiq0Var;
        this.y = ck31Var;
        this.z = nex0Var;
        this.A = m9s0Var;
        this.B = tt2Var;
        this.C = biv0Var;
        this.D = vpv0Var;
        this.E = interfaceC0113a;
        this.F = n070Var;
        this.G = jy51Var;
        this.H = uVar;
        this.I = fuxVar;
        this.J = ag31Var;
        this.K = nv20Var;
        this.L = y50Var;
        this.M = iVar;
        this.N = aqv0Var;
        this.O = c6mVar;
    }

    public final void Kg(String str, VerticalSelectorAnalytics$SelectionChangeReason verticalSelectorAnalytics$SelectionChangeReason) {
        Object obj;
        Object obj2;
        k kVar = (k) this.y;
        Iterator it = kVar.j().a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (jl40.l(((za31) obj).d, str)) {
                    break;
                }
            }
        }
        za31 za31Var = (za31) obj;
        String str2 = za31Var != null ? za31Var.a.d : null;
        String str3 = str2 == null ? "" : str2;
        Iterator it2 = kVar.j().a.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it2.next();
                if (jl40.l(((za31) obj2).d, kVar.h())) {
                    break;
                }
            }
        }
        za31 za31Var2 = (za31) obj2;
        String str4 = za31Var2 != null ? za31Var2.a.d : null;
        this.J.a(str, str3, kVar.h(), str4 == null ? "" : str4, verticalSelectorAnalytics$SelectionChangeReason);
    }
}
