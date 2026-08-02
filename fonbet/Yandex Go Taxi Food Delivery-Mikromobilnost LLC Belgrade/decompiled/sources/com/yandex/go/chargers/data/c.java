package com.yandex.go.chargers.data;

import defpackage.ny61;
import defpackage.rl9;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;

    public c(vpr vprVar, e eVar) {
        this.a = vprVar;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChargersActiveOrdersStateRepository$special$$inlined$map$1$2$1 chargersActiveOrdersStateRepository$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ChargersActiveOrdersStateRepository$special$$inlined$map$1$2$1) {
            chargersActiveOrdersStateRepository$special$$inlined$map$1$2$1 = (ChargersActiveOrdersStateRepository$special$$inlined$map$1$2$1) continuation;
            int i2 = chargersActiveOrdersStateRepository$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersActiveOrdersStateRepository$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = chargersActiveOrdersStateRepository$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersActiveOrdersStateRepository$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = ((rl9) obj).a;
                    this.b.getClass();
                    ArrayList a = e.a(list);
                    chargersActiveOrdersStateRepository$special$$inlined$map$1$2$1.L$0 = null;
                    chargersActiveOrdersStateRepository$special$$inlined$map$1$2$1.L$1 = null;
                    chargersActiveOrdersStateRepository$special$$inlined$map$1$2$1.L$2 = null;
                    chargersActiveOrdersStateRepository$special$$inlined$map$1$2$1.L$3 = null;
                    chargersActiveOrdersStateRepository$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(a, chargersActiveOrdersStateRepository$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        chargersActiveOrdersStateRepository$special$$inlined$map$1$2$1 = new ChargersActiveOrdersStateRepository$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = chargersActiveOrdersStateRepository$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersActiveOrdersStateRepository$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
