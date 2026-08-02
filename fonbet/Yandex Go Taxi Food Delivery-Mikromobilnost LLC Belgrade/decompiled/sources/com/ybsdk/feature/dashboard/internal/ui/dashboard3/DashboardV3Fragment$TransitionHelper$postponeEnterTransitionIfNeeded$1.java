package com.ybsdk.feature.dashboard.internal.ui.dashboard3;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.dashboard.internal.ui.dashboard3.DashboardV3Fragment$TransitionHelper$postponeEnterTransitionIfNeeded$1", f = "DashboardV3Fragment.kt", l = {495}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DashboardV3Fragment$TransitionHelper$postponeEnterTransitionIfNeeded$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ DashboardV3Fragment this$0;
    final /* synthetic */ a this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardV3Fragment$TransitionHelper$postponeEnterTransitionIfNeeded$1(DashboardV3Fragment dashboardV3Fragment, a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dashboardV3Fragment;
        this.this$1 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DashboardV3Fragment$TransitionHelper$postponeEnterTransitionIfNeeded$1(this.this$0, this.this$1, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DashboardV3Fragment$TransitionHelper$postponeEnterTransitionIfNeeded$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.label = 1;
            if (kotlinx.coroutines.a.i(600L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.this$0.startPostponedEnterTransition();
        this.this$1.d = true;
        return zy11.a;
    }
}
