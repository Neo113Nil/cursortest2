package com.yandex.go.taxi.order.map.overlay;

import defpackage.bms;
import defpackage.mo6;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmo6;", "bubbleState", "", "trigger", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "Lkotlin/Pair;", "<anonymous>", "(Lmo6;FLru/yandex/taxi/theme/ThemeType;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.map.overlay.OrderMapOverlayPresenter$onResume$42", f = "OrderMapOverlayPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderMapOverlayPresenter$onResume$42 extends SuspendLambda implements bms {
    /* synthetic */ float F$0;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ c0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderMapOverlayPresenter$onResume$42(c0 c0Var, Continuation continuation) {
        super(4, continuation);
        this.this$0 = c0Var;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        float floatValue = ((Number) obj2).floatValue();
        OrderMapOverlayPresenter$onResume$42 orderMapOverlayPresenter$onResume$42 = new OrderMapOverlayPresenter$onResume$42(this.this$0, (Continuation) obj4);
        orderMapOverlayPresenter$onResume$42.L$0 = (mo6) obj;
        orderMapOverlayPresenter$onResume$42.F$0 = floatValue;
        orderMapOverlayPresenter$onResume$42.L$1 = (ThemeType) obj3;
        return orderMapOverlayPresenter$onResume$42.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        mo6 mo6Var = (mo6) this.L$0;
        float f = this.F$0;
        ThemeType themeType = (ThemeType) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c0 c0Var = this.this$0;
        c0Var.getClass();
        if (mo6Var.c > f || f > mo6Var.d) {
            c0Var.N1 = false;
            mo6Var = mo6.g;
        }
        return new Pair(mo6Var, themeType);
    }
}
