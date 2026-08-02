package xsna;

import android.util.Pair;
import com.facebook.common.util.TriState;
import com.facebook.imagepipeline.common.Priority;
import com.unity3d.services.UnityAdsConstants;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: MultiplexProducer.java */
/* loaded from: classes12.dex */
public abstract class i840<K, T extends Closeable> implements thd0<T> {
    public final HashMap a = new HashMap();
    public final thd0<T> b;
    public final String c;
    public final String d;

    /* compiled from: MultiplexProducer.java */
    public class a {
        public final K a;
        public final CopyOnWriteArraySet<Pair<l7j<T>, uhd0>> b = new CopyOnWriteArraySet<>();
        public T c;
        public float d;
        public int e;
        public tk6 f;
        public i840<K, T>.a.C3035a g;

        /* compiled from: MultiplexProducer.java */
        /* renamed from: xsna.i840$a$a, reason: collision with other inner class name */
        public class C3035a extends ac6<T> {
            public C3035a() {
            }

            @Override // xsna.ac6
            public final void f() {
                try {
                    if (lhs.d()) {
                        lhs.a("MultiplexProducer#onCancellation");
                    }
                    a aVar = a.this;
                    synchronized (aVar) {
                        try {
                            if (aVar.g == this) {
                                aVar.g = null;
                                aVar.f = null;
                                a.b(aVar.c);
                                aVar.c = null;
                                aVar.i(TriState.UNSET);
                            }
                        } finally {
                        }
                    }
                } finally {
                    if (lhs.d()) {
                        lhs.b();
                    }
                }
            }

            @Override // xsna.ac6
            public final void g(Throwable th) {
                try {
                    if (lhs.d()) {
                        lhs.a("MultiplexProducer#onFailure");
                    }
                    a.this.f(this, th);
                    if (lhs.d()) {
                        lhs.b();
                    }
                } catch (Throwable th2) {
                    if (lhs.d()) {
                        lhs.b();
                    }
                    throw th2;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.ac6
            public final void h(int i, Object obj) {
                Closeable closeable = (Closeable) obj;
                try {
                    if (lhs.d()) {
                        lhs.a("MultiplexProducer#onNewResult");
                    }
                    a.this.g(this, closeable, i);
                    if (lhs.d()) {
                        lhs.b();
                    }
                } catch (Throwable th) {
                    if (lhs.d()) {
                        lhs.b();
                    }
                    throw th;
                }
            }

            @Override // xsna.ac6
            public final void i(float f) {
                try {
                    if (lhs.d()) {
                        lhs.a("MultiplexProducer#onProgressUpdate");
                    }
                    a.this.h(this, f);
                    if (lhs.d()) {
                        lhs.b();
                    }
                } catch (Throwable th) {
                    if (lhs.d()) {
                        lhs.b();
                    }
                    throw th;
                }
            }
        }

        public a(K k) {
            this.a = k;
        }

        public static void b(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean a(l7j<T> l7jVar, uhd0 uhd0Var) {
            a aVar;
            Pair<l7j<T>, uhd0> create = Pair.create(l7jVar, uhd0Var);
            synchronized (this) {
                try {
                    i840 i840Var = i840.this;
                    K k = this.a;
                    synchronized (i840Var) {
                        aVar = (a) i840Var.a.get(k);
                    }
                    if (aVar != this) {
                        return false;
                    }
                    this.b.add(create);
                    ArrayList k2 = k();
                    ArrayList l = l();
                    ArrayList j = j();
                    Closeable closeable = this.c;
                    float f = this.d;
                    int i = this.e;
                    tk6.d(k2);
                    tk6.e(l);
                    tk6.a(j);
                    synchronized (create) {
                        try {
                            synchronized (this) {
                                if (closeable != this.c) {
                                    closeable = null;
                                } else if (closeable != null) {
                                    closeable = i840.this.c(closeable);
                                }
                            }
                            if (closeable != null) {
                                if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    l7jVar.c(f);
                                }
                                l7jVar.b(i, closeable);
                                b(closeable);
                            }
                        } catch (Throwable th) {
                            throw th;
                        } finally {
                        }
                    }
                    uhd0Var.p(new h840(this, create));
                    return true;
                } finally {
                }
            }
        }

        public final synchronized boolean c() {
            Iterator<Pair<l7j<T>, uhd0>> it = this.b.iterator();
            while (it.hasNext()) {
                if (((uhd0) it.next().second).o()) {
                    return true;
                }
            }
            return false;
        }

        public final synchronized boolean d() {
            Iterator<Pair<l7j<T>, uhd0>> it = this.b.iterator();
            while (it.hasNext()) {
                if (!((uhd0) it.next().second).v()) {
                    return false;
                }
            }
            return true;
        }

        public final synchronized Priority e() {
            Priority priority;
            priority = Priority.LOW;
            Iterator<Pair<l7j<T>, uhd0>> it = this.b.iterator();
            while (it.hasNext()) {
                Priority priority2 = ((uhd0) it.next().second).getPriority();
                Priority.Companion.getClass();
                if (priority.ordinal() <= priority2.ordinal()) {
                    priority = priority2;
                }
            }
            return priority;
        }

        public final void f(i840<K, T>.a.C3035a c3035a, Throwable th) {
            synchronized (this) {
                try {
                    if (this.g != c3035a) {
                        return;
                    }
                    Iterator<Pair<l7j<T>, uhd0>> it = this.b.iterator();
                    this.b.clear();
                    i840.this.e(this.a, this);
                    b(this.c);
                    this.c = null;
                    while (it.hasNext()) {
                        Pair<l7j<T>, uhd0> next = it.next();
                        synchronized (next) {
                            try {
                                ((uhd0) next.second).q().b((uhd0) next.second, i840.this.c, th, null);
                                tk6 tk6Var = this.f;
                                if (tk6Var != null) {
                                    ((uhd0) next.second).b(tk6Var.g);
                                }
                                ((l7j) next.first).onFailure(th);
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public final void g(i840<K, T>.a.C3035a c3035a, T t, int i) {
            synchronized (this) {
                try {
                    if (this.g != c3035a) {
                        return;
                    }
                    b(this.c);
                    this.c = null;
                    Iterator<Pair<l7j<T>, uhd0>> it = this.b.iterator();
                    int size = this.b.size();
                    if (ac6.e(i)) {
                        this.c = (T) i840.this.c(t);
                        this.e = i;
                    } else {
                        this.b.clear();
                        i840.this.e(this.a, this);
                    }
                    while (it.hasNext()) {
                        Pair<l7j<T>, uhd0> next = it.next();
                        synchronized (next) {
                            try {
                                if (ac6.d(i)) {
                                    ((uhd0) next.second).q().f((uhd0) next.second, i840.this.c, null);
                                    tk6 tk6Var = this.f;
                                    if (tk6Var != null) {
                                        ((uhd0) next.second).b(tk6Var.g);
                                    }
                                    ((uhd0) next.second).h(Integer.valueOf(size), i840.this.d);
                                }
                                ((l7j) next.first).b(i, t);
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public final void h(i840<K, T>.a.C3035a c3035a, float f) {
            synchronized (this) {
                try {
                    if (this.g != c3035a) {
                        return;
                    }
                    this.d = f;
                    Iterator<Pair<l7j<T>, uhd0>> it = this.b.iterator();
                    while (it.hasNext()) {
                        Pair<l7j<T>, uhd0> next = it.next();
                        synchronized (next) {
                            ((l7j) next.first).c(f);
                        }
                    }
                } finally {
                }
            }
        }

        public final void i(TriState triState) {
            synchronized (this) {
                try {
                    if (!(this.f == null)) {
                        throw new IllegalArgumentException();
                    }
                    if (!(this.g == null)) {
                        throw new IllegalArgumentException();
                    }
                    if (this.b.isEmpty()) {
                        i840.this.e(this.a, this);
                        return;
                    }
                    uhd0 uhd0Var = (uhd0) this.b.iterator().next().second;
                    tk6 tk6Var = new tk6(uhd0Var.r(), uhd0Var.getId(), null, uhd0Var.q(), uhd0Var.m(), uhd0Var.w(), d(), c(), e(), uhd0Var.n());
                    this.f = tk6Var;
                    tk6Var.b(uhd0Var.getExtras());
                    triState.getClass();
                    if (triState != TriState.UNSET) {
                        this.f.h(Boolean.valueOf(triState.h()), "started_as_prefetch");
                    }
                    i840<K, T>.a.C3035a c3035a = new C3035a();
                    this.g = c3035a;
                    i840.this.b.b(c3035a, this.f);
                } finally {
                }
            }
        }

        public final synchronized ArrayList j() {
            tk6 tk6Var = this.f;
            ArrayList arrayList = null;
            if (tk6Var == null) {
                return null;
            }
            boolean c = c();
            synchronized (tk6Var) {
                if (c != tk6Var.j) {
                    tk6Var.j = c;
                    arrayList = new ArrayList(tk6Var.l);
                }
            }
            return arrayList;
        }

        public final synchronized ArrayList k() {
            tk6 tk6Var = this.f;
            ArrayList arrayList = null;
            if (tk6Var == null) {
                return null;
            }
            boolean d = d();
            synchronized (tk6Var) {
                if (d != tk6Var.h) {
                    tk6Var.h = d;
                    arrayList = new ArrayList(tk6Var.l);
                }
            }
            return arrayList;
        }

        public final synchronized ArrayList l() {
            ArrayList arrayList;
            tk6 tk6Var = this.f;
            if (tk6Var == null) {
                return null;
            }
            Priority e = e();
            synchronized (tk6Var) {
                if (e == tk6Var.i) {
                    arrayList = null;
                } else {
                    tk6Var.i = e;
                    arrayList = new ArrayList(tk6Var.l);
                }
            }
            return arrayList;
        }
    }

    public i840(thd0 thd0Var, String str, String str2) {
        this.b = thd0Var;
        this.c = str;
        this.d = str2;
    }

    @Override // xsna.thd0
    public final void b(l7j<T> l7jVar, uhd0 uhd0Var) {
        a aVar;
        boolean z;
        try {
            if (lhs.d()) {
                lhs.a("MultiplexProducer#produceResults");
            }
            uhd0Var.q().k(uhd0Var, this.c);
            Pair d = d(uhd0Var);
            do {
                synchronized (this) {
                    synchronized (this) {
                        aVar = (a) this.a.get(d);
                    }
                }
                if (aVar == null) {
                    synchronized (this) {
                        aVar = new a(d);
                        this.a.put(d, aVar);
                        z = true;
                    }
                } else {
                    z = false;
                }
            } while (!aVar.a(l7jVar, uhd0Var));
            if (z) {
                aVar.i(uhd0Var.v() ? TriState.YES : TriState.NO);
            }
            if (lhs.d()) {
                lhs.b();
            }
        } catch (Throwable th) {
            if (lhs.d()) {
                lhs.b();
            }
            throw th;
        }
    }

    public abstract T c(T t);

    public abstract Pair d(uhd0 uhd0Var);

    public final synchronized void e(K k, i840<K, T>.a aVar) {
        if (this.a.get(k) == aVar) {
            this.a.remove(k);
        }
    }
}
