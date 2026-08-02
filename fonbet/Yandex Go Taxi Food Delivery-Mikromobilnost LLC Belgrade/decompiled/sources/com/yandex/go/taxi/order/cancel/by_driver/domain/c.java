package com.yandex.go.taxi.order.cancel.by_driver.domain;

import defpackage.ny61;
import defpackage.o2y0;
import defpackage.t180;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.g;

/* loaded from: classes14.dex */
public final class c implements tpr {
    public final /* synthetic */ g a;
    public final /* synthetic */ t180 b;
    public final /* synthetic */ o2y0 c;

    public c(g gVar, t180 t180Var, o2y0 o2y0Var) {
        this.a = gVar;
        this.b = t180Var;
        this.c = o2y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        OrderNotProcessedInteractor$cancelledByDriverFlow$$inlined$map$1$1 orderNotProcessedInteractor$cancelledByDriverFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof OrderNotProcessedInteractor$cancelledByDriverFlow$$inlined$map$1$1) {
            orderNotProcessedInteractor$cancelledByDriverFlow$$inlined$map$1$1 = (OrderNotProcessedInteractor$cancelledByDriverFlow$$inlined$map$1$1) continuation;
            int i2 = orderNotProcessedInteractor$cancelledByDriverFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderNotProcessedInteractor$cancelledByDriverFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderNotProcessedInteractor$cancelledByDriverFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderNotProcessedInteractor$cancelledByDriverFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar, this.b, this.c);
                    orderNotProcessedInteractor$cancelledByDriverFlow$$inlined$map$1$1.L$0 = null;
                    orderNotProcessedInteractor$cancelledByDriverFlow$$inlined$map$1$1.L$1 = null;
                    orderNotProcessedInteractor$cancelledByDriverFlow$$inlined$map$1$1.L$2 = null;
                    orderNotProcessedInteractor$cancelledByDriverFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, orderNotProcessedInteractor$cancelledByDriverFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        orderNotProcessedInteractor$cancelledByDriverFlow$$inlined$map$1$1 = new OrderNotProcessedInteractor$cancelledByDriverFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = orderNotProcessedInteractor$cancelledByDriverFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderNotProcessedInteractor$cancelledByDriverFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
