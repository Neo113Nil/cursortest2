package com.yandex.passport.internal.ui.sloth.ebs;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class a1 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ com.arkivanov.mvikotlin.extensions.coroutines.a b;
    public final /* synthetic */ b1 c;

    public a1(vpr vprVar, com.arkivanov.mvikotlin.extensions.coroutines.a aVar, b1 b1Var) {
        this.a = vprVar;
        this.b = aVar;
        this.c = b1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        BiometricVerificationViewModel$special$$inlined$mapStateful$2$2$1 biometricVerificationViewModel$special$$inlined$mapStateful$2$2$1;
        int i;
        if (continuation instanceof BiometricVerificationViewModel$special$$inlined$mapStateful$2$2$1) {
            biometricVerificationViewModel$special$$inlined$mapStateful$2$2$1 = (BiometricVerificationViewModel$special$$inlined$mapStateful$2$2$1) continuation;
            int i2 = biometricVerificationViewModel$special$$inlined$mapStateful$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                biometricVerificationViewModel$special$$inlined$mapStateful$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = biometricVerificationViewModel$special$$inlined$mapStateful$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = biometricVerificationViewModel$special$$inlined$mapStateful$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    BiometricVerificationViewModel$State biometricVerificationViewModel$State = (BiometricVerificationViewModel$State) this.b.getValue();
                    this.c.w.a("KEY_EBS_STATE", biometricVerificationViewModel$State);
                    biometricVerificationViewModel$special$$inlined$mapStateful$2$2$1.label = 1;
                    if (this.a.emit(biometricVerificationViewModel$State, biometricVerificationViewModel$special$$inlined$mapStateful$2$2$1) == coroutineSingletons) {
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
        biometricVerificationViewModel$special$$inlined$mapStateful$2$2$1 = new BiometricVerificationViewModel$special$$inlined$mapStateful$2$2$1(this, continuation);
        Object obj22 = biometricVerificationViewModel$special$$inlined$mapStateful$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = biometricVerificationViewModel$special$$inlined$mapStateful$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
