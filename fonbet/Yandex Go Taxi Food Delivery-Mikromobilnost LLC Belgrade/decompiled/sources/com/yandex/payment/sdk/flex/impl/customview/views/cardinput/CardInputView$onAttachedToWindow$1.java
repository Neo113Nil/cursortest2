package com.yandex.payment.sdk.flex.impl.customview.views.cardinput;

import defpackage.mvg;
import defpackage.nh8;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xw4;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.sdk.flex.impl.customview.views.cardinput.CardInputView$onAttachedToWindow$1", f = "CardInputView.kt", l = {119}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class CardInputView$onAttachedToWindow$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ CardInputView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardInputView$onAttachedToWindow$1(CardInputView cardInputView, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cardInputView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardInputView$onAttachedToWindow$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardInputView$onAttachedToWindow$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        nh8 nh8Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            nh8Var = this.this$0.viewController;
            r0 r0Var = nh8Var.j;
            xw4 xw4Var = new xw4(21, this.this$0);
            this.label = 1;
            if (r0Var.collect(xw4Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        ny61.A();
        return null;
    }
}
