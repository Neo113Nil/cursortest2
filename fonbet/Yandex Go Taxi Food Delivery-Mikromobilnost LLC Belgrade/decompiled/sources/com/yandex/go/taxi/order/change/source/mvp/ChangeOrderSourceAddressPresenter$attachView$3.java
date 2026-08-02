package com.yandex.go.taxi.order.change.source.mvp;

import defpackage.ac9;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.change.source.mvp.ChangeOrderSourceAddressPresenter$attachView$3", f = "ChangeOrderSourceAddressPresenter.kt", l = {386}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ChangeOrderSourceAddressPresenter$attachView$3 extends SuspendLambda implements wls {
    final /* synthetic */ ac9 $mvpView;
    Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeOrderSourceAddressPresenter$attachView$3(ac9 ac9Var, d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$mvpView = ac9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChangeOrderSourceAddressPresenter$attachView$3(this.$mvpView, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChangeOrderSourceAddressPresenter$attachView$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr a = ru.yandex.taxi.search.c.a(this.this$0.z, null, null, 3);
            this.this$0.B.getClass();
            sjh sjhVar = uyj.a;
            tpr F = e.F(a, mdh.b);
            d dVar = this.this$0;
            ac9 ac9Var = this.$mvpView;
            o oVar = new o(F, new ChangeOrderSourceAddressPresenter$attachView$3$invokeSuspend$$inlined$safeCollect$1(ac9Var, null));
            a aVar = new a(dVar, ac9Var);
            this.L$0 = null;
            this.label = 1;
            if (oVar.collect(aVar, this) == coroutineSingletons) {
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
