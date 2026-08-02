package com.yandex.go.summary.interactor.expanded.state.content.tariffcard;

import defpackage.akt0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class q implements tpr {
    public final /* synthetic */ tpr[] a;

    public q(tpr[] tprVarArr) {
        this.a = tprVarArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$1$1 tariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$1$1;
        int i;
        if (continuation instanceof TariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$1$1) {
            tariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$1$1 = (TariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$1$1) continuation;
            int i2 = tariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    akt0 akt0Var = new akt0(tprVarArr, 3);
                    TariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$1$3 tariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$1$3 = new TariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$1$3(false, null);
                    tariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$1$1.L$0 = null;
                    tariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$1$1.L$1 = null;
                    tariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$1$1.L$2 = null;
                    tariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$1$1.label = 1;
                    if (kotlinx.coroutines.flow.internal.j.a(vprVar, akt0Var, tariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$1$3, tariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$1$1, tprVarArr) == coroutineSingletons) {
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
        tariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$1$1 = new TariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$1$1(this, continuation);
        Object obj2 = tariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
