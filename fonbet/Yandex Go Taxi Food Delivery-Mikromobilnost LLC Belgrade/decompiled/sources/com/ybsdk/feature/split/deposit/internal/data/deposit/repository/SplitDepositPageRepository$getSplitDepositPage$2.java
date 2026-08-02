package com.ybsdk.feature.split.deposit.internal.data.deposit.repository;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.split.deposit.internal.data.network.SplitDepositApi;
import com.ybsdk.feature.split.deposit.internal.data.network.dto.GetDepositPageRequest;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Result;", "Lztt0;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.split.deposit.internal.data.deposit.repository.SplitDepositPageRepository$getSplitDepositPage$2", f = "SplitDepositPageRepository.kt", l = {32, 39}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SplitDepositPageRepository$getSplitDepositPage$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $orderId;
    final /* synthetic */ String $previousPaymentIndex;
    final /* synthetic */ String $scenario;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitDepositPageRepository$getSplitDepositPage$2(a aVar, String str, String str2, String str3, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$scenario = str;
        this.$orderId = str2;
        this.$previousPaymentIndex = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SplitDepositPageRepository$getSplitDepositPage$2(this.this$0, this.$scenario, this.$orderId, this.$previousPaymentIndex, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((SplitDepositPageRepository$getSplitDepositPage$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (r8 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (r9 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            SplitDepositApi splitDepositApi = this.this$0.a;
            GetDepositPageRequest getDepositPageRequest = new GetDepositPageRequest(this.$scenario, this.$orderId, this.$previousPaymentIndex);
            this.label = 1;
            b = splitDepositApi.b(getDepositPageRequest, this);
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
            b = ((Result) obj).getValue();
        }
        a aVar = this.this$0;
        Throwable a = Result.a(b);
        if (a == null) {
            SplitDepositPageRepository$getSplitDepositPage$2$1$1 splitDepositPageRepository$getSplitDepositPage$2$1$1 = new SplitDepositPageRepository$getSplitDepositPage$2$1$1(aVar, null);
            this.label = 2;
            failure = com.ybsdk.core.utils.dto.b.b((DataWithStatusResponse) b, splitDepositPageRepository$getSplitDepositPage$2$1$1, this);
        } else {
            failure = new Result.Failure(a);
        }
        return new Result(failure);
    }
}
