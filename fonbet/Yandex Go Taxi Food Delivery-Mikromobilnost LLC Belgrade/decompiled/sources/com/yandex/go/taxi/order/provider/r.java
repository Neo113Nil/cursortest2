package com.yandex.go.taxi.order.provider;

import defpackage.da90;
import defpackage.jqr;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class r implements tpr {
    public final /* synthetic */ jqr a;
    public final /* synthetic */ da90 b;

    public r(jqr jqrVar, da90 da90Var) {
        this.a = jqrVar;
        this.b = da90Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        PaidOptionDiscountProvider$taxiOrderWithPaidOptionDiscountFlow$$inlined$filter$1$1 paidOptionDiscountProvider$taxiOrderWithPaidOptionDiscountFlow$$inlined$filter$1$1;
        int i;
        if (continuation instanceof PaidOptionDiscountProvider$taxiOrderWithPaidOptionDiscountFlow$$inlined$filter$1$1) {
            paidOptionDiscountProvider$taxiOrderWithPaidOptionDiscountFlow$$inlined$filter$1$1 = (PaidOptionDiscountProvider$taxiOrderWithPaidOptionDiscountFlow$$inlined$filter$1$1) continuation;
            int i2 = paidOptionDiscountProvider$taxiOrderWithPaidOptionDiscountFlow$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paidOptionDiscountProvider$taxiOrderWithPaidOptionDiscountFlow$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paidOptionDiscountProvider$taxiOrderWithPaidOptionDiscountFlow$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paidOptionDiscountProvider$taxiOrderWithPaidOptionDiscountFlow$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    q qVar = new q(vprVar, this.b);
                    paidOptionDiscountProvider$taxiOrderWithPaidOptionDiscountFlow$$inlined$filter$1$1.L$0 = null;
                    paidOptionDiscountProvider$taxiOrderWithPaidOptionDiscountFlow$$inlined$filter$1$1.L$1 = null;
                    paidOptionDiscountProvider$taxiOrderWithPaidOptionDiscountFlow$$inlined$filter$1$1.L$2 = null;
                    paidOptionDiscountProvider$taxiOrderWithPaidOptionDiscountFlow$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(qVar, paidOptionDiscountProvider$taxiOrderWithPaidOptionDiscountFlow$$inlined$filter$1$1) == coroutineSingletons) {
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
        paidOptionDiscountProvider$taxiOrderWithPaidOptionDiscountFlow$$inlined$filter$1$1 = new PaidOptionDiscountProvider$taxiOrderWithPaidOptionDiscountFlow$$inlined$filter$1$1(this, continuation);
        Object obj2 = paidOptionDiscountProvider$taxiOrderWithPaidOptionDiscountFlow$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paidOptionDiscountProvider$taxiOrderWithPaidOptionDiscountFlow$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
