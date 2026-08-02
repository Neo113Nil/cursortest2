package com.yandex.go.yb.domain;

import com.yandex.go.yb.experiments.ForceYbPromosOnSummaryExperiment;
import defpackage.evu0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.mw51;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.yb.domain.ForceYbPromosOnSummaryInteractorImpl$getDeeplink$2", f = "ForceYbPromosOnSummaryInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes15.dex */
final class ForceYbPromosOnSummaryInteractorImpl$getDeeplink$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForceYbPromosOnSummaryInteractorImpl$getDeeplink$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ForceYbPromosOnSummaryInteractorImpl$getDeeplink$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ForceYbPromosOnSummaryInteractorImpl$getDeeplink$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (jl40.l(this.this$0.a.d(), mw51.a)) {
            return null;
        }
        ForceYbPromosOnSummaryExperiment forceYbPromosOnSummaryExperiment = (ForceYbPromosOnSummaryExperiment) this.this$0.c.b();
        b bVar = this.this$0;
        bVar.getClass();
        String str = forceYbPromosOnSummaryExperiment.c;
        String str2 = forceYbPromosOnSummaryExperiment.d;
        if (str == null || evu0.J(str) || str2 == null || evu0.J(str2) || !forceYbPromosOnSummaryExperiment.getB() || jl40.l(bVar.d.l("unique_tag_key", null), str2)) {
            return null;
        }
        this.this$0.e = forceYbPromosOnSummaryExperiment.d;
        return forceYbPromosOnSummaryExperiment.c;
    }
}
