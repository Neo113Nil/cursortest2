package com.yandex.go.shortcuts.impl.interactors;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.yaf0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class l implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ yaf0 b;

    public l(r0 r0Var, yaf0 yaf0Var) {
        this.a = r0Var;
        this.b = yaf0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ProductsInteractorImpl$productsFlow$$inlined$filter$1$1 productsInteractorImpl$productsFlow$$inlined$filter$1$1;
        int i;
        if (continuation instanceof ProductsInteractorImpl$productsFlow$$inlined$filter$1$1) {
            productsInteractorImpl$productsFlow$$inlined$filter$1$1 = (ProductsInteractorImpl$productsFlow$$inlined$filter$1$1) continuation;
            int i2 = productsInteractorImpl$productsFlow$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                productsInteractorImpl$productsFlow$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = productsInteractorImpl$productsFlow$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = productsInteractorImpl$productsFlow$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    k kVar = new k(vprVar, this.b);
                    productsInteractorImpl$productsFlow$$inlined$filter$1$1.L$0 = null;
                    productsInteractorImpl$productsFlow$$inlined$filter$1$1.L$1 = null;
                    productsInteractorImpl$productsFlow$$inlined$filter$1$1.L$2 = null;
                    productsInteractorImpl$productsFlow$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(kVar, productsInteractorImpl$productsFlow$$inlined$filter$1$1) == coroutineSingletons) {
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
        productsInteractorImpl$productsFlow$$inlined$filter$1$1 = new ProductsInteractorImpl$productsFlow$$inlined$filter$1$1(this, continuation);
        Object obj2 = productsInteractorImpl$productsFlow$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = productsInteractorImpl$productsFlow$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
