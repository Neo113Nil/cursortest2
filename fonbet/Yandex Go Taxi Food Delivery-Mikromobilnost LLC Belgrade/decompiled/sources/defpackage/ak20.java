package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ak20 {
    public final dk20 a;
    public final fj20 b;
    public final b37 c;

    public ak20(dk20 dk20Var, fj20 fj20Var, b37 b37Var) {
        this.a = dk20Var;
        this.b = fj20Var;
        this.c = b37Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak20)) {
            return false;
        }
        ak20 ak20Var = (ak20) obj;
        return this.a.equals(ak20Var.a) && this.b.equals(ak20Var.b) && this.c.equals(ak20Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MissionDetailsState(progress=" + this.a + ", description=" + this.b + ", button=" + this.c + Extension.C_BRAKE;
    }
}
