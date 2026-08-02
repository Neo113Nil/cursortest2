package com.yandex.go.overdraft.ui;

import defpackage.gci0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class e implements tpr {
    public final /* synthetic */ gci0 a;
    public final /* synthetic */ g b;

    public e(gci0 gci0Var, g gVar) {
        this.a = gci0Var;
        this.b = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        OverdraftStateBarControllerImpl$getDebtStatusesPaneChangedFlow$$inlined$map$1$1 overdraftStateBarControllerImpl$getDebtStatusesPaneChangedFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof OverdraftStateBarControllerImpl$getDebtStatusesPaneChangedFlow$$inlined$map$1$1) {
            overdraftStateBarControllerImpl$getDebtStatusesPaneChangedFlow$$inlined$map$1$1 = (OverdraftStateBarControllerImpl$getDebtStatusesPaneChangedFlow$$inlined$map$1$1) continuation;
            int i2 = overdraftStateBarControllerImpl$getDebtStatusesPaneChangedFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                overdraftStateBarControllerImpl$getDebtStatusesPaneChangedFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = overdraftStateBarControllerImpl$getDebtStatusesPaneChangedFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = overdraftStateBarControllerImpl$getDebtStatusesPaneChangedFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar, this.b);
                    overdraftStateBarControllerImpl$getDebtStatusesPaneChangedFlow$$inlined$map$1$1.L$0 = null;
                    overdraftStateBarControllerImpl$getDebtStatusesPaneChangedFlow$$inlined$map$1$1.L$1 = null;
                    overdraftStateBarControllerImpl$getDebtStatusesPaneChangedFlow$$inlined$map$1$1.L$2 = null;
                    overdraftStateBarControllerImpl$getDebtStatusesPaneChangedFlow$$inlined$map$1$1.label = 1;
                    if (this.a.a.collect(dVar, overdraftStateBarControllerImpl$getDebtStatusesPaneChangedFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        overdraftStateBarControllerImpl$getDebtStatusesPaneChangedFlow$$inlined$map$1$1 = new OverdraftStateBarControllerImpl$getDebtStatusesPaneChangedFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = overdraftStateBarControllerImpl$getDebtStatusesPaneChangedFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = overdraftStateBarControllerImpl$getDebtStatusesPaneChangedFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
