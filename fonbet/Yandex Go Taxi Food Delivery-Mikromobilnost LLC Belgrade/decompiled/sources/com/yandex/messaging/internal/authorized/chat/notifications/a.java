package com.yandex.messaging.internal.authorized.chat.notifications;

import android.app.Notification;
import android.content.Context;
import android.database.Cursor;
import androidx.core.app.s0;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.core.net.entities.proto.NotificationMeta;
import com.yandex.messaging.core.net.entities.proto.message.ServerNotification;
import com.yandex.messaging.domain.statuses.StatusAvailability;
import com.yandex.messaging.internal.authorized.chat.notifications.autocancel.CancelNotificationBroadcastReceiver;
import com.yandex.messaging.internal.authorized.chat.notifications.builder.f;
import com.yandex.messaging.internal.authorized.chat.notifications.builder.g;
import com.yandex.messaging.internal.authorized.chat.notifications.builder.h;
import com.yandex.messaging.internal.authorized.chat.notifications.builder.i;
import com.yandex.messaging.internal.entities.ChatId;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.entities.TechMeetingStartedMessage;
import com.yandex.messaging.telemost.domain.entities.TechPersonalMeetingEndedMessage;
import com.yandex.passport.sloth.ui.dependencies.m;
import defpackage.at2;
import defpackage.bj60;
import defpackage.br10;
import defpackage.bu0;
import defpackage.bvf0;
import defpackage.cjt;
import defpackage.clf;
import defpackage.cs0;
import defpackage.cvw;
import defpackage.dvw;
import defpackage.e3n;
import defpackage.eo61;
import defpackage.fn3;
import defpackage.g6b;
import defpackage.gv1;
import defpackage.h3y;
import defpackage.h6b;
import defpackage.ho9;
import defpackage.i5m;
import defpackage.i6b;
import defpackage.ii60;
import defpackage.ike;
import defpackage.it21;
import defpackage.iv21;
import defpackage.j18;
import defpackage.j3b;
import defpackage.ji60;
import defpackage.jk60;
import defpackage.jl40;
import defpackage.k020;
import defpackage.ki60;
import defpackage.ki9;
import defpackage.kp50;
import defpackage.kse;
import defpackage.l020;
import defpackage.l420;
import defpackage.li60;
import defpackage.lk60;
import defpackage.m5g0;
import defpackage.meb;
import defpackage.mi60;
import defpackage.mk60;
import defpackage.n6b;
import defpackage.ny61;
import defpackage.o1b0;
import defpackage.o430;
import defpackage.og60;
import defpackage.ogu;
import defpackage.ooc;
import defpackage.p150;
import defpackage.pg60;
import defpackage.piv0;
import defpackage.pnt0;
import defpackage.pzt0;
import defpackage.qhw0;
import defpackage.rz10;
import defpackage.st21;
import defpackage.t2k0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.ttq0;
import defpackage.u1l;
import defpackage.u9u0;
import defpackage.uem;
import defpackage.uj60;
import defpackage.ume;
import defpackage.vx0;
import defpackage.w220;
import defpackage.w3c;
import defpackage.we6;
import defpackage.wff0;
import defpackage.wi60;
import defpackage.wj3;
import defpackage.x22;
import defpackage.x4b0;
import defpackage.xvf0;
import defpackage.yab;
import defpackage.yh60;
import defpackage.z120;
import defpackage.zkt0;
import defpackage.zy11;
import defpackage.zz10;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;

/* loaded from: classes15.dex */
public final class a {
    public static final long E;
    public static final long F;
    public static final /* synthetic */ int G = 0;
    public boolean A;
    public final qhw0 B;
    public final ike C;
    public pzt0 D;
    public final Context a;
    public final w3c b;
    public final o1b0 c;
    public final k020 d;
    public final w220 e;
    public final x22 f;
    public final piv0 g;
    public final g6b h;
    public final ogu i;
    public final n6b j;
    public final cjt k;
    public final wff0 l;
    public final zkt0 m;
    public final mi60 n;
    public final MessengerEnvironment o;
    public final com.yandex.messaging.utils.b p;
    public final mk60 q;
    public final i6b r;
    public final h6b s;
    public final rz10 t;
    public final b u;
    public final ttq0 v;
    public final pg60 w;
    public final ume x;
    public final wi60 y;
    public wj3 z;

    static {
        o430 o430Var = e3n.b;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        E = kp50.U(5, durationUnit);
        F = kp50.U(3, durationUnit);
    }

    public a(Context context, w3c w3cVar, o1b0 o1b0Var, k020 k020Var, w220 w220Var, x22 x22Var, piv0 piv0Var, g6b g6bVar, ogu oguVar, n6b n6bVar, cjt cjtVar, wff0 wff0Var, zkt0 zkt0Var, mi60 mi60Var, MessengerEnvironment messengerEnvironment, com.yandex.messaging.utils.b bVar, mk60 mk60Var, i6b i6bVar, h6b h6bVar, rz10 rz10Var, b bVar2, ttq0 ttq0Var, pg60 pg60Var, l420 l420Var, ume umeVar, wi60 wi60Var, kse kseVar) {
        this.a = context;
        this.b = w3cVar;
        this.c = o1b0Var;
        this.d = k020Var;
        this.e = w220Var;
        this.f = x22Var;
        this.g = piv0Var;
        this.h = g6bVar;
        this.i = oguVar;
        this.j = n6bVar;
        this.k = cjtVar;
        this.l = wff0Var;
        this.m = zkt0Var;
        this.n = mi60Var;
        this.o = messengerEnvironment;
        this.p = bVar;
        this.q = mk60Var;
        this.r = i6bVar;
        this.s = h6bVar;
        this.t = rz10Var;
        this.u = bVar2;
        this.v = ttq0Var;
        this.w = pg60Var;
        this.x = umeVar;
        this.y = wi60Var;
        qhw0 a = jl40.a();
        this.B = a;
        this.C = bvf0.a(kseVar.f.plus(a));
        wff0Var.a(new fn3(2, this));
    }

    public static void a(a aVar) {
        bj60.c(aVar.g(null, false), "notification_publisher_profile_removed");
        aVar.l.c(new fn3(2, aVar));
        kotlinx.coroutines.a.h(aVar.B);
        aVar.A = true;
        wj3 wj3Var = aVar.z;
        if (wj3Var != null) {
            wj3Var.close();
        }
    }

    public static Object f(a aVar, String str, List list, jk60 jk60Var, bj60 bj60Var, com.yandex.messaging.internal.authorized.chat.notifications.builder.e eVar, boolean z, ContinuationImpl continuationImpl, int i) {
        if ((i & 16) != 0) {
            eVar = null;
        }
        com.yandex.messaging.internal.authorized.chat.notifications.builder.e eVar2 = eVar;
        if ((i & 32) != 0) {
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (!((ii60) it.next()).m) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
        }
        return aVar.e(str, list, jk60Var, bj60Var, eVar2, z, continuationImpl);
    }

    public final void b(jk60 jk60Var) {
        this.q.b.offer(jk60Var);
        pzt0 pzt0Var = this.D;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.D = null;
        tje.N(this.C, null, null, new ChatNotificationPublisher$forceUpdateNotification$1(this, null), 3);
    }

    public final String c() {
        o1b0 o1b0Var = this.c;
        boolean z = o1b0Var.d;
        h6b h6bVar = this.s;
        if (!z && !ChatId.Companion.f(o1b0Var.b)) {
            return h6bVar.c.b(h6bVar.a.a);
        }
        return h6bVar.a();
    }

    public final int d() {
        return (int) this.r.a.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x039b A[LOOP:0: B:12:0x0395->B:14:0x039b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, List list, jk60 jk60Var, bj60 bj60Var, og60 og60Var, boolean z, ContinuationImpl continuationImpl) {
        ChatNotificationPublisher$publishNotification$1 chatNotificationPublisher$publishNotification$1;
        int i;
        s0 s0Var;
        CoroutineSingletons coroutineSingletons;
        yh60 yh60Var;
        boolean z2;
        ChatNotificationPublisher$publishNotification$1 chatNotificationPublisher$publishNotification$12;
        og60 og60Var2;
        List list2;
        Object obj;
        s0 s0Var2;
        bj60 bj60Var2;
        Iterator it;
        a aVar = this;
        String str2 = str;
        if (continuationImpl instanceof ChatNotificationPublisher$publishNotification$1) {
            chatNotificationPublisher$publishNotification$1 = (ChatNotificationPublisher$publishNotification$1) continuationImpl;
            int i2 = chatNotificationPublisher$publishNotification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chatNotificationPublisher$publishNotification$1.label = i2 - Integer.MIN_VALUE;
                ChatNotificationPublisher$publishNotification$1 chatNotificationPublisher$publishNotification$13 = chatNotificationPublisher$publishNotification$1;
                Object obj2 = chatNotificationPublisher$publishNotification$13.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chatNotificationPublisher$publishNotification$13.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    s0 s0Var3 = new s0(aVar.a);
                    if (!aVar.y.c()) {
                        bj60Var.e("notifications_disabled_for_package");
                        return Boolean.FALSE;
                    }
                    chatNotificationPublisher$publishNotification$13.L$0 = aVar;
                    chatNotificationPublisher$publishNotification$13.L$1 = str2;
                    chatNotificationPublisher$publishNotification$13.L$2 = list;
                    chatNotificationPublisher$publishNotification$13.L$3 = bj60Var;
                    chatNotificationPublisher$publishNotification$13.L$4 = s0Var3;
                    chatNotificationPublisher$publishNotification$13.label = 1;
                    NotificationMeta notificationMeta = ((ii60) kotlin.collections.a.Z(list)).i;
                    boolean z3 = jk60Var.a;
                    yh60 yh60Var2 = new yh60(list, z3, jk60Var.b, notificationMeta != null ? notificationMeta.overrideUrl : null);
                    boolean z4 = notificationMeta != null && notificationMeta.appearance == 1;
                    if (og60Var == null) {
                        pg60 pg60Var = aVar.w;
                        if (z4) {
                            vx0 vx0Var = pg60Var.h.a;
                            s0Var = s0Var3;
                            coroutineSingletons = coroutineSingletons2;
                            og60Var2 = new i((Context) vx0Var.a.get(), (p150) vx0Var.b.get(), (c) vx0Var.c.get(), list);
                        } else {
                            boolean isModerated = aVar.o.getIsModerated();
                            o1b0 o1b0Var = aVar.c;
                            if (isModerated && aVar.m.a(o1b0Var.b)) {
                                s0Var = s0Var3;
                                coroutineSingletons = coroutineSingletons2;
                                og60Var2 = new we6((Context) pg60Var.i.a.a.get(), list.size(), 12);
                            } else {
                                boolean z5 = o1b0Var.d;
                                if (o1b0Var.d && ChatId.Companion.f(o1b0Var.b)) {
                                    m mVar = pg60Var.c.a;
                                    s0Var = s0Var3;
                                    yh60Var = yh60Var2;
                                    z2 = z3;
                                    coroutineSingletons = coroutineSingletons2;
                                    og60Var2 = new g((Context) ((xvf0) mVar.a).get(), (z120) ((xvf0) mVar.b).get(), (p150) ((xvf0) mVar.c).get(), (c) ((xvf0) mVar.d).get(), (zz10) ((xvf0) mVar.e).get(), (d) ((xvf0) mVar.f).get(), (ume) ((xvf0) mVar.g).get(), (l420) ((xvf0) mVar.h).get(), (o1b0) ((xvf0) mVar.i).get(), i5m.a((xvf0) mVar.j), list);
                                } else {
                                    s0Var = s0Var3;
                                    coroutineSingletons = coroutineSingletons2;
                                    yh60Var = yh60Var2;
                                    z2 = z3;
                                    if (z5) {
                                        bu0 bu0Var = pg60Var.a.a;
                                        og60Var2 = new f((ume) ((xvf0) bu0Var.g).get(), (zz10) ((br10) bu0Var.h).get(), (z120) ((xvf0) bu0Var.b).get(), (l420) ((xvf0) bu0Var.e).get(), (p150) ((xvf0) bu0Var.c).get(), (o1b0) ((xvf0) bu0Var.i).get(), (Context) ((xvf0) bu0Var.a).get(), (c) ((xvf0) bu0Var.d).get(), (d) ((xvf0) bu0Var.f).get(), list);
                                    } else if (ChatId.Companion.f(o1b0Var.b)) {
                                        eo61 eo61Var = pg60Var.b.a;
                                        chatNotificationPublisher$publishNotification$12 = chatNotificationPublisher$publishNotification$13;
                                        og60Var2 = new h((Context) ((xvf0) eo61Var.a).get(), (z120) ((xvf0) eo61Var.b).get(), (p150) ((xvf0) eo61Var.c).get(), (c) ((xvf0) eo61Var.d).get(), (zz10) ((xvf0) eo61Var.e).get(), (d) ((xvf0) eo61Var.f).get(), (ume) ((xvf0) eo61Var.g).get(), (l420) ((xvf0) eo61Var.h).get(), (o1b0) ((xvf0) eo61Var.i).get(), i5m.a((xvf0) eo61Var.j), i5m.a((xvf0) eo61Var.k), list);
                                    } else {
                                        chatNotificationPublisher$publishNotification$12 = chatNotificationPublisher$publishNotification$13;
                                        if (o1b0Var.n || z5) {
                                            ki9 ki9Var = pg60Var.f.a;
                                            og60Var2 = new com.yandex.messaging.internal.authorized.chat.notifications.builder.a((Context) ki9Var.a.get(), (z120) ki9Var.b.get(), (p150) ki9Var.c.get(), (c) ki9Var.d.get(), (zz10) ki9Var.e.get(), list);
                                        } else {
                                            gv1 gv1Var = pg60Var.d.a;
                                            Context context = (Context) gv1Var.a.get();
                                            og60Var2 = new com.yandex.messaging.internal.authorized.chat.notifications.builder.d((ume) gv1Var.f.get(), (zz10) gv1Var.h.get(), (z120) gv1Var.b.get(), (l420) gv1Var.e.get(), (p150) gv1Var.c.get(), (o1b0) gv1Var.i.get(), context, (c) gv1Var.d.get(), (d) gv1Var.g.get(), list);
                                        }
                                    }
                                }
                                chatNotificationPublisher$publishNotification$12 = chatNotificationPublisher$publishNotification$13;
                            }
                        }
                        yh60Var = yh60Var2;
                        z2 = z3;
                        chatNotificationPublisher$publishNotification$12 = chatNotificationPublisher$publishNotification$13;
                    } else {
                        s0Var = s0Var3;
                        coroutineSingletons = coroutineSingletons2;
                        yh60Var = yh60Var2;
                        z2 = z3;
                        chatNotificationPublisher$publishNotification$12 = chatNotificationPublisher$publishNotification$13;
                        og60Var2 = og60Var;
                    }
                    com.yandex.messaging.internal.authorized.chat.notifications.builder.b bVar = new com.yandex.messaging.internal.authorized.chat.notifications.builder.b(aVar.h, str2, aVar.d());
                    bVar.e = og60Var2;
                    bVar.c = z2;
                    bVar.d = z;
                    aVar.b.getClass();
                    bVar.f = new Long(System.currentTimeMillis());
                    bVar.h = yh60Var;
                    if (z2) {
                        bVar.g = new Long(e3n.e(E));
                    }
                    Object a = bVar.a(chatNotificationPublisher$publishNotification$12);
                    CoroutineSingletons coroutineSingletons3 = coroutineSingletons;
                    if (a == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                    list2 = list;
                    obj = a;
                    s0Var2 = s0Var;
                    bj60Var2 = bj60Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    s0 s0Var4 = (s0) chatNotificationPublisher$publishNotification$13.L$4;
                    bj60 bj60Var3 = (bj60) chatNotificationPublisher$publishNotification$13.L$3;
                    list2 = (List) chatNotificationPublisher$publishNotification$13.L$2;
                    String str3 = (String) chatNotificationPublisher$publishNotification$13.L$1;
                    a aVar2 = (a) chatNotificationPublisher$publishNotification$13.L$0;
                    kotlin.b.b(obj2);
                    s0Var2 = s0Var4;
                    aVar = aVar2;
                    obj = obj2;
                    bj60Var2 = bj60Var3;
                    str2 = str3;
                }
                s0Var2.d(str2, aVar.d(), (Notification) obj);
                List list3 = list2;
                ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Long(((ii60) it.next()).b));
                }
                bj60Var2.d("notification_show", kotlin.collections.a.K0(arrayList));
                aVar.x.a();
                return Boolean.TRUE;
            }
        }
        chatNotificationPublisher$publishNotification$1 = new ChatNotificationPublisher$publishNotification$1(aVar, continuationImpl);
        ChatNotificationPublisher$publishNotification$1 chatNotificationPublisher$publishNotification$132 = chatNotificationPublisher$publishNotification$1;
        Object obj22 = chatNotificationPublisher$publishNotification$132.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chatNotificationPublisher$publishNotification$132.label;
        if (i != 0) {
        }
        s0Var2.d(str2, aVar.d(), (Notification) obj);
        List list32 = list2;
        ArrayList arrayList2 = new ArrayList(tcc.n(list32, 10));
        it = list32.iterator();
        while (it.hasNext()) {
        }
        bj60Var2.d("notification_show", kotlin.collections.a.K0(arrayList2));
        aVar.x.a();
        return Boolean.TRUE;
    }

    public final bj60 g(m5g0 m5g0Var, boolean z) {
        return new bj60(m5g0Var, this.f, this.c, this.b, new ChatNotificationPublisher$publishReporter$1(this, a.class, "notificationId", "getNotificationId()I", 0), new ChatNotificationPublisher$publishReporter$2(this, a.class, "notificationChannelId", "getNotificationChannelId()Ljava/lang/String;", 0), z, new ChatNotificationPublisher$publishReporter$3(0, this, a.class, "loadChatInfo", "loadChatInfo()Lcom/yandex/messaging/internal/ChatInfo;", 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ji60 ji60Var, jk60 jk60Var, bj60 bj60Var, ContinuationImpl continuationImpl) {
        ChatNotificationPublisher$tryPublishNotification$1 chatNotificationPublisher$tryPublishNotification$1;
        int i;
        boolean z;
        a aVar;
        jk60 jk60Var2;
        bj60 bj60Var2;
        if (continuationImpl instanceof ChatNotificationPublisher$tryPublishNotification$1) {
            chatNotificationPublisher$tryPublishNotification$1 = (ChatNotificationPublisher$tryPublishNotification$1) continuationImpl;
            int i2 = chatNotificationPublisher$tryPublishNotification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chatNotificationPublisher$tryPublishNotification$1.label = i2 - Integer.MIN_VALUE;
                ChatNotificationPublisher$tryPublishNotification$1 chatNotificationPublisher$tryPublishNotification$12 = chatNotificationPublisher$tryPublishNotification$1;
                Object obj = chatNotificationPublisher$tryPublishNotification$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chatNotificationPublisher$tryPublishNotification$12.label;
                boolean z2 = false;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ArrayList arrayList = ji60Var.a;
                    ArrayList arrayList2 = ji60Var.b;
                    int i3 = 24;
                    if (arrayList.isEmpty()) {
                        bj60Var.e("no_messages");
                        m5g0 m5g0Var = jk60Var.b;
                        String c = c();
                        int d = d();
                        w220 w220Var = this.e;
                        w220Var.g.a(d, new uj60(w220Var.c, i3, c, z2).a());
                        int d2 = d();
                        String c2 = c();
                        piv0 piv0Var = this.g;
                        pnt0 pnt0Var = piv0Var.k;
                        if (pnt0Var != null) {
                            int c3 = cvw.c(pnt0Var.b, pnt0Var.w, d2);
                            if (c3 >= 0) {
                                Object[] objArr = pnt0Var.c;
                                Object obj2 = objArr[c3];
                                Object obj3 = kp50.b;
                                if (obj2 != obj3) {
                                    objArr[c3] = obj3;
                                    pnt0Var.a = true;
                                }
                            }
                            piv0Var.c(piv0Var.k, c2, m5g0Var);
                        }
                        return Boolean.FALSE;
                    }
                    if (arrayList2.isEmpty()) {
                        bj60Var.e("no_unique_messages");
                        return Boolean.FALSE;
                    }
                    ArrayList arrayList3 = jk60Var.a ? arrayList2 : ji60Var.a;
                    if (!arrayList2.isEmpty()) {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            if (!((ii60) it.next()).m) {
                                z = false;
                                break;
                            }
                        }
                    }
                    z = true;
                    boolean z3 = jk60Var.a;
                    i6b i6bVar = this.r;
                    String a = new uj60(i6bVar.c.c, i3, i6bVar.b.a(), z3).a();
                    chatNotificationPublisher$tryPublishNotification$12.L$0 = this;
                    chatNotificationPublisher$tryPublishNotification$12.L$1 = jk60Var;
                    chatNotificationPublisher$tryPublishNotification$12.L$2 = bj60Var;
                    chatNotificationPublisher$tryPublishNotification$12.label = 1;
                    obj = f(this, a, arrayList3, jk60Var, bj60Var, null, z, chatNotificationPublisher$tryPublishNotification$12, 16);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar = this;
                    jk60Var2 = jk60Var;
                    bj60Var2 = bj60Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bj60Var2 = (bj60) chatNotificationPublisher$tryPublishNotification$12.L$2;
                    jk60Var2 = (jk60) chatNotificationPublisher$tryPublishNotification$12.L$1;
                    aVar = (a) chatNotificationPublisher$tryPublishNotification$12.L$0;
                    kotlin.b.b(obj);
                }
                Boolean bool = (Boolean) obj;
                bool.getClass();
                aVar.v.b.clear();
                if (!jk60Var2.a) {
                    bj60.c(bj60Var2, "tech_ignore_summary");
                    return bool;
                }
                piv0 piv0Var2 = aVar.g;
                int d3 = aVar.d();
                String a2 = aVar.s.a();
                m5g0 m5g0Var2 = jk60Var2.b;
                pnt0 pnt0Var2 = piv0Var2.k;
                if (pnt0Var2 == null) {
                    x22 x22Var = piv0Var2.f;
                    HashMap a3 = piv0.a(a2, m5g0Var2);
                    a3.put(CancelNotificationBroadcastReceiver.NOTIFICATION_ID, Integer.valueOf(d3));
                    x22Var.reportEvent("summary_notification_not_show", a3);
                } else {
                    pnt0Var2.d(d3, new uj60(piv0Var2.c.c, 28, a2, z2).a());
                    piv0Var2.c(piv0Var2.k, a2, m5g0Var2);
                }
                return bool;
            }
        }
        chatNotificationPublisher$tryPublishNotification$1 = new ChatNotificationPublisher$tryPublishNotification$1(this, continuationImpl);
        ChatNotificationPublisher$tryPublishNotification$1 chatNotificationPublisher$tryPublishNotification$122 = chatNotificationPublisher$tryPublishNotification$1;
        Object obj4 = chatNotificationPublisher$tryPublishNotification$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chatNotificationPublisher$tryPublishNotification$122.label;
        boolean z22 = false;
        if (i != 0) {
        }
        Boolean bool2 = (Boolean) obj4;
        bool2.getClass();
        aVar.v.b.clear();
        if (!jk60Var2.a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0110 -> B:10:0x0113). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(ji60 ji60Var, jk60 jk60Var, bj60 bj60Var, ContinuationImpl continuationImpl) {
        ChatNotificationPublisher$tryPublishSeparateNotifications$1 chatNotificationPublisher$tryPublishSeparateNotifications$1;
        a aVar;
        int i;
        jk60 jk60Var2;
        Iterator it;
        ChatNotificationPublisher$tryPublishSeparateNotifications$1 chatNotificationPublisher$tryPublishSeparateNotifications$12;
        bj60 bj60Var2;
        a aVar2;
        int i2;
        if (continuationImpl instanceof ChatNotificationPublisher$tryPublishSeparateNotifications$1) {
            chatNotificationPublisher$tryPublishSeparateNotifications$1 = (ChatNotificationPublisher$tryPublishSeparateNotifications$1) continuationImpl;
            int i3 = chatNotificationPublisher$tryPublishSeparateNotifications$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                chatNotificationPublisher$tryPublishSeparateNotifications$1.label = i3 - Integer.MIN_VALUE;
                aVar = this;
                Object obj = chatNotificationPublisher$tryPublishSeparateNotifications$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chatNotificationPublisher$tryPublishSeparateNotifications$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ArrayList arrayList = ji60Var.c;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        MessageData messageData = ((ii60) obj2).h;
                        if ((messageData instanceof TechMeetingStartedMessage) || (messageData instanceof TechPersonalMeetingEndedMessage)) {
                            arrayList2.add(obj2);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        bj60.c(bj60Var, "tech_no_separate_messages");
                        return Boolean.FALSE;
                    }
                    jk60Var2 = jk60Var;
                    it = arrayList2.iterator();
                    chatNotificationPublisher$tryPublishSeparateNotifications$12 = chatNotificationPublisher$tryPublishSeparateNotifications$1;
                    bj60Var2 = bj60Var;
                    aVar2 = aVar;
                    i2 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = chatNotificationPublisher$tryPublishSeparateNotifications$1.I$0;
                    it = (Iterator) chatNotificationPublisher$tryPublishSeparateNotifications$1.L$3;
                    bj60 bj60Var3 = (bj60) chatNotificationPublisher$tryPublishSeparateNotifications$1.L$2;
                    jk60 jk60Var3 = (jk60) chatNotificationPublisher$tryPublishSeparateNotifications$1.L$1;
                    a aVar3 = (a) chatNotificationPublisher$tryPublishSeparateNotifications$1.L$0;
                    kotlin.b.b(obj);
                    chatNotificationPublisher$tryPublishSeparateNotifications$12 = chatNotificationPublisher$tryPublishSeparateNotifications$1;
                    bj60Var2 = bj60Var3;
                    jk60Var2 = jk60Var3;
                    aVar2 = aVar3;
                    i2 |= ((Boolean) obj).booleanValue() ? 1 : 0;
                    if (it.hasNext()) {
                        ii60 ii60Var = (ii60) it.next();
                        i6b i6bVar = aVar2.r;
                        String a = new uj60(i6bVar.c.c, i6bVar.b.a(), jk60Var2.a, true, Long.valueOf(ii60Var.b)).a();
                        List singletonList = Collections.singletonList(ii60Var);
                        ho9 ho9Var = aVar2.w.e.a;
                        com.yandex.messaging.internal.authorized.chat.notifications.builder.e eVar = new com.yandex.messaging.internal.authorized.chat.notifications.builder.e((Context) ho9Var.a.get(), (z120) ho9Var.b.get(), (p150) ho9Var.c.get(), (c) ho9Var.d.get(), ii60Var);
                        chatNotificationPublisher$tryPublishSeparateNotifications$12.L$0 = aVar2;
                        chatNotificationPublisher$tryPublishSeparateNotifications$12.L$1 = jk60Var2;
                        chatNotificationPublisher$tryPublishSeparateNotifications$12.L$2 = bj60Var2;
                        chatNotificationPublisher$tryPublishSeparateNotifications$12.L$3 = it;
                        chatNotificationPublisher$tryPublishSeparateNotifications$12.I$0 = i2;
                        chatNotificationPublisher$tryPublishSeparateNotifications$12.label = 1;
                        obj = f(aVar2, a, singletonList, jk60Var2, bj60Var2, eVar, false, chatNotificationPublisher$tryPublishSeparateNotifications$12, 32);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        i2 |= ((Boolean) obj).booleanValue() ? 1 : 0;
                        if (it.hasNext()) {
                            return Boolean.valueOf(i2 != 0);
                        }
                    }
                }
            }
        }
        aVar = this;
        chatNotificationPublisher$tryPublishSeparateNotifications$1 = new ChatNotificationPublisher$tryPublishSeparateNotifications$1(aVar, continuationImpl);
        Object obj3 = chatNotificationPublisher$tryPublishSeparateNotifications$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chatNotificationPublisher$tryPublishSeparateNotifications$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0127 A[Catch: all -> 0x004d, TryCatch #2 {all -> 0x004d, blocks: (B:23:0x0048, B:24:0x011f, B:26:0x0127, B:28:0x0134), top: B:22:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0134 A[Catch: all -> 0x004d, TRY_LEAVE, TryCatch #2 {all -> 0x004d, blocks: (B:23:0x0048, B:24:0x011f, B:26:0x0127, B:28:0x0134), top: B:22:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(ContinuationImpl continuationImpl) {
        ChatNotificationPublisher$tryUpdateNotification$1 chatNotificationPublisher$tryUpdateNotification$1;
        Object obj;
        int i;
        Object next;
        lk60 lk60Var;
        bj60 bj60Var;
        bj60 bj60Var2;
        a aVar = this;
        if (continuationImpl instanceof ChatNotificationPublisher$tryUpdateNotification$1) {
            chatNotificationPublisher$tryUpdateNotification$1 = (ChatNotificationPublisher$tryUpdateNotification$1) continuationImpl;
            int i2 = chatNotificationPublisher$tryUpdateNotification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chatNotificationPublisher$tryUpdateNotification$1.label = i2 - Integer.MIN_VALUE;
                obj = chatNotificationPublisher$tryUpdateNotification$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chatNotificationPublisher$tryUpdateNotification$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i == 1) {
                        bj60Var2 = (bj60) chatNotificationPublisher$tryUpdateNotification$1.L$1;
                        aVar = (a) chatNotificationPublisher$tryUpdateNotification$1.L$0;
                        try {
                            kotlin.b.b(obj);
                        } catch (Throwable th) {
                            th = th;
                            bj60Var = bj60Var2;
                        }
                    } else {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bj60Var = (bj60) chatNotificationPublisher$tryUpdateNotification$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            return zy11Var;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    bj60Var.b("notification_update_error", th);
                    return zy11Var;
                }
                kotlin.b.b(obj);
                mk60 mk60Var = aVar.q;
                ArrayDeque arrayDeque = mk60Var.b;
                if (arrayDeque.isEmpty()) {
                    lk60Var = null;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = arrayDeque.iterator();
                    while (it.hasNext()) {
                        m5g0 m5g0Var = ((jk60) it.next()).b;
                        if (m5g0Var != null) {
                            arrayList.add(m5g0Var);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (it2.hasNext()) {
                            long j = ((m5g0) next).b;
                            do {
                                Object next2 = it2.next();
                                long j2 = ((m5g0) next2).b;
                                if (j < j2) {
                                    j = j2;
                                    next = next2;
                                }
                            } while (it2.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    m5g0 m5g0Var2 = (m5g0) next;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        Object next3 = it3.next();
                        if (!jl40.l((m5g0) next3, m5g0Var2)) {
                            arrayList2.add(next3);
                        }
                    }
                    mk60Var.a.getClass();
                    jk60 jk60Var = new jk60(m5g0Var2, false);
                    arrayDeque.clear();
                    lk60Var = new lk60(jk60Var, arrayList2);
                }
                if (lk60Var != null) {
                    jk60 jk60Var2 = lk60Var.a;
                    boolean z = jk60Var2.a;
                    Iterator it4 = lk60Var.b.iterator();
                    while (it4.hasNext()) {
                        aVar.g((m5g0) it4.next(), z).e("throttled");
                    }
                    bj60 g = aVar.g(jk60Var2.b, z);
                    try {
                        chatNotificationPublisher$tryUpdateNotification$1.L$0 = aVar;
                        chatNotificationPublisher$tryUpdateNotification$1.L$1 = g;
                        chatNotificationPublisher$tryUpdateNotification$1.label = 1;
                        Object k = aVar.k(jk60Var2, g, chatNotificationPublisher$tryUpdateNotification$1);
                        if (k != coroutineSingletons) {
                            bj60Var2 = g;
                            obj = k;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        bj60Var = g;
                    }
                }
                if (!((Boolean) obj).booleanValue()) {
                    tje.N(aVar.C, null, null, new ChatNotificationPublisher$waitRequestsWithThrottle$1(aVar, null), 3);
                    return zy11Var;
                }
                chatNotificationPublisher$tryUpdateNotification$1.L$0 = bj60Var2;
                chatNotificationPublisher$tryUpdateNotification$1.L$1 = null;
                chatNotificationPublisher$tryUpdateNotification$1.label = 2;
                return aVar.j(chatNotificationPublisher$tryUpdateNotification$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
            }
        }
        chatNotificationPublisher$tryUpdateNotification$1 = new ChatNotificationPublisher$tryUpdateNotification$1(aVar, continuationImpl);
        obj = chatNotificationPublisher$tryUpdateNotification$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chatNotificationPublisher$tryUpdateNotification$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x03a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03b7 A[Catch: all -> 0x02f5, TryCatch #0 {all -> 0x02f5, blocks: (B:54:0x0269, B:55:0x0287, B:57:0x028d, B:59:0x0299, B:60:0x02a2, B:62:0x02aa, B:64:0x02ba, B:66:0x02c4, B:68:0x02d0, B:69:0x02cb, B:70:0x02b5, B:73:0x02f9, B:74:0x0346, B:76:0x034e, B:78:0x0354, B:80:0x035a, B:82:0x0366, B:84:0x0372, B:86:0x037e, B:89:0x0388, B:94:0x0393, B:96:0x0399, B:98:0x039f, B:105:0x03a5, B:101:0x03a9, B:108:0x03b0, B:110:0x03b7, B:112:0x03bd), top: B:53:0x0269 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0508 A[EDGE_INSN: B:177:0x0508->B:178:0x0508 BREAK  A[LOOP:11: B:169:0x04eb->B:175:0x0504], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x028d A[Catch: all -> 0x02f5, TryCatch #0 {all -> 0x02f5, blocks: (B:54:0x0269, B:55:0x0287, B:57:0x028d, B:59:0x0299, B:60:0x02a2, B:62:0x02aa, B:64:0x02ba, B:66:0x02c4, B:68:0x02d0, B:69:0x02cb, B:70:0x02b5, B:73:0x02f9, B:74:0x0346, B:76:0x034e, B:78:0x0354, B:80:0x035a, B:82:0x0366, B:84:0x0372, B:86:0x037e, B:89:0x0388, B:94:0x0393, B:96:0x0399, B:98:0x039f, B:105:0x03a5, B:101:0x03a9, B:108:0x03b0, B:110:0x03b7, B:112:0x03bd), top: B:53:0x0269 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0366 A[Catch: all -> 0x02f5, TryCatch #0 {all -> 0x02f5, blocks: (B:54:0x0269, B:55:0x0287, B:57:0x028d, B:59:0x0299, B:60:0x02a2, B:62:0x02aa, B:64:0x02ba, B:66:0x02c4, B:68:0x02d0, B:69:0x02cb, B:70:0x02b5, B:73:0x02f9, B:74:0x0346, B:76:0x034e, B:78:0x0354, B:80:0x035a, B:82:0x0366, B:84:0x0372, B:86:0x037e, B:89:0x0388, B:94:0x0393, B:96:0x0399, B:98:0x039f, B:105:0x03a5, B:101:0x03a9, B:108:0x03b0, B:110:0x03b7, B:112:0x03bd), top: B:53:0x0269 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x036e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(jk60 jk60Var, bj60 bj60Var, ContinuationImpl continuationImpl) {
        ChatNotificationPublisher$updateNotification$1 chatNotificationPublisher$updateNotification$1;
        int i;
        bj60 bj60Var2;
        jk60 jk60Var2;
        h3y h3yVar;
        x4b0 A;
        String str;
        st21 a;
        StatusAvailability findByType;
        it21 it21Var;
        String str2;
        a aVar;
        j3b j3bVar;
        jk60 jk60Var3;
        bj60 bj60Var3;
        mi60 mi60Var;
        ArrayList arrayList;
        long j;
        Long d;
        CoroutineSingletons coroutineSingletons;
        jk60 jk60Var4;
        boolean z;
        yab yabVar;
        Cursor cursor;
        ArrayList arrayList2;
        Iterator it;
        li60 li60Var;
        int i2;
        int size;
        int i3;
        Iterator it2;
        List list;
        List list2;
        Iterator it3;
        Iterator it4;
        ArrayList arrayList3;
        Iterator it5;
        ListIterator listIterator;
        jk60 jk60Var5;
        Object i4;
        CoroutineSingletons coroutineSingletons2;
        ji60 ji60Var;
        bj60 bj60Var4;
        a aVar2;
        ii60 l1;
        ii60 l12;
        mi60 mi60Var2;
        Long l;
        Long l2;
        Object h;
        boolean z2;
        a aVar3;
        Iterator it6;
        Long l3;
        a aVar4 = this;
        if (continuationImpl instanceof ChatNotificationPublisher$updateNotification$1) {
            chatNotificationPublisher$updateNotification$1 = (ChatNotificationPublisher$updateNotification$1) continuationImpl;
            int i5 = chatNotificationPublisher$updateNotification$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                chatNotificationPublisher$updateNotification$1.label = i5 - Integer.MIN_VALUE;
                Object obj = chatNotificationPublisher$updateNotification$1.result;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chatNotificationPublisher$updateNotification$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    bj60.c(bj60Var, "update_notification_start");
                    chatNotificationPublisher$updateNotification$1.L$0 = aVar4;
                    chatNotificationPublisher$updateNotification$1.L$1 = jk60Var;
                    chatNotificationPublisher$updateNotification$1.L$2 = bj60Var;
                    chatNotificationPublisher$updateNotification$1.label = 1;
                    aVar4.k.getClass();
                    boolean isEmpty = cjt.b.isEmpty();
                    Object obj2 = zy11.a;
                    if (!isEmpty) {
                        j18 j18Var = new j18(1, dvw.b(chatNotificationPublisher$updateNotification$1));
                        j18Var.u();
                        cjt.c.add(new uem(j18Var, 1));
                        Object s = j18Var.s();
                        if (s == coroutineSingletons3) {
                            obj2 = s;
                        }
                    }
                    if (obj2 != coroutineSingletons3) {
                        bj60Var2 = bj60Var;
                        jk60Var2 = jk60Var;
                    }
                    return coroutineSingletons3;
                }
                if (i == 1) {
                    bj60 bj60Var5 = (bj60) chatNotificationPublisher$updateNotification$1.L$2;
                    jk60Var2 = (jk60) chatNotificationPublisher$updateNotification$1.L$1;
                    a aVar5 = (a) chatNotificationPublisher$updateNotification$1.L$0;
                    kotlin.b.b(obj);
                    bj60Var2 = bj60Var5;
                    aVar4 = aVar5;
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            ji60 ji60Var2 = (ji60) chatNotificationPublisher$updateNotification$1.L$3;
                            bj60 bj60Var6 = (bj60) chatNotificationPublisher$updateNotification$1.L$2;
                            jk60Var5 = (jk60) chatNotificationPublisher$updateNotification$1.L$1;
                            a aVar6 = (a) chatNotificationPublisher$updateNotification$1.L$0;
                            kotlin.b.b(obj);
                            ji60Var = ji60Var2;
                            bj60Var4 = bj60Var6;
                            coroutineSingletons2 = coroutineSingletons3;
                            aVar2 = aVar6;
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            chatNotificationPublisher$updateNotification$1.L$0 = aVar2;
                            chatNotificationPublisher$updateNotification$1.L$1 = ji60Var;
                            l2 = null;
                            chatNotificationPublisher$updateNotification$1.L$2 = null;
                            chatNotificationPublisher$updateNotification$1.L$3 = null;
                            chatNotificationPublisher$updateNotification$1.Z$0 = booleanValue;
                            chatNotificationPublisher$updateNotification$1.label = 4;
                            h = aVar2.h(ji60Var, jk60Var5, bj60Var4, chatNotificationPublisher$updateNotification$1);
                            if (h != coroutineSingletons2) {
                                return coroutineSingletons2;
                            }
                            obj = h;
                            z2 = booleanValue;
                            aVar3 = aVar2;
                            boolean booleanValue2 = z2 | ((Boolean) obj).booleanValue();
                            aVar3.getClass();
                            it6 = kotlin.collections.a.m0(ji60Var.c, ji60Var.b).iterator();
                            if (!it6.hasNext()) {
                            }
                            if (l3 != null) {
                            }
                            return Boolean.valueOf(booleanValue2);
                        }
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z2 = chatNotificationPublisher$updateNotification$1.Z$0;
                        ji60Var = (ji60) chatNotificationPublisher$updateNotification$1.L$1;
                        aVar3 = (a) chatNotificationPublisher$updateNotification$1.L$0;
                        kotlin.b.b(obj);
                        l2 = null;
                        boolean booleanValue22 = z2 | ((Boolean) obj).booleanValue();
                        aVar3.getClass();
                        it6 = kotlin.collections.a.m0(ji60Var.c, ji60Var.b).iterator();
                        if (!it6.hasNext()) {
                            Long valueOf = Long.valueOf(((ii60) it6.next()).b);
                            loop0: while (true) {
                                l3 = valueOf;
                                while (it6.hasNext()) {
                                    valueOf = Long.valueOf(((ii60) it6.next()).b);
                                    if (l3.compareTo(valueOf) < 0) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            l3 = l2;
                        }
                        if (l3 != null) {
                            l020 C = aVar3.d.C();
                            try {
                                C.a0(aVar3.c.a, l3.longValue());
                                C.s();
                                C.close();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    ooc.g(C, th);
                                    throw th2;
                                }
                            }
                        }
                        return Boolean.valueOf(booleanValue22);
                    }
                    j3bVar = (j3b) chatNotificationPublisher$updateNotification$1.L$3;
                    bj60Var3 = (bj60) chatNotificationPublisher$updateNotification$1.L$2;
                    jk60Var3 = (jk60) chatNotificationPublisher$updateNotification$1.L$1;
                    a aVar7 = (a) chatNotificationPublisher$updateNotification$1.L$0;
                    kotlin.b.b(obj);
                    aVar = aVar7;
                    mi60Var = aVar.n;
                    boolean z3 = j3bVar.j;
                    iv21 iv21Var = mi60Var.e;
                    arrayList = new ArrayList();
                    meb mebVar = mi60Var.g;
                    j = mi60Var.c.a;
                    d = mebVar.d(j);
                    k020 k020Var = mi60Var.d;
                    if (d == null) {
                        long longValue = d.longValue();
                        at2 at2Var = k020Var.b;
                        coroutineSingletons = coroutineSingletons3;
                        jk60Var4 = jk60Var3;
                        yab yabVar2 = new yab(at2Var.B().M(j, longValue), (Moshi) k020Var.h.get(), at2Var.Y().g(j));
                        z = z3;
                        yabVar = yabVar2;
                    } else {
                        coroutineSingletons = coroutineSingletons3;
                        jk60Var4 = jk60Var3;
                        at2 at2Var2 = k020Var.b;
                        z = z3;
                        yabVar = new yab(at2Var2.B().M(j, 0L), (Moshi) k020Var.h.get(), at2Var2.Y().g(j));
                    }
                    try {
                        cursor = yabVar.a;
                        yabVar.moveToFirst();
                        List J0 = kotlin.collections.a.J0(mi60Var.b.b);
                        arrayList2 = new ArrayList(tcc.n(J0, 10));
                        it = J0.iterator();
                        while (it.hasNext()) {
                            ServerNotification serverNotification = (ServerNotification) it.next();
                            ServerNotification.Text text = serverNotification.getText();
                            String notificationText = text != null ? text.getNotificationText() : null;
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            Long timestampMs = serverNotification.getTimestampMs();
                            Iterator it7 = it;
                            long micros = timeUnit.toMicros(timestampMs != null ? timestampMs.longValue() : System.currentTimeMillis());
                            Long timestampMs2 = serverNotification.getTimestampMs();
                            arrayList2.add(new ii60(notificationText, micros, timestampMs2 != null ? timestampMs2.longValue() : System.currentTimeMillis(), 0, serverNotification.getToGuid(), null, null, null, null, false, false, false, false, 7680));
                            it = it7;
                        }
                        ki60 ki60Var = mi60Var.a;
                        li60Var = new li60(z, true, ki60Var.a, ki60Var.h, ki60Var.b, ki60Var.c, ki60Var.d, ki60Var.e, ki60Var.f, ki60Var.g, ki60Var.k, ki60Var.i, ki60Var.j);
                        i2 = 0;
                        while (!cursor.isAfterLast() && i2 < arrayList2.size() && arrayList.size() < 25) {
                            l12 = yabVar.l1(li60Var);
                            ii60 ii60Var = (ii60) arrayList2.get(i2);
                            if (l12 == null) {
                                mi60Var2 = mi60Var;
                                l = Long.valueOf(l12.b);
                            } else {
                                mi60Var2 = mi60Var;
                                l = null;
                            }
                            if (l != null || l.longValue() >= ii60Var.b) {
                                arrayList.add(arrayList2.get(i2));
                                i2++;
                            } else {
                                arrayList.add(l12);
                                yabVar.moveToNext();
                            }
                            mi60Var = mi60Var2;
                        }
                        mi60 mi60Var3 = mi60Var;
                        while (!cursor.isAfterLast() && arrayList.size() < 25) {
                            l1 = yabVar.l1(li60Var);
                            if (l1 != null) {
                                yabVar.moveToNext();
                            } else {
                                arrayList.add(l1);
                                yabVar.moveToNext();
                            }
                        }
                        size = arrayList2.size();
                        for (i3 = i2; i3 < size; i3++) {
                            if (arrayList.size() >= 25) {
                                break;
                            }
                            arrayList.add((ii60) arrayList2.get(i2));
                        }
                        yabVar.close();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            Boolean valueOf2 = Boolean.valueOf(((ii60) next).j);
                            Object obj3 = linkedHashMap.get(valueOf2);
                            if (obj3 == null) {
                                obj3 = new ArrayList();
                                linkedHashMap.put(valueOf2, obj3);
                            }
                            ((List) obj3).add(next);
                        }
                        list = (List) linkedHashMap.get(Boolean.FALSE);
                        List list3 = EmptyList.a;
                        if (list == null) {
                            list = list3;
                        }
                        list2 = (List) linkedHashMap.get(Boolean.TRUE);
                        if (list2 != null) {
                            list3 = list2;
                        }
                        Long l4 = (Long) androidx.room.util.a.b(mi60Var3.h.a, true, false, new cs0(j, 22));
                        long longValue2 = l4 != null ? l4.longValue() : 0L;
                        ArrayList a2 = mi60.a(new u1l(2, list));
                        ArrayList arrayList4 = new ArrayList(tcc.n(a2, 10));
                        it3 = a2.iterator();
                        while (it3.hasNext()) {
                            ii60 ii60Var2 = (ii60) it3.next();
                            if (iv21Var.c) {
                                ii60Var2 = mi60Var3.b(ii60Var2);
                            }
                            arrayList4.add(ii60Var2);
                        }
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj4 : list) {
                            if (((ii60) obj4).b <= longValue2) {
                                break;
                            }
                            arrayList5.add(obj4);
                        }
                        ArrayList a3 = mi60.a(new u1l(2, arrayList5));
                        ArrayList arrayList6 = new ArrayList(tcc.n(a3, 10));
                        it4 = a3.iterator();
                        while (it4.hasNext()) {
                            ii60 ii60Var3 = (ii60) it4.next();
                            if (iv21Var.c) {
                                ii60Var3 = mi60Var3.b(ii60Var3);
                            }
                            arrayList6.add(ii60Var3);
                        }
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj5 : list3) {
                            if (((ii60) obj5).b <= longValue2) {
                                break;
                            }
                            arrayList7.add(obj5);
                        }
                        u1l u1lVar = new u1l(2, arrayList7);
                        arrayList3 = new ArrayList(tcc.n(u1lVar, 10));
                        it5 = u1lVar.iterator();
                        while (true) {
                            listIterator = ((t2k0) it5).a;
                            if (listIterator.hasPrevious()) {
                                break;
                            }
                            ii60 ii60Var4 = (ii60) listIterator.previous();
                            if (iv21Var.c) {
                                ii60Var4 = mi60Var3.b(ii60Var4);
                            }
                            arrayList3.add(ii60Var4);
                        }
                        ji60 ji60Var3 = new ji60(arrayList4, arrayList6, arrayList3);
                        chatNotificationPublisher$updateNotification$1.L$0 = aVar;
                        jk60Var5 = jk60Var4;
                        chatNotificationPublisher$updateNotification$1.L$1 = jk60Var5;
                        chatNotificationPublisher$updateNotification$1.L$2 = bj60Var3;
                        chatNotificationPublisher$updateNotification$1.L$3 = ji60Var3;
                        chatNotificationPublisher$updateNotification$1.label = 3;
                        i4 = aVar.i(ji60Var3, jk60Var5, bj60Var3, chatNotificationPublisher$updateNotification$1);
                        coroutineSingletons2 = coroutineSingletons;
                        if (i4 != coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        bj60 bj60Var7 = bj60Var3;
                        ji60Var = ji60Var3;
                        bj60Var4 = bj60Var7;
                        aVar2 = aVar;
                        obj = i4;
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        chatNotificationPublisher$updateNotification$1.L$0 = aVar2;
                        chatNotificationPublisher$updateNotification$1.L$1 = ji60Var;
                        l2 = null;
                        chatNotificationPublisher$updateNotification$1.L$2 = null;
                        chatNotificationPublisher$updateNotification$1.L$3 = null;
                        chatNotificationPublisher$updateNotification$1.Z$0 = booleanValue3;
                        chatNotificationPublisher$updateNotification$1.label = 4;
                        h = aVar2.h(ji60Var, jk60Var5, bj60Var4, chatNotificationPublisher$updateNotification$1);
                        if (h != coroutineSingletons2) {
                        }
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            ooc.g(yabVar, th3);
                            throw th4;
                        }
                    }
                }
                bj60.c(bj60Var2, "notification_global_lock_passed");
                k020 k020Var2 = aVar4.d;
                o1b0 o1b0Var = aVar4.c;
                j3b k = k020Var2.k(o1b0Var.a);
                k020 k020Var3 = aVar4.d;
                h3yVar = k020Var3.k;
                at2 at2Var3 = k020Var3.b;
                if (!((u9u0) h3yVar.get()).w || (A = k020Var3.A()) == null || (a = at2Var3.F().a((str = A.a))) == null || (findByType = StatusAvailability.INSTANCE.findByType(a.d)) == null) {
                    it21Var = null;
                } else {
                    String str3 = a.h;
                    String str4 = a.g;
                    clf clfVar = (str3 != null || str4 == null) ? null : new clf(str3, str4, a.i, a.j);
                    long j2 = a.c;
                    boolean z4 = a.e != 1;
                    o430 o430Var = e3n.b;
                    it21Var = new it21(str, j2, findByType, z4, kp50.U(a.f, DurationUnit.SECONDS), clfVar);
                }
                if (aVar4.A) {
                    str2 = "profile_removed";
                } else {
                    aVar4.j.getClass();
                    if (o1b0Var.e) {
                        str2 = "publish_restricted";
                    } else {
                        boolean z5 = jk60Var2.a;
                        if (z5 && !aVar4.p.a()) {
                            str2 = "inapp_in_background";
                        } else if (!aVar4.t.e) {
                            str2 = "notifications disabled by config";
                        } else if (aVar4.z != null) {
                            str2 = "chat_locked";
                        } else if (aVar4.y.a()) {
                            String str5 = o1b0Var.c;
                            str2 = str5 == null ? false : at2Var3.C().e(str5) ? "user_blocked" : !((!k.K && (!k.J || z5)) ? k.L : true) ? "not_participant" : (k.j && k.k) ? "chat_muted" : aVar4.i.a(k.b) ? "chat_hidden" : (z5 && it21Var != null && it21Var.d) ? "dnd_status" : null;
                        } else {
                            str2 = "notifications_disabled";
                        }
                    }
                }
                if (str2 != null) {
                    bj60Var2.e(str2);
                    return Boolean.FALSE;
                }
                b bVar = aVar4.u;
                chatNotificationPublisher$updateNotification$1.L$0 = aVar4;
                chatNotificationPublisher$updateNotification$1.L$1 = jk60Var2;
                chatNotificationPublisher$updateNotification$1.L$2 = bj60Var2;
                chatNotificationPublisher$updateNotification$1.L$3 = k;
                chatNotificationPublisher$updateNotification$1.label = 2;
                if (bVar.a(jk60Var2, chatNotificationPublisher$updateNotification$1) != coroutineSingletons3) {
                    bj60 bj60Var8 = bj60Var2;
                    aVar = aVar4;
                    j3bVar = k;
                    jk60Var3 = jk60Var2;
                    bj60Var3 = bj60Var8;
                    mi60Var = aVar.n;
                    boolean z32 = j3bVar.j;
                    iv21 iv21Var2 = mi60Var.e;
                    arrayList = new ArrayList();
                    meb mebVar2 = mi60Var.g;
                    j = mi60Var.c.a;
                    d = mebVar2.d(j);
                    k020 k020Var4 = mi60Var.d;
                    if (d == null) {
                    }
                    cursor = yabVar.a;
                    yabVar.moveToFirst();
                    List J02 = kotlin.collections.a.J0(mi60Var.b.b);
                    arrayList2 = new ArrayList(tcc.n(J02, 10));
                    it = J02.iterator();
                    while (it.hasNext()) {
                    }
                    ki60 ki60Var2 = mi60Var.a;
                    li60Var = new li60(z, true, ki60Var2.a, ki60Var2.h, ki60Var2.b, ki60Var2.c, ki60Var2.d, ki60Var2.e, ki60Var2.f, ki60Var2.g, ki60Var2.k, ki60Var2.i, ki60Var2.j);
                    i2 = 0;
                    while (!cursor.isAfterLast()) {
                        l12 = yabVar.l1(li60Var);
                        ii60 ii60Var5 = (ii60) arrayList2.get(i2);
                        if (l12 == null) {
                        }
                        if (l != null) {
                        }
                        arrayList.add(arrayList2.get(i2));
                        i2++;
                        mi60Var = mi60Var2;
                    }
                    mi60 mi60Var32 = mi60Var;
                    while (!cursor.isAfterLast()) {
                        l1 = yabVar.l1(li60Var);
                        if (l1 != null) {
                        }
                    }
                    size = arrayList2.size();
                    while (i3 < size) {
                    }
                    yabVar.close();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                    }
                    list = (List) linkedHashMap2.get(Boolean.FALSE);
                    List list32 = EmptyList.a;
                    if (list == null) {
                    }
                    list2 = (List) linkedHashMap2.get(Boolean.TRUE);
                    if (list2 != null) {
                    }
                    Long l42 = (Long) androidx.room.util.a.b(mi60Var32.h.a, true, false, new cs0(j, 22));
                    if (l42 != null) {
                    }
                    ArrayList a22 = mi60.a(new u1l(2, list));
                    ArrayList arrayList42 = new ArrayList(tcc.n(a22, 10));
                    it3 = a22.iterator();
                    while (it3.hasNext()) {
                    }
                    ArrayList arrayList52 = new ArrayList();
                    while (r5.hasNext()) {
                    }
                    ArrayList a32 = mi60.a(new u1l(2, arrayList52));
                    ArrayList arrayList62 = new ArrayList(tcc.n(a32, 10));
                    it4 = a32.iterator();
                    while (it4.hasNext()) {
                    }
                    ArrayList arrayList72 = new ArrayList();
                    while (r6.hasNext()) {
                    }
                    u1l u1lVar2 = new u1l(2, arrayList72);
                    arrayList3 = new ArrayList(tcc.n(u1lVar2, 10));
                    it5 = u1lVar2.iterator();
                    while (true) {
                        listIterator = ((t2k0) it5).a;
                        if (listIterator.hasPrevious()) {
                        }
                        arrayList3.add(ii60Var4);
                    }
                    ji60 ji60Var32 = new ji60(arrayList42, arrayList62, arrayList3);
                    chatNotificationPublisher$updateNotification$1.L$0 = aVar;
                    jk60Var5 = jk60Var4;
                    chatNotificationPublisher$updateNotification$1.L$1 = jk60Var5;
                    chatNotificationPublisher$updateNotification$1.L$2 = bj60Var3;
                    chatNotificationPublisher$updateNotification$1.L$3 = ji60Var32;
                    chatNotificationPublisher$updateNotification$1.label = 3;
                    i4 = aVar.i(ji60Var32, jk60Var5, bj60Var3, chatNotificationPublisher$updateNotification$1);
                    coroutineSingletons2 = coroutineSingletons;
                    if (i4 != coroutineSingletons2) {
                    }
                }
                return coroutineSingletons3;
            }
        }
        chatNotificationPublisher$updateNotification$1 = new ChatNotificationPublisher$updateNotification$1(aVar4, continuationImpl);
        Object obj6 = chatNotificationPublisher$updateNotification$1.result;
        CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chatNotificationPublisher$updateNotification$1.label;
        if (i != 0) {
        }
        bj60.c(bj60Var2, "notification_global_lock_passed");
        k020 k020Var22 = aVar4.d;
        o1b0 o1b0Var2 = aVar4.c;
        j3b k2 = k020Var22.k(o1b0Var2.a);
        k020 k020Var32 = aVar4.d;
        h3yVar = k020Var32.k;
        at2 at2Var32 = k020Var32.b;
        if (!((u9u0) h3yVar.get()).w) {
            String str32 = a.h;
            String str42 = a.g;
            if (str32 != null) {
            }
            long j22 = a.c;
            if (a.e != 1) {
            }
            o430 o430Var2 = e3n.b;
            it21Var = new it21(str, j22, findByType, z4, kp50.U(a.f, DurationUnit.SECONDS), clfVar);
            if (aVar4.A) {
            }
            if (str2 != null) {
            }
        }
        it21Var = null;
        if (aVar4.A) {
        }
        if (str2 != null) {
        }
    }

    public final void l(jk60 jk60Var) {
        this.q.b.offer(jk60Var);
        pzt0 pzt0Var = this.D;
        if (pzt0Var == null || !pzt0Var.isActive()) {
            tje.N(this.C, null, null, new ChatNotificationPublisher$updateNotificationWithThrottle$1(this, null), 3);
        }
    }
}
