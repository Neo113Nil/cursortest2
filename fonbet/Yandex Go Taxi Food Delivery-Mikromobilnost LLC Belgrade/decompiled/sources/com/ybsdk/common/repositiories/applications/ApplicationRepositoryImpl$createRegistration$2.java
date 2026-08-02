package com.ybsdk.common.repositiories.applications;

import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.network.Api;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.v3f;
import defpackage.zy11;
import defpackage.zzq0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/network/dto/ApplicationResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.common.repositiories.applications.ApplicationRepositoryImpl$createRegistration$2", f = "ApplicationRepositoryImpl.kt", l = {49}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ApplicationRepositoryImpl$createRegistration$2 extends SuspendLambda implements tls {
    final /* synthetic */ Map<String, String> $additionalParams;
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ YBProduct $product;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplicationRepositoryImpl$createRegistration$2(b bVar, String str, YBProduct yBProduct, Map map, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$idempotencyToken = str;
        this.$product = yBProduct;
        this.$additionalParams = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ApplicationRepositoryImpl$createRegistration$2(this.this$0, this.$idempotencyToken, this.$product, this.$additionalParams, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ApplicationRepositoryImpl$createRegistration$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object K;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Api api = this.this$0.a;
            String str = this.$idempotencyToken;
            v3f v3fVar = new v3f(zzq0.a(this.$product), this.$additionalParams);
            this.label = 1;
            K = api.K(str, v3fVar, this);
            if (K == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            K = ((Result) obj).getValue();
        }
        return new Result(K);
    }
}
