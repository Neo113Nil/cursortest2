package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableBufferTimed.java */
/* loaded from: classes8.dex */
public final class j<T, U extends Collection<? super T>> extends io.reactivex.rxjava3.internal.operators.observable.a<T, U> {
    public final long c;
    public final long d;
    public final TimeUnit e;
    public final io.reactivex.rxjava3.core.w f;
    public final io.reactivex.rxjava3.functions.n<U> g;
    public final int h;

    /* compiled from: ObservableBufferTimed.java */
    public static final class a<T, U extends Collection<? super T>> extends io.reactivex.rxjava3.internal.observers.i<T, U, U> implements Runnable, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.functions.n<U> g;
        public final long h;
        public final TimeUnit i;
        public final int j;
        public final w.c k;
        public U l;
        public io.reactivex.rxjava3.disposables.c m;
        public io.reactivex.rxjava3.disposables.c n;
        public long o;
        public long p;

        public a(io.reactivex.rxjava3.observers.e eVar, io.reactivex.rxjava3.functions.n nVar, long j, TimeUnit timeUnit, int i, w.c cVar) {
            super(eVar, new io.reactivex.rxjava3.internal.queue.a());
            this.g = nVar;
            this.h = j;
            this.i = timeUnit;
            this.j = i;
            this.k = cVar;
        }

        @Override // io.reactivex.rxjava3.internal.observers.i
        public final void a(io.reactivex.rxjava3.core.v vVar, Object obj) {
            vVar.onNext((Collection) obj);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            if (this.e) {
                return;
            }
            this.e = true;
            this.n.dispose();
            this.k.dispose();
            synchronized (this) {
                this.l = null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.e;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            U u;
            this.k.dispose();
            synchronized (this) {
                u = this.l;
                this.l = null;
            }
            if (u != null) {
                this.d.offer(u);
                this.f = true;
                if (b()) {
                    io.reactivex.rxjava3.internal.util.i.b(this.d, this.c, this, this);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            synchronized (this) {
                this.l = null;
            }
            this.c.onError(th);
            this.k.dispose();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            synchronized (this) {
                try {
                    U u = this.l;
                    if (u == null) {
                        return;
                    }
                    u.add(t);
                    if (u.size() < this.j) {
                        return;
                    }
                    this.l = null;
                    this.o++;
                    d(u, this);
                    try {
                        U u2 = this.g.get();
                        Objects.requireNonNull(u2, "The buffer supplied is null");
                        U u3 = u2;
                        synchronized (this) {
                            this.l = u3;
                            this.p++;
                        }
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.a.b(th);
                        this.c.onError(th);
                        dispose();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            io.reactivex.rxjava3.observers.e eVar = this.c;
            if (DisposableHelper.f(this.n, cVar)) {
                this.n = cVar;
                try {
                    U u = this.g.get();
                    Objects.requireNonNull(u, "The buffer supplied is null");
                    this.l = u;
                    eVar.onSubscribe(this);
                    long j = this.h;
                    this.m = this.k.c(this, j, j, this.i);
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    cVar.dispose();
                    EmptyDisposable.b(th, eVar);
                    this.k.dispose();
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                U u = this.g.get();
                Objects.requireNonNull(u, "The bufferSupplier returned a null buffer");
                U u2 = u;
                synchronized (this) {
                    U u3 = this.l;
                    if (u3 != null && this.o == this.p) {
                        this.l = u2;
                        d(u3, this);
                    }
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                dispose();
                this.c.onError(th);
            }
        }
    }

    /* compiled from: ObservableBufferTimed.java */
    public static final class b<T, U extends Collection<? super T>> extends io.reactivex.rxjava3.internal.observers.i<T, U, U> implements Runnable, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.functions.n<U> g;
        public final long h;
        public final TimeUnit i;
        public final io.reactivex.rxjava3.core.w j;
        public io.reactivex.rxjava3.disposables.c k;
        public U l;
        public final AtomicReference<io.reactivex.rxjava3.disposables.c> m;

        public b(io.reactivex.rxjava3.observers.e eVar, io.reactivex.rxjava3.functions.n nVar, long j, TimeUnit timeUnit, io.reactivex.rxjava3.core.w wVar) {
            super(eVar, new io.reactivex.rxjava3.internal.queue.a());
            this.m = new AtomicReference<>();
            this.g = nVar;
            this.h = j;
            this.i = timeUnit;
            this.j = wVar;
        }

        @Override // io.reactivex.rxjava3.internal.observers.i
        public final void a(io.reactivex.rxjava3.core.v vVar, Object obj) {
            this.c.onNext((Collection) obj);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            DisposableHelper.a(this.m);
            this.k.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.m.get() == DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            U u;
            synchronized (this) {
                u = this.l;
                this.l = null;
            }
            if (u != null) {
                this.d.offer(u);
                this.f = true;
                if (b()) {
                    io.reactivex.rxjava3.internal.util.i.b(this.d, this.c, null, this);
                }
            }
            DisposableHelper.a(this.m);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            synchronized (this) {
                this.l = null;
            }
            this.c.onError(th);
            DisposableHelper.a(this.m);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            synchronized (this) {
                try {
                    U u = this.l;
                    if (u == null) {
                        return;
                    }
                    u.add(t);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            io.reactivex.rxjava3.observers.e eVar = this.c;
            if (DisposableHelper.f(this.k, cVar)) {
                this.k = cVar;
                try {
                    U u = this.g.get();
                    Objects.requireNonNull(u, "The buffer supplied is null");
                    this.l = u;
                    eVar.onSubscribe(this);
                    AtomicReference<io.reactivex.rxjava3.disposables.c> atomicReference = this.m;
                    if (DisposableHelper.b(atomicReference.get())) {
                        return;
                    }
                    long j = this.h;
                    DisposableHelper.d(atomicReference, this.j.e(this, j, j, this.i));
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    dispose();
                    EmptyDisposable.b(th, eVar);
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            U u;
            try {
                U u2 = this.g.get();
                Objects.requireNonNull(u2, "The bufferSupplier returned a null buffer");
                U u3 = u2;
                synchronized (this) {
                    try {
                        u = this.l;
                        if (u != null) {
                            this.l = u3;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (u == null) {
                    DisposableHelper.a(this.m);
                } else {
                    c(u, this);
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                this.c.onError(th2);
                dispose();
            }
        }
    }

    /* compiled from: ObservableBufferTimed.java */
    public static final class c<T, U extends Collection<? super T>> extends io.reactivex.rxjava3.internal.observers.i<T, U, U> implements Runnable, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.functions.n<U> g;
        public final long h;
        public final long i;
        public final TimeUnit j;
        public final w.c k;
        public final LinkedList l;
        public io.reactivex.rxjava3.disposables.c m;

        /* compiled from: ObservableBufferTimed.java */
        public final class a implements Runnable {
            public final U b;

            public a(U u) {
                this.b = u;
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (c.this) {
                    c.this.l.remove(this.b);
                }
                c cVar = c.this;
                cVar.d(this.b, cVar.k);
            }
        }

        /* compiled from: ObservableBufferTimed.java */
        public final class b implements Runnable {
            public final U b;

            public b(U u) {
                this.b = u;
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (c.this) {
                    c.this.l.remove(this.b);
                }
                c cVar = c.this;
                cVar.d(this.b, cVar.k);
            }
        }

        public c(io.reactivex.rxjava3.observers.e eVar, io.reactivex.rxjava3.functions.n nVar, long j, long j2, TimeUnit timeUnit, w.c cVar) {
            super(eVar, new io.reactivex.rxjava3.internal.queue.a());
            this.g = nVar;
            this.h = j;
            this.i = j2;
            this.j = timeUnit;
            this.k = cVar;
            this.l = new LinkedList();
        }

        @Override // io.reactivex.rxjava3.internal.observers.i
        public final void a(io.reactivex.rxjava3.core.v vVar, Object obj) {
            vVar.onNext((Collection) obj);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            if (this.e) {
                return;
            }
            this.e = true;
            synchronized (this) {
                this.l.clear();
            }
            this.m.dispose();
            this.k.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.e;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.l);
                this.l.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.d.offer((Collection) it.next());
            }
            this.f = true;
            if (b()) {
                io.reactivex.rxjava3.internal.util.i.b(this.d, this.c, this.k, this);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            this.f = true;
            synchronized (this) {
                this.l.clear();
            }
            this.c.onError(th);
            this.k.dispose();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            synchronized (this) {
                try {
                    Iterator it = this.l.iterator();
                    while (it.hasNext()) {
                        ((Collection) it.next()).add(t);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            w.c cVar2 = this.k;
            io.reactivex.rxjava3.observers.e eVar = this.c;
            if (DisposableHelper.f(this.m, cVar)) {
                this.m = cVar;
                try {
                    U u = this.g.get();
                    Objects.requireNonNull(u, "The buffer supplied is null");
                    U u2 = u;
                    this.l.add(u2);
                    eVar.onSubscribe(this);
                    long j = this.i;
                    this.k.c(this, j, j, this.j);
                    cVar2.b(new b(u2), this.h, this.j);
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    cVar.dispose();
                    EmptyDisposable.b(th, eVar);
                    cVar2.dispose();
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.e) {
                return;
            }
            try {
                U u = this.g.get();
                Objects.requireNonNull(u, "The bufferSupplier returned a null buffer");
                U u2 = u;
                synchronized (this) {
                    try {
                        if (this.e) {
                            return;
                        }
                        this.l.add(u2);
                        this.k.b(new a(u2), this.h, this.j);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                this.c.onError(th2);
                dispose();
            }
        }
    }

    public j(io.reactivex.rxjava3.core.q qVar, long j, long j2, TimeUnit timeUnit, io.reactivex.rxjava3.core.w wVar, io.reactivex.rxjava3.functions.n nVar, int i) {
        super(qVar);
        this.c = j;
        this.d = j2;
        this.e = timeUnit;
        this.f = wVar;
        this.g = nVar;
        this.h = i;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super U> vVar) {
        long j = this.d;
        long j2 = this.c;
        io.reactivex.rxjava3.core.t<T> tVar = this.b;
        if (j2 == j && this.h == Integer.MAX_VALUE) {
            tVar.subscribe(new b(new io.reactivex.rxjava3.observers.e(vVar), this.g, j2, this.e, this.f));
            return;
        }
        w.c a2 = this.f.a();
        long j3 = this.c;
        long j4 = this.d;
        if (j3 != j4) {
            tVar.subscribe(new c(new io.reactivex.rxjava3.observers.e(vVar), this.g, j3, j4, this.e, a2));
            return;
        }
        tVar.subscribe(new a(new io.reactivex.rxjava3.observers.e(vVar), this.g, j3, this.e, this.h, a2));
    }
}
