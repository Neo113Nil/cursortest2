package com.yandex.go.summary.navigation;

import defpackage.iqv0;
import defpackage.jqv0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oiv0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.navigation.ComposeSummaryRouter$content$1$1$1", f = "ComposeSummaryRouter.kt", l = {215}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ComposeSummaryRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ iqv0 $summaryUiAction;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeSummaryRouter$content$1$1$1(e eVar, iqv0 iqv0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$summaryUiAction = iqv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ComposeSummaryRouter$content$1$1$1(this.this$0, this.$summaryUiAction, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ComposeSummaryRouter$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            jqv0 jqv0Var = eVar.I;
            iqv0 iqv0Var = this.$summaryUiAction;
            oiv0 oiv0Var = (oiv0) eVar.L0.getValue();
            this.label = 1;
            if (jqv0Var.a(iqv0Var, oiv0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
