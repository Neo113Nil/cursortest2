package com.yandex.go.taxi.summary.interactor;

import defpackage.cov0;
import defpackage.g92;
import defpackage.jha1;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.w511;
import defpackage.xev0;
import defpackage.yev0;
import defpackage.zev0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.interactor.SummaryRouteBlockStateInteractor$special$$inlined$flatMapLatest$1", f = "SummaryRouteBlockStateInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class SummaryRouteBlockStateInteractor$special$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ cov0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryRouteBlockStateInteractor$special$$inlined$flatMapLatest$1(Continuation continuation, cov0 cov0Var) {
        super(3, continuation);
        this.this$0 = cov0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SummaryRouteBlockStateInteractor$special$$inlined$flatMapLatest$1 summaryRouteBlockStateInteractor$special$$inlined$flatMapLatest$1 = new SummaryRouteBlockStateInteractor$special$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        summaryRouteBlockStateInteractor$special$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        summaryRouteBlockStateInteractor$special$$inlined$flatMapLatest$1.L$1 = obj2;
        return summaryRouteBlockStateInteractor$special$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr g92Var;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            zev0 zev0Var = (zev0) obj2;
            if (jl40.l(zev0Var, xev0.a)) {
                cov0 cov0Var = this.this$0;
                g92Var = kotlinx.coroutines.flow.e.t(new i(cov0Var.a.a(cov0Var.c.b(), jha1.e(cov0Var.b))));
            } else {
                if (!jl40.l(zev0Var, yev0.a)) {
                    w511.b();
                    return null;
                }
                g92Var = new g92(2, null);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(g92Var, vprVar, this) == coroutineSingletons) {
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
