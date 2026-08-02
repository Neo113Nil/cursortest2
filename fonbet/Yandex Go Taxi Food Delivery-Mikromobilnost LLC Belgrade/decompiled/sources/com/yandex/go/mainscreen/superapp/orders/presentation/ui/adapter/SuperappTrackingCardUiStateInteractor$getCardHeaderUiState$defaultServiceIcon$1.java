package com.yandex.go.mainscreen.superapp.orders.presentation.ui.adapter;

import com.yandex.go.coroutines.h;
import defpackage.hm70;
import defpackage.lm70;
import defpackage.lzg0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkm70;", "<anonymous>", "()Lkm70;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.orders.presentation.ui.adapter.SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$defaultServiceIcon$1", f = "SuperappTrackingCardUiStateInteractor.kt", l = {696}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$defaultServiceIcon$1 extends SuspendLambda implements tls {
    final /* synthetic */ h $experimentDefaultServiceIcon;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$defaultServiceIcon$1(h hVar, Continuation continuation) {
        super(1, continuation);
        this.$experimentDefaultServiceIcon = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$defaultServiceIcon$1(this.$experimentDefaultServiceIcon, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$defaultServiceIcon$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            h hVar = this.$experimentDefaultServiceIcon;
            this.label = 1;
            obj = hVar.a(this);
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
        lm70 lm70Var = (lm70) obj;
        return lm70Var != null ? lm70Var : new hm70(lzg0.ic_delivery_box);
    }
}
