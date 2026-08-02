package com.yandex.go.taxi.order.support.ui.support_menu;

import com.yandex.go.taxi.order.support.data.repositories.a;
import defpackage.l7s0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rjw0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.support.ui.support_menu.SupportMenuPresenter$attachView$3", f = "SupportMenuPresenter.kt", l = {56}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SupportMenuPresenter$attachView$3 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ rjw0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportMenuPresenter$attachView$3(rjw0 rjw0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = rjw0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SupportMenuPresenter$attachView$3(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SupportMenuPresenter$attachView$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            l7s0 l7s0Var = this.this$0.z;
            this.label = 1;
            if (((a) l7s0Var.a).b(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
