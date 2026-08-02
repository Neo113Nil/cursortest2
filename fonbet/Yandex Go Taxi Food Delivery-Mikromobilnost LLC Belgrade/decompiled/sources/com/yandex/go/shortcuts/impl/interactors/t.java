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
public final class t implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ qaf0 b;

    public t(r0 r0Var, qaf0 qaf0Var) {
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
        ProductsScreenInteractorImpl$fetchScreenProducts$$inlined$filter$1$1 productsScreenInteractorImpl$fetchScreenProducts$$inlined$filter$1$1;
        int i;
        if (continuation instanceof ProductsScreenInteractorImpl$fetchScreenProducts$$inlined$filter$1$1) {
            productsScreenInteractorImpl$fetchScreenProducts$$inlined$filter$1$1 = (ProductsScreenInteractorImpl$fetchScreenProducts$$inlined$filter$1$1) continuation;
            int i2 = productsScreenInteractorImpl$fetchScreenProducts$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                productsScreenInteractorImpl$fetchScreenProducts$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = productsScreenInteractorImpl$fetchScreenProducts$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = productsScreenInteractorImpl$fetchScreenProducts$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    s sVar = new s(vprVar, this.b);
                    productsScreenInteractorImpl$fetchScreenProducts$$inlined$filter$1$1.L$0 = null;
                    productsScreenInteractorImpl$fetchScreenProducts$$inlined$filter$1$1.L$1 = null;
                    productsScreenInteractorImpl$fetchScreenProducts$$inlined$filter$1$1.L$2 = null;
                    productsScreenInteractorImpl$fetchScreenProducts$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(sVar, productsScreenInteractorImpl$fetchScreenProducts$$inlined$filter$1$1) == coroutineSingletons) {
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
        productsScreenInteractorImpl$fetchScreenProducts$$inlined$filter$1$1 = new ProductsScreenInteractorImpl$fetchScreenProducts$$inlined$filter$1$1(this, continuation);
        Object obj2 = productsScreenInteractorImpl$fetchScreenProducts$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = productsScreenInteractorImpl$fetchScreenProducts$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
