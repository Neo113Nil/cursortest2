package com.yandex.go.taxi.order.multi.shortcuts;

import defpackage.c151;
import defpackage.d380;
import defpackage.gw00;
import defpackage.i801;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q351;
import defpackage.s351;
import defpackage.tcc;
import defpackage.w201;
import defpackage.wls;
import defpackage.yxe0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.order.analytics.model.ListOpenReason;
import ru.yandex.taxi.order.analytics.model.WidgetType;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lw201;", "orders", "Lzy11;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.multi.shortcuts.OrderShortcutViewSource$start$2", f = "OrderShortcutViewSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderShortcutViewSource$start$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderShortcutViewSource$start$2(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrderShortcutViewSource$start$2 orderShortcutViewSource$start$2 = new OrderShortcutViewSource$start$2(this.this$0, continuation);
        orderShortcutViewSource$start$2.L$0 = obj;
        return orderShortcutViewSource$start$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OrderShortcutViewSource$start$2 orderShortcutViewSource$start$2 = (OrderShortcutViewSource$start$2) create((List) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        orderShortcutViewSource$start$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e eVar = this.this$0;
        c151 c151Var = eVar.c;
        i801 i801Var = eVar.d;
        i801Var.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d380 a = i801Var.a.a((w201) it.next());
            if (a != null) {
                arrayList.add(a);
                arrayList2.add(new q351("", WidgetType.ONE_ORDER, Collections.singletonList(a)));
            }
        }
        if (arrayList.isEmpty()) {
            arrayList2.isEmpty();
        }
        c151Var.getClass();
        int d = gw00.d(tcc.n(arrayList, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            d380 d380Var = (d380) it2.next();
            Pair pair = new Pair(d380Var.a, d380Var.c);
            linkedHashMap.put(pair.c(), pair.f());
        }
        ListOpenReason a2 = c151Var.e.a(linkedHashMap);
        if (a2 != ListOpenReason.NONE) {
            s351 s351Var = c151Var.f;
            ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                q351 q351Var = (q351) it3.next();
                s351Var.getClass();
                arrayList3.add(s351.a(q351Var));
            }
            if (!arrayList3.isEmpty()) {
                yxe0.a(c151Var.c, "multiorder", a2.getAlias(), null, arrayList3, 9);
            }
        }
        return zy11.a;
    }
}
