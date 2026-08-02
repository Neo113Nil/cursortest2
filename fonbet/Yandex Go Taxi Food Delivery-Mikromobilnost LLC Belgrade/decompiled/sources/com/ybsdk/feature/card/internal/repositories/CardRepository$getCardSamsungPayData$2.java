package com.ybsdk.feature.card.internal.repositories;

import com.ybsdk.feature.card.internal.network.PciDssCardApi;
import com.ybsdk.feature.card.internal.network.dto.PrepareSamsungPayDataRequest;
import com.ybsdk.feature.card.internal.network.dto.PrepareSamsungPayDataResponse;
import defpackage.bzl0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Result;", "Lbzl0;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.repositories.CardRepository$getCardSamsungPayData$2", f = "CardRepository.kt", l = {278}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardRepository$getCardSamsungPayData$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $cardId;
    final /* synthetic */ String $deviceId;
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ String $walletId;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepository$getCardSamsungPayData$2(b bVar, String str, String str2, String str3, String str4, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$idempotencyToken = str;
        this.$cardId = str2;
        this.$walletId = str3;
        this.$deviceId = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CardRepository$getCardSamsungPayData$2(this.this$0, this.$idempotencyToken, this.$cardId, this.$walletId, this.$deviceId, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((CardRepository$getCardSamsungPayData$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            PciDssCardApi pciDssCardApi = this.this$0.b;
            String str = this.$idempotencyToken;
            PrepareSamsungPayDataRequest prepareSamsungPayDataRequest = new PrepareSamsungPayDataRequest(this.$cardId, this.$walletId, this.$deviceId);
            this.label = 1;
            a = pciDssCardApi.a(str, prepareSamsungPayDataRequest, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        if (!(a instanceof Result.Failure)) {
            try {
                failure = new bzl0(((PrepareSamsungPayDataResponse) a).getCardInfoPayload());
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            a = failure;
        }
        return new Result(a);
    }
}
