package com.ybsdk.feature.card.internal.interactors;

import com.ybsdk.feature.card.internal.entities.GetApplicationStatusEntity$Status;
import defpackage.bqg;
import defpackage.c3t;
import defpackage.cqg;
import defpackage.dqg;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldqg;", "Lc3t;", "", "<anonymous>", "(Ldqg;)Z"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.interactors.CardReissueInteractor$getCardReissueStatus$2", f = "CardReissueInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardReissueInteractor$getCardReissueStatus$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CardReissueInteractor$getCardReissueStatus$2 cardReissueInteractor$getCardReissueStatus$2 = new CardReissueInteractor$getCardReissueStatus$2(2, continuation);
        cardReissueInteractor$getCardReissueStatus$2.L$0 = obj;
        return cardReissueInteractor$getCardReissueStatus$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardReissueInteractor$getCardReissueStatus$2) create((dqg) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        dqg dqgVar = (dqg) this.L$0;
        return Boolean.valueOf(((dqgVar instanceof cqg) && ((c3t) ((cqg) dqgVar).a).a != GetApplicationStatusEntity$Status.PROCESSING) || (dqgVar instanceof bqg));
    }
}
