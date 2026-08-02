package com.ybsdk.feature.card.internal.interactors;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.xj1;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Lsk11;", "Li98;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.interactors.CardActivationInteractor$activate$2$1", f = "CardActivationInteractor.kt", l = {46}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardActivationInteractor$activate$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ xj1 $agreementEntity;
    final /* synthetic */ String $cvv;
    final /* synthetic */ String $operation2FaId;
    final /* synthetic */ String $pan;
    final /* synthetic */ String $verificationToken;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardActivationInteractor$activate$2$1(b bVar, String str, String str2, xj1 xj1Var, String str3, String str4, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$pan = str;
        this.$cvv = str2;
        this.$agreementEntity = xj1Var;
        this.$verificationToken = str3;
        this.$operation2FaId = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CardActivationInteractor$activate$2$1 cardActivationInteractor$activate$2$1 = new CardActivationInteractor$activate$2$1(this.this$0, this.$pan, this.$cvv, this.$agreementEntity, this.$verificationToken, this.$operation2FaId, continuation);
        cardActivationInteractor$activate$2$1.L$0 = obj;
        return cardActivationInteractor$activate$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardActivationInteractor$activate$2$1) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = (String) this.L$0;
            com.ybsdk.feature.card.internal.repositories.b bVar = this.this$0.a;
            String str2 = this.$pan;
            String str3 = this.$cvv;
            String str4 = this.$agreementEntity.a;
            String str5 = this.$verificationToken;
            String str6 = this.$operation2FaId;
            this.label = 1;
            a = bVar.a(str2, str3, str4, str, str5, str6, this);
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
        return new Result(a);
    }
}
