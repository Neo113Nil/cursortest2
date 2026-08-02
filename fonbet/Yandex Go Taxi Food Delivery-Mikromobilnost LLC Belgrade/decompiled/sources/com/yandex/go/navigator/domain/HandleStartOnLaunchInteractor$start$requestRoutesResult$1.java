package com.yandex.go.navigator.domain;

import defpackage.hfl0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pe50;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Ll950;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.domain.HandleStartOnLaunchInteractor$start$requestRoutesResult$1", f = "HandleStartOnLaunchInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class HandleStartOnLaunchInteractor$start$requestRoutesResult$1 extends SuspendLambda implements wls {
    final /* synthetic */ pe50 $navigatorRoute;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandleStartOnLaunchInteractor$start$requestRoutesResult$1(j jVar, pe50 pe50Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
        this.$navigatorRoute = pe50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HandleStartOnLaunchInteractor$start$requestRoutesResult$1(this.this$0, this.$navigatorRoute, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        HandleStartOnLaunchInteractor$start$requestRoutesResult$1 handleStartOnLaunchInteractor$start$requestRoutesResult$1 = (HandleStartOnLaunchInteractor$start$requestRoutesResult$1) create((vpr) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        handleStartOnLaunchInteractor$start$requestRoutesResult$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.c.n(new hfl0(this.$navigatorRoute));
        this.this$0.a.c(this.$navigatorRoute);
        return zy11.a;
    }
}
