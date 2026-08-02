package com.yandex.go.navigator.main_screen;

import defpackage.lg50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.qz60;
import defpackage.tc50;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.main_screen.MainScreenRootRouter$RouteInitializationExitListenerImpl$onExitCalledInside$1", f = "MainScreenRootRouter.kt", l = {230}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MainScreenRootRouter$RouteInitializationExitListenerImpl$onExitCalledInside$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainScreenRootRouter$RouteInitializationExitListenerImpl$onExitCalledInside$1(o oVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainScreenRootRouter$RouteInitializationExitListenerImpl$onExitCalledInside$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MainScreenRootRouter$RouteInitializationExitListenerImpl$onExitCalledInside$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.navigator.main_screen.experiement.e eVar = this.this$0.O;
            this.label = 1;
            obj = eVar.a(this);
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
        boolean z = ((tc50) obj).a;
        o oVar = this.this$0;
        if (z) {
            oVar.R(false);
        } else {
            lg50 lg50Var = oVar.P;
            lg50Var.d = null;
            lg50Var.e = false;
            oVar.Q.l(qz60.a);
            this.this$0.r(new qu(9));
        }
        return zy11.a;
    }
}
