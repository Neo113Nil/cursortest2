package com.yandex.go.route.interactor;

import com.yandex.go.address.models.Address;
import com.yandex.go.route.experiment.MapRouteAppearanceExperiment;
import com.yandex.go.taxi.order.models.api.route.MapRouteAppearance$BezierRoute;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.bms;
import defpackage.d0l0;
import defpackage.fnx0;
import defpackage.is60;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.noe;
import defpackage.ny61;
import defpackage.oo5;
import defpackage.ooe;
import defpackage.pex0;
import defpackage.q6l0;
import defpackage.qjc;
import defpackage.w511;
import defpackage.wu1;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfnx0;", PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, "Ld0l0;", "route", "Lcom/yandex/go/route/experiment/MapRouteAppearanceExperiment;", "experiment", "Lq6l0;", "<anonymous>", "(Lfnx0;Ld0l0;Lcom/yandex/go/route/experiment/MapRouteAppearanceExperiment;)Lq6l0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.route.interactor.MapRouteAppearanceInteractorImpl$routeFlow$2", f = "MapRouteAppearanceInteractorImpl.kt", l = {50}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class MapRouteAppearanceInteractorImpl$routeFlow$2 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapRouteAppearanceInteractorImpl$routeFlow$2(a aVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        MapRouteAppearanceInteractorImpl$routeFlow$2 mapRouteAppearanceInteractorImpl$routeFlow$2 = new MapRouteAppearanceInteractorImpl$routeFlow$2(this.this$0, (Continuation) obj4);
        mapRouteAppearanceInteractorImpl$routeFlow$2.L$0 = (fnx0) obj;
        mapRouteAppearanceInteractorImpl$routeFlow$2.L$1 = (d0l0) obj2;
        mapRouteAppearanceInteractorImpl$routeFlow$2.L$2 = (MapRouteAppearanceExperiment) obj3;
        return mapRouteAppearanceInteractorImpl$routeFlow$2.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
    
        if ((r2 != null ? r2.b : null) == com.yandex.go.zone.dto.objects.ComboExtra.RouteDisplayType.DEFAULT) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        zzs B;
        zzs B2;
        fnx0 fnx0Var = (fnx0) this.L$0;
        d0l0 d0l0Var = (d0l0) this.L$1;
        MapRouteAppearanceExperiment mapRouteAppearanceExperiment = (MapRouteAppearanceExperiment) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Object obj3 = null;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        a aVar = this.this$0;
        pex0 pex0Var = fnx0Var.c;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 1;
        aVar.getClass();
        if (mapRouteAppearanceExperiment.b()) {
            Iterator it = mapRouteAppearanceExperiment.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                MapRouteAppearanceExperiment.TariffData tariffData = (MapRouteAppearanceExperiment.TariffData) obj2;
                if (tariffData.b.contains(pex0Var.b)) {
                    break;
                }
                List list = tariffData.c;
                wu1 wu1Var = pex0Var.O;
                if (kotlin.collections.a.G(list, wu1Var != null ? wu1Var.a() : null)) {
                    break;
                }
            }
            MapRouteAppearanceExperiment.TariffData tariffData2 = (MapRouteAppearanceExperiment.TariffData) obj2;
            if (tariffData2 != null) {
                boolean l = jl40.l(pex0Var.J0.b, is60.c);
                boolean z = tariffData2.d;
                if (z && l) {
                    obj3 = q6l0.k;
                } else {
                    if (z) {
                        qjc qjcVar = pex0Var.a0;
                    }
                    Address h = d0l0Var.h();
                    List list2 = d0l0Var.b;
                    if (h != null && (B = h.B()) != null) {
                        noe noeVar = aVar.f;
                        int size = list2.size();
                        if (((ooe) noeVar).b(pex0Var) && size == 2) {
                            Address address = (Address) kotlin.collections.a.R(list2);
                            if (address == null || (B2 = address.B()) == null) {
                                Address b = d0l0Var.b();
                                if (b != null) {
                                    B2 = b.B();
                                }
                                B2 = null;
                            }
                            if (B2 != null) {
                            }
                        } else {
                            Address b2 = d0l0Var.b();
                            if (b2 != null) {
                                B2 = b2.B();
                                if (B2 != null) {
                                    com.yandex.go.taxi.order.models.api.route.g gVar = tariffData2.a;
                                    if (gVar instanceof MapRouteAppearance$BezierRoute) {
                                        obj3 = ((oo5) aVar.e).c(B, B2, (MapRouteAppearance$BezierRoute) gVar);
                                    } else if (gVar instanceof com.yandex.go.taxi.order.models.api.route.f) {
                                        obj3 = aVar.a(B, B2, this);
                                        if (obj3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            obj3 = (q6l0) obj3;
                                        }
                                    } else if (!jl40.l(gVar, com.yandex.go.taxi.order.models.api.route.e.INSTANCE)) {
                                        w511.b();
                                        return null;
                                    }
                                }
                            }
                            B2 = null;
                            if (B2 != null) {
                            }
                        }
                    }
                }
            }
        }
        return obj3 == coroutineSingletons ? coroutineSingletons : obj3;
    }
}
