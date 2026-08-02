package com.yandex.go.shortcuts.impl.interactors;

import defpackage.ny61;
import defpackage.qaf0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class i implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ qaf0 b;

    public i(r0 r0Var, qaf0 qaf0Var) {
        this.a = r0Var;
        this.b = qaf0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ProductsInteractorImpl$fetchProducts$$inlined$filter$1$1 productsInteractorImpl$fetchProducts$$inlined$filter$1$1;
        int i;
        if (continuation instanceof ProductsInteractorImpl$fetchProducts$$inlined$filter$1$1) {
            productsInteractorImpl$fetchProducts$$inlined$filter$1$1 = (ProductsInteractorImpl$fetchProducts$$inlined$filter$1$1) continuation;
            int i2 = productsInteractorImpl$fetchProducts$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                productsInteractorImpl$fetchProducts$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = productsInteractorImpl$fetchProducts$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = productsInteractorImpl$fetchProducts$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    h hVar = new h(vprVar, this.b);
                    productsInteractorImpl$fetchProducts$$inlined$filter$1$1.L$0 = null;
                    productsInteractorImpl$fetchProducts$$inlined$filter$1$1.L$1 = null;
                    productsInteractorImpl$fetchProducts$$inlined$filter$1$1.L$2 = null;
                    productsInteractorImpl$fetchProducts$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(hVar, productsInteractorImpl$fetchProducts$$inlined$filter$1$1) == coroutineSingletons) {
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
        productsInteractorImpl$fetchProducts$$inlined$filter$1$1 = new ProductsInteractorImpl$fetchProducts$$inlined$filter$1$1(this, continuation);
        Object obj2 = productsInteractorImpl$fetchProducts$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = productsInteractorImpl$fetchProducts$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
