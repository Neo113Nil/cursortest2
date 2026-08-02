package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class iz0 implements kz0 {
    public final String a;
    public final String b;

    public iz0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iz0)) {
            return false;
        }
        iz0 iz0Var = (iz0) obj;
        return jl40.l(this.a, iz0Var.a) && jl40.l(this.b, iz0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("SelectDrumItem(associatedResultId=", this.a, ", choiceId=", this.b, Extension.C_BRAKE);
    }
}
