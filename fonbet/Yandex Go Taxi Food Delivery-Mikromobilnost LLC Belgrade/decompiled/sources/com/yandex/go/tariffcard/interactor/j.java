package com.yandex.go.tariffcard.interactor;

import defpackage.ab00;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.x7t0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class j implements tpr {
    public final /* synthetic */ tpr[] a;
    public final /* synthetic */ x7t0 b;

    public j(tpr[] tprVarArr, x7t0 x7t0Var) {
        this.a = tprVarArr;
        this.b = x7t0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SoloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$1$1 soloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$1$1;
        int i;
        if (continuation instanceof SoloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$1$1) {
            soloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$1$1 = (SoloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$1$1) continuation;
            int i2 = soloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                soloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = soloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = soloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    ab00 ab00Var = new ab00(tprVarArr, 27);
                    SoloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$1$3 soloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$1$3 = new SoloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$1$3(null, false, this.b);
                    soloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$1$1.L$0 = null;
                    soloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$1$1.L$1 = null;
                    soloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$1$1.L$2 = null;
                    soloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$1$1.label = 1;
                    if (kotlinx.coroutines.flow.internal.j.a(vprVar, ab00Var, soloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$1$3, soloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$1$1, tprVarArr) == coroutineSingletons) {
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
        soloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$1$1 = new SoloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$1$1(this, continuation);
        Object obj2 = soloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = soloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
