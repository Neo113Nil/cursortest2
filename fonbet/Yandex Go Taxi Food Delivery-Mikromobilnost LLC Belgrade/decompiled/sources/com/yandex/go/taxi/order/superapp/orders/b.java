package com.yandex.go.taxi.order.superapp.orders;

import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ o2y0 b;

    public b(r0 r0Var, o2y0 o2y0Var) {
        this.a = r0Var;
        this.b = o2y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        OrderActionButtonsProvider$cancelProcessingStates$$inlined$map$1$1 orderActionButtonsProvider$cancelProcessingStates$$inlined$map$1$1;
        int i;
        if (continuation instanceof OrderActionButtonsProvider$cancelProcessingStates$$inlined$map$1$1) {
            orderActionButtonsProvider$cancelProcessingStates$$inlined$map$1$1 = (OrderActionButtonsProvider$cancelProcessingStates$$inlined$map$1$1) continuation;
            int i2 = orderActionButtonsProvider$cancelProcessingStates$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderActionButtonsProvider$cancelProcessingStates$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderActionButtonsProvider$cancelProcessingStates$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderActionButtonsProvider$cancelProcessingStates$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    orderActionButtonsProvider$cancelProcessingStates$$inlined$map$1$1.L$0 = null;
                    orderActionButtonsProvider$cancelProcessingStates$$inlined$map$1$1.L$1 = null;
                    orderActionButtonsProvider$cancelProcessingStates$$inlined$map$1$1.L$2 = null;
                    orderActionButtonsProvider$cancelProcessingStates$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, orderActionButtonsProvider$cancelProcessingStates$$inlined$map$1$1) == coroutineSingletons) {
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
        orderActionButtonsProvider$cancelProcessingStates$$inlined$map$1$1 = new OrderActionButtonsProvider$cancelProcessingStates$$inlined$map$1$1(this, continuation);
        Object obj2 = orderActionButtonsProvider$cancelProcessingStates$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderActionButtonsProvider$cancelProcessingStates$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
