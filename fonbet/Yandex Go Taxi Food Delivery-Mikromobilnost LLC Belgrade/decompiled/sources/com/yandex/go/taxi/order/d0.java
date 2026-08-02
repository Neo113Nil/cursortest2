package com.yandex.go.taxi.order;

import defpackage.ny61;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class d0 implements tpr {
    public final /* synthetic */ rol0 a;
    public final /* synthetic */ e0 b;

    public d0(rol0 rol0Var, e0 e0Var) {
        this.a = rol0Var;
        this.b = e0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        OrderStatusTotwUpdater$updateAsync$$inlined$map$1$1 orderStatusTotwUpdater$updateAsync$$inlined$map$1$1;
        int i;
        if (continuation instanceof OrderStatusTotwUpdater$updateAsync$$inlined$map$1$1) {
            orderStatusTotwUpdater$updateAsync$$inlined$map$1$1 = (OrderStatusTotwUpdater$updateAsync$$inlined$map$1$1) continuation;
            int i2 = orderStatusTotwUpdater$updateAsync$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderStatusTotwUpdater$updateAsync$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderStatusTotwUpdater$updateAsync$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderStatusTotwUpdater$updateAsync$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c0 c0Var = new c0(vprVar, this.b);
                    orderStatusTotwUpdater$updateAsync$$inlined$map$1$1.L$0 = null;
                    orderStatusTotwUpdater$updateAsync$$inlined$map$1$1.L$1 = null;
                    orderStatusTotwUpdater$updateAsync$$inlined$map$1$1.L$2 = null;
                    orderStatusTotwUpdater$updateAsync$$inlined$map$1$1.label = 1;
                    if (this.a.collect(c0Var, orderStatusTotwUpdater$updateAsync$$inlined$map$1$1) == coroutineSingletons) {
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
        orderStatusTotwUpdater$updateAsync$$inlined$map$1$1 = new OrderStatusTotwUpdater$updateAsync$$inlined$map$1$1(this, continuation);
        Object obj2 = orderStatusTotwUpdater$updateAsync$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderStatusTotwUpdater$updateAsync$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
