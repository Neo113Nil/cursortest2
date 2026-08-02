package com.yandex.go.mainscreen.superapp.orders.presentation.ui.adapter;

import com.yandex.go.superapp.orders.card.experiments.y;
import defpackage.lm70;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Llm70;", "<anonymous>", "()Llm70;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.orders.presentation.ui.adapter.SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$experimentDefaultServiceIcon$1", f = "SuperappTrackingCardUiStateInteractor.kt", l = {690}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$experimentDefaultServiceIcon$1 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$experimentDefaultServiceIcon$1(e eVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$experimentDefaultServiceIcon$1(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$experimentDefaultServiceIcon$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String s;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            y yVar = this.this$0.k;
            this.label = 1;
            obj = yVar.i(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        String str = (String) obj;
        if (str == null || (s = this.this$0.s(str)) == null) {
            return null;
        }
        return new lm70(s, null);
    }
}
