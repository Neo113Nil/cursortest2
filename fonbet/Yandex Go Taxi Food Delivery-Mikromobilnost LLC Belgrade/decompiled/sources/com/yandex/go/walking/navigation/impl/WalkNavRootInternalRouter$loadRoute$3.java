package com.yandex.go.walking.navigation.impl;

import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.mapkit.transport.masstransit.RouteMetadata;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.f541;
import defpackage.j541;
import defpackage.k541;
import defpackage.m950;
import defpackage.mvg;
import defpackage.n541;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.walking.navigation.impl.WalkNavRootInternalRouter$loadRoute$3", f = "WalkNavRootInternalRouter.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class WalkNavRootInternalRouter$loadRoute$3 extends SuspendLambda implements wls {
    final /* synthetic */ f541 $payload;
    final /* synthetic */ n541 $routeAddresses;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkNavRootInternalRouter$loadRoute$3(c cVar, f541 f541Var, n541 n541Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$payload = f541Var;
        this.$routeAddresses = n541Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalkNavRootInternalRouter$loadRoute$3(this.this$0, this.$payload, this.$routeAddresses, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WalkNavRootInternalRouter$loadRoute$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RouteMetadata metadata;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.walking.navigation.impl.domain.interactor.a aVar = this.this$0.H;
            String str = this.$payload.a;
            this.label = 1;
            obj = aVar.a(str, this);
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
        Route route = (Route) obj;
        String routeId = (route == null || (metadata = route.getMetadata()) == null) ? null : metadata.getRouteId();
        pzt0 pzt0Var = this.this$0.L;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        if (routeId != null) {
            f541 f541Var = this.$payload;
            boolean z = f541Var.b;
            c cVar = this.this$0;
            n541 n541Var = this.$routeAddresses;
            if (z) {
                cVar.I.c(routeId, n541Var);
                cVar.C((m950) cVar.F.get(), new j541(cVar, 0));
            } else {
                cVar.D((m950) cVar.E.get(), f541Var, new k541(cVar, routeId, n541Var));
            }
        } else {
            c cVar2 = this.this$0;
            cVar2.C((m950) cVar2.G.get(), new b(cVar2));
        }
        return zy11.a;
    }
}
