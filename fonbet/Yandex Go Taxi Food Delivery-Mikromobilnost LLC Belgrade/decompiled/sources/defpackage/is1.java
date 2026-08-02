package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes8.dex */
public final class is1 implements t1j0 {
    public boolean a;

    @Override // defpackage.t1j0
    public final synchronized void a(kn2 kn2Var) {
        try {
            if (this.a) {
                kn2Var.invoke(es1.a);
            }
            kn2Var.invoke(new fs1());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.t1j0
    public final synchronized void clear() {
        this.a = false;
    }

    @Override // defpackage.t1j0
    public final void save(Object obj) {
        gs1 gs1Var = (gs1) obj;
        synchronized (this) {
            try {
                if (gs1Var.equals(es1.a)) {
                    this.a = true;
                } else if (!(gs1Var instanceof fs1)) {
                    throw new NoWhenBranchMatchedException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
