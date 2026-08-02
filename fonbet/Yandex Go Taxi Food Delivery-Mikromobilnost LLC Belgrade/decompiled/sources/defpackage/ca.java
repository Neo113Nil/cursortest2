package defpackage;

/* loaded from: classes10.dex */
public final class ca extends qke {
    @Override // defpackage.qke
    public final boolean d(ga gaVar, y9 y9Var, y9 y9Var2) {
        synchronized (gaVar) {
            try {
                if (gaVar.b != y9Var) {
                    return false;
                }
                gaVar.b = y9Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.qke
    public final boolean e(ga gaVar, Object obj, Object obj2) {
        synchronized (gaVar) {
            try {
                if (gaVar.a != obj) {
                    return false;
                }
                gaVar.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.qke
    public final boolean f(ga gaVar, ea eaVar, ea eaVar2) {
        synchronized (gaVar) {
            try {
                if (gaVar.c != eaVar) {
                    return false;
                }
                gaVar.c = eaVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.qke
    public final void x(ea eaVar, ea eaVar2) {
        eaVar.b = eaVar2;
    }

    @Override // defpackage.qke
    public final void y(ea eaVar, Thread thread) {
        eaVar.a = thread;
    }
}
