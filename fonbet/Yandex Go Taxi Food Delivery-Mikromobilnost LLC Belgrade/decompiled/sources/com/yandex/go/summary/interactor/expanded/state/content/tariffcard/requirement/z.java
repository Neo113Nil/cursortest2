package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import defpackage.kdd0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class z implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ kdd0 b;

    public z(tpr tprVar, kdd0 kdd0Var) {
        this.a = tprVar;
        this.b = kdd0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        GroupWithTopRequirementsUiStateInteractor$groupRequirementsFlow$$inlined$mapIdentifiable$1$1 groupWithTopRequirementsUiStateInteractor$groupRequirementsFlow$$inlined$mapIdentifiable$1$1;
        int i;
        if (continuation instanceof GroupWithTopRequirementsUiStateInteractor$groupRequirementsFlow$$inlined$mapIdentifiable$1$1) {
            groupWithTopRequirementsUiStateInteractor$groupRequirementsFlow$$inlined$mapIdentifiable$1$1 = (GroupWithTopRequirementsUiStateInteractor$groupRequirementsFlow$$inlined$mapIdentifiable$1$1) continuation;
            int i2 = groupWithTopRequirementsUiStateInteractor$groupRequirementsFlow$$inlined$mapIdentifiable$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                groupWithTopRequirementsUiStateInteractor$groupRequirementsFlow$$inlined$mapIdentifiable$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = groupWithTopRequirementsUiStateInteractor$groupRequirementsFlow$$inlined$mapIdentifiable$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = groupWithTopRequirementsUiStateInteractor$groupRequirementsFlow$$inlined$mapIdentifiable$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    y yVar = new y(vprVar, this.b);
                    groupWithTopRequirementsUiStateInteractor$groupRequirementsFlow$$inlined$mapIdentifiable$1$1.L$0 = null;
                    groupWithTopRequirementsUiStateInteractor$groupRequirementsFlow$$inlined$mapIdentifiable$1$1.L$1 = null;
                    groupWithTopRequirementsUiStateInteractor$groupRequirementsFlow$$inlined$mapIdentifiable$1$1.L$2 = null;
                    groupWithTopRequirementsUiStateInteractor$groupRequirementsFlow$$inlined$mapIdentifiable$1$1.label = 1;
                    if (this.a.collect(yVar, groupWithTopRequirementsUiStateInteractor$groupRequirementsFlow$$inlined$mapIdentifiable$1$1) == coroutineSingletons) {
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
        groupWithTopRequirementsUiStateInteractor$groupRequirementsFlow$$inlined$mapIdentifiable$1$1 = new GroupWithTopRequirementsUiStateInteractor$groupRequirementsFlow$$inlined$mapIdentifiable$1$1(this, continuation);
        Object obj2 = groupWithTopRequirementsUiStateInteractor$groupRequirementsFlow$$inlined$mapIdentifiable$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = groupWithTopRequirementsUiStateInteractor$groupRequirementsFlow$$inlined$mapIdentifiable$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
