package xsna;

import android.os.SystemClock;
import com.vk.instantjobs.InstantJob;
import com.vk.instantjobs.exceptions.JobException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.r6x;
import xsna.u6x;

/* compiled from: InstantJobExecutor.kt */
/* loaded from: classes.dex */
public final class u6x {
    public final sal a;
    public final p7i b;
    public final pla c;
    public final Object d;
    public final r6x.a e;
    public final HashMap<w6x, b> f = new HashMap<>();
    public final HashMap<String, Long> g = new HashMap<>();
    public final ArrayList h = new ArrayList();
    public boolean i;

    /* compiled from: InstantJobExecutor.kt */
    /* loaded from: classes2.dex */
    public final class a {
        public final w6x a;

        public a(w6x w6xVar) {
            this.a = w6xVar;
        }

        public final void a(int i, int i2) {
            u6x u6xVar = u6x.this;
            try {
                u6xVar.e.a(this.a, new InstantJob.a.e(i, i2));
            } catch (Throwable th) {
                u6xVar.c.d("unexpected error during invoke of Listener#onProgress", th);
            }
        }
    }

    /* compiled from: InstantJobExecutor.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        public final c a;
        public final CountDownLatch b;
        public final Future<?> c;
        public final Throwable d;
        public final String e;
        public final boolean f;
        public final Future<?> g;
        public final Future<?> h;
        public final CountDownLatch i;

        public b(c cVar, CountDownLatch countDownLatch, Future<?> future, Throwable th, String str, boolean z, Future<?> future2, Future<?> future3, CountDownLatch countDownLatch2) {
            this.a = cVar;
            this.b = countDownLatch;
            this.c = future;
            this.d = th;
            this.e = str;
            this.f = z;
            this.g = future2;
            this.h = future3;
            this.i = countDownLatch2;
        }

        public static b a(b bVar, c cVar, Throwable th, String str, boolean z, Future future, int i) {
            if ((i & 1) != 0) {
                cVar = bVar.a;
            }
            c cVar2 = cVar;
            CountDownLatch countDownLatch = bVar.b;
            Future<?> future2 = bVar.c;
            if ((i & 8) != 0) {
                th = bVar.d;
            }
            Throwable th2 = th;
            if ((i & 16) != 0) {
                str = bVar.e;
            }
            String str2 = str;
            if ((i & 32) != 0) {
                z = bVar.f;
            }
            boolean z2 = z;
            Future future3 = (i & 64) != 0 ? bVar.g : future;
            Future<?> future4 = bVar.h;
            CountDownLatch countDownLatch2 = bVar.i;
            bVar.getClass();
            return new b(cVar2, countDownLatch, future2, th2, str2, z2, future3, future4, countDownLatch2);
        }

        public final Future<?> b() {
            return this.h;
        }

        public final CountDownLatch c() {
            return this.i;
        }

        public final CountDownLatch d() {
            return this.b;
        }

        public final Future<?> e() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && this.f == bVar.f && epx.f(this.g, bVar.g) && epx.f(this.h, bVar.h) && epx.f(this.i, bVar.i);
        }

        public final int hashCode() {
            int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
            Throwable th = this.d;
            int hashCode2 = (hashCode + (th == null ? 0 : th.hashCode())) * 31;
            String str = this.e;
            int b = qoy.b((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
            Future<?> future = this.g;
            int hashCode3 = (b + (future == null ? 0 : future.hashCode())) * 31;
            Future<?> future2 = this.h;
            return this.i.hashCode() + ((hashCode3 + (future2 != null ? future2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "JobState(executeState=" + this.a + ", executeLatch=" + this.b + ", executeFuture=" + this.c + ", rejectReasonFailure=" + this.d + ", rejectReasonCancel=" + this.e + ", rejectReasonInterrupt=" + this.f + ", rejectFuture=" + this.g + ", cancelByTimeoutFuture=" + this.h + ", completeLatch=" + this.i + ')';
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InstantJobExecutor.kt */
    /* loaded from: classes2.dex */
    public static final class c {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c IDLE;
        public static final c REJECTED;
        public static final c RUNNING;
        public static final c SUCCESS;

        static {
            c cVar = new c("IDLE", 0);
            IDLE = cVar;
            c cVar2 = new c("RUNNING", 1);
            RUNNING = cVar2;
            c cVar3 = new c("REJECTED", 2);
            REJECTED = cVar3;
            c cVar4 = new c("SUCCESS", 3);
            SUCCESS = cVar4;
            c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
            $VALUES = cVarArr;
            $ENTRIES = new asp(cVarArr);
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    public u6x(sal salVar, p7i p7iVar, pla plaVar, Object obj, r6x.a aVar) {
        this.a = salVar;
        this.b = p7iVar;
        this.c = plaVar;
        this.d = obj;
        this.e = aVar;
    }

    public final void a(w6x w6xVar) {
        long j;
        InstantJob d = w6xVar.d();
        long i = d.i();
        synchronized (this) {
            InstantJob d2 = w6xVar.d();
            boolean z = d2.q().length() > 0;
            j = -1;
            if (z) {
                Long l = this.g.get(d2.q());
                if (l != null) {
                    j = l.longValue();
                }
            } else if (z) {
                throw new NoWhenBranchMatchedException();
            }
        }
        long max = Math.max(0L, (i + j) - SystemClock.uptimeMillis());
        if (d.i() <= 0 || j < 0 || max <= 0) {
            return;
        }
        h("start delay before job execution for " + max + " ms, job: " + d);
        this.b.getClass();
        if (max > 0) {
            Thread.sleep(max);
        }
    }

    public final synchronized HashSet b(String str, boolean z, izs izsVar) {
        HashSet hashSet;
        try {
            hashSet = new HashSet();
            HashMap<w6x, b> hashMap = this.f;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<w6x, b> entry : hashMap.entrySet()) {
                if (((Boolean) izsVar.invoke(entry.getKey().d())).booleanValue()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                w6x w6xVar = (w6x) ((Map.Entry) it.next()).getKey();
                b p = p(w6xVar, str, z);
                Collection<b> c2 = c(w6xVar, z);
                if (p != null) {
                    hashSet.add(p.c());
                }
                Iterator<T> it2 = c2.iterator();
                while (it2.hasNext()) {
                    hashSet.add(((b) it2.next()).c());
                }
            }
            if (hashSet.isEmpty()) {
                h("nothing to cancel by '" + str + '\'');
            }
        } catch (Throwable th) {
            throw th;
        }
        return hashSet;
    }

    public final synchronized Collection<b> c(w6x w6xVar, boolean z) {
        try {
            InstantJob d = w6xVar.d();
            if (!(d.q().length() > 0) || !d.y()) {
                return EmptyList.b;
            }
            InstantJob d2 = w6xVar.d();
            String q = w6xVar.d().q();
            Collection<w6x> f = f(w6xVar);
            if (!f.isEmpty()) {
                h("cancel all subsequent jobs on queue '" + q + "' after job: " + d2);
            }
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = f.iterator();
            while (it.hasNext()) {
                b p = p((w6x) it.next(), "cancel subsequent job", z);
                if (p != null) {
                    arrayList.add(p);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized b d(w6x w6xVar, izs<? super b, Boolean> izsVar, izs<? super b, b> izsVar2) {
        b bVar;
        bVar = this.f.get(w6xVar);
        if (bVar != null && izsVar.invoke(bVar).booleanValue()) {
            bVar = izsVar2.invoke(bVar);
            this.f.put(w6xVar, bVar);
        }
        return bVar;
    }

    public final synchronized void e() {
        if (this.i) {
            throw new IllegalStateException("instance is released");
        }
    }

    public final synchronized Collection<w6x> f(w6x w6xVar) {
        LinkedHashMap linkedHashMap;
        try {
            HashMap<w6x, b> hashMap = this.f;
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry<w6x, b> entry : hashMap.entrySet()) {
                w6x key = entry.getKey();
                boolean f = epx.f(key, w6xVar);
                boolean z = key.d().q().length() > 0;
                boolean f2 = epx.f(key.d().q(), w6xVar.d().q());
                boolean z2 = key.d().r() + key.e() > w6xVar.d().r() + w6xVar.e();
                if (!f && z && f2 && z2) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return linkedHashMap.keySet();
    }

    public final synchronized HashSet g(String str, izs izsVar) {
        HashSet hashSet;
        try {
            hashSet = new HashSet();
            HashMap<w6x, b> hashMap = this.f;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<w6x, b> entry : hashMap.entrySet()) {
                if (((Boolean) izsVar.invoke(entry.getKey().d())).booleanValue()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                w6x w6xVar = (w6x) ((Map.Entry) it.next()).getKey();
                b p = p(w6xVar, str, false);
                Collection<b> c2 = c(w6xVar, false);
                if (p != null) {
                    hashSet.add(p.d());
                }
                Iterator<T> it2 = c2.iterator();
                while (it2.hasNext()) {
                    hashSet.add(((b) it2.next()).d());
                }
            }
            if (hashSet.isEmpty()) {
                h("nothing to cancel by '" + str + '\'');
            }
        } catch (Throwable th) {
            throw th;
        }
        return hashSet;
    }

    public final void h(String str) {
        this.c.a(str);
    }

    public final synchronized void i(w6x w6xVar, c cVar) {
        dhh dhhVar = new dhh(cVar, 26);
        synchronized (this) {
            try {
                synchronized (this) {
                    b bVar = this.f.get(w6xVar);
                    if (bVar != null) {
                        this.f.put(w6xVar, (b) dhhVar.invoke(bVar));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|0|(2:8|(1:10))(1:23)|11|12|(1:16)|17|18) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0021, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0022, code lost:
    
        r3.c.d("unexpected error during invoke of Listener#onStart", r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void j(w6x w6xVar, InstantJob.a aVar) {
        b remove;
        CountDownLatch c2;
        synchronized (this) {
            remove = this.f.remove(w6xVar);
        }
        if (remove != null) {
            Future<?> b2 = remove.b();
            if (b2 != null) {
                b2.cancel(true);
            }
        } else {
            remove = null;
        }
        this.e.a(w6xVar, aVar);
        if (remove != null && (c2 = remove.c()) != null) {
            c2.countDown();
        }
    }

    public final void k(w6x w6xVar, String str, gzs<s3q0> gzsVar) {
        InstantJob d = w6xVar.d();
        try {
            h("execute #" + str + " for '" + d + "' on '" + Thread.currentThread().getName() + "' thread");
            long currentTimeMillis = System.currentTimeMillis();
            gzsVar.invoke();
            h("succeed #" + str + " for '" + d + "' (" + (System.currentTimeMillis() - currentTimeMillis) + " ms)");
        } catch (InterruptedException e) {
            h("interrupted #" + str + " for '" + d + '\'');
            throw e;
        } catch (Throwable th) {
            m63.k(th, w6xVar.a());
            this.c.b("failed #" + str + " for '" + d + '\'', th);
            throw th;
        }
    }

    public final synchronized void l(w6x w6xVar) {
        InstantJob d = w6xVar.d();
        if (d.q().length() > 0) {
            this.g.put(d.q(), Long.valueOf(SystemClock.uptimeMillis()));
        }
    }

    public final synchronized Future<?> m(w6x w6xVar) {
        sal salVar;
        kgb kgbVar;
        long j;
        salVar = this.a;
        kgbVar = new kgb(5, this, w6xVar);
        if (!(w6xVar.d().j() >= 0)) {
            throw new IllegalStateException("Job has no execution timeout");
        }
        j = w6xVar.d().j() + w6xVar.d().r() + w6xVar.e();
        xuo0.a.getClass();
        return salVar.a(kgbVar, "", Math.max(0L, j - xuo0.a()));
    }

    public final synchronized Future<?> n(w6x w6xVar) {
        return this.a.a(new i6k(1, this, w6xVar), "", 0L);
    }

    public final synchronized CountDownLatch o(w6x w6xVar) {
        b q;
        try {
            e();
            synchronized (this) {
            }
            return q.c();
        } catch (Throwable th) {
            throw th;
        }
        if (this.f.containsKey(w6xVar)) {
            throw new JobException("trying to submit already submitted job!");
        }
        xuo0.a.getClass();
        long a2 = xuo0.a();
        if (w6xVar.d().j() >= 0) {
            if (w6xVar.d().j() + w6xVar.d().r() + w6xVar.e() <= a2) {
                q = q(w6xVar);
                return q.c();
            }
        }
        q = r(w6xVar);
        return q.c();
    }

    public final synchronized b p(final w6x w6xVar, final String str, final boolean z) {
        return d(w6xVar, new s6x(0), new izs() { // from class: xsna.t6x
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                u6x.b bVar = (u6x.b) obj;
                String str2 = str;
                StringBuilder a2 = t33.a("cancel scheduled by '", str2, "' for job '");
                w6x w6xVar2 = w6xVar;
                a2.append(w6xVar2.e);
                a2.append('\'');
                String sb = a2.toString();
                u6x u6xVar = u6x.this;
                u6xVar.h(sb);
                boolean z2 = bVar.a == u6x.c.IDLE;
                bVar.c.cancel(true);
                Future<?> future = bVar.h;
                if (future != null) {
                    future.cancel(true);
                }
                if (z2) {
                    bVar.b.countDown();
                }
                return u6x.b.a(bVar, z2 ? u6x.c.REJECTED : bVar.a, null, str2, z, u6xVar.n(w6xVar2), 398);
            }
        });
    }

    public final synchronized b q(w6x w6xVar) {
        b bVar;
        c cVar = c.REJECTED;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        countDownLatch.countDown();
        bVar = new b(cVar, countDownLatch, CompletableFuture.completedFuture(s3q0.a), null, "already expired", false, n(w6xVar), null, new CountDownLatch(1));
        this.f.put(w6xVar, bVar);
        return bVar;
    }

    public final synchronized b r(w6x w6xVar) {
        c cVar;
        CountDownLatch countDownLatch;
        sal salVar;
        a0m a0mVar;
        String q;
        long r;
        try {
            cVar = c.IDLE;
            countDownLatch = new CountDownLatch(1);
            synchronized (this) {
                InstantJob d = w6xVar.d();
                salVar = this.a;
                a0mVar = new a0m(1, this, w6xVar);
                q = d.q();
                r = w6xVar.d().r() + w6xVar.e();
                xuo0.a.getClass();
            }
            return r0;
        } catch (Throwable th) {
            throw th;
        }
        b bVar = new b(cVar, countDownLatch, salVar.a(a0mVar, q, Math.max(0L, r - xuo0.a())), null, null, false, null, (w6xVar.d().j() > 0L ? 1 : (w6xVar.d().j() == 0L ? 0 : -1)) >= 0 ? m(w6xVar) : null, new CountDownLatch(1));
        this.f.put(w6xVar, bVar);
        return bVar;
    }
}
