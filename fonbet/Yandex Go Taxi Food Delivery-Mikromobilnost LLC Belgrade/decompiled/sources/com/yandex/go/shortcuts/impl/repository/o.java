package com.yandex.go.shortcuts.impl.repository;

import defpackage.haf0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class o implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ s b;

    public o(vpr vprVar, s sVar) {
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
        ProductsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1 productsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof ProductsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1) {
            productsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1 = (ProductsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1) continuation;
            int i2 = productsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                productsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = productsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = productsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    productsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1.L$0 = null;
                    productsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1.L$1 = null;
                    productsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1.L$2 = null;
                    productsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    productsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1.L$4 = vprVar2;
                    productsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1.L$5 = null;
                    productsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1.L$6 = null;
                    productsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1.label = 1;
                    Object d = this.b.d((haf0) obj, productsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1);
                    if (d != coroutineSingletons) {
                        obj2 = d;
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
                vprVar = (vpr) productsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1.L$4;
                kotlin.b.b(obj2);
                productsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1.L$0 = null;
                productsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1.L$1 = null;
                productsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1.L$2 = null;
                productsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1.L$3 = null;
                productsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1.L$4 = null;
                productsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1.L$5 = null;
                productsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1.L$6 = null;
                productsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1.label = 2;
            }
        }
        productsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1 = new ProductsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1(this, continuation);
        Object obj22 = productsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = productsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1.label;
        if (i != 0) {
        }
        productsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1.L$0 = null;
        productsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1.L$1 = null;
        productsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1.L$2 = null;
        productsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1.L$3 = null;
        productsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1.L$4 = null;
        productsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1.L$5 = null;
        productsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1.L$6 = null;
        productsParamsStateFactoryImpl$observeParam$$inlined$map$3$2$1.label = 2;
    }
}
