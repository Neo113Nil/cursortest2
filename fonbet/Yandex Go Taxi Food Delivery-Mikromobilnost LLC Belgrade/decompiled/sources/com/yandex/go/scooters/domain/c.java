package com.yandex.go.scooters.domain;

import defpackage.fk5;
import defpackage.jl40;
import defpackage.kgx;
import defpackage.ny61;
import defpackage.qme0;
import defpackage.qwo0;
import defpackage.ukn0;
import defpackage.v4r0;
import defpackage.yun0;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class c {
    public final qwo0 a;
    public final ukn0 b;
    public final yun0 c;

    public c(qwo0 qwo0Var, ukn0 ukn0Var, yun0 yun0Var) {
        this.a = qwo0Var;
        this.b = ukn0Var;
        this.c = yun0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b5, code lost:
    
        if (((java.util.Set) r6.c.getValue(r6, defpackage.qwo0.B[1])).contains(r7) != false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum a(String str, ContinuationImpl continuationImpl) {
        ScootersBeginnerInteractor$whatToShow$1 scootersBeginnerInteractor$whatToShow$1;
        int i;
        fk5 fk5Var;
        if (continuationImpl instanceof ScootersBeginnerInteractor$whatToShow$1) {
            scootersBeginnerInteractor$whatToShow$1 = (ScootersBeginnerInteractor$whatToShow$1) continuationImpl;
            int i2 = scootersBeginnerInteractor$whatToShow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersBeginnerInteractor$whatToShow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersBeginnerInteractor$whatToShow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersBeginnerInteractor$whatToShow$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersBeginnerInteractor$whatToShow$1.L$0 = str;
                    scootersBeginnerInteractor$whatToShow$1.label = 1;
                    obj = this.b.a.b(scootersBeginnerInteractor$whatToShow$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) scootersBeginnerInteractor$whatToShow$1.L$0;
                    kotlin.b.b(obj);
                }
                fk5Var = ((ru.yandex.taxi.scooters.experiments.g0) obj).i;
                qwo0 qwo0Var = this.a;
                boolean z2 = fk5Var == null && fk5Var.b && !((Set) qwo0Var.d.getValue(qwo0Var, qwo0.B[2])).contains(str);
                if (fk5Var != null && fk5Var.a) {
                    if (jl40.l(str, "default_onboarding")) {
                        qme0 qme0Var = qwo0Var.b;
                        kgx[] kgxVarArr = qwo0.B;
                        if (((Boolean) qme0Var.getValue(qwo0Var, kgxVarArr[0])).booleanValue()) {
                            qwo0Var.c.setValue(qwo0Var, kgxVarArr[1], v4r0.i((Set) qwo0Var.c.getValue(qwo0Var, kgxVarArr[1]), "default_onboarding"));
                            qwo0Var.b.setValue(qwo0Var, kgxVarArr[0], Boolean.FALSE);
                        }
                    }
                }
                z = false;
                return (z2 || !z) ? !z2 ? ScootersBeginnerInteractor$ShowForBeginner.SHOW_ONBOARDING : z ? ScootersBeginnerInteractor$ShowForBeginner.SHOW_AGREEMENT : ScootersBeginnerInteractor$ShowForBeginner.NOTHING : ScootersBeginnerInteractor$ShowForBeginner.SHOW_ONBOARDING_AND_AGREEMENT;
            }
        }
        scootersBeginnerInteractor$whatToShow$1 = new ScootersBeginnerInteractor$whatToShow$1(this, continuationImpl);
        Object obj2 = scootersBeginnerInteractor$whatToShow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersBeginnerInteractor$whatToShow$1.label;
        boolean z3 = true;
        if (i != 0) {
        }
        fk5Var = ((ru.yandex.taxi.scooters.experiments.g0) obj2).i;
        qwo0 qwo0Var2 = this.a;
        if (fk5Var == null) {
        }
        if (fk5Var != null) {
            if (jl40.l(str, "default_onboarding")) {
            }
        }
        z3 = false;
        if (z2) {
        }
    }
}
