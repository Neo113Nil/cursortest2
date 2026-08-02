package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class i1b0 implements k1b0 {
    public final String a;
    public final String b;

    public i1b0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return g8e.p(this.a, Extension.DOT_CHAR, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1b0)) {
            return false;
        }
        i1b0 i1b0Var = (i1b0) obj;
        return jl40.l(this.a, i1b0Var.a) && jl40.l(this.b, i1b0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("PersistableInTariff(tariffClass=", this.a, ", requirementName=", this.b, Extension.C_BRAKE);
    }
}
