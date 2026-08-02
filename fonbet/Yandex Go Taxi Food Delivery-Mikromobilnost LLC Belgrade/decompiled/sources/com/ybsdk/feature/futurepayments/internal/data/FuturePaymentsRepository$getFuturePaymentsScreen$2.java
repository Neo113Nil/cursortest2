package com.ybsdk.feature.futurepayments.internal.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.futurepayments.internal.network.FuturePaymentsApi;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Result;", "Lkqs;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.futurepayments.internal.data.FuturePaymentsRepository$getFuturePaymentsScreen$2", f = "FuturePaymentsRepository.kt", l = {18, 19}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FuturePaymentsRepository$getFuturePaymentsScreen$2 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturePaymentsRepository$getFuturePaymentsScreen$2(a aVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new FuturePaymentsRepository$getFuturePaymentsScreen$2(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((FuturePaymentsRepository$getFuturePaymentsScreen$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (r5 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        if (r6 == r0) goto L17;
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
            b.b(obj);
            FuturePaymentsApi futurePaymentsApi = this.this$0.a;
            this.label = 1;
            a = futurePaymentsApi.a(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                failure = ((Result) obj).getValue();
                return new Result(failure);
            }
            b.b(obj);
            a = ((Result) obj).getValue();
        }
        a aVar = this.this$0;
        Throwable a2 = Result.a(a);
        if (a2 == null) {
            FuturePaymentsRepository$getFuturePaymentsScreen$2$1$1 futurePaymentsRepository$getFuturePaymentsScreen$2$1$1 = new FuturePaymentsRepository$getFuturePaymentsScreen$2$1$1(aVar, null);
            this.label = 2;
            failure = com.ybsdk.core.utils.dto.b.b((DataWithStatusResponse) a, futurePaymentsRepository$getFuturePaymentsScreen$2$1$1, this);
        } else {
            failure = new Result.Failure(a2);
        }
        return new Result(failure);
    }
}
