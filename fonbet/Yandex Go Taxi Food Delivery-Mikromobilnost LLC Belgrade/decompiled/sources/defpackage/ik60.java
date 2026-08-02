package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ik60 {
    public final ny6 a;
    public final wp2 b;
    public final wp2 c;

    public ik60(ny6 ny6Var, wp2 wp2Var, wp2 wp2Var2) {
        this.a = ny6Var;
        this.b = wp2Var;
        this.c = wp2Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ik60)) {
            return false;
        }
        ik60 ik60Var = (ik60) obj;
        return this.a.equals(ik60Var.a) && jl40.l(this.b, ik60Var.b) && jl40.l(this.c, ik60Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + n.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "NotificationTrailButton(button=" + this.a + ", textAppColor=" + this.b + ", bgAppColor=" + this.c + Extension.C_BRAKE;
    }
}
