package com.yandex.go.shortcuts.impl.interactors;

import defpackage.jl40;
import defpackage.ny61;
import defpackage.qaf0;
import defpackage.raf0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class s implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ qaf0 b;

    public s(vpr vprVar, qaf0 qaf0Var) {
        this.a = vprVar;
        this.b = qaf0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ProductsScreenInteractorImpl$fetchScreenProducts$$inlined$filter$1$2$1 productsScreenInteractorImpl$fetchScreenProducts$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof ProductsScreenInteractorImpl$fetchScreenProducts$$inlined$filter$1$2$1) {
            productsScreenInteractorImpl$fetchScreenProducts$$inlined$filter$1$2$1 = (ProductsScreenInteractorImpl$fetchScreenProducts$$inlined$filter$1$2$1) continuation;
            int i2 = productsScreenInteractorImpl$fetchScreenProducts$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                productsScreenInteractorImpl$fetchScreenProducts$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = productsScreenInteractorImpl$fetchScreenProducts$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = productsScreenInteractorImpl$fetchScreenProducts$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (jl40.l(this.b, ((raf0) obj).a)) {
                        productsScreenInteractorImpl$fetchScreenProducts$$inlined$filter$1$2$1.L$0 = null;
                        productsScreenInteractorImpl$fetchScreenProducts$$inlined$filter$1$2$1.L$1 = null;
                        productsScreenInteractorImpl$fetchScreenProducts$$inlined$filter$1$2$1.L$2 = null;
                        productsScreenInteractorImpl$fetchScreenProducts$$inlined$filter$1$2$1.L$3 = null;
                        productsScreenInteractorImpl$fetchScreenProducts$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, productsScreenInteractorImpl$fetchScreenProducts$$inlined$filter$1$2$1) == coroutineSingletons) {
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
        productsScreenInteractorImpl$fetchScreenProducts$$inlined$filter$1$2$1 = new ProductsScreenInteractorImpl$fetchScreenProducts$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = productsScreenInteractorImpl$fetchScreenProducts$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = productsScreenInteractorImpl$fetchScreenProducts$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
