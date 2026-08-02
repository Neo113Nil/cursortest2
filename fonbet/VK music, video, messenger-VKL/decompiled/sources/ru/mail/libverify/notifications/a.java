package ru.mail.libverify.notifications;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Lambda;
import ru.mail.libverify.g0.d;
import ru.mail.libverify.i.c;
import ru.mail.libverify.i.f;
import ru.mail.libverify.i.i;
import ru.mail.libverify.i.k;
import ru.mail.libverify.i.m;
import ru.mail.libverify.p0.e;
import ru.mail.verify.core.utils.FileLog;
import ru.mail.verify.core.utils.components.MessageBus;
import xsna.bhj0;
import xsna.bpn0;
import xsna.epx;
import xsna.gzs;
import xsna.hc3;

/* loaded from: classes9.dex */
public final class a implements c {
    private final Context a;
    private final MessageBus b;
    private final d c;
    private final m d;
    private final f e;
    private final ru.mail.libverify.w.f f;
    private final Lazy g = new bpn0(new b());
    private final HashMap<String, HashSet<String>> h = new HashMap<>();

    /* renamed from: ru.mail.libverify.notifications.a$a, reason: collision with other inner class name */
    public static final class C2210a {
        public static Notification a(Context context, String str) {
            for (StatusBarNotification statusBarNotification : ((NotificationManager) context.getSystemService("notification")).getActiveNotifications()) {
                if (epx.f(statusBarNotification.getTag(), str)) {
                    return statusBarNotification.getNotification();
                }
            }
            return null;
        }
    }

    public static final class b extends Lambda implements gzs<NotificationManager> {
        public b() {
            super(0);
        }

        @Override // xsna.gzs
        public final NotificationManager invoke() {
            return (NotificationManager) a.this.a.getSystemService("notification");
        }
    }

    public a(Context context, MessageBus messageBus, d dVar, m mVar, f fVar, ru.mail.libverify.w.f fVar2) {
        this.a = context;
        this.b = messageBus;
        this.c = dVar;
        this.d = mVar;
        this.e = fVar;
        this.f = fVar2;
    }

    @Override // ru.mail.libverify.i.c
    public final void a(String str, k kVar) {
        HashMap<String, HashSet<String>> hashMap = this.h;
        HashSet<String> hashSet = hashMap.get(str);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            hashMap.put(str, hashSet);
        }
        hashSet.add(kVar.d());
        a(kVar);
    }

    @Override // ru.mail.libverify.i.c
    public final void b(String str) {
        HashSet<String> hashSet = this.h.get(str);
        if (hashSet == null) {
            return;
        }
        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()) {
            String next = it.next();
            a(next);
            HashSet<String> hashSet2 = this.h.get(str);
            if (hashSet2 != null) {
                hashSet2.remove(next);
            }
        }
    }

    @Override // ru.mail.libverify.i.c
    public final void b() {
        Iterator<Map.Entry<String, k>> it = this.e.a().entrySet().iterator();
        while (it.hasNext()) {
            k value = it.next().getValue();
            if (C2210a.a(this.a, value.d()) != null) {
                a(value);
            } else {
                a(value.d());
            }
        }
    }

    @Override // ru.mail.libverify.i.c
    public final void a(k kVar) {
        Long c;
        FileLog.v("NotificationBarManager", "show notification %s", kVar.d());
        this.e.a(kVar.d(), kVar);
        b(kVar);
        if (!kVar.e() || (c = kVar.c()) == null) {
            return;
        }
        long longValue = c.longValue();
        FileLog.v("NotificationBarManager", "notification %s ongoing timeout %d", kVar.d(), c);
        this.b.a(e.a(ru.mail.libverify.p0.a.NOTIFICATION_BAR_MANAGER_ONGOING_NOTIFICATION_SHOWN, kVar.d(), c));
        this.c.b().postDelayed(new hc3(11, this, kVar), longValue);
    }

    private final void b(k kVar) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(this.d.b());
        arrayList.add(this.d.a());
        ((NotificationManager) this.g.getValue()).createNotificationChannels(arrayList);
        Notification c = kVar.a(this.f).c();
        if (kVar.f()) {
            c.defaults &= -4;
        } else {
            c.vibrate = new long[]{500, 500};
        }
        if (this.e.a(kVar.d()) == null) {
            return;
        }
        String d = kVar.d();
        boolean z = false;
        try {
            FileLog.d("NotificationBarManager", "safeNotify tag %s", d);
            ((NotificationManager) this.g.getValue()).notify(d, 0, c);
            z = true;
        } catch (SecurityException e) {
            FileLog.e("NotificationBarManager", "safeNotify error", e);
        }
        if (!i.a(this.a, kVar.a()) || !z) {
            FileLog.e("NotificationBarManager", "Failed to show notification %s", kVar.d());
            this.e.b(kVar.d());
        } else {
            kVar.g();
        }
        bhj0.h(this.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar, k kVar) {
        aVar.b(kVar);
        FileLog.v("NotificationBarManager", "ongoing timeout for %s expired, silent = %s, ongoing = %s", kVar.d(), Boolean.valueOf(kVar.f()), Boolean.valueOf(kVar.e()));
    }

    @Override // ru.mail.libverify.i.c
    public final void a() {
        this.e.clear();
        try {
            FileLog.d("NotificationBarManager", "cancel all");
            ((NotificationManager) this.g.getValue()).cancelAll();
            bhj0.h(this.a);
        } catch (NullPointerException e) {
            FileLog.e("NotificationBarManager", "cancel all", e);
        } catch (SecurityException e2) {
            FileLog.e("NotificationBarManager", "cancel all", e2);
        }
    }

    @Override // ru.mail.libverify.i.c
    public final void a(String str) {
        try {
            this.e.b(str);
            FileLog.d("NotificationBarManager", "cancel tag %s", str);
            ((NotificationManager) this.g.getValue()).cancel(str, 0);
            bhj0.h(this.a);
        } catch (NullPointerException e) {
            FileLog.e("NotificationBarManager", "cancel", e);
        } catch (SecurityException e2) {
            FileLog.e("NotificationBarManager", "cancel", e2);
        }
    }
}
