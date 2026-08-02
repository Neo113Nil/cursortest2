package com.yandex.go.taxi.order.details.v1.elements.route_point;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$AddRoutePointElement;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$RoutePointElement;
import defpackage.b7j;
import defpackage.bvf0;
import defpackage.c7j;
import defpackage.g050;
import defpackage.g7j;
import defpackage.gtq0;
import defpackage.ike;
import defpackage.jl40;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.q8j;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.z6j;
import defpackage.zy11;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class c implements q8j {
    public final c7j a;
    public final d b;
    public final ike c;
    public final kotlinx.coroutines.sync.a d;
    public z6j e;
    public OrderDetailsCardResponse$CardElement$AddRoutePointElement f;
    public final LinkedHashSet g;
    public final m0 h;

    public c(c7j c7jVar, d dVar, o2y0 o2y0Var, tt2 tt2Var) {
        this.a = c7jVar;
        this.b = dVar;
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        this.c = bvf0.a(mdh.b.plus(jl40.a()));
        this.d = gtq0.a();
        this.e = new z6j(null, null);
        this.g = new LinkedHashSet();
        this.h = new m0(c7jVar.b, new n(new b(e.t(e.I(o2y0Var.a(), new DetailsCardRoutePointsStyleInteractor$pendingChangesState$1(2, null))), this), new DetailsCardRoutePointsStyleInteractor$pendingChangesState$3(2, null)), new DetailsCardRoutePointsStyleInteractor$stateFlow$1(3, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r6v3, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(c cVar, OrderDetailsCardResponse$CardElement$AddRoutePointElement orderDetailsCardResponse$CardElement$AddRoutePointElement, ContinuationImpl continuationImpl) {
        DetailsCardRoutePointsStyleInteractor$onAddRoutePointElementReceived$1 detailsCardRoutePointsStyleInteractor$onAddRoutePointElementReceived$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        cVar.getClass();
        try {
            if (continuationImpl instanceof DetailsCardRoutePointsStyleInteractor$onAddRoutePointElementReceived$1) {
                detailsCardRoutePointsStyleInteractor$onAddRoutePointElementReceived$1 = (DetailsCardRoutePointsStyleInteractor$onAddRoutePointElementReceived$1) continuationImpl;
                int i2 = detailsCardRoutePointsStyleInteractor$onAddRoutePointElementReceived$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    detailsCardRoutePointsStyleInteractor$onAddRoutePointElementReceived$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = detailsCardRoutePointsStyleInteractor$onAddRoutePointElementReceived$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = detailsCardRoutePointsStyleInteractor$onAddRoutePointElementReceived$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        aVar = cVar.d;
                        detailsCardRoutePointsStyleInteractor$onAddRoutePointElementReceived$1.L$0 = orderDetailsCardResponse$CardElement$AddRoutePointElement;
                        detailsCardRoutePointsStyleInteractor$onAddRoutePointElementReceived$1.L$1 = aVar;
                        detailsCardRoutePointsStyleInteractor$onAddRoutePointElementReceived$1.label = 1;
                        if (aVar.a(detailsCardRoutePointsStyleInteractor$onAddRoutePointElementReceived$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r6 = (g050) detailsCardRoutePointsStyleInteractor$onAddRoutePointElementReceived$1.L$1;
                        OrderDetailsCardResponse$CardElement$AddRoutePointElement orderDetailsCardResponse$CardElement$AddRoutePointElement2 = (OrderDetailsCardResponse$CardElement$AddRoutePointElement) detailsCardRoutePointsStyleInteractor$onAddRoutePointElementReceived$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r6;
                        orderDetailsCardResponse$CardElement$AddRoutePointElement = orderDetailsCardResponse$CardElement$AddRoutePointElement2;
                    }
                    cVar.f = orderDetailsCardResponse$CardElement$AddRoutePointElement;
                    aVar.d(null);
                    return zy11.a;
                }
            }
            cVar.f = orderDetailsCardResponse$CardElement$AddRoutePointElement;
            aVar.d(null);
            return zy11.a;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        detailsCardRoutePointsStyleInteractor$onAddRoutePointElementReceived$1 = new DetailsCardRoutePointsStyleInteractor$onAddRoutePointElementReceived$1(cVar, continuationImpl);
        Object obj2 = detailsCardRoutePointsStyleInteractor$onAddRoutePointElementReceived$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardRoutePointsStyleInteractor$onAddRoutePointElementReceived$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r6v3, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(c cVar, OrderDetailsCardResponse$CardElement$RoutePointElement orderDetailsCardResponse$CardElement$RoutePointElement, ContinuationImpl continuationImpl) {
        DetailsCardRoutePointsStyleInteractor$onRoutePointElementReceived$1 detailsCardRoutePointsStyleInteractor$onRoutePointElementReceived$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        cVar.getClass();
        try {
            if (continuationImpl instanceof DetailsCardRoutePointsStyleInteractor$onRoutePointElementReceived$1) {
                detailsCardRoutePointsStyleInteractor$onRoutePointElementReceived$1 = (DetailsCardRoutePointsStyleInteractor$onRoutePointElementReceived$1) continuationImpl;
                int i2 = detailsCardRoutePointsStyleInteractor$onRoutePointElementReceived$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    detailsCardRoutePointsStyleInteractor$onRoutePointElementReceived$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = detailsCardRoutePointsStyleInteractor$onRoutePointElementReceived$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = detailsCardRoutePointsStyleInteractor$onRoutePointElementReceived$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        aVar = cVar.d;
                        detailsCardRoutePointsStyleInteractor$onRoutePointElementReceived$1.L$0 = orderDetailsCardResponse$CardElement$RoutePointElement;
                        detailsCardRoutePointsStyleInteractor$onRoutePointElementReceived$1.L$1 = aVar;
                        detailsCardRoutePointsStyleInteractor$onRoutePointElementReceived$1.label = 1;
                        if (aVar.a(detailsCardRoutePointsStyleInteractor$onRoutePointElementReceived$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r6 = (g050) detailsCardRoutePointsStyleInteractor$onRoutePointElementReceived$1.L$1;
                        OrderDetailsCardResponse$CardElement$RoutePointElement orderDetailsCardResponse$CardElement$RoutePointElement2 = (OrderDetailsCardResponse$CardElement$RoutePointElement) detailsCardRoutePointsStyleInteractor$onRoutePointElementReceived$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r6;
                        orderDetailsCardResponse$CardElement$RoutePointElement = orderDetailsCardResponse$CardElement$RoutePointElement2;
                    }
                    cVar.g.add(orderDetailsCardResponse$CardElement$RoutePointElement);
                    aVar.d(null);
                    return zy11.a;
                }
            }
            cVar.g.add(orderDetailsCardResponse$CardElement$RoutePointElement);
            aVar.d(null);
            return zy11.a;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        detailsCardRoutePointsStyleInteractor$onRoutePointElementReceived$1 = new DetailsCardRoutePointsStyleInteractor$onRoutePointElementReceived$1(cVar, continuationImpl);
        Object obj2 = detailsCardRoutePointsStyleInteractor$onRoutePointElementReceived$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardRoutePointsStyleInteractor$onRoutePointElementReceived$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(c cVar, z6j z6jVar, ContinuationImpl continuationImpl) {
        DetailsCardRoutePointsStyleInteractor$updateUIState$1 detailsCardRoutePointsStyleInteractor$updateUIState$1;
        int i;
        g7j g7jVar;
        r0 r0Var;
        Object value;
        cVar.getClass();
        if (continuationImpl instanceof DetailsCardRoutePointsStyleInteractor$updateUIState$1) {
            detailsCardRoutePointsStyleInteractor$updateUIState$1 = (DetailsCardRoutePointsStyleInteractor$updateUIState$1) continuationImpl;
            int i2 = detailsCardRoutePointsStyleInteractor$updateUIState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailsCardRoutePointsStyleInteractor$updateUIState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = detailsCardRoutePointsStyleInteractor$updateUIState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardRoutePointsStyleInteractor$updateUIState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (z6jVar.a != null && z6jVar.b != null) {
                        d dVar = cVar.b;
                        OrderDetailsCardResponse$CardElement$AddRoutePointElement orderDetailsCardResponse$CardElement$AddRoutePointElement = cVar.f;
                        List J0 = kotlin.collections.a.J0(cVar.g);
                        detailsCardRoutePointsStyleInteractor$updateUIState$1.L$0 = null;
                        detailsCardRoutePointsStyleInteractor$updateUIState$1.label = 1;
                        DetailsCardRoutePointsStyleInteractor$RoutePointsState detailsCardRoutePointsStyleInteractor$RoutePointsState = z6jVar.a;
                        int i3 = detailsCardRoutePointsStyleInteractor$RoutePointsState == null ? -1 : b7j.a[detailsCardRoutePointsStyleInteractor$RoutePointsState.ordinal()];
                        obj = i3 != 1 ? i3 != 2 ? i3 != 3 ? g7j.b : dVar.i(z6jVar, J0, detailsCardRoutePointsStyleInteractor$updateUIState$1) : dVar.h(z6jVar, J0, detailsCardRoutePointsStyleInteractor$updateUIState$1) : dVar.g(z6jVar, orderDetailsCardResponse$CardElement$AddRoutePointElement, detailsCardRoutePointsStyleInteractor$updateUIState$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                g7jVar = (g7j) obj;
                r0Var = cVar.a.a;
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, g7jVar));
                return zy11.a;
            }
        }
        detailsCardRoutePointsStyleInteractor$updateUIState$1 = new DetailsCardRoutePointsStyleInteractor$updateUIState$1(cVar, continuationImpl);
        Object obj2 = detailsCardRoutePointsStyleInteractor$updateUIState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardRoutePointsStyleInteractor$updateUIState$1.label;
        if (i != 0) {
        }
        g7jVar = (g7j) obj2;
        r0Var = cVar.a.a;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, g7jVar));
        return zy11.a;
    }

    @Override // defpackage.q8j
    public final Object a(TaxiOrder taxiOrder, Continuation continuation) {
        Object k0 = tje.k0(this.c.a, new DetailsCardRoutePointsStyleInteractor$onOrderUpdated$2(taxiOrder, this, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public final void f(DetailsCardRoutePointsStyleInteractor$RoutePointsState detailsCardRoutePointsStyleInteractor$RoutePointsState, List list) {
        tje.N(this.c, null, null, new DetailsCardRoutePointsStyleInteractor$setRoutePointsState$1(this, detailsCardRoutePointsStyleInteractor$RoutePointsState, list, null), 3);
    }
}
