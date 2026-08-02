package com.ybsdk.feature.card.internal.repositories;

import com.ybsdk.core.utils.dto.OldTwoFactorAuthResponse;
import com.ybsdk.core.utils.dto.f;
import com.ybsdk.feature.card.internal.network.PciDssCardApi;
import com.ybsdk.feature.card.internal.network.dto.YbCardDetailsRequest;
import defpackage.ec01;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sd8;
import defpackage.tls;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Result;", "Lsk11;", "Laq51;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.repositories.CardRepository$getCorpCardDetails$2", f = "CardRepository.kt", l = {130}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardRepository$getCorpCardDetails$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $cardId;
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ String $operationId;
    final /* synthetic */ String $verificationToken;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepository$getCorpCardDetails$2(b bVar, String str, String str2, String str3, String str4, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$idempotencyToken = str;
        this.$verificationToken = str2;
        this.$operationId = str3;
        this.$cardId = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CardRepository$getCorpCardDetails$2(this.this$0, this.$idempotencyToken, this.$verificationToken, this.$operationId, this.$cardId, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((CardRepository$getCorpCardDetails$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            PciDssCardApi pciDssCardApi = this.this$0.b;
            String str = this.$idempotencyToken;
            Map<String, String> b2 = ynb1.b(new Pair(yu50.a, this.$verificationToken), new Pair(yu50.e, this.$operationId));
            YbCardDetailsRequest ybCardDetailsRequest = new YbCardDetailsRequest(this.$cardId);
            this.label = 1;
            b = pciDssCardApi.b(str, b2, ybCardDetailsRequest, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            b = ((Result) obj).getValue();
        }
        Throwable a = Result.a(b);
        if (a == null) {
            failure = f.b((OldTwoFactorAuthResponse) b, new ec01(10, new sd8(19)));
        } else {
            failure = new Result.Failure(a);
        }
        return new Result(failure);
    }
}
