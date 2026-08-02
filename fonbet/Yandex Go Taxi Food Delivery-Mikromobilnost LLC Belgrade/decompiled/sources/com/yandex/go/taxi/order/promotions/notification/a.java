package com.yandex.go.taxi.order.promotions.notification;

import com.yandex.go.navigation.screen.c;
import com.yandex.go.taxi.order.promotions.notification.ui.PromoblockNotification;
import com.yandex.go.taxi.order.promotions.notification.ui.b;
import defpackage.bvf0;
import defpackage.h55;
import defpackage.ig60;
import defpackage.j0g;
import defpackage.jqr;
import defpackage.mth;
import defpackage.n20;
import defpackage.n980;
import defpackage.nw70;
import defpackage.ny61;
import defpackage.q980;
import defpackage.qqv;
import defpackage.tj60;
import defpackage.tje;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.design.NotificationStackComponent;

/* loaded from: classes14.dex */
public final class a extends h55 {
    public final n20 D;
    public final tj60 E;
    public final b F;
    public final j0g G;
    public final qqv H;
    public final ru.yandex.taxi.communications.data.a I;
    public final q980 J;
    public final c K;
    public final nw70 L;
    public final r0 M;
    public final n980 N;

    public a(n20 n20Var, tj60 tj60Var, b bVar, j0g j0gVar, qqv qqvVar, ru.yandex.taxi.communications.data.a aVar, q980 q980Var, c cVar, nw70 nw70Var) {
        super(null);
        this.D = n20Var;
        this.E = tj60Var;
        this.F = bVar;
        this.G = j0gVar;
        this.H = qqvVar;
        this.I = aVar;
        this.J = q980Var;
        this.K = cVar;
        this.L = nw70Var;
        this.M = bvf0.c(EmptyList.a);
        this.N = new n980(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(a aVar, ig60 ig60Var, ContinuationImpl continuationImpl) {
        OrderTopNotificationsRouter$showNotification$1 orderTopNotificationsRouter$showNotification$1;
        int i;
        r0 r0Var;
        Object value;
        ArrayList arrayList;
        aVar.getClass();
        if (continuationImpl instanceof OrderTopNotificationsRouter$showNotification$1) {
            orderTopNotificationsRouter$showNotification$1 = (OrderTopNotificationsRouter$showNotification$1) continuationImpl;
            int i2 = orderTopNotificationsRouter$showNotification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderTopNotificationsRouter$showNotification$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderTopNotificationsRouter$showNotification$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderTopNotificationsRouter$showNotification$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    CommunicationItem communicationItem = ig60Var.a;
                    orderTopNotificationsRouter$showNotification$1.L$0 = ig60Var;
                    orderTopNotificationsRouter$showNotification$1.label = 1;
                    obj = aVar.F.a(communicationItem, orderTopNotificationsRouter$showNotification$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ig60Var = (ig60) orderTopNotificationsRouter$showNotification$1.L$0;
                    kotlin.b.b(obj);
                }
                aVar.E.e((PromoblockNotification) obj);
                r0Var = aVar.M;
                do {
                    value = r0Var.getValue();
                    String str = ig60Var.a.a;
                    arrayList = new ArrayList((List) value);
                    arrayList.add(0, str);
                } while (!r0Var.k(value, arrayList));
                return zy11.a;
            }
        }
        orderTopNotificationsRouter$showNotification$1 = new OrderTopNotificationsRouter$showNotification$1(aVar, continuationImpl);
        Object obj2 = orderTopNotificationsRouter$showNotification$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderTopNotificationsRouter$showNotification$1.label;
        if (i != 0) {
        }
        aVar.E.e((PromoblockNotification) obj2);
        r0Var = aVar.M;
        do {
            value = r0Var.getValue();
            String str2 = ig60Var.a.a;
            arrayList = new ArrayList((List) value);
            arrayList.add(0, str2);
        } while (!r0Var.k(value, arrayList));
        return zy11.a;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        Q();
        NotificationStackComponent notificationStackComponent = this.E.a;
        if (notificationStackComponent != null) {
            notificationStackComponent.removeListener(this.N);
        }
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        NotificationStackComponent notificationStackComponent = this.E.a;
        if (notificationStackComponent != null) {
            notificationStackComponent.addListener(this.N);
        }
        tje.N(o(), null, null, new OrderTopNotificationsRouter$onLaunch$$inlined$safeCollectIn$1(new m0(e.X(new jqr(new mth(((com.yandex.go.taxi.order.provider.a) this.D).v(), 6), new OrderTopNotificationsRouter$onLaunch$1(this, null), 3), new OrderTopNotificationsRouter$onLaunch$$inlined$flatMapLatest$1(3, null)), e.I(this.K.c(), new OrderTopNotificationsRouter$onLaunch$3(2, null)), new OrderTopNotificationsRouter$onLaunch$4(this, null)), null), 3);
    }

    public final void Q() {
        r0 r0Var = this.M;
        Iterator it = ((Iterable) r0Var.getValue()).iterator();
        while (it.hasNext()) {
            this.E.c((String) it.next());
        }
        r0Var.getClass();
        r0Var.m(null, EmptyList.a);
    }
}
