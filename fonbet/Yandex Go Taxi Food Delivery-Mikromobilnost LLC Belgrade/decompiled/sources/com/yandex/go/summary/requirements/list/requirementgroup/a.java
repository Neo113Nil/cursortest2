package com.yandex.go.summary.requirements.list.requirementgroup;

import defpackage.agz0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.j;

/* loaded from: classes14.dex */
public final class a implements tpr {
    public final /* synthetic */ tpr[] a;
    public final /* synthetic */ b b;

    public a(tpr[] tprVarArr, b bVar) {
        this.a = tprVarArr;
        this.b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RequirementGroupScreenUiStateInteractor$special$$inlined$combine$1$1 requirementGroupScreenUiStateInteractor$special$$inlined$combine$1$1;
        int i;
        if (continuation instanceof RequirementGroupScreenUiStateInteractor$special$$inlined$combine$1$1) {
            requirementGroupScreenUiStateInteractor$special$$inlined$combine$1$1 = (RequirementGroupScreenUiStateInteractor$special$$inlined$combine$1$1) continuation;
            int i2 = requirementGroupScreenUiStateInteractor$special$$inlined$combine$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requirementGroupScreenUiStateInteractor$special$$inlined$combine$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = requirementGroupScreenUiStateInteractor$special$$inlined$combine$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requirementGroupScreenUiStateInteractor$special$$inlined$combine$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    agz0 agz0Var = new agz0(tprVarArr);
                    RequirementGroupScreenUiStateInteractor$special$$inlined$combine$1$3 requirementGroupScreenUiStateInteractor$special$$inlined$combine$1$3 = new RequirementGroupScreenUiStateInteractor$special$$inlined$combine$1$3(null, this.b);
                    requirementGroupScreenUiStateInteractor$special$$inlined$combine$1$1.L$0 = null;
                    requirementGroupScreenUiStateInteractor$special$$inlined$combine$1$1.L$1 = null;
                    requirementGroupScreenUiStateInteractor$special$$inlined$combine$1$1.L$2 = null;
                    requirementGroupScreenUiStateInteractor$special$$inlined$combine$1$1.label = 1;
                    if (j.a(vprVar, agz0Var, requirementGroupScreenUiStateInteractor$special$$inlined$combine$1$3, requirementGroupScreenUiStateInteractor$special$$inlined$combine$1$1, tprVarArr) == coroutineSingletons) {
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
        requirementGroupScreenUiStateInteractor$special$$inlined$combine$1$1 = new RequirementGroupScreenUiStateInteractor$special$$inlined$combine$1$1(this, continuation);
        Object obj2 = requirementGroupScreenUiStateInteractor$special$$inlined$combine$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requirementGroupScreenUiStateInteractor$special$$inlined$combine$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
