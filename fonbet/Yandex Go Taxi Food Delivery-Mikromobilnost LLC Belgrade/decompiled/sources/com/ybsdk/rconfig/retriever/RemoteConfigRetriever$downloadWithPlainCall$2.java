package com.ybsdk.rconfig.retriever;

import android.os.SystemClock;
import com.ybsdk.core.utils.ext.ErrorResponse;
import com.ybsdk.core.utils.ext.ErrorResponseException;
import com.ybsdk.network.dto.RemoteConfigRequest;
import com.ybsdk.network.dto.RemoteConfigResponse;
import defpackage.ak7;
import defpackage.kvj0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.KotlinNullPointerException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import retrofit2.Call;
import retrofit2.Response;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.rconfig.retriever.RemoteConfigRetriever$downloadWithPlainCall$2", f = "RemoteConfigRetriever.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RemoteConfigRetriever$downloadWithPlainCall$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $currentVersion;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteConfigRetriever$downloadWithPlainCall$2(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$currentVersion = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RemoteConfigRetriever$downloadWithPlainCall$2 remoteConfigRetriever$downloadWithPlainCall$2 = new RemoteConfigRetriever$downloadWithPlainCall$2(this.this$0, this.$currentVersion, continuation);
        remoteConfigRetriever$downloadWithPlainCall$2.L$0 = obj;
        return remoteConfigRetriever$downloadWithPlainCall$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RemoteConfigRetriever$downloadWithPlainCall$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        Response execute;
        kvj0 kvj0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Call<RemoteConfigResponse> B = this.this$0.b.B(new RemoteConfigRequest(this.$currentVersion));
        ak7 ak7Var = new ak7(SystemClock.elapsedRealtime());
        this.this$0.d.a(B, null, 0);
        a aVar = this.this$0;
        String str = this.$currentVersion;
        try {
            execute = B.execute();
            kvj0Var = execute.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (!kvj0Var.J) {
            int i = kvj0Var.w;
            String str2 = kvj0Var.c;
            aVar.getClass();
            throw new ErrorResponseException(new ErrorResponse(i, str2), null);
        }
        RemoteConfigResponse remoteConfigResponse = (RemoteConfigResponse) execute.b;
        aVar.d.e(B, remoteConfigResponse, ak7Var);
        if (remoteConfigResponse == null) {
            throw new KotlinNullPointerException("get_remote_config response body is null");
        }
        aVar.d(str, remoteConfigResponse);
        failure = zy11.a;
        a aVar2 = this.this$0;
        Throwable a = Result.a(failure);
        if (a != null) {
            aVar2.d.b(B, a, ak7Var);
        }
        return new Result(failure);
    }
}
