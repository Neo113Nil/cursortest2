package com.yandex.go.mainscreen.superapp.orders.presentation.color;

import android.animation.ArgbEvaluator;
import defpackage.egc;
import defpackage.ny61;
import defpackage.pfs0;
import defpackage.ufc;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;
    public final /* synthetic */ egc c;

    public a(vpr vprVar, c cVar, egc egcVar) {
        this.a = vprVar;
        this.b = cVar;
        this.c = egcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SimplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$2$invokeSuspend$$inlined$map$1$2$1 simplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$2$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SimplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$2$invokeSuspend$$inlined$map$1$2$1) {
            simplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$2$invokeSuspend$$inlined$map$1$2$1 = (SimplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$2$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = simplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$2$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                simplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$2$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = simplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$2$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = simplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$2$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    float floatValue = ((Number) obj).floatValue();
                    ArgbEvaluator argbEvaluator = this.b.d;
                    egc egcVar = this.c;
                    Integer valueOf = Integer.valueOf(egcVar.a.a);
                    ufc ufcVar = egcVar.b;
                    int intValue = ((Integer) argbEvaluator.evaluate(floatValue, valueOf, Integer.valueOf(ufcVar.a))).intValue();
                    ufc ufcVar2 = egcVar.a;
                    pfs0 pfs0Var = new pfs0(intValue, ((Integer) argbEvaluator.evaluate(floatValue, Integer.valueOf(ufcVar2.b), Integer.valueOf(ufcVar.b))).intValue(), ((Integer) argbEvaluator.evaluate(floatValue, Integer.valueOf(ufcVar2.c), Integer.valueOf(ufcVar.c))).intValue(), ((Integer) argbEvaluator.evaluate(floatValue, Integer.valueOf(ufcVar2.d), Integer.valueOf(ufcVar.d))).intValue(), ((Integer) argbEvaluator.evaluate(floatValue, Integer.valueOf(ufcVar2.e), Integer.valueOf(ufcVar.e))).intValue(), ((Integer) argbEvaluator.evaluate(floatValue, Integer.valueOf(ufcVar2.f), Integer.valueOf(ufcVar.f))).intValue(), ((Integer) argbEvaluator.evaluate(floatValue, Integer.valueOf(ufcVar2.g), Integer.valueOf(ufcVar.g))).intValue(), ((Integer) argbEvaluator.evaluate(floatValue, Integer.valueOf(ufcVar2.h), Integer.valueOf(ufcVar.h))).intValue(), ((Integer) argbEvaluator.evaluate(floatValue, Integer.valueOf(ufcVar2.i), Integer.valueOf(ufcVar.i))).intValue(), floatValue, null);
                    simplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$2$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    simplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$2$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    simplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$2$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    simplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$2$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    simplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$2$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(pfs0Var, simplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$2$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        simplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$2$invokeSuspend$$inlined$map$1$2$1 = new SimplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$2$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = simplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$2$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = simplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$2$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
