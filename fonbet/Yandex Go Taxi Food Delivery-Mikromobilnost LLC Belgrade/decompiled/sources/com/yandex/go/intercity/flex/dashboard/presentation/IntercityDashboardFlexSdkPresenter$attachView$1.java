package com.yandex.go.intercity.flex.dashboard.presentation;

import defpackage.mdh;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sew;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.n;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.intercity.flex.dashboard.presentation.IntercityDashboardFlexSdkPresenter$attachView$1", f = "IntercityDashboardFlexSdkPresenter.kt", l = {41}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class IntercityDashboardFlexSdkPresenter$attachView$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercityDashboardFlexSdkPresenter$attachView$1(h hVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IntercityDashboardFlexSdkPresenter$attachView$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((IntercityDashboardFlexSdkPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g gVar = this.this$0.B;
            n nVar = new n(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.K(gVar.h, new b(new mth(new j0(null, new mth(gVar.f.a, 6), new IntercityDashboardFlexSdkInteractorImpl$routeStatsParamsChangesFlow$$inlined$withPreviousEmit$1(3, null)), 6))), new IntercityDashboardFlexSdkInteractorImpl$getFlexDocumentStateFlow$1(gVar, null)), new IntercityDashboardFlexSdkInteractorImpl$getFlexDocumentStateFlow$2(gVar, null));
            this.this$0.C.getClass();
            sjh sjhVar = uyj.a;
            tpr F = kotlinx.coroutines.flow.e.F(nVar, mdh.b);
            sew sewVar = this.this$0.F;
            this.label = 1;
            if (F.collect(sewVar, this) == coroutineSingletons) {
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
