package com.yandex.go.navigator.navigation;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.ud50;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.navigation.NavigatorRouter$startNavigator$1", f = "NavigatorRouter.kt", l = {213}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class NavigatorRouter$startNavigator$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $deeplinkRouteStop;
    final /* synthetic */ ud50 $payload;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigatorRouter$startNavigator$1(e eVar, ud50 ud50Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$payload = ud50Var;
        this.$deeplinkRouteStop = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NavigatorRouter$startNavigator$1(this.this$0, this.$payload, this.$deeplinkRouteStop, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NavigatorRouter$startNavigator$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            ud50 ud50Var = this.$payload;
            zzs zzsVar = ud50Var.a;
            String str = this.$deeplinkRouteStop;
            this.label = 1;
            if (e.S(eVar, zzsVar, str, ud50Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
