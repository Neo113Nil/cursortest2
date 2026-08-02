package com.yandex.go.taxi.order.change.source.interactor;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class u implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.internal.g a;
    public final /* synthetic */ x b;

    public u(kotlinx.coroutines.flow.internal.g gVar, x xVar) {
        this.a = gVar;
        this.b = xVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        OrderSourcePinStateInteractor$sourceSearchPinState$$inlined$map$2$1 orderSourcePinStateInteractor$sourceSearchPinState$$inlined$map$2$1;
        int i;
        if (continuation instanceof OrderSourcePinStateInteractor$sourceSearchPinState$$inlined$map$2$1) {
            orderSourcePinStateInteractor$sourceSearchPinState$$inlined$map$2$1 = (OrderSourcePinStateInteractor$sourceSearchPinState$$inlined$map$2$1) continuation;
            int i2 = orderSourcePinStateInteractor$sourceSearchPinState$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderSourcePinStateInteractor$sourceSearchPinState$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderSourcePinStateInteractor$sourceSearchPinState$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderSourcePinStateInteractor$sourceSearchPinState$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t tVar = new t(vprVar, this.b);
                    orderSourcePinStateInteractor$sourceSearchPinState$$inlined$map$2$1.L$0 = null;
                    orderSourcePinStateInteractor$sourceSearchPinState$$inlined$map$2$1.L$1 = null;
                    orderSourcePinStateInteractor$sourceSearchPinState$$inlined$map$2$1.L$2 = null;
                    orderSourcePinStateInteractor$sourceSearchPinState$$inlined$map$2$1.label = 1;
                    if (this.a.collect(tVar, orderSourcePinStateInteractor$sourceSearchPinState$$inlined$map$2$1) == coroutineSingletons) {
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
        orderSourcePinStateInteractor$sourceSearchPinState$$inlined$map$2$1 = new OrderSourcePinStateInteractor$sourceSearchPinState$$inlined$map$2$1(this, continuation);
        Object obj2 = orderSourcePinStateInteractor$sourceSearchPinState$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderSourcePinStateInteractor$sourceSearchPinState$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
