package com.yandex.plus.home.plaque.feature.internal.presentation;

import defpackage.boc0;
import defpackage.e3n;
import defpackage.hqr;
import defpackage.kp50;
import defpackage.ny61;
import defpackage.o430;
import defpackage.roc0;
import defpackage.urc0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.time.DurationUnit;

/* loaded from: classes8.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar, d dVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PlaqueViewModel$special$$inlined$mapWithPrevious$1$2$1 plaqueViewModel$special$$inlined$mapWithPrevious$1$2$1;
        int i;
        long j;
        if (continuation instanceof PlaqueViewModel$special$$inlined$mapWithPrevious$1$2$1) {
            plaqueViewModel$special$$inlined$mapWithPrevious$1$2$1 = (PlaqueViewModel$special$$inlined$mapWithPrevious$1$2$1) continuation;
            int i2 = plaqueViewModel$special$$inlined$mapWithPrevious$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plaqueViewModel$special$$inlined$mapWithPrevious$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = plaqueViewModel$special$$inlined$mapWithPrevious$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plaqueViewModel$special$$inlined$mapWithPrevious$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    hqr hqrVar = (hqr) obj;
                    Pair pair = (Pair) hqrVar.a;
                    Pair pair2 = (Pair) hqrVar.b;
                    roc0 roc0Var = pair != null ? (roc0) pair.c() : null;
                    roc0 roc0Var2 = (roc0) pair2.getFirst();
                    boc0 boc0Var = (boc0) pair2.getSecond();
                    roc0 roc0Var3 = new roc0(roc0Var2.a, d.b(roc0Var2.b, boc0Var.c, boc0Var.d), roc0Var2.c, roc0Var2.d, roc0Var2.e, roc0Var2.f);
                    if (roc0Var == null || roc0Var.b.a(roc0Var2.b)) {
                        o430 o430Var = e3n.b;
                        j = 0;
                    } else {
                        o430 o430Var2 = e3n.b;
                        j = kp50.U(300, DurationUnit.MILLISECONDS);
                    }
                    urc0 urc0Var = new urc0(roc0Var3, j);
                    plaqueViewModel$special$$inlined$mapWithPrevious$1$2$1.L$0 = null;
                    plaqueViewModel$special$$inlined$mapWithPrevious$1$2$1.L$1 = null;
                    plaqueViewModel$special$$inlined$mapWithPrevious$1$2$1.L$2 = null;
                    plaqueViewModel$special$$inlined$mapWithPrevious$1$2$1.L$3 = null;
                    plaqueViewModel$special$$inlined$mapWithPrevious$1$2$1.I$0 = 0;
                    plaqueViewModel$special$$inlined$mapWithPrevious$1$2$1.label = 1;
                    if (this.a.emit(urc0Var, plaqueViewModel$special$$inlined$mapWithPrevious$1$2$1) == coroutineSingletons) {
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
        plaqueViewModel$special$$inlined$mapWithPrevious$1$2$1 = new PlaqueViewModel$special$$inlined$mapWithPrevious$1$2$1(this, continuation);
        Object obj22 = plaqueViewModel$special$$inlined$mapWithPrevious$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plaqueViewModel$special$$inlined$mapWithPrevious$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
