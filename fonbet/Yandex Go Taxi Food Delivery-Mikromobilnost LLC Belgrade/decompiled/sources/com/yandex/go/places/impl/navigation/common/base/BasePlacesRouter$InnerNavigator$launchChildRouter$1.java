package com.yandex.go.places.impl.navigation.common.base;

import defpackage.a5g;
import defpackage.jjo;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q1j0;
import defpackage.sy60;
import defpackage.tls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "La5g;", "component", "Lzy11;", "<anonymous>", "(Ltse;La5g;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.navigation.common.base.BasePlacesRouter$InnerNavigator$launchChildRouter$1", f = "BasePlacesRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BasePlacesRouter$InnerNavigator$launchChildRouter$1 extends SuspendLambda implements zls {
    final /* synthetic */ tls $getRouter;
    final /* synthetic */ sy60 $onInsideExitListener;
    final /* synthetic */ Object $payload;
    final /* synthetic */ q1j0 $replaceStrategy;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePlacesRouter$InnerNavigator$launchChildRouter$1(Object obj, tls tlsVar, d dVar, sy60 sy60Var, q1j0 q1j0Var, Continuation continuation) {
        super(3, continuation);
        this.$payload = obj;
        this.$getRouter = tlsVar;
        this.this$0 = dVar;
        this.$onInsideExitListener = sy60Var;
        this.$replaceStrategy = q1j0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BasePlacesRouter$InnerNavigator$launchChildRouter$1 basePlacesRouter$InnerNavigator$launchChildRouter$1 = new BasePlacesRouter$InnerNavigator$launchChildRouter$1(this.$payload, this.$getRouter, this.this$0, this.$onInsideExitListener, this.$replaceStrategy, (Continuation) obj3);
        basePlacesRouter$InnerNavigator$launchChildRouter$1.L$0 = (a5g) obj2;
        zy11 zy11Var = zy11.a;
        basePlacesRouter$InnerNavigator$launchChildRouter$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a5g a5gVar = (a5g) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        jjo.d(a5gVar, this.$payload, false);
        jjo.c(a5gVar, this.$payload, false);
        this.this$0.B((m950) this.$getRouter.invoke(a5gVar), this.$payload, this.$onInsideExitListener, this.$replaceStrategy);
        return zy11.a;
    }
}
