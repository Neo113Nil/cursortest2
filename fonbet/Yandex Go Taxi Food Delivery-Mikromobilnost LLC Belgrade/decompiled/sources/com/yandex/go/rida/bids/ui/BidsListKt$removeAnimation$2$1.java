package com.yandex.go.rida.bids.ui;

import defpackage.ck11;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.rq5;
import defpackage.sls;
import defpackage.sq5;
import defpackage.tse;
import defpackage.tx40;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.rida.bids.ui.BidsListKt$removeAnimation$2$1", f = "BidsList.kt", l = {483}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BidsListKt$removeAnimation$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ oz40 $isAnimationCompleted;
    final /* synthetic */ sls $onAnimationEnd;
    final /* synthetic */ tx40 $progressState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BidsListKt$removeAnimation$2$1(tx40 tx40Var, oz40 oz40Var, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.$progressState = tx40Var;
        this.$isAnimationCompleted = oz40Var;
        this.$onAnimationEnd = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BidsListKt$removeAnimation$2$1(this.$progressState, this.$isAnimationCompleted, this.$onAnimationEnd, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BidsListKt$removeAnimation$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BidsListKt$removeAnimation$2$1 bidsListKt$removeAnimation$2$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            float floatValue = this.$progressState.getFloatValue();
            ck11 ck11Var = sq5.a;
            rq5 rq5Var = new rq5(this.$progressState, 2);
            this.label = 1;
            bidsListKt$removeAnimation$2$1 = this;
            if (androidx.compose.animation.core.e.c(floatValue, 1.0f, ck11Var, rq5Var, bidsListKt$removeAnimation$2$1, 4) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            bidsListKt$removeAnimation$2$1 = this;
        }
        bidsListKt$removeAnimation$2$1.$isAnimationCompleted.setValue(Boolean.TRUE);
        bidsListKt$removeAnimation$2$1.$onAnimationEnd.invoke();
        return zy11.a;
    }
}
