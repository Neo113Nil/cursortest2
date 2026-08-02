package defpackage;

import com.yandex.go.address.address_map_picker.analytics.ClarifyAnalytics$ClarifyPointType;
import com.yandex.go.address.address_map_picker.analytics.ClarifyAnalytics$ClarifySourceScreen;
import com.yandex.go.address.address_map_picker.api.AddressMapPickerPointType;
import com.yandex.go.address.address_map_picker.api.AddressMapPickerSourceScreen;
import com.yandex.go.address.address_map_picker.domain.d;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import java.util.HashMap;
import kotlinx.serialization.json.b;
import ru.yandex.taxi.address.clarification.impl.repo.a;

/* loaded from: classes12.dex */
public final class e21 extends BaseRootNavigationRouter implements b21 {
    public final yvf0 D;
    public final yvf0 E;
    public final cyx F;
    public final qx60 G;
    public final j11 H;
    public final g21 I;
    public final ayb J;
    public final d K;
    public final a L;
    public final jy0 M;
    public final qc N = new qc(2, this);

    public e21(yvf0 yvf0Var, yvf0 yvf0Var2, cyx cyxVar, qx60 qx60Var, j11 j11Var, g21 g21Var, ayb aybVar, d dVar, a aVar, jy0 jy0Var) {
        this.D = yvf0Var;
        this.E = yvf0Var2;
        this.F = cyxVar;
        this.G = qx60Var;
        this.H = j11Var;
        this.I = g21Var;
        this.J = aybVar;
        this.K = dVar;
        this.L = aVar;
        this.M = jy0Var;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        xp0 xp0Var;
        u11 u11Var = (u11) obj;
        this.F.b(new byx(Screen.CHOOSE_A, new c430(Mode.NORMAL, (b) null, (un0) null)));
        this.G.b(this.N);
        this.H.a.l(u11Var.b);
        switch (a21.b[u11Var.c.ordinal()]) {
            case 1:
            case 2:
                xp0Var = up0.b;
                break;
            case 3:
                xp0Var = vp0.b;
                break;
            case 4:
                xp0Var = tp0.b;
                break;
            case 5:
            case 6:
                xp0Var = wp0.b;
                break;
            default:
                w511.b();
                return;
        }
        this.L.d = xp0Var;
        this.K.a(xp0Var, o());
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        this.N.g();
        this.H.a.l(null);
        xp0 xp0Var = this.L.d;
        bp0 bp0Var = this.K.a;
        if (bp0Var.c.length() > 0) {
            bp0Var.b(xp0Var, bp0Var.c);
            bp0Var.c = "";
            bp0Var.b = null;
        }
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        ClarifyAnalytics$ClarifyPointType clarifyAnalytics$ClarifyPointType;
        u11 u11Var = (u11) obj;
        AddressMapPickerPointType b = ooa1.b(u11Var.b);
        int i = a21.a[b.ordinal()];
        if (i == 1) {
            clarifyAnalytics$ClarifyPointType = ClarifyAnalytics$ClarifyPointType.A;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            clarifyAnalytics$ClarifyPointType = ClarifyAnalytics$ClarifyPointType.B;
        }
        AddressMapPickerSourceScreen addressMapPickerSourceScreen = u11Var.c;
        ClarifyAnalytics$ClarifySourceScreen c = ooa1.c(addressMapPickerSourceScreen);
        ayb aybVar = this.J;
        aybVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("point_type", clarifyAnalytics$ClarifyPointType.getEventValue());
        hashMap.put("source_screen", c.getEventValue());
        aybVar.a.a("Clarify.Shown", hashMap, 1, new HashMap());
        A((m950) this.D.get(), new m01(u11Var.a, b), new c21());
        A((m950) this.E.get(), new w21(u11Var.b, addressMapPickerSourceScreen), new d21(this));
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return new BaseRootNavigationRouter.a(null, BaseRootNavigationRouter.Background.MAP, null, 13);
    }
}
