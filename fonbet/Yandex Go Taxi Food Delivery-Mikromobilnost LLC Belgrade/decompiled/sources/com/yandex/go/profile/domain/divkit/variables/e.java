package com.yandex.go.profile.domain.divkit.variables;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.vqd0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class e implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ vqd0 b;

    public e(tpr tprVar, vqd0 vqd0Var) {
        this.a = tprVar;
        this.b = vqd0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        PlusVariableHandler$init$$inlined$map$1$1 plusVariableHandler$init$$inlined$map$1$1;
        int i;
        if (continuation instanceof PlusVariableHandler$init$$inlined$map$1$1) {
            plusVariableHandler$init$$inlined$map$1$1 = (PlusVariableHandler$init$$inlined$map$1$1) continuation;
            int i2 = plusVariableHandler$init$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusVariableHandler$init$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusVariableHandler$init$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusVariableHandler$init$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar, this.b);
                    plusVariableHandler$init$$inlined$map$1$1.L$0 = null;
                    plusVariableHandler$init$$inlined$map$1$1.L$1 = null;
                    plusVariableHandler$init$$inlined$map$1$1.L$2 = null;
                    plusVariableHandler$init$$inlined$map$1$1.label = 1;
                    if (this.a.collect(dVar, plusVariableHandler$init$$inlined$map$1$1) == coroutineSingletons) {
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
        plusVariableHandler$init$$inlined$map$1$1 = new PlusVariableHandler$init$$inlined$map$1$1(this, continuation);
        Object obj2 = plusVariableHandler$init$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusVariableHandler$init$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
