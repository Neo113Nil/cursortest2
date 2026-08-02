package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.builders.ListBuilder;

/* compiled from: CompletableAmb.java */
/* loaded from: classes8.dex */
public final class a extends io.reactivex.rxjava3.core.a {
    public final io.reactivex.rxjava3.core.e[] b;
    public final Iterable<? extends io.reactivex.rxjava3.core.e> c;

    /* compiled from: CompletableAmb.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.completable.a$a, reason: collision with other inner class name */
    public static final class C2118a implements io.reactivex.rxjava3.core.c {
        public final AtomicBoolean b;
        public final io.reactivex.rxjava3.disposables.b c;
        public final io.reactivex.rxjava3.core.c d;
        public io.reactivex.rxjava3.disposables.c e;

        public C2118a(io.reactivex.rxjava3.core.c cVar, io.reactivex.rxjava3.disposables.b bVar, AtomicBoolean atomicBoolean) {
            this.b = atomicBoolean;
            this.c = bVar;
            this.d = cVar;
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onComplete() {
            if (this.b.compareAndSet(false, true)) {
                io.reactivex.rxjava3.disposables.c cVar = this.e;
                io.reactivex.rxjava3.disposables.b bVar = this.c;
                bVar.c(cVar);
                bVar.dispose();
                this.d.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onError(Throwable th) {
            if (!this.b.compareAndSet(false, true)) {
                io.reactivex.rxjava3.plugins.a.a(th);
                return;
            }
            io.reactivex.rxjava3.disposables.c cVar = this.e;
            io.reactivex.rxjava3.disposables.b bVar = this.c;
            bVar.c(cVar);
            bVar.dispose();
            this.d.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            this.e = cVar;
            this.c.b(cVar);
        }
    }

    public a(io.reactivex.rxjava3.core.e[] eVarArr, ListBuilder listBuilder) {
        this.b = eVarArr;
        this.c = listBuilder;
    }

    @Override // io.reactivex.rxjava3.core.a
    public final void p(io.reactivex.rxjava3.core.c cVar) {
        int length;
        io.reactivex.rxjava3.core.e[] eVarArr = this.b;
        if (eVarArr == null) {
            eVarArr = new io.reactivex.rxjava3.core.e[8];
            try {
                length = 0;
                for (io.reactivex.rxjava3.core.e eVar : this.c) {
                    if (eVar == null) {
                        Throwable nullPointerException = new NullPointerException("One of the sources is null");
                        cVar.onSubscribe(EmptyDisposable.INSTANCE);
                        cVar.onError(nullPointerException);
                        return;
                    } else {
                        if (length == eVarArr.length) {
                            io.reactivex.rxjava3.core.e[] eVarArr2 = new io.reactivex.rxjava3.core.e[(length >> 2) + length];
                            System.arraycopy(eVarArr, 0, eVarArr2, 0, length);
                            eVarArr = eVarArr2;
                        }
                        int i = length + 1;
                        eVarArr[length] = eVar;
                        length = i;
                    }
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                cVar.onSubscribe(EmptyDisposable.INSTANCE);
                cVar.onError(th);
                return;
            }
        } else {
            length = eVarArr.length;
        }
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        cVar.onSubscribe(bVar);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        for (int i2 = 0; i2 < length; i2++) {
            io.reactivex.rxjava3.core.e eVar2 = eVarArr[i2];
            if (bVar.c) {
                return;
            }
            if (eVar2 == null) {
                Throwable nullPointerException2 = new NullPointerException("One of the sources is null");
                if (!atomicBoolean.compareAndSet(false, true)) {
                    io.reactivex.rxjava3.plugins.a.a(nullPointerException2);
                    return;
                } else {
                    bVar.dispose();
                    cVar.onError(nullPointerException2);
                    return;
                }
            }
            eVar2.subscribe(new C2118a(cVar, bVar, atomicBoolean));
        }
        if (length == 0) {
            cVar.onComplete();
        }
    }
}
