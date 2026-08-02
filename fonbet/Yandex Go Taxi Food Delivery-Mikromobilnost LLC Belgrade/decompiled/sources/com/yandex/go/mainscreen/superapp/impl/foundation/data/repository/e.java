package com.yandex.go.mainscreen.superapp.impl.foundation.data.repository;

import defpackage.n900;
import defpackage.ny61;
import defpackage.o900;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;

    public e(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SuperappMainSearchbarInteropRepository$special$$inlined$map$1$2$1 superappMainSearchbarInteropRepository$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SuperappMainSearchbarInteropRepository$special$$inlined$map$1$2$1) {
            superappMainSearchbarInteropRepository$special$$inlined$map$1$2$1 = (SuperappMainSearchbarInteropRepository$special$$inlined$map$1$2$1) continuation;
            int i2 = superappMainSearchbarInteropRepository$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappMainSearchbarInteropRepository$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = superappMainSearchbarInteropRepository$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappMainSearchbarInteropRepository$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Boolean valueOf = Boolean.valueOf(((o900) obj) instanceof n900);
                    superappMainSearchbarInteropRepository$special$$inlined$map$1$2$1.L$0 = null;
                    superappMainSearchbarInteropRepository$special$$inlined$map$1$2$1.L$1 = null;
                    superappMainSearchbarInteropRepository$special$$inlined$map$1$2$1.L$2 = null;
                    superappMainSearchbarInteropRepository$special$$inlined$map$1$2$1.L$3 = null;
                    superappMainSearchbarInteropRepository$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, superappMainSearchbarInteropRepository$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        superappMainSearchbarInteropRepository$special$$inlined$map$1$2$1 = new SuperappMainSearchbarInteropRepository$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = superappMainSearchbarInteropRepository$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappMainSearchbarInteropRepository$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
