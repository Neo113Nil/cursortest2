package com.yandex.go.tariffcard.interactor;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class l implements tpr {
    public final /* synthetic */ j a;

    public l(j jVar) {
        this.a = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SoloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$2$1 soloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$2$1;
        int i;
        if (continuation instanceof SoloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$2$1) {
            soloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$2$1 = (SoloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$2$1) continuation;
            int i2 = soloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                soloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = soloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = soloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    k kVar = new k(vprVar);
                    soloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$2$1.L$0 = null;
                    soloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$2$1.L$1 = null;
                    soloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$2$1.L$2 = null;
                    soloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$2$1.label = 1;
                    if (this.a.collect(kVar, soloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$2$1) == coroutineSingletons) {
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
        soloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$2$1 = new SoloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$2$1(this, continuation);
        Object obj2 = soloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = soloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
