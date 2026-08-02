package com.yandex.go.rida.bids.router;

import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.ore0;
import defpackage.ra00;
import defpackage.tse;
import defpackage.wls;
import defpackage.ynv0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.rida.bids.router.RidaBidsRootRouterImpl$returnToSummary$1$1", f = "RidaBidsRootRouterImpl.kt", l = {296}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class RidaBidsRootRouterImpl$returnToSummary$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ o2y0 $taxiOrderHolder;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RidaBidsRootRouterImpl$returnToSummary$1$1(g gVar, o2y0 o2y0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$taxiOrderHolder = o2y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RidaBidsRootRouterImpl$returnToSummary$1$1(this.this$0, this.$taxiOrderHolder, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RidaBidsRootRouterImpl$returnToSummary$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ynv0 b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g gVar = this.this$0;
            o2y0 o2y0Var = this.$taxiOrderHolder;
            this.label = 1;
            if (g.Q(gVar, o2y0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.$taxiOrderHolder.b().b.j(null);
        g gVar2 = this.this$0;
        o2y0 o2y0Var2 = this.$taxiOrderHolder;
        ra00 ra00Var = gVar2.F;
        m950 m950Var = (m950) gVar2.U.get();
        Preorder W = o2y0Var2.b().W();
        b = gVar2.S.b(null, null);
        ra00Var.b(m950Var, new ore0(W, "open summary from rida bids", b));
        return zy11.a;
    }
}
