package com.yandex.go.taxi.order.domain.repositories;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class c0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e0 b;

    public c0(vpr vprVar, e0 e0Var) {
        this.a = vprVar;
        this.b = e0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TaxiOrderHolderRepositoryImpl$mostActiveOrder$$inlined$map$1$2$1 taxiOrderHolderRepositoryImpl$mostActiveOrder$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof TaxiOrderHolderRepositoryImpl$mostActiveOrder$$inlined$map$1$2$1) {
            taxiOrderHolderRepositoryImpl$mostActiveOrder$$inlined$map$1$2$1 = (TaxiOrderHolderRepositoryImpl$mostActiveOrder$$inlined$map$1$2$1) continuation;
            int i2 = taxiOrderHolderRepositoryImpl$mostActiveOrder$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderHolderRepositoryImpl$mostActiveOrder$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = taxiOrderHolderRepositoryImpl$mostActiveOrder$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderHolderRepositoryImpl$mostActiveOrder$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ((Boolean) obj).getClass();
                    Object value = this.b.g.getValue();
                    taxiOrderHolderRepositoryImpl$mostActiveOrder$$inlined$map$1$2$1.L$0 = null;
                    taxiOrderHolderRepositoryImpl$mostActiveOrder$$inlined$map$1$2$1.L$1 = null;
                    taxiOrderHolderRepositoryImpl$mostActiveOrder$$inlined$map$1$2$1.L$2 = null;
                    taxiOrderHolderRepositoryImpl$mostActiveOrder$$inlined$map$1$2$1.L$3 = null;
                    taxiOrderHolderRepositoryImpl$mostActiveOrder$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(value, taxiOrderHolderRepositoryImpl$mostActiveOrder$$inlined$map$1$2$1) == coroutineSingletons) {
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
        taxiOrderHolderRepositoryImpl$mostActiveOrder$$inlined$map$1$2$1 = new TaxiOrderHolderRepositoryImpl$mostActiveOrder$$inlined$map$1$2$1(this, continuation);
        Object obj22 = taxiOrderHolderRepositoryImpl$mostActiveOrder$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderHolderRepositoryImpl$mostActiveOrder$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
