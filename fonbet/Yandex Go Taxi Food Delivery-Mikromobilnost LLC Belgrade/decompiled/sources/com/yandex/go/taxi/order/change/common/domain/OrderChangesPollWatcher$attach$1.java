package com.yandex.go.taxi.order.change.common.domain;

import com.yandex.go.taxi.order.models.api.ChangeOrderState$Failure;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Pending;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Success;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Unavailable;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.sb9;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.w511;
import defpackage.wls;
import defpackage.ye60;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i0;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.change.common.domain.OrderChangesPollWatcher$attach$1", f = "OrderChangesPollWatcher.kt", l = {47}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderChangesPollWatcher$attach$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ g this$0;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Pair;", "", "Lcom/yandex/go/taxi/order/models/api/e;", "Lo2y0;", "<destruct>", "Lzy11;", "<anonymous>", "(Lkotlin/Pair;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.change.common.domain.OrderChangesPollWatcher$attach$1$2", f = "OrderChangesPollWatcher.kt", l = {44}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.change.common.domain.OrderChangesPollWatcher$attach$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        final /* synthetic */ g this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(g gVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((Pair) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            g gVar;
            o2y0 o2y0Var;
            Iterator it;
            Object value;
            TaxiOrder taxiOrder;
            Pair pair = (Pair) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                List list = (List) pair.getFirst();
                o2y0 o2y0Var2 = (o2y0) pair.getSecond();
                gVar = this.this$0;
                o2y0Var = o2y0Var2;
                it = list.iterator();
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = (Iterator) this.L$5;
                gVar = (g) this.L$4;
                o2y0Var = (o2y0) this.L$2;
                kotlin.b.b(obj);
            }
            while (it.hasNext()) {
                com.yandex.go.taxi.order.models.api.e eVar = (com.yandex.go.taxi.order.models.api.e) it.next();
                gVar.getClass();
                if ((eVar instanceof ChangeOrderState$Success) || (eVar instanceof ChangeOrderState$Failure) || (eVar instanceof ChangeOrderState$Unavailable)) {
                    r0 r0Var = o2y0Var.a;
                    do {
                        value = r0Var.getValue();
                        taxiOrder = (TaxiOrder) value;
                        taxiOrder.L(eVar);
                    } while (!r0Var.k(value, taxiOrder));
                    o2y0Var.f();
                } else if (!(eVar instanceof ChangeOrderState$Pending)) {
                    w511.b();
                    return null;
                }
                sb9 sb9Var = gVar.b;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = o2y0Var;
                this.L$3 = null;
                this.L$4 = gVar;
                this.L$5 = it;
                this.L$6 = null;
                this.L$7 = null;
                this.label = 1;
                if (sb9Var.a(o2y0Var, eVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderChangesPollWatcher$attach$1(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderChangesPollWatcher$attach$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderChangesPollWatcher$attach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        kotlinx.coroutines.flow.internal.g X = kotlinx.coroutines.flow.e.X(((com.yandex.go.taxi.order.provider.a) this.this$0.a).a(), new OrderChangesPollWatcher$attach$1$invokeSuspend$$inlined$flatMapLatest$1(3, null));
        this.this$0.c.getClass();
        tpr F = kotlinx.coroutines.flow.e.F(X, uyj.a);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
        this.label = 1;
        Object collect = F.collect(new i0(ye60.a, anonymousClass2), this);
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
