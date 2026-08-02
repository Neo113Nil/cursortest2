package com.yandex.go.superapp.discovery.map.impl.navigation.common;

import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pvv0;
import defpackage.q1j0;
import defpackage.sy60;
import defpackage.tse;
import defpackage.wls;
import defpackage.wvv0;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.discovery.map.impl.navigation.common.SuperAppDiscoveryMapBaseModalViewRouter$launchChildRouter$1", f = "SuperAppDiscoveryMapBaseModalViewRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SuperAppDiscoveryMapBaseModalViewRouter$launchChildRouter$1 extends SuspendLambda implements wls {
    final /* synthetic */ sy60 $onInsideExitListener;
    final /* synthetic */ Object $payload;
    final /* synthetic */ q1j0 $replaceStrategy;
    final /* synthetic */ yvf0 $routerProvider;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppDiscoveryMapBaseModalViewRouter$launchChildRouter$1(a aVar, Object obj, yvf0 yvf0Var, sy60 sy60Var, q1j0 q1j0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$payload = obj;
        this.$routerProvider = yvf0Var;
        this.$onInsideExitListener = sy60Var;
        this.$replaceStrategy = q1j0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppDiscoveryMapBaseModalViewRouter$launchChildRouter$1(this.this$0, this.$payload, this.$routerProvider, this.$onInsideExitListener, this.$replaceStrategy, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SuperAppDiscoveryMapBaseModalViewRouter$launchChildRouter$1 superAppDiscoveryMapBaseModalViewRouter$launchChildRouter$1 = (SuperAppDiscoveryMapBaseModalViewRouter$launchChildRouter$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        superAppDiscoveryMapBaseModalViewRouter$launchChildRouter$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        Object obj2 = this.$payload;
        aVar.getClass();
        pvv0 pvv0Var = obj2 instanceof wvv0 ? ((wvv0) obj2).a : null;
        if (pvv0Var != null) {
            aVar.E.a.set(pvv0Var);
        }
        this.this$0.B((m950) this.$routerProvider.get(), this.$payload, this.$onInsideExitListener, this.$replaceStrategy);
        return zy11.a;
    }
}
