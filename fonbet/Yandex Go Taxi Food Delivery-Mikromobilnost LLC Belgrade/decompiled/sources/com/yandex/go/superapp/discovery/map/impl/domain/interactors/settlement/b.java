package com.yandex.go.superapp.discovery.map.impl.domain.interactors.settlement;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.z6w0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SuperAppSettlementFocusInteractor$awaitCachedBbox$bbox$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 superAppSettlementFocusInteractor$awaitCachedBbox$bbox$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
        int i;
        if (continuation instanceof SuperAppSettlementFocusInteractor$awaitCachedBbox$bbox$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) {
            superAppSettlementFocusInteractor$awaitCachedBbox$bbox$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = (SuperAppSettlementFocusInteractor$awaitCachedBbox$bbox$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) continuation;
            int i2 = superAppSettlementFocusInteractor$awaitCachedBbox$bbox$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppSettlementFocusInteractor$awaitCachedBbox$bbox$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = superAppSettlementFocusInteractor$awaitCachedBbox$bbox$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppSettlementFocusInteractor$awaitCachedBbox$bbox$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (obj instanceof z6w0) {
                        superAppSettlementFocusInteractor$awaitCachedBbox$bbox$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.L$0 = null;
                        superAppSettlementFocusInteractor$awaitCachedBbox$bbox$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.L$1 = null;
                        superAppSettlementFocusInteractor$awaitCachedBbox$bbox$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.L$2 = null;
                        superAppSettlementFocusInteractor$awaitCachedBbox$bbox$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.L$3 = null;
                        superAppSettlementFocusInteractor$awaitCachedBbox$bbox$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = 1;
                        if (this.a.emit(obj, superAppSettlementFocusInteractor$awaitCachedBbox$bbox$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        superAppSettlementFocusInteractor$awaitCachedBbox$bbox$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = new SuperAppSettlementFocusInteractor$awaitCachedBbox$bbox$1$invokeSuspend$$inlined$filterIsInstance$1$2$1(this, continuation);
        Object obj22 = superAppSettlementFocusInteractor$awaitCachedBbox$bbox$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppSettlementFocusInteractor$awaitCachedBbox$bbox$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
