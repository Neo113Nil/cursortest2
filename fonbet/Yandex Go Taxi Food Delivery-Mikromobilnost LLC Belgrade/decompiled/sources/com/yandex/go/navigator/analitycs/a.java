package com.yandex.go.navigator.analitycs;

import com.yandex.go.navigator.main_screen.experiement.e;
import defpackage.eb50;
import defpackage.fio;
import defpackage.hit;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.oc50;
import defpackage.tc50;
import defpackage.tje;
import java.util.Iterator;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class a {
    public final fio a;
    public final oc50 b;
    public final eb50 c;
    public final e d;
    public final hit e;

    public a(fio fioVar, oc50 oc50Var, eb50 eb50Var, e eVar, hit hitVar) {
        this.a = fioVar;
        this.b = oc50Var;
        this.c = eb50Var;
        this.d = eVar;
        this.e = hitVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, Continuation continuation) {
        NavigatorMainScreenAnalyticInteractor$service$1 navigatorMainScreenAnalyticInteractor$service$1;
        int i;
        aVar.getClass();
        if (continuation instanceof NavigatorMainScreenAnalyticInteractor$service$1) {
            navigatorMainScreenAnalyticInteractor$service$1 = (NavigatorMainScreenAnalyticInteractor$service$1) continuation;
            int i2 = navigatorMainScreenAnalyticInteractor$service$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigatorMainScreenAnalyticInteractor$service$1.label = i2 - Integer.MIN_VALUE;
                Object obj = navigatorMainScreenAnalyticInteractor$service$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigatorMainScreenAnalyticInteractor$service$1.label;
                if (i != 0) {
                    b.b(obj);
                    e eVar = aVar.d;
                    navigatorMainScreenAnalyticInteractor$service$1.label = 1;
                    obj = eVar.a(navigatorMainScreenAnalyticInteractor$service$1);
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
        navigatorMainScreenAnalyticInteractor$service$1 = new NavigatorMainScreenAnalyticInteractor$service$1(aVar, continuation);
        Object obj2 = navigatorMainScreenAnalyticInteractor$service$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigatorMainScreenAnalyticInteractor$service$1.label;
        if (i != 0) {
        }
        return ((tc50) obj2).f;
    }

    public final EvgenNavigatorAnalytics$Screen b() {
        Object obj;
        Iterator<E> it = EvgenNavigatorAnalytics$Screen.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String eventValue = ((EvgenNavigatorAnalytics$Screen) next).getEventValue();
            Screen screen = this.c.a;
            if (jl40.l(eventValue, screen != null ? screen.getEventValue() : null)) {
                obj = next;
                break;
            }
        }
        EvgenNavigatorAnalytics$Screen evgenNavigatorAnalytics$Screen = (EvgenNavigatorAnalytics$Screen) obj;
        return evgenNavigatorAnalytics$Screen == null ? EvgenNavigatorAnalytics$Screen.Main : evgenNavigatorAnalytics$Screen;
    }

    public final void c(boolean z) {
        tje.N(this.e.a, null, null, new NavigatorMainScreenAnalyticInteractor$navigatorMainScreenTrafficButtonTapped$1(this, z, b(), null), 3);
    }

    public final void d() {
        tje.N(this.e.a, null, null, new NavigatorMainScreenAnalyticInteractor$onBackButtonTapped$1(this, b(), null), 3);
    }

    public final void e() {
        tje.N(this.e.a, null, null, new NavigatorMainScreenAnalyticInteractor$onCompassTapped$1(this, b(), null), 3);
    }

    public final void f() {
        tje.N(this.e.a, null, null, new NavigatorMainScreenAnalyticInteractor$onMyLocationTapped$1(this, b(), null), 3);
    }

    public final void g() {
        tje.N(this.e.a, null, null, new NavigatorMainScreenAnalyticInteractor$onOverviewTapped$1(this, b(), null), 3);
    }

    public final void h() {
        tje.N(this.e.a, null, null, new NavigatorMainScreenAnalyticInteractor$onRoadEventsTapped$1(this, b(), null), 3);
    }

    public final void i() {
        tje.N(this.e.a, null, null, new NavigatorMainScreenAnalyticInteractor$onSearchButtonTapped$1(this, b(), null), 3);
    }

    public final void j() {
        tje.N(this.e.a, null, null, new NavigatorMainScreenAnalyticInteractor$onTitleClicked$1(this, b(), null), 3);
    }

    public final void k() {
        tje.N(this.e.a, null, null, new NavigatorMainScreenAnalyticInteractor$onZoomInTapped$1(this, b(), null), 3);
    }

    public final void l() {
        tje.N(this.e.a, null, null, new NavigatorMainScreenAnalyticInteractor$onZoomOutTapped$1(this, b(), null), 3);
    }
}
