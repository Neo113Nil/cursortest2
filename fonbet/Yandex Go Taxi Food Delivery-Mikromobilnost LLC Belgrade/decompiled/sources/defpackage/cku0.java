package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class cku0 {
    public final String a;
    public final String b;

    public cku0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cku0)) {
            return false;
        }
        cku0 cku0Var = (cku0) obj;
        return jl40.l(this.a, cku0Var.a) && jl40.l(this.b, cku0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("StoredExperimentInfo(name=", this.a, ", version=", this.b, Extension.C_BRAKE);
    }
}
