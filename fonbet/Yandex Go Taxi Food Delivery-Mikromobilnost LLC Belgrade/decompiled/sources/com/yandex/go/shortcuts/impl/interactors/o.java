package com.yandex.go.shortcuts.impl.interactors;

import defpackage.a2t;
import defpackage.f2t;
import defpackage.hc00;
import defpackage.ic00;
import defpackage.jl40;
import defpackage.kc00;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class o implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ q b;

    public o(vpr vprVar, q qVar) {
        this.a = vprVar;
        this.b = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ProductsPointsInteractorImpl$filterNeedRequestProducts$$inlined$filter$1$2$1 productsPointsInteractorImpl$filterNeedRequestProducts$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof ProductsPointsInteractorImpl$filterNeedRequestProducts$$inlined$filter$1$2$1) {
            productsPointsInteractorImpl$filterNeedRequestProducts$$inlined$filter$1$2$1 = (ProductsPointsInteractorImpl$filterNeedRequestProducts$$inlined$filter$1$2$1) continuation;
            int i2 = productsPointsInteractorImpl$filterNeedRequestProducts$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                productsPointsInteractorImpl$filterNeedRequestProducts$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = productsPointsInteractorImpl$filterNeedRequestProducts$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = productsPointsInteractorImpl$filterNeedRequestProducts$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    q qVar = this.b;
                    ic00 ic00Var = ((kc00) qVar.f).a;
                    ic00Var.getClass();
                    if (!(ic00Var instanceof hc00) || qVar.e.a(false) || (jl40.l(((f2t) qVar.i).g.a.getValue(), a2t.a) && ((Boolean) qVar.h.a.b()).booleanValue())) {
                        productsPointsInteractorImpl$filterNeedRequestProducts$$inlined$filter$1$2$1.L$0 = null;
                        productsPointsInteractorImpl$filterNeedRequestProducts$$inlined$filter$1$2$1.L$1 = null;
                        productsPointsInteractorImpl$filterNeedRequestProducts$$inlined$filter$1$2$1.L$2 = null;
                        productsPointsInteractorImpl$filterNeedRequestProducts$$inlined$filter$1$2$1.L$3 = null;
                        productsPointsInteractorImpl$filterNeedRequestProducts$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, productsPointsInteractorImpl$filterNeedRequestProducts$$inlined$filter$1$2$1) == coroutineSingletons) {
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
        productsPointsInteractorImpl$filterNeedRequestProducts$$inlined$filter$1$2$1 = new ProductsPointsInteractorImpl$filterNeedRequestProducts$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = productsPointsInteractorImpl$filterNeedRequestProducts$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = productsPointsInteractorImpl$filterNeedRequestProducts$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
