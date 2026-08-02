package com.yandex.go.taxi.summary.interactor;

import defpackage.ati;
import defpackage.ik31;
import defpackage.lct0;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oox0;
import defpackage.pex0;
import defpackage.pox0;
import defpackage.v580;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.design.sourcedestination.SourceTrailMode;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lik31;", "it", "Lzy11;", "<anonymous>", "(Lik31;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.interactor.SummarySourceDestinationModelInteractor$updateSourceDestinationFlow$2", f = "SummarySourceDestinationModelInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SummarySourceDestinationModelInteractor$updateSourceDestinationFlow$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummarySourceDestinationModelInteractor$updateSourceDestinationFlow$2(p pVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SummarySourceDestinationModelInteractor$updateSourceDestinationFlow$2 summarySourceDestinationModelInteractor$updateSourceDestinationFlow$2 = new SummarySourceDestinationModelInteractor$updateSourceDestinationFlow$2(this.this$0, continuation);
        summarySourceDestinationModelInteractor$updateSourceDestinationFlow$2.L$0 = obj;
        return summarySourceDestinationModelInteractor$updateSourceDestinationFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SummarySourceDestinationModelInteractor$updateSourceDestinationFlow$2 summarySourceDestinationModelInteractor$updateSourceDestinationFlow$2 = (SummarySourceDestinationModelInteractor$updateSourceDestinationFlow$2) create((ik31) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        summarySourceDestinationModelInteractor$updateSourceDestinationFlow$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        v580 v580Var;
        v580 v580Var2;
        ik31 ik31Var = (ik31) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        p pVar = this.this$0;
        pVar.getClass();
        mi31 mi31Var = ik31Var.b;
        lct0 lct0Var = pVar.n;
        pex0 pex0Var = mi31Var.a;
        oox0 oox0Var = pex0Var.r;
        pox0 pox0Var = oox0Var.c;
        ati atiVar = pex0Var.Z;
        String str = (atiVar == null || (v580Var2 = atiVar.b) == null) ? null : v580Var2.b.b;
        String str2 = (atiVar == null || (v580Var = atiVar.b) == null) ? null : v580Var.b.a;
        lct0Var.h = str;
        if (str2 == null) {
            str2 = oox0Var.a;
        }
        lct0Var.i = str2;
        lct0Var.j = pox0Var.a;
        lct0Var.k = pVar.m.g(null, pox0Var);
        pVar.d();
        pVar.n.c = pVar.f.a(pVar.g.a.P) ? SourceTrailMode.PORCH : SourceTrailMode.NONE;
        pVar.a();
        pVar.d();
        return zy11.a;
    }
}
