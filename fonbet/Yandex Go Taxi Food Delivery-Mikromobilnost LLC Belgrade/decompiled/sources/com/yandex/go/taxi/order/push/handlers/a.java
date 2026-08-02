package com.yandex.go.taxi.order.push.handlers;

import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.v;
import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import com.yandex.go.notifications.acknowledge.data.model.PushAckStatus;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderLocalData;
import com.yandex.go.taxi.order.models.api.TaxiOrderOverrides;
import com.yandex.go.taxi.order.models.api.objects.OrderForegroundNotificationOverrides;
import com.yandex.go.taxi.order.y;
import defpackage.a3y0;
import defpackage.auu0;
import defpackage.evu0;
import defpackage.gw00;
import defpackage.h3y;
import defpackage.hst;
import defpackage.iw00;
import defpackage.jst;
import defpackage.n280;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.p1g0;
import defpackage.p53;
import defpackage.pux0;
import defpackage.pzt0;
import defpackage.q280;
import defpackage.r85;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wnt;
import defpackage.wzx0;
import defpackage.xby;
import defpackage.xnt;
import defpackage.xq70;
import defpackage.xww0;
import defpackage.y180;
import defpackage.ysg;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.activity.AndroidComponentRepository$Component;
import ru.yandex.taxi.notifications.push.model.NotificationShareData;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.order.OrderNotification$OrderNotificationType;
import ru.yandex.taxi.startup.launch.c;
import ru.yandex.taxi.ui.MainUiAvailabilityMonitor;
import ru.yandex.taxi.vendor_api.google.push.FcmNotificationService;

/* loaded from: classes6.dex */
public final class a implements xww0 {
    public final tse a;
    public final h3y b;
    public final h3y c;
    public final h3y d;
    public final h3y e;
    public final h3y f;
    public final h3y g;
    public final wnt h;
    public final h3y i;
    public final a3y0 j = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "OrderPushHandler");
    public pzt0 k;

    public a(tse tseVar, h3y h3yVar, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4, h3y h3yVar5, h3y h3yVar6, wnt wntVar, h3y h3yVar7) {
        this.a = tseVar;
        this.b = h3yVar;
        this.c = h3yVar2;
        this.d = h3yVar3;
        this.e = h3yVar4;
        this.f = h3yVar5;
        this.g = h3yVar6;
        this.h = wntVar;
        this.i = h3yVar7;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // defpackage.xww0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Map map, ContinuationImpl continuationImpl) {
        OrderPushHandler$handle$1 orderPushHandler$handle$1;
        int i;
        a aVar;
        Map map2;
        long j;
        TaxiOrder taxiOrder;
        String str;
        long j2;
        if (continuationImpl instanceof OrderPushHandler$handle$1) {
            orderPushHandler$handle$1 = (OrderPushHandler$handle$1) continuationImpl;
            int i2 = orderPushHandler$handle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderPushHandler$handle$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderPushHandler$handle$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderPushHandler$handle$1.label;
                if (i == 0) {
                    if (i == 1) {
                        j2 = orderPushHandler$handle$1.J$0;
                        str = (String) orderPushHandler$handle$1.L$1;
                        b.b(obj);
                        ((y) this.f.get()).n(j2, str, "PushWithTypeFeedback");
                        return Boolean.TRUE;
                    }
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j3 = orderPushHandler$handle$1.J$0;
                    taxiOrder = (TaxiOrder) orderPushHandler$handle$1.L$5;
                    Map map3 = (Map) orderPushHandler$handle$1.L$0;
                    b.b(obj);
                    map2 = map3;
                    j = j3;
                    aVar = this;
                    if ("information".equals((String) map2.get("type"))) {
                        String str2 = (String) map2.get("title");
                        String str3 = (String) map2.get("msg");
                        if ((str2 == null || evu0.J(str2)) && (str3 == null || evu0.J(str3))) {
                            h3y h3yVar = aVar.i;
                            String str4 = (String) map2.get("id");
                            if (str4 != null) {
                                ((p1g0) h3yVar.get()).a(str4, null);
                                xby.l(jst.e, "PUSH_ACK:ERROR:ORDER_INFORMATION_PUSH_MISSING_TITLE_AND_MSG", null, null, "Failed to handle push with payload ".concat(kotlin.collections.a.X(iw00.x(map2), null, null, null, null, 63)), 2);
                            }
                        } else {
                            List c = aVar.c(map2);
                            List list = c;
                            if (list == null || list.isEmpty() || !c.contains(taxiOrder.h.b.toString())) {
                                h3y h3yVar2 = aVar.i;
                                String str5 = (String) map2.get("id");
                                if (str5 != null) {
                                    ((com.yandex.go.notifications.acknowledge.domain.a) ((p1g0) h3yVar2.get()).a.get()).b(str5, PushAckStatus.HIDDEN);
                                }
                            } else {
                                y180 y180Var = (y180) aVar.c.get();
                                String str6 = taxiOrder.a;
                                String p = taxiOrder.p();
                                y180Var.getClass();
                                int f = y180.f(str6, OrderNotification$OrderNotificationType.ORDER_INFORMATION);
                                q280 q280Var = y180Var.a;
                                Pair m = q280Var.m(str3, str2, str6);
                                String str7 = (String) m.getFirst();
                                String str8 = (String) m.getSecond();
                                NotificationShareData.a builder = NotificationShareData.INSTANCE.builder();
                                builder.b = oyr.i(f, "local:taxi_order:info:");
                                builder.g = kotlin.collections.b.h(new Pair(FinishFlowStatus.ORDER_ID_FIELD_NAME, str6));
                                builder.a = f;
                                v i3 = q280Var.c.i(str7, str8, null, "order", q280Var.f(str6, true, builder, f), j);
                                Bundle bundle = new Bundle(1);
                                bundle.putStringArray("EXTRA_SHOW_ON_STATUSES", (String[]) c.toArray(new String[0]));
                                Bundle bundle2 = i3.y;
                                if (bundle2 == null) {
                                    i3.y = new Bundle(bundle);
                                } else {
                                    bundle2.putAll(bundle);
                                }
                                q280Var.c.m(builder, i3, p, "order");
                            }
                        }
                    }
                    return Boolean.TRUE;
                }
                b.b(obj);
                String str9 = (String) map.get("order_id");
                if (str9 == null || str9.length() == 0) {
                    return Boolean.FALSE;
                }
                this.j.getClass();
                a3y0.h(new String[]{"handle"});
                hst hstVar = jst.e;
                String str10 = (String) map.get("type");
                String str11 = (String) map.get("id");
                String str12 = (String) map.get("notification_group");
                long b = r85.b(map);
                boolean equals = "feedback".equals(str10);
                h3y h3yVar3 = this.b;
                if (equals) {
                    ((ysg) h3yVar3.get()).i(str9);
                    ((y180) this.c.get()).b(str9);
                    if (!((MainUiAvailabilityMonitor) this.d.get()).a) {
                        com.yandex.go.taxi.order.provider.a aVar2 = (com.yandex.go.taxi.order.provider.a) this.e.get();
                        orderPushHandler$handle$1.L$0 = null;
                        orderPushHandler$handle$1.L$1 = str9;
                        orderPushHandler$handle$1.L$2 = null;
                        orderPushHandler$handle$1.L$3 = null;
                        orderPushHandler$handle$1.L$4 = null;
                        orderPushHandler$handle$1.J$0 = b;
                        orderPushHandler$handle$1.label = 1;
                        if (aVar2.h(str9, true, false, orderPushHandler$handle$1) != coroutineSingletons) {
                            str = str9;
                            j2 = b;
                            ((y) this.f.get()).n(j2, str, "PushWithTypeFeedback");
                        }
                    }
                    return Boolean.TRUE;
                }
                TaxiOrder a = ((ysg) h3yVar3.get()).a(str9);
                if ("on_driver_arriving".equals(str10)) {
                    if (a == null) {
                        ((c) this.g.get()).c("GCM.handleOrderData.OrderNotFound");
                        a = ((ysg) this.b.get()).a(str9);
                    }
                    String str13 = (String) map.get("driver_arriving_text");
                    String str14 = (String) map.get("free_waiting_text");
                    if (a == null || !a.l.a || a.h.b != DriveState.DRIVING || str13 == null || str13.length() == 0) {
                        r85.h(this.i, map);
                    } else {
                        synchronized (a) {
                            a.l = a.l.K(str12);
                        }
                        y180 y180Var2 = (y180) this.c.get();
                        String p2 = a.p();
                        if (y180Var2.a.c.b()) {
                            OrderNotification$OrderNotificationType orderNotification$OrderNotificationType = OrderNotification$OrderNotificationType.TAXI_ARRIVING;
                            y180Var2.a.j(new n280(orderNotification$OrderNotificationType.getId() + str9.hashCode(), str9, p2, str13, str14, y180Var2.d.f, orderNotification$OrderNotificationType, b, false, 768), str11);
                        }
                    }
                    return Boolean.TRUE;
                }
                if ("alternative_point_a_found".equals(str10)) {
                    if (a == null) {
                        ((c) this.g.get()).c("GCM.handleOrderData.OrderNotFound");
                        a = ((ysg) this.b.get()).a(str9);
                    }
                    TaxiOrder taxiOrder2 = a;
                    if (taxiOrder2 != null) {
                        String str15 = (String) map.get(FcmNotificationService.KEY_TITLE);
                        String str16 = (String) map.get(FcmNotificationService.KEY_BODY);
                        pzt0 pzt0Var = this.k;
                        if (pzt0Var != null) {
                            pzt0Var.a(null);
                        }
                        if (taxiOrder2.h.b != DriveState.DRIVING) {
                            this.k = tje.N(this.a, null, null, new OrderPushHandler$handleAlternativePointAFoundPush$1(this, taxiOrder2, map, str15, str16, b, null), 3);
                        } else {
                            d(map, taxiOrder2, str15, str16, b);
                        }
                    }
                    return Boolean.TRUE;
                }
                aVar = this;
                map2 = map;
                if (((ysg) aVar.b.get()).e(str9)) {
                    r85.h(aVar.i, map2);
                    return Boolean.TRUE;
                }
                if (a == null) {
                    ((c) aVar.g.get()).c("GCM.handleOrderData.OrderNotFound");
                    return Boolean.TRUE;
                }
                if ("override_foreground".equals(str10)) {
                    String str17 = (String) map2.get("title");
                    String str18 = (String) map2.get("msg");
                    List c2 = c(map);
                    if (c2 == null) {
                        c2 = EmptyList.a;
                    }
                    List list2 = c2;
                    int d = gw00.d(tcc.n(list2, 10));
                    if (d < 16) {
                        d = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                    for (Object obj2 : list2) {
                        linkedHashMap.put(obj2, new OrderForegroundNotificationOverrides(str17, str18));
                    }
                    if (!linkedHashMap.isEmpty()) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(a.l.N);
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            linkedHashMap2.put((String) entry.getKey(), (OrderForegroundNotificationOverrides) entry.getValue());
                        }
                        synchronized (a) {
                            TaxiOrderLocalData taxiOrderLocalData = a.l;
                            taxiOrderLocalData.getClass();
                            a.l = TaxiOrderLocalData.b(taxiOrderLocalData, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, linkedHashMap2, null, null, null, null, null, null, null, null, false, null, false, null, null, null, -1, 16777087);
                        }
                    }
                    ((ysg) aVar.b.get()).g(a);
                }
                synchronized (a) {
                    a.l = a.l.K(str12);
                }
                synchronized (a) {
                    TaxiOrderOverrides taxiOrderOverrides = a.h;
                    taxiOrderOverrides.getClass();
                    a.h = TaxiOrderOverrides.a(taxiOrderOverrides, null, null, null, 3);
                }
                y yVar = (y) aVar.f.get();
                orderPushHandler$handle$1.L$0 = map2;
                orderPushHandler$handle$1.L$1 = null;
                orderPushHandler$handle$1.L$2 = null;
                orderPushHandler$handle$1.L$3 = null;
                orderPushHandler$handle$1.L$4 = null;
                orderPushHandler$handle$1.L$5 = a;
                orderPushHandler$handle$1.J$0 = b;
                orderPushHandler$handle$1.label = 2;
                if (yVar.p(a, b, orderPushHandler$handle$1) != coroutineSingletons) {
                    j = b;
                    taxiOrder = a;
                    if ("information".equals((String) map2.get("type"))) {
                    }
                    return Boolean.TRUE;
                }
                return coroutineSingletons;
            }
        }
        orderPushHandler$handle$1 = new OrderPushHandler$handle$1(this, continuationImpl);
        Object obj3 = orderPushHandler$handle$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderPushHandler$handle$1.label;
        if (i == 0) {
        }
    }

    public final List c(Map map) {
        String str = (String) map.get("show_on_status");
        if (str == null) {
            return null;
        }
        return (List) ((xnt) this.h).c(str, new p53(auu0.a, 0));
    }

    public final void d(Map map, TaxiOrder taxiOrder, String str, String str2, long j) {
        if (taxiOrder.h.b != DriveState.DRIVING || str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            h3y h3yVar = this.i;
            String str3 = (String) map.get("id");
            if (str3 != null) {
                ((com.yandex.go.notifications.acknowledge.domain.a) ((p1g0) h3yVar.get()).a.get()).b(str3, PushAckStatus.HIDDEN);
                return;
            }
            return;
        }
        y180 y180Var = (y180) this.c.get();
        String p = taxiOrder.p();
        y180Var.getClass();
        int f = y180.f(taxiOrder.a, OrderNotification$OrderNotificationType.ORDER_ALTERNATIVE_POINT_A_FOUND);
        q280 q280Var = y180Var.a;
        q280Var.getClass();
        NotificationShareData.a builder = NotificationShareData.INSTANCE.builder();
        builder.b = oyr.i(f, "local:taxi_order:altPointA:");
        String str4 = taxiOrder.a;
        builder.g = kotlin.collections.b.h(new Pair(FinishFlowStatus.ORDER_ID_FIELD_NAME, str4));
        builder.a = f;
        Intent intent = new Intent(q280Var.a, (Class<?>) q280Var.k.a(AndroidComponentRepository$Component.MAIN_ACTIVITY));
        xq70 xq70Var = (xq70) q280Var.g;
        wzx0 wzx0Var = new wzx0(str4, xq70Var.d(), false);
        ((pux0) xq70Var.a).getClass();
        q280Var.c.m(builder, q280Var.c.i(str2, str, null, "order", q280Var.c(intent.setData(xq70.a(wzx0Var, pux0.c)).setAction("android.intent.action.VIEW").putExtra("notification_share_data_extra", builder.a()).addFlags(SelfTester_JCP.IMITA), true, null), j), p, "order");
    }
}
