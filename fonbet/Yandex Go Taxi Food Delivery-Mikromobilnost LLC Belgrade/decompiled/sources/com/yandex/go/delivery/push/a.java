package com.yandex.go.delivery.push;

import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.core.app.v;
import androidx.core.graphics.drawable.IconCompat;
import com.adjust.sdk.Constants;
import com.yandex.delivery.mapper.model.Expansion;
import defpackage.auu0;
import defpackage.cm2;
import defpackage.e3n;
import defpackage.eo5;
import defpackage.fjz;
import defpackage.gli;
import defpackage.h3y;
import defpackage.hst;
import defpackage.iw00;
import defpackage.jgz;
import defpackage.jl40;
import defpackage.jst;
import defpackage.k8u;
import defpackage.ny61;
import defpackage.p1g0;
import defpackage.qcx;
import defpackage.qnr0;
import defpackage.r85;
import defpackage.ruh;
import defpackage.t1b0;
import defpackage.wnt;
import defpackage.xby;
import defpackage.xk60;
import defpackage.xnt;
import defpackage.xww0;
import defpackage.zf0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import ru.yandex.taxi.logistics.delivery_state.DeliveryPushParams;
import ru.yandex.taxi.notifications.push.model.NotificationShareData;
import ru.yandex.taxi.vendor_api.google.push.FcmNotificationService;

/* loaded from: classes12.dex */
public final class a implements xww0 {
    public final h3y a;
    public final h3y b;
    public final h3y c;
    public final h3y d;
    public final wnt e;
    public final h3y f;
    public final eo5 g;

    public a(h3y h3yVar, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4, wnt wntVar, h3y h3yVar5, eo5 eo5Var) {
        this.a = h3yVar;
        this.b = h3yVar2;
        this.c = h3yVar3;
        this.d = h3yVar4;
        this.e = wntVar;
        this.f = h3yVar5;
        this.g = eo5Var;
    }

    public static List c(c cVar, DeliveryPushParams deliveryPushParams) {
        String str;
        Bundle bundle;
        b bVar = (b) cVar.get("action_buttons");
        kotlinx.serialization.json.a l = bVar != null ? qcx.l(bVar) : null;
        if (l != null) {
            List list = l.a;
            if (deliveryPushParams != null) {
                hst hstVar = jst.e;
                list.size();
                hstVar.getClass();
                ArrayList arrayList = new ArrayList();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    try {
                        c m = qcx.m(l.get(i));
                        b bVar2 = (b) m.get("text");
                        String g = bVar2 != null ? qcx.g(qcx.n(bVar2)) : null;
                        String str2 = "";
                        if (g == null) {
                            g = "";
                        }
                        b bVar3 = (b) m.get("action");
                        String g2 = bVar3 != null ? qcx.g(qcx.n(bVar3)) : null;
                        if (g2 != null) {
                            str2 = g2;
                        }
                        if (str2.equals("open_tracking")) {
                            str = "pay_on_delivery";
                            bundle = new Bundle();
                            bundle.putSerializable("ru.yandex.taxi.activity.MainActivity.DELIVERY_TO_DISPLAY_EXTRA", deliveryPushParams);
                        } else {
                            str = null;
                            bundle = null;
                        }
                        if (g.length() <= 0 || bundle == null) {
                            jst.e.d("a", "Skipping action button due to missing text or extras");
                        } else {
                            arrayList.add(new ruh(g, str, bundle));
                        }
                    } catch (Exception e) {
                        jst.e.h("a", "Failed to process action button at index " + i, e);
                    }
                }
                return arrayList;
            }
        }
        return EmptyList.a;
    }

    @Override // defpackage.xww0
    public final Object b(Map map, ContinuationImpl continuationImpl) {
        hst hstVar = jst.e;
        hstVar.getClass();
        String str = (String) map.get(FcmNotificationService.KEY_TITLE);
        String str2 = (String) map.get(FcmNotificationService.KEY_BODY);
        String str3 = (String) map.get("image_tag");
        String str4 = (String) map.get("logistics");
        if (str4 != null) {
            return f(map, str, str2, str3, str4, continuationImpl);
        }
        hstVar.d("a", "No logistics payload found in push data");
        return Boolean.FALSE;
    }

    public final DeliveryPushParams d(String str, c cVar) {
        Map f;
        b bVar;
        if (cVar.containsKey(Constants.REFERRER_API_META)) {
            try {
                f = (Map) ((xnt) this.e).c(String.valueOf(cVar.get(Constants.REFERRER_API_META)), new k8u(auu0.a, cm2.a, 1));
            } catch (Exception e) {
                jst.e.h("a", "Failed to parse metadata, using empty map", e);
                f = kotlin.collections.b.f();
            }
        } else {
            f = kotlin.collections.b.f();
        }
        String str2 = null;
        if (!cVar.containsKey("expansion")) {
            cVar = null;
        }
        if (cVar != null && (bVar = (b) cVar.get("expansion")) != null) {
            str2 = qcx.g(qcx.n(bVar));
        }
        return new DeliveryPushParams(str, jl40.l(str2, "anchored") ? Expansion.ANCHORED : jl40.l(str2, "collapsed") ? Expansion.COLLAPSED : Expansion.EXPANDED, f);
    }

    public final Bundle e(c cVar) {
        String g;
        String str;
        Bundle bundle = new Bundle();
        b bVar = (b) cVar.get("delivery_id");
        if (bVar != null && (g = qcx.g(qcx.n(bVar))) != null) {
            DeliveryPushParams d = d(g, cVar);
            b bVar2 = (b) cVar.get("type");
            if (jl40.l(bVar2 != null ? qcx.g(qcx.n(bVar2)) : null, "delivery-with-postcard")) {
                jst.e.getClass();
                str = "ru.yandex.taxi.activity.MainActivity.DELIVERY_POSTCARD_TO_DISPLAY_EXTRA";
            } else {
                jst.e.getClass();
                str = "ru.yandex.taxi.activity.MainActivity.DELIVERY_TO_DISPLAY_EXTRA";
            }
            bundle.putSerializable(str, d);
        }
        return bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0295, code lost:
    
        if (g(r2, r3, (android.graphics.Bitmap) r0, r5, r6, r7, r8, r9, r10) != r11) goto L106;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018f A[Catch: all -> 0x01c2, TryCatch #1 {all -> 0x01c2, blocks: (B:80:0x0184, B:82:0x018f, B:84:0x0197, B:85:0x01bf, B:87:0x01c5, B:89:0x01df, B:91:0x01f1, B:92:0x01fa, B:94:0x0204, B:95:0x020e, B:97:0x0216, B:99:0x0222, B:100:0x0228), top: B:79:0x0184 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c5 A[Catch: all -> 0x01c2, TryCatch #1 {all -> 0x01c2, blocks: (B:80:0x0184, B:82:0x018f, B:84:0x0197, B:85:0x01bf, B:87:0x01c5, B:89:0x01df, B:91:0x01f1, B:92:0x01fa, B:94:0x0204, B:95:0x020e, B:97:0x0216, B:99:0x0222, B:100:0x0228), top: B:79:0x0184 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Map map, String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        DeliveryPushHandler$processLogisticsPush$1 deliveryPushHandler$processLogisticsPush$1;
        int i;
        DeliveryPushHandler$processLogisticsPush$1 deliveryPushHandler$processLogisticsPush$12;
        Object obj;
        h3y h3yVar;
        MapBuilder mapBuilder;
        String str5;
        Map map2;
        String str6;
        Bundle bundle;
        String str7;
        String str8;
        gli gliVar;
        List list;
        boolean z;
        boolean z2;
        Map map3 = map;
        if (continuationImpl instanceof DeliveryPushHandler$processLogisticsPush$1) {
            deliveryPushHandler$processLogisticsPush$1 = (DeliveryPushHandler$processLogisticsPush$1) continuationImpl;
            int i2 = deliveryPushHandler$processLogisticsPush$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryPushHandler$processLogisticsPush$1.label = i2 - Integer.MIN_VALUE;
                DeliveryPushHandler$processLogisticsPush$1 deliveryPushHandler$processLogisticsPush$13 = deliveryPushHandler$processLogisticsPush$1;
                Object obj2 = deliveryPushHandler$processLogisticsPush$13.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryPushHandler$processLogisticsPush$13.label;
                h3y h3yVar2 = this.f;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Map map4 = (Map) deliveryPushHandler$processLogisticsPush$13.L$0;
                        try {
                            kotlin.b.b(obj2);
                            z = true;
                            z2 = z;
                        } catch (Throwable th) {
                            th = th;
                            map3 = map4;
                        }
                        return Boolean.valueOf(z2);
                    }
                    List list2 = (List) deliveryPushHandler$processLogisticsPush$13.L$9;
                    Bundle bundle2 = (Bundle) deliveryPushHandler$processLogisticsPush$13.L$8;
                    gli gliVar2 = (gli) deliveryPushHandler$processLogisticsPush$13.L$7;
                    String str9 = (String) deliveryPushHandler$processLogisticsPush$13.L$5;
                    String str10 = (String) deliveryPushHandler$processLogisticsPush$13.L$2;
                    String str11 = (String) deliveryPushHandler$processLogisticsPush$13.L$1;
                    Map map5 = (Map) deliveryPushHandler$processLogisticsPush$13.L$0;
                    try {
                        kotlin.b.b(obj2);
                        str8 = str9;
                        map2 = map5;
                        h3yVar = h3yVar2;
                        bundle = bundle2;
                        gliVar = gliVar2;
                        str7 = str10;
                        list = list2;
                        str6 = str11;
                        try {
                            deliveryPushHandler$processLogisticsPush$13.L$0 = map2;
                            deliveryPushHandler$processLogisticsPush$13.L$1 = null;
                            deliveryPushHandler$processLogisticsPush$13.L$2 = null;
                            deliveryPushHandler$processLogisticsPush$13.L$3 = null;
                            deliveryPushHandler$processLogisticsPush$13.L$4 = null;
                            deliveryPushHandler$processLogisticsPush$13.L$5 = null;
                            deliveryPushHandler$processLogisticsPush$13.L$6 = null;
                            deliveryPushHandler$processLogisticsPush$13.L$7 = null;
                            deliveryPushHandler$processLogisticsPush$13.L$8 = null;
                            deliveryPushHandler$processLogisticsPush$13.L$9 = null;
                            deliveryPushHandler$processLogisticsPush$13.L$10 = null;
                            deliveryPushHandler$processLogisticsPush$13.label = 2;
                            z = true;
                        } catch (Throwable th2) {
                            th = th2;
                            map3 = map2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        map3 = map5;
                    }
                    h3yVar = h3yVar2;
                    hst hstVar = jst.e;
                    hstVar.h("a", "Exception while processing push notification", th);
                    String str12 = (String) map3.get("id");
                    if (str12 != null) {
                        ((p1g0) h3yVar.get()).a(str12, th);
                        xby.l(hstVar, "PUSH_ACK:ERROR:LOGISTIC_PUSH_EXCEPTION", null, th, "Failed to handle push with payload ".concat(kotlin.collections.a.X(iw00.x(map3), null, null, null, null, 63)), 2);
                    }
                    z2 = false;
                    return Boolean.valueOf(z2);
                }
                kotlin.b.b(obj2);
                jst.e.getClass();
                fjz fjzVar = (fjz) this.a.get();
                qnr0 qnr0Var = fjzVar.a;
                try {
                    h3yVar = h3yVar2;
                    try {
                        obj = obj3;
                        try {
                            Map map6 = (Map) ((xnt) fjzVar.b).c(str4, new k8u(auu0.a, cm2.a, 1));
                            MapBuilder mapBuilder2 = new MapBuilder();
                            Object obj4 = map6.get("delivery_id");
                            deliveryPushHandler$processLogisticsPush$12 = deliveryPushHandler$processLogisticsPush$13;
                            try {
                                String str13 = obj4 instanceof String ? (String) obj4 : null;
                                String str14 = "";
                                if (str13 == null) {
                                    str13 = "";
                                }
                                mapBuilder2.put("order_key", str13);
                                Object obj5 = map6.get("order_status");
                                String str15 = obj5 instanceof String ? (String) obj5 : null;
                                if (str15 != null) {
                                    str14 = str15;
                                }
                                mapBuilder2.put("order_status", str14);
                                mapBuilder2.put(Constants.REFERRER_API_META, map6);
                                mapBuilder2.put("button_list", EmptyList.a);
                                Object obj6 = map6.get("order_provider_id");
                                if (obj6 != null) {
                                    mapBuilder2.put("order_provider_id", obj6);
                                }
                                Object obj7 = map6.get("roles");
                                if (obj7 != null) {
                                    mapBuilder2.put("roles", obj7);
                                }
                                Object obj8 = map6.get("tariff_class");
                                if (obj8 != null) {
                                    mapBuilder2.put("tariff_class", obj8);
                                }
                                mapBuilder = mapBuilder2.j();
                            } catch (Exception e) {
                                e = e;
                                jgz jgzVar = jgz.a;
                                jgz.c(e);
                                mapBuilder = null;
                                qnr0Var.getClass();
                                HashMap hashMap = new HashMap();
                                if (mapBuilder != null) {
                                }
                                qnr0Var.a.a("SharedOrderPush.Shown", hashMap, 1, new HashMap());
                                ((com.yandex.delivery.utils.push.impl.a) this.b.get()).a(str4);
                                str5 = (String) map3.get("local_channel_id");
                                if (str5 != null) {
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            deliveryPushHandler$processLogisticsPush$12 = deliveryPushHandler$processLogisticsPush$13;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        deliveryPushHandler$processLogisticsPush$12 = deliveryPushHandler$processLogisticsPush$13;
                        obj = obj3;
                    }
                } catch (Exception e4) {
                    e = e4;
                    deliveryPushHandler$processLogisticsPush$12 = deliveryPushHandler$processLogisticsPush$13;
                    obj = obj3;
                    h3yVar = h3yVar2;
                }
                qnr0Var.getClass();
                HashMap hashMap2 = new HashMap();
                if (mapBuilder != null) {
                    hashMap2.put("DeliveryMetrics", mapBuilder);
                }
                qnr0Var.a.a("SharedOrderPush.Shown", hashMap2, 1, new HashMap());
                ((com.yandex.delivery.utils.push.impl.a) this.b.get()).a(str4);
                try {
                    str5 = (String) map3.get("local_channel_id");
                } catch (Throwable th4) {
                    th = th4;
                }
                if (str5 != null) {
                    String str16 = (String) map3.get("id");
                    if (str16 != null) {
                        ((p1g0) h3yVar.get()).a(str16, null);
                        xby.l(jst.e, "PUSH_ACK:ERROR:NO_CHANNEL_ID", null, null, "Failed to handle push with payload ".concat(kotlin.collections.a.X(iw00.x(map3), null, null, null, null, 63)), 2);
                    }
                    return Boolean.TRUE;
                }
                c cVar = (c) ((xnt) this.e).c(str4, c.Companion.serializer());
                b bVar = (b) cVar.get("silent_push");
                if (bVar != null ? jl40.l(qcx.f(qcx.n(bVar)), Boolean.TRUE) : false) {
                    jst.e.getClass();
                    z = true;
                    z2 = z;
                    return Boolean.valueOf(z2);
                }
                b bVar2 = (b) cVar.get("notification_group");
                String g = bVar2 != null ? qcx.g(qcx.n(bVar2)) : null;
                b bVar3 = (b) cVar.get("delivery_id");
                String g2 = bVar3 != null ? qcx.g(qcx.n(bVar3)) : null;
                DeliveryPushParams d = g2 != null ? d(g2, cVar) : null;
                gli gliVar3 = new gli(g, g2, d);
                Bundle e5 = e(cVar);
                List c = c(cVar, d);
                ru.yandex.taxi.notifications.c cVar2 = (ru.yandex.taxi.notifications.c) this.d.get();
                deliveryPushHandler$processLogisticsPush$13 = deliveryPushHandler$processLogisticsPush$12;
                deliveryPushHandler$processLogisticsPush$13.L$0 = map3;
                deliveryPushHandler$processLogisticsPush$13.L$1 = str;
                deliveryPushHandler$processLogisticsPush$13.L$2 = str2;
                deliveryPushHandler$processLogisticsPush$13.L$3 = null;
                deliveryPushHandler$processLogisticsPush$13.L$4 = null;
                deliveryPushHandler$processLogisticsPush$13.L$5 = str5;
                deliveryPushHandler$processLogisticsPush$13.L$6 = null;
                deliveryPushHandler$processLogisticsPush$13.L$7 = gliVar3;
                deliveryPushHandler$processLogisticsPush$13.L$8 = e5;
                deliveryPushHandler$processLogisticsPush$13.L$9 = c;
                deliveryPushHandler$processLogisticsPush$13.label = 1;
                Object a = cVar2.a(e3n.c, str3, deliveryPushHandler$processLogisticsPush$13);
                obj3 = obj;
                if (a != obj3) {
                    map2 = map3;
                    str6 = str;
                    bundle = e5;
                    str7 = str2;
                    str8 = str5;
                    gliVar = gliVar3;
                    list = c;
                    obj2 = a;
                    deliveryPushHandler$processLogisticsPush$13.L$0 = map2;
                    deliveryPushHandler$processLogisticsPush$13.L$1 = null;
                    deliveryPushHandler$processLogisticsPush$13.L$2 = null;
                    deliveryPushHandler$processLogisticsPush$13.L$3 = null;
                    deliveryPushHandler$processLogisticsPush$13.L$4 = null;
                    deliveryPushHandler$processLogisticsPush$13.L$5 = null;
                    deliveryPushHandler$processLogisticsPush$13.L$6 = null;
                    deliveryPushHandler$processLogisticsPush$13.L$7 = null;
                    deliveryPushHandler$processLogisticsPush$13.L$8 = null;
                    deliveryPushHandler$processLogisticsPush$13.L$9 = null;
                    deliveryPushHandler$processLogisticsPush$13.L$10 = null;
                    deliveryPushHandler$processLogisticsPush$13.label = 2;
                    z = true;
                }
                return obj3;
            }
        }
        deliveryPushHandler$processLogisticsPush$1 = new DeliveryPushHandler$processLogisticsPush$1(this, continuationImpl);
        DeliveryPushHandler$processLogisticsPush$1 deliveryPushHandler$processLogisticsPush$132 = deliveryPushHandler$processLogisticsPush$1;
        Object obj22 = deliveryPushHandler$processLogisticsPush$132.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryPushHandler$processLogisticsPush$132.label;
        h3y h3yVar22 = this.f;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0143 A[LOOP:0: B:20:0x013d->B:22:0x0143, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, String str2, Bitmap bitmap, gli gliVar, Bundle bundle, String str3, Map map, List list, ContinuationImpl continuationImpl) {
        DeliveryPushHandler$showNotification$1 deliveryPushHandler$showNotification$1;
        Object obj;
        int i;
        String str4;
        List<ruh> list2;
        Bitmap bitmap2;
        gli gliVar2;
        NotificationShareData.a aVar;
        Bundle bundle2;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        if (continuationImpl instanceof DeliveryPushHandler$showNotification$1) {
            deliveryPushHandler$showNotification$1 = (DeliveryPushHandler$showNotification$1) continuationImpl;
            int i2 = deliveryPushHandler$showNotification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryPushHandler$showNotification$1.label = i2 - Integer.MIN_VALUE;
                obj = deliveryPushHandler$showNotification$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryPushHandler$showNotification$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    wnt wntVar = this.e;
                    NotificationShareData.a a = r85.a(wntVar, map);
                    if (map.get("type") == null && (str8 = (String) map.get("logistics")) != null) {
                        try {
                            c cVar = (c) ((xnt) wntVar).c(str8, c.Companion.serializer());
                            if (cVar.containsKey("type")) {
                                b bVar = (b) cVar.get("type");
                                a.e = bVar != null ? qcx.g(qcx.n(bVar)) : null;
                            }
                        } catch (Exception e) {
                            jst.e.h("a", "Failed to extract type from payload for analytics", e);
                        }
                    }
                    hst hstVar = jst.e;
                    String str10 = gliVar.b;
                    if (str10 == null) {
                        str4 = str3;
                        list2 = list;
                        bitmap2 = bitmap;
                        gliVar2 = gliVar;
                        aVar = a;
                        bundle2 = bundle;
                        str5 = str2;
                        str6 = str;
                        str7 = UUID.randomUUID().toString();
                        xk60 xk60Var = (xk60) this.c.get();
                        str9 = gliVar2.a;
                        v i3 = xk60Var.i(str5, str6, bitmap2, str4, xk60Var.k(null, bundle2, aVar), 0L);
                        if (str9 != null) {
                            i3.r = str9;
                        }
                        for (ruh ruhVar : list2) {
                            aVar.f = ruhVar.c;
                            i3.b.add(new zf0((IconCompat) null, ruhVar.a, xk60Var.k(null, ruhVar.b, aVar)).a());
                        }
                        NotificationShareData.a aVar2 = new NotificationShareData.a();
                        aVar2.b = aVar.b;
                        aVar2.c = aVar.c;
                        aVar2.e = aVar.e;
                        aVar2.a = 0;
                        aVar2.d = str7;
                        xk60Var.l(aVar2, i3);
                        return zy11.a;
                    }
                    deliveryPushHandler$showNotification$1.L$0 = str;
                    deliveryPushHandler$showNotification$1.L$1 = str2;
                    deliveryPushHandler$showNotification$1.L$2 = bitmap;
                    deliveryPushHandler$showNotification$1.L$3 = gliVar;
                    deliveryPushHandler$showNotification$1.L$4 = bundle;
                    str4 = str3;
                    deliveryPushHandler$showNotification$1.L$5 = str4;
                    deliveryPushHandler$showNotification$1.L$6 = null;
                    list2 = list;
                    deliveryPushHandler$showNotification$1.L$7 = list2;
                    deliveryPushHandler$showNotification$1.L$8 = a;
                    deliveryPushHandler$showNotification$1.L$9 = str10;
                    deliveryPushHandler$showNotification$1.L$10 = null;
                    deliveryPushHandler$showNotification$1.label = 1;
                    Object b = ((t1b0) this.g.a.getValue()).b(deliveryPushHandler$showNotification$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bitmap2 = bitmap;
                    gliVar2 = gliVar;
                    obj = b;
                    str6 = str;
                    str7 = str10;
                    aVar = a;
                    bundle2 = bundle;
                    str5 = str2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str7 = (String) deliveryPushHandler$showNotification$1.L$9;
                    aVar = (NotificationShareData.a) deliveryPushHandler$showNotification$1.L$8;
                    List list3 = (List) deliveryPushHandler$showNotification$1.L$7;
                    String str11 = (String) deliveryPushHandler$showNotification$1.L$5;
                    bundle2 = (Bundle) deliveryPushHandler$showNotification$1.L$4;
                    gliVar2 = (gli) deliveryPushHandler$showNotification$1.L$3;
                    bitmap2 = (Bitmap) deliveryPushHandler$showNotification$1.L$2;
                    str5 = (String) deliveryPushHandler$showNotification$1.L$1;
                    str6 = (String) deliveryPushHandler$showNotification$1.L$0;
                    kotlin.b.b(obj);
                    list2 = list3;
                    str4 = str11;
                }
                if (!((Boolean) obj).booleanValue()) {
                    str7 = null;
                }
                if (str7 == null) {
                    str = str6;
                    str6 = str;
                    str7 = UUID.randomUUID().toString();
                }
                xk60 xk60Var2 = (xk60) this.c.get();
                str9 = gliVar2.a;
                v i32 = xk60Var2.i(str5, str6, bitmap2, str4, xk60Var2.k(null, bundle2, aVar), 0L);
                if (str9 != null) {
                }
                while (r1.hasNext()) {
                }
                NotificationShareData.a aVar22 = new NotificationShareData.a();
                aVar22.b = aVar.b;
                aVar22.c = aVar.c;
                aVar22.e = aVar.e;
                aVar22.a = 0;
                aVar22.d = str7;
                xk60Var2.l(aVar22, i32);
                return zy11.a;
            }
        }
        deliveryPushHandler$showNotification$1 = new DeliveryPushHandler$showNotification$1(this, continuationImpl);
        obj = deliveryPushHandler$showNotification$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryPushHandler$showNotification$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        if (str7 == null) {
        }
        xk60 xk60Var22 = (xk60) this.c.get();
        str9 = gliVar2.a;
        v i322 = xk60Var22.i(str5, str6, bitmap2, str4, xk60Var22.k(null, bundle2, aVar), 0L);
        if (str9 != null) {
        }
        while (r1.hasNext()) {
        }
        NotificationShareData.a aVar222 = new NotificationShareData.a();
        aVar222.b = aVar.b;
        aVar222.c = aVar.c;
        aVar222.e = aVar.e;
        aVar222.a = 0;
        aVar222.d = str7;
        xk60Var22.l(aVar222, i322);
        return zy11.a;
    }
}
