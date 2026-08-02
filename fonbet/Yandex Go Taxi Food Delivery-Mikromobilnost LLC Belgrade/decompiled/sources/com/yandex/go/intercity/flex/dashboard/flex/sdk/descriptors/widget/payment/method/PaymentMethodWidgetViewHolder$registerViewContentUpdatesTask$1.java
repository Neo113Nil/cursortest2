package com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.widget.payment.method;

import defpackage.kdc;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s8a0;
import defpackage.tse;
import defpackage.u8a0;
import defpackage.ufu;
import defpackage.wh80;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewBottomRounded$1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.widget.payment.method.PaymentMethodWidgetViewHolder$registerViewContentUpdatesTask$1", f = "PaymentMethodWidgetViewHolder.kt", l = {71}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class PaymentMethodWidgetViewHolder$registerViewContentUpdatesTask$1 extends SuspendLambda implements wls {
    final /* synthetic */ s8a0 $data;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodWidgetViewHolder$registerViewContentUpdatesTask$1(s8a0 s8a0Var, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$data = s8a0Var;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentMethodWidgetViewHolder$registerViewContentUpdatesTask$1(this.$data, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMethodWidgetViewHolder$registerViewContentUpdatesTask$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            u8a0 u8a0Var = this.$data.c;
            c cVar = this.this$0;
            if (u8a0Var != null) {
                kdc b = ((ufu) cVar.V).b(u8a0Var.a);
                ListItemComponent listItemComponent = cVar.R;
                listItemComponent.setBackgroundColor(b);
                listItemComponent.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewBottomRounded$1(ru.yandex.taxi.design.utils.c.h(u8a0Var.b, cVar.a)));
                listItemComponent.setClipToOutline(true);
            } else {
                ListItemComponent listItemComponent2 = cVar.R;
                listItemComponent2.setOutlineProvider(null);
                listItemComponent2.setBackgroundColor((kdc) null);
            }
            n b2 = this.this$0.S.b();
            wh80 wh80Var = new wh80(9, this.this$0);
            this.label = 1;
            if (b2.collect(wh80Var, this) == coroutineSingletons) {
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
