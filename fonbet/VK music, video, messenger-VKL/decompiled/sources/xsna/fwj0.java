package xsna;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleSubscribe.kt */
/* loaded from: classes11.dex */
public final class fwj0<T> implements wuj0<T>, hgn {
    public final izs<Throwable, s3q0> b;
    public final izs<T, s3q0> c;
    public final AtomicBoolean d = new AtomicBoolean();
    public final AtomicReference<hgn> e = new AtomicReference<>(null);

    /* JADX WARN: Multi-variable type inference failed */
    public fwj0(izs<? super Throwable, s3q0> izsVar, izs<? super T, s3q0> izsVar2) {
        this.b = izsVar;
        this.c = izsVar2;
    }

    @Override // xsna.wuj0
    public final void a(hgn hgnVar) {
        AtomicReference<hgn> atomicReference;
        hgn andSet;
        do {
            atomicReference = this.e;
            if (atomicReference.compareAndSet(null, hgnVar)) {
                break;
            }
        } while (atomicReference.get() == null);
        if (!this.d.get() || (andSet = atomicReference.getAndSet(null)) == null) {
            return;
        }
        andSet.dispose();
    }

    @Override // xsna.hgn
    public final void dispose() {
        hgn andSet;
        if (!this.d.compareAndSet(false, true) || (andSet = this.e.getAndSet(null)) == null) {
            return;
        }
        andSet.dispose();
    }

    @Override // xsna.wuj0
    public final void onError(Throwable th) {
        if (this.d.compareAndSet(false, true)) {
            this.b.invoke(th);
        }
    }

    @Override // xsna.wuj0
    public final void onSuccess(T t) {
        if (this.d.compareAndSet(false, true)) {
            this.c.invoke(t);
        }
    }
}
