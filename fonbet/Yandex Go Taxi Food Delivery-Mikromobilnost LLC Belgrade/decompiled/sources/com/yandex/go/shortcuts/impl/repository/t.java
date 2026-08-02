package com.yandex.go.shortcuts.impl.repository;

import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.go.shortcuts.dto.request.ProductsParam;
import com.yandex.go.shortcuts.dto.request.ProductsParamsState;
import com.yandex.go.shortcuts.dto.response.ProductsResponse;
import defpackage.blh;
import defpackage.cmt;
import defpackage.ep21;
import defpackage.fmt;
import defpackage.hd7;
import defpackage.jaf0;
import defpackage.jl40;
import defpackage.kaf0;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.pf10;
import defpackage.po21;
import defpackage.q9f0;
import defpackage.uaf0;
import defpackage.udq0;
import defpackage.uj31;
import defpackage.vng;
import defpackage.yaf0;
import defpackage.zzs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class t implements kaf0 {
    public final /* synthetic */ zzs a;
    public final /* synthetic */ jaf0 b;
    public final /* synthetic */ yaf0 c;

    public t(zzs zzsVar, jaf0 jaf0Var, yaf0 yaf0Var) {
        this.a = zzsVar;
        this.b = jaf0Var;
        this.c = yaf0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x011a, code lost:
    
        if (r1 != r5) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // defpackage.kaf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ProductsParam.Shortcuts shortcuts, pf10 pf10Var, ProductsParamsState productsParamsState, ContinuationImpl continuationImpl) {
        ProductsRepository$getProducts$1$get$1 productsRepository$getProducts$1$get$1;
        int i;
        ProductsParam productsParam;
        String str;
        hd7 b;
        jaf0 jaf0Var = this.b;
        blh blhVar = jaf0Var.f;
        if (continuationImpl instanceof ProductsRepository$getProducts$1$get$1) {
            productsRepository$getProducts$1$get$1 = (ProductsRepository$getProducts$1$get$1) continuationImpl;
            int i2 = productsRepository$getProducts$1$get$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                productsRepository$getProducts$1$get$1.label = i2 - Integer.MIN_VALUE;
                Object obj = productsRepository$getProducts$1$get$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = productsRepository$getProducts$1$get$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ProductsParam productsParam2 = new ProductsParam(this.a, productsParamsState, shortcuts, pf10Var, uj31.a, jaf0Var.d.a(), 64);
                    po21 po21Var = jaf0Var.e;
                    productsRepository$getProducts$1$get$1.L$0 = null;
                    productsRepository$getProducts$1$get$1.L$1 = null;
                    productsRepository$getProducts$1$get$1.L$2 = null;
                    productsRepository$getProducts$1$get$1.L$3 = productsParam2;
                    productsRepository$getProducts$1$get$1.label = 1;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).m(productsRepository$getProducts$1$get$1);
                    if (obj != coroutineSingletons) {
                        productsParam = productsParam2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b = (hd7) productsRepository$getProducts$1$get$1.L$5;
                    kotlin.b.b(obj);
                    udq0.P(((ProductsResponse) ((fmt) obj).a).f, blhVar, b);
                    return obj;
                }
                productsParam = (ProductsParam) productsRepository$getProducts$1$get$1.L$3;
                kotlin.b.b(obj);
                mo21 A = vng.A((ep21) obj);
                String e = A == null ? vng.e(A) : null;
                q9f0 q9f0Var = jaf0Var.c;
                yaf0 yaf0Var = this.c;
                uaf0 uaf0Var = !(yaf0Var instanceof uaf0) ? (uaf0) yaf0Var : null;
                q9f0Var.getClass();
                str = !jl40.l(uaf0Var, yaf0.a) ? "Main" : jl40.l(uaf0Var, yaf0.d) ? "TaxiMain" : jl40.l(uaf0Var, yaf0.c) ? "Multiorder" : null;
                if (str != null) {
                    ((ru.yandex.taxi.analytics.j) q9f0Var.a).n(str.concat(".ProductsRequestSend"));
                }
                b = blhVar.b(ExperimentSource.PRODUCTS, true);
                cmt<ProductsResponse> a = jaf0Var.b.a(e, new ProductsParam(productsParam.a, productsParam.b, productsParam.c, productsParam.d, productsParam.e, productsParam.f, b.d));
                productsRepository$getProducts$1$get$1.L$0 = null;
                productsRepository$getProducts$1$get$1.L$1 = null;
                productsRepository$getProducts$1$get$1.L$2 = null;
                productsRepository$getProducts$1$get$1.L$3 = null;
                productsRepository$getProducts$1$get$1.L$4 = null;
                productsRepository$getProducts$1$get$1.L$5 = b;
                productsRepository$getProducts$1$get$1.label = 2;
                obj = ru.yandex.taxi.network.api.a.b(a, null, productsRepository$getProducts$1$get$1);
            }
        }
        productsRepository$getProducts$1$get$1 = new ProductsRepository$getProducts$1$get$1(this, continuationImpl);
        Object obj2 = productsRepository$getProducts$1$get$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = productsRepository$getProducts$1$get$1.label;
        if (i != 0) {
        }
        mo21 A2 = vng.A((ep21) obj2);
        if (A2 == null) {
        }
        q9f0 q9f0Var2 = jaf0Var.c;
        yaf0 yaf0Var2 = this.c;
        if (!(yaf0Var2 instanceof uaf0)) {
        }
        q9f0Var2.getClass();
        if (!jl40.l(uaf0Var, yaf0.a)) {
        }
        if (str != null) {
        }
        b = blhVar.b(ExperimentSource.PRODUCTS, true);
        cmt<ProductsResponse> a2 = jaf0Var.b.a(e, new ProductsParam(productsParam.a, productsParam.b, productsParam.c, productsParam.d, productsParam.e, productsParam.f, b.d));
        productsRepository$getProducts$1$get$1.L$0 = null;
        productsRepository$getProducts$1$get$1.L$1 = null;
        productsRepository$getProducts$1$get$1.L$2 = null;
        productsRepository$getProducts$1$get$1.L$3 = null;
        productsRepository$getProducts$1$get$1.L$4 = null;
        productsRepository$getProducts$1$get$1.L$5 = b;
        productsRepository$getProducts$1$get$1.label = 2;
        obj2 = ru.yandex.taxi.network.api.a.b(a2, null, productsRepository$getProducts$1$get$1);
    }
}
