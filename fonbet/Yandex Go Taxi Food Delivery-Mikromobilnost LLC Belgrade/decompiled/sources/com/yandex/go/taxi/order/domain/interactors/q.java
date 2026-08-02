package com.yandex.go.taxi.order.domain.interactors;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class q implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ s b;

    public q(vpr vprVar, s sVar) {
        this.a = vprVar;
        this.b = sVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
    
        if (r7.emit(r9, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TaxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1 taxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof TaxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1) {
            taxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1 = (TaxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1) continuation;
            int i2 = taxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = taxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    taxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1.L$0 = null;
                    taxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1.L$1 = null;
                    taxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1.L$2 = null;
                    taxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    taxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1.L$4 = vprVar2;
                    taxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1.L$5 = null;
                    taxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1.L$6 = null;
                    taxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1.label = 1;
                    Object a = this.b.a((TaxiOrder) obj, taxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1);
                    if (a != coroutineSingletons) {
                        obj2 = a;
                        vprVar = vprVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                vprVar = (vpr) taxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                taxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1.L$0 = null;
                taxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1.L$1 = null;
                taxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1.L$2 = null;
                taxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1.L$3 = null;
                taxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1.L$4 = null;
                taxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1.L$5 = null;
                taxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1.L$6 = null;
                taxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1.label = 2;
            }
        }
        taxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1 = new TaxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = taxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        taxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1.L$0 = null;
        taxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1.L$1 = null;
        taxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1.L$2 = null;
        taxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1.L$3 = null;
        taxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1.L$4 = null;
        taxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1.L$5 = null;
        taxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1.L$6 = null;
        taxiOrderCarImageInteractor$carImageFlow$$inlined$map$1$2$1.label = 2;
    }
}
