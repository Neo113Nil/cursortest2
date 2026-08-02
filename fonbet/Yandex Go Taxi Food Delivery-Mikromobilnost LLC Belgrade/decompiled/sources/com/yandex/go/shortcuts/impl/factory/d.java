package com.yandex.go.shortcuts.impl.factory;

import defpackage.mth;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class d implements tpr {
    public final /* synthetic */ mth a;
    public final /* synthetic */ e b;
    public final /* synthetic */ boolean c;

    public d(mth mthVar, e eVar, boolean z) {
        this.a = mthVar;
        this.b = eVar;
        this.c = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ProductsParamsChangesFactory$createParamsOnRouteChange$$inlined$mapNotNull$1$1 productsParamsChangesFactory$createParamsOnRouteChange$$inlined$mapNotNull$1$1;
        int i;
        if (continuation instanceof ProductsParamsChangesFactory$createParamsOnRouteChange$$inlined$mapNotNull$1$1) {
            productsParamsChangesFactory$createParamsOnRouteChange$$inlined$mapNotNull$1$1 = (ProductsParamsChangesFactory$createParamsOnRouteChange$$inlined$mapNotNull$1$1) continuation;
            int i2 = productsParamsChangesFactory$createParamsOnRouteChange$$inlined$mapNotNull$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                productsParamsChangesFactory$createParamsOnRouteChange$$inlined$mapNotNull$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = productsParamsChangesFactory$createParamsOnRouteChange$$inlined$mapNotNull$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = productsParamsChangesFactory$createParamsOnRouteChange$$inlined$mapNotNull$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b, this.c);
                    productsParamsChangesFactory$createParamsOnRouteChange$$inlined$mapNotNull$1$1.L$0 = null;
                    productsParamsChangesFactory$createParamsOnRouteChange$$inlined$mapNotNull$1$1.L$1 = null;
                    productsParamsChangesFactory$createParamsOnRouteChange$$inlined$mapNotNull$1$1.L$2 = null;
                    productsParamsChangesFactory$createParamsOnRouteChange$$inlined$mapNotNull$1$1.label = 1;
                    if (this.a.collect(cVar, productsParamsChangesFactory$createParamsOnRouteChange$$inlined$mapNotNull$1$1) == coroutineSingletons) {
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
        productsParamsChangesFactory$createParamsOnRouteChange$$inlined$mapNotNull$1$1 = new ProductsParamsChangesFactory$createParamsOnRouteChange$$inlined$mapNotNull$1$1(this, continuation);
        Object obj2 = productsParamsChangesFactory$createParamsOnRouteChange$$inlined$mapNotNull$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = productsParamsChangesFactory$createParamsOnRouteChange$$inlined$mapNotNull$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
