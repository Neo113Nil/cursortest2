package com.yandex.go.summary.interactor.expanded.state.content.tariffcard;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class c0 implements tpr {
    public final /* synthetic */ a0 a;

    public c0(a0 a0Var) {
        this.a = a0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$1 tariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$1;
        int i;
        if (continuation instanceof TariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$1) {
            tariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$1 = (TariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$1) continuation;
            int i2 = tariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b0 b0Var = new b0(vprVar);
                    tariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$1.L$0 = null;
                    tariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$1.L$1 = null;
                    tariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$1.L$2 = null;
                    tariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$1.label = 1;
                    if (this.a.collect(b0Var, tariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$1) == coroutineSingletons) {
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
        tariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$1 = new TariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$1(this, continuation);
        Object obj2 = tariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
