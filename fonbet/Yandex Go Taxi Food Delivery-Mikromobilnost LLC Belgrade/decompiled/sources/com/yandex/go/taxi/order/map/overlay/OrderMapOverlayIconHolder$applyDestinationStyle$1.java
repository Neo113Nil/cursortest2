package com.yandex.go.taxi.order.map.overlay;

import defpackage.bl00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p0c0;
import defpackage.sq00;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.map.overlay.OrderMapOverlayIconHolder$applyDestinationStyle$1", f = "OrderMapOverlayIconHolder.kt", l = {MSException.ERROR_INVALID_PARAMETER}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderMapOverlayIconHolder$applyDestinationStyle$1 extends SuspendLambda implements wls {
    final /* synthetic */ p0c0 $style;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderMapOverlayIconHolder$applyDestinationStyle$1(d dVar, p0c0 p0c0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$style = p0c0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderMapOverlayIconHolder$applyDestinationStyle$1(this.this$0, this.$style, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderMapOverlayIconHolder$applyDestinationStyle$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.pin.api.widget.b bVar = this.this$0.e;
            sq00 sq00Var = new sq00(this.$style, null, false, null, null, null, null, false, false, null, null, 0.0f, 8190);
            this.label = 1;
            e = bVar.e(sq00Var, this);
            if (e == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            e = obj;
        }
        bl00 bl00Var = (bl00) e;
        this.this$0.c.z(bl00Var.a, bl00Var.b);
        return zy11.a;
    }
}
