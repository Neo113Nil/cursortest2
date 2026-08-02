package com.yandex.go.shortcuts.impl.repository;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class u implements vpr {
    public final /* synthetic */ vpr a;

    public u(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ProductsResultRepositoryImpl$onErrorFlow$$inlined$mapNotNull$1$2$1 productsResultRepositoryImpl$onErrorFlow$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof ProductsResultRepositoryImpl$onErrorFlow$$inlined$mapNotNull$1$2$1) {
            productsResultRepositoryImpl$onErrorFlow$$inlined$mapNotNull$1$2$1 = (ProductsResultRepositoryImpl$onErrorFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = productsResultRepositoryImpl$onErrorFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                productsResultRepositoryImpl$onErrorFlow$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = productsResultRepositoryImpl$onErrorFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = productsResultRepositoryImpl$onErrorFlow$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Throwable a = Result.a(((Result) obj).getValue());
                    if (a != null) {
                        productsResultRepositoryImpl$onErrorFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                        productsResultRepositoryImpl$onErrorFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                        productsResultRepositoryImpl$onErrorFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                        productsResultRepositoryImpl$onErrorFlow$$inlined$mapNotNull$1$2$1.L$3 = null;
                        productsResultRepositoryImpl$onErrorFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                        productsResultRepositoryImpl$onErrorFlow$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(a, productsResultRepositoryImpl$onErrorFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
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
        productsResultRepositoryImpl$onErrorFlow$$inlined$mapNotNull$1$2$1 = new ProductsResultRepositoryImpl$onErrorFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = productsResultRepositoryImpl$onErrorFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = productsResultRepositoryImpl$onErrorFlow$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
