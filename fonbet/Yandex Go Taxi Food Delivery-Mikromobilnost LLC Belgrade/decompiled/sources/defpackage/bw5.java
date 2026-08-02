package defpackage;

import java.util.Iterator;
import java.util.concurrent.locks.LockSupport;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class bw5 implements f1k {
    public final cw5 a;
    public boolean b;

    public bw5(cw5 cw5Var) {
        this.a = cw5Var;
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        synchronized (this.a.e) {
            if (this.b) {
                return;
            }
            this.b = true;
            cw5 cw5Var = this.a;
            int i = cw5Var.c;
            if (i == 0) {
                throw new IllegalStateException("Critical section is not held");
            }
            int i2 = i - 1;
            cw5Var.c = i2;
            if (i2 == 0) {
                cw5Var.b = null;
                Iterator it = a.J0(cw5Var.d).iterator();
                while (it.hasNext()) {
                    LockSupport.unpark((Thread) it.next());
                }
            }
        }
    }
}
