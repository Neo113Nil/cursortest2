package com.yandex.go.yb.ui;

import defpackage.aav0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qit0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.yb.ui.SuggestYbCardInRidePresenter$onAcceptClick$1", f = "SuggestYbCardInRidePresenter.kt", l = {151}, m = "invokeSuspend", v = 2)
/* loaded from: classes15.dex */
final class SuggestYbCardInRidePresenter$onAcceptClick$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ aav0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestYbCardInRidePresenter$onAcceptClick$1(aav0 aav0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aav0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuggestYbCardInRidePresenter$onAcceptClick$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuggestYbCardInRidePresenter$onAcceptClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            aav0 aav0Var = this.this$0;
            tpr a = aav0Var.z.a(aav0Var.x, aav0Var.y.b().a);
            aav0 aav0Var2 = this.this$0;
            o oVar = new o(a, new SuggestYbCardInRidePresenter$onAcceptClick$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            qit0 qit0Var = new qit0(7, aav0Var2);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(qit0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
