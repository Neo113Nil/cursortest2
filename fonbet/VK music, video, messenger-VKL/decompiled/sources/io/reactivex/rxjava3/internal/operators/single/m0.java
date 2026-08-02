package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.single.y;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleZipArray.java */
/* loaded from: classes8.dex */
public final class m0<T, R> extends io.reactivex.rxjava3.core.x<R> {
    public final io.reactivex.rxjava3.core.b0<? extends T>[] b;
    public final io.reactivex.rxjava3.functions.l<? super Object[], ? extends R> c;

    /* compiled from: SingleZipArray.java */
    public final class a implements io.reactivex.rxjava3.functions.l<T, R> {
        public a() {
        }

        @Override // io.reactivex.rxjava3.functions.l
        public final R apply(T t) throws Throwable {
            R apply = m0.this.c.apply(new Object[]{t});
            Objects.requireNonNull(apply, "The zipper returned a null value");
            return apply;
        }
    }

    /* compiled from: SingleZipArray.java */
    public static final class b<T, R> extends AtomicInteger implements io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = -5556924161382950569L;
        final io.reactivex.rxjava3.core.z<? super R> downstream;
        final c<T>[] observers;
        final Object[] values;
        final io.reactivex.rxjava3.functions.l<? super Object[], ? extends R> zipper;

        public b(io.reactivex.rxjava3.core.z<? super R> zVar, int i, io.reactivex.rxjava3.functions.l<? super Object[], ? extends R> lVar) {
            super(i);
            this.downstream = zVar;
            this.zipper = lVar;
            c<T>[] cVarArr = new c[i];
            for (int i2 = 0; i2 < i; i2++) {
                cVarArr[i2] = new c<>(this, i2);
            }
            this.observers = cVarArr;
            this.values = new Object[i];
        }

        public final void a(int i, Throwable th) {
            if (getAndSet(0) <= 0) {
                io.reactivex.rxjava3.plugins.a.a(th);
                return;
            }
            c<T>[] cVarArr = this.observers;
            int length = cVarArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                c<T> cVar = cVarArr[i2];
                cVar.getClass();
                DisposableHelper.a(cVar);
            }
            while (true) {
                i++;
                if (i >= length) {
                    this.downstream.onError(th);
                    return;
                } else {
                    c<T> cVar2 = cVarArr[i];
                    cVar2.getClass();
                    DisposableHelper.a(cVar2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            if (getAndSet(0) > 0) {
                for (c<T> cVar : this.observers) {
                    cVar.getClass();
                    DisposableHelper.a(cVar);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return get() <= 0;
        }
    }

    /* compiled from: SingleZipArray.java */
    public static final class c<T> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.z<T> {
        private static final long serialVersionUID = 3323743579927613702L;
        final int index;
        final b<T, ?> parent;

        public c(b<T, ?> bVar, int i) {
            this.parent = bVar;
            this.index = i;
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            this.parent.a(this.index, th);
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            DisposableHelper.e(this, cVar);
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSuccess(T t) {
            b<T, ?> bVar = this.parent;
            bVar.values[this.index] = t;
            if (bVar.decrementAndGet() == 0) {
                try {
                    Object apply = bVar.zipper.apply(bVar.values);
                    Objects.requireNonNull(apply, "The zipper returned a null value");
                    bVar.downstream.onSuccess(apply);
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    bVar.downstream.onError(th);
                }
            }
        }
    }

    public m0(io.reactivex.rxjava3.functions.l lVar, io.reactivex.rxjava3.core.b0[] b0VarArr) {
        this.b = b0VarArr;
        this.c = lVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super R> zVar) {
        io.reactivex.rxjava3.core.b0<? extends T>[] b0VarArr = this.b;
        int length = b0VarArr.length;
        if (length == 1) {
            b0VarArr[0].subscribe(new y.a(zVar, new a()));
            return;
        }
        b bVar = new b(zVar, length, this.c);
        zVar.onSubscribe(bVar);
        for (int i = 0; i < length && !bVar.h(); i++) {
            io.reactivex.rxjava3.core.b0<? extends T> b0Var = b0VarArr[i];
            if (b0Var == null) {
                bVar.a(i, new NullPointerException("One of the sources is null"));
                return;
            }
            b0Var.subscribe(bVar.observers[i]);
        }
    }
}
