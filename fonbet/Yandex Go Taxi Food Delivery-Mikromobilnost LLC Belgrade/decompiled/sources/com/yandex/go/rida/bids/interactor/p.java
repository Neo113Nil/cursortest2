package com.yandex.go.rida.bids.interactor;

import defpackage.b2k;
import defpackage.kgb;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class p implements tpr {
    public final /* synthetic */ b2k a;
    public final /* synthetic */ kgb b;

    public p(b2k b2kVar, kgb kgbVar) {
        this.a = b2kVar;
        this.b = kgbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        CheckOrderForRidaCompatibilityInteractorImpl$isOrderCompatibleWithRidaFlow$$inlined$map$1$1 checkOrderForRidaCompatibilityInteractorImpl$isOrderCompatibleWithRidaFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof CheckOrderForRidaCompatibilityInteractorImpl$isOrderCompatibleWithRidaFlow$$inlined$map$1$1) {
            checkOrderForRidaCompatibilityInteractorImpl$isOrderCompatibleWithRidaFlow$$inlined$map$1$1 = (CheckOrderForRidaCompatibilityInteractorImpl$isOrderCompatibleWithRidaFlow$$inlined$map$1$1) continuation;
            int i2 = checkOrderForRidaCompatibilityInteractorImpl$isOrderCompatibleWithRidaFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkOrderForRidaCompatibilityInteractorImpl$isOrderCompatibleWithRidaFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = checkOrderForRidaCompatibilityInteractorImpl$isOrderCompatibleWithRidaFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkOrderForRidaCompatibilityInteractorImpl$isOrderCompatibleWithRidaFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    o oVar = new o(vprVar, this.b);
                    checkOrderForRidaCompatibilityInteractorImpl$isOrderCompatibleWithRidaFlow$$inlined$map$1$1.L$0 = null;
                    checkOrderForRidaCompatibilityInteractorImpl$isOrderCompatibleWithRidaFlow$$inlined$map$1$1.L$1 = null;
                    checkOrderForRidaCompatibilityInteractorImpl$isOrderCompatibleWithRidaFlow$$inlined$map$1$1.L$2 = null;
                    checkOrderForRidaCompatibilityInteractorImpl$isOrderCompatibleWithRidaFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(oVar, checkOrderForRidaCompatibilityInteractorImpl$isOrderCompatibleWithRidaFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        checkOrderForRidaCompatibilityInteractorImpl$isOrderCompatibleWithRidaFlow$$inlined$map$1$1 = new CheckOrderForRidaCompatibilityInteractorImpl$isOrderCompatibleWithRidaFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = checkOrderForRidaCompatibilityInteractorImpl$isOrderCompatibleWithRidaFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkOrderForRidaCompatibilityInteractorImpl$isOrderCompatibleWithRidaFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
