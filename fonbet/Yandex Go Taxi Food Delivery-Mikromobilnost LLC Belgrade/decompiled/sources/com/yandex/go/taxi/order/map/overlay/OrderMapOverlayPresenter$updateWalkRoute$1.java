package com.yandex.go.taxi.order.map.overlay;

import com.yandex.mapkit.transport.masstransit.Route;
import defpackage.c641;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.gh00;
import defpackage.nzs;
import defpackage.o2y0;
import defpackage.o7r0;
import defpackage.scc;
import defpackage.tls;
import defpackage.u080;
import defpackage.y541;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.map.WalkRouteAnalytics$Context;
import ru.yandex.taxi.map.WalkRouteAnalytics$RouteInfoError;
import ru.yandex.taxi.map.WalkingRouteUiState;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class OrderMapOverlayPresenter$updateWalkRoute$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        o2y0 o2y0Var;
        Route route = (Route) obj;
        c0 c0Var = (c0) this.receiver;
        o2y0 o2y0Var2 = c0Var.A;
        y541 y541Var = c0Var.U;
        c641 c641Var = c0Var.T;
        if (route == null) {
            ((u080) c0Var.Dg()).ia();
        } else {
            double a = nzs.a(route);
            String text = a > ((double) c641Var.a().c()) ? route.getMetadata().getWeight().getTime().getText() : "";
            if (a > c641Var.a().c()) {
                o2y0Var = o2y0Var2;
            } else {
                WalkRouteAnalytics$Context walkRouteAnalytics$Context = WalkRouteAnalytics$Context.RIDE;
                WalkRouteAnalytics$RouteInfoError walkRouteAnalytics$RouteInfoError = WalkRouteAnalytics$RouteInfoError.DISTANCE_TOO_SHORT;
                y541Var.getClass();
                o2y0Var = o2y0Var2;
                if (y541Var.b.add(scc.g("onRouteInfoError", o2y0Var2.b().a, o2y0Var2.c().toString(), walkRouteAnalytics$Context.getAnalyticsName(), walkRouteAnalytics$RouteInfoError.getAnalyticsName()))) {
                    o7r0 o7r0Var = y541Var.a;
                    String analyticsName = walkRouteAnalytics$Context.getAnalyticsName();
                    String analyticsName2 = walkRouteAnalytics$RouteInfoError.getAnalyticsName();
                    Boolean bool = Boolean.FALSE;
                    o7r0Var.getClass();
                    HashMap hashMap = new HashMap();
                    if (analyticsName != null) {
                        hashMap.put("mode", analyticsName);
                    }
                    if (analyticsName2 != null) {
                        hashMap.put("error", analyticsName2);
                    }
                    o7r0Var.a.a("UserRoutes.Error", hashMap, 1, g8e.v(hashMap, "focus_on_alt_pin", bool));
                }
            }
            boolean z = c641Var.b(((gh00) c0Var.K).j()) && a > ((double) c641Var.a().c());
            boolean J = evu0.J(text);
            if (z && !J) {
                WalkRouteAnalytics$Context walkRouteAnalytics$Context2 = WalkRouteAnalytics$Context.RIDE;
                y541Var.getClass();
                if (y541Var.b.add(scc.g("onRouteInfoShown", o2y0Var.b().a, o2y0Var.c().toString(), walkRouteAnalytics$Context2.getAnalyticsName()))) {
                    o7r0 o7r0Var2 = y541Var.a;
                    String analyticsName3 = walkRouteAnalytics$Context2.getAnalyticsName();
                    Boolean bool2 = Boolean.FALSE;
                    o7r0Var2.getClass();
                    HashMap hashMap2 = new HashMap();
                    if (analyticsName3 != null) {
                        hashMap2.put("mode", analyticsName3);
                    }
                    o7r0Var2.a.a("UserRoutes.HintShown", hashMap2, 1, g8e.v(hashMap2, "focus_on_alt_pin", bool2));
                }
            }
            ((u080) c0Var.Dg()).P8(new WalkingRouteUiState(route.getGeometry().getPoints(), text, 1.0f, null, null, null, null, 120));
            c0Var.Wg(route);
        }
        return zy11.a;
    }
}
