package com.yandex.go.multimodal_route.ui.detailed_card;

import com.yandex.go.address.models.Address;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.transport.masstransit.Route;
import defpackage.atd0;
import defpackage.bg30;
import defpackage.j73;
import defpackage.lfl0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.pt40;
import defpackage.pv0;
import defpackage.q6s0;
import defpackage.qq80;
import defpackage.qt40;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uu40;
import defpackage.uyj;
import defpackage.yu40;
import defpackage.zzs;
import java.util.HashMap;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes12.dex */
public final class a {
    public final uu40 a;
    public final com.yandex.go.multimodal_route.repositories.a b;
    public final yu40 c;
    public final tt2 d;
    public final qt40 e;
    public final atd0 f;
    public final lfl0 g;
    public final HashMap h = new HashMap();

    public a(uu40 uu40Var, com.yandex.go.multimodal_route.repositories.a aVar, yu40 yu40Var, tt2 tt2Var, qt40 qt40Var, atd0 atd0Var, lfl0 lfl0Var) {
        this.a = uu40Var;
        this.b = aVar;
        this.c = yu40Var;
        this.d = tt2Var;
        this.e = qt40Var;
        this.f = atd0Var;
        this.g = lfl0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x013b, code lost:
    
        if (r2 == r4) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010b, code lost:
    
        if (r2 == r4) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011f, code lost:
    
        if (r2 == r4) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00eb, code lost:
    
        if (r5 == r4) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r0v36, types: [com.yandex.mapkit.transport.masstransit.Route] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(TaxiOrder taxiOrder, ContinuationImpl continuationImpl) {
        MultimodalOverlayPayloadInteractorImpl$getOverlayPayload$1 multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1;
        int i;
        String b;
        Object b2;
        String str;
        Object b3;
        a aVar;
        TaxiOrder taxiOrder2;
        pt40 pt40Var;
        tpr g;
        TaxiOrder taxiOrder3;
        pt40 pt40Var2;
        a aVar2 = this;
        TaxiOrder taxiOrder4 = taxiOrder;
        if (continuationImpl instanceof MultimodalOverlayPayloadInteractorImpl$getOverlayPayload$1) {
            multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1 = (MultimodalOverlayPayloadInteractorImpl$getOverlayPayload$1) continuationImpl;
            int i2 = multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.label = i2 - Integer.MIN_VALUE;
                Object obj = multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.label;
                Address address = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    bg30 bg30Var = (bg30) aVar2.h.get(taxiOrder4.a);
                    if (bg30Var != null) {
                        return bg30Var;
                    }
                    b = aVar2.c.b(taxiOrder4.a, taxiOrder4.b.b);
                    if (b == null || ((String) aVar2.g.a.get(b)) == null) {
                        multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.L$0 = taxiOrder4;
                        multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.L$1 = aVar2;
                        multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.L$2 = b;
                        multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.label = 1;
                        b2 = aVar2.b(b, taxiOrder4, multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1);
                    }
                    if (b != null) {
                        str = (String) aVar2.g.a.get(b);
                        if (str == null) {
                            multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.L$0 = taxiOrder4;
                            multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.L$1 = aVar2;
                            multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.L$2 = null;
                            multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.label = 2;
                            obj = aVar2.b(b, taxiOrder4, multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1);
                        }
                        if (str != null) {
                        }
                        return null;
                    }
                    multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.L$0 = taxiOrder4;
                    multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.L$1 = aVar2;
                    multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.L$2 = null;
                    multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.label = 3;
                    obj = aVar2.b(b, taxiOrder4, multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1);
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        aVar2 = (a) multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.L$1;
                        taxiOrder4 = (TaxiOrder) multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.L$0;
                        kotlin.b.b(obj);
                        str = (String) obj;
                        if (str != null) {
                        }
                        return null;
                    }
                    if (i == 3) {
                        aVar2 = (a) multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.L$1;
                        taxiOrder4 = (TaxiOrder) multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.L$0;
                        kotlin.b.b(obj);
                        str = (String) obj;
                        if (str != null) {
                            uu40 uu40Var = aVar2.a;
                            multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.L$0 = taxiOrder4;
                            multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.L$1 = aVar2;
                            multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.L$2 = null;
                            multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.L$3 = null;
                            multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.label = 4;
                            b3 = ((com.yandex.go.multimodal_route.interactors.c) uu40Var).b(str, multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1);
                        }
                        return null;
                    }
                    if (i != 4) {
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r0 = (Route) multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.L$4;
                        aVar = (a) multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.L$1;
                        taxiOrder3 = (TaxiOrder) multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.L$0;
                        kotlin.b.b(obj);
                        pt40Var2 = r0;
                        address = ((pv0) obj).a;
                        TaxiOrder taxiOrder5 = taxiOrder3;
                        pt40Var = pt40Var2;
                        taxiOrder2 = taxiOrder5;
                        bg30 bg30Var2 = new bg30(pt40Var, null, j73.A(new Address[]{taxiOrder2.u(), address}), new q6s0(false, true), null, 232);
                        aVar.h.put(taxiOrder2.a, bg30Var2);
                        return bg30Var2;
                    }
                    aVar2 = (a) multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.L$1;
                    taxiOrder4 = (TaxiOrder) multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.L$0;
                    kotlin.b.b(obj);
                    b3 = ((Result) obj).getValue();
                    TaxiOrder taxiOrder6 = taxiOrder4;
                    aVar = aVar2;
                    taxiOrder2 = taxiOrder6;
                    if (b3 instanceof Result.Failure) {
                        b3 = null;
                    }
                    Route route = (Route) b3;
                    if (route != null) {
                        aVar.e.getClass();
                        pt40 pt40Var3 = new pt40(route);
                        Point point = (Point) kotlin.collections.a.b0(route.getGeometry().getPoints());
                        if (point == null) {
                            pt40Var = pt40Var3;
                            bg30 bg30Var22 = new bg30(pt40Var, null, j73.A(new Address[]{taxiOrder2.u(), address}), new q6s0(false, true), null, 232);
                            aVar.h.put(taxiOrder2.a, bg30Var22);
                            return bg30Var22;
                        }
                        g = ((i) aVar.f).g(new zzs(point.getLatitude(), point.getLongitude(), 0, null, null, 28), "", RoutePointType.POINT_B, true, false, qq80.b, null);
                        multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.L$0 = taxiOrder2;
                        multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.L$1 = aVar;
                        multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.L$2 = null;
                        multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.L$3 = null;
                        multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.L$4 = pt40Var3;
                        multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.L$5 = null;
                        multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.L$6 = null;
                        multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.label = 5;
                        obj = kotlinx.coroutines.flow.e.y(g, multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1);
                        if (obj != coroutineSingletons) {
                            taxiOrder3 = taxiOrder2;
                            pt40Var2 = pt40Var3;
                            address = ((pv0) obj).a;
                            TaxiOrder taxiOrder52 = taxiOrder3;
                            pt40Var = pt40Var2;
                            taxiOrder2 = taxiOrder52;
                            bg30 bg30Var222 = new bg30(pt40Var, null, j73.A(new Address[]{taxiOrder2.u(), address}), new q6s0(false, true), null, 232);
                            aVar.h.put(taxiOrder2.a, bg30Var222);
                            return bg30Var222;
                        }
                        return coroutineSingletons;
                    }
                    return null;
                }
                String str2 = (String) multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.L$2;
                a aVar3 = (a) multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.L$1;
                TaxiOrder taxiOrder7 = (TaxiOrder) multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.L$0;
                kotlin.b.b(obj);
                b = str2;
                aVar2 = aVar3;
                taxiOrder4 = taxiOrder7;
                b2 = obj;
                if (b != null) {
                }
                return coroutineSingletons;
            }
        }
        multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1 = new MultimodalOverlayPayloadInteractorImpl$getOverlayPayload$1(aVar2, continuationImpl);
        Object obj2 = multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multimodalOverlayPayloadInteractorImpl$getOverlayPayload$1.label;
        Address address2 = null;
        if (i != 0) {
        }
        if (b != null) {
        }
        return coroutineSingletons2;
    }

    public final Object b(String str, TaxiOrder taxiOrder, Continuation continuation) {
        this.d.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new MultimodalOverlayPayloadInteractorImpl$getUriFromTaxiInfo$2(this, str, taxiOrder, null), continuation);
    }
}
