package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class k9r0 implements p9r0 {
    public final String a;
    public final String b;

    public k9r0(String str, String str2) {
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
        if (!(obj instanceof k9r0)) {
            return false;
        }
        k9r0 k9r0Var = (k9r0) obj;
        return jl40.l(this.a, k9r0Var.a) && jl40.l(this.b, k9r0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Deeplink(analyticsName=", this.a, ", deeplink=", this.b, Extension.C_BRAKE);
    }
}
