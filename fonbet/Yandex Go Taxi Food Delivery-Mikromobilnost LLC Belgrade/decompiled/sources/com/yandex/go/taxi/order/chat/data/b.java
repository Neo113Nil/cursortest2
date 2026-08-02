package com.yandex.go.taxi.order.chat.data;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.view.inputmethod.InputMethodManager;
import com.yandex.go.taxi.order.chat.api.data.model.LanguageHint;
import com.yandex.go.taxi.order.chat.api.data.model.Message;
import com.yandex.go.taxi.order.chat.api.data.model.OrderChatParams;
import com.yandex.go.taxi.order.chat.api.data.model.OrderChatResponse;
import com.yandex.go.taxi.order.chat.api.data.model.PostMessage;
import com.yandex.go.taxi.order.chat.api.data.model.Sender;
import com.yandex.go.taxi.order.chat.api.data.model.Translation;
import com.yandex.go.taxi.order.chat.api.data.model.TranslationSettings;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import defpackage.a1o;
import defpackage.a3y0;
import defpackage.bvf0;
import defpackage.cne0;
import defpackage.dne0;
import defpackage.drq0;
import defpackage.dxt0;
import defpackage.gz01;
import defpackage.h6u0;
import defpackage.h73;
import defpackage.hst;
import defpackage.hz01;
import defpackage.hzx0;
import defpackage.isa0;
import defpackage.j5z;
import defpackage.jl40;
import defpackage.jse;
import defpackage.jst;
import defpackage.jtq0;
import defpackage.l8x;
import defpackage.ny61;
import defpackage.ptw;
import defpackage.pzt0;
import defpackage.qje;
import defpackage.qv10;
import defpackage.r1e0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wy10;
import defpackage.x3y0;
import defpackage.xpy;
import defpackage.yw01;
import defpackage.z2y0;
import defpackage.zrr;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.launch.c;

/* loaded from: classes14.dex */
public final class b {
    public final tse a;
    public final String b;
    public final jtq0 c;
    public final TaxiOrderChatApi d;
    public final com.yandex.go.taxi.order.chat.data.db.a e;
    public final c f;
    public final jse g;
    public final j5z h;
    public final a3y0 i = new a3y0(TaxiOrderLogGroup.ORDER_CHAT.getTag(), "TaxiOrderChatRepository");
    public final a1o j = new a1o("load");
    public final a1o k = new a1o("send");
    public final cne0 l;
    public final r0 m;
    public final r0 n;
    public final r0 o;
    public final r0 p;
    public volatile List q;
    public volatile hz01 r;
    public final x3y0 s;
    public volatile List t;
    public volatile boolean u;
    public final AtomicLong v;
    public pzt0 w;
    public final a x;
    public final LinkedHashMap y;

    public b(tse tseVar, String str, jtq0 jtq0Var, TaxiOrderChatApi taxiOrderChatApi, com.yandex.go.taxi.order.chat.data.db.a aVar, c cVar, com.yandex.go.taxi.order.chat.data.db.b bVar, jse jseVar, dne0 dne0Var, j5z j5zVar) {
        long j;
        long j2;
        long max;
        this.a = tseVar;
        this.b = str;
        this.c = jtq0Var;
        this.d = taxiOrderChatApi;
        this.e = aVar;
        this.f = cVar;
        this.g = jseVar;
        this.h = j5zVar;
        cne0 a = dne0Var.a("ru.yandex.taxi.chat.model.CACHE_" + str);
        this.l = a;
        this.m = bvf0.c(Integer.valueOf(aVar.a(str)));
        this.o = bvf0.c(null);
        r0 c = bvf0.c(Boolean.FALSE);
        this.p = c;
        this.q = kotlin.collections.a.J0(aVar.b(str));
        this.r = hz01.d;
        this.s = new x3y0(str, bVar);
        this.t = new ArrayList();
        this.u = true;
        this.x = new a(this);
        this.y = new LinkedHashMap();
        if (a.c("ru.yandex.taxi.chat.model.TRANSLATION_ENABLED")) {
            c.m(null, Boolean.valueOf(a.f("ru.yandex.taxi.chat.model.TRANSLATION_ENABLED")));
        }
        this.n = bvf0.c(d());
        long j3 = -1;
        if (this.q.isEmpty()) {
            j = -1;
        } else {
            Iterator it = this.q.iterator();
            if (!it.hasNext()) {
                ny61.p();
                throw null;
            }
            j = ((drq0) it.next()).a;
            while (it.hasNext()) {
                long j4 = ((drq0) it.next()).a;
                if (j < j4) {
                    j = j4;
                }
            }
        }
        x3y0 x3y0Var = this.s;
        synchronized (x3y0Var) {
            try {
                if (x3y0Var.d.isEmpty()) {
                    j2 = -1;
                } else {
                    Iterator it2 = x3y0Var.d.iterator();
                    if (!it2.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    j2 = ((isa0) it2.next()).a;
                    while (it2.hasNext()) {
                        long j5 = ((isa0) it2.next()).a;
                        if (j2 < j5) {
                            j2 = j5;
                        }
                    }
                }
                if (!x3y0Var.c.isEmpty()) {
                    Iterator it3 = x3y0Var.c.iterator();
                    if (!it3.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    long j6 = ((isa0) it3.next()).a;
                    while (it3.hasNext()) {
                        long j7 = ((isa0) it3.next()).a;
                        if (j6 < j7) {
                            j6 = j7;
                        }
                    }
                    j3 = j6;
                }
                max = Math.max(j2, j3);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.v = new AtomicLong(Math.max(j, max) + 1);
    }

    public static final OrderChatParams a(b bVar, String str, String str2, hzx0 hzx0Var) {
        isa0 isa0Var = hzx0Var.b;
        return new OrderChatParams(str, str2, hzx0Var.a, isa0Var != null ? new PostMessage(isa0Var.c, isa0Var.w, isa0Var.x, hzx0Var.c) : null);
    }

    public static final Object b(b bVar, r1e0 r1e0Var, hzx0 hzx0Var, Continuation continuation) {
        ArrayList arrayList;
        isa0 isa0Var;
        List list;
        long longValue;
        isa0 isa0Var2;
        hz01 hz01Var;
        long j;
        Object obj;
        isa0 isa0Var3;
        bVar.getClass();
        OrderChatResponse orderChatResponse = (OrderChatResponse) r1e0Var.a;
        Long l = r1e0Var.b;
        long longValue2 = l != null ? l.longValue() : 5000L;
        if (orderChatResponse.g) {
            bVar.l.w("ru.yandex.taxi.chat.model.NEWEST_MESSAGE_ID");
            bVar.x.b(longValue2);
            return zy11.a;
        }
        x3y0 x3y0Var = bVar.s;
        TaxiOrderChatRepository$handleResponse$result$1 taxiOrderChatRepository$handleResponse$result$1 = new TaxiOrderChatRepository$handleResponse$result$1(0, bVar.v, AtomicLong.class, "getAndIncrement", "getAndIncrement()J", 0);
        String str = orderChatResponse.a;
        List<Message> list2 = orderChatResponse.b;
        boolean z = hzx0Var.a != null;
        isa0 isa0Var4 = hzx0Var.b;
        List list3 = orderChatResponse.c;
        TranslationSettings translationSettings = orderChatResponse.d;
        List list4 = orderChatResponse.e;
        boolean z2 = orderChatResponse.f;
        a3y0 a3y0Var = new a3y0(TaxiOrderLogGroup.ORDER_CHAT.getTag(), "TaxiOrderResponseHandler");
        a3y0.h((String[]) Arrays.copyOf(new String[0], 0));
        hst hstVar = jst.e;
        a3y0.h((String[]) Arrays.copyOf(new String[0], 0));
        a3y0.h((String[]) Arrays.copyOf(new String[0], 0));
        if (list2.isEmpty()) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            boolean z3 = false;
            for (Message message : list2) {
                boolean z4 = z2;
                TaxiOrderChatRepository$handleResponse$result$1 taxiOrderChatRepository$handleResponse$result$12 = taxiOrderChatRepository$handleResponse$result$1;
                if (message.b.b != Sender.Role.CLIENT) {
                    isa0Var = isa0Var4;
                    list = list2;
                    longValue = ((Number) taxiOrderChatRepository$handleResponse$result$12.invoke()).longValue();
                } else if (isa0Var4 != null) {
                    synchronized (x3y0Var) {
                        if (x3y0Var.c.remove(isa0Var4)) {
                            list = list2;
                            x3y0Var.b.c(isa0Var4);
                        } else {
                            x3y0Var.d.remove(isa0Var4);
                            if (x3y0Var.e.remove(isa0Var4)) {
                                r0 r0Var = x3y0Var.f;
                                Integer valueOf = Integer.valueOf(x3y0Var.e.size());
                                r0Var.getClass();
                                list = list2;
                                r0Var.m(null, valueOf);
                            } else {
                                list = list2;
                            }
                        }
                    }
                    longValue = isa0Var4.a;
                    z3 = true;
                    isa0Var = null;
                } else {
                    list = list2;
                    if (z3) {
                        if (z) {
                            isa0Var = isa0Var4;
                            a3y0Var.b("getClientMessageId", new IllegalStateException(), new z2y0(23));
                        } else {
                            isa0Var = isa0Var4;
                        }
                        longValue = ((Number) taxiOrderChatRepository$handleResponse$result$12.invoke()).longValue();
                    } else {
                        synchronized (x3y0Var) {
                            if (!x3y0Var.c.isEmpty()) {
                                isa0Var2 = (isa0) x3y0Var.c.removeFirst();
                                x3y0Var.b.c(isa0Var2);
                            } else if (x3y0Var.d.isEmpty()) {
                                isa0Var2 = null;
                            } else {
                                isa0Var2 = (isa0) x3y0Var.d.removeFirst();
                                x3y0Var.b.c(isa0Var2);
                                if (x3y0Var.e.remove(isa0Var2)) {
                                    r0 r0Var2 = x3y0Var.f;
                                    Integer valueOf2 = Integer.valueOf(x3y0Var.e.size());
                                    r0Var2.getClass();
                                    r0Var2.m(null, valueOf2);
                                }
                            }
                        }
                        z3 = true;
                        isa0Var = isa0Var2;
                        longValue = isa0Var2 != null ? isa0Var2.a : ((Number) taxiOrderChatRepository$handleResponse$result$12.invoke()).longValue();
                    }
                }
                arrayList2.add(new drq0(longValue, message));
                taxiOrderChatRepository$handleResponse$result$1 = taxiOrderChatRepository$handleResponse$result$12;
                list2 = list;
                z2 = z4;
                isa0Var4 = isa0Var;
            }
            arrayList = arrayList2;
        }
        boolean z5 = z2;
        List list5 = list2;
        if (translationSettings == null) {
            hz01Var = hz01.d;
        } else {
            gz01 gz01Var = new gz01();
            gz01Var.a = translationSettings.a;
            gz01Var.b = list4;
            gz01Var.c = translationSettings.b;
            hz01Var = new hz01(gz01Var.a, kotlin.collections.a.J0(gz01Var.b), kotlin.collections.a.J0(gz01Var.c));
        }
        Message message2 = (Message) kotlin.collections.a.b0(list5);
        zrr zrrVar = message2 != null ? new zrr(arrayList, message2.a, list3, z5, hz01Var, !jl40.l(message2.a, str)) : new zrr(arrayList, str, list3, z5, hz01Var, false);
        bVar.l.r("ru.yandex.taxi.chat.model.NEWEST_MESSAGE_ID", (String) zrrVar.b);
        bVar.l.u("ru.yandex.taxi.chat.model.FIRST_ANSWER_GOT", true);
        bVar.l.u("ru.yandex.taxi.chat.model.TRANSLATION_ENABLED", zrrVar.c);
        List list6 = (List) zrrVar.a;
        if (list6 != null) {
            com.yandex.go.taxi.order.chat.data.db.a aVar = bVar.e;
            String str2 = bVar.b;
            aVar.getClass();
            Iterator it = list6.iterator();
            while (it.hasNext()) {
                drq0 drq0Var = (drq0) it.next();
                dxt0 dxt0Var = aVar.b;
                Context context = aVar.c;
                Uri uri = aVar.d;
                ContentValues contentValues = new ContentValues();
                Iterator it2 = it;
                long j2 = longValue2;
                long j3 = drq0Var.a;
                Message message3 = drq0Var.b;
                contentValues.put("unique_id", Long.valueOf(j3));
                contentValues.put("order_id", str2);
                contentValues.put("message_id", message3.a);
                contentValues.put("text", message3.d);
                contentValues.put("created_date", Long.valueOf(message3.g.getTimeInMillis()));
                Message.Action action = message3.h;
                contentValues.put("action", action != null ? action.toString() : null);
                Sender sender = message3.b;
                String str3 = sender.a;
                String obj2 = sender.b.toString();
                contentValues.put("sender_nick", str3);
                contentValues.put("sender_role", obj2);
                zzs zzsVar = message3.c;
                if (zzsVar != null) {
                    contentValues.put("location_lat", Long.valueOf(Double.doubleToLongBits(zzsVar.a)));
                    contentValues.put("location_lon", Long.valueOf(Double.doubleToLongBits(zzsVar.b)));
                } else {
                    contentValues.putNull("location_lat");
                    contentValues.putNull("location_lon");
                }
                contentValues.put("language", message3.e);
                Translation translation = message3.f;
                if (translation != null) {
                    contentValues.put("translation_language", translation.a);
                    contentValues.put("translation_text", translation.b);
                } else {
                    contentValues.putNull("translation_language");
                    contentValues.putNull("translation_text");
                }
                String[] strArr = {str2, message3.a};
                dxt0Var.getClass();
                h6u0.m(context, uri, contentValues, "order_id = ? AND message_id = ?", strArr);
                it = it2;
                longValue2 = j2;
            }
            j = longValue2;
            bVar.q = kotlin.collections.a.J0(bVar.e.b(bVar.b));
            r0 r0Var3 = bVar.m;
            Integer num = new Integer(bVar.e.a(bVar.b));
            r0Var3.getClass();
            obj = null;
            r0Var3.m(null, num);
        } else {
            j = longValue2;
            obj = null;
        }
        qv10.B(zrrVar.c, bVar.p, obj);
        bVar.r = (hz01) zrrVar.y;
        if (!zrrVar.w) {
            bVar.n.l(bVar.d());
            bVar.o.l((List) zrrVar.x);
        }
        x3y0 x3y0Var2 = bVar.s;
        synchronized (x3y0Var2) {
            isa0Var3 = (isa0) x3y0Var2.c.f();
        }
        if (isa0Var3 == null && !zrrVar.w) {
            bVar.x.b(j);
            return zy11.a;
        }
        bVar.i.getClass();
        a3y0.h((String[]) Arrays.copyOf(new String[0], 0));
        hst hstVar2 = jst.e;
        return bVar.f(bVar.h((String) zrrVar.b, isa0Var3), (SuspendLambda) continuation);
    }

    public final k c(r0 r0Var) {
        return new k(new n(r0Var, new TaxiOrderChatRepository$connectWithAutoPolling$1(this, null)), new TaxiOrderChatRepository$connectWithAutoPolling$2(this, null));
    }

    public final wy10 d() {
        wy10 wy10Var;
        if (!this.l.f("ru.yandex.taxi.chat.model.FIRST_ANSWER_GOT")) {
            return wy10.e;
        }
        boolean l = jl40.l(this.p.getValue(), Boolean.TRUE);
        x3y0 x3y0Var = this.s;
        List list = this.q;
        synchronized (x3y0Var) {
            wy10Var = new wy10(list, kotlin.collections.a.J0(x3y0Var.c), kotlin.collections.a.J0(x3y0Var.d), l);
        }
        return wy10Var;
    }

    public final TranslationSettings e() {
        hz01 hz01Var = this.r;
        if (jl40.l(hz01Var.a, "") && hz01Var.b.isEmpty() && hz01Var.c.isEmpty()) {
            return null;
        }
        return new TranslationSettings(this.r.a, this.r.c);
    }

    public final Object f(hzx0 hzx0Var, SuspendLambda suspendLambda) {
        Object k0 = tje.k0(this.g, new TaxiOrderChatRepository$makeRequest$2(this, hzx0Var, null), suspendLambda);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public final void g(isa0 isa0Var) {
        pzt0 pzt0Var = this.w;
        if (pzt0Var == null || !pzt0Var.isActive()) {
            this.i.getClass();
            a3y0.h((String[]) Arrays.copyOf(new String[0], 0));
            hst hstVar = jst.e;
            this.w = tje.N(this.a, null, null, new TaxiOrderChatRepository$postIfIdle$2(this, isa0Var, null), 3);
        }
    }

    public final hzx0 h(String str, isa0 isa0Var) {
        j5z j5zVar = this.h;
        String b = j5zVar.b();
        Set f = j5z.f(qje.w());
        InputMethodManager inputMethodManager = (InputMethodManager) j5zVar.f.getSystemService("input_method");
        LanguageHint languageHint = new LanguageHint(b, f, j5z.f(kotlin.sequences.b.u(new yw01(kotlin.sequences.b.g(kotlin.sequences.a.c(new yw01(new h73(1, inputMethodManager.getEnabledInputMethodList()), new ptw(20, inputMethodManager))), new xpy(21)), new xpy(22)))));
        e();
        return new hzx0(str, isa0Var, languageHint);
    }

    public final synchronized void i(String str) {
        try {
            l8x l8xVar = (l8x) this.y.get(str);
            if (l8xVar != null) {
                l8xVar.a(null);
            }
            this.y.replace(str, tje.N(this.a, this.g, null, new TaxiOrderChatRepository$pull$pullJob$1(this, str, null), 2));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final hzx0 j() {
        String l = this.l.l("ru.yandex.taxi.chat.model.NEWEST_MESSAGE_ID", null);
        e();
        return new hzx0(l, null, null);
    }
}
