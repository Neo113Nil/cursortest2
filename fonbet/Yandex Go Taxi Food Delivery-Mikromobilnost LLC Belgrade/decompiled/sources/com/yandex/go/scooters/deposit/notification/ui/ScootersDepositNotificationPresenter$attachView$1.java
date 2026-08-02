package com.yandex.go.scooters.deposit.notification.ui;

import defpackage.den0;
import defpackage.een0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rdn0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.deposit.notification.ui.ScootersDepositNotificationPresenter$attachView$1", f = "ScootersDepositNotificationPresenter.kt", l = {25}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersDepositNotificationPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ den0 $mvpView;
    Object L$0;
    int label;
    final /* synthetic */ een0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDepositNotificationPresenter$attachView$1(den0 den0Var, een0 een0Var, Continuation continuation) {
        super(2, continuation);
        this.$mvpView = den0Var;
        this.this$0 = een0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersDepositNotificationPresenter$attachView$1(this.$mvpView, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersDepositNotificationPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        den0 den0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            den0 den0Var2 = this.$mvpView;
            een0 een0Var = this.this$0;
            a aVar = een0Var.y;
            rdn0 rdn0Var = een0Var.z;
            this.L$0 = den0Var2;
            this.label = 1;
            Object a = aVar.a(rdn0Var, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = a;
            den0Var = den0Var2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            den0Var = (den0) this.L$0;
            b.b(obj);
        }
        den0Var.render(obj);
        return zy11.a;
    }
}
