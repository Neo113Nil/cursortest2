package com.yandex.go.taxi.order.map.overlay;

import defpackage.bl00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s080;
import defpackage.sq00;
import defpackage.t080;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.map.overlay.OrderMapOverlayIconHolder$showSourcePinText$1", f = "OrderMapOverlayIconHolder.kt", l = {147}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderMapOverlayIconHolder$showSourcePinText$1 extends SuspendLambda implements wls {
    final /* synthetic */ sq00 $pinInfo;
    final /* synthetic */ s080 $showTextPinCallback;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderMapOverlayIconHolder$showSourcePinText$1(d dVar, sq00 sq00Var, s080 s080Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$pinInfo = sq00Var;
        this.$showTextPinCallback = s080Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderMapOverlayIconHolder$showSourcePinText$1(this.this$0, this.$pinInfo, this.$showTextPinCallback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderMapOverlayIconHolder$showSourcePinText$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.pin.api.widget.b bVar = this.this$0.e;
            sq00 sq00Var = this.$pinInfo;
            this.label = 1;
            obj = bVar.h(sq00Var, this);
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
        bl00 bl00Var = (bl00) obj;
        this.$showTextPinCallback.a(bl00Var.a.get$image().getWidth() / 2, bl00Var.a.get$image().getHeight() / 2);
        d dVar = this.this$0;
        dVar.i.f(new t080(dVar, bl00Var, 1));
        d dVar2 = this.this$0;
        dVar2.i.e(dVar2.h);
        return zy11.a;
    }
}
