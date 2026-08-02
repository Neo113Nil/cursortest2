package com.yandex.go.taxi.summary.mobilityhub.interactor;

import com.yandex.mapkit.transport.masstransit.Route;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uu40;
import defpackage.wls;
import defpackage.xsj0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lxsj0;", "<anonymous>", "(Ltse;)Lxsj0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.interactor.ResolveRouteUriInteractor$resolveMtTaxiRouteUri$2", f = "ResolveRouteUriInteractor.kt", l = {65}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ResolveRouteUriInteractor$resolveMtTaxiRouteUri$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $routeUri;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResolveRouteUriInteractor$resolveMtTaxiRouteUri$2(n nVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nVar;
        this.$routeUri = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ResolveRouteUriInteractor$resolveMtTaxiRouteUri$2(this.this$0, this.$routeUri, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ResolveRouteUriInteractor$resolveMtTaxiRouteUri$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            uu40 uu40Var = (uu40) this.this$0.e.get();
            String str = this.$routeUri;
            this.label = 1;
            b = ((com.yandex.go.multimodal_route.interactors.c) uu40Var).b(str, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            b = ((Result) obj).getValue();
        }
        Throwable a = Result.a(b);
        if (a != null) {
            jst.e.j(a);
        }
        if (b instanceof Result.Failure) {
            b = null;
        }
        Route route = (Route) b;
        if (route == null) {
            route = null;
        }
        if (route != null) {
            return new xsj0(route);
        }
        return null;
    }
}
