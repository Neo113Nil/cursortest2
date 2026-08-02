package com.yandex.go.route.interactor;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.d0l0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.ur40;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Pair;", "Ld0l0;", "Lpex0;", "<destruct>", "<anonymous>", "(Lkotlin/Pair;)Ld0l0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.route.interactor.TariffRouteInteractorImpl$routeFlow$2", f = "TariffRouteInteractorImpl.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class TariffRouteInteractorImpl$routeFlow$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffRouteInteractorImpl$routeFlow$2(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TariffRouteInteractorImpl$routeFlow$2 tariffRouteInteractorImpl$routeFlow$2 = new TariffRouteInteractorImpl$routeFlow$2(this.this$0, continuation);
        tariffRouteInteractorImpl$routeFlow$2.L$0 = obj;
        return tariffRouteInteractorImpl$routeFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TariffRouteInteractorImpl$routeFlow$2) create((Pair) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d0l0 d0l0Var = (d0l0) pair.getFirst();
            pex0 pex0Var = (pex0) pair.getSecond();
            boolean z = (pex0Var != null ? pex0Var.O : null) instanceof ur40;
            c cVar = this.this$0;
            if (!z) {
                return cVar.e(d0l0Var, pex0Var);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 1;
            obj = c.a(cVar, d0l0Var, pex0Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return (d0l0) obj;
    }
}
