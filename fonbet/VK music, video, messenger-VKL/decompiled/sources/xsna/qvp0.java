package xsna;

import xsna.t7x0;

/* loaded from: classes11.dex */
public final class qvp0 {
    public static final Object c = new Object();
    public final owu a;
    public final nrn0 b;

    public qvp0(owu owuVar, nrn0 nrn0Var) {
        this.a = owuVar;
        this.b = nrn0Var;
    }

    public final void a() {
        synchronized (c) {
            while (true) {
                try {
                    t7x0 a = this.b.a();
                    if (a.equals(t7x0.a.a)) {
                        s3q0 s3q0Var = s3q0.a;
                    } else if (a instanceof t7x0.b) {
                        this.a.a(((t7x0.b) a).a);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
