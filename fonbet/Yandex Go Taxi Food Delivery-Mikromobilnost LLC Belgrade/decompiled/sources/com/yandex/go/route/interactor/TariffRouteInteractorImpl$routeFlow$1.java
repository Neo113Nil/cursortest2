package com.yandex.go.route.interactor;

import defpackage.d0l0;
import defpackage.fnx0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import java.util.Optional;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ld0l0;", "route", "Ljava/util/Optional;", "Lfnx0;", "selectedTariffOptional", "Lkotlin/Pair;", "Lpex0;", "<anonymous>", "(Ld0l0;Ljava/util/Optional;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.route.interactor.TariffRouteInteractorImpl$routeFlow$1", f = "TariffRouteInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class TariffRouteInteractorImpl$routeFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TariffRouteInteractorImpl$routeFlow$1 tariffRouteInteractorImpl$routeFlow$1 = new TariffRouteInteractorImpl$routeFlow$1(3, (Continuation) obj3);
        tariffRouteInteractorImpl$routeFlow$1.L$0 = (d0l0) obj;
        tariffRouteInteractorImpl$routeFlow$1.L$1 = (Optional) obj2;
        return tariffRouteInteractorImpl$routeFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        d0l0 d0l0Var = (d0l0) this.L$0;
        Optional optional = (Optional) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        fnx0 fnx0Var = (fnx0) optional.orElse(null);
        return new Pair(d0l0Var, fnx0Var != null ? fnx0Var.c : null);
    }
}
