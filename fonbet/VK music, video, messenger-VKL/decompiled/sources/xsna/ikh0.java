package xsna;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: SdkObservableInstrument.java */
/* loaded from: classes8.dex */
public final class ikh0 implements jq70, oq70, kq70, pq70, mq70, rq70, uu6 {
    public static final Logger f = Logger.getLogger(ikh0.class.getName());
    public final dkh0 c;
    public final tb9 d;
    public final zro0 b = new zro0(f);
    public final AtomicBoolean e = new AtomicBoolean(false);

    public ikh0(dkh0 dkh0Var, tb9 tb9Var) {
        this.c = dkh0Var;
        this.d = tb9Var;
    }

    @Override // xsna.jq70, java.lang.AutoCloseable, xsna.oq70, xsna.kq70, xsna.pq70, xsna.mq70, xsna.rq70, xsna.uu6
    public final void close() {
        if (this.e.compareAndSet(false, true)) {
            dkh0 dkh0Var = this.c;
            tb9 tb9Var = this.d;
            synchronized (dkh0Var.b) {
                dkh0Var.c.remove(tb9Var);
            }
            return;
        }
        this.b.a(Level.WARNING, this.d + " has called close() multiple times.", null);
    }

    public final String toString() {
        return "SdkObservableInstrument{callback=" + this.d + "}";
    }
}
