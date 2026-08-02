package com.yandex.go.rida.bids.ui;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class g implements tpr {
    public final /* synthetic */ tpr a;

    public g(tpr tprVar) {
        this.a = tprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        BidsScreenKt$ListenCollapseUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$1 bidsScreenKt$ListenCollapseUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$1;
        int i;
        if (continuation instanceof BidsScreenKt$ListenCollapseUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$1) {
            bidsScreenKt$ListenCollapseUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$1 = (BidsScreenKt$ListenCollapseUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$1) continuation;
            int i2 = bidsScreenKt$ListenCollapseUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bidsScreenKt$ListenCollapseUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bidsScreenKt$ListenCollapseUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bidsScreenKt$ListenCollapseUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f fVar = new f(vprVar);
                    bidsScreenKt$ListenCollapseUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$1.L$0 = null;
                    bidsScreenKt$ListenCollapseUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$1.L$1 = null;
                    bidsScreenKt$ListenCollapseUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$1.L$2 = null;
                    bidsScreenKt$ListenCollapseUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$1.label = 1;
                    if (this.a.collect(fVar, bidsScreenKt$ListenCollapseUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$1) == coroutineSingletons) {
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
        bidsScreenKt$ListenCollapseUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$1 = new BidsScreenKt$ListenCollapseUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$1(this, continuation);
        Object obj2 = bidsScreenKt$ListenCollapseUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bidsScreenKt$ListenCollapseUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
