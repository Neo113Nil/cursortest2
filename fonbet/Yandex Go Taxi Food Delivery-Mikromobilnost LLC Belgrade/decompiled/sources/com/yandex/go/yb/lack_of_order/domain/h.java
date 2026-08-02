package com.yandex.go.yb.lack_of_order.domain;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.ny61;
import defpackage.q3y0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class h implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ l b;

    public h(vpr vprVar, l lVar) {
        this.a = vprVar;
        this.b = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TaxiOrderMoneyLackIntentInteractor$getIntentFlow$$inlined$map$1$2$1 taxiOrderMoneyLackIntentInteractor$getIntentFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof TaxiOrderMoneyLackIntentInteractor$getIntentFlow$$inlined$map$1$2$1) {
            taxiOrderMoneyLackIntentInteractor$getIntentFlow$$inlined$map$1$2$1 = (TaxiOrderMoneyLackIntentInteractor$getIntentFlow$$inlined$map$1$2$1) continuation;
            int i2 = taxiOrderMoneyLackIntentInteractor$getIntentFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderMoneyLackIntentInteractor$getIntentFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = taxiOrderMoneyLackIntentInteractor$getIntentFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderMoneyLackIntentInteractor$getIntentFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    TaxiOrder taxiOrder = (TaxiOrder) obj;
                    this.b.getClass();
                    q3y0 q3y0Var = new q3y0(taxiOrder.a, taxiOrder.q(), taxiOrder.V().P.b("payment_informer"));
                    taxiOrderMoneyLackIntentInteractor$getIntentFlow$$inlined$map$1$2$1.L$0 = null;
                    taxiOrderMoneyLackIntentInteractor$getIntentFlow$$inlined$map$1$2$1.L$1 = null;
                    taxiOrderMoneyLackIntentInteractor$getIntentFlow$$inlined$map$1$2$1.L$2 = null;
                    taxiOrderMoneyLackIntentInteractor$getIntentFlow$$inlined$map$1$2$1.L$3 = null;
                    taxiOrderMoneyLackIntentInteractor$getIntentFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(q3y0Var, taxiOrderMoneyLackIntentInteractor$getIntentFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        taxiOrderMoneyLackIntentInteractor$getIntentFlow$$inlined$map$1$2$1 = new TaxiOrderMoneyLackIntentInteractor$getIntentFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = taxiOrderMoneyLackIntentInteractor$getIntentFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderMoneyLackIntentInteractor$getIntentFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
