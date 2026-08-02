package com.yandex.go.flex.main_screen.data.widgets.orders;

import defpackage.i601;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ocz;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.main_screen.data.widgets.orders.OrdersWidgetWrapperImpl$bind$1", f = "OrdersWidgetWrapperImpl.kt", l = {HProv.PP_RESERVED1}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class OrdersWidgetWrapperImpl$bind$1 extends SuspendLambda implements wls {
    final /* synthetic */ i601 $properties;
    Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrdersWidgetWrapperImpl$bind$1(e eVar, i601 i601Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$properties = i601Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrdersWidgetWrapperImpl$bind$1(this.this$0, this.$properties, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrdersWidgetWrapperImpl$bind$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr a = this.this$0.b.a();
            i601 i601Var = this.$properties;
            e eVar = this.this$0;
            o oVar = new o(new d(a, i601Var, eVar), new OrdersWidgetWrapperImpl$bind$1$invokeSuspend$$inlined$safeCollect$1(3, null));
            ocz oczVar = new ocz(18, eVar);
            this.L$0 = null;
            this.label = 1;
            if (oVar.collect(oczVar, this) == coroutineSingletons) {
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
