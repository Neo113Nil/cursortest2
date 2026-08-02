package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.preorder.mode.SourcePointMode;
import com.yandex.go.preorder.navigation.ModalsVisibility;
import com.yandex.go.route.interactor.c;
import com.yandex.go.taxi.summary.api.ui.MapPositionAction;
import com.yandex.go.zone.model.Zone;
import java.util.Objects;
import java.util.function.Consumer;
import ru.yandex.taxi.map.utils.a;
import ru.yandex.taxi.preorder.mainscreen.transition.ITransitionCoordinator;
import ru.yandex.taxi.preorder.source.domain.r;
import ru.yandex.taxi.preorder.source.mode.interactor.e;

/* loaded from: classes6.dex */
public final class net0 {
    public final grt0 a;
    public final ah00 b;
    public final qy41 c;
    public final pd61 d;
    public final agt0 e;
    public final yit0 f;
    public final c g;
    public final tit0 h;
    public final com.yandex.go.navigation.screen.c i;
    public final r j;
    public final e k;
    public final w330 l;
    public final fy01 m;
    public final biv0 n;
    public final j621 o;
    public final zit0 p;
    public final vvx0 q;
    public final ber r;

    public net0(grt0 grt0Var, ah00 ah00Var, qy41 qy41Var, pd61 pd61Var, agt0 agt0Var, yit0 yit0Var, c cVar, tit0 tit0Var, com.yandex.go.navigation.screen.c cVar2, r rVar, e eVar, w330 w330Var, fy01 fy01Var, biv0 biv0Var, j621 j621Var, zit0 zit0Var, vvx0 vvx0Var, ber berVar) {
        this.a = grt0Var;
        this.b = ah00Var;
        this.c = qy41Var;
        this.d = pd61Var;
        this.e = agt0Var;
        this.f = yit0Var;
        this.g = cVar;
        this.h = tit0Var;
        this.i = cVar2;
        this.j = rVar;
        this.k = eVar;
        this.l = w330Var;
        this.m = fy01Var;
        this.n = biv0Var;
        this.o = j621Var;
        this.p = zit0Var;
        this.q = vvx0Var;
        this.r = berVar;
    }

    public final void a(pv0 pv0Var) {
        ZoneAddress zoneAddress = this.g.c().a;
        tit0 tit0Var = this.h;
        boolean z = tit0Var.i && tit0Var.c == null;
        if (zoneAddress != null) {
            Address address = zoneAddress.a;
            if (z) {
                return;
            }
            ((gh00) this.b).G(address.B());
            this.q.a();
            if (this.i.h()) {
                ((nwx0) this.m).a.c().showControlElements(true);
            }
            boolean X1 = address.X1();
            yit0 yit0Var = this.f;
            if (X1 || !zoneAddress.a()) {
                yit0Var.a(MapPositionAction.DEFAULT);
                b(pv0Var, false);
                return;
            }
            d();
            if (!tit0Var.c()) {
                this.j.i(pv0Var);
                return;
            }
            tit0Var.a = null;
            if (this.k.a.a() == SourcePointMode.POINT) {
                yit0Var.a(MapPositionAction.DEFAULT);
            }
        }
    }

    public final void b(pv0 pv0Var, boolean z) {
        Address address = pv0Var.a;
        tit0 tit0Var = this.h;
        if (tit0Var.c == null) {
            if ((!tit0Var.c() || z) && !this.k.a.a().n()) {
                c(address, new let0(this, 0));
            }
        }
    }

    public final void c(Address address, Consumer consumer) {
        boolean z = false;
        int i = 1;
        if (((ry41) this.c).f()) {
            this.k.h(SourcePointMode.WHERE_YOU_ARE, true, false);
            return;
        }
        if (this.r.d() && jl40.l(address.getPickAction(), "auto")) {
            z = true;
        }
        PlainAddress plainAddress = this.h.a;
        if (plainAddress == null || z) {
            plainAddress = null;
        }
        zzs B = address.B();
        agt0 agt0Var = this.e;
        if (plainAddress == null) {
            hst hstVar = jst.e;
            Objects.toString(B);
            hstVar.getClass();
            if (!((hrt0) this.a).a()) {
                ((gh00) this.b).G(B);
                return;
            }
            let0 let0Var = new let0(this, i);
            gh00 gh00Var = (gh00) agt0Var.a;
            gh00Var.D(a.F(B), Math.max(gh00Var.j(), agt0Var.b.b), 500.0f, new mx0(15, let0Var));
            return;
        }
        hst hstVar2 = jst.e;
        zzs B2 = plainAddress.B();
        Objects.toString(B);
        Objects.toString(B2);
        hstVar2.getClass();
        this.p.a = address;
        zzs B3 = plainAddress.B();
        met0 met0Var = new met0(this, consumer);
        agt0Var.getClass();
        agt0Var.b(B, B3, new ku4(met0Var, agt0Var, B, B3, 4));
    }

    public final void d() {
        ZoneAddress zoneAddress;
        Zone c;
        if (this.k.a.a().u() || (zoneAddress = this.g.c().a) == null) {
            return;
        }
        Address address = zoneAddress.a;
        if (address.X1() || !zoneAddress.a()) {
            return;
        }
        ITransitionCoordinator c2 = ((nwx0) this.m).a.c();
        od61 od61Var = this.d.b;
        if (!od61Var.a() || ((c = od61Var.b.c()) != null && c.v.size() <= 1)) {
            c2.setSourceAddress(address);
            this.o.a.g(address);
        }
        if (zoneAddress.b != null) {
            jpv0 b = this.n.b();
            b.getClass();
            if (b instanceof fpv0) {
                oce0 oce0Var = this.h.c;
                c2.wa();
                this.l.a.g(ModalsVisibility.SHOW);
            }
        }
    }
}
