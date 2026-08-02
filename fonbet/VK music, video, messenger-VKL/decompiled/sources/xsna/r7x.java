package xsna;

import android.app.ActivityManager;
import android.app.ApplicationStartInfo;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Handler;
import androidx.core.app.NotificationCompat;
import com.vk.instantjobs.InstantJob;
import com.vk.instantjobs.components.appstate.AppState;
import com.vk.instantjobs.receivers.InstantJobCancelReceiver;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.r93;

/* compiled from: InstantJobNotifier.kt */
/* loaded from: classes.dex */
public final class r7x {
    public final Context a;
    public final r93 b;
    public final ExecutorService c;
    public final pla d;
    public final Object e;
    public final bpn0 f = new bpn0(new egv(this, 2));
    public final bpn0 g = new bpn0(new nb8(9));
    public final bpn0 h = new bpn0(new bia(this, 4));
    public final b i;
    public final CopyOnWriteArrayList<a> j;
    public boolean k;

    /* compiled from: InstantJobNotifier.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public final w6x a;
        public final boolean b;
        public final InstantJob.a c;

        public a(w6x w6xVar, boolean z, InstantJob.a aVar) {
            this.a = w6xVar;
            this.b = z;
            this.c = aVar;
        }

        public static a a(a aVar, boolean z, InstantJob.a aVar2, int i) {
            w6x w6xVar = aVar.a;
            if ((i & 2) != 0) {
                z = aVar.b;
            }
            if ((i & 4) != 0) {
                aVar2 = aVar.c;
            }
            aVar.getClass();
            return new a(w6xVar, z, aVar2);
        }

        public final w6x b() {
            return this.a;
        }

        public final boolean c() {
            return this.b;
        }

        public final boolean d(InstantJob.NotificationHideCondition notificationHideCondition) {
            return notificationHideCondition == this.a.e.o();
        }

        public final boolean e(InstantJob.NotificationShowCondition notificationShowCondition) {
            return notificationShowCondition == this.a.e.p();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + qoy.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "ActiveJob(jobInfo=" + this.a + ", visible=" + this.b + ", state=" + this.c + ')';
        }
    }

    /* compiled from: InstantJobNotifier.kt */
    public final class b implements r93.a {
        public b() {
        }

        @Override // xsna.r93.a
        public final void a(AppState appState) {
            r7x r7xVar = r7x.this;
            synchronized (r7xVar) {
                if (r7xVar.k) {
                    return;
                }
                r7xVar.k(new j7x(0, appState, r7xVar));
            }
        }
    }

    /* compiled from: InstantJobNotifier.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[InstantJob.NotificationShowCondition.values().length];
            try {
                iArr[InstantJob.NotificationShowCondition.NEVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InstantJob.NotificationShowCondition.WHEN_SUBMITED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InstantJob.NotificationShowCondition.WHEN_STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InstantJob.NotificationShowCondition.WHEN_UI_INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InstantJob.NotificationShowCondition.WHEN_APP_SUSPENDING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AppState.values().length];
            try {
                iArr2[AppState.FOREGROUND_UI.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[AppState.FOREGROUND_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[AppState.BACKGROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[AppState.SUSPENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[AppState.IDLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public r7x(Context context, r93 r93Var, ExecutorService executorService, pla plaVar, Object obj) {
        this.a = context;
        this.b = r93Var;
        this.c = executorService;
        this.d = plaVar;
        this.e = obj;
        b bVar = new b();
        this.i = bVar;
        this.j = new CopyOnWriteArrayList<>();
        r93Var.b(bVar);
    }

    public final NotificationCompat.h a(String str, InstantJob instantJob, Map<InstantJob, ? extends InstantJob.a> map) {
        NotificationCompat.h hVar = new NotificationCompat.h(this.a, str);
        hVar.k("InstantJobs");
        hVar.j("Sync");
        hVar.z(R.drawable.vk_icon_bug_24);
        hVar.h(Color.parseColor("#5181b8"));
        instantJob.C(this.e, map, hVar);
        return hVar;
    }

    public final String b(InstantJob instantJob) {
        Object obj = this.e;
        String k = instantJob.k(obj);
        if (k == null || drm0.N(k)) {
            throw new IllegalStateException("No channelId for job '" + instantJob.getClass() + '\'');
        }
        bpn0 bpn0Var = this.h;
        if (((NotificationManager) bpn0Var.getValue()).getNotificationChannel(k) != null) {
            return k;
        }
        instantJob.h(obj);
        if (((NotificationManager) bpn0Var.getValue()).getNotificationChannel(k) != null) {
            return k;
        }
        throw new IllegalStateException(air.b('\'', "Channel is not created: '", k));
    }

    public final ArrayList c(izs izsVar, izs izsVar2) {
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList<a> copyOnWriteArrayList = this.j;
        Iterator<a> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (((Boolean) izsVar.invoke(next)).booleanValue()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add((a) izsVar2.invoke((a) it2.next()));
        }
        copyOnWriteArrayList.removeAll(arrayList);
        copyOnWriteArrayList.addAll(arrayList2);
        return arrayList2;
    }

    public final void d() {
        if (this.k) {
            throw new IllegalStateException("Instance is released");
        }
    }

    public final boolean e(w6x w6xVar) {
        CopyOnWriteArrayList<a> copyOnWriteArrayList = this.j;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (epx.f(((a) it.next()).b(), w6xVar)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(int i) {
        CopyOnWriteArrayList<a> copyOnWriteArrayList = this.j;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator<a> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.c() && next.b().d().l(this.e) == i) {
                return true;
            }
        }
        return false;
    }

    public final void g() {
        Object obj;
        if (j()) {
            ArrayList arrayList = new ArrayList();
            Iterator<a> it = this.j.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                obj = this.e;
                if (!hasNext) {
                    break;
                }
                a next = it.next();
                a aVar = next;
                if (aVar.c() && aVar.b().d().z(obj)) {
                    arrayList.add(next);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                String n = ((a) next2).b().d().n(obj);
                Object obj2 = linkedHashMap.get(n);
                if (obj2 == null) {
                    obj2 = s5a.a(n, linkedHashMap);
                }
                ((List) obj2).add(next2);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                InstantJob d = ((a) j5g.Y((List) entry.getValue())).b().d();
                int m = d.m(obj);
                NotificationCompat.h hVar = new NotificationCompat.h(this.a, b(d));
                hVar.k("InstantJobs");
                hVar.j("Sync");
                hVar.z(R.drawable.vk_icon_bug_24);
                hVar.o(d.n(obj));
                hVar.p();
                hVar.e(true);
                hVar.t();
                hVar.h(Color.parseColor("#5181b8"));
                d.D(obj, hVar);
                ((NotificationManager) this.h.getValue()).notify(m, hVar.c());
            }
        }
    }

    public final void h(int i) {
        Object obj;
        if (j()) {
            ArrayList arrayList = new ArrayList();
            Iterator<a> it = this.j.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                obj = this.e;
                if (!hasNext) {
                    break;
                }
                a next = it.next();
                a aVar = next;
                if (aVar.c() && aVar.b().d().l(obj) == i) {
                    arrayList.add(next);
                }
            }
            w6x b2 = ((a) j5g.Y(arrayList)).b();
            InstantJob d = b2.d();
            gt gtVar = new gt(25);
            zos zosVar = new zos(4);
            HashMap hashMap = new HashMap(arrayList.size());
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                hashMap.put(gtVar.invoke(next2), zosVar.invoke(next2));
            }
            String b3 = b(d);
            NotificationCompat.h a2 = a(b3, d, hashMap);
            a2.u();
            a2.e(false);
            a2.m();
            Context context = this.a;
            String string = context.getString(android.R.string.cancel);
            Intent intent = new Intent(context, (Class<?>) InstantJobCancelReceiver.class);
            intent.setAction("com.vk.instantjobs.receivers.ACTION_CANCEL");
            intent.putExtra("com.vk.instantjobs.receivers.EXTRA_JOB_ID", b2.b());
            intent.putExtra("com.vk.instantjobs.receivers.EXTRA_JOB_NOTIFY_ID", b2.d().l(obj));
            intent.putExtra("com.vk.instantjobs.receivers.EXTRA_INSTANCE_ID", b2.c());
            a2.b(new NotificationCompat.a.C0022a(android.R.drawable.ic_menu_close_clear_cancel, string, PendingIntent.getBroadcast(context, b2.b(), intent, 167772160)).b());
            Notification c2 = a2.c();
            if (epx.f(c2.getChannelId(), b3)) {
                Handler handler = com.vk.instantjobs.services.a.a;
                com.vk.instantjobs.services.a.a.post(new pn3(1, new yyx(context, i, c2, d.s())));
            } else {
                StringBuilder a3 = t33.a("Illegal notification channel: expected='", b3, "', given='");
                a3.append(c2.getChannelId());
                a3.append('\'');
                throw new IllegalStateException(a3.toString());
            }
        }
    }

    public final boolean i(InstantJob instantJob) {
        int i = c.$EnumSwitchMapping$0[instantJob.p().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return true;
            }
            if (i != 3) {
                r93 r93Var = this.b;
                if (i == 4) {
                    return !(r93Var.getState() == AppState.FOREGROUND_UI);
                }
                if (i == 5) {
                    return r93Var.getState() == AppState.SUSPENDING;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        r0 = r0.getIntent();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j() {
        List historicalProcessStartReasons;
        Intent intent;
        if (Build.VERSION.SDK_INT < 35) {
            return true;
        }
        historicalProcessStartReasons = ((ActivityManager) this.f.getValue()).getHistoricalProcessStartReasons(1);
        ApplicationStartInfo a2 = g7x.a(j5g.a0(historicalProcessStartReasons));
        String action = (a2 == null || intent == null) ? null : intent.getAction();
        return !epx.f(action, "android.intent.action.BOOT_COMPLETED");
    }

    public final void k(final gzs<s3q0> gzsVar) {
        this.c.submit(new Runnable() { // from class: xsna.q7x
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    gzs.this.invoke();
                } catch (Throwable th) {
                    this.d.d("Unexpected error during dispatch of InstantJob's notification", th);
                }
            }
        });
    }

    public final void l(boolean z, w6x w6xVar, int i, boolean z2) {
        if (z && w6xVar.d().B()) {
            m(i, w6xVar.d(), InstantJob.a.c.a);
        } else if (!z2 && w6xVar.d().A()) {
            m(i, w6xVar.d(), InstantJob.a.b.a);
        }
        g();
    }

    public final void m(int i, InstantJob instantJob, InstantJob.a aVar) {
        if (j()) {
            Map<InstantJob, ? extends InstantJob.a> f = on00.f(new Pair(instantJob, aVar));
            String b2 = b(instantJob);
            Notification c2 = a(b2, instantJob, f).c();
            if (epx.f(c2.getChannelId(), b2)) {
                ((NotificationManager) this.h.getValue()).notify(i, c2);
                return;
            }
            StringBuilder a2 = t33.a("Illegal notification channel: expected='", b2, "', given='");
            a2.append(c2.getChannelId());
            a2.append('\'');
            throw new IllegalStateException(a2.toString());
        }
    }

    public final void n(izs<? super a, Boolean> izsVar) {
        ArrayList c2 = c(new y87(izsVar, 3), new p7x(0));
        ArrayList arrayList = new ArrayList(c5g.u(c2, 10));
        Iterator it = c2.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((a) it.next()).b().d().l(this.e)));
        }
        Iterator it2 = j5g.S0(arrayList).iterator();
        while (it2.hasNext()) {
            h(((Number) it2.next()).intValue());
        }
        g();
    }
}
