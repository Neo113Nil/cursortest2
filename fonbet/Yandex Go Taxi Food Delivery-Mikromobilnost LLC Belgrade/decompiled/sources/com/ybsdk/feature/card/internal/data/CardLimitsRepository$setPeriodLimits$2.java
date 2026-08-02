package com.ybsdk.feature.card.internal.data;

import com.ybsdk.feature.card.internal.network.CardApi;
import com.ybsdk.feature.card.internal.network.dto.SetPeriodLimitsRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.ynb1;
import defpackage.yu50;
import defpackage.zy11;
import java.math.BigDecimal;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Result;", "Liyd0;", "Lcom/ybsdk/core/utils/dto/SecondAuthorizationResponse;", "Lcom/ybsdk/feature/card/internal/network/dto/SetPeriodLimitsResponse;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.data.CardLimitsRepository$setPeriodLimits$2", f = "CardLimitsRepository.kt", l = {38}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardLimitsRepository$setPeriodLimits$2 extends SuspendLambda implements tls {
    final /* synthetic */ BigDecimal $amount;
    final /* synthetic */ int $attemptNumber;
    final /* synthetic */ String $cardId;
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ String $settingKey;
    final /* synthetic */ String $verificationToken;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardLimitsRepository$setPeriodLimits$2(a aVar, String str, String str2, BigDecimal bigDecimal, String str3, String str4, int i, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$cardId = str;
        this.$settingKey = str2;
        this.$amount = bigDecimal;
        this.$idempotencyToken = str3;
        this.$verificationToken = str4;
        this.$attemptNumber = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CardLimitsRepository$setPeriodLimits$2(this.this$0, this.$cardId, this.$settingKey, this.$amount, this.$idempotencyToken, this.$verificationToken, this.$attemptNumber, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((CardLimitsRepository$setPeriodLimits$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            b.b(obj);
            CardApi cardApi = this.this$0.a;
            SetPeriodLimitsRequest setPeriodLimitsRequest = new SetPeriodLimitsRequest(this.$cardId, this.$settingKey, this.$amount);
            String str = this.$idempotencyToken;
            String str2 = yu50.a;
            Map<String, String> b = ynb1.b(new Pair(yu50.a, this.$verificationToken), new Pair("X-YB-Polling-Attempt-Number", Integer.toUnsignedString(this.$attemptNumber)));
            this.label = 1;
            i = cardApi.i(setPeriodLimitsRequest, str, b, this);
            if (i == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            i = ((Result) obj).getValue();
        }
        return new Result(i);
    }
}
