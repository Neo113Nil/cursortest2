package defpackage;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.address.models.Address;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.route.interactor.c;
import com.yandex.go.zone.model.Zone;
import com.yandex.go.zone.model.ZoneMode;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.preorder.source.domain.r;
import ru.yandex.taxi.preorder.source.mode.interactor.e;
import ru.yandex.taxi.search.suggest.i;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes6.dex */
public final class jjt0 implements mh9 {
    public final ah00 a;
    public final pd61 b;
    public final e c;
    public final c d;
    public final net0 e;
    public final com.yandex.go.navigation.screen.c f;
    public final ng9 g;
    public final kqv0 h;
    public final ftx i;
    public final r j;
    public final fy01 k;
    public final ket0 l;
    public final tft0 m;
    public final git0 n;

    public jjt0(ah00 ah00Var, pd61 pd61Var, e eVar, c cVar, net0 net0Var, com.yandex.go.navigation.screen.c cVar2, ng9 ng9Var, kqv0 kqv0Var, ftx ftxVar, r rVar, fy01 fy01Var, ket0 ket0Var, tft0 tft0Var, git0 git0Var) {
        this.a = ah00Var;
        this.b = pd61Var;
        this.c = eVar;
        this.d = cVar;
        this.e = net0Var;
        this.f = cVar2;
        this.g = ng9Var;
        this.h = kqv0Var;
        this.i = ftxVar;
        this.j = rVar;
        this.k = fy01Var;
        this.l = ket0Var;
        this.m = tft0Var;
        this.n = git0Var;
    }

    public final void a(Zone zone, zzs zzsVar) {
        if (this.c.a.a().u()) {
            return;
        }
        this.i.a.l(zone);
        this.e.d();
        this.h.a();
        pd61 pd61Var = this.b;
        od61 od61Var = pd61Var.b;
        String b = pd61Var.c.b();
        Zone c = od61Var.b.c();
        if (c != null) {
            List list = c.v;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (jl40.l(b, ((ZoneMode) it.next()).a)) {
                    }
                }
            }
            if (pd61Var.a()) {
                c(zzsVar);
            }
            ((nwx0) this.k).a.c().xb();
        }
        pd61Var.b();
        ((nwx0) this.k).a.c().xb();
    }

    public final void b(Zone zone, zzs zzsVar) {
        wpb0 j;
        uud0 c;
        if (this.n.a.w.a(Lifecycle.State.STARTED)) {
            a(zone, zzsVar);
            ((nwx0) this.l.c).a.c().Rf();
            Address g = this.d.g();
            if (g == null || (j = this.j.j(g.B(), false)) == null || (c = j.c()) == null) {
                return;
            }
            this.g.a(c.d(), SelectionOrigin.USER, new d82(1), new c90(18), this.f.b() == Screen.MULTI_AREA);
        }
    }

    public final void c(zzs zzsVar) {
        this.j.F = false;
        if (zzsVar == null) {
            zzsVar = ((gh00) this.a).e.b();
        }
        wit0 wit0Var = (wit0) this.m.a(true);
        wit0Var.a(false);
        wit0Var.a.h = zzsVar;
        wit0Var.d.a = null;
        ((i) wit0Var.b).t(zzsVar, RoutePointType.POINT_A);
    }
}
