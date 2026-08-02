package com.yandex.plus.treasury.impl;

import defpackage.eqd0;
import defpackage.fh51;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.ug51;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PlusYbSdkTreasuryAdapter$special$$inlined$mapNotNull$1$2$1 plusYbSdkTreasuryAdapter$special$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof PlusYbSdkTreasuryAdapter$special$$inlined$mapNotNull$1$2$1) {
            plusYbSdkTreasuryAdapter$special$$inlined$mapNotNull$1$2$1 = (PlusYbSdkTreasuryAdapter$special$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = plusYbSdkTreasuryAdapter$special$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusYbSdkTreasuryAdapter$special$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = plusYbSdkTreasuryAdapter$special$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusYbSdkTreasuryAdapter$special$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    eqd0 eqd0Var = jl40.l((fh51) obj, ug51.b) ? eqd0.a : null;
                    if (eqd0Var != null) {
                        plusYbSdkTreasuryAdapter$special$$inlined$mapNotNull$1$2$1.L$0 = null;
                        plusYbSdkTreasuryAdapter$special$$inlined$mapNotNull$1$2$1.L$1 = null;
                        plusYbSdkTreasuryAdapter$special$$inlined$mapNotNull$1$2$1.L$2 = null;
                        plusYbSdkTreasuryAdapter$special$$inlined$mapNotNull$1$2$1.L$3 = null;
                        plusYbSdkTreasuryAdapter$special$$inlined$mapNotNull$1$2$1.L$4 = null;
                        plusYbSdkTreasuryAdapter$special$$inlined$mapNotNull$1$2$1.I$0 = 0;
                        plusYbSdkTreasuryAdapter$special$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(eqd0Var, plusYbSdkTreasuryAdapter$special$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
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
        plusYbSdkTreasuryAdapter$special$$inlined$mapNotNull$1$2$1 = new PlusYbSdkTreasuryAdapter$special$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = plusYbSdkTreasuryAdapter$special$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusYbSdkTreasuryAdapter$special$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
