package xsna;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import xsna.ihz;
import xsna.vnr;

/* compiled from: ListenerSet.java */
/* loaded from: classes12.dex */
public final class ihz<T> {

    @Nullable
    public final dvf a;
    public final Thread b;

    @Nullable
    public final otu c;

    @Nullable
    public final b<T> d;
    public final CopyOnWriteArraySet<c<T>> e;
    public final ArrayDeque<Runnable> f;
    public final ArrayDeque<Runnable> g;
    public final Object h;
    public boolean i;
    public boolean j;

    /* compiled from: ListenerSet.java */
    public interface a<T> {
        void invoke(T t);
    }

    /* compiled from: ListenerSet.java */
    public interface b<T> {
        void a(T t, vnr vnrVar);
    }

    /* compiled from: ListenerSet.java */
    public static final class c<T> {
        public final T a;
        public vnr.a b = new vnr.a();
        public boolean c;
        public boolean d;

        public c(T t) {
            this.a = t;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    public ihz(Looper looper) {
        this(looper.getThread());
    }

    public final void a(T t) {
        t.getClass();
        synchronized (this.h) {
            try {
                if (this.i) {
                    return;
                }
                this.e.add(new c<>(t));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        g();
        ArrayDeque<Runnable> arrayDeque = this.g;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (this.d != null) {
            otu otuVar = this.c;
            otuVar.getClass();
            if (!otuVar.e(1)) {
                otuVar.b(otuVar.obtainMessage(1));
            }
        }
        ArrayDeque<Runnable> arrayDeque2 = this.f;
        boolean isEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (isEmpty) {
            while (!arrayDeque2.isEmpty()) {
                arrayDeque2.peekFirst().run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void c(int i, a<T> aVar) {
        g();
        this.g.add(new hhz(new CopyOnWriteArraySet(this.e), i, aVar, 0));
    }

    public final void d() {
        g();
        synchronized (this.h) {
            this.i = true;
        }
        Iterator<c<T>> it = this.e.iterator();
        while (it.hasNext()) {
            c<T> next = it.next();
            b<T> bVar = this.d;
            next.d = true;
            if (bVar != null && next.c) {
                next.c = false;
                bVar.a(next.a, next.b.b());
            }
        }
        this.e.clear();
    }

    public final void e(T t) {
        g();
        CopyOnWriteArraySet<c<T>> copyOnWriteArraySet = this.e;
        Iterator<c<T>> it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            c<T> next = it.next();
            if (next.a.equals(t)) {
                next.d = true;
                b<T> bVar = this.d;
                if (bVar != null && next.c) {
                    next.c = false;
                    bVar.a(next.a, next.b.b());
                }
                copyOnWriteArraySet.remove(next);
            }
        }
    }

    public final void f(int i, a<T> aVar) {
        c(i, aVar);
        b();
    }

    public final void g() {
        if (this.j) {
            fxc0.z(Thread.currentThread() == this.b);
        }
    }

    public ihz(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    public ihz(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, @Nullable Looper looper, Thread thread, @Nullable dvf dvfVar, @Nullable b<T> bVar, boolean z) {
        this.a = dvfVar;
        this.b = thread;
        this.e = copyOnWriteArraySet;
        this.d = bVar;
        this.h = new Object();
        this.f = new ArrayDeque<>();
        this.g = new ArrayDeque<>();
        if (looper != null && dvfVar != null && bVar != null) {
            this.c = dvfVar.createHandler(looper, new Handler.Callback() { // from class: xsna.ghz
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    ihz ihzVar = ihz.this;
                    ihz.b<T> bVar2 = ihzVar.d;
                    bVar2.getClass();
                    Iterator it = ihzVar.e.iterator();
                    while (it.hasNext()) {
                        ihz.c cVar = (ihz.c) it.next();
                        if (!cVar.d && cVar.c) {
                            vnr b2 = cVar.b.b();
                            cVar.b = new vnr.a();
                            cVar.c = false;
                            bVar2.a(cVar.a, b2);
                        }
                        otu otuVar = ihzVar.c;
                        otuVar.getClass();
                        if (otuVar.e(1)) {
                            break;
                        }
                    }
                    return true;
                }
            });
        } else {
            this.c = null;
        }
        this.j = z;
    }
}
