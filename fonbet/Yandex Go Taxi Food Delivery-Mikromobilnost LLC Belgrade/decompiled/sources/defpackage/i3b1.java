package defpackage;

/* loaded from: classes11.dex */
public final class i3b1 extends yua1 {
    @Override // defpackage.yua1
    public final void d(x7b1 x7b1Var, x7b1 x7b1Var2) {
        x7b1Var.b = x7b1Var2;
    }

    @Override // defpackage.yua1
    public final void e(x7b1 x7b1Var, Thread thread) {
        x7b1Var.a = thread;
    }

    @Override // defpackage.yua1
    public final boolean f(zfb1 zfb1Var, dga1 dga1Var, dga1 dga1Var2) {
        synchronized (zfb1Var) {
            try {
                if (zfb1Var.b != dga1Var) {
                    return false;
                }
                zfb1Var.b = dga1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.yua1
    public final boolean g(zfb1 zfb1Var, Object obj, Object obj2) {
        synchronized (zfb1Var) {
            try {
                if (zfb1Var.a != obj) {
                    return false;
                }
                zfb1Var.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.yua1
    public final boolean h(zfb1 zfb1Var, x7b1 x7b1Var, x7b1 x7b1Var2) {
        synchronized (zfb1Var) {
            try {
                if (zfb1Var.c != x7b1Var) {
                    return false;
                }
                zfb1Var.c = x7b1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
