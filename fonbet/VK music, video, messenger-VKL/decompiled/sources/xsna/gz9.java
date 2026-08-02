package xsna;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: CastActionValidator.kt */
/* loaded from: classes11.dex */
public final class gz9 {
    public Object a;
    public Object b = new AtomicBoolean(false);

    public gz9(f9w f9wVar) {
        this.a = f9wVar;
    }

    public void a(gzs gzsVar) {
        ((f9w) this.a).debug(gzsVar);
        ((AtomicBoolean) this.b).set(false);
    }

    public void b(gzs gzsVar) {
        if (((AtomicBoolean) this.b).compareAndSet(false, true)) {
            ((f9w) this.a).debug(gzsVar);
        }
    }

    public void c(Throwable th, gzs gzsVar) {
        ((f9w) this.a).b(th, gzsVar);
        ((AtomicBoolean) this.b).set(false);
    }

    public void d(gzs gzsVar) {
        ((f9w) this.a).c(gzsVar);
        ((AtomicBoolean) this.b).set(false);
    }
}
