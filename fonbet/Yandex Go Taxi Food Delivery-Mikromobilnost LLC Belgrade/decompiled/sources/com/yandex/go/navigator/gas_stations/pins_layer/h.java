package com.yandex.go.navigator.gas_stations.pins_layer;

import com.yandex.go.address.models.Address;
import com.yandex.go.navigator.domain.b0;
import com.yandex.go.navigator.gas_stations.repositories.GasStationsFocusRectReadyRequestRepository;
import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.geometry.Geo;
import com.yandex.mapkit.geometry.Geometry;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.search.BusinessObjectMetadata;
import com.yandex.mapkit.search.RouteDistancesObjectMetadata;
import defpackage.ad5;
import defpackage.ah00;
import defpackage.bl00;
import defpackage.bwa1;
import defpackage.cwa1;
import defpackage.dh00;
import defpackage.dvw;
import defpackage.dws;
import defpackage.fi6;
import defpackage.g8e;
import defpackage.gh00;
import defpackage.gtq0;
import defpackage.gws;
import defpackage.jcb1;
import defpackage.kol0;
import defpackage.kts;
import defpackage.kws;
import defpackage.ny61;
import defpackage.pwy0;
import defpackage.qb60;
import defpackage.tje;
import defpackage.tt2;
import defpackage.tus;
import defpackage.tyw;
import defpackage.uts;
import defpackage.vff;
import defpackage.xvs;
import defpackage.zvs;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class h extends ad5 {
    public final vff A;
    public final tus B;
    public final b0 C;
    public final ah00 D;
    public final tt2 E;
    public final com.yandex.go.navigator.gas_stations.providers.a F;
    public final pwy0 G;
    public final qb60 H;
    public final kts I;
    public final com.yandex.go.navigator.gas_stations.analytics.a J;
    public final tyw K;
    public final GasStationsFocusRectReadyRequestRepository L;
    public final kotlinx.coroutines.sync.a M;
    public final LinkedHashMap N;
    public uts O;
    public final com.yandex.go.navigator.gas_stations.repositories.c x;
    public final gws y;
    public final kws z;

    public h(com.yandex.go.navigator.gas_stations.repositories.c cVar, gws gwsVar, kws kwsVar, vff vffVar, tus tusVar, b0 b0Var, ah00 ah00Var, tt2 tt2Var, com.yandex.go.navigator.gas_stations.providers.a aVar, pwy0 pwy0Var, qb60 qb60Var, kts ktsVar, com.yandex.go.navigator.gas_stations.analytics.a aVar2, tyw tywVar, GasStationsFocusRectReadyRequestRepository gasStationsFocusRectReadyRequestRepository) {
        super(xvs.class);
        this.x = cVar;
        this.y = gwsVar;
        this.z = kwsVar;
        this.A = vffVar;
        this.B = tusVar;
        this.C = b0Var;
        this.D = ah00Var;
        this.E = tt2Var;
        this.F = aVar;
        this.G = pwy0Var;
        this.H = qb60Var;
        this.I = ktsVar;
        this.J = aVar2;
        this.K = tywVar;
        this.L = gasStationsFocusRectReadyRequestRepository;
        this.M = gtq0.a();
        this.N = new LinkedHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
    
        if (r9.a() != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r9.m(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(h hVar, ContinuationImpl continuationImpl) {
        GasStationsPinsLayerPresenter$awaitCameraSetupForSearchOnArea$1 gasStationsPinsLayerPresenter$awaitCameraSetupForSearchOnArea$1;
        int i;
        hVar.getClass();
        if (continuationImpl instanceof GasStationsPinsLayerPresenter$awaitCameraSetupForSearchOnArea$1) {
            gasStationsPinsLayerPresenter$awaitCameraSetupForSearchOnArea$1 = (GasStationsPinsLayerPresenter$awaitCameraSetupForSearchOnArea$1) continuationImpl;
            int i2 = gasStationsPinsLayerPresenter$awaitCameraSetupForSearchOnArea$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gasStationsPinsLayerPresenter$awaitCameraSetupForSearchOnArea$1.label = i2 - Integer.MIN_VALUE;
                Object obj = gasStationsPinsLayerPresenter$awaitCameraSetupForSearchOnArea$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gasStationsPinsLayerPresenter$awaitCameraSetupForSearchOnArea$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    GasStationsFocusRectReadyRequestRepository gasStationsFocusRectReadyRequestRepository = hVar.L;
                    gasStationsPinsLayerPresenter$awaitCameraSetupForSearchOnArea$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return zy11.a;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                gasStationsPinsLayerPresenter$awaitCameraSetupForSearchOnArea$1.label = 2;
                kol0 kol0Var = new kol0(dvw.b(gasStationsPinsLayerPresenter$awaitCameraSetupForSearchOnArea$1));
                ah00 ah00Var = hVar.D;
                dh00.a(ah00Var, ((gh00) ah00Var).e.c.getTarget(), 14.0f, null, new zvs(kol0Var, 0), 60);
            }
        }
        gasStationsPinsLayerPresenter$awaitCameraSetupForSearchOnArea$1 = new GasStationsPinsLayerPresenter$awaitCameraSetupForSearchOnArea$1(hVar, continuationImpl);
        Object obj2 = gasStationsPinsLayerPresenter$awaitCameraSetupForSearchOnArea$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gasStationsPinsLayerPresenter$awaitCameraSetupForSearchOnArea$1.label;
        if (i != 0) {
        }
        gasStationsPinsLayerPresenter$awaitCameraSetupForSearchOnArea$1.label = 2;
        kol0 kol0Var2 = new kol0(dvw.b(gasStationsPinsLayerPresenter$awaitCameraSetupForSearchOnArea$1));
        ah00 ah00Var2 = hVar.D;
        dh00.a(ah00Var2, ((gh00) ah00Var2).e.c.getTarget(), 14.0f, null, new zvs(kol0Var2, 0), 60);
    }

    public static final void Lg(h hVar, List list, List list2, Set set) {
        LinkedHashMap linkedHashMap = hVar.N;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            uts utsVar = (uts) it.next();
            uts utsVar2 = (uts) linkedHashMap.get(utsVar.a);
            linkedHashMap.put(utsVar.a, utsVar);
            if (utsVar2 == null) {
                list2.add(utsVar);
            } else {
                linkedHashSet.add(utsVar2.a);
            }
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (linkedHashMap.size() > 128 && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (!linkedHashSet.contains(entry.getKey())) {
                set.add(entry.getKey());
                it2.remove();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Mg(h hVar, GeoObject geoObject, ContinuationImpl continuationImpl) {
        GasStationsPinsLayerPresenter$moveCameraToSelectedGasStation$1 gasStationsPinsLayerPresenter$moveCameraToSelectedGasStation$1;
        int i;
        Point d;
        List<Geometry> geometry;
        Geometry geometry2;
        Point point;
        hVar.getClass();
        if (continuationImpl instanceof GasStationsPinsLayerPresenter$moveCameraToSelectedGasStation$1) {
            gasStationsPinsLayerPresenter$moveCameraToSelectedGasStation$1 = (GasStationsPinsLayerPresenter$moveCameraToSelectedGasStation$1) continuationImpl;
            int i2 = gasStationsPinsLayerPresenter$moveCameraToSelectedGasStation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gasStationsPinsLayerPresenter$moveCameraToSelectedGasStation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = gasStationsPinsLayerPresenter$moveCameraToSelectedGasStation$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gasStationsPinsLayerPresenter$moveCameraToSelectedGasStation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b0 b0Var = hVar.C;
                    gasStationsPinsLayerPresenter$moveCameraToSelectedGasStation$1.L$0 = geoObject;
                    gasStationsPinsLayerPresenter$moveCameraToSelectedGasStation$1.label = 1;
                    obj = b0Var.a(gasStationsPinsLayerPresenter$moveCameraToSelectedGasStation$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    geoObject = (GeoObject) gasStationsPinsLayerPresenter$moveCameraToSelectedGasStation$1.L$0;
                    kotlin.b.b(obj);
                }
                d = cwa1.d(((Address) obj).B());
                zy11 zy11Var = zy11.a;
                if (geoObject != null && (geometry = geoObject.getGeometry()) != null && (geometry2 = (Geometry) kotlin.collections.a.R(geometry)) != null && (point = geometry2.getPoint()) != null) {
                    if (Geo.distance(d, point) > 5000.0d) {
                        fi6 fi6Var = new fi6();
                        fi6Var.c(d);
                        fi6Var.c(point);
                        tje.N(hVar.Jg(), null, null, new GasStationsPinsLayerPresenter$moveCameraToSelectedGasStation$2(hVar, fi6Var, null), 3);
                        return zy11Var;
                    }
                    tje.N(hVar.Jg(), null, null, new GasStationsPinsLayerPresenter$moveCameraToSelectedGasStation$3(hVar, point, null), 3);
                }
                return zy11Var;
            }
        }
        gasStationsPinsLayerPresenter$moveCameraToSelectedGasStation$1 = new GasStationsPinsLayerPresenter$moveCameraToSelectedGasStation$1(hVar, continuationImpl);
        Object obj3 = gasStationsPinsLayerPresenter$moveCameraToSelectedGasStation$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gasStationsPinsLayerPresenter$moveCameraToSelectedGasStation$1.label;
        if (i != 0) {
        }
        d = cwa1.d(((Address) obj3).B());
        zy11 zy11Var2 = zy11.a;
        if (geoObject != null) {
            if (Geo.distance(d, point) > 5000.0d) {
            }
        }
        return zy11Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Ng(h hVar, GeoObject geoObject, ContinuationImpl continuationImpl) {
        GasStationsPinsLayerPresenter$updateSelected$1 gasStationsPinsLayerPresenter$updateSelected$1;
        int i;
        xvs xvsVar;
        xvs xvsVar2;
        uts utsVar;
        hVar.getClass();
        if (continuationImpl instanceof GasStationsPinsLayerPresenter$updateSelected$1) {
            gasStationsPinsLayerPresenter$updateSelected$1 = (GasStationsPinsLayerPresenter$updateSelected$1) continuationImpl;
            int i2 = gasStationsPinsLayerPresenter$updateSelected$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gasStationsPinsLayerPresenter$updateSelected$1.label = i2 - Integer.MIN_VALUE;
                Object obj = gasStationsPinsLayerPresenter$updateSelected$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gasStationsPinsLayerPresenter$updateSelected$1.label;
                uts utsVar2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    xvsVar = (xvs) hVar.Dg();
                    if (geoObject != null) {
                        gasStationsPinsLayerPresenter$updateSelected$1.L$0 = null;
                        gasStationsPinsLayerPresenter$updateSelected$1.L$1 = xvsVar;
                        gasStationsPinsLayerPresenter$updateSelected$1.label = 1;
                        Object Og = hVar.Og(geoObject, true, gasStationsPinsLayerPresenter$updateSelected$1);
                        if (Og == obj2) {
                            return obj2;
                        }
                        obj = Og;
                        xvsVar2 = xvsVar;
                    }
                    xvsVar2 = xvsVar;
                    xvsVar2.render(new dws(utsVar2));
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xvsVar2 = (xvs) gasStationsPinsLayerPresenter$updateSelected$1.L$1;
                kotlin.b.b(obj);
                utsVar = (uts) obj;
                if (utsVar == null) {
                    hVar.O = utsVar;
                    utsVar2 = utsVar;
                    xvsVar2.render(new dws(utsVar2));
                    return zy11.a;
                }
                xvsVar = xvsVar2;
                xvsVar2 = xvsVar;
                xvsVar2.render(new dws(utsVar2));
                return zy11.a;
            }
        }
        gasStationsPinsLayerPresenter$updateSelected$1 = new GasStationsPinsLayerPresenter$updateSelected$1(hVar, continuationImpl);
        Object obj3 = gasStationsPinsLayerPresenter$updateSelected$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gasStationsPinsLayerPresenter$updateSelected$1.label;
        uts utsVar22 = null;
        if (i != 0) {
        }
        utsVar = (uts) obj3;
        if (utsVar == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Og(GeoObject geoObject, boolean z, ContinuationImpl continuationImpl) {
        GasStationsPinsLayerPresenter$geoObjectToGasStationsPin$1 gasStationsPinsLayerPresenter$geoObjectToGasStationsPin$1;
        int i;
        String name;
        String str;
        String str2;
        String str3;
        String str4;
        GeoObject geoObject2;
        Point e;
        if (continuationImpl instanceof GasStationsPinsLayerPresenter$geoObjectToGasStationsPin$1) {
            gasStationsPinsLayerPresenter$geoObjectToGasStationsPin$1 = (GasStationsPinsLayerPresenter$geoObjectToGasStationsPin$1) continuationImpl;
            int i2 = gasStationsPinsLayerPresenter$geoObjectToGasStationsPin$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gasStationsPinsLayerPresenter$geoObjectToGasStationsPin$1.label = i2 - Integer.MIN_VALUE;
                Object obj = gasStationsPinsLayerPresenter$geoObjectToGasStationsPin$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gasStationsPinsLayerPresenter$geoObjectToGasStationsPin$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    BusinessObjectMetadata b = jcb1.b(geoObject);
                    RouteDistancesObjectMetadata routeDistancesObjectMetadata = (RouteDistancesObjectMetadata) geoObject.getMetadataContainer().getItem(RouteDistancesObjectMetadata.class);
                    String c = jcb1.c(routeDistancesObjectMetadata);
                    String o = (c == null || c.length() == 0) ? "" : g8e.o("+", jcb1.c(routeDistancesObjectMetadata));
                    if (b == null || (name = b.getShortName()) == null) {
                        name = b != null ? b.getName() : null;
                        if (name == null) {
                            name = "";
                        }
                    }
                    if (b == null || (str = b.getOid()) == null) {
                        str = "";
                    }
                    gasStationsPinsLayerPresenter$geoObjectToGasStationsPin$1.L$0 = geoObject;
                    gasStationsPinsLayerPresenter$geoObjectToGasStationsPin$1.L$1 = null;
                    gasStationsPinsLayerPresenter$geoObjectToGasStationsPin$1.L$2 = null;
                    gasStationsPinsLayerPresenter$geoObjectToGasStationsPin$1.L$3 = o;
                    gasStationsPinsLayerPresenter$geoObjectToGasStationsPin$1.L$4 = name;
                    gasStationsPinsLayerPresenter$geoObjectToGasStationsPin$1.L$5 = str;
                    gasStationsPinsLayerPresenter$geoObjectToGasStationsPin$1.Z$0 = z;
                    gasStationsPinsLayerPresenter$geoObjectToGasStationsPin$1.label = 1;
                    Object a = this.F.a(name, o, gasStationsPinsLayerPresenter$geoObjectToGasStationsPin$1, z);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str2 = str;
                    str3 = o;
                    str4 = name;
                    geoObject2 = geoObject;
                    obj = a;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str5 = (String) gasStationsPinsLayerPresenter$geoObjectToGasStationsPin$1.L$5;
                    String str6 = (String) gasStationsPinsLayerPresenter$geoObjectToGasStationsPin$1.L$4;
                    String str7 = (String) gasStationsPinsLayerPresenter$geoObjectToGasStationsPin$1.L$3;
                    GeoObject geoObject3 = (GeoObject) gasStationsPinsLayerPresenter$geoObjectToGasStationsPin$1.L$0;
                    kotlin.b.b(obj);
                    str2 = str5;
                    str4 = str6;
                    geoObject2 = geoObject3;
                    str3 = str7;
                }
                bl00 bl00Var = (bl00) obj;
                e = bwa1.e(geoObject2);
                if (e != null) {
                    return null;
                }
                return new uts(str2, geoObject2, bl00Var, e, str4, str3);
            }
        }
        gasStationsPinsLayerPresenter$geoObjectToGasStationsPin$1 = new GasStationsPinsLayerPresenter$geoObjectToGasStationsPin$1(this, continuationImpl);
        Object obj2 = gasStationsPinsLayerPresenter$geoObjectToGasStationsPin$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gasStationsPinsLayerPresenter$geoObjectToGasStationsPin$1.label;
        if (i != 0) {
        }
        bl00 bl00Var2 = (bl00) obj2;
        e = bwa1.e(geoObject2);
        if (e != null) {
        }
    }
}
