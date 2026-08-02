package xsna;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import xsna.dy5;
import xsna.em8;

/* compiled from: ObservableObserveOn.kt */
/* loaded from: classes9.dex */
public final class uq70<T> extends wn4 {
    public final wn4 a;
    public final pcn b;
    public final dy5.a c;

    /* compiled from: ObservableObserveOn.kt */
    public static final class a implements vq70<T>, hgn {
        public final AtomicBoolean b = new AtomicBoolean();
        public final AtomicReference<hgn> c = new AtomicReference<>(null);
        public final /* synthetic */ Object d;
        public final /* synthetic */ am8<T> e;

        public a(vq70<T> vq70Var, am8<T> am8Var) {
            this.d = vq70Var;
            this.e = am8Var;
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, xsna.vq70] */
        @Override // xsna.vq70
        public final void a(hgn hgnVar) {
            AtomicReference<hgn> atomicReference;
            hgn andSet;
            do {
                atomicReference = this.c;
                if (atomicReference.compareAndSet(null, hgnVar)) {
                    break;
                }
            } while (atomicReference.get() == null);
            if (this.b.get() && (andSet = atomicReference.getAndSet(null)) != null) {
                andSet.dispose();
            }
            this.d.a(this);
        }

        @Override // xsna.hgn
        public final void dispose() {
            if (this.b.compareAndSet(false, true)) {
                this.e.dispose();
                hgn andSet = this.c.getAndSet(null);
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // xsna.vq70
        public final void onComplete() {
            this.b.set(true);
            am8<T> am8Var = this.e;
            synchronized (am8Var.e) {
                if (!am8Var.g) {
                    am8Var.g = true;
                    am8Var.f.a(em8.a.a);
                    s3q0 s3q0Var = s3q0.a;
                }
            }
            this.e.a();
        }

        @Override // xsna.vq70
        public final void onError(Throwable th) {
            this.b.set(true);
            am8<T> am8Var = this.e;
            synchronized (am8Var.e) {
                if (!am8Var.g) {
                    am8Var.g = true;
                    wl8<T> wl8Var = am8Var.f;
                    synchronized (wl8Var.a) {
                        wl8Var.b.clear();
                        s3q0 s3q0Var = s3q0.a;
                    }
                    am8Var.f.a(new em8.b());
                }
            }
            this.e.a();
        }

        @Override // xsna.vq70
        public final void onNext(T t) {
            am8<T> am8Var = this.e;
            am8Var.b(t);
            am8Var.a();
        }
    }

    public uq70(wn4 wn4Var, pcn pcnVar, dy5.a aVar) {
        this.a = wn4Var;
        this.b = pcnVar;
        this.c = aVar;
    }

    @Override // xsna.wn4
    public final void r(vq70<T> vq70Var) {
        this.a.r(new a(vq70Var, bm8.a(this.c, vq70Var, this.b)));
    }
}
