package com.ybsdk.feature.transfer.version2.internal.screens.fpspay.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.transfer.version2.internal.network.Transfer2Api;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Result;", "Ldqg;", "Lvas;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.fpspay.data.FpsPayRepository$getFpsPayEnrollData$2", f = "FpsPayRepository.kt", l = {35, 35}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FpsPayRepository$getFpsPayEnrollData$2 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FpsPayRepository$getFpsPayEnrollData$2(a aVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new FpsPayRepository$getFpsPayEnrollData$2(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((FpsPayRepository$getFpsPayEnrollData$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        if (r10 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        if (r11 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object q;
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            Transfer2Api transfer2Api = this.this$0.a;
            this.label = 1;
            q = transfer2Api.q(this);
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
            q = ((Result) obj).getValue();
        }
        a aVar = this.this$0;
        Throwable a = Result.a(q);
        if (a == null) {
            FpsPayRepository$getFpsPayEnrollData$2$1$1 fpsPayRepository$getFpsPayEnrollData$2$1$1 = new FpsPayRepository$getFpsPayEnrollData$2$1$1(2, aVar, a.class, "toFpsPayEnroll", "toFpsPayEnroll(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/fpspay/FpsPayEnrollDto;)Lcom/ybsdk/feature/transfer/version2/internal/screens/fpspay/domain/FpsPayEnrollSuccessEntity;", 4);
            this.label = 2;
            failure = com.ybsdk.core.utils.dto.b.d((DataWithStatusResponse) q, fpsPayRepository$getFpsPayEnrollData$2$1$1, this);
        } else {
            failure = new Result.Failure(a);
        }
        return new Result(failure);
    }
}
