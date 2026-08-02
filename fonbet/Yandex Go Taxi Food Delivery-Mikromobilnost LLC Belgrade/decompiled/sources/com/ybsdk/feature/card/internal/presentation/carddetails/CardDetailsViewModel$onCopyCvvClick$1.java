package com.ybsdk.feature.card.internal.presentation.carddetails;

import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardMainScreenDetailsCopyField;
import defpackage.aq51;
import defpackage.de8;
import defpackage.dzh0;
import defpackage.ge8;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Laq51;", "entity", "Lzy11;", "<anonymous>", "(Laq51;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.presentation.carddetails.CardDetailsViewModel$onCopyCvvClick$1", f = "CardDetailsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardDetailsViewModel$onCopyCvvClick$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDetailsViewModel$onCopyCvvClick$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CardDetailsViewModel$onCopyCvvClick$1 cardDetailsViewModel$onCopyCvvClick$1 = new CardDetailsViewModel$onCopyCvvClick$1(this.this$0, continuation);
        cardDetailsViewModel$onCopyCvvClick$1.L$0 = obj;
        return cardDetailsViewModel$onCopyCvvClick$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CardDetailsViewModel$onCopyCvvClick$1 cardDetailsViewModel$onCopyCvvClick$1 = (CardDetailsViewModel$onCopyCvvClick$1) create((aq51) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        cardDetailsViewModel$onCopyCvvClick$1.invokeSuspend(zy11Var);
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
        aq51 aq51Var = (aq51) this.L$0;
        this.this$0.J.b(CardMainScreenEvents$CardMainScreenDetailsCopyField.CVV);
        this.this$0.Z(new de8(dzh0.ybsdk_card_card_cvv_title, aq51Var.b));
        this.this$0.Z(new ge8(dzh0.ybsdk_card_card_cvv_copied, CardDetailsViewModel$CardDetailsTooltipAnchorView.CVV));
        return zy11.a;
    }
}
