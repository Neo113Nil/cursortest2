package com.ybsdk.feature.main.internal.data.network;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.main.internal.data.network.dto.ScreenProductsRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t400;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Result;", "Llaf0;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.main.internal.data.network.ProductScreenRepository$getProductScreenItems$2", f = "ProductScreenRepository.kt", l = {60, 64, 70, 74}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ProductScreenRepository$getProductScreenItems$2 extends SuspendLambda implements tls {
    final /* synthetic */ ScreenProductsRequest $screenProductsRequest;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductScreenRepository$getProductScreenItems$2(a aVar, ScreenProductsRequest screenProductsRequest, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$screenProductsRequest = screenProductsRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ProductScreenRepository$getProductScreenItems$2(this.this$0, this.$screenProductsRequest, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ProductScreenRepository$getProductScreenItems$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a3, code lost:
    
        if (r7 == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        if (r7 == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        if (r8 == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        if (r8 == r0) goto L32;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        Object a;
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            boolean c = ((t400) this.this$0.j).c();
            a aVar = this.this$0;
            if (c) {
                MainScreenApi mainScreenApi = aVar.a;
                String a2 = aVar.e.a();
                ScreenProductsRequest screenProductsRequest = this.$screenProductsRequest;
                this.label = 1;
                a = mainScreenApi.a(a2, screenProductsRequest, this);
            } else {
                MainScreenApi mainScreenApi2 = aVar.a;
                String a3 = aVar.e.a();
                ScreenProductsRequest screenProductsRequest2 = this.$screenProductsRequest;
                this.label = 3;
                b = mainScreenApi2.b(a3, screenProductsRequest2, this);
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
            a aVar2 = this.this$0;
            Throwable a4 = Result.a(a);
            if (a4 == null) {
                ProductScreenRepository$getProductScreenItems$2$1$1 productScreenRepository$getProductScreenItems$2$1$1 = new ProductScreenRepository$getProductScreenItems$2$1$1(aVar2, null);
                this.label = 2;
                failure = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) a, productScreenRepository$getProductScreenItems$2$1$1, this);
            } else {
                failure = new Result.Failure(a4);
            }
            return new Result(failure);
        }
        if (i != 2) {
            if (i == 3) {
                kotlin.b.b(obj);
                b = ((Result) obj).getValue();
                a aVar3 = this.this$0;
                Throwable a5 = Result.a(b);
                if (a5 == null) {
                    ProductScreenRepository$getProductScreenItems$2$2$1 productScreenRepository$getProductScreenItems$2$2$1 = new ProductScreenRepository$getProductScreenItems$2$2$1(aVar3, null);
                    this.label = 4;
                    failure = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) b, productScreenRepository$getProductScreenItems$2$2$1, this);
                } else {
                    failure = new Result.Failure(a5);
                }
                return new Result(failure);
            }
            if (i != 4) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        kotlin.b.b(obj);
        failure = ((Result) obj).getValue();
        return new Result(failure);
    }
}
