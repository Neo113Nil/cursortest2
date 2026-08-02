package com.yandex.go.shortcuts.impl.repository;

import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.go.shortcuts.dto.request.ProductsParam;
import com.yandex.go.shortcuts.dto.request.ProductsParamsState;
import com.yandex.go.shortcuts.dto.request.ProductsScreenParam;
import com.yandex.go.shortcuts.dto.request.ProductsScreenPayload;
import com.yandex.go.shortcuts.dto.response.ProductsScreenResponse;
import defpackage.blh;
import defpackage.cmt;
import defpackage.fmt;
import defpackage.hd7;
import defpackage.kaf0;
import defpackage.ny61;
import defpackage.pf10;
import defpackage.s8o;
import defpackage.saf0;
import defpackage.udq0;
import defpackage.zzs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class w implements kaf0 {
    public final /* synthetic */ zzs a;
    public final /* synthetic */ Integer b;
    public final /* synthetic */ kotlinx.serialization.json.b c;
    public final /* synthetic */ kotlinx.serialization.json.b d;
    public final /* synthetic */ saf0 e;
    public final /* synthetic */ String f;

    public w(zzs zzsVar, Integer num, kotlinx.serialization.json.b bVar, kotlinx.serialization.json.b bVar2, saf0 saf0Var, String str) {
        this.a = zzsVar;
        this.b = num;
        this.c = bVar;
        this.d = bVar2;
        this.e = saf0Var;
        this.f = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // defpackage.kaf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ProductsParam.Shortcuts shortcuts, pf10 pf10Var, ProductsParamsState productsParamsState, ContinuationImpl continuationImpl) {
        ProductsScreenRepository$getScreenProducts$1$get$1 productsScreenRepository$getScreenProducts$1$get$1;
        int i;
        hd7 hd7Var;
        saf0 saf0Var = this.e;
        blh blhVar = saf0Var.c;
        if (continuationImpl instanceof ProductsScreenRepository$getScreenProducts$1$get$1) {
            productsScreenRepository$getScreenProducts$1$get$1 = (ProductsScreenRepository$getScreenProducts$1$get$1) continuationImpl;
            int i2 = productsScreenRepository$getScreenProducts$1$get$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                productsScreenRepository$getScreenProducts$1$get$1.label = i2 - Integer.MIN_VALUE;
                Object obj = productsScreenRepository$getScreenProducts$1$get$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = productsScreenRepository$getScreenProducts$1$get$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ProductsScreenParam productsScreenParam = new ProductsScreenParam(this.a, productsParamsState, shortcuts, pf10Var, new ProductsScreenPayload(this.b, this.c, this.d), 32);
                    String q = s8o.q();
                    hd7 b = blhVar.b(ExperimentSource.PRODUCTS, true);
                    cmt<ProductsScreenResponse> b2 = saf0Var.b.b(q, this.f, new ProductsScreenParam(productsScreenParam.a, productsScreenParam.b, productsScreenParam.c, productsScreenParam.d, productsScreenParam.e, b.d));
                    productsScreenRepository$getScreenProducts$1$get$1.L$0 = null;
                    productsScreenRepository$getScreenProducts$1$get$1.L$1 = null;
                    productsScreenRepository$getScreenProducts$1$get$1.L$2 = null;
                    productsScreenRepository$getScreenProducts$1$get$1.L$3 = null;
                    productsScreenRepository$getScreenProducts$1$get$1.L$4 = null;
                    productsScreenRepository$getScreenProducts$1$get$1.L$5 = b;
                    productsScreenRepository$getScreenProducts$1$get$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.b(b2, null, productsScreenRepository$getScreenProducts$1$get$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    hd7Var = b;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hd7Var = (hd7) productsScreenRepository$getScreenProducts$1$get$1.L$5;
                    kotlin.b.b(obj);
                }
                ProductsScreenResponse productsScreenResponse = (ProductsScreenResponse) ((fmt) obj).a;
                udq0.P(productsScreenResponse.g, blhVar, hd7Var);
                return productsScreenResponse;
            }
        }
        productsScreenRepository$getScreenProducts$1$get$1 = new ProductsScreenRepository$getScreenProducts$1$get$1(this, continuationImpl);
        Object obj2 = productsScreenRepository$getScreenProducts$1$get$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = productsScreenRepository$getScreenProducts$1$get$1.label;
        if (i != 0) {
        }
        ProductsScreenResponse productsScreenResponse2 = (ProductsScreenResponse) ((fmt) obj2).a;
        udq0.P(productsScreenResponse2.g, blhVar, hd7Var);
        return productsScreenResponse2;
    }
}
