package com.yandex.go.summary.navigation;

import com.yandex.go.summary.analytics.SummaryAnalytics$SummaryCollapseReasonV2;
import defpackage.fdv0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pev0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.navigation.ComposeSummaryRouter$backPressedCallback$1$handleOnBackPressed$1", f = "ComposeSummaryRouter.kt", l = {193}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ComposeSummaryRouter$backPressedCallback$1$handleOnBackPressed$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeSummaryRouter$backPressedCallback$1$handleOnBackPressed$1(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ComposeSummaryRouter$backPressedCallback$1$handleOnBackPressed$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ComposeSummaryRouter$backPressedCallback$1$handleOnBackPressed$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            pev0 pev0Var = this.this$0.J;
            fdv0 fdv0Var = new fdv0(SummaryAnalytics$SummaryCollapseReasonV2.SystemBack);
            this.label = 1;
            if (pev0Var.a(fdv0Var, this) == coroutineSingletons) {
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
