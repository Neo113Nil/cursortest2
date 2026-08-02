package com.yandex.go.summary.interactor.anchored.state.content;

import defpackage.nej0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class r implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ nej0 b;

    public r(tpr tprVar, nej0 nej0Var) {
        this.a = tprVar;
        this.b = nej0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RequirementChipsUiStateInteractor$requirementBubbleDataFlow$lambda$1$$inlined$map$1$1 requirementChipsUiStateInteractor$requirementBubbleDataFlow$lambda$1$$inlined$map$1$1;
        int i;
        if (continuation instanceof RequirementChipsUiStateInteractor$requirementBubbleDataFlow$lambda$1$$inlined$map$1$1) {
            requirementChipsUiStateInteractor$requirementBubbleDataFlow$lambda$1$$inlined$map$1$1 = (RequirementChipsUiStateInteractor$requirementBubbleDataFlow$lambda$1$$inlined$map$1$1) continuation;
            int i2 = requirementChipsUiStateInteractor$requirementBubbleDataFlow$lambda$1$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requirementChipsUiStateInteractor$requirementBubbleDataFlow$lambda$1$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = requirementChipsUiStateInteractor$requirementBubbleDataFlow$lambda$1$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requirementChipsUiStateInteractor$requirementBubbleDataFlow$lambda$1$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    q qVar = new q(vprVar, this.b);
                    requirementChipsUiStateInteractor$requirementBubbleDataFlow$lambda$1$$inlined$map$1$1.L$0 = null;
                    requirementChipsUiStateInteractor$requirementBubbleDataFlow$lambda$1$$inlined$map$1$1.L$1 = null;
                    requirementChipsUiStateInteractor$requirementBubbleDataFlow$lambda$1$$inlined$map$1$1.L$2 = null;
                    requirementChipsUiStateInteractor$requirementBubbleDataFlow$lambda$1$$inlined$map$1$1.label = 1;
                    if (this.a.collect(qVar, requirementChipsUiStateInteractor$requirementBubbleDataFlow$lambda$1$$inlined$map$1$1) == coroutineSingletons) {
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
        requirementChipsUiStateInteractor$requirementBubbleDataFlow$lambda$1$$inlined$map$1$1 = new RequirementChipsUiStateInteractor$requirementBubbleDataFlow$lambda$1$$inlined$map$1$1(this, continuation);
        Object obj2 = requirementChipsUiStateInteractor$requirementBubbleDataFlow$lambda$1$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requirementChipsUiStateInteractor$requirementBubbleDataFlow$lambda$1$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
