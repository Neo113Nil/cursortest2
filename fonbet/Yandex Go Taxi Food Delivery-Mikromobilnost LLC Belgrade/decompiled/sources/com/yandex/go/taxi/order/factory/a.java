package com.yandex.go.taxi.order.factory;

import com.yandex.go.taxi.order.models.api.request.OrderStatusParam;
import com.yandex.go.taxi.order.perf.experiment.d;
import com.yandex.go.ultima_mode.domain.c;
import defpackage.bg5;
import defpackage.h3y;
import defpackage.n20;
import defpackage.ny61;
import defpackage.scc;
import defpackage.xv11;
import defpackage.xwp0;
import defpackage.y3y0;
import java.util.List;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class a {
    public final n20 a;
    public final xwp0 b;
    public final xv11 c;
    public final bg5 d;
    public final h3y e;

    public a(n20 n20Var, xwp0 xwp0Var, xv11 xv11Var, bg5 bg5Var, h3y h3yVar) {
        this.a = n20Var;
        this.b = xwp0Var;
        this.c = xv11Var;
        this.d = bg5Var;
        this.e = h3yVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, boolean z, OrderStatusParam.Break r38, String str4, Map map, OrderStatusParam.OrderContact orderContact, ContinuationImpl continuationImpl) {
        OrderStatusParamFactory$create$1 orderStatusParamFactory$create$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        List g;
        OrderStatusParam.SearchStateInfoRequest searchStateInfoRequest;
        String str5;
        OrderStatusParam.Break r9;
        String str6;
        Map map2;
        OrderStatusParam.OrderContact orderContact2;
        boolean z2;
        int i2;
        String str7;
        Object b;
        Object obj;
        String str8;
        OrderStatusParam.OrderContact orderContact3;
        String str9;
        OrderStatusParam.Break r10;
        OrderStatusParam.SearchStateInfoRequest searchStateInfoRequest2;
        Boolean bool;
        String str10;
        int i3;
        Object a;
        String str11;
        String str12;
        OrderStatusParam.SearchStateInfoRequest searchStateInfoRequest3;
        OrderStatusParam.Break r20;
        boolean z3;
        String str13;
        String str14 = str2;
        if (continuationImpl instanceof OrderStatusParamFactory$create$1) {
            orderStatusParamFactory$create$1 = (OrderStatusParamFactory$create$1) continuationImpl;
            int i4 = orderStatusParamFactory$create$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                orderStatusParamFactory$create$1.label = i4 - Integer.MIN_VALUE;
                Object obj2 = orderStatusParamFactory$create$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderStatusParamFactory$create$1.label;
                xv11 xv11Var = this.c;
                if (i != 0) {
                    b.b(obj2);
                    g = scc.g("midpointchange", "code_dispatch");
                    searchStateInfoRequest = (OrderStatusParam.SearchStateInfoRequest) this.b.a.get(str14);
                    orderStatusParamFactory$create$1.L$0 = null;
                    orderStatusParamFactory$create$1.L$1 = null;
                    orderStatusParamFactory$create$1.L$2 = null;
                    orderStatusParamFactory$create$1.L$3 = null;
                    orderStatusParamFactory$create$1.L$4 = null;
                    orderStatusParamFactory$create$1.L$5 = null;
                    orderStatusParamFactory$create$1.L$6 = null;
                    orderStatusParamFactory$create$1.L$7 = str;
                    orderStatusParamFactory$create$1.L$8 = str14;
                    str5 = str3;
                    orderStatusParamFactory$create$1.L$9 = str5;
                    r9 = r38;
                    orderStatusParamFactory$create$1.L$10 = r9;
                    str6 = str4;
                    orderStatusParamFactory$create$1.L$11 = str6;
                    map2 = map;
                    orderStatusParamFactory$create$1.L$12 = map2;
                    orderContact2 = orderContact;
                    orderStatusParamFactory$create$1.L$13 = orderContact2;
                    orderStatusParamFactory$create$1.L$14 = g;
                    orderStatusParamFactory$create$1.L$15 = searchStateInfoRequest;
                    z2 = z;
                    orderStatusParamFactory$create$1.Z$0 = z2;
                    i2 = 1;
                    orderStatusParamFactory$create$1.label = 1;
                    Object k = ((com.yandex.go.taxi.order.provider.a) this.a).k(orderStatusParamFactory$create$1);
                    if (k != coroutineSingletons) {
                        str7 = str;
                        obj2 = k;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z3 = orderStatusParamFactory$create$1.Z$0;
                        String str15 = (String) orderStatusParamFactory$create$1.L$17;
                        bool = (Boolean) orderStatusParamFactory$create$1.L$16;
                        OrderStatusParam.SearchStateInfoRequest searchStateInfoRequest4 = (OrderStatusParam.SearchStateInfoRequest) orderStatusParamFactory$create$1.L$15;
                        g = (List) orderStatusParamFactory$create$1.L$14;
                        orderContact3 = (OrderStatusParam.OrderContact) orderStatusParamFactory$create$1.L$13;
                        map2 = (Map) orderStatusParamFactory$create$1.L$12;
                        str9 = (String) orderStatusParamFactory$create$1.L$11;
                        OrderStatusParam.Break r13 = (OrderStatusParam.Break) orderStatusParamFactory$create$1.L$10;
                        str8 = (String) orderStatusParamFactory$create$1.L$9;
                        String str16 = (String) orderStatusParamFactory$create$1.L$8;
                        String str17 = (String) orderStatusParamFactory$create$1.L$7;
                        b.b(obj2);
                        str12 = str15;
                        searchStateInfoRequest3 = searchStateInfoRequest4;
                        str13 = str17;
                        r20 = r13;
                        str11 = str16;
                        Boolean bool2 = bool;
                        List list = g;
                        OrderStatusParam.OrderContact orderContact4 = orderContact3;
                        Map map3 = map2;
                        String str18 = str9;
                        String str19 = str8;
                        String str20 = (String) obj2;
                        bg5 bg5Var = this.d;
                        return new OrderStatusParam(str13, str11, str19, r20, str18, map3, orderContact4, list, searchStateInfoRequest3, bool2, str12, str20, new Integer(bg5Var.b()), bg5Var.c().getTitle(), !z3 && ((d) ((y3y0) this.e.get())).b().l);
                    }
                    int i5 = orderStatusParamFactory$create$1.I$0;
                    boolean z4 = orderStatusParamFactory$create$1.Z$0;
                    Boolean bool3 = (Boolean) orderStatusParamFactory$create$1.L$16;
                    searchStateInfoRequest2 = (OrderStatusParam.SearchStateInfoRequest) orderStatusParamFactory$create$1.L$15;
                    List list2 = (List) orderStatusParamFactory$create$1.L$14;
                    OrderStatusParam.OrderContact orderContact5 = (OrderStatusParam.OrderContact) orderStatusParamFactory$create$1.L$13;
                    Map map4 = (Map) orderStatusParamFactory$create$1.L$12;
                    String str21 = (String) orderStatusParamFactory$create$1.L$11;
                    OrderStatusParam.Break r15 = (OrderStatusParam.Break) orderStatusParamFactory$create$1.L$10;
                    String str22 = (String) orderStatusParamFactory$create$1.L$9;
                    String str23 = (String) orderStatusParamFactory$create$1.L$8;
                    String str24 = (String) orderStatusParamFactory$create$1.L$7;
                    b.b(obj2);
                    i3 = i5;
                    obj = obj2;
                    str10 = str23;
                    map2 = map4;
                    z2 = z4;
                    bool = bool3;
                    orderContact3 = orderContact5;
                    str9 = str21;
                    str8 = str22;
                    g = list2;
                    r10 = r15;
                    str7 = str24;
                    String str25 = (String) obj;
                    orderStatusParamFactory$create$1.L$0 = null;
                    orderStatusParamFactory$create$1.L$1 = null;
                    orderStatusParamFactory$create$1.L$2 = null;
                    orderStatusParamFactory$create$1.L$3 = null;
                    orderStatusParamFactory$create$1.L$4 = null;
                    orderStatusParamFactory$create$1.L$5 = null;
                    orderStatusParamFactory$create$1.L$6 = null;
                    orderStatusParamFactory$create$1.L$7 = str7;
                    orderStatusParamFactory$create$1.L$8 = str10;
                    orderStatusParamFactory$create$1.L$9 = str8;
                    orderStatusParamFactory$create$1.L$10 = r10;
                    orderStatusParamFactory$create$1.L$11 = str9;
                    orderStatusParamFactory$create$1.L$12 = map2;
                    orderStatusParamFactory$create$1.L$13 = orderContact3;
                    orderStatusParamFactory$create$1.L$14 = g;
                    orderStatusParamFactory$create$1.L$15 = searchStateInfoRequest2;
                    orderStatusParamFactory$create$1.L$16 = bool;
                    orderStatusParamFactory$create$1.L$17 = str25;
                    orderStatusParamFactory$create$1.Z$0 = z2;
                    orderStatusParamFactory$create$1.I$0 = i3;
                    orderStatusParamFactory$create$1.label = 3;
                    a = ((c) xv11Var).a(orderStatusParamFactory$create$1);
                    if (a != coroutineSingletons) {
                        str11 = str10;
                        str12 = str25;
                        searchStateInfoRequest3 = searchStateInfoRequest2;
                        r20 = r10;
                        z3 = z2;
                        str13 = str7;
                        obj2 = a;
                        Boolean bool22 = bool;
                        List list3 = g;
                        OrderStatusParam.OrderContact orderContact42 = orderContact3;
                        Map map32 = map2;
                        String str182 = str9;
                        String str192 = str8;
                        String str202 = (String) obj2;
                        bg5 bg5Var2 = this.d;
                        return new OrderStatusParam(str13, str11, str192, r20, str182, map32, orderContact42, list3, searchStateInfoRequest3, bool22, str12, str202, new Integer(bg5Var2.b()), bg5Var2.c().getTitle(), !z3 && ((d) ((y3y0) this.e.get())).b().l);
                    }
                    return coroutineSingletons;
                }
                boolean z5 = orderStatusParamFactory$create$1.Z$0;
                searchStateInfoRequest = (OrderStatusParam.SearchStateInfoRequest) orderStatusParamFactory$create$1.L$15;
                g = (List) orderStatusParamFactory$create$1.L$14;
                OrderStatusParam.OrderContact orderContact6 = (OrderStatusParam.OrderContact) orderStatusParamFactory$create$1.L$13;
                Map map5 = (Map) orderStatusParamFactory$create$1.L$12;
                String str26 = (String) orderStatusParamFactory$create$1.L$11;
                OrderStatusParam.Break r12 = (OrderStatusParam.Break) orderStatusParamFactory$create$1.L$10;
                String str27 = (String) orderStatusParamFactory$create$1.L$9;
                String str28 = (String) orderStatusParamFactory$create$1.L$8;
                str7 = (String) orderStatusParamFactory$create$1.L$7;
                b.b(obj2);
                orderContact2 = orderContact6;
                r9 = r12;
                map2 = map5;
                str6 = str26;
                str5 = str27;
                z2 = z5;
                str14 = str28;
                i2 = 1;
                Boolean valueOf = Boolean.valueOf(((List) obj2).size() <= i2 ? i2 : 0);
                orderStatusParamFactory$create$1.L$0 = null;
                orderStatusParamFactory$create$1.L$1 = null;
                orderStatusParamFactory$create$1.L$2 = null;
                orderStatusParamFactory$create$1.L$3 = null;
                orderStatusParamFactory$create$1.L$4 = null;
                orderStatusParamFactory$create$1.L$5 = null;
                orderStatusParamFactory$create$1.L$6 = null;
                orderStatusParamFactory$create$1.L$7 = str7;
                orderStatusParamFactory$create$1.L$8 = str14;
                orderStatusParamFactory$create$1.L$9 = str5;
                orderStatusParamFactory$create$1.L$10 = r9;
                orderStatusParamFactory$create$1.L$11 = str6;
                orderStatusParamFactory$create$1.L$12 = map2;
                orderStatusParamFactory$create$1.L$13 = orderContact2;
                orderStatusParamFactory$create$1.L$14 = g;
                orderStatusParamFactory$create$1.L$15 = searchStateInfoRequest;
                orderStatusParamFactory$create$1.L$16 = valueOf;
                orderStatusParamFactory$create$1.Z$0 = z2;
                orderStatusParamFactory$create$1.I$0 = 0;
                orderStatusParamFactory$create$1.label = 2;
                b = ((c) xv11Var).b(orderStatusParamFactory$create$1);
                if (b != coroutineSingletons) {
                    obj = b;
                    str8 = str5;
                    orderContact3 = orderContact2;
                    str9 = str6;
                    r10 = r9;
                    searchStateInfoRequest2 = searchStateInfoRequest;
                    bool = valueOf;
                    str10 = str14;
                    i3 = 0;
                    String str252 = (String) obj;
                    orderStatusParamFactory$create$1.L$0 = null;
                    orderStatusParamFactory$create$1.L$1 = null;
                    orderStatusParamFactory$create$1.L$2 = null;
                    orderStatusParamFactory$create$1.L$3 = null;
                    orderStatusParamFactory$create$1.L$4 = null;
                    orderStatusParamFactory$create$1.L$5 = null;
                    orderStatusParamFactory$create$1.L$6 = null;
                    orderStatusParamFactory$create$1.L$7 = str7;
                    orderStatusParamFactory$create$1.L$8 = str10;
                    orderStatusParamFactory$create$1.L$9 = str8;
                    orderStatusParamFactory$create$1.L$10 = r10;
                    orderStatusParamFactory$create$1.L$11 = str9;
                    orderStatusParamFactory$create$1.L$12 = map2;
                    orderStatusParamFactory$create$1.L$13 = orderContact3;
                    orderStatusParamFactory$create$1.L$14 = g;
                    orderStatusParamFactory$create$1.L$15 = searchStateInfoRequest2;
                    orderStatusParamFactory$create$1.L$16 = bool;
                    orderStatusParamFactory$create$1.L$17 = str252;
                    orderStatusParamFactory$create$1.Z$0 = z2;
                    orderStatusParamFactory$create$1.I$0 = i3;
                    orderStatusParamFactory$create$1.label = 3;
                    a = ((c) xv11Var).a(orderStatusParamFactory$create$1);
                    if (a != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        orderStatusParamFactory$create$1 = new OrderStatusParamFactory$create$1(this, continuationImpl);
        Object obj22 = orderStatusParamFactory$create$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderStatusParamFactory$create$1.label;
        xv11 xv11Var2 = this.c;
        if (i != 0) {
        }
        Boolean valueOf2 = Boolean.valueOf(((List) obj22).size() <= i2 ? i2 : 0);
        orderStatusParamFactory$create$1.L$0 = null;
        orderStatusParamFactory$create$1.L$1 = null;
        orderStatusParamFactory$create$1.L$2 = null;
        orderStatusParamFactory$create$1.L$3 = null;
        orderStatusParamFactory$create$1.L$4 = null;
        orderStatusParamFactory$create$1.L$5 = null;
        orderStatusParamFactory$create$1.L$6 = null;
        orderStatusParamFactory$create$1.L$7 = str7;
        orderStatusParamFactory$create$1.L$8 = str14;
        orderStatusParamFactory$create$1.L$9 = str5;
        orderStatusParamFactory$create$1.L$10 = r9;
        orderStatusParamFactory$create$1.L$11 = str6;
        orderStatusParamFactory$create$1.L$12 = map2;
        orderStatusParamFactory$create$1.L$13 = orderContact2;
        orderStatusParamFactory$create$1.L$14 = g;
        orderStatusParamFactory$create$1.L$15 = searchStateInfoRequest;
        orderStatusParamFactory$create$1.L$16 = valueOf2;
        orderStatusParamFactory$create$1.Z$0 = z2;
        orderStatusParamFactory$create$1.I$0 = 0;
        orderStatusParamFactory$create$1.label = 2;
        b = ((c) xv11Var2).b(orderStatusParamFactory$create$1);
        if (b != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
