package com.yandex.go.shortcuts.impl.interactors;

import defpackage.g4s0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class c implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ g4s0 b;

    public c(tpr tprVar, g4s0 g4s0Var) {
        this.a = tprVar;
        this.b = g4s0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        GetModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$map$1$1 getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof GetModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$map$1$1) {
            getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$map$1$1 = (GetModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$map$1$1) continuation;
            int i2 = getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar, this.b);
                    getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$map$1$1.L$0 = null;
                    getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$map$1$1.L$1 = null;
                    getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$map$1$1.L$2 = null;
                    getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$map$1$1 = new GetModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
