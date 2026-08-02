package xsna;

import com.huawei.hmf.tasks.Task;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes13.dex */
public final class szy0<TResult> extends Task<TResult> {
    public boolean b;
    public TResult c;
    public Exception d;
    public final Object a = new Object();
    public ArrayList e = new ArrayList();

    @Override // com.huawei.hmf.tasks.Task
    public final szy0 a(g280 g280Var) {
        g(new vfy0(u5o0.c.b, g280Var));
        return this;
    }

    @Override // com.huawei.hmf.tasks.Task
    public final szy0 b(c680 c680Var) {
        g(new mvy0(u5o0.c.b, c680Var));
        return this;
    }

    @Override // com.huawei.hmf.tasks.Task
    public final szy0 c(cc80 cc80Var) {
        g(new pyy0(u5o0.c.b, cc80Var));
        return this;
    }

    @Override // com.huawei.hmf.tasks.Task
    public final Exception d() {
        Exception exc;
        synchronized (this.a) {
            exc = this.d;
        }
        return exc;
    }

    @Override // com.huawei.hmf.tasks.Task
    public final TResult e() {
        TResult tresult;
        synchronized (this.a) {
            try {
                if (this.d != null) {
                    throw new RuntimeException(this.d);
                }
                tresult = this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tresult;
    }

    @Override // com.huawei.hmf.tasks.Task
    public final boolean f() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.b && this.d == null;
            } finally {
            }
        }
        return z;
    }

    public final void g(b3q b3qVar) {
        boolean z;
        synchronized (this.a) {
            try {
                synchronized (this.a) {
                    z = this.b;
                }
                if (!z) {
                    this.e.add(b3qVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            b3qVar.a(this);
        }
    }

    public final void h() {
        synchronized (this.a) {
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                try {
                    ((b3q) it.next()).a(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.e = null;
        }
    }
}
