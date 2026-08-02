package com.yandex.go.mainscreen.superapp.orders.presentation.color;

import defpackage.egc;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ c b;
    public final /* synthetic */ egc c;

    public b(tpr tprVar, c cVar, egc egcVar) {
        this.a = tprVar;
        this.b = cVar;
        this.c = egcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SimplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$2$invokeSuspend$$inlined$map$1$1 simplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$2$invokeSuspend$$inlined$map$1$1;
        int i;
        if (continuation instanceof SimplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$2$invokeSuspend$$inlined$map$1$1) {
            simplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$2$invokeSuspend$$inlined$map$1$1 = (SimplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$2$invokeSuspend$$inlined$map$1$1) continuation;
            int i2 = simplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$2$invokeSuspend$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                simplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$2$invokeSuspend$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = simplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$2$invokeSuspend$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = simplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$2$invokeSuspend$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b, this.c);
                    simplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$2$invokeSuspend$$inlined$map$1$1.L$0 = null;
                    simplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$2$invokeSuspend$$inlined$map$1$1.L$1 = null;
                    simplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$2$invokeSuspend$$inlined$map$1$1.L$2 = null;
                    simplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$2$invokeSuspend$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, simplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$2$invokeSuspend$$inlined$map$1$1) == coroutineSingletons) {
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
        simplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$2$invokeSuspend$$inlined$map$1$1 = new SimplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$2$invokeSuspend$$inlined$map$1$1(this, continuation);
        Object obj2 = simplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$2$invokeSuspend$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = simplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$2$invokeSuspend$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
