package com.yandex.go.intercity.flex.dashboard.point_selection.layers;

import com.yandex.mapkit.transport.masstransit.Route;
import defpackage.anw;
import defpackage.mnw;
import defpackage.ny61;
import defpackage.nzs;
import defpackage.rp60;
import defpackage.tyx;
import defpackage.zzs;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class e {
    public final tyx a;
    public final anw b;
    public final ru.yandex.taxi.walkroute.a c;
    public final rp60 d;

    public e(tyx tyxVar, anw anwVar, ru.yandex.taxi.walkroute.a aVar, rp60 rp60Var) {
        this.a = tyxVar;
        this.b = anwVar;
        this.c = aVar;
        this.d = rp60Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, zzs zzsVar, ContinuationImpl continuationImpl) {
        IntercityGetToPointLocationsInteractor$mapSelectedObjectGeoToUiState$1 intercityGetToPointLocationsInteractor$mapSelectedObjectGeoToUiState$1;
        int i;
        Iterator it;
        eVar.getClass();
        if (continuationImpl instanceof IntercityGetToPointLocationsInteractor$mapSelectedObjectGeoToUiState$1) {
            intercityGetToPointLocationsInteractor$mapSelectedObjectGeoToUiState$1 = (IntercityGetToPointLocationsInteractor$mapSelectedObjectGeoToUiState$1) continuationImpl;
            int i2 = intercityGetToPointLocationsInteractor$mapSelectedObjectGeoToUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                intercityGetToPointLocationsInteractor$mapSelectedObjectGeoToUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = intercityGetToPointLocationsInteractor$mapSelectedObjectGeoToUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intercityGetToPointLocationsInteractor$mapSelectedObjectGeoToUiState$1.label;
                Object obj2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.walkroute.a aVar = eVar.c;
                    zzs zzsVar2 = (zzs) eVar.b.d.b;
                    intercityGetToPointLocationsInteractor$mapSelectedObjectGeoToUiState$1.L$0 = null;
                    intercityGetToPointLocationsInteractor$mapSelectedObjectGeoToUiState$1.label = 1;
                    obj = aVar.b(zzsVar2, zzsVar, intercityGetToPointLocationsInteractor$mapSelectedObjectGeoToUiState$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                it = ((Iterable) obj).iterator();
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (it.hasNext()) {
                        double a = nzs.a((Route) obj2);
                        do {
                            Object next = it.next();
                            double a2 = nzs.a((Route) next);
                            if (Double.compare(a, a2) > 0) {
                                obj2 = next;
                                a = a2;
                            }
                        } while (it.hasNext());
                    }
                }
                return new mnw((Route) obj2);
            }
        }
        intercityGetToPointLocationsInteractor$mapSelectedObjectGeoToUiState$1 = new IntercityGetToPointLocationsInteractor$mapSelectedObjectGeoToUiState$1(eVar, continuationImpl);
        Object obj3 = intercityGetToPointLocationsInteractor$mapSelectedObjectGeoToUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intercityGetToPointLocationsInteractor$mapSelectedObjectGeoToUiState$1.label;
        Object obj22 = null;
        if (i != 0) {
        }
        it = ((Iterable) obj3).iterator();
        if (it.hasNext()) {
        }
        return new mnw((Route) obj22);
    }
}
