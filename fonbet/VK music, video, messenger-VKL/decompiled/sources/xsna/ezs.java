package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: FullyDrawnReporter.kt */
/* loaded from: classes11.dex */
public final class ezs {
    public final Executor a;
    public boolean c;
    public final Object b = new Object();
    public final ArrayList d = new ArrayList();

    public ezs(Executor executor, wnh wnhVar) {
        this.a = executor;
    }

    public final void a() {
        synchronized (this.b) {
            try {
                this.c = true;
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    ((gzs) it.next()).invoke();
                }
                this.d.clear();
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this.b) {
            z = this.c;
        }
        return z;
    }
}
