package com.yandex.go.superapp.order.multi.old.provider;

import com.yandex.go.chargers.data.q;
import com.yandex.go.scooters.domain.p;
import defpackage.bem;
import defpackage.bvf0;
import defpackage.d9n;
import defpackage.f7n;
import defpackage.gm40;
import defpackage.hbp0;
import defpackage.hit;
import defpackage.hxq0;
import defpackage.llh;
import defpackage.ny61;
import defpackage.ps70;
import defpackage.pw40;
import defpackage.pzt0;
import defpackage.sly;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vd7;
import defpackage.vr40;
import defpackage.w511;
import defpackage.wl40;
import defpackage.yl40;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.o;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.appdelegates.SupportedOrderType;
import ru.yandex.taxi.multiorder.multi.ServiceType;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes8.dex */
public final class g {
    public final tt2 a;
    public final com.yandex.go.taxi.order.provider.a b;
    public final com.yandex.go.superapp.order.multi.old.eats.a c;
    public final bem d;
    public final ru.yandex.taxi.linked_order.provider.d e;
    public final q f;
    public final com.yandex.go.taxi.order.repositories.c g;
    public final ps70 h;
    public final p i;
    public final ru.yandex.taxi.logistics.deliveries.multiorder.d j;
    public final pw40 k;
    public final vd7 l;
    public final yl40 m;
    public final hit n;
    public final com.yandex.go.navigator.order.c o;
    public final vr40 p;
    public final r0 q;
    public volatile pzt0 r;

    public g(tt2 tt2Var, com.yandex.go.taxi.order.provider.a aVar, com.yandex.go.superapp.order.multi.old.eats.a aVar2, bem bemVar, ru.yandex.taxi.linked_order.provider.d dVar, q qVar, com.yandex.go.taxi.order.repositories.c cVar, ps70 ps70Var, p pVar, ru.yandex.taxi.logistics.deliveries.multiorder.d dVar2, pw40 pw40Var, vd7 vd7Var, yl40 yl40Var, hit hitVar, com.yandex.go.navigator.order.c cVar2, vr40 vr40Var, llh llhVar) {
        this.a = tt2Var;
        this.b = aVar;
        this.c = aVar2;
        this.d = bemVar;
        this.e = dVar;
        this.f = qVar;
        this.g = cVar;
        this.h = ps70Var;
        this.i = pVar;
        this.j = dVar2;
        this.k = pw40Var;
        this.l = vd7Var;
        this.m = yl40Var;
        this.n = hitVar;
        this.o = cVar2;
        this.p = vr40Var;
        llhVar.getClass();
        this.q = bvf0.c(wl40.j);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x009c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean f(wl40 wl40Var, hxq0 hxq0Var) {
        if (hxq0Var instanceof ServiceType) {
            switch (gm40.a[((ServiceType) hxq0Var).ordinal()]) {
                case 1:
                    return !wl40Var.d.isEmpty();
                case 2:
                    List list = wl40Var.b;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (((sly) it.next()).a() != null) {
                                return true;
                            }
                        }
                    }
                case 3:
                    if (!wl40Var.a.isEmpty()) {
                    }
                    break;
                case 4:
                    if (!wl40Var.e.isEmpty()) {
                    }
                    break;
                case 5:
                    if (!wl40Var.f.isEmpty()) {
                    }
                    break;
                case 6:
                    if (!wl40Var.g.isEmpty()) {
                    }
                    break;
                case 7:
                    if (!wl40Var.h.isEmpty()) {
                    }
                    break;
                case 8:
                    if (!wl40Var.i.isEmpty()) {
                    }
                    break;
                default:
                    w511.b();
                    return false;
            }
        } else if (!(hxq0Var instanceof d9n) || wl40Var.k(new f7n(((d9n) hxq0Var).a)).isEmpty()) {
        }
    }

    public static boolean g(wl40 wl40Var) {
        Iterator it = ServiceType.a().iterator();
        while (it.hasNext()) {
            if (f(wl40Var, (ServiceType) it.next())) {
                return true;
            }
        }
        return !wl40Var.c.isEmpty();
    }

    public static o i(tpr tprVar, String str) {
        return new o(tprVar, new MultiOrderProvider$safeWrapOrders$1(str, null));
    }

    public final wl40 a() {
        return (wl40) this.q.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(wl40 wl40Var, ContinuationImpl continuationImpl) {
        MultiOrderProvider$hasActiveOrderToShow$2 multiOrderProvider$hasActiveOrderToShow$2;
        Object obj;
        int i;
        boolean z;
        if (continuationImpl instanceof MultiOrderProvider$hasActiveOrderToShow$2) {
            multiOrderProvider$hasActiveOrderToShow$2 = (MultiOrderProvider$hasActiveOrderToShow$2) continuationImpl;
            int i2 = multiOrderProvider$hasActiveOrderToShow$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multiOrderProvider$hasActiveOrderToShow$2.label = i2 - Integer.MIN_VALUE;
                obj = multiOrderProvider$hasActiveOrderToShow$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multiOrderProvider$hasActiveOrderToShow$2.label;
                z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    multiOrderProvider$hasActiveOrderToShow$2.L$0 = wl40Var;
                    multiOrderProvider$hasActiveOrderToShow$2.label = 1;
                    SupportedOrderType supportedOrderType = SupportedOrderType.TAXI;
                    obj = this.b.q(multiOrderProvider$hasActiveOrderToShow$2);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wl40Var = (wl40) multiOrderProvider$hasActiveOrderToShow$2.L$0;
                    kotlin.b.b(obj);
                }
                if (!((Boolean) obj).booleanValue() && !g(wl40Var) && wl40Var.j() <= 1) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        multiOrderProvider$hasActiveOrderToShow$2 = new MultiOrderProvider$hasActiveOrderToShow$2(this, continuationImpl);
        obj = multiOrderProvider$hasActiveOrderToShow$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multiOrderProvider$hasActiveOrderToShow$2.label;
        z = true;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0042, code lost:
    
        if (r6 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        MultiOrderProvider$hasActiveOrderToShow$1 multiOrderProvider$hasActiveOrderToShow$1;
        Object obj;
        int i;
        Object obj2;
        if (continuationImpl instanceof MultiOrderProvider$hasActiveOrderToShow$1) {
            multiOrderProvider$hasActiveOrderToShow$1 = (MultiOrderProvider$hasActiveOrderToShow$1) continuationImpl;
            int i2 = multiOrderProvider$hasActiveOrderToShow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multiOrderProvider$hasActiveOrderToShow$1.label = i2 - Integer.MIN_VALUE;
                obj = multiOrderProvider$hasActiveOrderToShow$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multiOrderProvider$hasActiveOrderToShow$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    wl40 a = a();
                    multiOrderProvider$hasActiveOrderToShow$1.label = 1;
                    obj = b(a, multiOrderProvider$hasActiveOrderToShow$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return Boolean.FALSE;
                }
                multiOrderProvider$hasActiveOrderToShow$1.label = 2;
                if (this.k.a) {
                    obj2 = Boolean.TRUE;
                } else {
                    SupportedOrderType supportedOrderType = SupportedOrderType.TAXI;
                    obj2 = this.b.q(multiOrderProvider$hasActiveOrderToShow$1);
                }
                return obj2 == obj3 ? obj3 : obj2;
            }
        }
        multiOrderProvider$hasActiveOrderToShow$1 = new MultiOrderProvider$hasActiveOrderToShow$1(this, continuationImpl);
        obj = multiOrderProvider$hasActiveOrderToShow$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multiOrderProvider$hasActiveOrderToShow$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    public final boolean d() {
        wl40 a = a();
        SupportedOrderType supportedOrderType = SupportedOrderType.TAXI;
        com.yandex.go.taxi.order.provider.a aVar = this.b;
        if (aVar.r() || g(a) || a.j() > 1) {
            return this.k.a || aVar.r();
        }
        return false;
    }

    public final boolean e() {
        return a().j() > 0;
    }

    public final kotlinx.coroutines.flow.internal.g h() {
        pzt0 pzt0Var = this.r;
        if (pzt0Var == null || !pzt0Var.isActive()) {
            j();
        }
        return kotlinx.coroutines.flow.e.X(this.b.a(), new MultiOrderProvider$multiOrderHolderFlow$$inlined$flatMapLatest$1(null, this));
    }

    public final void j() {
        o oVar = new o(new c(new tpr[]{i(kotlinx.coroutines.flow.e.X(this.b.a(), new MultiOrderProvider$trackActiveOrdersWithStatusChanges$$inlined$flatMapLatest$1(null, this)), TariffOrderFlow.ORDER_FLOW_TAXI_KEY), i(this.e.b(), "linked"), i(this.c.a(), "eats"), i(new com.yandex.go.drive.repository.b(kotlinx.coroutines.flow.e.f(this.d.a.b(), 0, BufferOverflow.DROP_OLDEST, 1)), TariffOrderFlow.ORDER_FLOW_DRIVE_KEY), i(com.yandex.go.coroutines.b.d(this.j.a(), new MultiOrderProvider$observeLogisticsOrders$$inlined$start$1(EmptyList.a, null)), "logistics"), i(this.i.c, "scooters"), i(this.f.a, "chargers"), i(this.o.a(), "navigation"), i(this.p.a.g, "multimodal")}, this), new MultiOrderProvider$startOrdersSubscription$flow$2(3, null));
        hbp0 hbp0Var = this.n.a;
        this.a.getClass();
        this.r = tje.N(hbp0Var, uyj.a, null, new MultiOrderProvider$startOrdersSubscription$1(oVar, this, null), 2);
    }
}
