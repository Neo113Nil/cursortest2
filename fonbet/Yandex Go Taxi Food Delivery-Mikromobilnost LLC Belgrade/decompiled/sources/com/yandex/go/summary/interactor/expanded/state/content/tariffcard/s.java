package com.yandex.go.summary.interactor.expanded.state.content.tariffcard;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class s implements tpr {
    public final /* synthetic */ q a;

    public s(q qVar) {
        this.a = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$2$1 tariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$2$1;
        int i;
        if (continuation instanceof TariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$2$1) {
            tariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$2$1 = (TariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$2$1) continuation;
            int i2 = tariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r rVar = new r(vprVar);
                    tariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$2$1.L$0 = null;
                    tariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$2$1.L$1 = null;
                    tariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$2$1.L$2 = null;
                    tariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$2$1.label = 1;
                    if (this.a.collect(rVar, tariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$2$1) == coroutineSingletons) {
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
        tariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$2$1 = new TariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$2$1(this, continuation);
        Object obj2 = tariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffCardUiStateInteractor$getFirstDefaultRequirementOrCarouselIndexFlow$$inlined$combineIdentifiable$default$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
