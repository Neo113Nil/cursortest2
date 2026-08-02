package com.yandex.go.walking.navigation.impl.overview.interactor;

import com.yandex.go.walking.navigation.impl.analytics.WalkingNavigationAnalytics$OverviewTapType;
import com.yandex.go.walking.navigation.impl.analytics.WalkingNavigationAnalytics$WalkingNavigationGeneration;
import com.yandex.go.walking.navigation.impl.model.WalkNavFocusButtonState;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.transport.masstransit.Route;
import defpackage.a541;
import defpackage.b541;
import defpackage.b741;
import defpackage.c541;
import defpackage.d541;
import defpackage.fi6;
import defpackage.gh00;
import defpackage.jl40;
import defpackage.ke31;
import defpackage.n441;
import defpackage.ny61;
import defpackage.qu;
import defpackage.s441;
import defpackage.v541;
import defpackage.w041;
import defpackage.w511;
import defpackage.y441;
import defpackage.z441;
import defpackage.zy11;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class a {
    public final com.yandex.go.walking.navigation.impl.domain.interactor.b a;
    public final n441 b;
    public final v541 c;
    public final b741 d;
    public final w041 e;

    public a(com.yandex.go.walking.navigation.impl.domain.interactor.b bVar, n441 n441Var, v541 v541Var, b741 b741Var, w041 w041Var) {
        this.a = bVar;
        this.b = n441Var;
        this.c = v541Var;
        this.d = b741Var;
        this.e = w041Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(d541 d541Var, s441 s441Var, ContinuationImpl continuationImpl) {
        WalkNavOverviewUiActionInteractor$handleAction$1 walkNavOverviewUiActionInteractor$handleAction$1;
        int i;
        Object value;
        Polyline geometry;
        r0 r0Var;
        Object value2;
        if (continuationImpl instanceof WalkNavOverviewUiActionInteractor$handleAction$1) {
            walkNavOverviewUiActionInteractor$handleAction$1 = (WalkNavOverviewUiActionInteractor$handleAction$1) continuationImpl;
            int i2 = walkNavOverviewUiActionInteractor$handleAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walkNavOverviewUiActionInteractor$handleAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = walkNavOverviewUiActionInteractor$handleAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walkNavOverviewUiActionInteractor$handleAction$1.label;
                n441 n441Var = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (jl40.l(d541Var, y441.a)) {
                        b(WalkingNavigationAnalytics$OverviewTapType.Back);
                        s441Var.a.r(new qu(9));
                    } else if (jl40.l(d541Var, c541.a)) {
                        b(WalkingNavigationAnalytics$OverviewTapType.StartNavigation);
                        s441Var.a.r(new ke31(28));
                    } else {
                        boolean l = jl40.l(d541Var, b541.a);
                        com.yandex.go.walking.navigation.impl.domain.interactor.b bVar = this.a;
                        if (l) {
                            ((gh00) bVar.a).w();
                        } else if (jl40.l(d541Var, z441.a)) {
                            b(WalkingNavigationAnalytics$OverviewTapType.FocusRoute);
                            Route route = (Route) kotlin.collections.a.R(this.c.a());
                            bVar.getClass();
                            if (route != null && (geometry = route.getGeometry()) != null) {
                                fi6 fi6Var = new fi6();
                                fi6Var.d(geometry);
                                ((gh00) bVar.a).A(fi6Var.g(), null);
                            }
                            r0 r0Var2 = n441Var.a;
                            do {
                                value = r0Var2.getValue();
                            } while (!r0Var2.k(value, WalkNavFocusButtonState.FOCUS_USER_LOCATION));
                        } else {
                            if (!jl40.l(d541Var, a541.a)) {
                                w511.b();
                                return null;
                            }
                            b(WalkingNavigationAnalytics$OverviewTapType.FocusLocation);
                            walkNavOverviewUiActionInteractor$handleAction$1.L$0 = null;
                            walkNavOverviewUiActionInteractor$handleAction$1.L$1 = null;
                            walkNavOverviewUiActionInteractor$handleAction$1.L$2 = null;
                            walkNavOverviewUiActionInteractor$handleAction$1.label = 1;
                            if (bVar.a(walkNavOverviewUiActionInteractor$handleAction$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                r0Var = n441Var.a;
                do {
                    value2 = r0Var.getValue();
                } while (!r0Var.k(value2, WalkNavFocusButtonState.FOCUS_ROUTE));
                return zy11.a;
            }
        }
        walkNavOverviewUiActionInteractor$handleAction$1 = new WalkNavOverviewUiActionInteractor$handleAction$1(this, continuationImpl);
        Object obj2 = walkNavOverviewUiActionInteractor$handleAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkNavOverviewUiActionInteractor$handleAction$1.label;
        n441 n441Var2 = this.b;
        if (i != 0) {
        }
        r0Var = n441Var2.a;
        do {
            value2 = r0Var.getValue();
        } while (!r0Var.k(value2, WalkNavFocusButtonState.FOCUS_ROUTE));
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(WalkingNavigationAnalytics$OverviewTapType walkingNavigationAnalytics$OverviewTapType) {
        w041 w041Var = this.e;
        String str = w041Var.a;
        WalkingNavigationAnalytics$WalkingNavigationGeneration walkingNavigationAnalytics$WalkingNavigationGeneration = null;
        if (w041Var.b != null) {
            Iterator<E> it = WalkingNavigationAnalytics$WalkingNavigationGeneration.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (jl40.l(((WalkingNavigationAnalytics$WalkingNavigationGeneration) next).getEventValue(), w041Var.b)) {
                    walkingNavigationAnalytics$WalkingNavigationGeneration = next;
                    break;
                }
            }
            walkingNavigationAnalytics$WalkingNavigationGeneration = walkingNavigationAnalytics$WalkingNavigationGeneration;
        }
        b741 b741Var = this.d;
        b741Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("tap_type", walkingNavigationAnalytics$OverviewTapType.getEventValue());
        if (str != null) {
            hashMap.put("hub_session_id", str);
        }
        if (walkingNavigationAnalytics$WalkingNavigationGeneration != null) {
            hashMap.put("generation", walkingNavigationAnalytics$WalkingNavigationGeneration.getEventValue());
        }
        b741Var.a.a("WalkingNavigation.Overview.Tapped", hashMap, 1, new HashMap());
    }
}
