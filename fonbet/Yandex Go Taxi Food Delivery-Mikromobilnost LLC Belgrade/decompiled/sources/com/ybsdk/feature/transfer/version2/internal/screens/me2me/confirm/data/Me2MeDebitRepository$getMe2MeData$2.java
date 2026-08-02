package com.ybsdk.feature.transfer.version2.internal.screens.me2me.confirm.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.transfer.version2.internal.network.Transfer2Api;
import com.ybsdk.feature.transfer.version2.internal.network.dto.me2me.TransferInfoMe2MeRequest;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Result;", "Ldqg;", "Ls910;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.me2me.confirm.data.Me2MeDebitRepository$getMe2MeData$2", f = "Me2MeDebitRepository.kt", l = {32, 33}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class Me2MeDebitRepository$getMe2MeData$2 extends SuspendLambda implements tls {
    final /* synthetic */ TransferInfoMe2MeRequest $request;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Me2MeDebitRepository$getMe2MeData$2(a aVar, TransferInfoMe2MeRequest transferInfoMe2MeRequest, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$request = transferInfoMe2MeRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new Me2MeDebitRepository$getMe2MeData$2(this.this$0, this.$request, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((Me2MeDebitRepository$getMe2MeData$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        if (r10 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (r11 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object k;
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            Transfer2Api transfer2Api = this.this$0.a;
            TransferInfoMe2MeRequest transferInfoMe2MeRequest = this.$request;
            this.label = 1;
            k = transfer2Api.k(transferInfoMe2MeRequest, this);
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
            k = ((Result) obj).getValue();
        }
        a aVar = this.this$0;
        Throwable a = Result.a(k);
        if (a == null) {
            Me2MeDebitRepository$getMe2MeData$2$1$1 me2MeDebitRepository$getMe2MeData$2$1$1 = new Me2MeDebitRepository$getMe2MeData$2$1$1(2, aVar, a.class, "toMe2MeDebit", "toMe2MeDebit(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitPageInfoDto;)Lcom/ybsdk/feature/transfer/version2/internal/screens/me2me/confirm/domain/Me2MeDebitSuccessEntity;", 4);
            this.label = 2;
            failure = com.ybsdk.core.utils.dto.b.d((DataWithStatusResponse) k, me2MeDebitRepository$getMe2MeData$2$1$1, this);
        } else {
            failure = new Result.Failure(a);
        }
        return new Result(failure);
    }
}
