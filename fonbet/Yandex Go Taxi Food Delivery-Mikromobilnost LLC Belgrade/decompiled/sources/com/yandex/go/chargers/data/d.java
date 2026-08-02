package com.yandex.go.chargers.data;

import defpackage.gci0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class d implements tpr {
    public final /* synthetic */ gci0 a;
    public final /* synthetic */ e b;

    public d(gci0 gci0Var, e eVar) {
        this.a = gci0Var;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ChargersActiveOrdersStateRepository$special$$inlined$map$1$1 chargersActiveOrdersStateRepository$special$$inlined$map$1$1;
        int i;
        if (continuation instanceof ChargersActiveOrdersStateRepository$special$$inlined$map$1$1) {
            chargersActiveOrdersStateRepository$special$$inlined$map$1$1 = (ChargersActiveOrdersStateRepository$special$$inlined$map$1$1) continuation;
            int i2 = chargersActiveOrdersStateRepository$special$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersActiveOrdersStateRepository$special$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersActiveOrdersStateRepository$special$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersActiveOrdersStateRepository$special$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b);
                    chargersActiveOrdersStateRepository$special$$inlined$map$1$1.L$0 = null;
                    chargersActiveOrdersStateRepository$special$$inlined$map$1$1.L$1 = null;
                    chargersActiveOrdersStateRepository$special$$inlined$map$1$1.L$2 = null;
                    chargersActiveOrdersStateRepository$special$$inlined$map$1$1.label = 1;
                    if (this.a.a.collect(cVar, chargersActiveOrdersStateRepository$special$$inlined$map$1$1) == coroutineSingletons) {
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
        chargersActiveOrdersStateRepository$special$$inlined$map$1$1 = new ChargersActiveOrdersStateRepository$special$$inlined$map$1$1(this, continuation);
        Object obj2 = chargersActiveOrdersStateRepository$special$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersActiveOrdersStateRepository$special$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
