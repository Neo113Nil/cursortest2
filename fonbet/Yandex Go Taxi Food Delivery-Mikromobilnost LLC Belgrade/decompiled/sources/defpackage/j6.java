package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class j6 {
    public final int a;
    public final String b;

    public j6(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6)) {
            return false;
        }
        j6 j6Var = (j6) obj;
        return this.a == j6Var.a && this.b.equals(j6Var.b);
    }

    public final int hashCode() {
        return quv.a.hashCode() + unr0.b(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        quv quvVar = quv.a;
        StringBuilder v = unr0.v(this.a, "AboutUiState(iconId=", ", version=", this.b, ", action=");
        v.append(quvVar);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
