package xsna;

import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: TimeLimiter.kt */
/* loaded from: classes.dex */
public final class sto0 {
    public final rll a;
    public final zvx0 b;
    public final long c;
    public final Object d;
    public final LinkedHashMap e;

    public sto0(rll rllVar, zvx0 zvx0Var) {
        long millis = TimeUnit.MINUTES.toMillis(90L);
        this.a = rllVar;
        this.b = zvx0Var;
        this.c = millis;
        this.d = new Object();
        this.e = new LinkedHashMap();
    }

    public final void a(tqk0 tqk0Var) {
        Runnable runnable;
        synchronized (this.d) {
            runnable = (Runnable) this.e.remove(tqk0Var);
        }
        if (runnable != null) {
            this.a.a(runnable);
        }
    }

    public final void b(tqk0 tqk0Var) {
        y9i y9iVar = new y9i(1, this, tqk0Var);
        synchronized (this.d) {
        }
        this.a.b(this.c, y9iVar);
    }
}
