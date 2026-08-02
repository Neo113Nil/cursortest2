package com.yandex.go.yb.data;

import defpackage.ch51;
import defpackage.fh51;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.ug51;
import defpackage.vpr;
import defpackage.wr51;
import defpackage.xr51;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class o implements vpr {
    public final /* synthetic */ vpr a;

    public o(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        YbSdkWrapper$getYbEventFlow$$inlined$mapNotNull$1$2$1 ybSdkWrapper$getYbEventFlow$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof YbSdkWrapper$getYbEventFlow$$inlined$mapNotNull$1$2$1) {
            ybSdkWrapper$getYbEventFlow$$inlined$mapNotNull$1$2$1 = (YbSdkWrapper$getYbEventFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = ybSdkWrapper$getYbEventFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybSdkWrapper$getYbEventFlow$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = ybSdkWrapper$getYbEventFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybSdkWrapper$getYbEventFlow$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    fh51 fh51Var = (fh51) obj;
                    Object obj3 = jl40.l(fh51Var, ug51.b) ? xr51.a : fh51Var instanceof ch51 ? wr51.a : null;
                    if (obj3 != null) {
                        ybSdkWrapper$getYbEventFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                        ybSdkWrapper$getYbEventFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                        ybSdkWrapper$getYbEventFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                        ybSdkWrapper$getYbEventFlow$$inlined$mapNotNull$1$2$1.L$3 = null;
                        ybSdkWrapper$getYbEventFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                        ybSdkWrapper$getYbEventFlow$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(obj3, ybSdkWrapper$getYbEventFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
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
        ybSdkWrapper$getYbEventFlow$$inlined$mapNotNull$1$2$1 = new YbSdkWrapper$getYbEventFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = ybSdkWrapper$getYbEventFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybSdkWrapper$getYbEventFlow$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
