package defpackage;

/* loaded from: classes11.dex */
public final class ba extends wha1 {
    @Override // defpackage.wha1
    public final boolean d(fa faVar, x9 x9Var, x9 x9Var2) {
        synchronized (faVar) {
            try {
                if (faVar.b != x9Var) {
                    return false;
                }
                faVar.b = x9Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.wha1
    public final boolean e(fa faVar, Object obj, Object obj2) {
        synchronized (faVar) {
            try {
                if (faVar.a != obj) {
                    return false;
                }
                faVar.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.wha1
    public final boolean f(fa faVar, da daVar, da daVar2) {
        synchronized (faVar) {
            try {
                if (faVar.c != daVar) {
                    return false;
                }
                faVar.c = daVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.wha1
    public final void h(da daVar, da daVar2) {
        daVar.b = daVar2;
    }

    @Override // defpackage.wha1
    public final void i(da daVar, Thread thread) {
        daVar.a = thread;
    }
}
