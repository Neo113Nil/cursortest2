package com.yandex.go.walking.navigation.impl.navigation_core.guidance;

import com.yandex.go.walking.navigation.impl.guidance.interactor.n;
import com.yandex.go.walking.navigation.impl.guidance.service.e;
import com.yandex.mapkit.navigation.transport.Navigation;
import com.yandex.mapkit.transport.masstransit.Route;
import defpackage.a201;
import defpackage.a341;
import defpackage.c441;
import defpackage.ehs0;
import defpackage.ist;
import defpackage.j241;
import defpackage.j4u;
import defpackage.jl40;
import defpackage.jst;
import defpackage.m141;
import defpackage.n141;
import defpackage.n241;
import defpackage.n541;
import defpackage.ncg;
import defpackage.nk91;
import defpackage.nzs;
import defpackage.q541;
import defpackage.tse;
import defpackage.v341;
import defpackage.x241;
import java.util.Iterator;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.navigation.single_guidance_coordinator.GuidanceOwnerId;

/* loaded from: classes8.dex */
public final class b {
    public final n141 a;
    public final ehs0 b;
    public final ist c = jst.e.A("WALKING_NAVIGATION:GUIDANCE_SESSION").m("WALKING_NAVIGATION:GUIDANCE_SESSION");
    public m141 d;

    public b(n141 n141Var, ehs0 ehs0Var) {
        this.a = n141Var;
        this.b = ehs0Var;
    }

    public final void a() {
        this.d = null;
        this.a.b();
    }

    public final void b() {
        m141 m141Var = this.d;
        if (m141Var != null) {
            return;
        }
        if (m141Var == null) {
            m141Var = this.a.a();
            this.d = m141Var;
        }
        com.yandex.go.coroutines.b.g((tse) ((ncg) m141Var).a.get(), null, null, new WalkNavGuidanceSessionInteractor$restoreSavedSession$1(m141Var, this, null), 3);
    }

    public final void c(String str, n541 n541Var) {
        Object obj;
        m141 m141Var = this.d;
        if (m141Var == null) {
            m141Var = this.a.a();
            this.d = m141Var;
        }
        ncg ncgVar = (ncg) m141Var;
        Navigation navigation = ((com.yandex.go.walking.navigation.impl.navigation_core.b) ncgVar.e.get()).c;
        ist istVar = this.c;
        if (navigation == null) {
            istVar.c("Attempt to start guidance with uninitialized navigation");
            a();
            return;
        }
        Iterator<T> it = navigation.getRoutes().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (jl40.l(((Route) obj).getMetadata().getRouteId(), str)) {
                    break;
                }
            }
        }
        Route route = (Route) obj;
        if (route == null) {
            istVar.c("Attempt to start guidance with a route not obtained from navigation");
            a();
            return;
        }
        navigation.resume();
        if (nk91.a(navigation)) {
            istVar.getClass();
            navigation.stopGuidance();
        }
        this.b.a(new a201(this));
        navigation.startGuidance(route);
        ((v341) ncgVar.t.get()).a();
        ((j241) ncgVar.i.get()).b(n541Var);
        ((e) ncgVar.s.get()).b();
        ((x241) ncgVar.n.get()).a(true);
        com.yandex.go.coroutines.b.g((tse) ncgVar.a.get(), null, null, new WalkNavGuidanceSessionInteractor$startNewSession$1(m141Var, navigation, n541Var, null), 3);
        ((a) ncgVar.p.get()).c((long) nzs.a(route));
        istVar.getClass();
    }

    public final void d() {
        m141 m141Var = this.d;
        if (m141Var == null) {
            return;
        }
        ncg ncgVar = (ncg) m141Var;
        ((a) ncgVar.p.get()).a();
        ((x241) ncgVar.n.get()).a(false);
        ((c441) ncgVar.m.get()).a();
        Navigation navigation = ((com.yandex.go.walking.navigation.impl.navigation_core.b) ncgVar.e.get()).c;
        if (navigation != null) {
            navigation.stopGuidance();
        }
        GuidanceOwnerId guidanceOwnerId = GuidanceOwnerId.WALKING_NAVIGATION;
        ehs0 ehs0Var = this.b;
        j4u j4uVar = ehs0Var.a;
        if (guidanceOwnerId == (j4uVar != null ? j4uVar.getId() : null)) {
            ehs0Var.a = null;
        }
        if (navigation != null) {
            navigation.suspend();
        }
        ((v341) ncgVar.t.get()).b();
        ((e) ncgVar.s.get()).c();
        ((j241) ncgVar.i.get()).a();
        ((n241) ncgVar.o.get()).c.q(-1L, "route_start_timestamp");
        ((a341) ncgVar.l.get()).a();
        q541 q541Var = (q541) ncgVar.q.get();
        r0 r0Var = q541Var.g;
        Double valueOf = Double.valueOf(0.0d);
        r0Var.getClass();
        r0Var.m(null, valueOf);
        q541Var.e = 0.0d;
        q541Var.f = 0.0d;
        q541Var.d.q(Double.doubleToLongBits(0.0d), "passed_distance");
        ((n) ncgVar.r.get()).b();
        com.yandex.go.coroutines.b.g((tse) ncgVar.a.get(), null, null, new WalkNavGuidanceSessionInteractor$stopSession$1(m141Var, this, null), 3);
    }
}
