package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import xsna.sj4;

/* compiled from: ObservableReplay.java */
/* loaded from: classes8.dex */
public final class a2<T> extends io.reactivex.rxjava3.observables.a<T> {
    public static final l f = new l();
    public final io.reactivex.rxjava3.core.t<T> b;
    public final AtomicReference<i<T>> c;
    public final b<T> d;
    public final j e;

    /* compiled from: ObservableReplay.java */
    public static abstract class a<T> extends AtomicReference<f> implements g<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        final boolean eagerTruncate = false;
        int size;
        f tail;

        public a() {
            f fVar = new f(null);
            this.tail = fVar;
            set(fVar);
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.a2.g
        public final void a(Throwable th) {
            f fVar = new f(new NotificationLite.b(th));
            this.tail.set(fVar);
            this.tail = fVar;
            this.size++;
            f fVar2 = get();
            if (fVar2.value != null) {
                f fVar3 = new f(null);
                fVar3.lazySet(fVar2.get());
                set(fVar3);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.a2.g
        public final void b(d<T> dVar) {
            if (dVar.getAndIncrement() != 0) {
                return;
            }
            int i = 1;
            do {
                f fVar = (f) dVar.index;
                if (fVar == null) {
                    fVar = get();
                    dVar.index = fVar;
                }
                while (!dVar.cancelled) {
                    f fVar2 = fVar.get();
                    if (fVar2 != null) {
                        if (NotificationLite.a(dVar.child, fVar2.value)) {
                            dVar.index = null;
                            return;
                        }
                        fVar = fVar2;
                    } else {
                        dVar.index = fVar;
                        i = dVar.addAndGet(-i);
                    }
                }
                dVar.index = null;
                return;
            } while (i != 0);
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.a2.g
        public final void c(T t) {
            f fVar = new f(t);
            this.tail.set(fVar);
            this.tail = fVar;
            this.size++;
            d();
        }

        public abstract void d();

        @Override // io.reactivex.rxjava3.internal.operators.observable.a2.g
        public final void i() {
            f fVar = new f(NotificationLite.COMPLETE);
            this.tail.set(fVar);
            this.tail = fVar;
            this.size++;
            f fVar2 = get();
            if (fVar2.value != null) {
                f fVar3 = new f(null);
                fVar3.lazySet(fVar2.get());
                set(fVar3);
            }
        }
    }

    /* compiled from: ObservableReplay.java */
    public interface b<T> {
        g<T> call();
    }

    /* compiled from: ObservableReplay.java */
    public static final class c<R> implements io.reactivex.rxjava3.functions.f<io.reactivex.rxjava3.disposables.c> {
        public final ObserverResourceWrapper<R> b;

        public c(ObserverResourceWrapper<R> observerResourceWrapper) {
            this.b = observerResourceWrapper;
        }

        @Override // io.reactivex.rxjava3.functions.f
        public final void accept(io.reactivex.rxjava3.disposables.c cVar) throws Throwable {
            ObserverResourceWrapper<R> observerResourceWrapper = this.b;
            observerResourceWrapper.getClass();
            DisposableHelper.d(observerResourceWrapper, cVar);
        }
    }

    /* compiled from: ObservableReplay.java */
    public static final class d<T> extends AtomicInteger implements io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = 2728361546769921047L;
        volatile boolean cancelled;
        final io.reactivex.rxjava3.core.v<? super T> child;
        Object index;
        final i<T> parent;

        public d(i<T> iVar, io.reactivex.rxjava3.core.v<? super T> vVar) {
            this.parent = iVar;
            this.child = vVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.parent.a(this);
            this.index = null;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.cancelled;
        }
    }

    /* compiled from: ObservableReplay.java */
    public static final class e<R, U> extends io.reactivex.rxjava3.core.q<R> {
        public final c1 b;
        public final sj4 c;

        public e(c1 c1Var, sj4 sj4Var) {
            this.b = c1Var;
            this.c = sj4Var;
        }

        @Override // io.reactivex.rxjava3.core.q
        public final void q0(io.reactivex.rxjava3.core.v<? super R> vVar) {
            try {
                io.reactivex.rxjava3.observables.a aVar = (io.reactivex.rxjava3.observables.a) this.b.get();
                io.reactivex.rxjava3.core.t tVar = (io.reactivex.rxjava3.core.t) this.c.apply(aVar);
                ObserverResourceWrapper observerResourceWrapper = new ObserverResourceWrapper(vVar);
                tVar.subscribe(observerResourceWrapper);
                aVar.N0(new c(observerResourceWrapper));
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                vVar.onSubscribe(EmptyDisposable.INSTANCE);
                vVar.onError(th);
            }
        }
    }

    /* compiled from: ObservableReplay.java */
    public static final class f extends AtomicReference<f> {
        private static final long serialVersionUID = 245354315435971818L;
        final Object value;

        public f(Object obj) {
            this.value = obj;
        }
    }

    /* compiled from: ObservableReplay.java */
    public interface g<T> {
        void a(Throwable th);

        void b(d<T> dVar);

        void c(T t);

        void i();
    }

    /* compiled from: ObservableReplay.java */
    public static final class h<T> implements b<T> {
        @Override // io.reactivex.rxjava3.internal.operators.observable.a2.b
        public final g<T> call() {
            return new k();
        }
    }

    /* compiled from: ObservableReplay.java */
    public static final class i<T> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        public static final d[] b = new d[0];
        public static final d[] c = new d[0];
        private static final long serialVersionUID = -533785617179540163L;
        final g<T> buffer;
        final AtomicReference<i<T>> current;
        boolean done;
        final AtomicReference<d[]> observers = new AtomicReference<>(b);
        final AtomicBoolean shouldConnect = new AtomicBoolean();

        public i(g<T> gVar, AtomicReference<i<T>> atomicReference) {
            this.buffer = gVar;
            this.current = atomicReference;
        }

        public final void a(d<T> dVar) {
            d[] dVarArr;
            while (true) {
                d[] dVarArr2 = this.observers.get();
                int length = dVarArr2.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (dVarArr2[i].equals(dVar)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    dVarArr = b;
                } else {
                    d[] dVarArr3 = new d[length - 1];
                    System.arraycopy(dVarArr2, 0, dVarArr3, 0, i);
                    System.arraycopy(dVarArr2, i + 1, dVarArr3, i, (length - i) - 1);
                    dVarArr = dVarArr3;
                }
                AtomicReference<d[]> atomicReference = this.observers;
                while (!atomicReference.compareAndSet(dVarArr2, dVarArr)) {
                    if (atomicReference.get() != dVarArr2) {
                        break;
                    }
                }
                return;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.observers.set(c);
            AtomicReference<i<T>> atomicReference = this.current;
            while (!atomicReference.compareAndSet(this, null) && atomicReference.get() == this) {
            }
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.observers.get() == c;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.buffer.i();
            for (d<T> dVar : this.observers.getAndSet(c)) {
                this.buffer.b(dVar);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            if (this.done) {
                io.reactivex.rxjava3.plugins.a.a(th);
                return;
            }
            this.done = true;
            this.buffer.a(th);
            for (d<T> dVar : this.observers.getAndSet(c)) {
                this.buffer.b(dVar);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            if (this.done) {
                return;
            }
            this.buffer.c(t);
            for (d<T> dVar : this.observers.get()) {
                this.buffer.b(dVar);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.e(this, cVar)) {
                for (d<T> dVar : this.observers.get()) {
                    this.buffer.b(dVar);
                }
            }
        }
    }

    /* compiled from: ObservableReplay.java */
    public static final class j<T> implements io.reactivex.rxjava3.core.t<T> {
        public final AtomicReference<i<T>> b;
        public final b<T> c;

        public j(AtomicReference<i<T>> atomicReference, b<T> bVar) {
            this.b = atomicReference;
            this.c = bVar;
        }

        @Override // io.reactivex.rxjava3.core.t
        public void subscribe(io.reactivex.rxjava3.core.v<? super T> vVar) {
            i<T> iVar;
            loop0: while (true) {
                iVar = this.b.get();
                if (iVar != null) {
                    break;
                }
                i<T> iVar2 = new i<>(this.c.call(), this.b);
                AtomicReference<i<T>> atomicReference = this.b;
                while (!atomicReference.compareAndSet(null, iVar2)) {
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
                iVar = iVar2;
                break loop0;
            }
            d<T> dVar = new d<>(iVar, vVar);
            vVar.onSubscribe(dVar);
            loop2: while (true) {
                d[] dVarArr = iVar.observers.get();
                if (dVarArr != i.c) {
                    int length = dVarArr.length;
                    d[] dVarArr2 = new d[length + 1];
                    System.arraycopy(dVarArr, 0, dVarArr2, 0, length);
                    dVarArr2[length] = dVar;
                    AtomicReference<d[]> atomicReference2 = iVar.observers;
                    while (!atomicReference2.compareAndSet(dVarArr, dVarArr2)) {
                        if (atomicReference2.get() != dVarArr) {
                            break;
                        }
                    }
                    break loop2;
                }
                break;
            }
            if (dVar.cancelled) {
                iVar.a(dVar);
            } else {
                iVar.buffer.b(dVar);
            }
        }
    }

    /* compiled from: ObservableReplay.java */
    public static final class k<T> extends a<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        final int limit = 1;

        @Override // io.reactivex.rxjava3.internal.operators.observable.a2.a
        public final void d() {
            if (this.size > this.limit) {
                f fVar = get().get();
                this.size--;
                if (this.eagerTruncate) {
                    f fVar2 = new f(null);
                    fVar2.lazySet(fVar.get());
                    fVar = fVar2;
                }
                set(fVar);
            }
        }
    }

    /* compiled from: ObservableReplay.java */
    public static final class l implements b<Object> {
        @Override // io.reactivex.rxjava3.internal.operators.observable.a2.b
        public final g<Object> call() {
            return new m(16);
        }
    }

    /* compiled from: ObservableReplay.java */
    public static final class m<T> extends ArrayList<Object> implements g<T> {
        private static final long serialVersionUID = 7063189396499112664L;
        volatile int size;

        @Override // io.reactivex.rxjava3.internal.operators.observable.a2.g
        public final void a(Throwable th) {
            add(new NotificationLite.b(th));
            this.size++;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.a2.g
        public final void b(d<T> dVar) {
            if (dVar.getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.core.v<? super T> vVar = dVar.child;
            int i = 1;
            while (!dVar.cancelled) {
                int i2 = this.size;
                Integer num = (Integer) dVar.index;
                int intValue = num != null ? num.intValue() : 0;
                while (intValue < i2) {
                    if (NotificationLite.a(vVar, get(intValue)) || dVar.cancelled) {
                        return;
                    } else {
                        intValue++;
                    }
                }
                dVar.index = Integer.valueOf(intValue);
                i = dVar.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.a2.g
        public final void c(T t) {
            add(t);
            this.size++;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.a2.g
        public final void i() {
            add(NotificationLite.COMPLETE);
            this.size++;
        }
    }

    public a2(j jVar, io.reactivex.rxjava3.core.t tVar, AtomicReference atomicReference, b bVar) {
        this.e = jVar;
        this.b = tVar;
        this.c = atomicReference;
        this.d = bVar;
    }

    public static a2 Q0(io.reactivex.rxjava3.core.q qVar) {
        h hVar = new h();
        AtomicReference atomicReference = new AtomicReference();
        return new a2(new j(atomicReference, hVar), qVar, atomicReference, hVar);
    }

    @Override // io.reactivex.rxjava3.observables.a
    public final void N0(io.reactivex.rxjava3.functions.f<? super io.reactivex.rxjava3.disposables.c> fVar) {
        i<T> iVar;
        loop0: while (true) {
            AtomicReference<i<T>> atomicReference = this.c;
            iVar = atomicReference.get();
            if (iVar != null && !iVar.h()) {
                break;
            }
            i<T> iVar2 = new i<>(this.d.call(), atomicReference);
            while (!atomicReference.compareAndSet(iVar, iVar2)) {
                if (atomicReference.get() != iVar) {
                    break;
                }
            }
            iVar = iVar2;
            break loop0;
        }
        boolean z = !iVar.shouldConnect.get() && iVar.shouldConnect.compareAndSet(false, true);
        try {
            fVar.accept(iVar);
            if (z) {
                this.b.subscribe(iVar);
            }
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            if (z) {
                iVar.shouldConnect.compareAndSet(true, false);
            }
            io.reactivex.rxjava3.exceptions.a.b(th);
            throw io.reactivex.rxjava3.internal.util.f.f(th);
        }
    }

    @Override // io.reactivex.rxjava3.observables.a
    public final void P0() {
        AtomicReference<i<T>> atomicReference = this.c;
        i<T> iVar = atomicReference.get();
        if (iVar == null || !iVar.h()) {
            return;
        }
        while (!atomicReference.compareAndSet(iVar, null) && atomicReference.get() == iVar) {
        }
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        this.e.subscribe(vVar);
    }
}
