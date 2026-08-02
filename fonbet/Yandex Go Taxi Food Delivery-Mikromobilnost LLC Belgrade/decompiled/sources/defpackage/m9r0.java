package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class m9r0 implements p9r0 {
    public final String a;
    public final String b;

    public m9r0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.nqs0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9r0)) {
            return false;
        }
        m9r0 m9r0Var = (m9r0) obj;
        return jl40.l(this.a, m9r0Var.a) && jl40.l(this.b, m9r0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("EditRide(analyticsName=", this.a, ", deeplink=", this.b, Extension.C_BRAKE);
    }
}
