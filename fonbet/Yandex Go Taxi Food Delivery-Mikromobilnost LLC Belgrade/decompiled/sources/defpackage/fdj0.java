package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class fdj0 {
    public final String a;
    public final gdj0 b;

    public fdj0(String str, gdj0 gdj0Var) {
        this.a = str;
        this.b = gdj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdj0)) {
            return false;
        }
        fdj0 fdj0Var = (fdj0) obj;
        return jl40.l(this.a, fdj0Var.a) && this.b.equals(fdj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BadgeInfo(type=" + this.a + ", badgeView=" + this.b + Extension.C_BRAKE;
    }
}
