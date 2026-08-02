package com.yandex.go.shortcuts.impl.interactors;

import defpackage.d4s0;
import defpackage.g4s0;
import defpackage.ny61;
import defpackage.sa90;
import defpackage.vpr;
import defpackage.y430;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ g4s0 b;

    public b(vpr vprVar, g4s0 g4s0Var) {
        this.a = vprVar;
        this.b = g4s0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GetModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$map$1$2$1 getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof GetModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$map$1$2$1) {
            getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$map$1$2$1 = (GetModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$map$1$2$1) continuation;
            int i2 = getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    sa90 sa90Var = (sa90) obj;
                    d4s0 a = this.b.a((y430) sa90Var.a, sa90Var.b);
                    getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$map$1$2$1.L$0 = null;
                    getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$map$1$2$1.L$1 = null;
                    getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$map$1$2$1.L$2 = null;
                    getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$map$1$2$1.L$3 = null;
                    getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(a, getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$map$1$2$1 = new GetModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
