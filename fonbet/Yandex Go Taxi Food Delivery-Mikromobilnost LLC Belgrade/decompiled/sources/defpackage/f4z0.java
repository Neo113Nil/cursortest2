package defpackage;

import java.util.Calendar;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class f4z0 {
    public final Calendar a;
    public final wp2 b;
    public final wp2 c;
    public final wp2 d;
    public final u2z0 e;

    public f4z0(Calendar calendar, wp2 wp2Var, wp2 wp2Var2, wp2 wp2Var3, u2z0 u2z0Var) {
        this.a = calendar;
        this.b = wp2Var;
        this.c = wp2Var2;
        this.d = wp2Var3;
        this.e = u2z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4z0)) {
            return false;
        }
        f4z0 f4z0Var = (f4z0) obj;
        return jl40.l(this.a, f4z0Var.a) && jl40.l(this.b, f4z0Var.b) && jl40.l(this.c, f4z0Var.c) && jl40.l(this.d, f4z0Var.d) && this.e.equals(f4z0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + n.b(this.d, n.b(this.c, n.b(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "TicketUiTimer(startTimerDate=" + this.a + ", color=" + this.b + ", timeTextColor=" + this.c + ", background=" + this.d + ", messageAfterEnd=" + this.e + Extension.C_BRAKE;
    }
}
