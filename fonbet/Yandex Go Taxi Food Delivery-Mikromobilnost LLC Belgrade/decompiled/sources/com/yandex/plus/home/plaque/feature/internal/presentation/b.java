package com.yandex.plus.home.plaque.feature.internal.presentation;

import defpackage.ny61;
import defpackage.roc0;
import defpackage.vpr;
import defpackage.xhc0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
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
        PlaqueViewModel$special$$inlined$mapNotNull$1$2$1 plaqueViewModel$special$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof PlaqueViewModel$special$$inlined$mapNotNull$1$2$1) {
            plaqueViewModel$special$$inlined$mapNotNull$1$2$1 = (PlaqueViewModel$special$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = plaqueViewModel$special$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plaqueViewModel$special$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = plaqueViewModel$special$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plaqueViewModel$special$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    xhc0 xhc0Var = (xhc0) obj;
                    roc0 b = xhc0Var != null ? xhc0Var.b() : null;
                    if (b != null) {
                        plaqueViewModel$special$$inlined$mapNotNull$1$2$1.L$0 = null;
                        plaqueViewModel$special$$inlined$mapNotNull$1$2$1.L$1 = null;
                        plaqueViewModel$special$$inlined$mapNotNull$1$2$1.L$2 = null;
                        plaqueViewModel$special$$inlined$mapNotNull$1$2$1.L$3 = null;
                        plaqueViewModel$special$$inlined$mapNotNull$1$2$1.L$4 = null;
                        plaqueViewModel$special$$inlined$mapNotNull$1$2$1.I$0 = 0;
                        plaqueViewModel$special$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(b, plaqueViewModel$special$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
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
        plaqueViewModel$special$$inlined$mapNotNull$1$2$1 = new PlaqueViewModel$special$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = plaqueViewModel$special$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plaqueViewModel$special$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
