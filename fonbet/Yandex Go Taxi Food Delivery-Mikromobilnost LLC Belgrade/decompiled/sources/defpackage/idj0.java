package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class idj0 {
    public final fdj0 a;
    public final hdj0 b;

    public idj0(fdj0 fdj0Var, hdj0 hdj0Var) {
        this.a = fdj0Var;
        this.b = hdj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof idj0)) {
            return false;
        }
        idj0 idj0Var = (idj0) obj;
        return this.a.equals(idj0Var.a) && this.b.equals(idj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RequirementBadge(info=" + this.a + ", showPolicy=" + this.b + Extension.C_BRAKE;
    }
}
