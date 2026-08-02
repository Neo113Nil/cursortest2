package com.yandex.go.taxi.order.provider;

import defpackage.ixx0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class c0 implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.internal.g a;
    public final /* synthetic */ ixx0 b;

    public c0(kotlinx.coroutines.flow.internal.g gVar, ixx0 ixx0Var) {
        this.a = gVar;
        this.b = ixx0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TaxiOnTheWayDataProvider$flow$$inlined$map$1$1 taxiOnTheWayDataProvider$flow$$inlined$map$1$1;
        int i;
        if (continuation instanceof TaxiOnTheWayDataProvider$flow$$inlined$map$1$1) {
            taxiOnTheWayDataProvider$flow$$inlined$map$1$1 = (TaxiOnTheWayDataProvider$flow$$inlined$map$1$1) continuation;
            int i2 = taxiOnTheWayDataProvider$flow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOnTheWayDataProvider$flow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiOnTheWayDataProvider$flow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOnTheWayDataProvider$flow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b0 b0Var = new b0(vprVar, this.b);
                    taxiOnTheWayDataProvider$flow$$inlined$map$1$1.L$0 = null;
                    taxiOnTheWayDataProvider$flow$$inlined$map$1$1.L$1 = null;
                    taxiOnTheWayDataProvider$flow$$inlined$map$1$1.L$2 = null;
                    taxiOnTheWayDataProvider$flow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(b0Var, taxiOnTheWayDataProvider$flow$$inlined$map$1$1) == coroutineSingletons) {
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
        taxiOnTheWayDataProvider$flow$$inlined$map$1$1 = new TaxiOnTheWayDataProvider$flow$$inlined$map$1$1(this, continuation);
        Object obj2 = taxiOnTheWayDataProvider$flow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOnTheWayDataProvider$flow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
