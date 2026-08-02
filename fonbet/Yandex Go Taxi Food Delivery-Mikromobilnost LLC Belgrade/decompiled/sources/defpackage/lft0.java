package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.destination_picker.ChooseAddressMode;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.route.interactor.c;
import java.util.HashMap;
import java.util.List;
import ru.yandex.taxi.analytics.SourceScreenAnalytics$TappedObject;
import ru.yandex.taxi.analytics.r;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.preorder.source.SourcePointFragment;
import ru.yandex.taxi.preorder.tollroad.analytics.TollRoadSetReason;
import ru.yandex.taxi.routeselector.analytics.RouteSelectorOpenReason;

/* loaded from: classes6.dex */
public final class lft0 implements n6l0 {
    public final /* synthetic */ SourcePointFragment a;

    public lft0(SourcePointFragment sourcePointFragment) {
        this.a = sourcePointFragment;
    }

    public final void I(int i) {
        eht0 eht0Var;
        eht0Var = this.a.presenter;
        if (eht0Var.q0.b() == Screen.ROUTE_STOPS_V2) {
            int f = scc.f(eht0Var.z.c().b);
            r rVar = eht0Var.v0;
            if (f == i) {
                rVar.a();
            } else {
                rVar.c();
            }
        }
        pgu0 pgu0Var = eht0Var.W;
        c cVar = pgu0Var.b;
        if (pgu0Var.a.a.a().m()) {
            ChooseAddressMode chooseAddressMode = scc.f(cVar.c().b) == i ? ChooseAddressMode.DESTINATION : ChooseAddressMode.STOP;
            jpv0 b = pgu0Var.c.b();
            b.getClass();
            arb arbVar = b instanceof fpv0 ? new arb("pickup_location", chooseAddressMode, ModalViewOrigin.HOME) : new arb("order_summary", chooseAddressMode, ModalViewOrigin.SUMMARY);
            List list = cVar.c().b;
            if (i < 0 || i > scc.f(list)) {
                xby.t(jst.e, "STOP_POINT:OUT_OF_BOUNDS", new IndexOutOfBoundsException(oyr.h(i, list.size(), "Index: ", ", Size: ")), "Route changed after stop point tapped", 2);
            } else {
                ((pep0) pgu0Var.f).f(new xx70(11, (qzi) pgu0Var.e.get(), new ogu0(0, pgu0Var)), new vzi(cVar.g(), (Address) list.get(i), i, arbVar, RouteSelectorOpenReason.PIN), hxx.a);
            }
        }
    }

    public final void h() {
        eht0 eht0Var;
        eht0Var = this.a.presenter;
        eht0Var.Lg();
    }

    @Override // defpackage.n6l0
    public final void me(ylm ylmVar, SourceScreenAnalytics$TappedObject sourceScreenAnalytics$TappedObject) {
        eht0 eht0Var;
        eht0Var = this.a.presenter;
        eht0Var.I.a.e(ylmVar.b(), TollRoadSetReason.ROUTE_TAPPED);
        rjt0 rjt0Var = eht0Var.B;
        boolean b = ylmVar.b();
        kf00 kf00Var = rjt0Var.n;
        int i = qjt0.c[sourceScreenAnalytics$TappedObject.ordinal()];
        if (i == 1) {
            String modeName = rjt0Var.o.getModeName();
            String str = b ? "toll" : "free";
            HashMap A = oyr.A(kf00Var);
            if (modeName != null) {
                A.put("mode", modeName);
            }
            A.put("road_type", str);
            x4e.B(kf00Var.a, "Map.Route.Tapped", A, 1);
            return;
        }
        if (i != 2) {
            w511.b();
            return;
        }
        String modeName2 = rjt0Var.o.getModeName();
        HashMap A2 = oyr.A(kf00Var);
        if (modeName2 != null) {
            A2.put("mode", modeName2);
        }
        x4e.B(kf00Var.a, "Map.TollRouteBubble.Tapped", A2, 1);
    }
}
