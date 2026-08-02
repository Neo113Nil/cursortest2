package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableZip.java */
/* loaded from: classes8.dex */
public final class e3<T, R> extends io.reactivex.rxjava3.core.q<R> {
    public final io.reactivex.rxjava3.core.t<? extends T>[] b;
    public final Iterable<? extends io.reactivex.rxjava3.core.t<? extends T>> c;
    public final io.reactivex.rxjava3.functions.l<? super Object[], ? extends R> d;
    public final int e;

    /* compiled from: ObservableZip.java */
    public static final class a<T, R> extends AtomicInteger implements io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = 2983708048395377667L;
        volatile boolean cancelled;
        final boolean delayError = false;
        final io.reactivex.rxjava3.core.v<? super R> downstream;
        final b<T, R>[] observers;
        final T[] row;
        final io.reactivex.rxjava3.functions.l<? super Object[], ? extends R> zipper;

        public a(io.reactivex.rxjava3.core.v vVar, io.reactivex.rxjava3.functions.l lVar, int i) {
            this.downstream = vVar;
            this.zipper = lVar;
            this.observers = new b[i];
            this.row = (T[]) new Object[i];
        }

        public final void d() {
            for (b<T, R> bVar : this.observers) {
                bVar.c.clear();
            }
            for (b<T, R> bVar2 : this.observers) {
                DisposableHelper.a(bVar2.f);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            for (b<T, R> bVar : this.observers) {
                DisposableHelper.a(bVar.f);
            }
            if (getAndIncrement() == 0) {
                for (b<T, R> bVar2 : this.observers) {
                    bVar2.c.clear();
                }
            }
        }

        public final void g() {
            Throwable th;
            if (getAndIncrement() != 0) {
                return;
            }
            b<T, R>[] bVarArr = this.observers;
            io.reactivex.rxjava3.core.v<? super R> vVar = this.downstream;
            T[] tArr = this.row;
            boolean z = this.delayError;
            int i = 1;
            while (true) {
                int i2 = 0;
                int i3 = 0;
                for (b<T, R> bVar : bVarArr) {
                    if (tArr[i3] == null) {
                        boolean z2 = bVar.d;
                        T poll = bVar.c.poll();
                        boolean z3 = poll == null;
                        if (this.cancelled) {
                            d();
                            return;
                        }
                        if (z2) {
                            if (!z) {
                                Throwable th2 = bVar.e;
                                if (th2 != null) {
                                    this.cancelled = true;
                                    d();
                                    vVar.onError(th2);
                                    return;
                                } else if (z3) {
                                    this.cancelled = true;
                                    d();
                                    vVar.onComplete();
                                    return;
                                }
                            } else if (z3) {
                                Throwable th3 = bVar.e;
                                this.cancelled = true;
                                d();
                                if (th3 != null) {
                                    vVar.onError(th3);
                                    return;
                                } else {
                                    vVar.onComplete();
                                    return;
                                }
                            }
                        }
                        if (z3) {
                            i2++;
                        } else {
                            tArr[i3] = poll;
                        }
                    } else if (bVar.d && !z && (th = bVar.e) != null) {
                        this.cancelled = true;
                        d();
                        vVar.onError(th);
                        return;
                    }
                    i3++;
                }
                if (i2 != 0) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    try {
                        R apply = this.zipper.apply(tArr.clone());
                        Objects.requireNonNull(apply, "The zipper returned a null value");
                        vVar.onNext(apply);
                        Arrays.fill(tArr, (Object) null);
                    } catch (Throwable th4) {
                        io.reactivex.rxjava3.exceptions.a.b(th4);
                        d();
                        vVar.onError(th4);
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.cancelled;
        }

        public void subscribe(io.reactivex.rxjava3.core.t<? extends T>[] tVarArr, int i) {
            b<T, R>[] bVarArr = this.observers;
            int length = bVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                bVarArr[i2] = new b<>(this, i);
            }
            lazySet(0);
            this.downstream.onSubscribe(this);
            for (int i3 = 0; i3 < length && !this.cancelled; i3++) {
                tVarArr[i3].subscribe(bVarArr[i3]);
            }
        }
    }

    /* compiled from: ObservableZip.java */
    public static final class b<T, R> implements io.reactivex.rxjava3.core.v<T> {
        public final a<T, R> b;
        public final io.reactivex.rxjava3.internal.queue.b<T> c;
        public volatile boolean d;
        public Throwable e;
        public final AtomicReference<io.reactivex.rxjava3.disposables.c> f = new AtomicReference<>();

        public b(a<T, R> aVar, int i) {
            this.b = aVar;
            this.c = new io.reactivex.rxjava3.internal.queue.b<>(i);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            this.d = true;
            this.b.g();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            this.e = th;
            this.d = true;
            this.b.g();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            this.c.offer(t);
            this.b.g();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            DisposableHelper.e(this.f, cVar);
        }
    }

    public e3(io.reactivex.rxjava3.core.t[] tVarArr, ArrayList arrayList, io.reactivex.rxjava3.functions.l lVar, int i) {
        this.b = tVarArr;
        this.c = arrayList;
        this.d = lVar;
        this.e = i;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super R> vVar) {
        int length;
        io.reactivex.rxjava3.core.t<? extends T>[] tVarArr = this.b;
        if (tVarArr == null) {
            tVarArr = new io.reactivex.rxjava3.core.t[8];
            length = 0;
            for (io.reactivex.rxjava3.core.t<? extends T> tVar : this.c) {
                if (length == tVarArr.length) {
                    io.reactivex.rxjava3.core.t<? extends T>[] tVarArr2 = new io.reactivex.rxjava3.core.t[(length >> 2) + length];
                    System.arraycopy(tVarArr, 0, tVarArr2, 0, length);
                    tVarArr = tVarArr2;
                }
                tVarArr[length] = tVar;
                length++;
            }
        } else {
            length = tVarArr.length;
        }
        if (length != 0) {
            new a(vVar, this.d, length).subscribe(tVarArr, this.e);
        } else {
            vVar.onSubscribe(EmptyDisposable.INSTANCE);
            vVar.onComplete();
        }
    }
}
