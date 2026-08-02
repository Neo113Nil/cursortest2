package io.reactivex.rxjava3.internal.operators.observable;

import android.Manifest;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes11.dex */
public final class ObservableScalarXMap {

    public static final class ScalarDisposable<T> extends AtomicInteger implements io.reactivex.rxjava3.internal.fuseable.g<T>, Runnable {
        private static final long serialVersionUID = 3880992722410194083L;
        final io.reactivex.rxjava3.core.v<? super T> observer;
        final T value;

        public ScalarDisposable(io.reactivex.rxjava3.core.v<? super T> vVar, T t) {
            this.observer = vVar;
            this.value = t;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.h
        public final int a(int i) {
            lazySet(1);
            return 1;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final void clear() {
            lazySet(3);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            set(3);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return get() == 3;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final boolean isEmpty() {
            return get() != 1;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final boolean offer(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final T poll() {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.value;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.observer.onNext(this.value);
                if (get() == 2) {
                    lazySet(3);
                    this.observer.onComplete();
                }
            }
        }
    }

    public static final class a<T, R> extends io.reactivex.rxjava3.core.q<R> {
        public final T b;
        public final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.t<? extends R>> c;

        public a(T t, io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.t<? extends R>> lVar) {
            this.b = t;
            this.c = lVar;
        }

        @Override // io.reactivex.rxjava3.core.q
        public final void q0(io.reactivex.rxjava3.core.v<? super R> vVar) {
            try {
                io.reactivex.rxjava3.core.t<? extends R> apply = this.c.apply(this.b);
                Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                io.reactivex.rxjava3.core.t<? extends R> tVar = apply;
                if (!(tVar instanceof io.reactivex.rxjava3.functions.n)) {
                    tVar.subscribe(vVar);
                    return;
                }
                try {
                    Object obj = ((io.reactivex.rxjava3.functions.n) tVar).get();
                    if (obj == null) {
                        vVar.onSubscribe(EmptyDisposable.INSTANCE);
                        vVar.onComplete();
                    } else {
                        ScalarDisposable scalarDisposable = new ScalarDisposable(vVar, obj);
                        vVar.onSubscribe(scalarDisposable);
                        scalarDisposable.run();
                    }
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    vVar.onSubscribe(EmptyDisposable.INSTANCE);
                    vVar.onError(th);
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                vVar.onSubscribe(EmptyDisposable.INSTANCE);
                vVar.onError(th2);
            }
        }
    }

    public static <T, R> boolean a(io.reactivex.rxjava3.core.t<T> tVar, io.reactivex.rxjava3.core.v<? super R> vVar, io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.t<? extends R>> lVar) {
        if (!(tVar instanceof io.reactivex.rxjava3.functions.n)) {
            return false;
        }
        try {
            Manifest.permission_group permission_groupVar = (Object) ((io.reactivex.rxjava3.functions.n) tVar).get();
            if (permission_groupVar == null) {
                vVar.onSubscribe(EmptyDisposable.INSTANCE);
                vVar.onComplete();
                return true;
            }
            try {
                io.reactivex.rxjava3.core.t<? extends R> apply = lVar.apply(permission_groupVar);
                Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                io.reactivex.rxjava3.core.t<? extends R> tVar2 = apply;
                if (!(tVar2 instanceof io.reactivex.rxjava3.functions.n)) {
                    tVar2.subscribe(vVar);
                    return true;
                }
                try {
                    Object obj = ((io.reactivex.rxjava3.functions.n) tVar2).get();
                    if (obj == null) {
                        vVar.onSubscribe(EmptyDisposable.INSTANCE);
                        vVar.onComplete();
                        return true;
                    }
                    ScalarDisposable scalarDisposable = new ScalarDisposable(vVar, obj);
                    vVar.onSubscribe(scalarDisposable);
                    scalarDisposable.run();
                    return true;
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    vVar.onSubscribe(EmptyDisposable.INSTANCE);
                    vVar.onError(th);
                    return true;
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                vVar.onSubscribe(EmptyDisposable.INSTANCE);
                vVar.onError(th2);
                return true;
            }
        } catch (Throwable th3) {
            io.reactivex.rxjava3.exceptions.a.b(th3);
            vVar.onSubscribe(EmptyDisposable.INSTANCE);
            vVar.onError(th3);
            return true;
        }
    }
}
