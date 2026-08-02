package com.yandex.go.navigator.map_interactions.parkings.analytics;

import com.yandex.go.navigator.analitycs.Screen;
import com.yandex.go.navigator.main_screen.experiement.e;
import com.yandex.mapkit.GeoObject;
import defpackage.bb50;
import defpackage.eb50;
import defpackage.hbp0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.tc50;
import java.util.Iterator;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final bb50 a;
    public final eb50 b;
    public final e c;
    public final hbp0 d;

    public a(bb50 bb50Var, eb50 eb50Var, e eVar, hbp0 hbp0Var) {
        this.a = bb50Var;
        this.b = eb50Var;
        this.c = eVar;
        this.d = hbp0Var;
    }

    public static final NavigatorCarParksAnalytics$Screen a(a aVar) {
        Object obj;
        aVar.getClass();
        Iterator<E> it = NavigatorCarParksAnalytics$Screen.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String eventValue = ((NavigatorCarParksAnalytics$Screen) next).getEventValue();
            Screen screen = aVar.b.a;
            if (jl40.l(eventValue, screen != null ? screen.getEventValue() : null)) {
                obj = next;
                break;
            }
        }
        NavigatorCarParksAnalytics$Screen navigatorCarParksAnalytics$Screen = (NavigatorCarParksAnalytics$Screen) obj;
        return navigatorCarParksAnalytics$Screen == null ? NavigatorCarParksAnalytics$Screen.Main : navigatorCarParksAnalytics$Screen;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, ContinuationImpl continuationImpl) {
        CarParksAnalyticsInteractor$service$1 carParksAnalyticsInteractor$service$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof CarParksAnalyticsInteractor$service$1) {
            carParksAnalyticsInteractor$service$1 = (CarParksAnalyticsInteractor$service$1) continuationImpl;
            int i2 = carParksAnalyticsInteractor$service$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                carParksAnalyticsInteractor$service$1.label = i2 - Integer.MIN_VALUE;
                Object obj = carParksAnalyticsInteractor$service$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = carParksAnalyticsInteractor$service$1.label;
                if (i != 0) {
                    b.b(obj);
                    e eVar = aVar.c;
                    carParksAnalyticsInteractor$service$1.label = 1;
                    obj = eVar.a(carParksAnalyticsInteractor$service$1);
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
        carParksAnalyticsInteractor$service$1 = new CarParksAnalyticsInteractor$service$1(aVar, continuationImpl);
        Object obj2 = carParksAnalyticsInteractor$service$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = carParksAnalyticsInteractor$service$1.label;
        if (i != 0) {
        }
        return ((tc50) obj2).f;
    }

    public final void c(GeoObject geoObject) {
        hbp0.e(this.d, null, null, new CarParksAnalyticsInteractor$reportCardClosed$1(geoObject, this, null), 3);
    }

    public final void d(GeoObject geoObject) {
        hbp0.e(this.d, null, null, new CarParksAnalyticsInteractor$reportCardShown$1(geoObject, this, null), 3);
    }

    public final void e(NavigatorCarParksAnalytics$CarParkCardButtonType navigatorCarParksAnalytics$CarParkCardButtonType, GeoObject geoObject) {
        hbp0.e(this.d, null, null, new CarParksAnalyticsInteractor$reportCardTapped$1(geoObject, this, navigatorCarParksAnalytics$CarParkCardButtonType, null), 3);
    }

    public final void f(boolean z) {
        hbp0.e(this.d, null, null, new CarParksAnalyticsInteractor$reportLayerButtonTapped$1(this, z, null), 3);
    }

    public final void g(GeoObject geoObject) {
        hbp0.e(this.d, null, null, new CarParksAnalyticsInteractor$reportPinTapped$1(geoObject, this, null), 3);
    }
}
