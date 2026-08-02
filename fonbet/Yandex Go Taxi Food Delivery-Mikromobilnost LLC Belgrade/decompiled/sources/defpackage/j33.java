package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class j33 {
    public final String a;
    public final m33 b;

    public j33(String str, m33 m33Var) {
        this.a = str;
        this.b = m33Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j33)) {
            return false;
        }
        j33 j33Var = (j33) obj;
        return this.a.equals(j33Var.a) && this.b.equals(j33Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ArBoxModel(name=" + this.a + ", size=" + this.b + Extension.C_BRAKE;
    }
}
