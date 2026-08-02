package com.yandex.go.taxi.summary.mobilityhub.interactor;

import defpackage.fcj0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class q implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ fcj0 b;

    public q(tpr tprVar, fcj0 fcj0Var) {
        this.a = tprVar;
        this.b = fcj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SourceDestinationStateInteractor$stateFlow$$inlined$map$1$1 sourceDestinationStateInteractor$stateFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof SourceDestinationStateInteractor$stateFlow$$inlined$map$1$1) {
            sourceDestinationStateInteractor$stateFlow$$inlined$map$1$1 = (SourceDestinationStateInteractor$stateFlow$$inlined$map$1$1) continuation;
            int i2 = sourceDestinationStateInteractor$stateFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sourceDestinationStateInteractor$stateFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sourceDestinationStateInteractor$stateFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sourceDestinationStateInteractor$stateFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    p pVar = new p(vprVar, this.b);
                    sourceDestinationStateInteractor$stateFlow$$inlined$map$1$1.L$0 = null;
                    sourceDestinationStateInteractor$stateFlow$$inlined$map$1$1.L$1 = null;
                    sourceDestinationStateInteractor$stateFlow$$inlined$map$1$1.L$2 = null;
                    sourceDestinationStateInteractor$stateFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(pVar, sourceDestinationStateInteractor$stateFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        sourceDestinationStateInteractor$stateFlow$$inlined$map$1$1 = new SourceDestinationStateInteractor$stateFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = sourceDestinationStateInteractor$stateFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sourceDestinationStateInteractor$stateFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
