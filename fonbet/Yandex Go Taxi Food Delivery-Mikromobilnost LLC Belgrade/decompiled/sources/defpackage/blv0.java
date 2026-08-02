package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class blv0 implements nqs0 {
    public final String a;
    public final String b;

    public blv0(String str, String str2) {
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
        if (!(obj instanceof blv0)) {
            return false;
        }
        blv0 blv0Var = (blv0) obj;
        return jl40.l(this.a, blv0Var.a) && jl40.l(this.b, blv0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Deeplink(analyticsName=", this.a, ", deeplink=", this.b, Extension.C_BRAKE);
    }
}
