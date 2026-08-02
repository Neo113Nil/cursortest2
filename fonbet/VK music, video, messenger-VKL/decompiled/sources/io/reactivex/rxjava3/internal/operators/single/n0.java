package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.single.m0;
import io.reactivex.rxjava3.internal.operators.single.y;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: SingleZipIterable.java */
/* loaded from: classes8.dex */
public final class n0<T, R> extends io.reactivex.rxjava3.core.x<R> {
    public final Iterable<? extends io.reactivex.rxjava3.core.b0<? extends T>> b;
    public final io.reactivex.rxjava3.functions.l<? super Object[], ? extends R> c;

    /* compiled from: SingleZipIterable.java */
    public final class a implements io.reactivex.rxjava3.functions.l<T, R> {
        public a() {
        }

        @Override // io.reactivex.rxjava3.functions.l
        public final R apply(T t) throws Throwable {
            R apply = n0.this.c.apply(new Object[]{t});
            Objects.requireNonNull(apply, "The zipper returned a null value");
            return apply;
        }
    }

    public n0(Iterable<? extends io.reactivex.rxjava3.core.b0<? extends T>> iterable, io.reactivex.rxjava3.functions.l<? super Object[], ? extends R> lVar) {
        this.b = iterable;
        this.c = lVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super R> zVar) {
        io.reactivex.rxjava3.core.b0[] b0VarArr = new io.reactivex.rxjava3.core.b0[8];
        try {
            int i = 0;
            for (io.reactivex.rxjava3.core.b0<? extends T> b0Var : this.b) {
                if (b0Var == null) {
                    NullPointerException nullPointerException = new NullPointerException("One of the sources is null");
                    zVar.onSubscribe(EmptyDisposable.INSTANCE);
                    zVar.onError(nullPointerException);
                    return;
                } else {
                    if (i == b0VarArr.length) {
                        b0VarArr = (io.reactivex.rxjava3.core.b0[]) Arrays.copyOf(b0VarArr, (i >> 2) + i);
                    }
                    int i2 = i + 1;
                    b0VarArr[i] = b0Var;
                    i = i2;
                }
            }
            if (i == 0) {
                NoSuchElementException noSuchElementException = new NoSuchElementException();
                zVar.onSubscribe(EmptyDisposable.INSTANCE);
                zVar.onError(noSuchElementException);
            } else {
                if (i == 1) {
                    b0VarArr[0].subscribe(new y.a(zVar, new a()));
                    return;
                }
                m0.b bVar = new m0.b(zVar, i, this.c);
                zVar.onSubscribe(bVar);
                for (int i3 = 0; i3 < i && !bVar.h(); i3++) {
                    b0VarArr[i3].subscribe(bVar.observers[i3]);
                }
            }
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            zVar.onSubscribe(EmptyDisposable.INSTANCE);
            zVar.onError(th);
        }
    }
}
