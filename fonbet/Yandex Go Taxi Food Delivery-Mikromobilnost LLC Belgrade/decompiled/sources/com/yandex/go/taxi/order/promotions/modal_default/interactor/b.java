package com.yandex.go.taxi.order.promotions.modal_default.interactor;

import defpackage.ny61;
import defpackage.pr70;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ c b;
    public final /* synthetic */ pr70 c;

    public b(tpr tprVar, c cVar, pr70 pr70Var) {
        this.a = tprVar;
        this.b = cVar;
        this.c = pr70Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        OrderDefaultModalInteractor$stateFlow$$inlined$map$1$1 orderDefaultModalInteractor$stateFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof OrderDefaultModalInteractor$stateFlow$$inlined$map$1$1) {
            orderDefaultModalInteractor$stateFlow$$inlined$map$1$1 = (OrderDefaultModalInteractor$stateFlow$$inlined$map$1$1) continuation;
            int i2 = orderDefaultModalInteractor$stateFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderDefaultModalInteractor$stateFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderDefaultModalInteractor$stateFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderDefaultModalInteractor$stateFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b, this.c);
                    orderDefaultModalInteractor$stateFlow$$inlined$map$1$1.L$0 = null;
                    orderDefaultModalInteractor$stateFlow$$inlined$map$1$1.L$1 = null;
                    orderDefaultModalInteractor$stateFlow$$inlined$map$1$1.L$2 = null;
                    orderDefaultModalInteractor$stateFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, orderDefaultModalInteractor$stateFlow$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        orderDefaultModalInteractor$stateFlow$$inlined$map$1$1 = new OrderDefaultModalInteractor$stateFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = orderDefaultModalInteractor$stateFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderDefaultModalInteractor$stateFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
