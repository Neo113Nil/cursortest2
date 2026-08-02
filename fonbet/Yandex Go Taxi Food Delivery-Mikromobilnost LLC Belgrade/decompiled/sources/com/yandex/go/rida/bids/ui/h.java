package com.yandex.go.rida.bids.ui;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.wr5;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class h implements vpr {
    public final /* synthetic */ vpr a;

    public h(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        BidsScreenKt$ListenExpandUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 bidsScreenKt$ListenExpandUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
        int i;
        if (continuation instanceof BidsScreenKt$ListenExpandUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) {
            bidsScreenKt$ListenExpandUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = (BidsScreenKt$ListenExpandUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) continuation;
            int i2 = bidsScreenKt$ListenExpandUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bidsScreenKt$ListenExpandUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = bidsScreenKt$ListenExpandUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bidsScreenKt$ListenExpandUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (obj instanceof wr5) {
                        bidsScreenKt$ListenExpandUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.L$0 = null;
                        bidsScreenKt$ListenExpandUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.L$1 = null;
                        bidsScreenKt$ListenExpandUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.L$2 = null;
                        bidsScreenKt$ListenExpandUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.L$3 = null;
                        bidsScreenKt$ListenExpandUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = 1;
                        if (this.a.emit(obj, bidsScreenKt$ListenExpandUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) == coroutineSingletons) {
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
        bidsScreenKt$ListenExpandUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = new BidsScreenKt$ListenExpandUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1(this, continuation);
        Object obj22 = bidsScreenKt$ListenExpandUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bidsScreenKt$ListenExpandUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
