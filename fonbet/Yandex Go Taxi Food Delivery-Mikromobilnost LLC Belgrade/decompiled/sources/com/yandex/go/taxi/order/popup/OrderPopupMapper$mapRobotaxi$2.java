package com.yandex.go.taxi.order.popup;

import defpackage.g480;
import defpackage.i480;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ovk0;
import defpackage.pvk0;
import defpackage.qos0;
import defpackage.qvk0;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.communications.model.widgets.ActionButton;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lqvk0;", "<anonymous>", "(Ltse;)Lqvk0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.popup.OrderPopupMapper$mapRobotaxi$2", f = "OrderPopupMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderPopupMapper$mapRobotaxi$2 extends SuspendLambda implements wls {
    final /* synthetic */ g480 $item;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderPopupMapper$mapRobotaxi$2(g480 g480Var, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$item = g480Var;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderPopupMapper$mapRobotaxi$2(this.$item, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderPopupMapper$mapRobotaxi$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pvk0 pvk0Var;
        qos0 qos0Var;
        ActionButton.ButtonActionType b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        String str = this.$item.c.a;
        String a = str != null ? ((m7x0) this.this$0.e).a(str) : null;
        b bVar = this.this$0;
        List list = this.$item.e.a;
        bVar.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ActionButton actionButton = (ActionButton) it.next();
            String str2 = actionButton.b;
            ru.yandex.taxi.communications.model.widgets.b bVar2 = actionButton.e;
            String analyticsName = (bVar2 == null || (b = bVar2.b()) == null) ? null : b.getAnalyticsName();
            arrayList.add(new ovk0(str2, actionButton.d, actionButton.c, analyticsName == null ? "" : analyticsName, b.f(bVar2)));
        }
        i480 i480Var = this.$item.f;
        if (i480Var == null || (qos0Var = i480Var.a) == null) {
            pvk0Var = null;
        } else {
            b bVar3 = this.this$0;
            String str3 = qos0Var.b;
            String str4 = qos0Var.c;
            String str5 = str4 != null ? str4 : "";
            ru.yandex.taxi.communications.model.widgets.b bVar4 = qos0Var.a;
            bVar3.getClass();
            pvk0Var = new pvk0(str3, str5, b.f(bVar4));
        }
        g480 g480Var = this.$item;
        return new qvk0(g480Var.a, g480Var.b, g480Var.d, arrayList, pvk0Var, a);
    }
}
