package com.yandex.go.superapp.order.multi.old.view;

import com.yandex.go.taxi.order.stack.OrderStackMvpView;
import defpackage.c680;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.order.multi.old.view.OrderStackViewPresenter$fetchAnimationType$1", f = "OrderStackViewPresenter.kt", l = {668}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderStackViewPresenter$fetchAnimationType$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $onAnimationTypeReady;
    final /* synthetic */ String $orderId;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderStackViewPresenter$fetchAnimationType$1(f fVar, String str, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$orderId = str;
        this.$onAnimationTypeReady = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderStackViewPresenter$fetchAnimationType$1(this.this$0, this.$orderId, this.$onAnimationTypeReady, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderStackViewPresenter$fetchAnimationType$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        f fVar;
        tls tlsVar;
        f fVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                f fVar3 = this.this$0;
                String str = this.$orderId;
                tls tlsVar2 = this.$onAnimationTypeReady;
                try {
                    this.L$0 = fVar3;
                    this.L$1 = tlsVar2;
                    this.L$2 = fVar3;
                    this.label = 1;
                    Object Ng = f.Ng(fVar3, str, this);
                    if (Ng == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    fVar = fVar3;
                    tlsVar = tlsVar2;
                    obj = Ng;
                    fVar2 = fVar;
                } catch (Throwable th) {
                    th = th;
                    fVar = fVar3;
                    fVar.f0.b("fetchAnimationType", th, new c680(2));
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fVar = (f) this.L$2;
                tlsVar = (tls) this.L$1;
                fVar2 = (f) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    fVar.f0.b("fetchAnimationType", th, new c680(2));
                    return zy11.a;
                }
            }
            o2y0 o2y0Var = (o2y0) obj;
            fVar2.getClass();
            tlsVar.invoke((o2y0Var == null || !o2y0Var.b().l.getA()) ? OrderStackMvpView.AnimationType.HORIZONTAL_TRANSLATION : OrderStackMvpView.AnimationType.FADE);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
