package defpackage;

import com.google.android.gms.internal.measurement.a1;
import com.google.android.gms.internal.measurement.zzlh;
import com.google.android.gms.internal.measurement.zzmr;

/* loaded from: classes.dex */
public class l2b1 {
    public volatile p5b1 a;
    public volatile zzlh b;

    public final zzlh a() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            try {
                if (this.b != null) {
                    return this.b;
                }
                if (this.a == null) {
                    this.b = zzlh.a;
                } else {
                    this.b = this.a.a();
                }
                return this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(a1 a1Var) {
        if (this.a != null) {
            return;
        }
        synchronized (this) {
            if (this.a != null) {
                return;
            }
            try {
                this.a = a1Var;
                this.b = zzlh.a;
            } catch (zzmr unused) {
                this.a = a1Var;
                this.b = zzlh.a;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2b1)) {
            return false;
        }
        l2b1 l2b1Var = (l2b1) obj;
        p5b1 p5b1Var = this.a;
        p5b1 p5b1Var2 = l2b1Var.a;
        if (p5b1Var == null && p5b1Var2 == null) {
            return a().equals(l2b1Var.a());
        }
        if (p5b1Var != null && p5b1Var2 != null) {
            return p5b1Var.equals(p5b1Var2);
        }
        if (p5b1Var != null) {
            l2b1Var.b((a1) ((a1) p5b1Var).q(6));
            return p5b1Var.equals(l2b1Var.a);
        }
        a1 a1Var = (a1) p5b1Var2;
        b((a1) a1Var.q(6));
        return this.a.equals(a1Var);
    }

    public final int hashCode() {
        return 1;
    }
}
