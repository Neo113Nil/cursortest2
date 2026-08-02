package com.yandex.go.taxi.order.change.source.mvp;

import defpackage.ac9;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.ud;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.change.source.mvp.ChangeOrderSourceAddressPresenter$attachView$2", f = "ChangeOrderSourceAddressPresenter.kt", l = {387}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ChangeOrderSourceAddressPresenter$attachView$2 extends SuspendLambda implements wls {
    final /* synthetic */ ac9 $mvpView;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeOrderSourceAddressPresenter$attachView$2(ac9 ac9Var, d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$mvpView = ac9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChangeOrderSourceAddressPresenter$attachView$2(this.$mvpView, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChangeOrderSourceAddressPresenter$attachView$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr a = this.this$0.A.b.a.a();
            ac9 ac9Var = this.$mvpView;
            d dVar = this.this$0;
            o oVar = new o(a, new ChangeOrderSourceAddressPresenter$attachView$2$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            ud udVar = new ud(7, ac9Var, dVar);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(udVar, this) == coroutineSingletons) {
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
