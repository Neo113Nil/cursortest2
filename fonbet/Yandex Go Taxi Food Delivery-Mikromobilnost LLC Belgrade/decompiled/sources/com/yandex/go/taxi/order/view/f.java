package com.yandex.go.taxi.order.view;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ l b;

    public f(vpr vprVar, l lVar) {
        this.a = vprVar;
        this.b = lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
    
        if (r7.emit(r9, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrderViewStateRepository$onResume$$inlined$map$1$2$1 orderViewStateRepository$onResume$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof OrderViewStateRepository$onResume$$inlined$map$1$2$1) {
            orderViewStateRepository$onResume$$inlined$map$1$2$1 = (OrderViewStateRepository$onResume$$inlined$map$1$2$1) continuation;
            int i2 = orderViewStateRepository$onResume$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderViewStateRepository$onResume$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = orderViewStateRepository$onResume$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderViewStateRepository$onResume$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    orderViewStateRepository$onResume$$inlined$map$1$2$1.L$0 = null;
                    orderViewStateRepository$onResume$$inlined$map$1$2$1.L$1 = null;
                    orderViewStateRepository$onResume$$inlined$map$1$2$1.L$2 = null;
                    orderViewStateRepository$onResume$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    orderViewStateRepository$onResume$$inlined$map$1$2$1.L$4 = vprVar2;
                    orderViewStateRepository$onResume$$inlined$map$1$2$1.L$5 = null;
                    orderViewStateRepository$onResume$$inlined$map$1$2$1.L$6 = null;
                    orderViewStateRepository$onResume$$inlined$map$1$2$1.label = 1;
                    Enum a = l.a(this.b, (List) obj, orderViewStateRepository$onResume$$inlined$map$1$2$1);
                    if (a != coroutineSingletons) {
                        obj2 = a;
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
                vprVar = (vpr) orderViewStateRepository$onResume$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                orderViewStateRepository$onResume$$inlined$map$1$2$1.L$0 = null;
                orderViewStateRepository$onResume$$inlined$map$1$2$1.L$1 = null;
                orderViewStateRepository$onResume$$inlined$map$1$2$1.L$2 = null;
                orderViewStateRepository$onResume$$inlined$map$1$2$1.L$3 = null;
                orderViewStateRepository$onResume$$inlined$map$1$2$1.L$4 = null;
                orderViewStateRepository$onResume$$inlined$map$1$2$1.L$5 = null;
                orderViewStateRepository$onResume$$inlined$map$1$2$1.L$6 = null;
                orderViewStateRepository$onResume$$inlined$map$1$2$1.label = 2;
            }
        }
        orderViewStateRepository$onResume$$inlined$map$1$2$1 = new OrderViewStateRepository$onResume$$inlined$map$1$2$1(this, continuation);
        Object obj22 = orderViewStateRepository$onResume$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderViewStateRepository$onResume$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        orderViewStateRepository$onResume$$inlined$map$1$2$1.L$0 = null;
        orderViewStateRepository$onResume$$inlined$map$1$2$1.L$1 = null;
        orderViewStateRepository$onResume$$inlined$map$1$2$1.L$2 = null;
        orderViewStateRepository$onResume$$inlined$map$1$2$1.L$3 = null;
        orderViewStateRepository$onResume$$inlined$map$1$2$1.L$4 = null;
        orderViewStateRepository$onResume$$inlined$map$1$2$1.L$5 = null;
        orderViewStateRepository$onResume$$inlined$map$1$2$1.L$6 = null;
        orderViewStateRepository$onResume$$inlined$map$1$2$1.label = 2;
    }
}
