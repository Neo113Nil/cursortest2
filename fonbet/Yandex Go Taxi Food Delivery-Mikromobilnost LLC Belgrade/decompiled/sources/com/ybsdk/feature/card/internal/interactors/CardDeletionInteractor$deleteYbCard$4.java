package com.ybsdk.feature.card.internal.interactors;

import com.ybsdk.feature.card.api.entities.YbCardStatusEntity;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Layp0;", "", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.interactors.CardDeletionInteractor$deleteYbCard$4", f = "CardDeletionInteractor.kt", l = {23}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardDeletionInteractor$deleteYbCard$4 extends SuspendLambda implements wls {
    final /* synthetic */ String $cardId;
    final /* synthetic */ String $verificationToken;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDeletionInteractor$deleteYbCard$4(c cVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$cardId = str;
        this.$verificationToken = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CardDeletionInteractor$deleteYbCard$4 cardDeletionInteractor$deleteYbCard$4 = new CardDeletionInteractor$deleteYbCard$4(this.this$0, this.$cardId, this.$verificationToken, continuation);
        cardDeletionInteractor$deleteYbCard$4.L$0 = obj;
        return cardDeletionInteractor$deleteYbCard$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardDeletionInteractor$deleteYbCard$4) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = (String) this.L$0;
            com.ybsdk.feature.card.internal.repositories.b bVar = this.this$0.a;
            String str2 = this.$cardId;
            YbCardStatusEntity ybCardStatusEntity = YbCardStatusEntity.DELETED;
            String str3 = this.$verificationToken;
            this.label = 1;
            l = bVar.l(str2, ybCardStatusEntity, str, str3, this);
            if (l == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            l = ((Result) obj).getValue();
        }
        return new Result(l);
    }
}
