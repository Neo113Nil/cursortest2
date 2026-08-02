package com.yandex.go.taxi.summary.mobilityhub.ui.overlay;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectTapListener;
import com.yandex.mapkit.map.PlacemarkAnimation;
import com.yandex.mapkit.transport.masstransit.Route;
import defpackage.bl00;
import defpackage.cwa1;
import defpackage.dw20;
import defpackage.exu;
import defpackage.f4c0;
import defpackage.fw20;
import defpackage.gk00;
import defpackage.gw20;
import defpackage.hw20;
import defpackage.iw20;
import defpackage.j1v;
import defpackage.jl40;
import defpackage.jw20;
import defpackage.k1v;
import defpackage.kw20;
import defpackage.l1v;
import defpackage.m1v;
import defpackage.n1v;
import defpackage.o1v;
import defpackage.q6l0;
import defpackage.qje;
import defpackage.scc;
import defpackage.tcc;
import defpackage.v4r0;
import defpackage.w4e0;
import defpackage.w511;
import defpackage.xm00;
import defpackage.xng0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import ru.yandex.taxi.map_common.map.k;

/* loaded from: classes14.dex */
public final class c implements dw20 {
    public final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    @Override // defpackage.dw20
    public final void z8(kw20 kw20Var) {
        PlacemarkAnimation placemarkAnimation;
        Throwable th;
        ArrayList arrayList;
        Iterator it;
        char c;
        boolean z;
        w4e0 s;
        boolean z2 = kw20Var instanceof gw20;
        d dVar = this.a;
        if (z2) {
            d.a(dVar, ((gw20) kw20Var).c);
        } else if (kw20Var instanceof iw20) {
            d.a(dVar, ((iw20) kw20Var).b);
        } else if (kw20Var instanceof jw20) {
            exu exuVar = ((jw20) kw20Var).a;
            ArrayList arrayList2 = dVar.g;
            xm00 xm00Var = dVar.f;
            if (xm00Var != null) {
                dVar.c();
                Point d = cwa1.d(exuVar.a);
                gk00 gk00Var = exuVar.b;
                bl00 bl00Var = exuVar.c;
                Pair pair = (Pair) kotlin.collections.a.R(arrayList2);
                if (pair == null) {
                    Pair pair2 = new Pair(xm00Var.r(d), xm00Var.r(d));
                    arrayList2.add(pair2);
                    pair = pair2;
                }
                f4c0 f4c0Var = (f4c0) pair.getFirst();
                f4c0 f4c0Var2 = (f4c0) pair.getSecond();
                if (gk00Var != null) {
                    if (f4c0Var != null) {
                        f4c0Var.B(gk00Var.a);
                    }
                    if (f4c0Var != null) {
                        f4c0Var.D(gk00Var.b);
                    }
                    if (f4c0Var != null && (placemarkAnimation = f4c0Var.l) != null) {
                        placemarkAnimation.play();
                    }
                }
                if (f4c0Var2 != null) {
                    f4c0Var2.z(bl00Var.a, bl00Var.b);
                }
            }
        } else {
            if (!jl40.l(kw20Var, hw20.a)) {
                w511.b();
                return;
            }
            dVar.c();
        }
        xm00 xm00Var2 = dVar.f;
        if (xm00Var2 != null) {
            o1v o1vVar = dVar.c;
            List routes = kw20Var.getRoutes();
            Throwable th2 = null;
            gw20 gw20Var = kw20Var instanceof gw20 ? (gw20) kw20Var : null;
            List list = gw20Var != null ? gw20Var.b : null;
            final MobilityHubV2Overlay$InnerMvpView$render$2$1 mobilityHubV2Overlay$InnerMvpView$render$2$1 = new MobilityHubV2Overlay$InnerMvpView$render$2$1(1, dVar.a, fw20.class, "onAlternativeRouteTapped", "onAlternativeRouteTapped(I)V", 0);
            LinkedHashMap linkedHashMap = o1vVar.d;
            Context context = o1vVar.a;
            ValueAnimator valueAnimator = o1vVar.g;
            valueAnimator.cancel();
            int size = routes.size();
            ArrayList arrayList3 = o1vVar.c;
            while (arrayList3.size() > size) {
                ((w4e0) arrayList3.remove(scc.f(arrayList3))).d();
            }
            while (arrayList3.size() < size) {
                Polyline polyline = ru.yandex.taxi.map.utils.a.b;
                if (polyline == null) {
                    polyline = k.g();
                    if (polyline == null) {
                        polyline = null;
                    } else {
                        ru.yandex.taxi.map.utils.a.b = polyline;
                    }
                }
                if (polyline == null) {
                    s = null;
                } else {
                    s = xm00Var2.s(polyline);
                    s.k(o1vVar.f);
                    s.y(qje.t(xng0.bgMain, context));
                }
                if (s == null) {
                    break;
                } else {
                    arrayList3.add(s);
                }
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            ArrayList arrayList4 = o1vVar.e;
            if (arrayList4 != null) {
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    ((w4e0) it2.next()).d();
                }
            }
            o1vVar.e = null;
            char c2 = 0;
            boolean z3 = false;
            if (list != null) {
                ArrayList arrayList5 = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof m1v) {
                        arrayList5.add(obj);
                    }
                }
                arrayList = new ArrayList(tcc.n(arrayList5, 10));
                Iterator it3 = arrayList5.iterator();
                final int i = 0;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        Throwable th3 = th2;
                        scc.m();
                        throw th3;
                    }
                    m1v m1vVar = (m1v) next;
                    o1vVar.b(xm00Var2, m1vVar, false);
                    Route route = m1vVar.a;
                    Throwable th4 = th2;
                    String routeId = route.getMetadata().getRouteId();
                    if (routeId != null) {
                        linkedHashSet.add(routeId);
                    }
                    w4e0 s2 = xm00Var2.s(route.getGeometry());
                    s2.C(Integer.valueOf(qje.t(xng0.textMinor, context)));
                    s2.p(2.0f);
                    s2.s(4.0f);
                    s2.u(4.0f);
                    s2.g(new MapObjectTapListener() { // from class: com.yandex.go.taxi.summary.mobilityhub.ui.overlay.a
                        @Override // com.yandex.mapkit.map.MapObjectTapListener
                        public final boolean onMapObjectTap(MapObject mapObject, Point point) {
                            ((MobilityHubV2Overlay$InnerMvpView$render$2$1) mobilityHubV2Overlay$InnerMvpView$render$2$1).invoke(Integer.valueOf(i));
                            return true;
                        }
                    });
                    arrayList.add(s2);
                    th2 = th4;
                    i = i2;
                }
                th = th2;
            } else {
                th = null;
                arrayList = null;
            }
            o1vVar.e = arrayList;
            List list2 = routes;
            Iterator it4 = list2.iterator();
            int i3 = 0;
            while (it4.hasNext()) {
                Object next2 = it4.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    scc.m();
                    throw th;
                }
                n1v n1vVar = (n1v) next2;
                w4e0 w4e0Var = (w4e0) kotlin.collections.a.S(i3, arrayList3);
                if (w4e0Var == null) {
                    it = it4;
                    c = c2;
                    z = z3;
                } else {
                    w4e0Var.u(0.0f);
                    w4e0Var.s(0.0f);
                    if (n1vVar instanceof j1v) {
                        q6l0 q6l0Var = ((j1v) n1vVar).a;
                        Polyline polyline2 = (Polyline) q6l0Var.j.getValue();
                        if (polyline2 == null) {
                            it = it4;
                        } else {
                            w4e0Var.o(polyline2);
                            it = it4;
                            o1vVar.b.b(w4e0Var, q6l0Var.b, q6l0Var.c, q6l0Var.d, q6l0Var.f, q6l0Var.h);
                        }
                    } else {
                        it = it4;
                        if (n1vVar instanceof k1v) {
                            DrivingRoute drivingRoute = ((k1v) n1vVar).a;
                            w4e0Var.o(drivingRoute.getGeometry());
                            o1vVar.b.a(w4e0Var);
                            w4e0Var.x(drivingRoute);
                            w4e0Var.y(qje.t(xng0.bgMain, context));
                        } else if (n1vVar instanceof m1v) {
                            m1v m1vVar2 = (m1v) n1vVar;
                            Route route2 = m1vVar2.a;
                            w4e0Var.o(route2.getGeometry());
                            w4e0Var.C(Integer.valueOf(qje.t(xng0.textMain, context)));
                            w4e0Var.p(2.8f);
                            c = 0;
                            w4e0Var.u(4.0f);
                            w4e0Var.s(4.0f);
                            w4e0Var.v(false);
                            w4e0Var.y(qje.u(context.getTheme(), xng0.bgMain));
                            o1vVar.b(xm00Var2, m1vVar2, true);
                            String routeId2 = route2.getMetadata().getRouteId();
                            if (routeId2 != null) {
                                linkedHashSet.add(routeId2);
                            }
                            valueAnimator.start();
                            z = false;
                        } else {
                            c = 0;
                            if (!(n1vVar instanceof l1v)) {
                                w511.b();
                                return;
                            }
                            w4e0Var.o(((l1v) n1vVar).a.getGeometry());
                            w4e0Var.C(Integer.valueOf(Color.parseColor("#02CB52")));
                            w4e0Var.p(4.5f);
                            z = false;
                            w4e0Var.v(false);
                            w4e0Var.y(qje.t(xng0.bgMain, context));
                        }
                    }
                    c = 0;
                    z = false;
                }
                z3 = z;
                it4 = it;
                c2 = c;
                i3 = i4;
            }
            Iterator it5 = v4r0.g(linkedHashMap.keySet(), linkedHashSet).iterator();
            while (it5.hasNext()) {
                f4c0 f4c0Var3 = (f4c0) linkedHashMap.remove((String) it5.next());
                if (f4c0Var3 != null) {
                    f4c0Var3.d();
                }
            }
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return;
            }
            Iterator it6 = list2.iterator();
            while (it6.hasNext()) {
                if (((n1v) it6.next()) instanceof m1v) {
                    valueAnimator.start();
                    return;
                }
            }
        }
    }
}
