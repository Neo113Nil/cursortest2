package com.yandex.go.overdraft.domain;

import com.yandex.go.taxi.order.models.api.objects.PaymentChange;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.overdraft.domain.OverdraftInteractor$hasActiveOrdersWithDebt$2", f = "OverdraftInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class OverdraftInteractor$hasActiveOrdersWithDebt$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<o2y0> $orders;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverdraftInteractor$hasActiveOrdersWithDebt$2(List list, Continuation continuation) {
        super(2, continuation);
        this.$orders = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OverdraftInteractor$hasActiveOrdersWithDebt$2(this.$orders, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OverdraftInteractor$hasActiveOrdersWithDebt$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        for (o2y0 o2y0Var : this.$orders) {
            List list = o2y0Var.b().V().J;
            boolean z = false;
            if (list != null) {
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        PaymentChange.Reason reason = ((PaymentChange) it.next()).c;
                        if ("DEBT_ALLOWED".equals(reason != null ? reason.a : null)) {
                            z = true;
                            break;
                        }
                    }
                }
            }
            boolean z2 = o2y0Var.b().l.u;
            if (z && z2) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
