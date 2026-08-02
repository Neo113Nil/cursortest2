package xsna;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleEmitterImpl.kt */
/* loaded from: classes9.dex */
public final class wtj0<T> implements vtj0<T>, hgn {
    public final wuj0<T> b;
    public final AtomicBoolean c = new AtomicBoolean();
    public final AtomicReference<gzs<s3q0>> d = new AtomicReference<>(null);

    public wtj0(wuj0<T> wuj0Var) {
        this.b = wuj0Var;
    }

    @Override // xsna.vtj0
    public final void a(Throwable th) {
        if (this.c.compareAndSet(false, true)) {
            gzs<s3q0> gzsVar = this.d.get();
            if (gzsVar != null) {
                gzsVar.invoke();
            }
            this.b.onError(th);
        }
    }

    @Override // xsna.vtj0
    public final void b(T t) {
        if (this.c.compareAndSet(false, true)) {
            gzs<s3q0> gzsVar = this.d.get();
            if (gzsVar != null) {
                gzsVar.invoke();
            }
            this.b.onSuccess(t);
        }
    }

    @Override // xsna.vtj0
    public final void c(ru.rustore.sdk.appupdate.j jVar) {
        if (this.c.get()) {
            jVar.invoke();
        } else {
            this.d.set(jVar);
        }
    }

    @Override // xsna.hgn
    public final void dispose() {
        gzs<s3q0> gzsVar;
        if (!this.c.compareAndSet(false, true) || (gzsVar = this.d.get()) == null) {
            return;
        }
        gzsVar.invoke();
    }
}
