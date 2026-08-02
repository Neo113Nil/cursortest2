package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Objects;
import xsna.tgw;

/* compiled from: ObservableFromArray.java */
/* loaded from: classes11.dex */
public final class r0<T> extends io.reactivex.rxjava3.core.q<T> {
    public final T[] b;

    /* compiled from: ObservableFromArray.java */
    public static final class a<T> extends io.reactivex.rxjava3.internal.observers.b<T> {
        public final io.reactivex.rxjava3.core.v<? super T> b;
        public final T[] c;
        public int d;
        public boolean e;
        public volatile boolean f;

        public a(io.reactivex.rxjava3.core.v<? super T> vVar, T[] tArr) {
            this.b = vVar;
            this.c = tArr;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.h
        public final int a(int i) {
            this.e = true;
            return 1;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final void clear() {
            this.d = this.c.length;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.f = true;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.f;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final boolean isEmpty() {
            return this.d == this.c.length;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final T poll() {
            int i = this.d;
            T[] tArr = this.c;
            if (i == tArr.length) {
                return null;
            }
            this.d = i + 1;
            T t = tArr[i];
            Objects.requireNonNull(t, "The array element is null");
            return t;
        }
    }

    public r0(T[] tArr) {
        this.b = tArr;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        T[] tArr = this.b;
        a aVar = new a(vVar, tArr);
        vVar.onSubscribe(aVar);
        if (aVar.e) {
            return;
        }
        int length = tArr.length;
        for (int i = 0; i < length && !aVar.f; i++) {
            T t = tArr[i];
            if (t == null) {
                aVar.b.onError(new NullPointerException(tgw.b(i, "The element at index ", " is null")));
                return;
            }
            aVar.b.onNext(t);
        }
        if (aVar.f) {
            return;
        }
        aVar.b.onComplete();
    }
}
