package com.yandex.go.taxi.order;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class c0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e0 b;

    public c0(vpr vprVar, e0 e0Var) {
        this.a = vprVar;
        this.b = e0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        if (r8.emit(r10, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1 orderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof OrderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1) {
            orderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1 = (OrderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1) continuation;
            int i2 = orderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = orderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    orderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1.L$0 = null;
                    orderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1.L$1 = null;
                    orderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1.L$2 = null;
                    orderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    orderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1.L$4 = vprVar2;
                    orderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1.L$5 = null;
                    orderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1.L$6 = null;
                    orderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1.label = 1;
                    AtomicInteger atomicInteger = e0.n;
                    obj2 = this.b.e(0L, orderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1);
                    if (obj2 != coroutineSingletons) {
                        vprVar = vprVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                vprVar = (vpr) orderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                orderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1.L$0 = null;
                orderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1.L$1 = null;
                orderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1.L$2 = null;
                orderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1.L$3 = null;
                orderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1.L$4 = null;
                orderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1.L$5 = null;
                orderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1.L$6 = null;
                orderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1.label = 2;
            }
        }
        orderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1 = new OrderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1(this, continuation);
        Object obj22 = orderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        orderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1.L$0 = null;
        orderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1.L$1 = null;
        orderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1.L$2 = null;
        orderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1.L$3 = null;
        orderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1.L$4 = null;
        orderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1.L$5 = null;
        orderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1.L$6 = null;
        orderStatusTotwUpdater$updateAsync$$inlined$map$1$2$1.label = 2;
    }
}
