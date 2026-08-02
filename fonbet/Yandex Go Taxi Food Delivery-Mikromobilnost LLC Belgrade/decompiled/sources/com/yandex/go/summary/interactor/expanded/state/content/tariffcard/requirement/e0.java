package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class e0 implements tpr {
    public final /* synthetic */ c0 a;

    public e0(c0 c0Var) {
        this.a = c0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SoloRequirementsUiStateInteractor$soloRequirementItemsFlow$$inlined$combineIdentifiable$default$2$1 soloRequirementsUiStateInteractor$soloRequirementItemsFlow$$inlined$combineIdentifiable$default$2$1;
        int i;
        if (continuation instanceof SoloRequirementsUiStateInteractor$soloRequirementItemsFlow$$inlined$combineIdentifiable$default$2$1) {
            soloRequirementsUiStateInteractor$soloRequirementItemsFlow$$inlined$combineIdentifiable$default$2$1 = (SoloRequirementsUiStateInteractor$soloRequirementItemsFlow$$inlined$combineIdentifiable$default$2$1) continuation;
            int i2 = soloRequirementsUiStateInteractor$soloRequirementItemsFlow$$inlined$combineIdentifiable$default$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                soloRequirementsUiStateInteractor$soloRequirementItemsFlow$$inlined$combineIdentifiable$default$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = soloRequirementsUiStateInteractor$soloRequirementItemsFlow$$inlined$combineIdentifiable$default$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = soloRequirementsUiStateInteractor$soloRequirementItemsFlow$$inlined$combineIdentifiable$default$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d0 d0Var = new d0(vprVar);
                    soloRequirementsUiStateInteractor$soloRequirementItemsFlow$$inlined$combineIdentifiable$default$2$1.L$0 = null;
                    soloRequirementsUiStateInteractor$soloRequirementItemsFlow$$inlined$combineIdentifiable$default$2$1.L$1 = null;
                    soloRequirementsUiStateInteractor$soloRequirementItemsFlow$$inlined$combineIdentifiable$default$2$1.L$2 = null;
                    soloRequirementsUiStateInteractor$soloRequirementItemsFlow$$inlined$combineIdentifiable$default$2$1.label = 1;
                    if (this.a.collect(d0Var, soloRequirementsUiStateInteractor$soloRequirementItemsFlow$$inlined$combineIdentifiable$default$2$1) == coroutineSingletons) {
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
        soloRequirementsUiStateInteractor$soloRequirementItemsFlow$$inlined$combineIdentifiable$default$2$1 = new SoloRequirementsUiStateInteractor$soloRequirementItemsFlow$$inlined$combineIdentifiable$default$2$1(this, continuation);
        Object obj2 = soloRequirementsUiStateInteractor$soloRequirementItemsFlow$$inlined$combineIdentifiable$default$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = soloRequirementsUiStateInteractor$soloRequirementItemsFlow$$inlined$combineIdentifiable$default$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
