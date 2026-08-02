package com.ybsdk.feature.card.internal.repositories;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.feature.card.internal.network.dto.ClaimCardResponse;
import defpackage.i98;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/ClaimCardResponse;", TarifficatorScenarioActivity.RESULT_KEY, "Li98;", "<anonymous>", "(Lcom/ybsdk/feature/card/internal/network/dto/ClaimCardResponse;)Li98;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.repositories.CardRepository$activateCard$3$1", f = "CardRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardRepository$activateCard$3$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CardRepository$activateCard$3$1 cardRepository$activateCard$3$1 = new CardRepository$activateCard$3$1(2, continuation);
        cardRepository$activateCard$3$1.L$0 = obj;
        return cardRepository$activateCard$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardRepository$activateCard$3$1) create((ClaimCardResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new i98(((ClaimCardResponse) this.L$0).getApplicationId());
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
