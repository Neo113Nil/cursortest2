package com.ybsdk.feature.card.internal.interactors;

import defpackage.ayp0;
import defpackage.egy;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zxp0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Layp0;", "Lggy;", "", "<anonymous>", "(Layp0;)Z"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.interactors.CardLimitInteractor$saveCardLimit$2", f = "CardLimitInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardLimitInteractor$saveCardLimit$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CardLimitInteractor$saveCardLimit$2 cardLimitInteractor$saveCardLimit$2 = new CardLimitInteractor$saveCardLimit$2(2, continuation);
        cardLimitInteractor$saveCardLimit$2.L$0 = obj;
        return cardLimitInteractor$saveCardLimit$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardLimitInteractor$saveCardLimit$2) create((ayp0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ayp0 ayp0Var = (ayp0) this.L$0;
        return Boolean.valueOf(!((ayp0Var instanceof zxp0) && (((zxp0) ayp0Var).a instanceof egy)));
    }
}
