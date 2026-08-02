package com.yandex.go.taxi.order.change.common.domain;

import defpackage.av0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tcc;
import defpackage.vng;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.h;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.change.common.domain.OrderChangesPollWatcher$attach$1$invokeSuspend$$inlined$flatMapLatest$1", f = "OrderChangesPollWatcher.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class OrderChangesPollWatcher$attach$1$invokeSuspend$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        OrderChangesPollWatcher$attach$1$invokeSuspend$$inlined$flatMapLatest$1 orderChangesPollWatcher$attach$1$invokeSuspend$$inlined$flatMapLatest$1 = new OrderChangesPollWatcher$attach$1$invokeSuspend$$inlined$flatMapLatest$1(3, (Continuation) obj3);
        orderChangesPollWatcher$attach$1$invokeSuspend$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        orderChangesPollWatcher$attach$1$invokeSuspend$$inlined$flatMapLatest$1.L$1 = obj2;
        return orderChangesPollWatcher$attach$1$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List<o2y0> list = (List) obj2;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            for (o2y0 o2y0Var : list) {
                arrayList.add(kotlinx.coroutines.flow.e.I(vng.l(new f(o2y0Var.a()), av0.F, vng.c), new OrderChangesPollWatcher$attach$1$1$1$3(o2y0Var, null)));
            }
            h J = kotlinx.coroutines.flow.e.J(arrayList);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(J, vprVar, this) == coroutineSingletons) {
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
