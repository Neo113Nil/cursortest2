package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.v;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ReplaySubject.java */
/* loaded from: classes8.dex */
public final class g<T> extends j<T> {
    public static final c[] e = new c[0];
    public static final c[] f = new c[0];
    public static final Object[] g = new Object[0];
    public final AtomicReference b;
    public final AtomicReference<c<T>[]> c = new AtomicReference<>(e);
    public boolean d;

    /* compiled from: ReplaySubject.java */
    public static final class a<T> extends AtomicReference<a<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        final T value;

        public a(T t) {
            this.value = t;
        }
    }

    /* compiled from: ReplaySubject.java */
    public interface b<T> {
        void add(T t);

        boolean compareAndSet(Object obj, Object obj2);

        void d();

        void e(c<T> cVar);

        void f(Serializable serializable);

        Object get();

        T getValue();

        int size();
    }

    /* compiled from: ReplaySubject.java */
    public static final class c<T> extends AtomicInteger implements io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = 466549804534799122L;
        volatile boolean cancelled;
        final v<? super T> downstream;
        Object index;
        final g<T> state;

        public c(v<? super T> vVar, g<T> gVar) {
            this.downstream = vVar;
            this.state = gVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.state.P0(this);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.cancelled;
        }
    }

    /* compiled from: ReplaySubject.java */
    public static final class d<T> extends AtomicReference<Object> implements b<T> {
        private static final long serialVersionUID = -8056260896137901749L;
        volatile boolean done;
        volatile f<Object> head;
        final long maxAge;
        final int maxSize;
        final w scheduler;
        int size;
        f<Object> tail;
        final TimeUnit unit;

        public d(w wVar) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.maxSize = Integer.MAX_VALUE;
            this.maxAge = 3L;
            this.unit = timeUnit;
            this.scheduler = wVar;
            f<Object> fVar = new f<>(null, 0L);
            this.tail = fVar;
            this.head = fVar;
        }

        @Override // io.reactivex.rxjava3.subjects.g.b
        public final void add(T t) {
            w wVar = this.scheduler;
            TimeUnit timeUnit = this.unit;
            wVar.getClass();
            f<Object> fVar = new f<>(t, w.b(timeUnit));
            f<Object> fVar2 = this.tail;
            this.tail = fVar;
            this.size++;
            fVar2.set(fVar);
            int i = this.size;
            if (i > this.maxSize) {
                this.size = i - 1;
                this.head = this.head.get();
            }
            w wVar2 = this.scheduler;
            TimeUnit timeUnit2 = this.unit;
            wVar2.getClass();
            long b = w.b(timeUnit2) - this.maxAge;
            f<Object> fVar3 = this.head;
            while (this.size > 1) {
                f<T> fVar4 = fVar3.get();
                if (fVar4.time > b) {
                    this.head = fVar3;
                    return;
                } else {
                    this.size--;
                    fVar3 = fVar4;
                }
            }
            this.head = fVar3;
        }

        @Override // io.reactivex.rxjava3.subjects.g.b
        public final void d() {
            f<Object> fVar = this.head;
            if (fVar.value != null) {
                f<Object> fVar2 = new f<>(null, 0L);
                fVar2.lazySet(fVar.get());
                this.head = fVar2;
            }
        }

        @Override // io.reactivex.rxjava3.subjects.g.b
        public final void e(c<T> cVar) {
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            v<? super T> vVar = cVar.downstream;
            f<Object> fVar = (f) cVar.index;
            if (fVar == null) {
                fVar = g();
            }
            int i = 1;
            while (!cVar.cancelled) {
                f<T> fVar2 = fVar.get();
                if (fVar2 == null) {
                    cVar.index = fVar;
                    i = cVar.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    T t = fVar2.value;
                    if (this.done && fVar2.get() == null) {
                        if (NotificationLite.d(t)) {
                            vVar.onComplete();
                        } else {
                            vVar.onError(NotificationLite.c(t));
                        }
                        cVar.index = null;
                        cVar.cancelled = true;
                        return;
                    }
                    vVar.onNext(t);
                    fVar = fVar2;
                }
            }
            cVar.index = null;
        }

        @Override // io.reactivex.rxjava3.subjects.g.b
        public final void f(Serializable serializable) {
            f<Object> fVar = new f<>(serializable, Long.MAX_VALUE);
            f<Object> fVar2 = this.tail;
            this.tail = fVar;
            this.size++;
            fVar2.lazySet(fVar);
            w wVar = this.scheduler;
            TimeUnit timeUnit = this.unit;
            wVar.getClass();
            long b = w.b(timeUnit) - this.maxAge;
            f<Object> fVar3 = this.head;
            while (true) {
                f<T> fVar4 = fVar3.get();
                if (fVar4.get() == null) {
                    if (fVar3.value != null) {
                        f<Object> fVar5 = new f<>(null, 0L);
                        fVar5.lazySet(fVar3.get());
                        this.head = fVar5;
                    } else {
                        this.head = fVar3;
                    }
                } else if (fVar4.time <= b) {
                    fVar3 = fVar4;
                } else if (fVar3.value != null) {
                    f<Object> fVar6 = new f<>(null, 0L);
                    fVar6.lazySet(fVar3.get());
                    this.head = fVar6;
                } else {
                    this.head = fVar3;
                }
            }
            this.done = true;
        }

        public final f<Object> g() {
            f<Object> fVar;
            f<Object> fVar2 = this.head;
            w wVar = this.scheduler;
            TimeUnit timeUnit = this.unit;
            wVar.getClass();
            long b = w.b(timeUnit) - this.maxAge;
            f<T> fVar3 = fVar2.get();
            while (true) {
                f<T> fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (fVar2 == null || fVar2.time > b) {
                    break;
                }
                fVar3 = fVar2.get();
            }
            return fVar;
        }

        @Override // io.reactivex.rxjava3.subjects.g.b
        public final T getValue() {
            T t;
            f<Object> fVar = this.head;
            f<Object> fVar2 = null;
            while (true) {
                f<T> fVar3 = fVar.get();
                if (fVar3 == null) {
                    break;
                }
                fVar2 = fVar;
                fVar = fVar3;
            }
            w wVar = this.scheduler;
            TimeUnit timeUnit = this.unit;
            wVar.getClass();
            if (fVar.time >= w.b(timeUnit) - this.maxAge && (t = (T) fVar.value) != null) {
                return (NotificationLite.d(t) || (t instanceof NotificationLite.b)) ? (T) fVar2.value : t;
            }
            return null;
        }

        @Override // io.reactivex.rxjava3.subjects.g.b
        public final int size() {
            f<Object> g = g();
            int i = 0;
            while (true) {
                if (i == Integer.MAX_VALUE) {
                    break;
                }
                f<T> fVar = g.get();
                if (fVar == null) {
                    Object obj = g.value;
                    if (NotificationLite.d(obj) || (obj instanceof NotificationLite.b)) {
                        return i - 1;
                    }
                } else {
                    i++;
                    g = fVar;
                }
            }
            return i;
        }
    }

    /* compiled from: ReplaySubject.java */
    public static final class e<T> extends AtomicReference<Object> implements b<T> {
        private static final long serialVersionUID = 1107649250281456395L;
        volatile boolean done;
        volatile a<Object> head;
        final int maxSize;
        int size;
        a<Object> tail;

        public e(int i) {
            this.maxSize = i;
            a<Object> aVar = new a<>(null);
            this.tail = aVar;
            this.head = aVar;
        }

        @Override // io.reactivex.rxjava3.subjects.g.b
        public final void add(T t) {
            a<Object> aVar = new a<>(t);
            a<Object> aVar2 = this.tail;
            this.tail = aVar;
            this.size++;
            aVar2.set(aVar);
            int i = this.size;
            if (i > this.maxSize) {
                this.size = i - 1;
                this.head = this.head.get();
            }
        }

        @Override // io.reactivex.rxjava3.subjects.g.b
        public final void d() {
            a<Object> aVar = this.head;
            if (aVar.value != null) {
                a<Object> aVar2 = new a<>(null);
                aVar2.lazySet(aVar.get());
                this.head = aVar2;
            }
        }

        @Override // io.reactivex.rxjava3.subjects.g.b
        public final void e(c<T> cVar) {
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            v<? super T> vVar = cVar.downstream;
            a<Object> aVar = (a) cVar.index;
            if (aVar == null) {
                aVar = this.head;
            }
            int i = 1;
            while (!cVar.cancelled) {
                a<T> aVar2 = aVar.get();
                if (aVar2 != null) {
                    T t = aVar2.value;
                    if (this.done && aVar2.get() == null) {
                        if (NotificationLite.d(t)) {
                            vVar.onComplete();
                        } else {
                            vVar.onError(NotificationLite.c(t));
                        }
                        cVar.index = null;
                        cVar.cancelled = true;
                        return;
                    }
                    vVar.onNext(t);
                    aVar = aVar2;
                } else if (aVar.get() != null) {
                    continue;
                } else {
                    cVar.index = aVar;
                    i = cVar.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
            cVar.index = null;
        }

        @Override // io.reactivex.rxjava3.subjects.g.b
        public final void f(Serializable serializable) {
            a<Object> aVar = new a<>(serializable);
            a<Object> aVar2 = this.tail;
            this.tail = aVar;
            this.size++;
            aVar2.lazySet(aVar);
            d();
            this.done = true;
        }

        @Override // io.reactivex.rxjava3.subjects.g.b
        public final T getValue() {
            a<Object> aVar = this.head;
            a<Object> aVar2 = null;
            while (true) {
                a<T> aVar3 = aVar.get();
                if (aVar3 == null) {
                    break;
                }
                aVar2 = aVar;
                aVar = aVar3;
            }
            T t = (T) aVar.value;
            if (t == null) {
                return null;
            }
            return (NotificationLite.d(t) || (t instanceof NotificationLite.b)) ? (T) aVar2.value : t;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
        
            return r1;
         */
        @Override // io.reactivex.rxjava3.subjects.g.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int size() {
            a<Object> aVar = this.head;
            int i = 0;
            while (true) {
                if (i == Integer.MAX_VALUE) {
                    break;
                }
                a<T> aVar2 = aVar.get();
                if (aVar2 == null) {
                    Object obj = aVar.value;
                    if (NotificationLite.d(obj) || (obj instanceof NotificationLite.b)) {
                        return i - 1;
                    }
                } else {
                    i++;
                    aVar = aVar2;
                }
            }
        }
    }

    /* compiled from: ReplaySubject.java */
    public static final class f<T> extends AtomicReference<f<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        final long time;
        final T value;

        public f(T t, long j) {
            this.value = t;
            this.time = j;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(b<T> bVar) {
        this.b = (AtomicReference) bVar;
    }

    public static <T> g<T> N0() {
        return new g<>(new C2163g());
    }

    public static <T> g<T> O0(int i) {
        io.reactivex.rxjava3.internal.functions.b.a(i, "maxSize");
        return new g<>(new e(i));
    }

    public final void P0(c<T> cVar) {
        c<T>[] cVarArr;
        while (true) {
            AtomicReference<c<T>[]> atomicReference = this.c;
            c<T>[] cVarArr2 = atomicReference.get();
            if (cVarArr2 == f || cVarArr2 == (cVarArr = e)) {
                return;
            }
            int length = cVarArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (cVarArr2[i] == cVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                cVarArr = new c[length - 1];
                System.arraycopy(cVarArr2, 0, cVarArr, 0, i);
                System.arraycopy(cVarArr2, i + 1, cVarArr, i, (length - i) - 1);
            }
            while (!atomicReference.compareAndSet(cVarArr2, cVarArr)) {
                if (atomicReference.get() != cVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [io.reactivex.rxjava3.subjects.g$b, java.util.concurrent.atomic.AtomicReference] */
    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
        if (this.d) {
            return;
        }
        this.d = true;
        NotificationLite notificationLite = NotificationLite.COMPLETE;
        ?? r1 = this.b;
        r1.f(notificationLite);
        r1.compareAndSet(null, notificationLite);
        for (c<T> cVar : this.c.getAndSet(f)) {
            r1.e(cVar);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [io.reactivex.rxjava3.subjects.g$b, java.util.concurrent.atomic.AtomicReference] */
    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        io.reactivex.rxjava3.internal.util.f.c(th, "onError called with a null Throwable.");
        if (this.d) {
            io.reactivex.rxjava3.plugins.a.a(th);
            return;
        }
        this.d = true;
        NotificationLite.b bVar = new NotificationLite.b(th);
        ?? r5 = this.b;
        r5.f(bVar);
        r5.compareAndSet(null, bVar);
        for (c<T> cVar : this.c.getAndSet(f)) {
            r5.e(cVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [io.reactivex.rxjava3.subjects.g$b, java.util.concurrent.atomic.AtomicReference] */
    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(T t) {
        io.reactivex.rxjava3.internal.util.f.c(t, "onNext called with a null value.");
        if (this.d) {
            return;
        }
        ?? r0 = this.b;
        r0.add(t);
        for (c<T> cVar : this.c.get()) {
            r0.e(cVar);
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
        if (this.d) {
            cVar.dispose();
        }
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [io.reactivex.rxjava3.subjects.g$b, java.util.concurrent.atomic.AtomicReference] */
    @Override // io.reactivex.rxjava3.core.q
    public final void q0(v<? super T> vVar) {
        c<T> cVar = new c<>(vVar, this);
        vVar.onSubscribe(cVar);
        AtomicReference<c<T>[]> atomicReference = this.c;
        while (true) {
            c<T>[] cVarArr = atomicReference.get();
            if (cVarArr == f) {
                break;
            }
            int length = cVarArr.length;
            c<T>[] cVarArr2 = new c[length + 1];
            System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
            cVarArr2[length] = cVar;
            while (!atomicReference.compareAndSet(cVarArr, cVarArr2)) {
                if (atomicReference.get() != cVarArr) {
                    break;
                }
            }
            if (cVar.cancelled) {
                P0(cVar);
                return;
            }
        }
        this.b.e(cVar);
    }

    /* compiled from: ReplaySubject.java */
    /* renamed from: io.reactivex.rxjava3.subjects.g$g, reason: collision with other inner class name */
    public static final class C2163g<T> extends AtomicReference<Object> implements b<T> {
        private static final long serialVersionUID = -733876083048047795L;
        final List<Object> buffer = new ArrayList(16);
        volatile boolean done;
        volatile int size;

        @Override // io.reactivex.rxjava3.subjects.g.b
        public final void add(T t) {
            this.buffer.add(t);
            this.size++;
        }

        @Override // io.reactivex.rxjava3.subjects.g.b
        public final void e(c<T> cVar) {
            int i;
            int i2;
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            List<Object> list = this.buffer;
            v<? super T> vVar = cVar.downstream;
            Integer num = (Integer) cVar.index;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
                cVar.index = 0;
            }
            int i3 = 1;
            while (!cVar.cancelled) {
                int i4 = this.size;
                while (i4 != i) {
                    if (cVar.cancelled) {
                        cVar.index = null;
                        return;
                    }
                    Object obj = list.get(i);
                    if (this.done && (i2 = i + 1) == i4 && i2 == (i4 = this.size)) {
                        if (NotificationLite.d(obj)) {
                            vVar.onComplete();
                        } else {
                            vVar.onError(NotificationLite.c(obj));
                        }
                        cVar.index = null;
                        cVar.cancelled = true;
                        return;
                    }
                    vVar.onNext(obj);
                    i++;
                }
                if (i == this.size) {
                    cVar.index = Integer.valueOf(i);
                    i3 = cVar.addAndGet(-i3);
                    if (i3 == 0) {
                        return;
                    }
                }
            }
            cVar.index = null;
        }

        @Override // io.reactivex.rxjava3.subjects.g.b
        public final void f(Serializable serializable) {
            this.buffer.add(serializable);
            this.size++;
            this.done = true;
        }

        @Override // io.reactivex.rxjava3.subjects.g.b
        public final T getValue() {
            int i = this.size;
            if (i == 0) {
                return null;
            }
            List<Object> list = this.buffer;
            T t = (T) list.get(i - 1);
            if (!NotificationLite.d(t) && !(t instanceof NotificationLite.b)) {
                return t;
            }
            if (i == 1) {
                return null;
            }
            return (T) list.get(i - 2);
        }

        @Override // io.reactivex.rxjava3.subjects.g.b
        public final int size() {
            int i = this.size;
            if (i == 0) {
                return 0;
            }
            int i2 = i - 1;
            Object obj = this.buffer.get(i2);
            return (NotificationLite.d(obj) || (obj instanceof NotificationLite.b)) ? i2 : i;
        }

        @Override // io.reactivex.rxjava3.subjects.g.b
        public final void d() {
        }
    }
}
