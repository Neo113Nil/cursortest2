package xsna;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ru.rustore.sdk.appupdate.O;

/* compiled from: ObservableSubscribe.kt */
/* loaded from: classes9.dex */
public final class br70<T> implements vq70<T>, hgn {
    public final izs<Throwable, s3q0> b;
    public final gzs<s3q0> c;
    public final O d;
    public final AtomicBoolean e = new AtomicBoolean();
    public final AtomicReference<hgn> f = new AtomicReference<>(null);

    public br70(izs izsVar, gzs gzsVar, O o) {
        this.b = izsVar;
        this.c = gzsVar;
        this.d = o;
    }

    @Override // xsna.vq70
    public final void a(hgn hgnVar) {
        AtomicReference<hgn> atomicReference;
        hgn andSet;
        do {
            atomicReference = this.f;
            if (atomicReference.compareAndSet(null, hgnVar)) {
                break;
            }
        } while (atomicReference.get() == null);
        if (!this.e.get() || (andSet = atomicReference.getAndSet(null)) == null) {
            return;
        }
        andSet.dispose();
    }

    @Override // xsna.hgn
    public final void dispose() {
        hgn andSet;
        if (!this.e.compareAndSet(false, true) || (andSet = this.f.getAndSet(null)) == null) {
            return;
        }
        andSet.dispose();
    }

    @Override // xsna.vq70
    public final void onComplete() {
        if (this.e.compareAndSet(false, true)) {
            this.c.invoke();
        }
    }

    @Override // xsna.vq70
    public final void onError(Throwable th) {
        if (this.e.compareAndSet(false, true)) {
            this.b.invoke(null);
        }
    }

    @Override // xsna.vq70
    public final void onNext(T t) {
        if (this.e.get()) {
            return;
        }
        this.d.invoke(t);
    }
}
