package com.yandex.go.navigator.repository;

import defpackage.ho21;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class q implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ ho21 b;

    public q(r0 r0Var, ho21 ho21Var) {
        this.a = r0Var;
        this.b = ho21Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        UserInteractionsTimerInteractor$special$$inlined$map$1$1 userInteractionsTimerInteractor$special$$inlined$map$1$1;
        int i;
        if (continuation instanceof UserInteractionsTimerInteractor$special$$inlined$map$1$1) {
            userInteractionsTimerInteractor$special$$inlined$map$1$1 = (UserInteractionsTimerInteractor$special$$inlined$map$1$1) continuation;
            int i2 = userInteractionsTimerInteractor$special$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userInteractionsTimerInteractor$special$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userInteractionsTimerInteractor$special$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userInteractionsTimerInteractor$special$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    p pVar = new p(vprVar, this.b);
                    userInteractionsTimerInteractor$special$$inlined$map$1$1.L$0 = null;
                    userInteractionsTimerInteractor$special$$inlined$map$1$1.L$1 = null;
                    userInteractionsTimerInteractor$special$$inlined$map$1$1.L$2 = null;
                    userInteractionsTimerInteractor$special$$inlined$map$1$1.label = 1;
                    if (this.a.collect(pVar, userInteractionsTimerInteractor$special$$inlined$map$1$1) == coroutineSingletons) {
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
        userInteractionsTimerInteractor$special$$inlined$map$1$1 = new UserInteractionsTimerInteractor$special$$inlined$map$1$1(this, continuation);
        Object obj2 = userInteractionsTimerInteractor$special$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userInteractionsTimerInteractor$special$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
