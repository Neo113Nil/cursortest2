package com.ybsdk.screens.registration.data;

import com.ybsdk.network.dto.ApplicationStatusResponse;
import defpackage.mvg;
import defpackage.n13;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/ybsdk/network/dto/ApplicationStatusResponse;", "it", "Ls2e0;", "Lb13;", "<anonymous>", "(Lcom/ybsdk/network/dto/ApplicationStatusResponse;)Ls2e0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.registration.data.ProductRepository$startPolling$2", f = "ProductRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ProductRepository$startPolling$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ProductRepository$startPolling$2 productRepository$startPolling$2 = new ProductRepository$startPolling$2(2, continuation);
        productRepository$startPolling$2.L$0 = obj;
        return productRepository$startPolling$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductRepository$startPolling$2) create((ApplicationStatusResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return n13.a(n13.c((ApplicationStatusResponse) this.L$0));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
