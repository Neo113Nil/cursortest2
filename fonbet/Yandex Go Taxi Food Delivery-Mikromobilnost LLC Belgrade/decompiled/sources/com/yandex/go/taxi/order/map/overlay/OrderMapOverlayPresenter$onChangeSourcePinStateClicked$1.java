package com.yandex.go.taxi.order.map.overlay;

import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import defpackage.cta1;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.map.overlay.OrderMapOverlayPresenter$onChangeSourcePinStateClicked$1", f = "OrderMapOverlayPresenter.kt", l = {775}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderMapOverlayPresenter$onChangeSourcePinStateClicked$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderMapOverlayPresenter$onChangeSourcePinStateClicked$1(c0 c0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = c0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderMapOverlayPresenter$onChangeSourcePinStateClicked$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderMapOverlayPresenter$onChangeSourcePinStateClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.S.getClass();
            sjh sjhVar = uyj.a;
            mdh mdhVar = mdh.b;
            OrderMapOverlayPresenter$onChangeSourcePinStateClicked$1$canOpenChangeSource$1 orderMapOverlayPresenter$onChangeSourcePinStateClicked$1$canOpenChangeSource$1 = new OrderMapOverlayPresenter$onChangeSourcePinStateClicked$1$canOpenChangeSource$1(this.this$0, null);
            this.label = 1;
            obj = tje.k0(mdhVar, orderMapOverlayPresenter$onChangeSourcePinStateClicked$1$canOpenChangeSource$1, this);
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
        boolean booleanValue = ((Boolean) obj).booleanValue();
        c0 c0Var = this.this$0;
        if (booleanValue) {
            ((ru.yandex.taxi.order.f) c0Var.B).Y(c0Var.A, null, null);
        } else {
            c0Var.getClass();
            DetailsOpenReason detailsOpenReason = DetailsOpenReason.POINT_A;
            ((ru.yandex.taxi.order.f) c0Var.B).b0(c0Var.A, detailsOpenReason);
        }
        c0Var.V.b(cta1.d(c0Var.A.c()), booleanValue);
        return zy11.a;
    }
}
