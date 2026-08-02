package com.yandex.go.copter.city_tour;

import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.copter.city_tour.api.CityToursApi;
import com.yandex.go.copter.city_tour.api.CityToursParam;
import com.yandex.go.copter.city_tour.api.CityToursResponse;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.model.Zone;
import defpackage.cmt;
import defpackage.dqe0;
import defpackage.ejj0;
import defpackage.h3y;
import defpackage.if70;
import defpackage.jl40;
import defpackage.jmw0;
import defpackage.kf70;
import defpackage.lmw0;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.tls;
import defpackage.vqb;
import defpackage.wiq0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class c {
    public final dqe0 a;
    public final h3y b;
    public final wiq0 c;

    public c(dqe0 dqe0Var, h3y h3yVar, wiq0 wiq0Var) {
        this.a = dqe0Var;
        this.b = h3yVar;
        this.c = wiq0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d8 A[Catch: Exception -> 0x0036, TRY_ENTER, TryCatch #0 {Exception -> 0x0036, blocks: (B:11:0x0031, B:12:0x00f3, B:23:0x00d8), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r10v4, types: [tls] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, vqb vqbVar, ContinuationImpl continuationImpl) {
        CityTourSelectorApiInteractor$requestCityTours$1 cityTourSelectorApiInteractor$requestCityTours$1;
        int i;
        Object obj;
        CityToursParam cityToursParam;
        try {
            if (continuationImpl instanceof CityTourSelectorApiInteractor$requestCityTours$1) {
                cityTourSelectorApiInteractor$requestCityTours$1 = (CityTourSelectorApiInteractor$requestCityTours$1) continuationImpl;
                int i2 = cityTourSelectorApiInteractor$requestCityTours$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cityTourSelectorApiInteractor$requestCityTours$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = cityTourSelectorApiInteractor$requestCityTours$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = cityTourSelectorApiInteractor$requestCityTours$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj2);
                        pex0 m = ((k) this.c).m();
                        if (m != null) {
                            String str2 = m.b;
                            Iterator it = m.f().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it.next();
                                if (jl40.l(((lmw0) obj).getName(), str)) {
                                    break;
                                }
                            }
                            lmw0 lmw0Var = (lmw0) obj;
                            if (lmw0Var != null && (lmw0Var instanceof jmw0)) {
                                ArrayList arrayList = ((jmw0) lmw0Var).s().c;
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    kf70 kf70Var = ((ejj0) it2.next()).l;
                                    if70 if70Var = kf70Var instanceof if70 ? (if70) kf70Var : null;
                                    Integer valueOf = if70Var != null ? Integer.valueOf(if70Var.a) : null;
                                    if (valueOf != null) {
                                        arrayList2.add(valueOf);
                                    }
                                }
                                if (!arrayList2.isEmpty()) {
                                    ZoneAddress zoneAddress = this.a.a.G.a;
                                    Zone zone = zoneAddress != null ? zoneAddress.b : null;
                                    cityToursParam = new CityToursParam(str, str2, zone != null ? zone.a : null, arrayList2);
                                    if (cityToursParam != null) {
                                        return null;
                                    }
                                    cmt<CityToursResponse> a = ((CityToursApi) this.b.get()).a(cityToursParam);
                                    cityTourSelectorApiInteractor$requestCityTours$1.L$0 = null;
                                    cityTourSelectorApiInteractor$requestCityTours$1.L$1 = vqbVar;
                                    cityTourSelectorApiInteractor$requestCityTours$1.L$2 = null;
                                    cityTourSelectorApiInteractor$requestCityTours$1.label = 1;
                                    obj2 = ru.yandex.taxi.network.api.a.d(a, cityTourSelectorApiInteractor$requestCityTours$1);
                                    vqbVar = vqbVar;
                                    if (obj2 == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                            }
                        }
                        cityToursParam = null;
                        if (cityToursParam != null) {
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r10 = (tls) cityTourSelectorApiInteractor$requestCityTours$1.L$1;
                        kotlin.b.b(obj2);
                        vqbVar = r10;
                    }
                    return (CityToursResponse) obj2;
                }
            }
            if (i != 0) {
            }
            return (CityToursResponse) obj2;
        } catch (Exception e) {
            vqbVar.invoke(e.getMessage());
            return null;
        }
        cityTourSelectorApiInteractor$requestCityTours$1 = new CityTourSelectorApiInteractor$requestCityTours$1(this, continuationImpl);
        Object obj22 = cityTourSelectorApiInteractor$requestCityTours$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cityTourSelectorApiInteractor$requestCityTours$1.label;
    }
}
