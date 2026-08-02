package com.yandex.go.payments.lpm.navigation;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes13.dex */
public final class c implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ d b;

    public c(n0 n0Var, d dVar) {
        this.a = n0Var;
        this.b = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        LpmPaymentRouterImpl$onLaunch$3$invokeSuspend$$inlined$filter$1$1 lpmPaymentRouterImpl$onLaunch$3$invokeSuspend$$inlined$filter$1$1;
        int i;
        if (continuation instanceof LpmPaymentRouterImpl$onLaunch$3$invokeSuspend$$inlined$filter$1$1) {
            lpmPaymentRouterImpl$onLaunch$3$invokeSuspend$$inlined$filter$1$1 = (LpmPaymentRouterImpl$onLaunch$3$invokeSuspend$$inlined$filter$1$1) continuation;
            int i2 = lpmPaymentRouterImpl$onLaunch$3$invokeSuspend$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lpmPaymentRouterImpl$onLaunch$3$invokeSuspend$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lpmPaymentRouterImpl$onLaunch$3$invokeSuspend$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lpmPaymentRouterImpl$onLaunch$3$invokeSuspend$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar, this.b);
                    lpmPaymentRouterImpl$onLaunch$3$invokeSuspend$$inlined$filter$1$1.L$0 = null;
                    lpmPaymentRouterImpl$onLaunch$3$invokeSuspend$$inlined$filter$1$1.L$1 = null;
                    lpmPaymentRouterImpl$onLaunch$3$invokeSuspend$$inlined$filter$1$1.L$2 = null;
                    lpmPaymentRouterImpl$onLaunch$3$invokeSuspend$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(bVar, lpmPaymentRouterImpl$onLaunch$3$invokeSuspend$$inlined$filter$1$1) == coroutineSingletons) {
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
        lpmPaymentRouterImpl$onLaunch$3$invokeSuspend$$inlined$filter$1$1 = new LpmPaymentRouterImpl$onLaunch$3$invokeSuspend$$inlined$filter$1$1(this, continuation);
        Object obj2 = lpmPaymentRouterImpl$onLaunch$3$invokeSuspend$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lpmPaymentRouterImpl$onLaunch$3$invokeSuspend$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
