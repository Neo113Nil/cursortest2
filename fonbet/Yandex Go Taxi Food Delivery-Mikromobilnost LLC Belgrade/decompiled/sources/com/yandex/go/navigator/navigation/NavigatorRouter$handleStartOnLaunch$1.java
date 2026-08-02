package com.yandex.go.navigator.navigation;

import com.yandex.go.navigator.domain.j;
import defpackage.dg50;
import defpackage.dlm;
import defpackage.hfl0;
import defpackage.jlm;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pe50;
import defpackage.tse;
import defpackage.ud50;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.navigation.NavigatorRouter$handleStartOnLaunch$1", f = "NavigatorRouter.kt", l = {326}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class NavigatorRouter$handleStartOnLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ pe50 $newRoute;
    final /* synthetic */ boolean $showVerticals;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigatorRouter$handleStartOnLaunch$1(e eVar, pe50 pe50Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$newRoute = pe50Var;
        this.$showVerticals = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NavigatorRouter$handleStartOnLaunch$1(this.this$0, this.$newRoute, this.$showVerticals, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NavigatorRouter$handleStartOnLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            j jVar = this.this$0.a0;
            pe50 pe50Var = this.$newRoute;
            this.label = 1;
            a = jVar.a(pe50Var, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        this.this$0.T();
        boolean z = a instanceof Result.Failure;
        e eVar = this.this$0;
        if (z) {
            eVar.D((m950) eVar.P.get(), new dg50(this.$showVerticals, new hfl0(this.$newRoute)), new jlm(eVar, 2));
        } else {
            ud50 ud50Var = (ud50) eVar.x;
            boolean z2 = false;
            if (ud50Var != null && ud50Var.e) {
                z2 = true;
            }
            eVar.W(new dlm(true, z2));
        }
        return zy11.a;
    }
}
