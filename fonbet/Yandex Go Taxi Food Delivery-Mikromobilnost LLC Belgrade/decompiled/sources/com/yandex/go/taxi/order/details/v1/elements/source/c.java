package com.yandex.go.taxi.order.details.v1.elements.source;

import com.yandex.go.address.models.Address;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$SourceElement;
import defpackage.bvf0;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.ike;
import defpackage.j7j;
import defpackage.jl40;
import defpackage.l7j;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.o7j;
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

/* loaded from: classes14.dex */
public final class c implements q8j {
    public final l7j a;
    public final d b;
    public final m0 c;
    public final ike d;
    public final kotlinx.coroutines.sync.a e;
    public j7j f;
    public OrderDetailsCardResponse$CardElement$SourceElement g;

    public c(l7j l7jVar, d dVar, o2y0 o2y0Var, tt2 tt2Var) {
        this.a = l7jVar;
        this.b = dVar;
        this.c = new m0(l7jVar.b, new n(new b(e.t(e.I(o2y0Var.a(), new DetailsCardSourceStyleInteractor$stateFlow$1(2, null))), this), new DetailsCardSourceStyleInteractor$stateFlow$3(2, null)), new DetailsCardSourceStyleInteractor$stateFlow$4(3, null));
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        this.d = bvf0.a(mdh.b.plus(jl40.a()));
        this.e = gtq0.a();
        this.f = new j7j(null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r6v3, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(c cVar, OrderDetailsCardResponse$CardElement$SourceElement orderDetailsCardResponse$CardElement$SourceElement, ContinuationImpl continuationImpl) {
        DetailsCardSourceStyleInteractor$onSourceElementReceived$1 detailsCardSourceStyleInteractor$onSourceElementReceived$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        cVar.getClass();
        try {
            if (continuationImpl instanceof DetailsCardSourceStyleInteractor$onSourceElementReceived$1) {
                detailsCardSourceStyleInteractor$onSourceElementReceived$1 = (DetailsCardSourceStyleInteractor$onSourceElementReceived$1) continuationImpl;
                int i2 = detailsCardSourceStyleInteractor$onSourceElementReceived$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    detailsCardSourceStyleInteractor$onSourceElementReceived$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = detailsCardSourceStyleInteractor$onSourceElementReceived$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = detailsCardSourceStyleInteractor$onSourceElementReceived$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        aVar = cVar.e;
                        detailsCardSourceStyleInteractor$onSourceElementReceived$1.L$0 = orderDetailsCardResponse$CardElement$SourceElement;
                        detailsCardSourceStyleInteractor$onSourceElementReceived$1.L$1 = aVar;
                        detailsCardSourceStyleInteractor$onSourceElementReceived$1.label = 1;
                        if (aVar.a(detailsCardSourceStyleInteractor$onSourceElementReceived$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r6 = (g050) detailsCardSourceStyleInteractor$onSourceElementReceived$1.L$1;
                        OrderDetailsCardResponse$CardElement$SourceElement orderDetailsCardResponse$CardElement$SourceElement2 = (OrderDetailsCardResponse$CardElement$SourceElement) detailsCardSourceStyleInteractor$onSourceElementReceived$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r6;
                        orderDetailsCardResponse$CardElement$SourceElement = orderDetailsCardResponse$CardElement$SourceElement2;
                    }
                    cVar.g = orderDetailsCardResponse$CardElement$SourceElement;
                    aVar.d(null);
                    return zy11.a;
                }
            }
            cVar.g = orderDetailsCardResponse$CardElement$SourceElement;
            aVar.d(null);
            return zy11.a;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        detailsCardSourceStyleInteractor$onSourceElementReceived$1 = new DetailsCardSourceStyleInteractor$onSourceElementReceived$1(cVar, continuationImpl);
        Object obj2 = detailsCardSourceStyleInteractor$onSourceElementReceived$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardSourceStyleInteractor$onSourceElementReceived$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(c cVar, j7j j7jVar, ContinuationImpl continuationImpl) {
        DetailsCardSourceStyleInteractor$updateUiState$1 detailsCardSourceStyleInteractor$updateUiState$1;
        int i;
        cVar.getClass();
        if (continuationImpl instanceof DetailsCardSourceStyleInteractor$updateUiState$1) {
            detailsCardSourceStyleInteractor$updateUiState$1 = (DetailsCardSourceStyleInteractor$updateUiState$1) continuationImpl;
            int i2 = detailsCardSourceStyleInteractor$updateUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailsCardSourceStyleInteractor$updateUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = detailsCardSourceStyleInteractor$updateUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardSourceStyleInteractor$updateUiState$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str = j7jVar.a;
                    if (str != null && str.length() != 0 && j7jVar.b != null && j7jVar.c != null && j7jVar.d != null) {
                        d dVar = cVar.b;
                        j7j j7jVar2 = cVar.f;
                        OrderDetailsCardResponse$CardElement$SourceElement orderDetailsCardResponse$CardElement$SourceElement = cVar.g;
                        detailsCardSourceStyleInteractor$updateUiState$1.L$0 = null;
                        detailsCardSourceStyleInteractor$updateUiState$1.label = 1;
                        obj = dVar.d(j7jVar2, orderDetailsCardResponse$CardElement$SourceElement, detailsCardSourceStyleInteractor$updateUiState$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                cVar.a.a.l((o7j) obj);
                return zy11Var;
            }
        }
        detailsCardSourceStyleInteractor$updateUiState$1 = new DetailsCardSourceStyleInteractor$updateUiState$1(cVar, continuationImpl);
        Object obj2 = detailsCardSourceStyleInteractor$updateUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardSourceStyleInteractor$updateUiState$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        cVar.a.a.l((o7j) obj2);
        return zy11Var2;
    }

    @Override // defpackage.q8j
    public final Object a(TaxiOrder taxiOrder, Continuation continuation) {
        Object k0 = tje.k0(this.d.a, new DetailsCardSourceStyleInteractor$onOrderUpdated$2(taxiOrder, this, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public final void e(String str) {
        tje.N(this.d, null, null, new DetailsCardSourceStyleInteractor$updateModeStyle$1(this, str, null), 3);
    }

    public final void f(Address address, boolean z) {
        tje.N(this.d, null, null, new DetailsCardSourceStyleInteractor$updateSourceAddress$1(this, address, z, null), 3);
    }

    public final void g(boolean z, boolean z2) {
        tje.N(this.d, null, null, new DetailsCardSourceStyleInteractor$updateSourceEditState$1(this, z, z2, null), 3);
    }
}
