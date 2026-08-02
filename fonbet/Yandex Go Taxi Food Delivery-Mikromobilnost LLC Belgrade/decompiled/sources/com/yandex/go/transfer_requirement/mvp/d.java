package com.yandex.go.transfer_requirement.mvp;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class d implements tpr {
    public final /* synthetic */ tpr a;

    public d(tpr tprVar) {
        this.a = tprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TransferRequirementModalViewPresenter$attachView$3$invokeSuspend$$inlined$map$1$1 transferRequirementModalViewPresenter$attachView$3$invokeSuspend$$inlined$map$1$1;
        int i;
        if (continuation instanceof TransferRequirementModalViewPresenter$attachView$3$invokeSuspend$$inlined$map$1$1) {
            transferRequirementModalViewPresenter$attachView$3$invokeSuspend$$inlined$map$1$1 = (TransferRequirementModalViewPresenter$attachView$3$invokeSuspend$$inlined$map$1$1) continuation;
            int i2 = transferRequirementModalViewPresenter$attachView$3$invokeSuspend$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transferRequirementModalViewPresenter$attachView$3$invokeSuspend$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transferRequirementModalViewPresenter$attachView$3$invokeSuspend$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferRequirementModalViewPresenter$attachView$3$invokeSuspend$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar);
                    transferRequirementModalViewPresenter$attachView$3$invokeSuspend$$inlined$map$1$1.L$0 = null;
                    transferRequirementModalViewPresenter$attachView$3$invokeSuspend$$inlined$map$1$1.L$1 = null;
                    transferRequirementModalViewPresenter$attachView$3$invokeSuspend$$inlined$map$1$1.L$2 = null;
                    transferRequirementModalViewPresenter$attachView$3$invokeSuspend$$inlined$map$1$1.label = 1;
                    if (this.a.collect(cVar, transferRequirementModalViewPresenter$attachView$3$invokeSuspend$$inlined$map$1$1) == coroutineSingletons) {
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
        transferRequirementModalViewPresenter$attachView$3$invokeSuspend$$inlined$map$1$1 = new TransferRequirementModalViewPresenter$attachView$3$invokeSuspend$$inlined$map$1$1(this, continuation);
        Object obj2 = transferRequirementModalViewPresenter$attachView$3$invokeSuspend$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferRequirementModalViewPresenter$attachView$3$invokeSuspend$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
