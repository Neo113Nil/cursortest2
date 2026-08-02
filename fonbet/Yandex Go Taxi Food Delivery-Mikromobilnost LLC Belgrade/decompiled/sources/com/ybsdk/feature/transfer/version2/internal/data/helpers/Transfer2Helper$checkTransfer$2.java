package com.ybsdk.feature.transfer.version2.internal.data.helpers;

import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.vg01;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u00040\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckTransferDto;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckTransferResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.data.helpers.Transfer2Helper$checkTransfer$2", f = "Transfer2Helper.kt", l = {186}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class Transfer2Helper$checkTransfer$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ TransferRequest $request;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transfer2Helper$checkTransfer$2(a aVar, String str, TransferRequest transferRequest, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$idempotencyToken = str;
        this.$request = transferRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new Transfer2Helper$checkTransfer$2(this.this$0, this.$idempotencyToken, this.$request, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((Transfer2Helper$checkTransfer$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            vg01 vg01Var = this.this$0.a;
            String str = this.$idempotencyToken;
            TransferRequest transferRequest = this.$request;
            this.label = 1;
            i = vg01Var.i(transferRequest, str, this);
            if (i == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            i = ((Result) obj).getValue();
        }
        return new Result(i);
    }
}
