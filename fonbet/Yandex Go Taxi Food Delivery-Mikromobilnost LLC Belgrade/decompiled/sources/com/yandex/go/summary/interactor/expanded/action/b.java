package com.yandex.go.summary.interactor.expanded.action;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ String b;

    public b(tpr tprVar, String str) {
        this.a = tprVar;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RequirementUiActionInteractor$handleDeliveryIntervalsClicked$$inlined$map$1$1 requirementUiActionInteractor$handleDeliveryIntervalsClicked$$inlined$map$1$1;
        int i;
        if (continuation instanceof RequirementUiActionInteractor$handleDeliveryIntervalsClicked$$inlined$map$1$1) {
            requirementUiActionInteractor$handleDeliveryIntervalsClicked$$inlined$map$1$1 = (RequirementUiActionInteractor$handleDeliveryIntervalsClicked$$inlined$map$1$1) continuation;
            int i2 = requirementUiActionInteractor$handleDeliveryIntervalsClicked$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requirementUiActionInteractor$handleDeliveryIntervalsClicked$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = requirementUiActionInteractor$handleDeliveryIntervalsClicked$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requirementUiActionInteractor$handleDeliveryIntervalsClicked$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    requirementUiActionInteractor$handleDeliveryIntervalsClicked$$inlined$map$1$1.L$0 = null;
                    requirementUiActionInteractor$handleDeliveryIntervalsClicked$$inlined$map$1$1.L$1 = null;
                    requirementUiActionInteractor$handleDeliveryIntervalsClicked$$inlined$map$1$1.L$2 = null;
                    requirementUiActionInteractor$handleDeliveryIntervalsClicked$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, requirementUiActionInteractor$handleDeliveryIntervalsClicked$$inlined$map$1$1) == coroutineSingletons) {
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
        requirementUiActionInteractor$handleDeliveryIntervalsClicked$$inlined$map$1$1 = new RequirementUiActionInteractor$handleDeliveryIntervalsClicked$$inlined$map$1$1(this, continuation);
        Object obj2 = requirementUiActionInteractor$handleDeliveryIntervalsClicked$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requirementUiActionInteractor$handleDeliveryIntervalsClicked$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
