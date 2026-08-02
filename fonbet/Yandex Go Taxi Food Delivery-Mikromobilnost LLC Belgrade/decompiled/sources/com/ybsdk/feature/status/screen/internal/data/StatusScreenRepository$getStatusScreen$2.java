package com.ybsdk.feature.status.screen.internal.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Result;", "Lv7l;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.status.screen.internal.data.StatusScreenRepository$getStatusScreen$2", f = "StatusScreenRepository.kt", l = {20, 26}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class StatusScreenRepository$getStatusScreen$2 extends SuspendLambda implements tls {
    final /* synthetic */ Map<String, String> $additionalParams;
    final /* synthetic */ String $target;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusScreenRepository$getStatusScreen$2(c cVar, String str, Map map, Continuation continuation) {
        super(1, continuation);
        this.this$0 = cVar;
        this.$target = str;
        this.$additionalParams = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new StatusScreenRepository$getStatusScreen$2(this.this$0, this.$target, this.$additionalParams, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((StatusScreenRepository$getStatusScreen$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r6 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        if (r7 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            StatusScreenApi statusScreenApi = this.this$0.a;
            StatusScreenRequest statusScreenRequest = new StatusScreenRequest(this.$target, this.$additionalParams);
            this.label = 1;
            a = statusScreenApi.a(statusScreenRequest, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                failure = ((Result) obj).getValue();
                return new Result(failure);
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        Throwable a2 = Result.a(a);
        if (a2 == null) {
            StatusScreenRepository$getStatusScreen$2$1$1 statusScreenRepository$getStatusScreen$2$1$1 = StatusScreenRepository$getStatusScreen$2$1$1.b;
            this.label = 2;
            failure = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) a, statusScreenRepository$getStatusScreen$2$1$1, this);
        } else {
            failure = new Result.Failure(a2);
        }
        return new Result(failure);
    }
}
