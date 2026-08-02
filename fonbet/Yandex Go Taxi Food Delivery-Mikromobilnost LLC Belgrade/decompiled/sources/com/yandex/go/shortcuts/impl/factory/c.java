package com.yandex.go.shortcuts.impl.factory;

import defpackage.d0l0;
import defpackage.eaf0;
import defpackage.hrv;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;
    public final /* synthetic */ boolean c;

    public c(vpr vprVar, e eVar, boolean z) {
        this.a = vprVar;
        this.b = eVar;
        this.c = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ProductsParamsChangesFactory$createParamsOnRouteChange$$inlined$mapNotNull$1$2$1 productsParamsChangesFactory$createParamsOnRouteChange$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof ProductsParamsChangesFactory$createParamsOnRouteChange$$inlined$mapNotNull$1$2$1) {
            productsParamsChangesFactory$createParamsOnRouteChange$$inlined$mapNotNull$1$2$1 = (ProductsParamsChangesFactory$createParamsOnRouteChange$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = productsParamsChangesFactory$createParamsOnRouteChange$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                productsParamsChangesFactory$createParamsOnRouteChange$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = productsParamsChangesFactory$createParamsOnRouteChange$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = productsParamsChangesFactory$createParamsOnRouteChange$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    hrv hrvVar = (hrv) obj;
                    int i3 = hrvVar.a;
                    eaf0 B = this.b.b.B((d0l0) hrvVar.b, this.c && i3 == 0);
                    if (B != null) {
                        productsParamsChangesFactory$createParamsOnRouteChange$$inlined$mapNotNull$1$2$1.L$0 = null;
                        productsParamsChangesFactory$createParamsOnRouteChange$$inlined$mapNotNull$1$2$1.L$1 = null;
                        productsParamsChangesFactory$createParamsOnRouteChange$$inlined$mapNotNull$1$2$1.L$2 = null;
                        productsParamsChangesFactory$createParamsOnRouteChange$$inlined$mapNotNull$1$2$1.L$3 = null;
                        productsParamsChangesFactory$createParamsOnRouteChange$$inlined$mapNotNull$1$2$1.L$4 = null;
                        productsParamsChangesFactory$createParamsOnRouteChange$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(B, productsParamsChangesFactory$createParamsOnRouteChange$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
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
        productsParamsChangesFactory$createParamsOnRouteChange$$inlined$mapNotNull$1$2$1 = new ProductsParamsChangesFactory$createParamsOnRouteChange$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = productsParamsChangesFactory$createParamsOnRouteChange$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = productsParamsChangesFactory$createParamsOnRouteChange$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
