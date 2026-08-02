package com.yandex.go.places.impl.navigation.common.base;

import defpackage.a5g;
import defpackage.h55;
import defpackage.jjo;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o1j0;
import defpackage.p1j0;
import defpackage.q1j0;
import defpackage.sy60;
import defpackage.tls;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "La5g;", "component", "Lzy11;", "<anonymous>", "(Ltse;La5g;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.navigation.common.base.BasePlacesRouter$InnerNavigator$launchChildRouterReplacing$2", f = "BasePlacesRouter.kt", l = {691}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BasePlacesRouter$InnerNavigator$launchChildRouterReplacing$2 extends SuspendLambda implements zls {
    final /* synthetic */ tls $getDefaultStrategy;
    final /* synthetic */ wls $getPayload;
    final /* synthetic */ tls $getRouter;
    final /* synthetic */ boolean $isPayloadUpdating;
    final /* synthetic */ sy60 $onInsideExitListener;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePlacesRouter$InnerNavigator$launchChildRouterReplacing$2(wls wlsVar, tls tlsVar, d dVar, boolean z, tls tlsVar2, sy60 sy60Var, Continuation continuation) {
        super(3, continuation);
        this.$getPayload = wlsVar;
        this.$getRouter = tlsVar;
        this.this$0 = dVar;
        this.$isPayloadUpdating = z;
        this.$getDefaultStrategy = tlsVar2;
        this.$onInsideExitListener = sy60Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BasePlacesRouter$InnerNavigator$launchChildRouterReplacing$2 basePlacesRouter$InnerNavigator$launchChildRouterReplacing$2 = new BasePlacesRouter$InnerNavigator$launchChildRouterReplacing$2(this.$getPayload, this.$getRouter, this.this$0, this.$isPayloadUpdating, this.$getDefaultStrategy, this.$onInsideExitListener, (Continuation) obj3);
        basePlacesRouter$InnerNavigator$launchChildRouterReplacing$2.L$0 = (a5g) obj2;
        return basePlacesRouter$InnerNavigator$launchChildRouterReplacing$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        q1j0 q1j0Var;
        a5g a5gVar = (a5g) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            wls wlsVar = this.$getPayload;
            this.L$0 = a5gVar;
            this.label = 1;
            obj = wlsVar.invoke(a5gVar, this);
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
        m950 m950Var = (m950) this.$getRouter.invoke(a5gVar);
        boolean v = this.this$0.v(m950Var);
        if (v && this.$isPayloadUpdating) {
            q1j0Var = new o1j0(m950Var);
        } else {
            q1j0Var = (q1j0) this.$getDefaultStrategy.invoke(a5gVar);
            if (q1j0Var == null) {
                q1j0Var = p1j0.a;
            }
        }
        if (v && !this.$isPayloadUpdating) {
            ((h55) m950Var).i();
        }
        this.this$0.B(m950Var, obj, this.$onInsideExitListener, q1j0Var);
        jjo.d(a5gVar, obj, false);
        jjo.c(a5gVar, obj, false);
        return zy11.a;
    }
}
