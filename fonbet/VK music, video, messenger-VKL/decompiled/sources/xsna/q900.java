package xsna;

import android.os.SystemClock;
import com.facebook.common.memory.MemoryTrimType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import xsna.n220;
import xsna.qyj;
import xsna.sj2;

/* compiled from: LruCountingMemoryCache.java */
/* loaded from: classes.dex */
public final class q900<K, V> implements qyj<K, V>, n220<K, V> {
    public final qyj.b<K> b;
    public final pyj<K, qyj.a<K, V>> c;
    public final pyj<K, qyj.a<K, V>> d;
    public final qjr0<V> e;
    public final n220.a f;
    public final yhn0<o220> g;
    public o220 h;
    public long i;

    public q900(qjr0 qjr0Var, n220.a aVar, yhn0 yhn0Var, qyj.b bVar) {
        new WeakHashMap();
        this.e = qjr0Var;
        this.c = new pyj<>(new o900(this, qjr0Var));
        this.d = new pyj<>(new o900(this, qjr0Var));
        this.f = aVar;
        this.g = yhn0Var;
        o220 o220Var = (o220) yhn0Var.get();
        sex0.e(o220Var, "mMemoryCacheParamsSupplier returned null");
        this.h = o220Var;
        this.i = SystemClock.uptimeMillis();
        this.b = bVar;
    }

    public static void m(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                n((qyj.a) it.next());
            }
        }
    }

    public static <K, V> void n(qyj.a<K, V> aVar) {
        qyj.b<K> bVar;
        if (aVar == null || (bVar = aVar.e) == null) {
            return;
        }
        ((rj2) bVar).a(aVar.a, false);
    }

    @Override // xsna.n220
    public final synchronized boolean b(yzt yztVar) {
        return !this.d.b(yztVar).isEmpty();
    }

    @Override // xsna.n220
    public final uvf<V> c(K k, uvf<V> uvfVar) {
        return d(k, uvfVar, this.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (i() <= (r7.h.a - r4)) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.qyj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kcl d(Object obj, uvf uvfVar, qyj.b bVar) {
        qyj.a<K, V> e;
        boolean z;
        kcl kclVar;
        uvf<V> uvfVar2;
        obj.getClass();
        uvfVar.getClass();
        o();
        synchronized (this) {
            e = this.c.e(obj);
            qyj.a<K, V> e2 = this.d.e(obj);
            z = true;
            kclVar = null;
            if (e2 != null) {
                synchronized (this) {
                    sex0.f(!e2.d);
                    e2.d = true;
                    uvfVar2 = q(e2);
                }
                uvf.q(uvfVar2);
                n(e);
                l();
                return kclVar;
            }
            uvfVar2 = null;
            int a = this.e.a(uvfVar.r());
            synchronized (this) {
                if (a <= this.h.e) {
                    synchronized (this) {
                        int a2 = this.d.a() - this.c.a();
                        if (a2 <= this.h.b - 1) {
                        }
                    }
                }
                z = false;
            }
        }
        if (z) {
            qyj.a a3 = qyj.a.a(obj, uvfVar, bVar);
            this.d.d(obj, a3);
            kclVar = p(a3);
        }
        uvf.q(uvfVar2);
        n(e);
        l();
        return kclVar;
    }

    @Override // xsna.qyj
    public final uvf e(ww8 ww8Var) {
        qyj.a<K, V> e;
        boolean z;
        uvf<V> uvfVar;
        synchronized (this) {
            try {
                e = this.c.e(ww8Var);
                if (e != null) {
                    qyj.a<K, V> e2 = this.d.e(ww8Var);
                    e2.getClass();
                    sex0.f(e2.c == 0);
                    uvfVar = e2.b;
                    z = true;
                } else {
                    uvfVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            n(e);
        }
        return uvfVar;
    }

    @Override // xsna.n220
    public final int f(kxc0<K> kxc0Var) {
        ArrayList<qyj.a<K, V>> f;
        ArrayList<qyj.a<K, V>> f2;
        synchronized (this) {
            f = this.c.f(kxc0Var);
            f2 = this.d.f(kxc0Var);
            j(f2);
        }
        k(f2);
        m(f);
        o();
        l();
        return f2.size();
    }

    @Override // xsna.n220
    public final synchronized boolean g(sj2.a aVar) {
        boolean containsKey;
        pyj<K, qyj.a<K, V>> pyjVar = this.d;
        synchronized (pyjVar) {
            containsKey = pyjVar.b.containsKey(aVar);
        }
        return containsKey;
    }

    @Override // xsna.n220
    public final uvf<V> get(K k) {
        qyj.a<K, V> e;
        qyj.a<K, V> aVar;
        kcl p;
        k.getClass();
        synchronized (this) {
            try {
                e = this.c.e(k);
                pyj<K, qyj.a<K, V>> pyjVar = this.d;
                synchronized (pyjVar) {
                    aVar = pyjVar.b.get(k);
                }
                qyj.a<K, V> aVar2 = aVar;
                p = aVar2 != null ? p(aVar2) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        n(e);
        o();
        l();
        return p;
    }

    @Override // xsna.f320
    public final void h(MemoryTrimType memoryTrimType) {
        ArrayList<qyj.a<K, V>> r;
        double a = this.f.a(memoryTrimType);
        synchronized (this) {
            r = r(Integer.MAX_VALUE, Math.max(0, ((int) ((1.0d - a) * this.d.c())) - i()));
            j(r);
        }
        k(r);
        m(r);
        o();
        l();
    }

    public final synchronized int i() {
        return this.d.c() - this.c.c();
    }

    public final synchronized void j(ArrayList<qyj.a<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<qyj.a<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                qyj.a<K, V> next = it.next();
                synchronized (this) {
                    next.getClass();
                    sex0.f(!next.d);
                    next.d = true;
                }
            }
        }
    }

    public final void k(ArrayList<qyj.a<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<qyj.a<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                uvf.q(q(it.next()));
            }
        }
    }

    public final void l() {
        int i;
        int i2;
        int a;
        synchronized (this) {
            o220 o220Var = this.h;
            i = o220Var.d;
            i2 = o220Var.b;
            synchronized (this) {
                a = this.d.a() - this.c.a();
            }
            k(r0);
            m(r0);
        }
        int min = Math.min(i, i2 - a);
        o220 o220Var2 = this.h;
        ArrayList<qyj.a<K, V>> r = r(min, Math.min(o220Var2.c, o220Var2.a - i()));
        j(r);
        k(r);
        m(r);
    }

    public final synchronized void o() {
        if (this.i + this.h.f > SystemClock.uptimeMillis()) {
            return;
        }
        this.i = SystemClock.uptimeMillis();
        o220 o220Var = this.g.get();
        sex0.e(o220Var, "mMemoryCacheParamsSupplier returned null");
        this.h = o220Var;
    }

    public final synchronized kcl p(qyj.a aVar) {
        synchronized (this) {
            sex0.f(!aVar.d);
            aVar.c++;
        }
        return uvf.w(aVar.b.r(), new p900(this, aVar));
        return uvf.w(aVar.b.r(), new p900(this, aVar));
    }

    public final synchronized uvf<V> q(qyj.a<K, V> aVar) {
        aVar.getClass();
        return (aVar.d && aVar.c == 0) ? aVar.b : null;
    }

    public final synchronized ArrayList<qyj.a<K, V>> r(int i, int i2) {
        K next;
        int max = Math.max(i, 0);
        int max2 = Math.max(i2, 0);
        if (this.c.a() <= max && this.c.c() <= max2) {
            return null;
        }
        ArrayList<qyj.a<K, V>> arrayList = new ArrayList<>();
        while (true) {
            if (this.c.a() <= max && this.c.c() <= max2) {
                return arrayList;
            }
            pyj<K, qyj.a<K, V>> pyjVar = this.c;
            synchronized (pyjVar) {
                next = pyjVar.b.isEmpty() ? null : pyjVar.b.keySet().iterator().next();
            }
            if (next == null) {
                throw new IllegalStateException(String.format("key is null, but exclusiveEntries count: %d, size: %d", Integer.valueOf(this.c.a()), Integer.valueOf(this.c.c())));
            }
            this.c.e(next);
            arrayList.add(this.d.e(next));
        }
    }
}
