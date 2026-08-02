package com.yandex.go.navigator.domain;

import android.util.Base64;
import com.yandex.go.address.models.Address;
import com.yandex.go.navigator.repository.SoundMode;
import com.yandex.go.navigator.repository.VoiceMode;
import com.yandex.mapkit.annotations.AnnotationLanguage;
import com.yandex.mapkit.directions.driving.AvoidanceFlags;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.navigation.automotive.AnnotatedEvents;
import com.yandex.mapkit.navigation.automotive.AnnotatedRoadEvents;
import com.yandex.mapkit.navigation.automotive.Annotator;
import com.yandex.mapkit.navigation.automotive.Guidance;
import com.yandex.mapkit.navigation.automotive.Navigation;
import com.yandex.mapkit.navigation.automotive.NavigationSerialization;
import com.yandex.mapkit.navigation.automotive.SpeedLimitStatus;
import com.yandex.mapkit.navigation.automotive.Windshield;
import com.yandex.runtime.i18n.I18nManagerFactory;
import com.yandex.runtime.i18n.SystemOfMeasurement;
import com.yandex.runtime.recording.EventLoggingFactory;
import defpackage.b621;
import defpackage.bf50;
import defpackage.bvf0;
import defpackage.c850;
import defpackage.cb50;
import defpackage.cne0;
import defpackage.cz31;
import defpackage.d240;
import defpackage.d850;
import defpackage.e41;
import defpackage.ehs0;
import defpackage.el00;
import defpackage.et21;
import defpackage.f850;
import defpackage.g950;
import defpackage.gf50;
import defpackage.hbp0;
import defpackage.hhs0;
import defpackage.hua1;
import defpackage.i650;
import defpackage.ihs0;
import defpackage.j4n;
import defpackage.j4u;
import defpackage.jhs0;
import defpackage.jl40;
import defpackage.k19;
import defpackage.liq0;
import defpackage.mf50;
import defpackage.ne50;
import defpackage.oc50;
import defpackage.od50;
import defpackage.par;
import defpackage.pe50;
import defpackage.pzt0;
import defpackage.re50;
import defpackage.rk2;
import defpackage.s14;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse0;
import defpackage.uyd;
import defpackage.vff;
import defpackage.w511;
import defpackage.xnt;
import defpackage.xnt0;
import defpackage.xvf0;
import defpackage.ya50;
import defpackage.ynt0;
import defpackage.yvf0;
import defpackage.za50;
import defpackage.zrm;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.navigation.single_guidance_coordinator.GuidanceOwnerId;

/* loaded from: classes12.dex */
public final class t {
    public final ihs0 A;
    public boolean B;
    public final r0 C;
    public final r0 D;
    public final r0 E;
    public final r0 F;
    public final r0 G;
    public final r0 H;
    public List I;
    public final c850 J;
    public final f850 K;
    public final d850 L;
    public final r0 M;
    public final s N;
    public final r0 O;
    public final r0 P;
    public final r0 Q;
    public final r0 R;
    public final re50 a;
    public final mf50 b;
    public final ya50 c;
    public final za50 d;
    public final par e;
    public final oc50 f;
    public final uyd g;
    public final yvf0 h;
    public final o i;
    public final b621 j;
    public final vff k;
    public final liq0 l;
    public final rk2 m;
    public final bf50 n;
    public final ynt0 o;
    public final hbp0 p;
    public final com.yandex.go.navigator.settings.debug_panel.domain.a q;
    public final od50 r;
    public final k19 s;
    public final el00 t;
    public final ru.yandex.taxi.map_common.map.a u;
    public boolean v;
    public Navigation w;
    public final com.yandex.go.coroutines.g x;
    public int y;
    public pzt0 z;

    public t(com.yandex.go.navigator.repository.f fVar, re50 re50Var, mf50 mf50Var, ya50 ya50Var, za50 za50Var, par parVar, oc50 oc50Var, uyd uydVar, yvf0 yvf0Var, o oVar, b621 b621Var, vff vffVar, liq0 liq0Var, rk2 rk2Var, bf50 bf50Var, ynt0 ynt0Var, hbp0 hbp0Var, com.yandex.go.navigator.settings.debug_panel.domain.a aVar, od50 od50Var, k19 k19Var, el00 el00Var, ru.yandex.taxi.map_common.map.a aVar2, jhs0 jhs0Var) {
        this.a = re50Var;
        this.b = mf50Var;
        this.c = ya50Var;
        this.d = za50Var;
        this.e = parVar;
        this.f = oc50Var;
        this.g = uydVar;
        this.h = yvf0Var;
        this.i = oVar;
        this.j = b621Var;
        this.k = vffVar;
        this.l = liq0Var;
        this.m = rk2Var;
        this.n = bf50Var;
        this.o = ynt0Var;
        this.p = hbp0Var;
        this.q = aVar;
        this.r = od50Var;
        this.s = k19Var;
        this.t = el00Var;
        this.u = aVar2;
        com.yandex.go.coroutines.g gVar = new com.yandex.go.coroutines.g();
        this.x = gVar;
        ihs0 ihs0Var = new ihs0(new d240(9, this), (ehs0) jhs0Var.a.a.get());
        this.A = ihs0Var;
        fVar.h = ihs0Var;
        tje.N(hbp0Var.c(), null, null, new NavigationManagerImpl$subscribeToNavigatorInstance$$inlined$safeCollectIn$1(fVar.g, null, this), 3);
        tje.N(hbp0Var.c(), null, null, new NavigationManagerImpl$observeSearchRetries$$inlined$safeCollectIn$1(new q(gVar.c, this), null, this), 3);
        EmptyList emptyList = EmptyList.a;
        r0 c = bvf0.c(emptyList);
        this.C = c;
        r0 c2 = bvf0.c(g950.a);
        this.D = c2;
        r0 c3 = bvf0.c("");
        this.E = c3;
        r0 c4 = bvf0.c(emptyList);
        this.F = c4;
        r0 c5 = bvf0.c(null);
        this.G = c5;
        r0 c6 = bvf0.c(SpeedLimitStatus.BELOW_LIMIT);
        this.H = c6;
        this.J = new c850(this);
        this.K = new f850(this);
        this.L = new d850(this);
        this.M = c2;
        this.N = new s(c, this);
        this.O = c3;
        this.P = c4;
        this.Q = c5;
        this.R = c6;
    }

    public final void a() {
        this.l.a(null);
        r0 r0Var = this.E;
        r0Var.getClass();
        r0Var.m(null, "");
        r0 r0Var2 = this.C;
        r0Var2.getClass();
        EmptyList emptyList = EmptyList.a;
        r0Var2.m(null, emptyList);
        r0 r0Var3 = this.F;
        r0Var3.getClass();
        r0Var3.m(null, emptyList);
        List list = this.I;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((DrivingRoute) it.next()).removeConditionsListener(this.g);
            }
        }
        this.I = null;
        Navigation navigation = this.w;
        if (navigation != null) {
            navigation.resetRoutes();
        }
        this.b.b.a().a();
    }

    public final void b() {
        Guidance guidance;
        Guidance guidance2;
        Windshield windshield;
        Guidance guidance3;
        I18nManagerFactory.getI18nManagerInstance().setSom(SystemOfMeasurement.METRIC);
        Navigation navigation = this.w;
        if (navigation != null && (guidance3 = navigation.getGuidance()) != null) {
            guidance3.addListener(this.J);
        }
        Navigation navigation2 = this.w;
        if (navigation2 != null && (guidance2 = navigation2.getGuidance()) != null && (windshield = guidance2.getWindshield()) != null) {
            windshield.addListener(this.K);
        }
        Navigation navigation3 = this.w;
        if (navigation3 != null) {
            navigation3.addListener(this.L);
        }
        Navigation navigation4 = this.w;
        if (navigation4 == null || (guidance = navigation4.getGuidance()) == null) {
            return;
        }
        guidance.setEnableAlternatives(true);
    }

    public final void c(pe50 pe50Var) {
        tje.N(this.p.c(), null, null, new NavigationManagerImpl$requestRoutes$1(this, pe50Var, null), 3);
    }

    public final void d() {
        Navigation navigation = this.w;
        if (navigation != null) {
            navigation.resume();
        }
        this.B = true;
    }

    public final void e(boolean z) {
        DrivingRoute drivingRoute;
        String routeId;
        Object obj;
        boolean z2;
        Navigation navigation = this.w;
        if (navigation == null || (drivingRoute = (DrivingRoute) this.l.a.getValue()) == null || (routeId = drivingRoute.getRouteId()) == null) {
            return;
        }
        Iterator<T> it = navigation.getRoutes().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (jl40.l(((DrivingRoute) obj).getRouteId(), routeId)) {
                    break;
                }
            }
        }
        DrivingRoute drivingRoute2 = (DrivingRoute) obj;
        if (drivingRoute2 == null) {
            return;
        }
        if (navigation.getGuidance().getCurrentRoute() == null || z) {
            boolean e = hua1.e(drivingRoute2);
            List<DrivingRoute> routes = navigation.getRoutes();
            if (!(routes instanceof Collection) || !routes.isEmpty()) {
                Iterator<T> it2 = routes.iterator();
                while (it2.hasNext()) {
                    if (hua1.e((DrivingRoute) it2.next())) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            ya50 ya50Var = this.c;
            String str = this.r.a;
            if (str == null) {
                str = "";
            }
            i650 i650Var = ya50Var.a;
            Boolean valueOf = Boolean.valueOf(z2);
            Boolean valueOf2 = Boolean.valueOf(e);
            i650Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("is_green_route_in_routes", valueOf);
            hashMap.put("is_green_route_selected", valueOf2);
            i650Var.a.a("navigation.route.start_navigation", hashMap, 1, tse0.r("source", hashMap, str));
            this.k.c(drivingRoute2);
            ihs0 ihs0Var = this.A;
            ihs0Var.b.a(new hhs0(ihs0Var));
            navigation.startGuidance(drivingRoute2);
            this.q.a(drivingRoute2);
            ((cb50) this.h.get()).c();
            r0 r0Var = this.f.a;
            Boolean bool = Boolean.TRUE;
            r0Var.getClass();
            r0Var.m(null, bool);
            Navigation navigation2 = this.w;
            if (navigation2 != null) {
                pe50 c = this.a.c();
                if (c != null) {
                    mf50 mf50Var = this.b;
                    Address address = c.a.c;
                    mf50Var.b.a().r("navigation:source_address", address != null ? ((xnt) mf50Var.a.a).e(address, Address.Companion.serializer()) : null);
                    mf50 mf50Var2 = this.b;
                    List list = c.b;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(((ne50) it3.next()).c);
                    }
                    cne0 a = mf50Var2.b.a();
                    e41 e41Var = mf50Var2.a;
                    a.r("navigation:stops_address", ((xnt) e41Var.a).e(arrayList, e41Var.b));
                }
                this.u.getClass();
                byte[] serialize = el00.a ? NavigationSerialization.serialize(navigation2) : null;
                if (serialize != null) {
                    this.b.b.a().r("navigation", Base64.encodeToString(serialize, 0));
                }
            }
            this.d.a(true);
            par parVar = this.e;
            if (parVar.f == 0) {
                long currentTimeMillis = System.currentTimeMillis();
                parVar.f = currentTimeMillis;
                parVar.b.q(currentTimeMillis, "NAVIGATOR_ROUTE_STATS_START_TIME");
            }
            this.B = true;
        }
    }

    public final void f(boolean z) {
        if (z) {
            i650 i650Var = this.c.a;
            i650Var.a.a("navigation.route.end_navigation", defpackage.n.u(i650Var), 1, new HashMap());
        }
        Navigation navigation = this.w;
        if (navigation != null) {
            navigation.stopGuidance();
        }
        ehs0 ehs0Var = this.A.b;
        GuidanceOwnerId guidanceOwnerId = GuidanceOwnerId.AUTO_NAVIGATION;
        j4u j4uVar = ehs0Var.a;
        if (guidanceOwnerId == (j4uVar != null ? j4uVar.getId() : null)) {
            ehs0Var.a = null;
        }
        this.q.c.a();
        a();
        this.a.b.l(null);
        r0 r0Var = this.f.a;
        Boolean bool = Boolean.FALSE;
        r0Var.getClass();
        r0Var.m(null, bool);
        cb50 cb50Var = (cb50) this.h.get();
        zrm zrmVar = cb50Var.c;
        if (zrmVar != null) {
            s14 s14Var = (s14) zrmVar.b;
            ((o) s14Var.e).e.l(null);
            r0 r0Var2 = ((b621) s14Var.f).a;
            r0Var2.getClass();
            r0Var2.m(null, EmptyList.a);
            ((vff) s14Var.g).c(null);
            j4n j4nVar = (j4n) zrmVar.c;
            if (j4nVar != null) {
                a0 a0Var = (a0) ((xvf0) j4nVar.w).get();
                a0Var.e.b();
                a0Var.d.l(null);
                ((et21) ((xvf0) j4nVar.x).get()).d.b();
                a aVar = (a) ((xvf0) j4nVar.b).get();
                aVar.k.b();
                r0 r0Var3 = aVar.h;
                r0Var3.getClass();
                r0Var3.m(null, bool);
                com.yandex.go.navigator.safe.a aVar2 = (com.yandex.go.navigator.safe.a) ((xvf0) j4nVar.y).get();
                aVar2.getClass();
                EventLoggingFactory.getEventLogging().unsubscribe(aVar2);
                a aVar3 = (a) ((xvf0) j4nVar.b).get();
                aVar3.j = 0L;
                aVar3.g.a();
            }
            zrmVar.c = null;
        }
        cb50Var.c = null;
        cb50Var.a();
        this.d.a(false);
        this.B = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(String str) {
        Guidance guidance;
        List<DrivingRoute> routes;
        Object obj;
        Navigation navigation = this.w;
        DrivingRoute drivingRoute = null;
        if (navigation != null && (routes = navigation.getRoutes()) != null) {
            Iterator<T> it = routes.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (jl40.l(((DrivingRoute) obj).getRouteId(), str)) {
                        break;
                    }
                }
            }
            DrivingRoute drivingRoute2 = (DrivingRoute) obj;
            if (drivingRoute2 != null) {
                drivingRoute = drivingRoute2;
                if (drivingRoute != null) {
                    boolean e = hua1.e(drivingRoute);
                    i650 i650Var = this.c.a;
                    Boolean valueOf = Boolean.valueOf(e);
                    i650Var.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("is_green_route", valueOf);
                    i650Var.a.a("navigation.request_route.change_route_variant", hashMap, 1, new HashMap());
                }
                this.l.a(drivingRoute);
                this.q.a(drivingRoute);
            }
        }
        Navigation navigation2 = this.w;
        if (navigation2 != null && (guidance = navigation2.getGuidance()) != null) {
            drivingRoute = guidance.getCurrentRoute();
        }
        if (drivingRoute != null) {
        }
        this.l.a(drivingRoute);
        this.q.a(drivingRoute);
    }

    public final void i() {
        pe50 c;
        Navigation navigation = this.w;
        if (navigation == null) {
            return;
        }
        boolean avoidTolls = navigation.getAvoidanceFlags().getAvoidTolls();
        bf50 bf50Var = this.n;
        cne0 cne0Var = bf50Var.c;
        cne0 cne0Var2 = bf50Var.c;
        if (avoidTolls != cne0Var.f("navigator.avoid_toll_roads") || navigation.getAvoidanceFlags().getAvoidUnpaved() != cne0Var2.f("navigator.avoid_unpaved_roads")) {
            navigation.setAvoidanceFlags(new AvoidanceFlags(cne0Var2.f("navigator.avoid_toll_roads"), cne0Var2.f("navigator.avoid_unpaved_roads"), false, false, false, false, false, false));
            if (!this.B && (c = this.a.c()) != null) {
                c(c);
            }
        }
        AnnotationLanguage a = this.m.a();
        if (a != null) {
            navigation.setAnnotationLanguage(a);
        }
        Annotator annotator = navigation.getGuidance().getAnnotator();
        SoundMode b = bf50Var.b();
        cz31 cz31Var = VoiceMode.Companion;
        String l = cne0Var2.l("navigator.voice_setting_key", null);
        if (l == null) {
            l = "all_sound";
        }
        cz31Var.getClass();
        VoiceMode voiceMode = jl40.l(l, "turn_off") ? VoiceMode.TURN_OFF : jl40.l(l, "accidents_only") ? VoiceMode.ACCIDENTS_ONLY : VoiceMode.ALL_SOUND;
        com.yandex.go.navigator.driving.speaker.d dVar = this.o.a;
        float value = b.getValue();
        gf50 gf50Var = dVar.j;
        if (gf50Var != null) {
            gf50Var.a(value);
        }
        if (annotator.isValid()) {
            int i = xnt0.a[voiceMode.ordinal()];
            if (i == 1) {
                annotator.mute();
                return;
            }
            if (i == 2) {
                annotator.setAnnotatedEvents(AnnotatedEvents.ROAD_EVENTS.value);
                annotator.setAnnotatedRoadEvents(AnnotatedRoadEvents.EVERYTHING.value);
                annotator.unmute();
            } else {
                if (i != 3) {
                    w511.b();
                    return;
                }
                annotator.setAnnotatedEvents(AnnotatedEvents.EVERYTHING.value);
                annotator.setAnnotatedRoadEvents(AnnotatedRoadEvents.EVERYTHING.value);
                annotator.unmute();
            }
        }
    }
}
