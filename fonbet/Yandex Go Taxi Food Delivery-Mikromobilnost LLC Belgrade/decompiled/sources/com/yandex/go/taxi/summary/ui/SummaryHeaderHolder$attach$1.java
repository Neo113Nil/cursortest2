package com.yandex.go.taxi.summary.ui;

import com.yandex.go.taxi.summary.interactor.g;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.v41;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.ui.SummaryHeaderHolder$attach$1", f = "SummaryHeaderHolder.kt", l = {66}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SummaryHeaderHolder$attach$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $tariffInfoFlow;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryHeaderHolder$attach$1(d dVar, tpr tprVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$tariffInfoFlow = tprVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SummaryHeaderHolder$attach$1(this.this$0, this.$tariffInfoFlow, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryHeaderHolder$attach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            g gVar = dVar.a;
            tpr tprVar = this.$tariffInfoFlow;
            if (tprVar == null) {
                tprVar = new c(((k) dVar.b).j.b());
            }
            tpr a = gVar.a(tprVar);
            v41 v41Var = new v41(28, this.this$0);
            this.label = 1;
            if (a.collect(v41Var, this) == coroutineSingletons) {
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
