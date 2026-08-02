package com.yandex.go.multimodal_route.interactors;

import com.yandex.mapkit.geometry.Point;
import defpackage.atd0;
import defpackage.i4v0;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.tpr;
import defpackage.yu21;
import defpackage.zzs;
import java.io.Serializable;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.persuggest.api.GeoPointAcquisitionType;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes12.dex */
public final class h {
    public final atd0 a;

    public h(atd0 atd0Var) {
        this.a = atd0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(Point point, ContinuationImpl continuationImpl) {
        MultimodalTaxiStopAddressInteractorImpl$getAddressByPoint$1 multimodalTaxiStopAddressInteractorImpl$getAddressByPoint$1;
        int i;
        tpr h;
        pv0 pv0Var;
        if (continuationImpl instanceof MultimodalTaxiStopAddressInteractorImpl$getAddressByPoint$1) {
            multimodalTaxiStopAddressInteractorImpl$getAddressByPoint$1 = (MultimodalTaxiStopAddressInteractorImpl$getAddressByPoint$1) continuationImpl;
            int i2 = multimodalTaxiStopAddressInteractorImpl$getAddressByPoint$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multimodalTaxiStopAddressInteractorImpl$getAddressByPoint$1.label = i2 - Integer.MIN_VALUE;
                Object obj = multimodalTaxiStopAddressInteractorImpl$getAddressByPoint$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multimodalTaxiStopAddressInteractorImpl$getAddressByPoint$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zzs zzsVar = new zzs(point.getLatitude(), point.getLongitude(), 0, null, null, 28);
                    RoutePointType routePointType = RoutePointType.POINT_B;
                    i4v0 i4v0Var = i4v0.j;
                    yu21 yu21Var = yu21.c;
                    h = ((ru.yandex.taxi.search.suggest.i) this.a).h(zzsVar, "", routePointType, "", i4v0.j, "", yu21.c, GeoPointAcquisitionType.DEFAULT, null, PositionInitAction.GEO, false);
                    multimodalTaxiStopAddressInteractorImpl$getAddressByPoint$1.L$0 = null;
                    multimodalTaxiStopAddressInteractorImpl$getAddressByPoint$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.A(h, multimodalTaxiStopAddressInteractorImpl$getAddressByPoint$1);
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
                pv0Var = (pv0) obj;
                if (pv0Var == null) {
                    return pv0Var.a;
                }
                return null;
            }
        }
        multimodalTaxiStopAddressInteractorImpl$getAddressByPoint$1 = new MultimodalTaxiStopAddressInteractorImpl$getAddressByPoint$1(this, continuationImpl);
        Object obj2 = multimodalTaxiStopAddressInteractorImpl$getAddressByPoint$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multimodalTaxiStopAddressInteractorImpl$getAddressByPoint$1.label;
        if (i != 0) {
        }
        pv0Var = (pv0) obj2;
        if (pv0Var == null) {
        }
    }
}
