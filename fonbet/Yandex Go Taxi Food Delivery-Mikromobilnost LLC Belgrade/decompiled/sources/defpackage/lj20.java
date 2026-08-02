package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class lj20 {
    public final ck20 a;
    public final ej20 b;
    public final l17 c;

    public lj20(ck20 ck20Var, ej20 ej20Var, l17 l17Var) {
        this.a = ck20Var;
        this.b = ej20Var;
        this.c = l17Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj20)) {
            return false;
        }
        lj20 lj20Var = (lj20) obj;
        return this.a.equals(lj20Var.a) && this.b.equals(lj20Var.b) && this.c.equals(lj20Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MissionDetailsModel(progress=" + this.a + ", description=" + this.b + ", button=" + this.c + Extension.C_BRAKE;
    }
}
