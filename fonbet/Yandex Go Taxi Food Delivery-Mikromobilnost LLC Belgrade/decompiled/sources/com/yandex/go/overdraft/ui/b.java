package com.yandex.go.overdraft.ui;

import defpackage.dug;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ dug b;

    public b(tpr tprVar, dug dugVar) {
        this.a = tprVar;
        this.b = dugVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        DebtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$1 debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$1;
        int i;
        if (continuation instanceof DebtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$1) {
            debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$1 = (DebtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$1) continuation;
            int i2 = debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$1.L$0 = null;
                    debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$1.L$1 = null;
                    debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$1.L$2 = null;
                    debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$1) == coroutineSingletons) {
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
        debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$1 = new DebtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$1(this, continuation);
        Object obj2 = debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = debtPresenter$startCollectUiState$1$invokeSuspend$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
