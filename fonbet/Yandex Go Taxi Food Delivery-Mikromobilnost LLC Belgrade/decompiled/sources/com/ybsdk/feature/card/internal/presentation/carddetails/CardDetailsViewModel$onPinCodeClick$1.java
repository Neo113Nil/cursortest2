package com.ybsdk.feature.card.internal.presentation.carddetails;

import com.ybsdk.core.utils.text.Text;
import defpackage.dzh0;
import defpackage.fe8;
import defpackage.mvg;
import defpackage.n0t0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.presentation.carddetails.CardDetailsViewModel$onPinCodeClick$1", f = "CardDetailsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardDetailsViewModel$onPinCodeClick$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDetailsViewModel$onPinCodeClick$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardDetailsViewModel$onPinCodeClick$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CardDetailsViewModel$onPinCodeClick$1 cardDetailsViewModel$onPinCodeClick$1 = (CardDetailsViewModel$onPinCodeClick$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        cardDetailsViewModel$onPinCodeClick$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.Z(new fe8(new n0t0(new Text.Resource(dzh0.ybsdk_card_card_frozen_pin_notification), Text.Empty.INSTANCE)));
        return zy11.a;
    }
}
