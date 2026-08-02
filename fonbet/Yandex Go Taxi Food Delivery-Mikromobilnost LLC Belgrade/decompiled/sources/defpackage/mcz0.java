package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class mcz0 extends n351 {
    public final adz0 c;
    public final w9z0 d;

    public mcz0(adz0 adz0Var, w9z0 w9z0Var) {
        super("tracking-timeline-key", false, 14);
        this.c = adz0Var;
        this.d = w9z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mcz0)) {
            return false;
        }
        mcz0 mcz0Var = (mcz0) obj;
        return this.c.equals(mcz0Var.c) && jl40.l(this.d, mcz0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.c.a.hashCode() * 31;
        w9z0 w9z0Var = this.d;
        return hashCode + (w9z0Var == null ? 0 : w9z0Var.hashCode());
    }

    public final String toString() {
        return "TimelineModel(state=" + this.c + ", bubble=" + this.d + Extension.C_BRAKE;
    }
}
