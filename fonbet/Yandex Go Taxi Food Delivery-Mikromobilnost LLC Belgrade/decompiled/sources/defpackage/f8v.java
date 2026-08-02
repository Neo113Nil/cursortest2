package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class f8v extends z7v {
    public final Executor O;
    public final Object P = new Object();
    public jdv Q;
    public e8v R;

    public f8v(Executor executor) {
        this.O = executor;
    }

    @Override // defpackage.z7v
    public final jdv a(pdv pdvVar) {
        return pdvVar.acquireLatestImage();
    }

    @Override // defpackage.z7v
    public final void c() {
        synchronized (this.P) {
            try {
                jdv jdvVar = this.Q;
                if (jdvVar != null) {
                    jdvVar.close();
                    this.Q = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.z7v
    public final void e(jdv jdvVar) {
        synchronized (this.P) {
            try {
                if (!this.N) {
                    jdvVar.close();
                    return;
                }
                if (this.R == null) {
                    e8v e8vVar = new e8v(jdvVar, this);
                    this.R = e8vVar;
                    ni91.a(b(e8vVar), new reu(3, e8vVar), geb1.b());
                } else {
                    if (jdvVar.G0().getTimestamp() <= this.R.b.G0().getTimestamp()) {
                        jdvVar.close();
                    } else {
                        jdv jdvVar2 = this.Q;
                        if (jdvVar2 != null) {
                            jdvVar2.close();
                        }
                        this.Q = jdvVar;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
