package com.yandex.go.requirements.ui.selector.compound.child;

import defpackage.iob;
import defpackage.ny61;
import defpackage.sk7;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ sk7 b;
    public final /* synthetic */ iob c;

    public b(tpr tprVar, sk7 sk7Var, iob iobVar) {
        this.a = tprVar;
        this.b = sk7Var;
        this.c = iobVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ChildCompoundOptionSelectUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$1 childCompoundOptionSelectUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$1;
        int i;
        if (continuation instanceof ChildCompoundOptionSelectUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$1) {
            childCompoundOptionSelectUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$1 = (ChildCompoundOptionSelectUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$1) continuation;
            int i2 = childCompoundOptionSelectUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                childCompoundOptionSelectUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = childCompoundOptionSelectUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = childCompoundOptionSelectUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b, this.c);
                    childCompoundOptionSelectUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$1.L$0 = null;
                    childCompoundOptionSelectUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$1.L$1 = null;
                    childCompoundOptionSelectUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$1.L$2 = null;
                    childCompoundOptionSelectUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$1.label = 1;
                    if (this.a.collect(aVar, childCompoundOptionSelectUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$1) == coroutineSingletons) {
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
        childCompoundOptionSelectUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$1 = new ChildCompoundOptionSelectUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$1(this, continuation);
        Object obj2 = childCompoundOptionSelectUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = childCompoundOptionSelectUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
