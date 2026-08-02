package xsna;

import com.facebook.common.statfs.StatFsHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import xsna.tbn;

/* compiled from: DiskStorageCache.java */
/* loaded from: classes2.dex */
public class vbn implements y7r {
    public static final long n = TimeUnit.HOURS.toMillis(2);
    public static final long o = TimeUnit.MINUTES.toMillis(30);
    public final long a;
    public final long b;
    public long c;
    public final rw8 d;
    public final HashSet e;
    public long f;
    public final StatFsHelper g;
    public final tbn h;
    public final u370 i;
    public final e370 j;
    public final a k;
    public final l2l0 l;
    public final Object m = new Object();

    /* compiled from: DiskStorageCache.java */
    public static class a {
        public boolean a;
        public long b;
        public long c;

        public final synchronized long a() {
            return this.b;
        }

        public final synchronized void b(long j, long j2) {
            if (this.a) {
                this.b += j;
                this.c += j2;
            }
        }
    }

    /* compiled from: DiskStorageCache.java */
    public static class b {
        public final long a;
        public final long b;

        public b(long j, long j2, long j3) {
            this.a = j2;
            this.b = j3;
        }
    }

    public vbn(tbn tbnVar, u370 u370Var, b bVar, rw8 rw8Var, e370 e370Var, Executor executor) {
        this.a = bVar.a;
        long j = bVar.b;
        this.b = j;
        this.c = j;
        this.g = StatFsHelper.b();
        this.h = tbnVar;
        this.i = u370Var;
        this.f = -1L;
        this.d = rw8Var;
        this.j = e370Var;
        a aVar = new a();
        aVar.a = false;
        aVar.b = -1L;
        aVar.c = -1L;
        this.k = aVar;
        this.l = l2l0.c;
        this.e = new HashSet();
        new CountDownLatch(0);
    }

    @Override // xsna.y7r
    public final boolean a(ww8 ww8Var) {
        synchronized (this.m) {
            try {
                List<String> h = h(ww8Var);
                for (int i = 0; i < h.size(); i++) {
                    if (this.e.contains(h.get(i))) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.y7r
    public final void b() {
        synchronized (this.m) {
            try {
                this.h.b();
                this.e.clear();
                this.d.getClass();
                m();
            } catch (IOException | NullPointerException e) {
                e370 e370Var = this.j;
                e.getMessage();
                e370Var.getClass();
            }
            a aVar = this.k;
            synchronized (aVar) {
                aVar.a = false;
                aVar.c = -1L;
                aVar.b = -1L;
            }
        }
    }

    @Override // xsna.y7r
    public final boolean c(ww8 ww8Var) {
        synchronized (this.m) {
            if (a(ww8Var)) {
                return true;
            }
            try {
                List<String> h = h(ww8Var);
                for (int i = 0; i < h.size(); i++) {
                    String str = h.get(i);
                    if (this.h.g(ww8Var, str)) {
                        this.e.add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // xsna.y7r
    public final void d(ww8 ww8Var) {
        synchronized (this.m) {
            try {
                ArrayList y = d370.y(ww8Var);
                for (int i = 0; i < y.size(); i++) {
                    String str = (String) y.get(i);
                    this.h.remove(str);
                    this.e.remove(str);
                    k(str);
                }
            } catch (IOException e) {
                e370 e370Var = this.j;
                e.getMessage();
                e370Var.getClass();
            }
        }
    }

    @Override // xsna.y7r
    public final t27 e(ww8 ww8Var) {
        t27 t27Var;
        jzi0 d = jzi0.d();
        d.a = ww8Var;
        try {
            synchronized (this.m) {
                try {
                    List<String> h = h(ww8Var);
                    String str = null;
                    t27Var = null;
                    for (int i = 0; i < h.size() && (t27Var = this.h.d(ww8Var, (str = h.get(i)))) == null; i++) {
                    }
                    if (t27Var == null) {
                        this.d.h(d);
                        this.e.remove(str);
                    } else {
                        this.d.a(d);
                        this.e.add(str);
                    }
                } finally {
                }
            }
            return t27Var;
        } catch (IOException unused) {
            this.j.getClass();
            this.d.c(d);
            return null;
        } finally {
            d.e();
        }
    }

    @Override // xsna.y7r
    public final t27 f(ww8 ww8Var, xm8 xm8Var) throws IOException {
        String x;
        t27 commit;
        jzi0 d = jzi0.d();
        d.a = ww8Var;
        this.d.g(d);
        synchronized (this.m) {
            x = d370.x(ww8Var);
        }
        try {
            try {
                tbn.b n2 = n(x, ww8Var);
                try {
                    n2.H(xm8Var);
                    synchronized (this.m) {
                        commit = n2.commit();
                        l(x, ww8Var);
                        this.e.add(x);
                        this.k.b(commit.size(), 1L);
                    }
                    commit.size();
                    this.k.a();
                    this.d.e(d);
                    return commit;
                } finally {
                    if (!n2.G()) {
                        ahq.a(vbn.class, "Failed to delete temp file");
                    }
                }
            } finally {
                d.e();
            }
        } catch (IOException e) {
            this.d.f(d);
            ahq.b(vbn.class, "Failed inserting a file into the cache", e);
            throw e;
        }
    }

    public final void g(long j) throws IOException {
        tbn tbnVar = this.h;
        try {
            ArrayList i = i(tbnVar.c());
            a aVar = this.k;
            long a2 = aVar.a() - j;
            Iterator it = i.iterator();
            int i2 = 0;
            long j2 = 0;
            while (it.hasNext()) {
                tbn.a aVar2 = (tbn.a) it.next();
                if (j2 > a2) {
                    break;
                }
                long e = tbnVar.e(aVar2);
                this.e.remove(aVar2.getId());
                k(aVar2.getId());
                if (e > 0) {
                    i2++;
                    j2 += e;
                    jzi0 d = jzi0.d();
                    this.d.d(d);
                    d.e();
                }
            }
            aVar.b(-j2, -i2);
            tbnVar.f();
        } catch (IOException e2) {
            e2.getMessage();
            this.j.getClass();
            throw e2;
        }
    }

    public List<String> h(ww8 ww8Var) {
        return d370.y(ww8Var);
    }

    public final ArrayList i(Collection collection) {
        this.l.getClass();
        long currentTimeMillis = System.currentTimeMillis() + n;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            tbn.a aVar = (tbn.a) it.next();
            if (aVar.getTimestamp() > currentTimeMillis) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        Collections.sort(arrayList2, this.i.a());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public final boolean j() {
        boolean z;
        long j;
        boolean z2;
        this.l.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        a aVar = this.k;
        synchronized (aVar) {
            z = aVar.a;
        }
        long j2 = -1;
        if (z) {
            long j3 = this.f;
            if (j3 != -1 && currentTimeMillis - j3 <= o) {
                return false;
            }
        }
        this.l.getClass();
        long currentTimeMillis2 = System.currentTimeMillis();
        long j4 = n + currentTimeMillis2;
        try {
            long j5 = 0;
            boolean z3 = false;
            int i = 0;
            for (tbn.a aVar2 : this.h.c()) {
                i++;
                j5 += aVar2.getSize();
                if (aVar2.getTimestamp() > j4) {
                    aVar2.getSize();
                    j2 = Math.max(aVar2.getTimestamp() - currentTimeMillis2, j2);
                    z3 = true;
                }
            }
            if (z3) {
                this.j.getClass();
            }
            a aVar3 = this.k;
            synchronized (aVar3) {
                j = aVar3.c;
            }
            long j6 = i;
            if (j == j6 && this.k.a() == j5) {
                z2 = true;
                this.f = currentTimeMillis2;
                return z2;
            }
            a aVar4 = this.k;
            synchronized (aVar4) {
                aVar4.c = j6;
                aVar4.b = j5;
                z2 = true;
                aVar4.a = true;
            }
            this.f = currentTimeMillis2;
            return z2;
        } catch (IOException e) {
            e370 e370Var = this.j;
            e.getMessage();
            e370Var.getClass();
            return false;
        }
    }

    public final tbn.b n(String str, ww8 ww8Var) throws IOException {
        synchronized (this.m) {
            boolean j = j();
            long j2 = this.b;
            if (this.g.c(this.h.isExternal() ? StatFsHelper.StorageType.EXTERNAL : StatFsHelper.StorageType.INTERNAL, j2 - this.k.a())) {
                this.c = this.a;
            } else {
                this.c = j2;
            }
            long a2 = this.k.a();
            if (a2 > this.c && !j) {
                a aVar = this.k;
                synchronized (aVar) {
                    aVar.a = false;
                    aVar.c = -1L;
                    aVar.b = -1L;
                }
                j();
            }
            long j3 = this.c;
            if (a2 > j3) {
                g((j3 * 9) / 10);
            }
        }
        return this.h.h(ww8Var, str);
    }

    public void m() {
    }

    public void k(String str) {
    }

    public void l(String str, ww8 ww8Var) {
    }
}
