package com.ybsdk.feature.transfer.version2.internal.data.helpers;

import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferConfirmVersion2Request;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.vg01;
import defpackage.ynb1;
import defpackage.yu50;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u00040\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/TwoFactorAuthResponse;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferConfirmResponseDto;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferConfirmResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.data.helpers.Transfer2Helper$confirmTransferV2$2", f = "Transfer2Helper.kt", l = {215}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class Transfer2Helper$confirmTransferV2$2 extends SuspendLambda implements tls {
    final /* synthetic */ TransferConfirmVersion2Request $confirmRequest;
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ String $operationId;
    final /* synthetic */ String $verificationToken;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transfer2Helper$confirmTransferV2$2(a aVar, String str, String str2, String str3, TransferConfirmVersion2Request transferConfirmVersion2Request, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$idempotencyToken = str;
        this.$verificationToken = str2;
        this.$operationId = str3;
        this.$confirmRequest = transferConfirmVersion2Request;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new Transfer2Helper$confirmTransferV2$2(this.this$0, this.$idempotencyToken, this.$verificationToken, this.$operationId, this.$confirmRequest, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((Transfer2Helper$confirmTransferV2$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vg01 vg01Var = this.this$0.a;
            String str = this.$idempotencyToken;
            Map b = ynb1.b(new Pair(yu50.a, this.$verificationToken), new Pair(yu50.e, this.$operationId));
            TransferConfirmVersion2Request transferConfirmVersion2Request = this.$confirmRequest;
            this.label = 1;
            g = vg01Var.g(str, b, transferConfirmVersion2Request, this);
            if (g == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            g = ((Result) obj).getValue();
        }
        return new Result(g);
    }
}
