package defpackage;

import com.yandex.go.places.common.navigation.deeplink.PlacesNavigationMode;
import com.yandex.go.places.experiments.map.j;
import com.yandex.go.places.experiments.map.pin_war_v2.o;
import com.yandex.go.places.impl.navigation.map.PlacesMapMode;
import com.yandex.go.places.impl.navigation.organization.card.a;
import ru.yandex.taxi.deeplinks.b;

/* loaded from: classes13.dex */
public final class jcc0 extends t75 {
    public final ecc0 I;
    public a J;

    public jcc0(ecc0 ecc0Var, z0j z0jVar, dgc0 dgc0Var) {
        super(dgc0Var, z0jVar);
        this.I = ecc0Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        xl80 xl80Var = (xl80) obj;
        R(xl80Var);
        PlacesNavigationMode placesNavigationMode = this.F;
        if (placesNavigationMode == null) {
            ny61.r("Never should happen - navigationMode type is always non nullable");
            return;
        }
        PlacesMapMode Q = Q();
        fcc0 fcc0Var = this.I.a;
        a aVar = new a(placesNavigationMode, Q, (b) fcc0Var.a.get(), (dl80) fcc0Var.b.get(), (i6r) fcc0Var.c.get(), (j) fcc0Var.d.get(), (o) fcc0Var.e.get(), (com.yandex.go.places.experiments.tabbar.b) fcc0Var.f.get(), (kcc0) fcc0Var.g.get(), (com.yandex.go.places.experiments.map.social_pin.b) fcc0Var.h.get(), (c2x0) fcc0Var.i.get(), (w030) fcc0Var.j.get(), (n3h) fcc0Var.k.get(), (vgc0) fcc0Var.l.get(), (com.yandex.go.morphlex.router.b) fcc0Var.m.get(), (z0j) fcc0Var.n.get(), (com.yandex.go.places.experiments.flex.b) fcc0Var.o.get(), (kn80) fcc0Var.p.get(), (m9c0) fcc0Var.q.get(), (jyh) fcc0Var.r.get(), (com.yandex.go.places.complaint.impl.navigation.a) fcc0Var.s.get(), (kc50) fcc0Var.t.get(), (jj3) fcc0Var.u.get(), (acc0) fcc0Var.v.get(), (z0j) fcc0Var.w.get(), (l4c0) fcc0Var.x.get());
        this.J = aVar;
        h55 s75Var = Q() == PlacesMapMode.WITH_MAP ? new s75(this, xl80Var, aVar) : new rwo0(aVar, xl80Var);
        this.H = s75Var;
        E(s75Var, zy11.a, new r75(6, this), hxx.a);
        jst.e.n("[Places] organization card flow router launched with mapMode=" + Q());
    }

    @Override // defpackage.t75
    public final void P() {
        super.P();
        this.J = null;
    }
}
