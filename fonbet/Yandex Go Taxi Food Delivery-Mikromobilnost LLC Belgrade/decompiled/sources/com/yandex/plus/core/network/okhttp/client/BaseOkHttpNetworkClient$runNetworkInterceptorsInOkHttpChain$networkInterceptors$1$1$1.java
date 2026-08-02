package com.yandex.plus.core.network.okhttp.client;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tv50;
import defpackage.uv50;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u001c\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b0\u0005j\u0002`\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0010\u0010\u0001\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lsq50;", "<unused var>", "Lgz50;", "Lm5j0;", "Lcom/yandex/plus/core/network/okhttp/request/OkHttpNetworkRequest;", "Lsz50;", "Lnz50;", "Lrvj0;", "Lcom/yandex/plus/core/network/okhttp/response/OkHttpNetworkResponse;", "Lcom/yandex/plus/core/network/okhttp/interceptor/OkHttpNetworkResult;", "<anonymous>", "(Lsq50;Lgz50;)Lsz50;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.core.network.okhttp.client.BaseOkHttpNetworkClient$runNetworkInterceptorsInOkHttpChain$networkInterceptors$1$1$1", f = "BaseOkHttpNetworkClient.kt", l = {HProv.PP_VERSION_TIMESTAMP}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class BaseOkHttpNetworkClient$runNetworkInterceptorsInOkHttpChain$networkInterceptors$1$1$1 extends SuspendLambda implements zls {
    final /* synthetic */ tv50 $chain;
    final /* synthetic */ uv50 $interceptor;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseOkHttpNetworkClient$runNetworkInterceptorsInOkHttpChain$networkInterceptors$1$1$1(uv50 uv50Var, tv50 tv50Var, Continuation continuation) {
        super(3, continuation);
        this.$interceptor = uv50Var;
        this.$chain = tv50Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new BaseOkHttpNetworkClient$runNetworkInterceptorsInOkHttpChain$networkInterceptors$1$1$1(this.$interceptor, this.$chain, (Continuation) obj3).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        uv50 uv50Var = this.$interceptor;
        tv50 tv50Var = this.$chain;
        this.label = 1;
        Object a = uv50Var.a(tv50Var, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
