package com.ybsdk.feature.card.internal.repositories;

import com.ybsdk.feature.card.internal.network.PciDssCardApi;
import com.ybsdk.feature.card.internal.network.dto.ClaimCardRequest;
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
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/TwoFactorAuthResponse;", "Lcom/ybsdk/feature/card/internal/network/dto/ClaimCardResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.card.internal.repositories.CardRepository$activateCard$2", f = "CardRepository.kt", l = {197}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardRepository$activateCard$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $agreementId;
    final /* synthetic */ String $cvv;
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ String $operation2FaId;
    final /* synthetic */ String $pan;
    final /* synthetic */ String $verificationToken;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepository$activateCard$2(b bVar, String str, String str2, String str3, String str4, String str5, String str6, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$idempotencyToken = str;
        this.$verificationToken = str2;
        this.$operation2FaId = str3;
        this.$pan = str4;
        this.$cvv = str5;
        this.$agreementId = str6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CardRepository$activateCard$2(this.this$0, this.$idempotencyToken, this.$verificationToken, this.$operation2FaId, this.$pan, this.$cvv, this.$agreementId, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((CardRepository$activateCard$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            PciDssCardApi pciDssCardApi = this.this$0.b;
            String str = this.$idempotencyToken;
            String str2 = yu50.a;
            Map<String, String> b = ynb1.b(new Pair(yu50.a, this.$verificationToken), new Pair(yu50.e, this.$operation2FaId));
            ClaimCardRequest claimCardRequest = new ClaimCardRequest(this.$pan, this.$cvv, this.$agreementId);
            this.label = 1;
            e = pciDssCardApi.e(str, b, claimCardRequest, this);
            if (e == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            e = ((Result) obj).getValue();
        }
        return new Result(e);
    }
}
