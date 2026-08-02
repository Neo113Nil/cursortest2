package com.ybsdk.screens.registration.data;

import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.network.Api;
import com.ybsdk.network.dto.ApplicationResponse;
import defpackage.n13;
import defpackage.ny61;
import defpackage.q1e0;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class b {
    public final Api a;
    public final com.ybsdk.utils.poller.b b;

    public b(Api api, com.ybsdk.utils.poller.b bVar) {
        this.a = api;
        this.b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(YBProduct yBProduct, String str, Map map, ContinuationImpl continuationImpl) {
        ProductRepository$openProduct$1 productRepository$openProduct$1;
        int i;
        Object c;
        if (continuationImpl instanceof ProductRepository$openProduct$1) {
            productRepository$openProduct$1 = (ProductRepository$openProduct$1) continuationImpl;
            int i2 = productRepository$openProduct$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                productRepository$openProduct$1.label = i2 - Integer.MIN_VALUE;
                Object obj = productRepository$openProduct$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = productRepository$openProduct$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ProductRepository$openProduct$2 productRepository$openProduct$2 = new ProductRepository$openProduct$2(this, yBProduct, map, str, null);
                    productRepository$openProduct$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(productRepository$openProduct$2, productRepository$openProduct$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                return c instanceof Result.Failure ? n13.b((ApplicationResponse) c) : c;
            }
        }
        productRepository$openProduct$1 = new ProductRepository$openProduct$1(this, continuationImpl);
        Object obj2 = productRepository$openProduct$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = productRepository$openProduct$1.label;
        if (i != 0) {
        }
        if (c instanceof Result.Failure) {
        }
    }

    public final Object b(String str, q1e0 q1e0Var, Continuation continuation) {
        return com.ybsdk.core.utils.poller.a.a(this.b, q1e0Var, new ProductRepository$startPolling$2(2, null), new ProductRepository$startPolling$3(this, str, null)).d(null, (ContinuationImpl) continuation);
    }
}
