package com.yandex.go.shortcuts.impl.interactors;

import defpackage.jl40;
import defpackage.ny61;
import defpackage.qaf0;
import defpackage.uaf0;
import defpackage.vpr;
import defpackage.yaf0;
import defpackage.zaf0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class k implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ yaf0 b;

    public k(vpr vprVar, yaf0 yaf0Var) {
        this.a = vprVar;
        this.b = yaf0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ProductsInteractorImpl$productsFlow$$inlined$filter$1$2$1 productsInteractorImpl$productsFlow$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof ProductsInteractorImpl$productsFlow$$inlined$filter$1$2$1) {
            productsInteractorImpl$productsFlow$$inlined$filter$1$2$1 = (ProductsInteractorImpl$productsFlow$$inlined$filter$1$2$1) continuation;
            int i2 = productsInteractorImpl$productsFlow$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                productsInteractorImpl$productsFlow$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = productsInteractorImpl$productsFlow$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = productsInteractorImpl$productsFlow$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    qaf0 qaf0Var = ((zaf0) obj).a;
                    if (jl40.l(this.b, qaf0Var != null ? (uaf0) qaf0Var.a : null)) {
                        productsInteractorImpl$productsFlow$$inlined$filter$1$2$1.L$0 = null;
                        productsInteractorImpl$productsFlow$$inlined$filter$1$2$1.L$1 = null;
                        productsInteractorImpl$productsFlow$$inlined$filter$1$2$1.L$2 = null;
                        productsInteractorImpl$productsFlow$$inlined$filter$1$2$1.L$3 = null;
                        productsInteractorImpl$productsFlow$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, productsInteractorImpl$productsFlow$$inlined$filter$1$2$1) == coroutineSingletons) {
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
        productsInteractorImpl$productsFlow$$inlined$filter$1$2$1 = new ProductsInteractorImpl$productsFlow$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = productsInteractorImpl$productsFlow$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = productsInteractorImpl$productsFlow$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
