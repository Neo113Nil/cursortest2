package com.ybsdk.feature.transfer.internal.data;

import com.ybsdk.feature.transfer.internal.network.TransfersApi;
import com.ybsdk.feature.transfer.internal.network.dto.CheckUserYbRequest;
import defpackage.cf91;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.uza;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Result;", "Liyd0;", "Lcom/ybsdk/feature/transfer/internal/network/dto/CheckUserTransferTargetResponse;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.internal.data.TransferRepository$checkUserPartner$2", f = "TransferRepository.kt", l = {70}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransferRepository$checkUserPartner$2 extends SuspendLambda implements tls {
    final /* synthetic */ int $attemptNumber;
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ CheckUserYbRequest $request;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferRepository$checkUserPartner$2(a aVar, String str, CheckUserYbRequest checkUserYbRequest, int i, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$idempotencyToken = str;
        this.$request = checkUserYbRequest;
        this.$attemptNumber = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TransferRepository$checkUserPartner$2(this.this$0, this.$idempotencyToken, this.$request, this.$attemptNumber, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((TransferRepository$checkUserPartner$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            TransfersApi transfersApi = this.this$0.b;
            String str = this.$idempotencyToken;
            CheckUserYbRequest checkUserYbRequest = this.$request;
            int i2 = this.$attemptNumber;
            this.label = 1;
            byte[] bArr = new byte[15];
            for (int i3 = 0; i3 < 15; i3++) {
                bArr[i3] = (byte) (cf91.e[i3] ^ cf91.a[i3 % 8]);
            }
            b = transfersApi.b(str, checkUserYbRequest, new String(bArr, uza.a), i2, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            b = ((Result) obj).getValue();
        }
        return new Result(b);
    }
}
