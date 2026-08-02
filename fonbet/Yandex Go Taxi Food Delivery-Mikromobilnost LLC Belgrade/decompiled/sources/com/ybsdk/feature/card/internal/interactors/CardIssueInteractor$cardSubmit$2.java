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

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.interactors.CardIssueInteractor$cardSubmit$2", f = "CardIssueInteractor.kt", l = {32}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardIssueInteractor$cardSubmit$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $agreementId;
    final /* synthetic */ String $applicationId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardIssueInteractor$cardSubmit$2(f fVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$applicationId = str;
        this.$agreementId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CardIssueInteractor$cardSubmit$2 cardIssueInteractor$cardSubmit$2 = new CardIssueInteractor$cardSubmit$2(this.this$0, this.$applicationId, this.$agreementId, continuation);
        cardIssueInteractor$cardSubmit$2.L$0 = obj;
        return cardIssueInteractor$cardSubmit$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardIssueInteractor$cardSubmit$2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = (String) this.L$0;
            com.ybsdk.feature.card.internal.repositories.b bVar = this.this$0.b;
            String str2 = this.$applicationId;
            String str3 = this.$agreementId;
            this.label = 1;
            m = bVar.m(str2, str, str3, this);
            if (m == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            m = ((Result) obj).getValue();
        }
        return new Result(m);
    }
}
