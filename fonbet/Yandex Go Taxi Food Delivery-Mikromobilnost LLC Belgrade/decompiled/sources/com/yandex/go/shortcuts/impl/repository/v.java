package com.yandex.go.shortcuts.impl.repository;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes8.dex */
public final class v implements tpr {
    public final /* synthetic */ tpr a;

    public v(n0 n0Var) {
        this.a = n0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ProductsResultRepositoryImpl$onErrorFlow$$inlined$mapNotNull$1$1 productsResultRepositoryImpl$onErrorFlow$$inlined$mapNotNull$1$1;
        int i;
        if (continuation instanceof ProductsResultRepositoryImpl$onErrorFlow$$inlined$mapNotNull$1$1) {
            productsResultRepositoryImpl$onErrorFlow$$inlined$mapNotNull$1$1 = (ProductsResultRepositoryImpl$onErrorFlow$$inlined$mapNotNull$1$1) continuation;
            int i2 = productsResultRepositoryImpl$onErrorFlow$$inlined$mapNotNull$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                productsResultRepositoryImpl$onErrorFlow$$inlined$mapNotNull$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = productsResultRepositoryImpl$onErrorFlow$$inlined$mapNotNull$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = productsResultRepositoryImpl$onErrorFlow$$inlined$mapNotNull$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    u uVar = new u(vprVar);
                    productsResultRepositoryImpl$onErrorFlow$$inlined$mapNotNull$1$1.L$0 = null;
                    productsResultRepositoryImpl$onErrorFlow$$inlined$mapNotNull$1$1.L$1 = null;
                    productsResultRepositoryImpl$onErrorFlow$$inlined$mapNotNull$1$1.L$2 = null;
                    productsResultRepositoryImpl$onErrorFlow$$inlined$mapNotNull$1$1.label = 1;
                    if (this.a.collect(uVar, productsResultRepositoryImpl$onErrorFlow$$inlined$mapNotNull$1$1) == coroutineSingletons) {
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
        productsResultRepositoryImpl$onErrorFlow$$inlined$mapNotNull$1$1 = new ProductsResultRepositoryImpl$onErrorFlow$$inlined$mapNotNull$1$1(this, continuation);
        Object obj2 = productsResultRepositoryImpl$onErrorFlow$$inlined$mapNotNull$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = productsResultRepositoryImpl$onErrorFlow$$inlined$mapNotNull$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
