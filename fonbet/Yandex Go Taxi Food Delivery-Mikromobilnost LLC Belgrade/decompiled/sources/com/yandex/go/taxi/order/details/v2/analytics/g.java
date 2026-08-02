package com.yandex.go.taxi.order.details.v2.analytics;

import com.yandex.go.taxi.order.analytics.TaxiOrderAnalytics$RideCardOpenSource;
import com.yandex.go.taxi.order.analytics.TaxiOrderAnalytics$RideCardPresentation;
import com.yandex.go.taxi.order.analytics.TaxiOrderAnalytics$TaxiOrderStatus;
import com.yandex.go.taxi.order.details.v2.analytics.perf.RideCardPerfAnalytics$RenderViewType;
import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import com.yandex.go.taxi.order.view.l;
import defpackage.kpa1;
import defpackage.m810;
import defpackage.mlk0;
import defpackage.mqs0;
import defpackage.nqi0;
import defpackage.nqs0;
import defpackage.o2y0;
import defpackage.p9g0;
import defpackage.qnk0;
import defpackage.qpa1;
import defpackage.qqy;
import defpackage.tcc;
import defpackage.vbk0;
import defpackage.vpa1;
import defpackage.wbk0;
import defpackage.wrs0;
import defpackage.x4e;
import defpackage.xbk0;
import defpackage.yu0;
import defpackage.yxx0;
import defpackage.zjk0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.m0;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class g {
    public final o2y0 a;
    public final com.yandex.go.taxi.order.details.v2.domain.feedback.sending.a b;
    public final com.yandex.go.taxi.order.details.v2.state.d c;
    public final xbk0 d;
    public final mlk0 e;
    public final yxx0 f;
    public final l g;

    public g(o2y0 o2y0Var, com.yandex.go.taxi.order.details.v2.domain.feedback.sending.a aVar, com.yandex.go.taxi.order.details.v2.state.d dVar, xbk0 xbk0Var, mlk0 mlk0Var, yxx0 yxx0Var, l lVar) {
        this.a = o2y0Var;
        this.b = aVar;
        this.c = dVar;
        this.d = xbk0Var;
        this.e = mlk0Var;
        this.f = yxx0Var;
        this.g = lVar;
    }

    public static String a(wrs0 wrs0Var) {
        Object obj = wrs0Var.getExtras().get("analytics_id");
        String str = obj instanceof String ? (String) obj : null;
        return str == null ? "" : str;
    }

    public final void b(String str, wrs0 wrs0Var) {
        TaxiOrderAnalytics$RideCardPresentation f;
        String str2;
        RideCardPresentationType rideCardPresentationType = ((qnk0) this.c.f.getValue()).c;
        if (rideCardPresentationType == RideCardPresentationType.NONE) {
            rideCardPresentationType = null;
        }
        if (rideCardPresentationType == null || (f = kpa1.f(rideCardPresentationType)) == null) {
            return;
        }
        Object obj = wrs0Var.getExtras().get("rating");
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        com.yandex.go.taxi.order.details.v2.domain.feedback.sending.a aVar = this.b;
        o2y0 o2y0Var = this.a;
        if (num != null) {
            String str3 = o2y0Var.b().a;
            if (aVar.g.f("key_rating_selected" + str3)) {
                return;
            }
            String str4 = o2y0Var.b().a;
            aVar.g.u("key_rating_selected" + str4, true);
        }
        Object obj2 = wrs0Var.getExtras().get("question_id");
        String str5 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = wrs0Var.getExtras().get("answer_id");
        String str6 = obj3 instanceof String ? (String) obj3 : null;
        if (str5 != null && str5.length() != 0 && str6 != null && str6.length() != 0) {
            String str7 = o2y0Var.b().a;
            if (aVar.g.f("key_feedback_question" + str7)) {
                return;
            }
            String str8 = o2y0Var.b().a;
            aVar.g.u("key_feedback_question" + str8, true);
        }
        String a = a(wrs0Var);
        Object obj4 = wrs0Var.getExtras().get("due_source");
        String str9 = obj4 instanceof String ? (String) obj4 : null;
        Object obj5 = wrs0Var.getExtras().get("due_destination");
        String str10 = obj5 instanceof String ? (String) obj5 : null;
        Object obj6 = wrs0Var.getExtras().get("price");
        Integer num2 = num;
        String str11 = obj6 instanceof String ? (String) obj6 : null;
        MapBuilder mapBuilder = new MapBuilder();
        if (num2 != null) {
            str2 = a;
            mapBuilder.put("rating", Integer.valueOf(num2.intValue()));
        } else {
            str2 = a;
        }
        if (str5 != null && str5.length() != 0) {
            mapBuilder.put("question_id", str5);
        }
        if (str6 != null && str6.length() != 0) {
            mapBuilder.put("answer_id", str6);
        }
        if (str9 != null) {
            mapBuilder.put("due_source", str9);
        }
        if (str10 != null) {
            mapBuilder.put("due_destination", str10);
        }
        if (str11 != null) {
            mapBuilder.put("price", str11);
        }
        MapBuilder j = mapBuilder.j();
        this.f.a(o2y0Var.b().a, kpa1.g(o2y0Var.c()), f, str2, str, !j.isEmpty() ? j : null);
    }

    public final void c(OrderScreen orderScreen, RideCardPresentationType rideCardPresentationType) {
        TaxiOrderAnalytics$RideCardPresentation f = kpa1.f(rideCardPresentationType);
        if (f == null) {
            return;
        }
        int i = vbk0.b[orderScreen.ordinal()];
        TaxiOrderAnalytics$RideCardOpenSource taxiOrderAnalytics$RideCardOpenSource = i != 1 ? (i == 2 || i == 3) ? TaxiOrderAnalytics$RideCardOpenSource.Order : null : TaxiOrderAnalytics$RideCardOpenSource.OrdersList;
        if (taxiOrderAnalytics$RideCardOpenSource == null) {
            return;
        }
        o2y0 o2y0Var = this.a;
        String str = o2y0Var.b().a;
        TaxiOrderAnalytics$TaxiOrderStatus g = kpa1.g(o2y0Var.c());
        yxx0 yxx0Var = this.f;
        yxx0Var.getClass();
        HashMap p = x4e.p("order_id", str);
        p.put("order_status", g.getEventValue());
        p.put("presentation", f.getEventValue());
        p.put("from", taxiOrderAnalytics$RideCardOpenSource.getEventValue());
        yxx0Var.a.a("TaxiOrder.RideCard.Opened", p, 2, new HashMap());
    }

    public final void d(long j, wrs0 wrs0Var, RideCardPerfAnalytics$RenderViewType rideCardPerfAnalytics$RenderViewType) {
        Object obj = wrs0Var.getExtras().get("analytics_id");
        String str = obj instanceof String ? (String) obj : null;
        if (str != null && this.d.b.add(str)) {
            RideCardPresentationType rideCardPresentationType = ((qnk0) this.c.f.getValue()).c;
            if (rideCardPresentationType == RideCardPresentationType.NONE) {
                rideCardPresentationType = null;
            }
            String b = rideCardPresentationType != null ? vpa1.b(rideCardPresentationType) : null;
            long c = m810.c(j / 1000000.0d);
            i d = ((j) this.e.a).d("Perf.RideCard.ElementBind");
            LinkedHashMap linkedHashMap = d.a;
            linkedHashMap.put("card_state", b);
            linkedHashMap.put("analytics_id", str);
            d.c(c, RemoteBioParameters.TIME);
            linkedHashMap.put("view", rideCardPerfAnalytics$RenderViewType.getValue());
            d.i();
            d.m();
        }
    }

    public final void e(wrs0 wrs0Var) {
        TaxiOrderAnalytics$RideCardPresentation f;
        o2y0 o2y0Var = this.a;
        DriveState c = o2y0Var.c();
        if (wrs0Var.getExtras().isEmpty()) {
            return;
        }
        String a = a(wrs0Var);
        RideCardPresentationType rideCardPresentationType = ((qnk0) this.c.f.getValue()).c;
        if (rideCardPresentationType == RideCardPresentationType.NONE) {
            rideCardPresentationType = null;
        }
        if (rideCardPresentationType == null || (f = kpa1.f(rideCardPresentationType)) == null) {
            return;
        }
        xbk0 xbk0Var = this.d;
        if (((Set) xbk0Var.a.computeIfAbsent(c, new yu0(20, new nqi0(26)))).contains(new wbk0(rideCardPresentationType, a))) {
            return;
        }
        Object obj = wrs0Var.getExtras().get("slot_item_actions");
        Collection collection = obj instanceof Collection ? (Collection) obj : null;
        Collection collection2 = EmptyList.a;
        if (collection == null) {
            collection = collection2;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : collection) {
            if (!(((nqs0) obj2) instanceof mqs0)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((nqs0) it.next()).a());
        }
        Object obj3 = wrs0Var.getExtras().get("elements");
        Collection collection3 = obj3 instanceof Collection ? (Collection) obj3 : null;
        if (collection3 != null) {
            collection2 = collection3;
        }
        ListBuilder f2 = qpa1.f(collection2);
        ArrayList arrayList3 = new ArrayList(tcc.n(f2, 10));
        ListIterator listIterator = f2.listIterator(0);
        while (true) {
            qqy qqyVar = (qqy) listIterator;
            if (!qqyVar.hasNext()) {
                break;
            } else {
                arrayList3.add(a(((zjk0) qqyVar.next()).getAnalytics()));
            }
        }
        String str = o2y0Var.b().a;
        TaxiOrderAnalytics$TaxiOrderStatus g = kpa1.g(c);
        if (arrayList3.isEmpty()) {
            arrayList3 = null;
        }
        ArrayList arrayList4 = arrayList2.isEmpty() ? null : arrayList2;
        yxx0 yxx0Var = this.f;
        yxx0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("order_id", str);
        hashMap.put("order_status", g.getEventValue());
        hashMap.put("presentation", f.getEventValue());
        hashMap.put("analytics_id", a);
        if (arrayList3 != null) {
            hashMap.put("items", arrayList3);
        }
        if (arrayList4 != null) {
            hashMap.put("actions", arrayList4);
        }
        yxx0Var.a.a("TaxiOrder.RideCardItem.Shown", hashMap, 1, new HashMap());
        ((Set) xbk0Var.a.computeIfAbsent(c, new yu0(19, new nqi0(25)))).add(new wbk0(rideCardPresentationType, a));
    }

    public final Object f(RideCardPresentationType rideCardPresentationType, SuspendLambda suspendLambda) {
        return new d(kotlinx.coroutines.flow.e.t(new f(new b(new m0(this.c.g, new com.yandex.go.taxi.order.view.i(this.g.j), RideCardAnalyticsInteractor$subscribeOrderStateChange$2.a), this, rideCardPresentationType)))).collect(new p9g0(4, new Ref$ObjectRef(), this), suspendLambda);
    }
}
