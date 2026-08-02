package com.yandex.go.navigator.driving.analytics;

import com.yandex.go.navigator.analitycs.NavigatorRevealCardAnalytics$DrivingModalState;
import com.yandex.go.navigator.analitycs.NavigatorRevealCardAnalytics$Screen;
import com.yandex.go.navigator.analitycs.Screen;
import com.yandex.go.navigator.main_screen.experiement.e;
import defpackage.eb50;
import defpackage.hbp0;
import defpackage.jl40;
import defpackage.me50;
import defpackage.ny61;
import defpackage.tc50;
import java.util.Iterator;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final me50 a;
    public final eb50 b;
    public final e c;
    public final hbp0 d;

    public a(me50 me50Var, eb50 eb50Var, e eVar, hbp0 hbp0Var) {
        this.a = me50Var;
        this.b = eb50Var;
        this.c = eVar;
        this.d = hbp0Var;
    }

    public static final NavigatorRevealCardAnalytics$Screen a(a aVar) {
        Object obj;
        aVar.getClass();
        Iterator<E> it = NavigatorRevealCardAnalytics$Screen.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String eventValue = ((NavigatorRevealCardAnalytics$Screen) next).getEventValue();
            Screen screen = aVar.b.a;
            if (jl40.l(eventValue, screen != null ? screen.getEventValue() : null)) {
                obj = next;
                break;
            }
        }
        NavigatorRevealCardAnalytics$Screen navigatorRevealCardAnalytics$Screen = (NavigatorRevealCardAnalytics$Screen) obj;
        return navigatorRevealCardAnalytics$Screen == null ? NavigatorRevealCardAnalytics$Screen.Main : navigatorRevealCardAnalytics$Screen;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, ContinuationImpl continuationImpl) {
        RevealCardAnalyticInteractor$service$1 revealCardAnalyticInteractor$service$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof RevealCardAnalyticInteractor$service$1) {
            revealCardAnalyticInteractor$service$1 = (RevealCardAnalyticInteractor$service$1) continuationImpl;
            int i2 = revealCardAnalyticInteractor$service$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                revealCardAnalyticInteractor$service$1.label = i2 - Integer.MIN_VALUE;
                Object obj = revealCardAnalyticInteractor$service$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = revealCardAnalyticInteractor$service$1.label;
                if (i != 0) {
                    b.b(obj);
                    e eVar = aVar.c;
                    revealCardAnalyticInteractor$service$1.label = 1;
                    obj = eVar.a(revealCardAnalyticInteractor$service$1);
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
        revealCardAnalyticInteractor$service$1 = new RevealCardAnalyticInteractor$service$1(aVar, continuationImpl);
        Object obj2 = revealCardAnalyticInteractor$service$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = revealCardAnalyticInteractor$service$1.label;
        if (i != 0) {
        }
        return ((tc50) obj2).f;
    }

    public final void c(NavigatorRevealCardAnalytics$DrivingModalState navigatorRevealCardAnalytics$DrivingModalState) {
        hbp0.e(this.d, null, null, new RevealCardAnalyticInteractor$navigatorRevealCardStateChanged$1(this, navigatorRevealCardAnalytics$DrivingModalState, null), 3);
    }

    public final void d(String str) {
        hbp0.e(this.d, null, null, new RevealCardAnalyticInteractor$reportButtonTapped$1(this, str, null), 3);
    }
}
