package defpackage;

/* loaded from: classes11.dex */
public final class hl91 extends yta1 {
    @Override // defpackage.yta1
    public final el91 f(ql91 ql91Var) {
        el91 el91Var;
        el91 el91Var2 = el91.d;
        synchronized (ql91Var) {
            try {
                el91Var = ql91Var.b;
                if (el91Var != el91Var2) {
                    ql91Var.b = el91Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return el91Var;
    }

    @Override // defpackage.yta1
    public final ll91 g(ql91 ql91Var) {
        ll91 ll91Var;
        ll91 ll91Var2 = ll91.c;
        synchronized (ql91Var) {
            try {
                ll91Var = ql91Var.c;
                if (ll91Var != ll91Var2) {
                    ql91Var.c = ll91Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ll91Var;
    }

    @Override // defpackage.yta1
    public final void h(ll91 ll91Var, ll91 ll91Var2) {
        ll91Var.b = ll91Var2;
    }

    @Override // defpackage.yta1
    public final void i(ll91 ll91Var, Thread thread) {
        ll91Var.a = thread;
    }

    @Override // defpackage.yta1
    public final boolean j(ql91 ql91Var, el91 el91Var, el91 el91Var2) {
        synchronized (ql91Var) {
            try {
                if (ql91Var.b != el91Var) {
                    return false;
                }
                ql91Var.b = el91Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.yta1
    public final boolean k(ql91 ql91Var, Object obj, Object obj2) {
        synchronized (ql91Var) {
            try {
                if (ql91Var.a != obj) {
                    return false;
                }
                ql91Var.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.yta1
    public final boolean l(ql91 ql91Var, ll91 ll91Var, ll91 ll91Var2) {
        synchronized (ql91Var) {
            try {
                if (ql91Var.c != ll91Var) {
                    return false;
                }
                ql91Var.c = ll91Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
