package com.ybsdk.network.retrofit;

import defpackage.ak7;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import retrofit2.Call;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"T", "Lretrofit2/Call;", "call", "Lak7;", "reportInfo", "Lkotlin/Result;", "Liyd0;", "<anonymous>", "(Lretrofit2/Call;Lak7;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.network.retrofit.RetryCallExecutor$executePollable$3", f = "RetryCallExecutor.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RetryCallExecutor$executePollable$3 extends SuspendLambda implements zls {
    final /* synthetic */ tls $onResponse;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetryCallExecutor$executePollable$3(e eVar, tls tlsVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = eVar;
        this.$onResponse = tlsVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RetryCallExecutor$executePollable$3 retryCallExecutor$executePollable$3 = new RetryCallExecutor$executePollable$3(this.this$0, this.$onResponse, (Continuation) obj3);
        retryCallExecutor$executePollable$3.L$0 = (Call) obj;
        retryCallExecutor$executePollable$3.L$1 = (ak7) obj2;
        return retryCallExecutor$executePollable$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Call call = (Call) this.L$0;
            ak7 ak7Var = (ak7) this.L$1;
            b bVar = this.this$0.a;
            tls tlsVar = this.$onResponse;
            this.L$0 = null;
            this.label = 1;
            e = bVar.e(call, tlsVar, ak7Var, this);
            if (e == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            e = ((Result) obj).getValue();
        }
        return new Result(e);
    }
}
