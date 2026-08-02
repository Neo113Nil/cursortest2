package com.yandex.go.taxi.cars.preorder.source;

import defpackage.c09;
import defpackage.jse;
import defpackage.ny61;
import defpackage.tje;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c09 b;

    public b(vpr vprVar, c09 c09Var) {
        this.a = vprVar;
        this.b = c09Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        if (r8.emit(r10, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        if (r10 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CarsOnMapPresenter$startAnimation$$inlined$map$1$2$1 carsOnMapPresenter$startAnimation$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof CarsOnMapPresenter$startAnimation$$inlined$map$1$2$1) {
            carsOnMapPresenter$startAnimation$$inlined$map$1$2$1 = (CarsOnMapPresenter$startAnimation$$inlined$map$1$2$1) continuation;
            int i2 = carsOnMapPresenter$startAnimation$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                carsOnMapPresenter$startAnimation$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = carsOnMapPresenter$startAnimation$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = carsOnMapPresenter$startAnimation$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    long longValue = ((Number) obj).longValue();
                    c09 c09Var = this.b;
                    jse jseVar = c09Var.z;
                    CarsOnMapPresenter$startAnimation$2$1 carsOnMapPresenter$startAnimation$2$1 = new CarsOnMapPresenter$startAnimation$2$1(c09Var, longValue, null);
                    carsOnMapPresenter$startAnimation$$inlined$map$1$2$1.L$0 = null;
                    carsOnMapPresenter$startAnimation$$inlined$map$1$2$1.L$1 = null;
                    carsOnMapPresenter$startAnimation$$inlined$map$1$2$1.L$2 = null;
                    carsOnMapPresenter$startAnimation$$inlined$map$1$2$1.L$3 = null;
                    vprVar = this.a;
                    carsOnMapPresenter$startAnimation$$inlined$map$1$2$1.L$4 = vprVar;
                    carsOnMapPresenter$startAnimation$$inlined$map$1$2$1.L$5 = null;
                    carsOnMapPresenter$startAnimation$$inlined$map$1$2$1.J$0 = longValue;
                    carsOnMapPresenter$startAnimation$$inlined$map$1$2$1.label = 1;
                    obj2 = tje.k0(jseVar, carsOnMapPresenter$startAnimation$2$1, carsOnMapPresenter$startAnimation$$inlined$map$1$2$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vprVar = (vpr) carsOnMapPresenter$startAnimation$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                }
                carsOnMapPresenter$startAnimation$$inlined$map$1$2$1.L$0 = null;
                carsOnMapPresenter$startAnimation$$inlined$map$1$2$1.L$1 = null;
                carsOnMapPresenter$startAnimation$$inlined$map$1$2$1.L$2 = null;
                carsOnMapPresenter$startAnimation$$inlined$map$1$2$1.L$3 = null;
                carsOnMapPresenter$startAnimation$$inlined$map$1$2$1.L$4 = null;
                carsOnMapPresenter$startAnimation$$inlined$map$1$2$1.L$5 = null;
                carsOnMapPresenter$startAnimation$$inlined$map$1$2$1.label = 2;
            }
        }
        carsOnMapPresenter$startAnimation$$inlined$map$1$2$1 = new CarsOnMapPresenter$startAnimation$$inlined$map$1$2$1(this, continuation);
        Object obj22 = carsOnMapPresenter$startAnimation$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = carsOnMapPresenter$startAnimation$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        carsOnMapPresenter$startAnimation$$inlined$map$1$2$1.L$0 = null;
        carsOnMapPresenter$startAnimation$$inlined$map$1$2$1.L$1 = null;
        carsOnMapPresenter$startAnimation$$inlined$map$1$2$1.L$2 = null;
        carsOnMapPresenter$startAnimation$$inlined$map$1$2$1.L$3 = null;
        carsOnMapPresenter$startAnimation$$inlined$map$1$2$1.L$4 = null;
        carsOnMapPresenter$startAnimation$$inlined$map$1$2$1.L$5 = null;
        carsOnMapPresenter$startAnimation$$inlined$map$1$2$1.label = 2;
    }
}
