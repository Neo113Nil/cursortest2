package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.navigation.screen.api.Screen;
import kotlin.Pair;
import ru.yandex.taxi.common_models.net.map_object.Trigger;
import ru.yandex.taxi.multiexit.MultiexitModalView;
import ru.yandex.taxi.preorder.source.domain.r;
import ru.yandex.taxi.preorder.source.pickup.PickupPointAnalytics$PointType;
import ru.yandex.taxi.routeselector.view.RouteSelectorModalView;

/* loaded from: classes6.dex */
public final class hvd0 {
    public final zit0 a;
    public final r b;
    public final uq40 c;
    public final nzb0 d;
    public final lgt0 e;
    public final net0 f;

    public hvd0(zit0 zit0Var, r rVar, uq40 uq40Var, nzb0 nzb0Var, lgt0 lgt0Var, net0 net0Var) {
        this.a = zit0Var;
        this.b = rVar;
        this.c = uq40Var;
        this.d = nzb0Var;
        this.e = lgt0Var;
        this.f = net0Var;
    }

    public final boolean a(zzs zzsVar) {
        wpb0 j;
        Object sqb0Var;
        Address address = this.a.a;
        int i = 0;
        if (address != null) {
            net0 net0Var = this.f;
            net0Var.getClass();
            net0Var.c(address, new let0(net0Var, i));
        }
        if (zzsVar != null) {
            r rVar = this.b;
            if (rVar.e.Kg() && (j = rVar.j(zzsVar, true)) != null) {
                rVar.d.j = "tap";
                RouteSelectorModalView routeSelectorModalView = (RouteSelectorModalView) rVar.k.a().i(RouteSelectorModalView.class);
                if (routeSelectorModalView != null) {
                    routeSelectorModalView.onPickupPointTapped(j);
                }
                uud0 b = j.b(Trigger.TAP);
                if (b == null || !b.c) {
                    Pair b2 = rVar.l.b(j);
                    jr40 jr40Var = b2 != null ? (jr40) b2.c() : null;
                    wq40 wq40Var = b2 != null ? (wq40) b2.f() : null;
                    sqb0Var = (jr40Var == null || wq40Var == null || !j.m || rVar.m.b() != Screen.MULTI_AREA) ? new sqb0(j.b) : new tqb0(jr40Var, wq40Var);
                } else {
                    rVar.e(j.a, b);
                    rVar.f.a(j, PickupPointAnalytics$PointType.SOURCE, "tap");
                    sqb0Var = rqb0.a;
                }
                if (!(sqb0Var instanceof rqb0)) {
                    this.d.a.f();
                    if (sqb0Var instanceof tqb0) {
                        tqb0 tqb0Var = (tqb0) sqb0Var;
                        jr40 jr40Var2 = tqb0Var.a;
                        wq40 wq40Var2 = tqb0Var.b;
                        MultiexitModalView multiexitModalView = this.c.I;
                        if (multiexitModalView != null) {
                            multiexitModalView.selectEntrance(jr40Var2, wq40Var2);
                            return true;
                        }
                    } else if (sqb0Var instanceof sqb0) {
                        this.e.a(((sqb0) sqb0Var).a, null);
                    }
                }
                return true;
            }
        }
        return false;
    }
}
