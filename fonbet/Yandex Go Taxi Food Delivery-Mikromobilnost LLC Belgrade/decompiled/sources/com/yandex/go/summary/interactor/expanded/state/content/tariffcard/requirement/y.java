package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import defpackage.f6v;
import defpackage.kdd0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.ygj0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class y implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ kdd0 b;

    public y(vpr vprVar, kdd0 kdd0Var) {
        this.a = vprVar;
        this.b = kdd0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GroupWithTopRequirementsUiStateInteractor$groupRequirementsFlow$$inlined$mapIdentifiable$1$2$1 groupWithTopRequirementsUiStateInteractor$groupRequirementsFlow$$inlined$mapIdentifiable$1$2$1;
        int i;
        if (continuation instanceof GroupWithTopRequirementsUiStateInteractor$groupRequirementsFlow$$inlined$mapIdentifiable$1$2$1) {
            groupWithTopRequirementsUiStateInteractor$groupRequirementsFlow$$inlined$mapIdentifiable$1$2$1 = (GroupWithTopRequirementsUiStateInteractor$groupRequirementsFlow$$inlined$mapIdentifiable$1$2$1) continuation;
            int i2 = groupWithTopRequirementsUiStateInteractor$groupRequirementsFlow$$inlined$mapIdentifiable$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                groupWithTopRequirementsUiStateInteractor$groupRequirementsFlow$$inlined$mapIdentifiable$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = groupWithTopRequirementsUiStateInteractor$groupRequirementsFlow$$inlined$mapIdentifiable$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = groupWithTopRequirementsUiStateInteractor$groupRequirementsFlow$$inlined$mapIdentifiable$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    f6v f6vVar = (f6v) obj;
                    f6v f6vVar2 = new f6v(f6vVar.a, this.b.g((ygj0) f6vVar.b, null));
                    groupWithTopRequirementsUiStateInteractor$groupRequirementsFlow$$inlined$mapIdentifiable$1$2$1.L$0 = null;
                    groupWithTopRequirementsUiStateInteractor$groupRequirementsFlow$$inlined$mapIdentifiable$1$2$1.L$1 = null;
                    groupWithTopRequirementsUiStateInteractor$groupRequirementsFlow$$inlined$mapIdentifiable$1$2$1.L$2 = null;
                    groupWithTopRequirementsUiStateInteractor$groupRequirementsFlow$$inlined$mapIdentifiable$1$2$1.L$3 = null;
                    groupWithTopRequirementsUiStateInteractor$groupRequirementsFlow$$inlined$mapIdentifiable$1$2$1.label = 1;
                    if (this.a.emit(f6vVar2, groupWithTopRequirementsUiStateInteractor$groupRequirementsFlow$$inlined$mapIdentifiable$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        groupWithTopRequirementsUiStateInteractor$groupRequirementsFlow$$inlined$mapIdentifiable$1$2$1 = new GroupWithTopRequirementsUiStateInteractor$groupRequirementsFlow$$inlined$mapIdentifiable$1$2$1(this, continuation);
        Object obj22 = groupWithTopRequirementsUiStateInteractor$groupRequirementsFlow$$inlined$mapIdentifiable$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = groupWithTopRequirementsUiStateInteractor$groupRequirementsFlow$$inlined$mapIdentifiable$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
