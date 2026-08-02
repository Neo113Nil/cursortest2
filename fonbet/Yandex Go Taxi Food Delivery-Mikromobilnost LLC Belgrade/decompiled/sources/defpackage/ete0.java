package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.route.interactor.c;
import com.yandex.go.sdc.api.SdcRouteSelectionAction$Origin;
import java.util.ArrayList;
import ru.yandex.taxi.address.clarification.impl.repo.a;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.sdc.router.e;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes13.dex */
public final class ete0 extends h55 {
    public final c D;
    public final com.yandex.go.navigation.screen.c E;
    public final cba0 F;
    public final aq80 G;
    public final a H;
    public final set0 I;
    public final yvf0 J;
    public final a850 K;
    public final i130 L;
    public final yvf0 M;
    public final yvf0 N;
    public final yvf0 O;
    public final so4 P;
    public final e Q;

    public ete0(c cVar, com.yandex.go.navigation.screen.c cVar2, cba0 cba0Var, aq80 aq80Var, a aVar, set0 set0Var, yvf0 yvf0Var, a850 a850Var, i130 i130Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, so4 so4Var, e eVar) {
        super(null);
        this.D = cVar;
        this.E = cVar2;
        this.F = cba0Var;
        this.G = aq80Var;
        this.H = aVar;
        this.I = set0Var;
        this.J = yvf0Var;
        this.K = a850Var;
        this.L = i130Var;
        this.M = yvf0Var2;
        this.N = yvf0Var3;
        this.O = yvf0Var4;
        this.P = so4Var;
        this.Q = eVar;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        ynv0 vnv0Var;
        nte0 nte0Var = (nte0) obj;
        this.K.i("pickup_location", true);
        if (nte0Var instanceof hte0) {
            P();
            return;
        }
        boolean z = nte0Var instanceof lte0;
        set0 set0Var = this.I;
        if (z) {
            set0Var.g.a(new pet0(set0Var, 0));
            return;
        }
        if (nte0Var instanceof fte0) {
            Address g = this.D.g();
            if (g == null) {
                P();
                return;
            } else {
                set0Var.getClass();
                set0Var.a(PointType.DESTINATION, g, SourcePicker.A_FROM_SUMMARY, ModalViewOrigin.SUMMARY, false, true, true);
                return;
            }
        }
        if (nte0Var instanceof kte0) {
            vmn0 vmn0Var = ((kte0) nte0Var).a;
            P();
            String str = (String) vmn0Var.a;
            String str2 = (String) vmn0Var.b;
            ArrayList arrayList = (ArrayList) vmn0Var.c;
            int i = dte0.a[((SdcRouteSelectionAction$Origin) vmn0Var.y).ordinal()];
            if (i == 1) {
                vnv0Var = new vnv0(null, null);
            } else {
                if (i != 2) {
                    w511.b();
                    return;
                }
                vnv0Var = xnv0.a;
            }
            this.Q.c(str, str2, arrayList, vnv0Var);
            return;
        }
        if (nte0Var instanceof gte0) {
            A((m950) this.M.get(), ((gte0) nte0Var).a, sy60.Q2);
            return;
        }
        if (nte0Var instanceof jte0) {
            k9s0 k9s0Var = ((jte0) nte0Var).a;
            A((m950) this.J.get(), tjv0.c, new cb0(17, this, k9s0Var));
            return;
        }
        if (nte0Var instanceof ite0) {
            ite0 ite0Var = (ite0) nte0Var;
            this.L.a().a();
            D((m950) this.N.get(), new wb60(ite0Var.a, ite0Var.b), new cte0(this, 0));
        } else if (nte0Var instanceof mte0) {
            D((m950) this.O.get(), new n521(((mte0) nte0Var).a), new cte0(this, 2));
        } else {
            w511.b();
        }
    }

    public final void P() {
        C((m950) this.P.get(), new cte0(this, 1));
    }
}
