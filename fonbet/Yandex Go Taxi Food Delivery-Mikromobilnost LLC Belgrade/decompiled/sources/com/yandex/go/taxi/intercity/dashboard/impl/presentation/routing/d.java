package com.yandex.go.taxi.intercity.dashboard.impl.presentation.routing;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes14.dex */
public final class d implements tpr {
    public final /* synthetic */ m0 a;

    public d(m0 m0Var) {
        this.a = m0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        IntercityDashboardModalViewRouter$onLaunch$2$invokeSuspend$$inlined$filter$1$1 intercityDashboardModalViewRouter$onLaunch$2$invokeSuspend$$inlined$filter$1$1;
        int i;
        if (continuation instanceof IntercityDashboardModalViewRouter$onLaunch$2$invokeSuspend$$inlined$filter$1$1) {
            intercityDashboardModalViewRouter$onLaunch$2$invokeSuspend$$inlined$filter$1$1 = (IntercityDashboardModalViewRouter$onLaunch$2$invokeSuspend$$inlined$filter$1$1) continuation;
            int i2 = intercityDashboardModalViewRouter$onLaunch$2$invokeSuspend$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                intercityDashboardModalViewRouter$onLaunch$2$invokeSuspend$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = intercityDashboardModalViewRouter$onLaunch$2$invokeSuspend$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intercityDashboardModalViewRouter$onLaunch$2$invokeSuspend$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar);
                    intercityDashboardModalViewRouter$onLaunch$2$invokeSuspend$$inlined$filter$1$1.L$0 = null;
                    intercityDashboardModalViewRouter$onLaunch$2$invokeSuspend$$inlined$filter$1$1.L$1 = null;
                    intercityDashboardModalViewRouter$onLaunch$2$invokeSuspend$$inlined$filter$1$1.L$2 = null;
                    intercityDashboardModalViewRouter$onLaunch$2$invokeSuspend$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(cVar, intercityDashboardModalViewRouter$onLaunch$2$invokeSuspend$$inlined$filter$1$1) == coroutineSingletons) {
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
        intercityDashboardModalViewRouter$onLaunch$2$invokeSuspend$$inlined$filter$1$1 = new IntercityDashboardModalViewRouter$onLaunch$2$invokeSuspend$$inlined$filter$1$1(this, continuation);
        Object obj2 = intercityDashboardModalViewRouter$onLaunch$2$invokeSuspend$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intercityDashboardModalViewRouter$onLaunch$2$invokeSuspend$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
