package xsna;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Lambda;

/* compiled from: SingleTimeout.kt */
/* loaded from: classes9.dex */
public final class jwj0<T> extends ctj0<T> {
    public final ntj0 a;
    public final long b;
    public final TimeUnit c;
    public final pcn d;

    /* compiled from: SingleTimeout.kt */
    public static final class a implements wuj0<T>, hgn {
        public final AtomicBoolean b = new AtomicBoolean();
        public final AtomicReference<hgn> c = new AtomicReference<>(null);
        public final AtomicReference<hgn> d = new AtomicReference<>(null);
        public final /* synthetic */ jwj0<T> e;
        public final /* synthetic */ wuj0<T> f;

        /* compiled from: SingleTimeout.kt */
        /* renamed from: xsna.jwj0$a$a, reason: collision with other inner class name */
        public static final class C3151a extends Lambda implements gzs<s3q0> {
            final /* synthetic */ jwj0<T> this$1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3151a(jwj0<T> jwj0Var) {
                super(0);
                this.this$1 = jwj0Var;
            }

            @Override // xsna.gzs
            public final s3q0 invoke() {
                hgn andSet = a.this.c.getAndSet(null);
                if (andSet != null) {
                    andSet.dispose();
                }
                a.this.onError(new TimeoutException("No value after timeout " + this.this$1.b + ' ' + this.this$1.c));
                return s3q0.a;
            }
        }

        public a(jwj0<T> jwj0Var, wuj0<T> wuj0Var) {
            this.e = jwj0Var;
            this.f = wuj0Var;
        }

        @Override // xsna.wuj0
        public final void a(hgn hgnVar) {
            AtomicReference<hgn> atomicReference;
            do {
                atomicReference = this.c;
                if (atomicReference.compareAndSet(null, hgnVar)) {
                    break;
                }
            } while (atomicReference.get() == null);
            boolean z = this.b.get();
            AtomicReference<hgn> atomicReference2 = this.d;
            if (z) {
                hgn andSet = atomicReference.getAndSet(null);
                if (andSet != null) {
                    andSet.dispose();
                }
                hgn andSet2 = atomicReference2.getAndSet(null);
                if (andSet2 != null) {
                    andSet2.dispose();
                }
            } else {
                jwj0<T> jwj0Var = this.e;
                hgn andSet3 = atomicReference2.getAndSet(jwj0Var.d.a(jwj0Var.b, jwj0Var.c, new C3151a(jwj0Var)));
                if (andSet3 != null) {
                    andSet3.dispose();
                }
            }
            this.f.a(this);
        }

        @Override // xsna.hgn
        public final void dispose() {
            if (this.b.compareAndSet(false, true)) {
                hgn andSet = this.c.getAndSet(null);
                if (andSet != null) {
                    andSet.dispose();
                }
                hgn andSet2 = this.d.getAndSet(null);
                if (andSet2 != null) {
                    andSet2.dispose();
                }
            }
        }

        @Override // xsna.wuj0
        public final void onError(Throwable th) {
            if (this.b.compareAndSet(false, true)) {
                hgn andSet = this.d.getAndSet(null);
                if (andSet != null) {
                    andSet.dispose();
                }
                this.f.onError(th);
            }
        }

        @Override // xsna.wuj0
        public final void onSuccess(T t) {
            if (this.b.compareAndSet(false, true)) {
                hgn andSet = this.d.getAndSet(null);
                if (andSet != null) {
                    andSet.dispose();
                }
                this.f.onSuccess(t);
            }
        }
    }

    public jwj0(ntj0 ntj0Var, pcn pcnVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.a = ntj0Var;
        this.b = 20000L;
        this.c = timeUnit;
        this.d = pcnVar;
    }

    @Override // xsna.ctj0
    public final void a(wuj0<T> wuj0Var) {
        this.a.a(new a(this, wuj0Var));
    }
}
