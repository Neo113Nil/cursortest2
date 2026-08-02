package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class dgv0 implements egv0 {
    public final String a;
    public final String b;

    public dgv0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dgv0)) {
            return false;
        }
        dgv0 dgv0Var = (dgv0) obj;
        return this.a.equals(dgv0Var.a) && jl40.l(this.b, dgv0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Source(contentDescription=", this.a, ", iconUrl=", this.b, Extension.C_BRAKE);
    }
}
