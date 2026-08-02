package com.ybsdk.feature.card.internal.repositories;

import com.ybsdk.feature.card.api.entities.YbCardStatusEntity;
import com.ybsdk.feature.card.internal.network.CardApi;
import com.ybsdk.feature.card.internal.network.dto.YbCardSetStatusRequest;
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
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/SecondAuthorizationResponse;", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.card.internal.repositories.CardRepository$setYbCardStatus$2", f = "CardRepository.kt", l = {HProv.PP_REFCOUNT}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardRepository$setYbCardStatus$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $cardId;
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ YbCardStatusEntity $status;
    final /* synthetic */ String $verificationToken;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepository$setYbCardStatus$2(b bVar, String str, YbCardStatusEntity ybCardStatusEntity, String str2, String str3, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$cardId = str;
        this.$status = ybCardStatusEntity;
        this.$idempotencyToken = str2;
        this.$verificationToken = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CardRepository$setYbCardStatus$2(this.this$0, this.$cardId, this.$status, this.$idempotencyToken, this.$verificationToken, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((CardRepository$setYbCardStatus$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            CardApi cardApi = this.this$0.a;
            YbCardSetStatusRequest ybCardSetStatusRequest = new YbCardSetStatusRequest(this.$cardId, this.$status);
            String str = this.$idempotencyToken;
            String str2 = yu50.a;
            Map<String, String> b = ynb1.b(new Pair(yu50.a, this.$verificationToken));
            this.label = 1;
            h = cardApi.h(ybCardSetStatusRequest, str, b, this);
            if (h == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            h = ((Result) obj).getValue();
        }
        return new Result(h);
    }
}
