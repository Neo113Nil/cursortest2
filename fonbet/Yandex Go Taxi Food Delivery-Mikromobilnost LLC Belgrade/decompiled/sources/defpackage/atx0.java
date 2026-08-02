package defpackage;

import com.google.android.gms.tasks.zzw;

/* loaded from: classes.dex */
public class atx0 {
    public final zzw a = new zzw();

    public atx0(y791 y791Var) {
        eba1 eba1Var = new eba1(this);
        y791Var.getClass();
        y791Var.a.g(dtx0.a, new yo40(eba1Var));
    }

    public final void a(Object obj) {
        this.a.s(obj);
    }

    public final boolean b(Exception exc) {
        zzw zzwVar = this.a;
        zzwVar.getClass();
        cvw.m(exc, "Exception must not be null");
        synchronized (zzwVar.a) {
            try {
                if (zzwVar.c) {
                    return false;
                }
                zzwVar.c = true;
                zzwVar.f = exc;
                zzwVar.b.f(zzwVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        this.a.u(obj);
    }

    public atx0() {
    }
}
