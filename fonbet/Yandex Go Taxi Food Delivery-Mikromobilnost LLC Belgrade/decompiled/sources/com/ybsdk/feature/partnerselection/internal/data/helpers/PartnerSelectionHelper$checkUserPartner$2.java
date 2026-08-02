package com.ybsdk.feature.partnerselection.internal.data.helpers;

import com.ybsdk.feature.partnerselection.internal.network.dto.check.CheckUserPartnerRequest;
import defpackage.ji90;
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

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u00040\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Result;", "Liyd0;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/check/PartnerCheckResultDto;", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/check/CheckUserPartnerResponse;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.partnerselection.internal.data.helpers.PartnerSelectionHelper$checkUserPartner$2", f = "PartnerSelectionHelper.kt", l = {104}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PartnerSelectionHelper$checkUserPartner$2 extends SuspendLambda implements tls {
    final /* synthetic */ int $attemptNumber;
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ CheckUserPartnerRequest $request;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerSelectionHelper$checkUserPartner$2(a aVar, String str, CheckUserPartnerRequest checkUserPartnerRequest, int i, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$idempotencyToken = str;
        this.$request = checkUserPartnerRequest;
        this.$attemptNumber = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PartnerSelectionHelper$checkUserPartner$2(this.this$0, this.$idempotencyToken, this.$request, this.$attemptNumber, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((PartnerSelectionHelper$checkUserPartner$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ji90 ji90Var = this.this$0.a;
            String str = this.$idempotencyToken;
            CheckUserPartnerRequest checkUserPartnerRequest = this.$request;
            int i2 = this.$attemptNumber;
            this.label = 1;
            c = ji90Var.c(str, checkUserPartnerRequest, i2, this);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            c = ((Result) obj).getValue();
        }
        return new Result(c);
    }
}
