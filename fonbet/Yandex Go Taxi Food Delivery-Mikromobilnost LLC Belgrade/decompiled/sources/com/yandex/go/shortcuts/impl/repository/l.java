package com.yandex.go.shortcuts.impl.repository;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class l implements tpr {
    public final /* synthetic */ com.yandex.go.taxi.tariffs.internal.repository.m a;

    public l(com.yandex.go.taxi.tariffs.internal.repository.m mVar) {
        this.a = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ProductsParamsStateFactoryImpl$observeParam$$inlined$map$1$1 productsParamsStateFactoryImpl$observeParam$$inlined$map$1$1;
        int i;
        if (continuation instanceof ProductsParamsStateFactoryImpl$observeParam$$inlined$map$1$1) {
            productsParamsStateFactoryImpl$observeParam$$inlined$map$1$1 = (ProductsParamsStateFactoryImpl$observeParam$$inlined$map$1$1) continuation;
            int i2 = productsParamsStateFactoryImpl$observeParam$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                productsParamsStateFactoryImpl$observeParam$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = productsParamsStateFactoryImpl$observeParam$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = productsParamsStateFactoryImpl$observeParam$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    k kVar = new k(vprVar);
                    productsParamsStateFactoryImpl$observeParam$$inlined$map$1$1.L$0 = null;
                    productsParamsStateFactoryImpl$observeParam$$inlined$map$1$1.L$1 = null;
                    productsParamsStateFactoryImpl$observeParam$$inlined$map$1$1.L$2 = null;
                    productsParamsStateFactoryImpl$observeParam$$inlined$map$1$1.label = 1;
                    if (this.a.collect(kVar, productsParamsStateFactoryImpl$observeParam$$inlined$map$1$1) == coroutineSingletons) {
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
        productsParamsStateFactoryImpl$observeParam$$inlined$map$1$1 = new ProductsParamsStateFactoryImpl$observeParam$$inlined$map$1$1(this, continuation);
        Object obj2 = productsParamsStateFactoryImpl$observeParam$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = productsParamsStateFactoryImpl$observeParam$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
