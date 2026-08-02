package com.yandex.go.taxi.order.common;

import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.g;

/* loaded from: classes14.dex */
public final class c implements tpr {
    public final /* synthetic */ g a;
    public final /* synthetic */ o2y0 b;

    public c(g gVar, o2y0 o2y0Var) {
        this.a = gVar;
        this.b = o2y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        OrderFragmentPresenterDelegate$subscribeToActiveOrderStatusUpdates$$inlined$map$1$1 orderFragmentPresenterDelegate$subscribeToActiveOrderStatusUpdates$$inlined$map$1$1;
        int i;
        if (continuation instanceof OrderFragmentPresenterDelegate$subscribeToActiveOrderStatusUpdates$$inlined$map$1$1) {
            orderFragmentPresenterDelegate$subscribeToActiveOrderStatusUpdates$$inlined$map$1$1 = (OrderFragmentPresenterDelegate$subscribeToActiveOrderStatusUpdates$$inlined$map$1$1) continuation;
            int i2 = orderFragmentPresenterDelegate$subscribeToActiveOrderStatusUpdates$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderFragmentPresenterDelegate$subscribeToActiveOrderStatusUpdates$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderFragmentPresenterDelegate$subscribeToActiveOrderStatusUpdates$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderFragmentPresenterDelegate$subscribeToActiveOrderStatusUpdates$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar, this.b);
                    orderFragmentPresenterDelegate$subscribeToActiveOrderStatusUpdates$$inlined$map$1$1.L$0 = null;
                    orderFragmentPresenterDelegate$subscribeToActiveOrderStatusUpdates$$inlined$map$1$1.L$1 = null;
                    orderFragmentPresenterDelegate$subscribeToActiveOrderStatusUpdates$$inlined$map$1$1.L$2 = null;
                    orderFragmentPresenterDelegate$subscribeToActiveOrderStatusUpdates$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, orderFragmentPresenterDelegate$subscribeToActiveOrderStatusUpdates$$inlined$map$1$1) == coroutineSingletons) {
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
        orderFragmentPresenterDelegate$subscribeToActiveOrderStatusUpdates$$inlined$map$1$1 = new OrderFragmentPresenterDelegate$subscribeToActiveOrderStatusUpdates$$inlined$map$1$1(this, continuation);
        Object obj2 = orderFragmentPresenterDelegate$subscribeToActiveOrderStatusUpdates$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderFragmentPresenterDelegate$subscribeToActiveOrderStatusUpdates$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
