package com.yandex.go.navigator.gas_stations.analytics;

import com.yandex.go.navigator.analitycs.Screen;
import com.yandex.go.navigator.main_screen.experiement.e;
import defpackage.eb50;
import defpackage.fe50;
import defpackage.hbp0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.tc50;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final eb50 a;
    public final e b;
    public final hbp0 c;
    public final fe50 d;

    public a(eb50 eb50Var, e eVar, hbp0 hbp0Var, fe50 fe50Var) {
        this.a = eb50Var;
        this.b = eVar;
        this.c = hbp0Var;
        this.d = fe50Var;
    }

    public static final NavigatorPetrolStationsAnalytics$Screen a(a aVar) {
        Object obj;
        aVar.getClass();
        Iterator<E> it = NavigatorPetrolStationsAnalytics$Screen.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String eventValue = ((NavigatorPetrolStationsAnalytics$Screen) next).getEventValue();
            Screen screen = aVar.a.a;
            if (jl40.l(eventValue, screen != null ? screen.getEventValue() : null)) {
                obj = next;
                break;
            }
        }
        NavigatorPetrolStationsAnalytics$Screen navigatorPetrolStationsAnalytics$Screen = (NavigatorPetrolStationsAnalytics$Screen) obj;
        return navigatorPetrolStationsAnalytics$Screen == null ? NavigatorPetrolStationsAnalytics$Screen.Main : navigatorPetrolStationsAnalytics$Screen;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, ContinuationImpl continuationImpl) {
        NavigatorPetrolStationsAnalyticsInteractor$service$1 navigatorPetrolStationsAnalyticsInteractor$service$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof NavigatorPetrolStationsAnalyticsInteractor$service$1) {
            navigatorPetrolStationsAnalyticsInteractor$service$1 = (NavigatorPetrolStationsAnalyticsInteractor$service$1) continuationImpl;
            int i2 = navigatorPetrolStationsAnalyticsInteractor$service$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigatorPetrolStationsAnalyticsInteractor$service$1.label = i2 - Integer.MIN_VALUE;
                Object obj = navigatorPetrolStationsAnalyticsInteractor$service$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigatorPetrolStationsAnalyticsInteractor$service$1.label;
                if (i != 0) {
                    b.b(obj);
                    e eVar = aVar.b;
                    navigatorPetrolStationsAnalyticsInteractor$service$1.label = 1;
                    obj = eVar.a(navigatorPetrolStationsAnalyticsInteractor$service$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return ((tc50) obj).f;
            }
        }
        navigatorPetrolStationsAnalyticsInteractor$service$1 = new NavigatorPetrolStationsAnalyticsInteractor$service$1(aVar, continuationImpl);
        Object obj2 = navigatorPetrolStationsAnalyticsInteractor$service$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigatorPetrolStationsAnalyticsInteractor$service$1.label;
        if (i != 0) {
        }
        return ((tc50) obj2).f;
    }

    public final void c(String str, String str2) {
        hbp0.e(this.c, null, null, new NavigatorPetrolStationsAnalyticsInteractor$navigatorPetrolStationsCardTappedV2$1(this, str, str2, null), 3);
    }

    public final void d(String str, List list, List list2) {
        hbp0.e(this.c, null, null, new NavigatorPetrolStationsAnalyticsInteractor$navigatorPetrolStationsFiltersAllShownV2$1(this, "filters", str, list2, list, null), 3);
    }

    public final void e(String str, String str2, List list, List list2) {
        hbp0.e(this.c, null, null, new NavigatorPetrolStationsAnalyticsInteractor$navigatorPetrolStationsFiltersAllTappedV2$1(this, "filters", str, str2, list2, list, null), 3);
    }

    public final void f(String str, boolean z, List list, ArrayList arrayList, ArrayList arrayList2) {
        hbp0.e(this.c, null, null, new NavigatorPetrolStationsAnalyticsInteractor$navigatorPetrolStationsFiltersApplyTappedV2$1(this, str, "filter", z, list, arrayList, arrayList2, null), 3);
    }

    public final void g(boolean z, List list, ArrayList arrayList, ArrayList arrayList2) {
        hbp0.e(this.c, null, null, new NavigatorPetrolStationsAnalyticsInteractor$navigatorPetrolStationsFiltersShownV2$1(this, "filter", z, list, arrayList, arrayList2, null), 3);
    }

    public final void h(String str, String str2, Boolean bool, List list, List list2, List list3) {
        hbp0.e(this.c, null, null, new NavigatorPetrolStationsAnalyticsInteractor$navigatorPetrolStationsFiltersTappedV2$1(this, str, str2, bool, list, list2, list3, null), 3);
    }

    public final void i(String str) {
        hbp0.e(this.c, null, null, new NavigatorPetrolStationsAnalyticsInteractor$navigatorPetrolStationsPinTappedV2$1(this, str, null), 3);
    }

    public final void j(String str, String str2) {
        hbp0.e(this.c, null, null, new NavigatorPetrolStationsAnalyticsInteractor$navigatorPetrolStationsSearchResultErrorV2$1(this, str, str2, null), 3);
    }

    public final void k(String str) {
        hbp0.e(this.c, null, null, new NavigatorPetrolStationsAnalyticsInteractor$navigatorPetrolStationsSearchResultShown$1(this, str, null), 3);
    }
}
