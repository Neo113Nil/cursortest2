package com.yandex.go.navigator.permission;

import defpackage.a60;
import defpackage.ae50;
import defpackage.ej40;
import defpackage.kk5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v7j0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.permission.NavigatorPermissionRequestPresenter$requestPermission$1", f = "NavigatorPermissionRequestPresenter.kt", l = {44}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class NavigatorPermissionRequestPresenter$requestPermission$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $requestStartTime;
    int label;
    final /* synthetic */ ae50 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigatorPermissionRequestPresenter$requestPermission$1(ae50 ae50Var, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ae50Var;
        this.$requestStartTime = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NavigatorPermissionRequestPresenter$requestPermission$1(this.this$0, this.$requestStartTime, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NavigatorPermissionRequestPresenter$requestPermission$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ae50 ae50Var = this.this$0;
            ae50Var.D = true;
            v7j0 v7j0Var = ae50Var.C;
            this.label = 1;
            obj = ((com.yandex.go.permission.b) v7j0Var).d(1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            kk5 kk5Var = (kk5) this.this$0.A.a;
            if (kk5Var.u()) {
                kk5Var.r(new ej40(14));
            }
        } else if (System.currentTimeMillis() - this.$requestStartTime < 500) {
            ((a60) this.this$0.B).d();
        }
        return zy11.a;
    }
}
