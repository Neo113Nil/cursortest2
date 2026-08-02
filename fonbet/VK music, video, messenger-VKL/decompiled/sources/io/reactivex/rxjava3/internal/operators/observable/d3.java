package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: ObservableWithLatestFromMany.java */
/* loaded from: classes8.dex */
public final class d3<T, R> extends io.reactivex.rxjava3.internal.operators.observable.a<T, R> {
    public final io.reactivex.rxjava3.core.t<?>[] c;
    public final a.c d;

    /* compiled from: ObservableWithLatestFromMany.java */
    public final class a implements io.reactivex.rxjava3.functions.l<T, R> {
        public a() {
        }

        @Override // io.reactivex.rxjava3.functions.l
        public final R apply(T t) throws Throwable {
            R r = (R) d3.this.d.apply(new Object[]{t});
            Objects.requireNonNull(r, "The combiner returned a null value");
            return r;
        }
    }

    /* compiled from: ObservableWithLatestFromMany.java */
    public static final class b<T, R> extends AtomicInteger implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = 1577321883966341961L;
        final io.reactivex.rxjava3.functions.l<? super Object[], R> combiner;
        volatile boolean done;
        final io.reactivex.rxjava3.core.v<? super R> downstream;
        final AtomicThrowable error;
        final c[] observers;
        final AtomicReference<io.reactivex.rxjava3.disposables.c> upstream;
        final AtomicReferenceArray<Object> values;

        public b(io.reactivex.rxjava3.core.v vVar, a.c cVar, int i) {
            this.downstream = vVar;
            this.combiner = cVar;
            c[] cVarArr = new c[i];
            for (int i2 = 0; i2 < i; i2++) {
                cVarArr[i2] = new c(this, i2);
            }
            this.observers = cVarArr;
            this.values = new AtomicReferenceArray<>(i);
            this.upstream = new AtomicReference<>();
            this.error = new AtomicThrowable();
        }

        public final void a(int i) {
            c[] cVarArr = this.observers;
            for (int i2 = 0; i2 < cVarArr.length; i2++) {
                if (i2 != i) {
                    c cVar = cVarArr[i2];
                    cVar.getClass();
                    DisposableHelper.a(cVar);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            DisposableHelper.a(this.upstream);
            for (c cVar : this.observers) {
                cVar.getClass();
                DisposableHelper.a(cVar);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return DisposableHelper.b(this.upstream.get());
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            a(-1);
            io.reactivex.rxjava3.internal.util.g.a(this.downstream, this, this.error);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            if (this.done) {
                io.reactivex.rxjava3.plugins.a.a(th);
                return;
            }
            this.done = true;
            a(-1);
            io.reactivex.rxjava3.internal.util.g.b(this.downstream, th, this, this.error);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            if (this.done) {
                return;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = this.values;
            int length = atomicReferenceArray.length();
            Object[] objArr = new Object[length + 1];
            int i = 0;
            objArr[0] = t;
            while (i < length) {
                Object obj = atomicReferenceArray.get(i);
                if (obj == null) {
                    return;
                }
                i++;
                objArr[i] = obj;
            }
            try {
                R apply = this.combiner.apply(objArr);
                Objects.requireNonNull(apply, "combiner returned a null value");
                io.reactivex.rxjava3.internal.util.g.c(this.downstream, apply, this, this.error);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            DisposableHelper.e(this.upstream, cVar);
        }

        public void subscribe(io.reactivex.rxjava3.core.t<?>[] tVarArr, int i) {
            c[] cVarArr = this.observers;
            AtomicReference<io.reactivex.rxjava3.disposables.c> atomicReference = this.upstream;
            for (int i2 = 0; i2 < i && !DisposableHelper.b(atomicReference.get()) && !this.done; i2++) {
                tVarArr[i2].subscribe(cVarArr[i2]);
            }
        }
    }

    /* compiled from: ObservableWithLatestFromMany.java */
    public static final class c extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.v<Object> {
        private static final long serialVersionUID = 3256684027868224024L;
        boolean hasValue;
        final int index;
        final b<?, ?> parent;

        public c(b<?, ?> bVar, int i) {
            this.parent = bVar;
            this.index = i;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            b<?, ?> bVar = this.parent;
            int i = this.index;
            if (this.hasValue) {
                bVar.getClass();
                return;
            }
            bVar.done = true;
            bVar.a(i);
            io.reactivex.rxjava3.internal.util.g.a(bVar.downstream, bVar, bVar.error);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            b<?, ?> bVar = this.parent;
            int i = this.index;
            bVar.done = true;
            DisposableHelper.a(bVar.upstream);
            bVar.a(i);
            io.reactivex.rxjava3.internal.util.g.b(bVar.downstream, th, bVar, bVar.error);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(Object obj) {
            if (!this.hasValue) {
                this.hasValue = true;
            }
            b<?, ?> bVar = this.parent;
            bVar.values.set(this.index, obj);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            DisposableHelper.e(this, cVar);
        }
    }

    public d3(z zVar, io.reactivex.rxjava3.core.t[] tVarArr, a.c cVar) {
        super(zVar);
        this.c = tVarArr;
        this.d = cVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super R> vVar) {
        io.reactivex.rxjava3.core.t<?>[] tVarArr = this.c;
        if (tVarArr == null) {
            try {
                throw null;
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                vVar.onSubscribe(EmptyDisposable.INSTANCE);
                vVar.onError(th);
                return;
            }
        }
        int length = tVarArr.length;
        io.reactivex.rxjava3.core.t<T> tVar = this.b;
        if (length == 0) {
            new j1(tVar, new a()).q0(vVar);
            return;
        }
        b bVar = new b(vVar, this.d, length);
        vVar.onSubscribe(bVar);
        bVar.subscribe(tVarArr, length);
        tVar.subscribe(bVar);
    }
}
