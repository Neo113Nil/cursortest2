package com.ybsdk.screens.registration.data;

import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.network.Api;
import com.ybsdk.network.dto.common.Product;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.v3f;
import defpackage.w511;
import defpackage.y8f0;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/network/dto/ApplicationResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.screens.registration.data.ProductRepository$openProduct$2", f = "ProductRepository.kt", l = {32}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ProductRepository$openProduct$2 extends SuspendLambda implements tls {
    final /* synthetic */ Map<String, String> $additionalParams;
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ YBProduct $product;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductRepository$openProduct$2(b bVar, YBProduct yBProduct, Map map, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$product = yBProduct;
        this.$additionalParams = map;
        this.$idempotencyToken = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ProductRepository$openProduct$2(this.this$0, this.$product, this.$additionalParams, this.$idempotencyToken, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ProductRepository$openProduct$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Product product;
        Object C;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            Api api = bVar.a;
            YBProduct yBProduct = this.$product;
            bVar.getClass();
            switch (y8f0.a[yBProduct.ordinal()]) {
                case 1:
                    product = Product.PRO;
                    break;
                case 2:
                    product = Product.WALLET;
                    break;
                case 3:
                    product = Product.SPLIT;
                    break;
                case 4:
                    product = Product.CREDIT;
                    break;
                case 5:
                    product = Product.CREDIT_LIMIT;
                    break;
                case 6:
                    product = Product.CREDIT_ACCOUNT;
                    break;
                default:
                    w511.b();
                    return null;
            }
            v3f v3fVar = new v3f(product, this.$additionalParams);
            String str = this.$idempotencyToken;
            this.label = 1;
            C = api.C(v3fVar, str, this);
            if (C == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            C = ((Result) obj).getValue();
        }
        return new Result(C);
    }
}
