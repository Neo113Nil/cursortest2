package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class k9k0 implements ibk0 {
    public final String a;
    public final String b;

    public k9k0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.nqs0
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9k0)) {
            return false;
        }
        k9k0 k9k0Var = (k9k0) obj;
        return jl40.l(this.a, k9k0Var.a) && jl40.l(this.b, k9k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Deeplink(uri=", this.a, ", analyticsName=", this.b, Extension.C_BRAKE);
    }
}
