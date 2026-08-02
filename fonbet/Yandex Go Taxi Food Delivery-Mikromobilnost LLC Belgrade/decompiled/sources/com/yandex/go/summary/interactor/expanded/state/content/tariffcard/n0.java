package com.yandex.go.summary.interactor.expanded.state.content.tariffcard;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class n0 implements tpr {
    public final /* synthetic */ l0 a;

    public n0(l0 l0Var) {
        this.a = l0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TariffCardUiStateInteractor$uiStateFlow$lambda$0$$inlined$combineIdentifiable$default$3$1 tariffCardUiStateInteractor$uiStateFlow$lambda$0$$inlined$combineIdentifiable$default$3$1;
        int i;
        if (continuation instanceof TariffCardUiStateInteractor$uiStateFlow$lambda$0$$inlined$combineIdentifiable$default$3$1) {
            tariffCardUiStateInteractor$uiStateFlow$lambda$0$$inlined$combineIdentifiable$default$3$1 = (TariffCardUiStateInteractor$uiStateFlow$lambda$0$$inlined$combineIdentifiable$default$3$1) continuation;
            int i2 = tariffCardUiStateInteractor$uiStateFlow$lambda$0$$inlined$combineIdentifiable$default$3$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffCardUiStateInteractor$uiStateFlow$lambda$0$$inlined$combineIdentifiable$default$3$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tariffCardUiStateInteractor$uiStateFlow$lambda$0$$inlined$combineIdentifiable$default$3$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffCardUiStateInteractor$uiStateFlow$lambda$0$$inlined$combineIdentifiable$default$3$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    m0 m0Var = new m0(vprVar);
                    tariffCardUiStateInteractor$uiStateFlow$lambda$0$$inlined$combineIdentifiable$default$3$1.L$0 = null;
                    tariffCardUiStateInteractor$uiStateFlow$lambda$0$$inlined$combineIdentifiable$default$3$1.L$1 = null;
                    tariffCardUiStateInteractor$uiStateFlow$lambda$0$$inlined$combineIdentifiable$default$3$1.L$2 = null;
                    tariffCardUiStateInteractor$uiStateFlow$lambda$0$$inlined$combineIdentifiable$default$3$1.label = 1;
                    if (this.a.collect(m0Var, tariffCardUiStateInteractor$uiStateFlow$lambda$0$$inlined$combineIdentifiable$default$3$1) == coroutineSingletons) {
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
        tariffCardUiStateInteractor$uiStateFlow$lambda$0$$inlined$combineIdentifiable$default$3$1 = new TariffCardUiStateInteractor$uiStateFlow$lambda$0$$inlined$combineIdentifiable$default$3$1(this, continuation);
        Object obj2 = tariffCardUiStateInteractor$uiStateFlow$lambda$0$$inlined$combineIdentifiable$default$3$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffCardUiStateInteractor$uiStateFlow$lambda$0$$inlined$combineIdentifiable$default$3$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
