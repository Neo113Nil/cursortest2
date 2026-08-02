package com.yandex.go.taxi.order.details.v1.elements.destination;

import com.yandex.go.address.models.Address;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$AddDestinationElement;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$DestinationElement;
import defpackage.bvf0;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.i5j;
import defpackage.ike;
import defpackage.j5j;
import defpackage.jl40;
import defpackage.k5j;
import defpackage.mdh;
import defpackage.n5j;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.q8j;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class c implements q8j {
    public final k5j a;
    public final d b;
    public final ike c;
    public final kotlinx.coroutines.sync.a d;
    public i5j e;
    public OrderDetailsCardResponse$CardElement$AddDestinationElement f;
    public OrderDetailsCardResponse$CardElement$DestinationElement g;
    public final m0 h;

    public c(k5j k5jVar, d dVar, o2y0 o2y0Var, tt2 tt2Var) {
        this.a = k5jVar;
        this.b = dVar;
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        this.c = bvf0.a(mdh.b.plus(jl40.a()));
        this.d = gtq0.a();
        this.e = new i5j(null, null, null, null);
        this.h = new m0(k5jVar.b, new n(new b(e.t(e.I(o2y0Var.a(), new DetailsCardDestinationStyleInteractor$pendingChangesState$1(2, null))), this), new DetailsCardDestinationStyleInteractor$pendingChangesState$3(2, null)), new DetailsCardDestinationStyleInteractor$stateFlow$1(3, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r6v3, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(c cVar, OrderDetailsCardResponse$CardElement$AddDestinationElement orderDetailsCardResponse$CardElement$AddDestinationElement, ContinuationImpl continuationImpl) {
        DetailsCardDestinationStyleInteractor$onAddDestinationElementReceived$1 detailsCardDestinationStyleInteractor$onAddDestinationElementReceived$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        cVar.getClass();
        try {
            if (continuationImpl instanceof DetailsCardDestinationStyleInteractor$onAddDestinationElementReceived$1) {
                detailsCardDestinationStyleInteractor$onAddDestinationElementReceived$1 = (DetailsCardDestinationStyleInteractor$onAddDestinationElementReceived$1) continuationImpl;
                int i2 = detailsCardDestinationStyleInteractor$onAddDestinationElementReceived$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    detailsCardDestinationStyleInteractor$onAddDestinationElementReceived$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = detailsCardDestinationStyleInteractor$onAddDestinationElementReceived$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = detailsCardDestinationStyleInteractor$onAddDestinationElementReceived$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        aVar = cVar.d;
                        detailsCardDestinationStyleInteractor$onAddDestinationElementReceived$1.L$0 = orderDetailsCardResponse$CardElement$AddDestinationElement;
                        detailsCardDestinationStyleInteractor$onAddDestinationElementReceived$1.L$1 = aVar;
                        detailsCardDestinationStyleInteractor$onAddDestinationElementReceived$1.label = 1;
                        if (aVar.a(detailsCardDestinationStyleInteractor$onAddDestinationElementReceived$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r6 = (g050) detailsCardDestinationStyleInteractor$onAddDestinationElementReceived$1.L$1;
                        OrderDetailsCardResponse$CardElement$AddDestinationElement orderDetailsCardResponse$CardElement$AddDestinationElement2 = (OrderDetailsCardResponse$CardElement$AddDestinationElement) detailsCardDestinationStyleInteractor$onAddDestinationElementReceived$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r6;
                        orderDetailsCardResponse$CardElement$AddDestinationElement = orderDetailsCardResponse$CardElement$AddDestinationElement2;
                    }
                    cVar.f = orderDetailsCardResponse$CardElement$AddDestinationElement;
                    aVar.d(null);
                    return zy11.a;
                }
            }
            cVar.f = orderDetailsCardResponse$CardElement$AddDestinationElement;
            aVar.d(null);
            return zy11.a;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        detailsCardDestinationStyleInteractor$onAddDestinationElementReceived$1 = new DetailsCardDestinationStyleInteractor$onAddDestinationElementReceived$1(cVar, continuationImpl);
        Object obj2 = detailsCardDestinationStyleInteractor$onAddDestinationElementReceived$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardDestinationStyleInteractor$onAddDestinationElementReceived$1.label;
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
    public static final Object d(c cVar, OrderDetailsCardResponse$CardElement$DestinationElement orderDetailsCardResponse$CardElement$DestinationElement, ContinuationImpl continuationImpl) {
        DetailsCardDestinationStyleInteractor$onDestinationElementReceived$1 detailsCardDestinationStyleInteractor$onDestinationElementReceived$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        cVar.getClass();
        try {
            if (continuationImpl instanceof DetailsCardDestinationStyleInteractor$onDestinationElementReceived$1) {
                detailsCardDestinationStyleInteractor$onDestinationElementReceived$1 = (DetailsCardDestinationStyleInteractor$onDestinationElementReceived$1) continuationImpl;
                int i2 = detailsCardDestinationStyleInteractor$onDestinationElementReceived$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    detailsCardDestinationStyleInteractor$onDestinationElementReceived$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = detailsCardDestinationStyleInteractor$onDestinationElementReceived$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = detailsCardDestinationStyleInteractor$onDestinationElementReceived$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        aVar = cVar.d;
                        detailsCardDestinationStyleInteractor$onDestinationElementReceived$1.L$0 = orderDetailsCardResponse$CardElement$DestinationElement;
                        detailsCardDestinationStyleInteractor$onDestinationElementReceived$1.L$1 = aVar;
                        detailsCardDestinationStyleInteractor$onDestinationElementReceived$1.label = 1;
                        if (aVar.a(detailsCardDestinationStyleInteractor$onDestinationElementReceived$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r6 = (g050) detailsCardDestinationStyleInteractor$onDestinationElementReceived$1.L$1;
                        OrderDetailsCardResponse$CardElement$DestinationElement orderDetailsCardResponse$CardElement$DestinationElement2 = (OrderDetailsCardResponse$CardElement$DestinationElement) detailsCardDestinationStyleInteractor$onDestinationElementReceived$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r6;
                        orderDetailsCardResponse$CardElement$DestinationElement = orderDetailsCardResponse$CardElement$DestinationElement2;
                    }
                    cVar.g = orderDetailsCardResponse$CardElement$DestinationElement;
                    aVar.d(null);
                    return zy11.a;
                }
            }
            cVar.g = orderDetailsCardResponse$CardElement$DestinationElement;
            aVar.d(null);
            return zy11.a;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        detailsCardDestinationStyleInteractor$onDestinationElementReceived$1 = new DetailsCardDestinationStyleInteractor$onDestinationElementReceived$1(cVar, continuationImpl);
        Object obj2 = detailsCardDestinationStyleInteractor$onDestinationElementReceived$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardDestinationStyleInteractor$onDestinationElementReceived$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(c cVar, i5j i5jVar, ContinuationImpl continuationImpl) {
        DetailsCardDestinationStyleInteractor$updateUiState$1 detailsCardDestinationStyleInteractor$updateUiState$1;
        int i;
        n5j n5jVar;
        r0 r0Var;
        Object value;
        cVar.getClass();
        if (continuationImpl instanceof DetailsCardDestinationStyleInteractor$updateUiState$1) {
            detailsCardDestinationStyleInteractor$updateUiState$1 = (DetailsCardDestinationStyleInteractor$updateUiState$1) continuationImpl;
            int i2 = detailsCardDestinationStyleInteractor$updateUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailsCardDestinationStyleInteractor$updateUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = detailsCardDestinationStyleInteractor$updateUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardDestinationStyleInteractor$updateUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    DetailsCardDestinationStyleInteractor$DestinationState detailsCardDestinationStyleInteractor$DestinationState = i5jVar.c;
                    if ((detailsCardDestinationStyleInteractor$DestinationState == DetailsCardDestinationStyleInteractor$DestinationState.ADD || (i5jVar.a != null && detailsCardDestinationStyleInteractor$DestinationState != null)) && i5jVar.d != null) {
                        d dVar = cVar.b;
                        OrderDetailsCardResponse$CardElement$AddDestinationElement orderDetailsCardResponse$CardElement$AddDestinationElement = cVar.f;
                        OrderDetailsCardResponse$CardElement$DestinationElement orderDetailsCardResponse$CardElement$DestinationElement = cVar.g;
                        detailsCardDestinationStyleInteractor$updateUiState$1.L$0 = null;
                        detailsCardDestinationStyleInteractor$updateUiState$1.label = 1;
                        int i3 = detailsCardDestinationStyleInteractor$DestinationState == null ? -1 : j5j.a[detailsCardDestinationStyleInteractor$DestinationState.ordinal()];
                        obj = i3 != 1 ? i3 != 2 ? i3 != 3 ? n5j.i : dVar.f(i5jVar, orderDetailsCardResponse$CardElement$DestinationElement, detailsCardDestinationStyleInteractor$updateUiState$1) : dVar.e(i5jVar, orderDetailsCardResponse$CardElement$DestinationElement, detailsCardDestinationStyleInteractor$updateUiState$1) : dVar.d(i5jVar, orderDetailsCardResponse$CardElement$AddDestinationElement, detailsCardDestinationStyleInteractor$updateUiState$1);
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
                n5jVar = (n5j) obj;
                r0Var = cVar.a.a;
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, n5jVar));
                return zy11.a;
            }
        }
        detailsCardDestinationStyleInteractor$updateUiState$1 = new DetailsCardDestinationStyleInteractor$updateUiState$1(cVar, continuationImpl);
        Object obj2 = detailsCardDestinationStyleInteractor$updateUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardDestinationStyleInteractor$updateUiState$1.label;
        if (i != 0) {
        }
        n5jVar = (n5j) obj2;
        r0Var = cVar.a.a;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, n5jVar));
        return zy11.a;
    }

    @Override // defpackage.q8j
    public final Object a(TaxiOrder taxiOrder, Continuation continuation) {
        Object k0 = tje.k0(this.c.a, new DetailsCardDestinationStyleInteractor$onOrderUpdated$2(taxiOrder, this, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public final void f(Address address, boolean z) {
        tje.N(this.c, null, null, new DetailsCardDestinationStyleInteractor$updateDestinationAddress$1(this, address, z, null), 3);
    }

    public final void g(String str) {
        tje.N(this.c, null, null, new DetailsCardDestinationStyleInteractor$updateModeStyle$1(this, str, null), 3);
    }
}
