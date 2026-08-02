package com.yandex.go.flex.main_screen.interactors;

import defpackage.acw0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.y6i0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class r implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ t b;

    public r(vpr vprVar, t tVar) {
        this.a = vprVar;
        this.b = tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        StickyStateFractionInteractorImpl$progressFractionFlow$1$invokeSuspend$$inlined$map$1$2$1 stickyStateFractionInteractorImpl$progressFractionFlow$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof StickyStateFractionInteractorImpl$progressFractionFlow$1$invokeSuspend$$inlined$map$1$2$1) {
            stickyStateFractionInteractorImpl$progressFractionFlow$1$invokeSuspend$$inlined$map$1$2$1 = (StickyStateFractionInteractorImpl$progressFractionFlow$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = stickyStateFractionInteractorImpl$progressFractionFlow$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stickyStateFractionInteractorImpl$progressFractionFlow$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = stickyStateFractionInteractorImpl$progressFractionFlow$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stickyStateFractionInteractorImpl$progressFractionFlow$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    int intValue = ((Number) obj).intValue();
                    t tVar = this.b;
                    if (((Number) kotlinx.coroutines.flow.e.d(((acw0) tVar.d).c).a.getValue()).floatValue() != 0.0f) {
                        intValue -= tVar.c.b;
                    }
                    Float f = new Float(y6i0.c(intValue / 200.0f, 0.0f, 1.0f));
                    stickyStateFractionInteractorImpl$progressFractionFlow$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    stickyStateFractionInteractorImpl$progressFractionFlow$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    stickyStateFractionInteractorImpl$progressFractionFlow$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    stickyStateFractionInteractorImpl$progressFractionFlow$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    stickyStateFractionInteractorImpl$progressFractionFlow$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(f, stickyStateFractionInteractorImpl$progressFractionFlow$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        stickyStateFractionInteractorImpl$progressFractionFlow$1$invokeSuspend$$inlined$map$1$2$1 = new StickyStateFractionInteractorImpl$progressFractionFlow$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = stickyStateFractionInteractorImpl$progressFractionFlow$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stickyStateFractionInteractorImpl$progressFractionFlow$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
