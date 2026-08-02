package com.yandex.go.cartech.dynamic.domain;

import defpackage.mo21;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.tankerapp.go.sdk.location.CartechPosition;

/* loaded from: classes12.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;

    public e(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TankerLocationAdapterImpl$special$$inlined$map$1$2$1 tankerLocationAdapterImpl$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof TankerLocationAdapterImpl$special$$inlined$map$1$2$1) {
            tankerLocationAdapterImpl$special$$inlined$map$1$2$1 = (TankerLocationAdapterImpl$special$$inlined$map$1$2$1) continuation;
            int i2 = tankerLocationAdapterImpl$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tankerLocationAdapterImpl$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = tankerLocationAdapterImpl$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tankerLocationAdapterImpl$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    mo21 mo21Var = (mo21) obj;
                    CartechPosition cartechPosition = new CartechPosition(mo21Var.a, mo21Var.b, mo21Var.c, mo21Var.g);
                    tankerLocationAdapterImpl$special$$inlined$map$1$2$1.L$0 = null;
                    tankerLocationAdapterImpl$special$$inlined$map$1$2$1.L$1 = null;
                    tankerLocationAdapterImpl$special$$inlined$map$1$2$1.L$2 = null;
                    tankerLocationAdapterImpl$special$$inlined$map$1$2$1.L$3 = null;
                    tankerLocationAdapterImpl$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(cartechPosition, tankerLocationAdapterImpl$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        tankerLocationAdapterImpl$special$$inlined$map$1$2$1 = new TankerLocationAdapterImpl$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = tankerLocationAdapterImpl$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tankerLocationAdapterImpl$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
