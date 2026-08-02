package com.ybsdk.feature.transfer.internal.data;

import com.ybsdk.feature.transfer.internal.network.TransfersApi;
import com.ybsdk.feature.transfer.internal.network.dto.transfer.confirm.simplified.ConfirmSimplifiedRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.ynb1;
import defpackage.yu50;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u00040\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Result;", "Liyd0;", "Lcom/ybsdk/core/utils/dto/SecondAuthorizationResponse;", "Lcom/ybsdk/feature/transfer/internal/network/dto/transfer/TransferResultWithId;", "Lcom/ybsdk/feature/transfer/internal/network/dto/transfer/confirm/simplified/ConfirmSimplifiedResponse;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.internal.data.TransferRepository$confirmSimplified$2", f = "TransferRepository.kt", l = {139}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransferRepository$confirmSimplified$2 extends SuspendLambda implements tls {
    final /* synthetic */ int $attemptNumber;
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ ConfirmSimplifiedRequest $request;
    final /* synthetic */ String $verificationToken;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferRepository$confirmSimplified$2(a aVar, String str, String str2, int i, ConfirmSimplifiedRequest confirmSimplifiedRequest, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$idempotencyToken = str;
        this.$verificationToken = str2;
        this.$attemptNumber = i;
        this.$request = confirmSimplifiedRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TransferRepository$confirmSimplified$2(this.this$0, this.$idempotencyToken, this.$verificationToken, this.$attemptNumber, this.$request, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((TransferRepository$confirmSimplified$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            TransfersApi transfersApi = this.this$0.b;
            String str = this.$idempotencyToken;
            String str2 = yu50.a;
            Map<String, String> b = ynb1.b(new Pair(yu50.a, this.$verificationToken), new Pair("X-YB-Polling-Attempt-Number", Integer.toUnsignedString(this.$attemptNumber)));
            ConfirmSimplifiedRequest confirmSimplifiedRequest = this.$request;
            this.label = 1;
            d = transfersApi.d(str, b, confirmSimplifiedRequest, this);
            if (d == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            d = ((Result) obj).getValue();
        }
        return new Result(d);
    }
}
