package com.ybsdk.feature.card.internal.interactors;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Lbzl0;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.interactors.CardDetailsInteractor$getCardSamsungPayData$2", f = "CardDetailsInteractor.kt", l = {HProv.PP_HASHOID}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardDetailsInteractor$getCardSamsungPayData$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $cardId;
    final /* synthetic */ String $deviceId;
    final /* synthetic */ String $walletId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDetailsInteractor$getCardSamsungPayData$2(d dVar, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$cardId = str;
        this.$walletId = str2;
        this.$deviceId = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CardDetailsInteractor$getCardSamsungPayData$2 cardDetailsInteractor$getCardSamsungPayData$2 = new CardDetailsInteractor$getCardSamsungPayData$2(this.this$0, this.$cardId, this.$walletId, this.$deviceId, continuation);
        cardDetailsInteractor$getCardSamsungPayData$2.L$0 = obj;
        return cardDetailsInteractor$getCardSamsungPayData$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardDetailsInteractor$getCardSamsungPayData$2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = (String) this.L$0;
            com.ybsdk.feature.card.internal.repositories.b bVar = this.this$0.a;
            String str2 = this.$cardId;
            String str3 = this.$walletId;
            String str4 = this.$deviceId;
            this.label = 1;
            f = bVar.f(str2, str3, str4, str, this);
            if (f == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            f = ((Result) obj).getValue();
        }
        return new Result(f);
    }
}
