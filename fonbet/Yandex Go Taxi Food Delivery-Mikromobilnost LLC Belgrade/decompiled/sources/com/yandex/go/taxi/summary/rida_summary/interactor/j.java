package com.yandex.go.taxi.summary.rida_summary.interactor;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class j implements tpr {
    public final /* synthetic */ tpr a;

    public j(tpr tprVar) {
        this.a = tprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RidaOrderButtonUiStateInteractor$isDestinationMissingFlow$$inlined$map$1$1 ridaOrderButtonUiStateInteractor$isDestinationMissingFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof RidaOrderButtonUiStateInteractor$isDestinationMissingFlow$$inlined$map$1$1) {
            ridaOrderButtonUiStateInteractor$isDestinationMissingFlow$$inlined$map$1$1 = (RidaOrderButtonUiStateInteractor$isDestinationMissingFlow$$inlined$map$1$1) continuation;
            int i2 = ridaOrderButtonUiStateInteractor$isDestinationMissingFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ridaOrderButtonUiStateInteractor$isDestinationMissingFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ridaOrderButtonUiStateInteractor$isDestinationMissingFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ridaOrderButtonUiStateInteractor$isDestinationMissingFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    i iVar = new i(vprVar);
                    ridaOrderButtonUiStateInteractor$isDestinationMissingFlow$$inlined$map$1$1.L$0 = null;
                    ridaOrderButtonUiStateInteractor$isDestinationMissingFlow$$inlined$map$1$1.L$1 = null;
                    ridaOrderButtonUiStateInteractor$isDestinationMissingFlow$$inlined$map$1$1.L$2 = null;
                    ridaOrderButtonUiStateInteractor$isDestinationMissingFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(iVar, ridaOrderButtonUiStateInteractor$isDestinationMissingFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        ridaOrderButtonUiStateInteractor$isDestinationMissingFlow$$inlined$map$1$1 = new RidaOrderButtonUiStateInteractor$isDestinationMissingFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = ridaOrderButtonUiStateInteractor$isDestinationMissingFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ridaOrderButtonUiStateInteractor$isDestinationMissingFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
