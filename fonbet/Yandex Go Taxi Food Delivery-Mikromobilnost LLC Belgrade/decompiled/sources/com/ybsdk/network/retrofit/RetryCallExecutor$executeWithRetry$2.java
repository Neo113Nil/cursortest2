package com.ybsdk.network.retrofit;

import android.os.SystemClock;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.ak7;
import defpackage.c2k0;
import defpackage.k1k0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tq11;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import retrofit2.Call;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "Lc2k0;", "id", "Ltq11;", "attempt", "Lkotlin/Result;", "<anonymous>", "(Lc2k0;Ltq11;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.network.retrofit.RetryCallExecutor$executeWithRetry$2", f = "RetryCallExecutor.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class RetryCallExecutor$executeWithRetry$2 extends SuspendLambda implements zls {
    final /* synthetic */ zls $executor;
    final /* synthetic */ Call<Object> $originalCall;
    final /* synthetic */ k1k0 $retryConfig;
    /* synthetic */ int I$0;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetryCallExecutor$executeWithRetry$2(Call call, k1k0 k1k0Var, zls zlsVar, Continuation continuation) {
        super(3, continuation);
        this.$originalCall = call;
        this.$retryConfig = k1k0Var;
        this.$executor = zlsVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str = ((c2k0) obj).a;
        int i = ((tq11) obj2).a;
        RetryCallExecutor$executeWithRetry$2 retryCallExecutor$executeWithRetry$2 = new RetryCallExecutor$executeWithRetry$2(this.$originalCall, this.$retryConfig, this.$executor, (Continuation) obj3);
        retryCallExecutor$executeWithRetry$2.L$0 = new c2k0(str);
        retryCallExecutor$executeWithRetry$2.I$0 = i;
        return retryCallExecutor$executeWithRetry$2.invokeSuspend(zy11.a);
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
        String str = ((c2k0) this.L$0).a;
        int i2 = this.I$0;
        boolean l1 = this.$originalCall.l1();
        Call<Object> call = this.$originalCall;
        if (l1) {
            call = call.clone();
        }
        ak7 ak7Var = new ak7(str, this.$retryConfig, i2, SystemClock.elapsedRealtime());
        zls zlsVar = this.$executor;
        this.label = 1;
        Object invoke = zlsVar.invoke(call, ak7Var, this);
        return invoke == coroutineSingletons ? coroutineSingletons : invoke;
    }
}
