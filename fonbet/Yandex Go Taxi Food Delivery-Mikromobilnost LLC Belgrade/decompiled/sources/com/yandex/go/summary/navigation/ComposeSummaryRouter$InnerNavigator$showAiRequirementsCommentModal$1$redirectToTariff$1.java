package com.yandex.go.summary.navigation;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pqv0;
import defpackage.tse;
import defpackage.vqv0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.navigation.ComposeSummaryRouter$InnerNavigator$showAiRequirementsCommentModal$1$redirectToTariff$1", f = "ComposeSummaryRouter.kt", l = {449}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ComposeSummaryRouter$InnerNavigator$showAiRequirementsCommentModal$1$redirectToTariff$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $requirement;
    final /* synthetic */ String $tariffClass;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeSummaryRouter$InnerNavigator$showAiRequirementsCommentModal$1$redirectToTariff$1(e eVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$tariffClass = str;
        this.$requirement = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ComposeSummaryRouter$InnerNavigator$showAiRequirementsCommentModal$1$redirectToTariff$1(this.this$0, this.$tariffClass, this.$requirement, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ComposeSummaryRouter$InnerNavigator$showAiRequirementsCommentModal$1$redirectToTariff$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vqv0 vqv0Var = this.this$0.i0;
            pqv0 pqv0Var = new pqv0(this.$tariffClass, this.$requirement);
            this.label = 1;
            if (vqv0Var.a.emit(pqv0Var, this) == coroutineSingletons) {
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
