package com.yandex.go.taxi.order.queue.interactor;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$QueueSearch;
import com.yandex.go.taxi.order.models.api.response.r7;
import defpackage.mjg0;
import defpackage.ny61;
import defpackage.p2y0;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class c implements mjg0 {
    public final p2y0 a;
    public final com.yandex.go.navigation.screen.c b;
    public final d c;

    static {
        int i = d.b;
    }

    public c(p2y0 p2y0Var, com.yandex.go.navigation.screen.c cVar, d dVar) {
        this.a = p2y0Var;
        this.b = cVar;
        this.c = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        QueueAvailabilityInteractorImpl$isQueueAllowed$1 queueAvailabilityInteractorImpl$isQueueAllowed$1;
        int i;
        boolean z;
        Screen screen;
        d dVar;
        if (continuationImpl instanceof QueueAvailabilityInteractorImpl$isQueueAllowed$1) {
            queueAvailabilityInteractorImpl$isQueueAllowed$1 = (QueueAvailabilityInteractorImpl$isQueueAllowed$1) continuationImpl;
            int i2 = queueAvailabilityInteractorImpl$isQueueAllowed$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                queueAvailabilityInteractorImpl$isQueueAllowed$1.label = i2 - Integer.MIN_VALUE;
                Object obj = queueAvailabilityInteractorImpl$isQueueAllowed$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = queueAvailabilityInteractorImpl$isQueueAllowed$1.label;
                z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Screen b = this.b.b();
                    d dVar2 = this.c;
                    queueAvailabilityInteractorImpl$isQueueAllowed$1.L$0 = dVar2;
                    queueAvailabilityInteractorImpl$isQueueAllowed$1.L$1 = b;
                    queueAvailabilityInteractorImpl$isQueueAllowed$1.label = 1;
                    Object k = ((e0) this.a).k(queueAvailabilityInteractorImpl$isQueueAllowed$1);
                    if (k == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = k;
                    screen = b;
                    dVar = dVar2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    screen = (Screen) queueAvailabilityInteractorImpl$isQueueAllowed$1.L$1;
                    dVar = (d) queueAvailabilityInteractorImpl$isQueueAllowed$1.L$0;
                    kotlin.b.b(obj);
                }
                int size = ((List) obj).size();
                dVar.getClass();
                if (screen == Screen.ORDERS_LIST && size > 1) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        queueAvailabilityInteractorImpl$isQueueAllowed$1 = new QueueAvailabilityInteractorImpl$isQueueAllowed$1(this, continuationImpl);
        Object obj2 = queueAvailabilityInteractorImpl$isQueueAllowed$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = queueAvailabilityInteractorImpl$isQueueAllowed$1.label;
        z = true;
        if (i != 0) {
        }
        int size2 = ((List) obj2).size();
        dVar.getClass();
        if (screen == Screen.ORDERS_LIST) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        if (r9 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(TaxiOrder taxiOrder, ContinuationImpl continuationImpl) {
        QueueAvailabilityInteractorImpl$orderHasQueue$3 queueAvailabilityInteractorImpl$orderHasQueue$3;
        Object obj;
        int i;
        if (continuationImpl instanceof QueueAvailabilityInteractorImpl$orderHasQueue$3) {
            queueAvailabilityInteractorImpl$orderHasQueue$3 = (QueueAvailabilityInteractorImpl$orderHasQueue$3) continuationImpl;
            int i2 = queueAvailabilityInteractorImpl$orderHasQueue$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                queueAvailabilityInteractorImpl$orderHasQueue$3.label = i2 - Integer.MIN_VALUE;
                obj = queueAvailabilityInteractorImpl$orderHasQueue$3.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = queueAvailabilityInteractorImpl$orderHasQueue$3.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = this.c;
                    dVar.getClass();
                    r7 r7Var = taxiOrder.V().l0;
                    SearchInfoResponse$QueueSearch.QueueInfo a = r7Var instanceof SearchInfoResponse$QueueSearch ? ((SearchInfoResponse$QueueSearch) r7Var).a : d.a(taxiOrder);
                    if (a == null) {
                        return Boolean.FALSE;
                    }
                    String str = taxiOrder.a;
                    int i3 = a.g;
                    queueAvailabilityInteractorImpl$orderHasQueue$3.L$0 = null;
                    queueAvailabilityInteractorImpl$orderHasQueue$3.L$1 = null;
                    queueAvailabilityInteractorImpl$orderHasQueue$3.label = 1;
                    obj = dVar.b(i3, str, queueAvailabilityInteractorImpl$orderHasQueue$3);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return Boolean.FALSE;
                }
                queueAvailabilityInteractorImpl$orderHasQueue$3.L$0 = null;
                queueAvailabilityInteractorImpl$orderHasQueue$3.L$1 = null;
                queueAvailabilityInteractorImpl$orderHasQueue$3.label = 2;
                Object a2 = a(queueAvailabilityInteractorImpl$orderHasQueue$3);
                return a2 == obj2 ? obj2 : a2;
            }
        }
        queueAvailabilityInteractorImpl$orderHasQueue$3 = new QueueAvailabilityInteractorImpl$orderHasQueue$3(this, continuationImpl);
        obj = queueAvailabilityInteractorImpl$orderHasQueue$3.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = queueAvailabilityInteractorImpl$orderHasQueue$3.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
