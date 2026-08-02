package com.yandex.go.masstransit.sdk.order.impl.tickets;

import defpackage.ha2;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class f implements tpr {
    public final /* synthetic */ ha2 a;

    public f(ha2 ha2Var) {
        this.a = ha2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MtTicketsModalRouterImpl$observeStateForAnalytics$2$invokeSuspend$$inlined$filterIsInstance$1$1 mtTicketsModalRouterImpl$observeStateForAnalytics$2$invokeSuspend$$inlined$filterIsInstance$1$1;
        int i;
        if (continuation instanceof MtTicketsModalRouterImpl$observeStateForAnalytics$2$invokeSuspend$$inlined$filterIsInstance$1$1) {
            mtTicketsModalRouterImpl$observeStateForAnalytics$2$invokeSuspend$$inlined$filterIsInstance$1$1 = (MtTicketsModalRouterImpl$observeStateForAnalytics$2$invokeSuspend$$inlined$filterIsInstance$1$1) continuation;
            int i2 = mtTicketsModalRouterImpl$observeStateForAnalytics$2$invokeSuspend$$inlined$filterIsInstance$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTicketsModalRouterImpl$observeStateForAnalytics$2$invokeSuspend$$inlined$filterIsInstance$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtTicketsModalRouterImpl$observeStateForAnalytics$2$invokeSuspend$$inlined$filterIsInstance$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTicketsModalRouterImpl$observeStateForAnalytics$2$invokeSuspend$$inlined$filterIsInstance$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = new e(vprVar);
                    mtTicketsModalRouterImpl$observeStateForAnalytics$2$invokeSuspend$$inlined$filterIsInstance$1$1.L$0 = null;
                    mtTicketsModalRouterImpl$observeStateForAnalytics$2$invokeSuspend$$inlined$filterIsInstance$1$1.L$1 = null;
                    mtTicketsModalRouterImpl$observeStateForAnalytics$2$invokeSuspend$$inlined$filterIsInstance$1$1.L$2 = null;
                    mtTicketsModalRouterImpl$observeStateForAnalytics$2$invokeSuspend$$inlined$filterIsInstance$1$1.label = 1;
                    if (this.a.collect(eVar, mtTicketsModalRouterImpl$observeStateForAnalytics$2$invokeSuspend$$inlined$filterIsInstance$1$1) == coroutineSingletons) {
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
        mtTicketsModalRouterImpl$observeStateForAnalytics$2$invokeSuspend$$inlined$filterIsInstance$1$1 = new MtTicketsModalRouterImpl$observeStateForAnalytics$2$invokeSuspend$$inlined$filterIsInstance$1$1(this, continuation);
        Object obj2 = mtTicketsModalRouterImpl$observeStateForAnalytics$2$invokeSuspend$$inlined$filterIsInstance$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTicketsModalRouterImpl$observeStateForAnalytics$2$invokeSuspend$$inlined$filterIsInstance$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
