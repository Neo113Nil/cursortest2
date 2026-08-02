package com.yandex.go.address.position_confirmation;

import defpackage.ny61;
import defpackage.rsn;
import defpackage.vpr;
import defpackage.vyb0;
import defpackage.xyb0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ j b;

    public d(vpr vprVar, j jVar) {
        this.a = vprVar;
        this.b = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a7, code lost:
    
        if (r2.emit(r8, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1 pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1;
        int i;
        xyb0 xyb0Var;
        vpr vprVar;
        xyb0 xyb0Var2;
        vpr vprVar2;
        if (continuation instanceof PinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1) {
            pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1 = (PinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1) continuation;
            int i2 = pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    rsn rsnVar = (rsn) obj;
                    xyb0Var = (xyb0) rsnVar.b;
                    boolean z = rsnVar.a instanceof vyb0;
                    vprVar = this.a;
                    if (!z && (xyb0Var instanceof vyb0)) {
                        a aVar = this.b.i;
                        String str = ((vyb0) xyb0Var).e;
                        pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.L$0 = null;
                        pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.L$1 = null;
                        pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.L$2 = null;
                        pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.L$3 = null;
                        pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.L$4 = vprVar;
                        pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.L$5 = null;
                        pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.L$6 = null;
                        pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.L$7 = xyb0Var;
                        pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.label = 1;
                        if (aVar.c(str, pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1) != coroutineSingletons) {
                            xyb0Var2 = xyb0Var;
                            vprVar2 = vprVar;
                        }
                        return coroutineSingletons;
                    }
                    pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.L$0 = null;
                    pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.L$1 = null;
                    pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.L$2 = null;
                    pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.L$3 = null;
                    pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.L$4 = null;
                    pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.L$5 = null;
                    pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.L$6 = null;
                    pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.L$7 = null;
                    pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.label = 2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    xyb0Var2 = (xyb0) pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.L$7;
                    vprVar2 = (vpr) pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                }
                xyb0Var = xyb0Var2;
                vprVar = vprVar2;
                pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.L$0 = null;
                pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.L$1 = null;
                pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.L$2 = null;
                pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.L$3 = null;
                pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.L$4 = null;
                pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.L$5 = null;
                pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.L$6 = null;
                pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.L$7 = null;
                pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.label = 2;
            }
        }
        pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1 = new PinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        xyb0Var = xyb0Var2;
        vprVar = vprVar2;
        pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.L$0 = null;
        pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.L$1 = null;
        pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.L$2 = null;
        pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.L$3 = null;
        pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.L$4 = null;
        pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.L$5 = null;
        pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.L$6 = null;
        pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.L$7 = null;
        pinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$map$1$2$1.label = 2;
    }
}
