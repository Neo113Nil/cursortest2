package com.yandex.go.navigator.driving;

import defpackage.cf50;
import defpackage.m950;
import defpackage.mvg;
import defpackage.nkm;
import defpackage.nkr0;
import defpackage.ny61;
import defpackage.sy60;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.driving.DrivingModalRouter$InnerDrivingModalNavigator$onShareRouteClicked$1", f = "DrivingModalRouter.kt", l = {119}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DrivingModalRouter$InnerDrivingModalNavigator$onShareRouteClicked$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ nkm this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrivingModalRouter$InnerDrivingModalNavigator$onShareRouteClicked$1(nkm nkmVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nkmVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DrivingModalRouter$InnerDrivingModalNavigator$onShareRouteClicked$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DrivingModalRouter$InnerDrivingModalNavigator$onShareRouteClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.navigator.share.experiment.c cVar = this.this$0.L;
            this.label = 1;
            obj = cVar.a(this);
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
        cf50 cf50Var = (cf50) obj;
        boolean z = cf50Var.a;
        zy11 zy11Var = zy11.a;
        if (!z) {
            return zy11Var;
        }
        nkm nkmVar = this.this$0;
        nkmVar.D((m950) nkmVar.K.get(), new nkr0(cf50Var.b, cf50Var.c), sy60.Q2);
        return zy11Var;
    }
}
