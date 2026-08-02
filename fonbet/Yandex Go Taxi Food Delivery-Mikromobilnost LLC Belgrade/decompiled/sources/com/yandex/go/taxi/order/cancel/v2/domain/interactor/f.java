package com.yandex.go.taxi.order.cancel.v2.domain.interactor;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.g;

/* loaded from: classes14.dex */
public final class f implements tpr {
    public final /* synthetic */ g a;

    public f(g gVar) {
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        OrderStatusChangeWatcherInteractor$orderChangeStateFlow$$inlined$mapNotNull$1$1 orderStatusChangeWatcherInteractor$orderChangeStateFlow$$inlined$mapNotNull$1$1;
        int i;
        if (continuation instanceof OrderStatusChangeWatcherInteractor$orderChangeStateFlow$$inlined$mapNotNull$1$1) {
            orderStatusChangeWatcherInteractor$orderChangeStateFlow$$inlined$mapNotNull$1$1 = (OrderStatusChangeWatcherInteractor$orderChangeStateFlow$$inlined$mapNotNull$1$1) continuation;
            int i2 = orderStatusChangeWatcherInteractor$orderChangeStateFlow$$inlined$mapNotNull$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderStatusChangeWatcherInteractor$orderChangeStateFlow$$inlined$mapNotNull$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderStatusChangeWatcherInteractor$orderChangeStateFlow$$inlined$mapNotNull$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderStatusChangeWatcherInteractor$orderChangeStateFlow$$inlined$mapNotNull$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = new e(vprVar);
                    orderStatusChangeWatcherInteractor$orderChangeStateFlow$$inlined$mapNotNull$1$1.L$0 = null;
                    orderStatusChangeWatcherInteractor$orderChangeStateFlow$$inlined$mapNotNull$1$1.L$1 = null;
                    orderStatusChangeWatcherInteractor$orderChangeStateFlow$$inlined$mapNotNull$1$1.L$2 = null;
                    orderStatusChangeWatcherInteractor$orderChangeStateFlow$$inlined$mapNotNull$1$1.label = 1;
                    if (this.a.collect(eVar, orderStatusChangeWatcherInteractor$orderChangeStateFlow$$inlined$mapNotNull$1$1) == coroutineSingletons) {
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
        orderStatusChangeWatcherInteractor$orderChangeStateFlow$$inlined$mapNotNull$1$1 = new OrderStatusChangeWatcherInteractor$orderChangeStateFlow$$inlined$mapNotNull$1$1(this, continuation);
        Object obj2 = orderStatusChangeWatcherInteractor$orderChangeStateFlow$$inlined$mapNotNull$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderStatusChangeWatcherInteractor$orderChangeStateFlow$$inlined$mapNotNull$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
