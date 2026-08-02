package com.yandex.go.superapp.discovery.map.impl.ui.search;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.model.Zone;
import defpackage.atd0;
import defpackage.i4v0;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.tpr;
import defpackage.twv0;
import defpackage.yu21;
import defpackage.zy11;
import defpackage.zzs;
import java.io.Serializable;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.persuggest.api.GeoPointAcquisitionType;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes14.dex */
public final class a {
    public final atd0 a;
    public final com.yandex.go.route.interactor.b b;
    public final com.yandex.go.zone.interactors.b c;

    public a(atd0 atd0Var, com.yandex.go.route.interactor.b bVar, com.yandex.go.zone.interactors.b bVar2) {
        this.a = atd0Var;
        this.b = bVar;
        this.c = bVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(zzs zzsVar, String str, ContinuationImpl continuationImpl, RoutePointType routePointType) {
        SuperAppDiscoveryMapSearchAddressInteractor$finalizeAddress$1 superAppDiscoveryMapSearchAddressInteractor$finalizeAddress$1;
        int i;
        tpr h;
        if (continuationImpl instanceof SuperAppDiscoveryMapSearchAddressInteractor$finalizeAddress$1) {
            superAppDiscoveryMapSearchAddressInteractor$finalizeAddress$1 = (SuperAppDiscoveryMapSearchAddressInteractor$finalizeAddress$1) continuationImpl;
            int i2 = superAppDiscoveryMapSearchAddressInteractor$finalizeAddress$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppDiscoveryMapSearchAddressInteractor$finalizeAddress$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppDiscoveryMapSearchAddressInteractor$finalizeAddress$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppDiscoveryMapSearchAddressInteractor$finalizeAddress$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    i4v0 i4v0Var = i4v0.j;
                    yu21 yu21Var = yu21.c;
                    h = ((i) this.a).h(zzsVar, "addressCorrection", routePointType, str, i4v0.j, null, yu21.c, GeoPointAcquisitionType.DEFAULT, null, null, false);
                    superAppDiscoveryMapSearchAddressInteractor$finalizeAddress$1.L$0 = null;
                    superAppDiscoveryMapSearchAddressInteractor$finalizeAddress$1.L$1 = null;
                    superAppDiscoveryMapSearchAddressInteractor$finalizeAddress$1.L$2 = null;
                    superAppDiscoveryMapSearchAddressInteractor$finalizeAddress$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(h, superAppDiscoveryMapSearchAddressInteractor$finalizeAddress$1);
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
                return ((pv0) obj).a;
            }
        }
        superAppDiscoveryMapSearchAddressInteractor$finalizeAddress$1 = new SuperAppDiscoveryMapSearchAddressInteractor$finalizeAddress$1(this, continuationImpl);
        Object obj2 = superAppDiscoveryMapSearchAddressInteractor$finalizeAddress$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppDiscoveryMapSearchAddressInteractor$finalizeAddress$1.label;
        if (i != 0) {
        }
        return ((pv0) obj2).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(zzs zzsVar, String str, int i, ContinuationImpl continuationImpl) {
        SuperAppDiscoveryMapSearchAddressInteractor$setAddress$1 superAppDiscoveryMapSearchAddressInteractor$setAddress$1;
        int i2;
        RoutePointType routePointType;
        int i3;
        Address address;
        if (continuationImpl instanceof SuperAppDiscoveryMapSearchAddressInteractor$setAddress$1) {
            superAppDiscoveryMapSearchAddressInteractor$setAddress$1 = (SuperAppDiscoveryMapSearchAddressInteractor$setAddress$1) continuationImpl;
            int i4 = superAppDiscoveryMapSearchAddressInteractor$setAddress$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                superAppDiscoveryMapSearchAddressInteractor$setAddress$1.label = i4 - Integer.MIN_VALUE;
                Object obj = superAppDiscoveryMapSearchAddressInteractor$setAddress$1.result;
                Serializable serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = superAppDiscoveryMapSearchAddressInteractor$setAddress$1.label;
                com.yandex.go.route.interactor.b bVar = this.b;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    RoutePointType routePointType2 = i == 0 ? RoutePointType.POINT_A : RoutePointType.POINT_B;
                    superAppDiscoveryMapSearchAddressInteractor$setAddress$1.L$0 = null;
                    superAppDiscoveryMapSearchAddressInteractor$setAddress$1.L$1 = null;
                    superAppDiscoveryMapSearchAddressInteractor$setAddress$1.L$2 = routePointType2;
                    superAppDiscoveryMapSearchAddressInteractor$setAddress$1.I$0 = i;
                    superAppDiscoveryMapSearchAddressInteractor$setAddress$1.label = 1;
                    Serializable a = a(zzsVar, str, superAppDiscoveryMapSearchAddressInteractor$setAddress$1, routePointType2);
                    if (a != serializable) {
                        RoutePointType routePointType3 = routePointType2;
                        obj = a;
                        routePointType = routePointType3;
                    }
                    return serializable;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    address = (Address) superAppDiscoveryMapSearchAddressInteractor$setAddress$1.L$3;
                    kotlin.b.b(obj);
                    bVar.m(new ZoneAddress(address, (Zone) obj), null);
                    return zy11.a;
                }
                i = superAppDiscoveryMapSearchAddressInteractor$setAddress$1.I$0;
                routePointType = (RoutePointType) superAppDiscoveryMapSearchAddressInteractor$setAddress$1.L$2;
                kotlin.b.b(obj);
                Address address2 = (Address) obj;
                i3 = twv0.a[routePointType.ordinal()];
                if (i3 == 1) {
                    if (i3 == 2) {
                        bVar.b(i - 1, address2);
                    }
                    return zy11.a;
                }
                String zoneName = address2.getZoneName();
                zzs B = address2.B();
                superAppDiscoveryMapSearchAddressInteractor$setAddress$1.L$0 = null;
                superAppDiscoveryMapSearchAddressInteractor$setAddress$1.L$1 = null;
                superAppDiscoveryMapSearchAddressInteractor$setAddress$1.L$2 = null;
                superAppDiscoveryMapSearchAddressInteractor$setAddress$1.L$3 = address2;
                superAppDiscoveryMapSearchAddressInteractor$setAddress$1.I$0 = i;
                superAppDiscoveryMapSearchAddressInteractor$setAddress$1.label = 2;
                obj = this.c.d(zoneName, B, superAppDiscoveryMapSearchAddressInteractor$setAddress$1);
                if (obj != serializable) {
                    address = address2;
                    bVar.m(new ZoneAddress(address, (Zone) obj), null);
                    return zy11.a;
                }
                return serializable;
            }
        }
        superAppDiscoveryMapSearchAddressInteractor$setAddress$1 = new SuperAppDiscoveryMapSearchAddressInteractor$setAddress$1(this, continuationImpl);
        Object obj2 = superAppDiscoveryMapSearchAddressInteractor$setAddress$1.result;
        Serializable serializable2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = superAppDiscoveryMapSearchAddressInteractor$setAddress$1.label;
        com.yandex.go.route.interactor.b bVar2 = this.b;
        if (i2 != 0) {
        }
        Address address22 = (Address) obj2;
        i3 = twv0.a[routePointType.ordinal()];
        if (i3 == 1) {
        }
    }
}
