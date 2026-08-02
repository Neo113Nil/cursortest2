package com.yandex.go.taxi.order.details.v1.elements.cancel;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$CancelElement;
import defpackage.a5j;
import defpackage.bvf0;
import defpackage.gci0;
import defpackage.ief;
import defpackage.ny61;
import defpackage.z4j;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class a {
    public final z4j a;
    public final r0 b;
    public final gci0 c;

    public a(z4j z4jVar) {
        this.a = z4jVar;
        r0 c = bvf0.c(new a5j(0));
        this.b = c;
        this.c = e.d(c);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(TaxiOrder taxiOrder, OrderDetailsCardResponse$CardElement$CancelElement orderDetailsCardResponse$CardElement$CancelElement, Continuation continuation) {
        DetailsCardCancelStateRepository$onCancelElementReceived$1 detailsCardCancelStateRepository$onCancelElementReceived$1;
        int i;
        a5j a5jVar;
        if (continuation instanceof DetailsCardCancelStateRepository$onCancelElementReceived$1) {
            detailsCardCancelStateRepository$onCancelElementReceived$1 = (DetailsCardCancelStateRepository$onCancelElementReceived$1) continuation;
            int i2 = detailsCardCancelStateRepository$onCancelElementReceived$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailsCardCancelStateRepository$onCancelElementReceived$1.label = i2 - Integer.MIN_VALUE;
                Object obj = detailsCardCancelStateRepository$onCancelElementReceived$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardCancelStateRepository$onCancelElementReceived$1.label;
                if (i != 0) {
                    b.b(obj);
                    boolean D = taxiOrder.D();
                    ief iefVar = taxiOrder.V().K;
                    detailsCardCancelStateRepository$onCancelElementReceived$1.L$0 = null;
                    detailsCardCancelStateRepository$onCancelElementReceived$1.L$1 = null;
                    detailsCardCancelStateRepository$onCancelElementReceived$1.label = 1;
                    z4j z4jVar = this.a;
                    z4jVar.getClass();
                    obj = bvf0.n(new DetailsCardCancelStateMapper$map$2(orderDetailsCardResponse$CardElement$CancelElement, z4jVar, iefVar, D, null), detailsCardCancelStateRepository$onCancelElementReceived$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                a5jVar = (a5j) obj;
                if (a5jVar == null) {
                    a5jVar = new a5j(0);
                }
                r0 r0Var = this.b;
                r0Var.getClass();
                r0Var.m(null, a5jVar);
                return zy11.a;
            }
        }
        detailsCardCancelStateRepository$onCancelElementReceived$1 = new DetailsCardCancelStateRepository$onCancelElementReceived$1(this, continuation);
        Object obj2 = detailsCardCancelStateRepository$onCancelElementReceived$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardCancelStateRepository$onCancelElementReceived$1.label;
        if (i != 0) {
        }
        a5jVar = (a5j) obj2;
        if (a5jVar == null) {
        }
        r0 r0Var2 = this.b;
        r0Var2.getClass();
        r0Var2.m(null, a5jVar);
        return zy11.a;
    }
}
